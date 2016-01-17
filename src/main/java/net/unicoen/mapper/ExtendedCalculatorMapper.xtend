package net.unicoen.mapper

import java.io.FileInputStream
import java.util.List
import java.util.ArrayList
import java.util.Map
import net.unicoen.node.*
import net.unicoen.parser.ExtendedCalculatorBaseVisitor
import net.unicoen.parser.ExtendedCalculatorLexer
import net.unicoen.parser.ExtendedCalculatorParser
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

class ExtendedCalculatorMapper extends ExtendedCalculatorBaseVisitor<Object> {
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

	def parse(String code, Function1<ExtendedCalculatorParser, ParseTree> parseAction) {
		parseCore(new ANTLRInputStream(code), parseAction)
	}

	def parseFile(String path, Function1<ExtendedCalculatorParser, ParseTree> parseAction) {
		val inputStream = new FileInputStream(path)
		try {
			parseCore(new ANTLRInputStream(inputStream), parseAction)
		} finally {
			inputStream.close
		}
	}

	def parseCore(CharStream chars, Function1<ExtendedCalculatorParser, ParseTree> parseAction) {
		val lexer = new ExtendedCalculatorLexer(chars)
		val tokens = new CommonTokenStream(lexer)
		val parser = new ExtendedCalculatorParser(tokens)
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
		list.flatten
	}

	override public visit(ParseTree tree) {
		if (_isDebugMode) {
			if (!(tree instanceof ParserRuleContext)) {
				return visitTerminal(tree as TerminalNode)
			}
			val ruleName = ExtendedCalculatorParser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
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
							value.forEach [
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

	override public visitCompilationUnit(ExtendedCalculatorParser.CompilationUnitContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val members = newArrayList
		map.put("members", members)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 46: {
						merge += it.visit
					}
					case 49: {
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
		val node = map.castTo(UniClassDec)
		merge.forEach[node.merge(it.castTo(UniClassDec))]
		node
	}
	
	override public visitClassNameDeclaration(ExtendedCalculatorParser.ClassNameDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val className = newArrayList
		map.put("className", className)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case ExtendedCalculatorParser.Identifier: {
						className += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map
	}
	
	override public visitExpressionList(ExtendedCalculatorParser.ExpressionListContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 55: {
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
	
	override public visitAddSubExpression(ExtendedCalculatorParser.AddSubExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 66: {
						return it.visit
					}
					case 8: {
						left += it.visit
					}
					case 70: {
						right += it.visit
					}
					case 73: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case ExtendedCalculatorParser.PLUS: {
						operator += it.visit.flatten
					}
					case ExtendedCalculatorParser.MINUS: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniBinOp)
	}
	
	override public visitMulDivExpression(ExtendedCalculatorParser.MulDivExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 80: {
						return it.visit
					}
					case 10: {
						left += it.visit
					}
					case 84: {
						right += it.visit
					}
					case 87: {
						right += it.visit
					}
					case 90: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case ExtendedCalculatorParser.MUL: {
						operator += it.visit.flatten
					}
					case ExtendedCalculatorParser.DIV: {
						operator += it.visit.flatten
					}
					case ExtendedCalculatorParser.MOD: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		}
		map.castTo(UniBinOp)
	}
	
	override public visitNestedExpression(ExtendedCalculatorParser.NestedExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 103: {
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
	
	override public visitFunctionCall(ExtendedCalculatorParser.FunctionCallContext ctx) {
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
					case 106: {
						methodName += it.visit
					}
					case 108: {
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
	
	override public visitFunctionName(ExtendedCalculatorParser.FunctionNameContext ctx) {
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
	
	override public visitArgumentList(ExtendedCalculatorParser.ArgumentListContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 115: {
						add += it.visit
					}
					case 117: {
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
	
	override public visitVariableAccess(ExtendedCalculatorParser.VariableAccessContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val fieldName = newArrayList
		map.put("fieldName", fieldName)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 125: {
						fieldName += it.visit
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
		map.castTo(UniFieldAccess)
	}
	
	override public visitVariableDeclaration(ExtendedCalculatorParser.VariableDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val name = newArrayList
		map.put("name", name)
		val value = newArrayList
		map.put("value", value)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 131: {
						name += it.visit
					}
					case 133: {
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
		map.castTo(UniFieldDec)
	}
	
	override public visitVariableName(ExtendedCalculatorParser.VariableNameContext ctx) {
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
	
	override public visitFunctionDeclaration(ExtendedCalculatorParser.FunctionDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val args = newArrayList
		map.put("args", args)
		val methodName = newArrayList
		map.put("methodName", methodName)
		val block = newArrayList
		map.put("block", block)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 138: {
						methodName += it.visit
					}
					case 140: {
						args += it.visit
					}
					case 145: {
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
		map.castTo(UniMethodDec)
	}
	
	override public visitMethodBody(ExtendedCalculatorParser.MethodBodyContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val body = newArrayList
		map.put("body", body)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 148: {
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
	
	override public visitAddSubExpressionList(ExtendedCalculatorParser.AddSubExpressionListContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 151: {
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
	
	override public visitParameterList(ExtendedCalculatorParser.ParameterListContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 153: {
						add += it.visit
					}
					case 155: {
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
	
	override public visitParameter(ExtendedCalculatorParser.ParameterContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val name = newArrayList
		map.put("name", name)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 161: {
						name += it.visit
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
	
	override public visitIntegerLiteral(ExtendedCalculatorParser.IntegerLiteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == ExtendedCalculatorParser.IntegerLiteral) {
					return true
				}
			}
			return false
		].text
		return new UniIntLiteral(Integer.parseInt(text))
	}
	
	override public visitFloatingPointLiteral(ExtendedCalculatorParser.FloatingPointLiteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == ExtendedCalculatorParser.FloatingPointLiteral) {
					return true
				}
			}
			return false
		].text
		return new UniDoubleLiteral(Double.parseDouble(text))
	}
	
}
