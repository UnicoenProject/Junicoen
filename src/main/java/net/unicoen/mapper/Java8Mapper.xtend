package net.unicoen.mapper

import com.google.common.collect.Lists
import com.google.common.collect.Maps
import java.io.FileInputStream
import java.util.List
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
		parseCore(new ANTLRInputStream(code));
	}

	def parseFile(String path) {
		val inputStream = new FileInputStream(path);
		try {
			parseCore(new ANTLRInputStream(inputStream));
		} finally {
			inputStream.close();
		}
	}

	def parseCore(CharStream chars) {
		parseCore(chars, [parser|parser.compilationUnit()])
	}

	def parse(String code, Function1<Java8Parser, ParseTree> parseAction) {
		parseCore(new ANTLRInputStream(code), parseAction);
	}

	def parseFile(String path, Function1<Java8Parser, ParseTree> parseAction) {
		val inputStream = new FileInputStream(path);
		try {
			parseCore(new ANTLRInputStream(inputStream), parseAction);
		} finally {
			inputStream.close();
		}
	}

	def parseCore(CharStream chars, Function1<Java8Parser, ParseTree> parseAction) {
		val lexer = new Java8Lexer(chars);
		val tokens = new CommonTokenStream(lexer);
		val parser = new Java8Parser(tokens);
		val tree = parseAction.apply(parser) // parse
		tree.visit
	}

	override public visitChildren(RuleNode node) {
		val n = node.childCount;
		val list = Lists.newArrayList()
		(0 ..< n).forEach [ i |
			val c = node.getChild(i)
			val childResult = c.visit
			list.add(childResult)
		]
		list
	}

	override public visit(ParseTree tree) {
		if (_isDebugMode) {
			if (!(tree instanceof ParserRuleContext)) {
				return visitTerminal(tree as TerminalNode)
			}
			val ruleName = Java8Parser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
			println('''enter «ruleName» : «tree.text»''')
			val ret = tree.accept(this)
			println('''exit «ruleName» : «ret»''')
			ret
		} else {
			tree.accept(this)
		}
	}

	override public visitTerminal(TerminalNode node) {
		println('''visit TERMINAL : «node.text»''')
		node.text
	}

	private def <T> T flatten(T obj) {
		if (obj instanceof List<?>) {
			if (obj.size == 1 && obj.get(0) instanceof List<?>) {
				return (obj.get(0) as T).flatten
			}
			val ret = Lists.newArrayList
			obj.forEach [
				ret.add(it.flatten)
			]
			return ret as T
		}
		if (obj instanceof Map<?,?>) {
			val ret = Maps.newHashMap
			obj.forEach [ key, value |
				ret.put(key, value.flatten)
			]
			return ret as T
		}
		obj
	}

	public def <T> List<T> castToList(Object obj, Class<T> clazz) {
		val temp = obj.flatten
		val ret = Lists.newArrayList
		if (temp instanceof Map<?, ?>) {
			val add = temp.containsKey("add")
			temp.forEach [ key, value |
				switch key {
					case "add": {
						ret += value.castToList(clazz)
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
		val fields = clazz.fields
		val fieldsName = Lists.newArrayList
		fields.forEach[fieldsName.add(it.name)]
		if (temp instanceof Map<?,?>) {
			if (fieldsName.size == 1 && fieldsName.get(0) == "CASE_INSENSITIVE_ORDER") {
				val builder = new StringBuilder
				temp.forEach [ key, value |
					builder.append(value.castTo(clazz))
				]
				return clazz.getConstructor(StringBuilder).newInstance(builder)
			}
			val instance = clazz.newInstance
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
			if (fieldsName.size == 1 && fieldsName.get(0) == "CASE_INSENSITIVE_ORDER") {
				val builder = new StringBuilder
				temp.forEach [
					builder.append(it.castTo(clazz))
				]
				return clazz.getConstructor(StringBuilder).newInstance(builder)
			}
			return temp.findFirst[clazz.isAssignableFrom(it.class)].castTo(clazz)
		}
		clazz.cast(temp)
	}

	override public visitIntegerLiteral(Java8Parser.IntegerLiteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == Java8Parser.IntegerLiteral) {
					return true;
				}
			}
			return false;
		].text
		return new UniIntLiteral(Integer.parseInt(text))
	}

	override public visitFloatingPointLiteral(Java8Parser.FloatingPointLiteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == Java8Parser.FloatingPointLiteral) {
					return true;
				}
			}
			return false;
		].text
		return new UniDoubleLiteral(Double.parseDouble(text))
	}

	override public visitBooleanLiteral(Java8Parser.BooleanLiteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == Java8Parser.BooleanLiteral) {
					return true;
				}
			}
			return false;
		].text
		return new UniBoolLiteral("true" == text)
	}

	override public visitStringLiteral(Java8Parser.StringLiteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == Java8Parser.StringLiteral) {
					return true;
				}
			}
			return false;
		].text
		return new UniStringLiteral(text.substring(1, text.length - 1))
	}

	override public visitClassType(Java8Parser.ClassTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitInterfaceType(Java8Parser.InterfaceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitDims(Java8Parser.DimsContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitCompilationUnit(Java8Parser.CompilationUnitContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 776: {
						merge += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		val node = new UniClassDec
		merge.forEach[node.merge(it.castTo(UniClassDec))]
		node
	}

	override public visitTypeDeclaration(Java8Parser.TypeDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 831: {
						merge += it.visit
					}
					case 832: {
						merge += it.visit
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		val node = new UniClassDec
		merge.forEach[node.merge(it.castTo(UniClassDec))]
		node
	}

	override public visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 836: {
						merge += it.visit
					}
				}
			}
		]
		val node = new UniClassDec
		merge.forEach[node.merge(it.castTo(UniClassDec))]
		node
	}

	override public visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val modifiers = Lists.newArrayList
		map.put("modifiers", modifiers)
		val className = Lists.newArrayList
		map.put("className", className)
		val superClass = Lists.newArrayList
		map.put("superClass", superClass)
		val interfaces = Lists.newArrayList
		map.put("interfaces", interfaces)
		val members = Lists.newArrayList
		map.put("members", members)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 840: {
						modifiers.add(it.visit)
					}
					case 842: {
						className.add(it.visit)
					}
					case 846: {
						superClass.add(it.visit)
					}
					case 849: {
						interfaces.add(it.visit)
					}
					case 852: {
						members.add(it.visit)
					}
					default: {
						none.add(it.visit)
					}
				}
			}
		]
		map.castTo(UniClassDec)
	}

	override public visitClassName(Java8Parser.ClassNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitClassModifiers(Java8Parser.ClassModifiersContext ctx) {
		val map = Maps.newHashMap
		val add = Lists.newArrayList
		map.put("add", add)
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 856: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		map
	}

	override public visitClassModifier(Java8Parser.ClassModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitSuperclass(Java8Parser.SuperclassContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 885: {
							list += it.visit
						}
					}
				}
			]
		}
		list
	}

	override public visitSuperinterfaces(Java8Parser.SuperinterfacesContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 888: {
							list += it.visit
						}
					}
				}
			]
		}
		list
	}

	override public visitInterfaceTypeList(Java8Parser.InterfaceTypeListContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 890: {
							list += it.visit
						}
						case 892: {
							list += it.visit
						}
					}
				}
			]
		}
		list
	}

	override public visitClassBody(Java8Parser.ClassBodyContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 899: {
							list += it.visit.castToList(UniMemberDec)
						}
					}
				}
			]
		}
		list
	}

	override public visitClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 907: {
							list += it.visit.castToList(UniMemberDec)
						}
						case 910: {
							list += it.visit.castTo(UniMethodDec)
						}
					}
				}
			]
		}
		list
	}

	override public visitClassMemberDeclaration(Java8Parser.ClassMemberDeclarationContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 913: {
							list += it.visit
						}
						case 914: {
							list += it.visit
						}
					}
				}
			]
		}
		list
	}

	override public visitFieldDeclaration(Java8Parser.FieldDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val modifiers = Lists.newArrayList
		map.put("modifiers", modifiers)
		val type = Lists.newArrayList
		map.put("type", type)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 920: {
							modifiers += it.visit
						}
						case 921: {
							type += it.visit
						}
						case 922: {
							add += it.visit
						}
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		val node = new UniFieldDec
		node.modifiers = modifiers.castToList(String)
		node.type = type.castTo(String)
		val addList = add.castToList(UniFieldDec)
		for (UniFieldDec t : addList) {
			t.merge(node)
		}
		addList
	}

	override public visitFieldModifiers(Java8Parser.FieldModifiersContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 925: {
							list += it.visit
						}
					}
				}
			]
		}
		list
	}

	override public visitFieldModifier(Java8Parser.FieldModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitVariableDeclaratorList(Java8Parser.VariableDeclaratorListContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 941: {
							list += it.visit.castTo(UniFieldDec)
						}
						case 943: {
							list += it.visit.castTo(UniFieldDec)
						}
					}
				}
			]
		}
		list
	}

	override public visitVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val name = Lists.newArrayList
		map.put("name", name)
		val value = Lists.newArrayList
		map.put("value", value)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 949: {
						name += it.visit
					}
					case 951: {
						value += it.visit
					}
				}
			}
		]
		map.castTo(UniFieldDec)
	}

	override public visitVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitUnannType(Java8Parser.UnannTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
		val bind = new UniMethodDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1038: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit.castToList(String)
						} else {
							bind.modifiers += it.visit.castToList(String)
						}
					}
					case 1039: {
						val child = it.visit.castTo(UniMethodDec)
						bind.merge(child)
					}
					case 1040: {
						bind.block = it.visit.castTo(UniBlock)
					}
				}
			}
		]
		bind
	}

	override public visitMethodModifiers(Java8Parser.MethodModifiersContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
					}
				}
			]
		}
		list
	}

	override public visitMethodModifier(Java8Parser.MethodModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitMethodHeader(Java8Parser.MethodHeaderContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val returnType = Lists.newArrayList
		map.put("returnType", returnType)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1060: {
						returnType += it.visit
					}
					case 1061: {
						merge += it.visit
					}
					case 1072: {
						returnType += it.visit
					}
					case 1073: {
						merge += it.visit
					}
				}
			}
		]
		val node = map.castTo(UniMethodDec)
		merge.forEach[node.merge(it.castTo(UniMethodDec))]
		node
	}

	override public visitResult(Java8Parser.ResultContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val methodName = Lists.newArrayList
		map.put("methodName", methodName)
		val args = Lists.newArrayList
		map.put("args", args)
		val returnType = Lists.newArrayList
		map.put("returnType", returnType)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1083: {
						methodName += it.visit
					}
					case 1085: {
						args += it.visit
					}
					case 1089: {
						returnType += it.visit
					}
				}
			}
		]
		map.castTo(UniMethodDec)
	}

	override public visitMethodName(Java8Parser.MethodNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitFormalParameterList(Java8Parser.FormalParameterListContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1094: {
							list += it.visit.castToList(UniArg)
						}
						case 1096: {
							list += it.visit.castTo(UniArg)
						}
						case 1098: {
							list += it.visit.castTo(UniArg)
						}
					}
				}
			]
		}
		list
	}

	override public visitFormalParameters(Java8Parser.FormalParametersContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1101: {
							list += it.visit.castTo(UniArg)
						}
						case 1103: {
							list += it.visit.castTo(UniArg)
						}
					}
				}
			]
		}
		list
	}

	override public visitFormalParameter(Java8Parser.FormalParameterContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val type = Lists.newArrayList
		map.put("type", type)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1125: {
						type += it.visit
					}
					case 1126: {
						merge += it.visit
					}
				}
			}
		]
		val node = map.castTo(UniArg)
		merge.forEach[node.merge(it.castTo(UniArg))]
		node
	}

	override public visitParameterDeclaratorId(Java8Parser.ParameterDeclaratorIdContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val name = Lists.newArrayList
		map.put("name", name)
		val type = Lists.newArrayList
		map.put("type", type)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1128: {
						name += it.visit
					}
					case 1129: {
						type += it.visit
					}
				}
			}
		]
		map.castTo(UniArg)
	}

	override public visitParameterName(Java8Parser.ParameterNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx) {
		val bind = new UniMethodDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1194: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit.castToList(String)
						} else {
							bind.modifiers += it.visit.castToList(String)
						}
					}
					case 1200: {
						val child = it.visit.castTo(UniMethodDec)
						bind.merge(child)
					}
					case 1204: {
						bind.block = it.visit.castTo(UniBlock)
					}
				}
			}
		]
		bind
	}

	override public visitConstructorModifier(Java8Parser.ConstructorModifierContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
					}
				}
			]
		}
		list
	}

	override public visitConstructorDeclarator(Java8Parser.ConstructorDeclaratorContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val methodName = Lists.newArrayList
		map.put("methodName", methodName)
		val args = Lists.newArrayList
		map.put("args", args)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1215: {
						methodName += it.visit
					}
					case 1217: {
						args += it.visit
					}
				}
			}
		]
		map.castTo(UniMethodDec)
	}

	override public visitSimpleTypeName(Java8Parser.SimpleTypeNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx) {
		val bind = new UniClassDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1340: {
						val child = it.visit.castTo(UniClassDec)
						bind.merge(child)
					}
				}
			}
		]
		bind
	}

	override public visitNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val modifiers = Lists.newArrayList
		map.put("modifiers", modifiers)
		val className = Lists.newArrayList
		map.put("className", className)
		val superClass = Lists.newArrayList
		map.put("superClass", superClass)
		val members = Lists.newArrayList
		map.put("members", members)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1344: {
						modifiers += it.visit
					}
					case 1346: {
						className += it.visit
					}
					case 1350: {
						superClass += it.visit
					}
					case 1353: {
						members += it.visit
					}
				}
			}
		]
		map.castTo(UniClassDec)
	}

	override public visitInterfaceModifiers(Java8Parser.InterfaceModifiersContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1355: {
							list += it.visit
						}
					}
				}
			]
		}
		list
	}

	override public visitInterfaceName(Java8Parser.InterfaceNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitInterfaceModifier(Java8Parser.InterfaceModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitExtendsInterfaces(Java8Parser.ExtendsInterfacesContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1373: {
							list += it.visit.castToList(String)
						}
					}
				}
			]
		}
		list
	}

	override public visitInterfaceBody(Java8Parser.InterfaceBodyContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1376: {
							list += it.visit.castToList(UniMemberDec)
						}
					}
				}
			]
		}
		list
	}

	override public visitInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1384: {
							list += it.visit
						}
						case 1385: {
							list += it.visit
						}
					}
				}
			]
		}
		list
	}

	override public visitConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx) {
		val map = Maps.newHashMap
		val modifiers = Lists.newArrayList
		map.put("modifiers", modifiers)
		val type = Lists.newArrayList
		map.put("type", type)
		val merge = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1391: {
							modifiers += it.visit
						}
						case 1392: {
							type += it.visit
						}
						case 1393: {
							merge += it.visit
						}
					}
				}
			]
		}
		val node = map.castTo(UniFieldDec)
		merge.castToList(UniFieldDec).forEach [
			it.castTo(UniFieldDec).merge(node)
		]
		merge
	}

	override public visitConstantModifiers(Java8Parser.ConstantModifiersContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1396: {
							list += it.visit
						}
					}
				}
			]
		}
		list
	}

	override public visitConstantModifier(Java8Parser.ConstantModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx) {
		val bind = new UniMethodDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1408: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit.castToList(String)
						} else {
							bind.modifiers += it.visit.castToList(String)
						}
					}
					case 1409: {
						val child = it.visit.castTo(UniMethodDec)
						bind.merge(child)
					}
					case 1410: {
						bind.block = it.visit.castTo(UniBlock)
					}
				}
			}
		]
		bind
	}

	override public visitInterfaceMethodModifiers(Java8Parser.InterfaceMethodModifiersContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1412: {
							list += it.visit
						}
					}
				}
			]
		}
		list
	}

	override public visitInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none.add(it.visit)
			]
		}
		map
	}

	override public visitArrayInitializer(Java8Parser.ArrayInitializerContext ctx) {
		val bind = new UniArray
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1536: {
						if (bind.items == null) {
							bind.items = it.visit.castToList(UniExpr)
						} else {
							bind.items += it.visit.castToList(UniExpr)
						}
					}
				}
			}
		]
		bind
	}

	override public visitVariableInitializerList(Java8Parser.VariableInitializerListContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1544: {
							list += it.visit.castTo(UniExpr)
						}
						case 1546: {
							list += it.visit.castTo(UniExpr)
						}
					}
				}
			]
		}
		list
	}
}
