package net.unicoen.mapper

import java.io.FileInputStream
import java.util.List
import java.util.ArrayList
import java.util.Map
import net.unicoen.node.*
import net.unicoen.parser.Java8BaseVisitor
import net.unicoen.parser.Java8Lexer
import net.unicoen.parser.Java8Parser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.RuleContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import org.eclipse.xtext.xbase.lib.Functions.Function1
import java.lang.reflect.ParameterizedType

class Java8Mapper extends Java8BaseVisitor<Object> {
	val boolean _isDebugMode

	new(boolean isDebugMode) {
		_isDebugMode = isDebugMode
	}

	def parse(String code) {
		parseCore(new ANTLRInputStream(code))
	}

	def parseFile(String path) {
		val inputStream = new FileInputStream(path)
		try {
			parseCore(new ANTLRInputStream(inputStream))
		} finally {
			inputStream.close
		}
	}

	def parseCore(CharStream chars) {
		parseCore(chars, [parser|parser.compilationUnit])
	}

	def parse(String code, Function1<Java8Parser, ParseTree> parseAction) {
		parseCore(new ANTLRInputStream(code), parseAction)
	}

	def parseFile(String path, Function1<Java8Parser, ParseTree> parseAction) {
		val inputStream = new FileInputStream(path)
		try {
			parseCore(new ANTLRInputStream(inputStream), parseAction)
		} finally {
			inputStream.close
		}
	}

	def parseCore(CharStream chars, Function1<Java8Parser, ParseTree> parseAction) {
		val lexer = new Java8Lexer(chars)
		val tokens = new CommonTokenStream(lexer)
		val parser = new Java8Parser(tokens)
		val tree = parseAction.apply(parser) // parse
		tree.visit.flatten
	}

	override public visitChildren(RuleNode node) {
		val n = node.childCount
		val list = newArrayList()
		(0 ..< n).forEach [ i |
			val c = node.getChild(i)
			val childResult = c.visit
			list += childResult
		]
		list
	}

	override public visit(ParseTree tree) {
		if (_isDebugMode) {
			if (!(tree instanceof ParserRuleContext)) {
				return visitTerminal(tree as TerminalNode)
			}
			val ruleName = Java8Parser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
			println("enter " + ruleName + " : " + tree.text)
			val ret = tree.accept(this)
			println("exit " + ruleName + " : " + ret)
			ret
		} else {
			tree.accept(this)
		}
	}

	override public visitTerminal(TerminalNode node) {
		println("visit TERMINAL : " + node.text)
		node.text
	}

	private def Object flatten(Object obj) {
		if (obj instanceof List<?>) {
			if (obj.size == 1) {
				return obj.get(0).flatten
			}
			val ret = newArrayList
			obj.forEach [
				ret += it.flatten
			]
			return ret
		}
		if (obj instanceof Map<?,?>) {
			if (obj.size == 1) {
				return obj.get(obj.keySet.get(0)).flatten
			}
			val ret = newHashMap
			obj.forEach [ key, value |
				ret.put(key, value.flatten)
			]
			return ret
		}
		obj
	}

	public def <T> List<T> castToList(Object obj, Class<T> clazz) {
		val temp = obj.flatten
		val ret = newArrayList
		if (temp instanceof Map<?, ?>) {
			val add = temp.containsKey("add")
			temp.forEach [ key, value |
				switch key {
					case "add": {
						if (value instanceof Map<?,?>) {
							ret += value.castTo(clazz)
						} else if (value instanceof List<?>) {
							value.forEach[
								val t = it.castTo(clazz)
								if (t != null) {
									ret += t
								}
							]
						} else {
							ret += value.castToList(clazz)
						}
					}
					default: {
						if (!add) {
							ret += value.castToList(clazz)
						}
					}
				}
			]
		} else if (temp instanceof List<?>) {
			temp.forEach [
				ret += it.castToList(clazz)
			]
		} else {
			ret += temp.castTo(clazz)
		}
		ret
	}

	public def <T> T castTo(Object obj, Class<T> clazz) {
		val temp = obj.flatten
		if (temp instanceof Map<?,?>) {
			if (String.isAssignableFrom(clazz)) {
				val builder = new StringBuilder
				val hasAdd = temp.containsKey("add")
				temp.forEach [ key, value |
					switch (key) {
						case "add": {
							builder.append(value.castTo(clazz))
						}
						default: {
							if (!hasAdd) {
								builder.append(value.castTo(clazz))
							}
						}
					}
				]
				return if (builder.length > 0) clazz.getConstructor(StringBuilder).newInstance(builder) else null
			}
			val instance = clazz.newInstance
			val fields = clazz.fields
			val fieldsName = newArrayList
			fields.forEach[fieldsName.add(it.name)]
			temp.forEach [ key, value |
				if (fieldsName.contains(key)) {
					val field = fields.get(fieldsName.indexOf(key))
					field.set(instance,
						if (List.isAssignableFrom(field.type)) {
							value.castToList(
								(field.genericType as ParameterizedType).actualTypeArguments.get(0) as Class<?>)
						} else {
							value.castTo(field.type)
						})
				}
			]
			return instance
		}
		if (temp instanceof List<?>) {
			if (String.isAssignableFrom(clazz)) {
				val builder = new StringBuilder
				temp.forEach [
					builder.append(it.castTo(clazz))
				]
				return if (builder.length > 0) clazz.getConstructor(StringBuilder).newInstance(builder) else null
			}
			val first = temp.findFirst[clazz.isAssignableFrom(it.class)]
			return if (first == null) {
				try {
					clazz.newInstance
				} catch (InstantiationException e) {
					null
				}
			} else
				first.castTo(clazz)
		}
		clazz.cast(temp)
	}

	override public visitIntegerLiteral(Java8Parser.IntegerLiteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == Java8Parser.IntegerLiteral) {
					return true
				}
			}
			return false
		].text
		return new UniIntLiteral(Integer.parseInt(text))
	}
	
	override public visitFloatingPointLiteral(Java8Parser.FloatingPointLiteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == Java8Parser.FloatingPointLiteral) {
					return true
				}
			}
			return false
		].text
		return new UniDoubleLiteral(Double.parseDouble(text))
	}
	
	override public visitBooleanLiteral(Java8Parser.BooleanLiteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == Java8Parser.BooleanLiteral) {
					return true
				}
			}
			return false
		].text
		return new UniBoolLiteral(Boolean.parseBoolean(text))
	}
	
	override public visitStringLiteral(Java8Parser.StringLiteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == Java8Parser.StringLiteral) {
					return true
				}
			}
			return false
		].text
		return new UniStringLiteral(text.substring(1, text.length - 1))
	}
	
	override public visitPrimitiveType(Java8Parser.PrimitiveTypeContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 534: {
						return it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.BOOLEAN: {
						return it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map
	}
	
	override public visitClassType(Java8Parser.ClassTypeContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 578: {
						add += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						add += it.visit
					}
					case Java8Parser.DOT: {
						add += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitTypeVariable(Java8Parser.TypeVariableContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						return it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map
	}
	
	override public visitDims(Java8Parser.DimsContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.LBRACK: {
						add += it.visit
					}
					case Java8Parser.RBRACK: {
						add += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitExpressionName(Java8Parser.ExpressionNameContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val name = newArrayList
		map.put("name", name)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						name += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniIdent)
	}
	
	override public visitTypeDeclaration(Java8Parser.TypeDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 829: {
						return it.visit
					}
					case 830: {
						return it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		}
		map
	}
	
	override public visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 834: {
						merge += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		val node = map.castTo(UniClassDec)
		merge.forEach[node.merge(it.castTo(UniClassDec))]
		node
	}
	
	override public visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val className = newArrayList
		map.put("className", className)
		val interfaces = newArrayList
		map.put("interfaces", interfaces)
		val modifiers = newArrayList
		map.put("modifiers", modifiers)
		val superClass = newArrayList
		map.put("superClass", superClass)
		val members = newArrayList
		map.put("members", members)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 838: {
						modifiers += it.visit
					}
					case 840: {
						className += it.visit
					}
					case 844: {
						superClass += it.visit
					}
					case 847: {
						interfaces += it.visit
					}
					case 850: {
						members += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniClassDec)
	}
	
	override public visitClassName(Java8Parser.ClassNameContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitClassModifiers(Java8Parser.ClassModifiersContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 854: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}
	
	override public visitClassModifier(Java8Parser.ClassModifierContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitSuperclass(Java8Parser.SuperclassContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 883: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}
	
	override public visitSuperinterfaces(Java8Parser.SuperinterfacesContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 886: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}
	
	override public visitInterfaceTypeList(Java8Parser.InterfaceTypeListContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 888: {
							add += it.visit
						}
						case 890: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}
	
	override public visitClassBody(Java8Parser.ClassBodyContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 897: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}
	
	override public visitClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 905: {
							add += it.visit
						}
						case 908: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}
	
	override public visitClassMemberDeclaration(Java8Parser.ClassMemberDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 911: {
							add += it.visit
						}
						case 912: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}
	
	override public visitFieldDeclaration(Java8Parser.FieldDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val modifiers = newArrayList
		map.put("modifiers", modifiers)
		val type = newArrayList
		map.put("type", type)
		val merge = newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 918: {
							modifiers += it.visit
						}
						case 919: {
							type += it.visit
						}
						case 920: {
							merge += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		val node = map.castTo(UniFieldDec)
		val ret = newArrayList
		merge.castToList(UniFieldDec).forEach [
			it.merge(node)
			ret += it
		]
		ret
	}
	
	override public visitFieldModifiers(Java8Parser.FieldModifiersContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 923: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}
	
	override public visitFieldModifier(Java8Parser.FieldModifierContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitVariableDeclaratorList(Java8Parser.VariableDeclaratorListContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 939: {
						add += it.visit
					}
					case 941: {
						add += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map
	}
	
	override public visitVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val value = newArrayList
		map.put("value", value)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 947: {
						merge += it.visit
					}
					case 949: {
						value += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		val node = map
		merge.forEach [
			if (it instanceof Map<?, ?>) {
				it.forEach [ k, v |
					if (node.containsKey(k)) {
						node.get(k) += v
					} else {
						node.put(k, v as ArrayList<Object>)
					}
				]
			}
		]
		node
	}
	
	override public visitVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val name = newArrayList
		map.put("name", name)
		val type = newArrayList
		map.put("type", type)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 953: {
						type += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						name += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map
	}
	
	override public visitUnannType(Java8Parser.UnannTypeContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val modifiers = newArrayList
		map.put("modifiers", modifiers)
		val block = newArrayList
		map.put("block", block)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1036: {
						modifiers += it.visit
					}
					case 1042: {
						merge += it.visit
					}
					case 1043: {
						block += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		val node = map.castTo(UniMethodDec)
		merge.forEach[node.merge(it.castTo(UniMethodDec))]
		node
	}
	
	override public visitMethodHeader(Java8Parser.MethodHeaderContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val returnType = newArrayList
		map.put("returnType", returnType)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1057: {
						returnType += it.visit
					}
					case 1058: {
						merge += it.visit
					}
					case 1069: {
						returnType += it.visit
					}
					case 1070: {
						merge += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		val node = map.castTo(UniMethodDec)
		merge.forEach[node.merge(it.castTo(UniMethodDec))]
		node
	}
	
	override public visitResult(Java8Parser.ResultContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val args = newArrayList
		map.put("args", args)
		val methodName = newArrayList
		map.put("methodName", methodName)
		val returnType = newArrayList
		map.put("returnType", returnType)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1080: {
						methodName += it.visit
					}
					case 1082: {
						args += it.visit
					}
					case 1086: {
						returnType += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniMethodDec)
	}
	
	override public visitMethodName(Java8Parser.MethodNameContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitFormalParameterList(Java8Parser.FormalParameterListContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1091: {
							add += it.visit
						}
						case 1093: {
							add += it.visit
						}
						case 1095: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniArg)
	}
	
	override public visitFormalParameters(Java8Parser.FormalParametersContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1098: {
							add += it.visit
						}
						case 1100: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniArg)
	}
	
	override public visitFormalParameter(Java8Parser.FormalParameterContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val type = newArrayList
		map.put("type", type)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1122: {
						type += it.visit
					}
					case 1123: {
						merge += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		val node = map.castTo(UniArg)
		merge.forEach[node.merge(it.castTo(UniArg))]
		node
	}
	
	override public visitParameterDeclaratorId(Java8Parser.ParameterDeclaratorIdContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val name = newArrayList
		map.put("name", name)
		val type = newArrayList
		map.put("type", type)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1125: {
						name += it.visit
					}
					case 1126: {
						type += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniArg)
	}
	
	override public visitParameterName(Java8Parser.ParameterNameContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitMethodBody(Java8Parser.MethodBodyContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1182: {
						merge += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		val node = map.castTo(UniBlock)
		merge.forEach[node.merge(it.castTo(UniBlock))]
		node
	}
	
	override public visitConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val modifiers = newArrayList
		map.put("modifiers", modifiers)
		val block = newArrayList
		map.put("block", block)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1191: {
						modifiers += it.visit
					}
					case 1197: {
						merge += it.visit
					}
					case 1201: {
						block += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		val node = map.castTo(UniMethodDec)
		merge.forEach[node.merge(it.castTo(UniMethodDec))]
		node
	}
	
	override public visitConstructorModifier(Java8Parser.ConstructorModifierContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitConstructorDeclarator(Java8Parser.ConstructorDeclaratorContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val args = newArrayList
		map.put("args", args)
		val methodName = newArrayList
		map.put("methodName", methodName)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1212: {
						methodName += it.visit
					}
					case 1214: {
						args += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniMethodDec)
	}
	
	override public visitSimpleTypeName(Java8Parser.SimpleTypeNameContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1337: {
						merge += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		val node = map.castTo(UniClassDec)
		merge.forEach[node.merge(it.castTo(UniClassDec))]
		node
	}
	
	override public visitNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val className = newArrayList
		map.put("className", className)
		val modifiers = newArrayList
		map.put("modifiers", modifiers)
		val superClass = newArrayList
		map.put("superClass", superClass)
		val members = newArrayList
		map.put("members", members)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1341: {
						modifiers += it.visit
					}
					case 1343: {
						className += it.visit
					}
					case 1347: {
						superClass += it.visit
					}
					case 1350: {
						members += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniClassDec)
	}
	
	override public visitInterfaceModifiers(Java8Parser.InterfaceModifiersContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1352: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}
	
	override public visitInterfaceName(Java8Parser.InterfaceNameContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitInterfaceModifier(Java8Parser.InterfaceModifierContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitExtendsInterfaces(Java8Parser.ExtendsInterfacesContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1370: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}
	
	override public visitInterfaceBody(Java8Parser.InterfaceBodyContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1373: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}
	
	override public visitInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1381: {
							add += it.visit
						}
						case 1382: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}
	
	override public visitConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val modifiers = newArrayList
		map.put("modifiers", modifiers)
		val type = newArrayList
		map.put("type", type)
		val merge = newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1388: {
							modifiers += it.visit
						}
						case 1389: {
							type += it.visit
						}
						case 1390: {
							merge += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		val node = map.castTo(UniFieldDec)
		val ret = newArrayList
		merge.castToList(UniFieldDec).forEach [
			it.merge(node)
			ret += it
		]
		ret
	}
	
	override public visitConstantModifiers(Java8Parser.ConstantModifiersContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1393: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}
	
	override public visitConstantModifier(Java8Parser.ConstantModifierContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val modifiers = newArrayList
		map.put("modifiers", modifiers)
		val block = newArrayList
		map.put("block", block)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1405: {
						modifiers += it.visit
					}
					case 1406: {
						merge += it.visit
					}
					case 1407: {
						block += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		val node = map.castTo(UniMethodDec)
		merge.forEach[node.merge(it.castTo(UniMethodDec))]
		node
	}
	
	override public visitInterfaceMethodModifiers(Java8Parser.InterfaceMethodModifiersContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1409: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}
	
	override public visitInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitArrayInitializer(Java8Parser.ArrayInitializerContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val items = newArrayList
		map.put("items", items)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1533: {
						items += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniArray)
	}
	
	override public visitVariableInitializerList(Java8Parser.VariableInitializerListContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1541: {
							add += it.visit
						}
						case 1543: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniExpr)
	}
	
	override public visitBlock(Java8Parser.BlockContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val body = newArrayList
		map.put("body", body)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1550: {
						body += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniBlock)
	}
	
	override public visitBlockStatements(Java8Parser.BlockStatementsContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1555: {
							add += it.visit
						}
						case 1556: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniExpr)
	}
	
	override public visitLocalVariableDeclarationStatement(Java8Parser.LocalVariableDeclarationStatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			for(it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1567: {
							return it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			}
		}
		map.castToList(UniVariableDec)
	}
	
	override public visitLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val modifiers = newArrayList
		map.put("modifiers", modifiers)
		val type = newArrayList
		map.put("type", type)
		val merge = newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1570: {
							modifiers += it.visit
						}
						case 1576: {
							type += it.visit
						}
						case 1577: {
							merge += it.visit
						}
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		val node = map.castTo(UniVariableDec)
		val ret = newArrayList
		merge.castToList(UniVariableDec).forEach [
			it.merge(node)
			ret += it
		]
		ret
	}
	
	override public visitExpressionStatement(Java8Parser.ExpressionStatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1618: {
						return it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		}
		map
	}
	
	override public visitIfThenStatement(Java8Parser.IfThenStatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val cond = newArrayList
		map.put("cond", cond)
		val trueStatement = newArrayList
		map.put("trueStatement", trueStatement)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1632: {
						cond += it.visit
					}
					case 1634: {
						trueStatement += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniIf)
	}
	
	override public visitForStatement(Java8Parser.ForStatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1729: {
						return it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		}
		map
	}
	
	override public visitBasicForStatement(Java8Parser.BasicForStatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val statement = newArrayList
		map.put("statement", statement)
		val init = newArrayList
		map.put("init", init)
		val step = newArrayList
		map.put("step", step)
		val cond = newArrayList
		map.put("cond", cond)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1739: {
						init += it.visit
					}
					case 1743: {
						cond += it.visit
					}
					case 1747: {
						step += it.visit
					}
					case 1751: {
						statement += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniFor)
	}
	
	override public visitReturnStatement(Java8Parser.ReturnStatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val value = newArrayList
		map.put("value", value)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1826: {
						value += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniReturn)
	}
	
	override public visitPrimary(Java8Parser.PrimaryContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1923: {
						return it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		}
		map
	}
	
	override public visitPrimaryNoNewArray_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2011: {
						return it.visit
					}
					case 2047: {
						return it.visit
					}
					case 2049: {
						return it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		}
		map
	}
	
	override public visitMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val args = newArrayList
		map.put("args", args)
		val methodName = newArrayList
		map.put("methodName", methodName)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2358: {
						methodName += it.visit
					}
					case 2360: {
						args += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniMethodCall)
	}
	
	override public visitMethodInvocation_lfno_primary(Java8Parser.MethodInvocation_lfno_primaryContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val args = newArrayList
		map.put("args", args)
		val methodName = newArrayList
		map.put("methodName", methodName)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2439: {
						methodName += it.visit
					}
					case 2441: {
						args += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniMethodCall)
	}
	
	override public visitArgumentList(Java8Parser.ArgumentListContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2497: {
						add += it.visit
					}
					case 2499: {
						add += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map
	}
	
	override public visitArrayCreationExpression(Java8Parser.ArrayCreationExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val type = newArrayList
		map.put("type", type)
		val value = newArrayList
		map.put("value", value)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2603: {
						type += it.visit
					}
					case 2604: {
						merge += it.visit
					}
					case 2605: {
						type += it.visit
					}
					case 2609: {
						type += it.visit
					}
					case 2610: {
						merge += it.visit
					}
					case 2611: {
						type += it.visit
					}
					case 2615: {
						type += it.visit
					}
					case 2617: {
						value += it.visit
					}
					case 2620: {
						type += it.visit
					}
					case 2622: {
						value += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		val node = map.castTo(UniNewArray)
		merge.forEach[node.merge(it.castTo(UniNewArray))]
		node
	}
	
	override public visitDimExprs(Java8Parser.DimExprsContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2626: {
						merge += it.visit
					}
					case 2627: {
						merge += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		val node = map.castTo(UniNewArray)
		merge.forEach[node.merge(it.castTo(UniNewArray))]
		node
	}
	
	override public visitDimExpr(Java8Parser.DimExprContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val elementsNum = newArrayList
		map.put("elementsNum", elementsNum)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2640: {
						elementsNum += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniNewArray)
	}
	
	override public visitAssignment(Java8Parser.AssignmentContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		val right = newArrayList
		map.put("right", right)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2681: {
						left += it.visit
					}
					case 2682: {
						operator += it.visit
					}
					case 2683: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniBinOp)
	}
	
	override public visitAssignmentOperator(Java8Parser.AssignmentOperatorContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}
	
	override public visitConditionalExpression(Java8Parser.ConditionalExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val cond = newArrayList
		map.put("cond", cond)
		val falseExpr = newArrayList
		map.put("falseExpr", falseExpr)
		val trueExpr = newArrayList
		map.put("trueExpr", trueExpr)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2692: {
						return it.visit
					}
					case 2693: {
						cond += it.visit
					}
					case 2695: {
						trueExpr += it.visit
					}
					case 2697: {
						falseExpr += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniTernaryOp)
	}
	
	override public visitConditionalOrExpression(Java8Parser.ConditionalOrExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2702: {
						return it.visit
					}
					case 464: {
						left += it.visit
					}
					case 2706: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.OR: {
						operator += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniBinOp)
	}
	
	override public visitConditionalAndExpression(Java8Parser.ConditionalAndExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2713: {
						return it.visit
					}
					case 466: {
						left += it.visit
					}
					case 2717: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.AND: {
						operator += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniBinOp)
	}
	
	override public visitInclusiveOrExpression(Java8Parser.InclusiveOrExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2724: {
						return it.visit
					}
					case 468: {
						left += it.visit
					}
					case 2728: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.BITOR: {
						operator += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniBinOp)
	}
	
	override public visitExclusiveOrExpression(Java8Parser.ExclusiveOrExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2735: {
						return it.visit
					}
					case 470: {
						left += it.visit
					}
					case 2739: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.CARET: {
						operator += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniBinOp)
	}
	
	override public visitAndExpression(Java8Parser.AndExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2746: {
						return it.visit
					}
					case 472: {
						left += it.visit
					}
					case 2750: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.BITAND: {
						operator += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniBinOp)
	}
	
	override public visitEqualityExpression(Java8Parser.EqualityExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2757: {
						return it.visit
					}
					case 474: {
						left += it.visit
					}
					case 2761: {
						right += it.visit
					}
					case 2764: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.EQUAL: {
						operator += it.visit
					}
					case Java8Parser.NOTEQUAL: {
						operator += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniBinOp)
	}
	
	override public visitRelationalExpression(Java8Parser.RelationalExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2771: {
						return it.visit
					}
					case 476: {
						left += it.visit
					}
					case 2775: {
						right += it.visit
					}
					case 2778: {
						right += it.visit
					}
					case 2781: {
						right += it.visit
					}
					case 2784: {
						right += it.visit
					}
					case 2787: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.LT: {
						operator += it.visit
					}
					case Java8Parser.GT: {
						operator += it.visit
					}
					case Java8Parser.LE: {
						operator += it.visit
					}
					case Java8Parser.GE: {
						operator += it.visit
					}
					case Java8Parser.INSTANCEOF: {
						operator += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniBinOp)
	}
	
	override public visitShiftExpression(Java8Parser.ShiftExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2794: {
						return it.visit
					}
					case 478: {
						left += it.visit
					}
					case 2799: {
						right += it.visit
					}
					case 2803: {
						right += it.visit
					}
					case 2808: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.LT: {
						operator += it.visit
					}
					case Java8Parser.GT: {
						operator += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniBinOp)
	}
	
	override public visitAdditiveExpression(Java8Parser.AdditiveExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2815: {
						return it.visit
					}
					case 480: {
						left += it.visit
					}
					case 2819: {
						right += it.visit
					}
					case 2822: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.ADD: {
						operator += it.visit
					}
					case Java8Parser.SUB: {
						operator += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniBinOp)
	}
	
	override public visitMultiplicativeExpression(Java8Parser.MultiplicativeExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2829: {
						return it.visit
					}
					case 482: {
						left += it.visit
					}
					case 2833: {
						right += it.visit
					}
					case 2836: {
						right += it.visit
					}
					case 2839: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.MUL: {
						operator += it.visit
					}
					case Java8Parser.DIV: {
						operator += it.visit
					}
					case Java8Parser.MOD: {
						operator += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniBinOp)
	}
	
	override public visitUnaryExpression(Java8Parser.UnaryExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val operator = newArrayList
		map.put("operator", operator)
		val expr = newArrayList
		map.put("expr", expr)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2845: {
						return it.visit
					}
					case 2846: {
						return it.visit
					}
					case 2848: {
						expr += it.visit
					}
					case 2850: {
						expr += it.visit
					}
					case 2851: {
						return it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.ADD: {
						operator += it.visit
					}
					case Java8Parser.SUB: {
						operator += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniUnaryOp)
	}
	
	override public visitPreIncrementExpression(Java8Parser.PreIncrementExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val operator = newArrayList
		map.put("operator", operator)
		val expr = newArrayList
		map.put("expr", expr)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2855: {
						expr += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.INC: {
						operator += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniUnaryOp)
	}
	
	override public visitPreDecrementExpression(Java8Parser.PreDecrementExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val operator = newArrayList
		map.put("operator", operator)
		val expr = newArrayList
		map.put("expr", expr)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2858: {
						expr += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.DEC: {
						operator += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniUnaryOp)
	}
	
	override public visitUnaryExpressionNotPlusMinus(Java8Parser.UnaryExpressionNotPlusMinusContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val operator = newArrayList
		map.put("operator", operator)
		val expr = newArrayList
		map.put("expr", expr)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2860: {
						return it.visit
					}
					case 2862: {
						expr += it.visit
					}
					case 2864: {
						expr += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.TILDE: {
						operator += it.visit
					}
					case Java8Parser.BANG: {
						operator += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniUnaryOp)
	}
	
	override public visitPostfixExpression(Java8Parser.PostfixExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2868: {
						return it.visit
					}
					case 2869: {
						return it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniUnaryOp)
	}
	
}
