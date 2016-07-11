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
import org.antlr.v4.runtime.Token
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import org.eclipse.xtext.xbase.lib.Functions.Function1
import java.lang.reflect.ParameterizedType

class Java8Mapper extends Java8BaseVisitor<Object> {

	val boolean _isDebugMode
	val List<Comment> _comments = new ArrayList<Comment>;
	var CommonTokenStream _stream;
	var UniNode _lastNode;
	var int _nextTokenIndex;

	static class Comment {
		val List<String> contents
		var ParseTree parent

		new(List<String> contents, ParseTree parent) {
			this.contents = contents
			this.parent = parent
		}
	}

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
		_comments.clear()
		_stream = tokens
		_lastNode = null
		_nextTokenIndex = 0

		val ret = tree.visit.flatten

		if (_lastNode !== null) {
			val count = _stream.size - 1
			for (var i = _nextTokenIndex; i < count; i++) {
				val hiddenToken = _stream.get(i) // Includes skipped tokens (maybe)
				if (_lastNode.comments === null) {
					_lastNode.comments = newArrayList
				}
				_lastNode.comments += hiddenToken.text
			}
		}
		ret
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
		val result = if (_isDebugMode && tree instanceof RuleContext) {
				val ruleName = Java8Parser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
				println("enter " + ruleName + " : " + tree.text)
				val ret = tree.accept(this)
				println("exit " + ruleName + " : " + ret)
				ret
			} else {
				tree.accept(this)
			}

		val node = if (result instanceof List<?>) {
				if(result.size == 1) result.get(0) else result
			} else {
				result
			}
		if (node instanceof UniNode) {
			var List<String> contents = newArrayList
			for (var i = _comments.size - 1; i >= 0 && _comments.get(i).parent == tree; i--) {
				_comments.get(i).contents += contents
				contents = _comments.get(i).contents
				_comments.remove(i)
			}
			if (contents.size > 0) {
				if (node.comments === null) {
					node.comments = contents
				} else {
					node.comments += contents
				}
			}
			_lastNode = node
		} else {
			for (var i = _comments.size - 1; i >= 0 && _comments.get(i).parent == tree; i--) {
				_comments.get(i).parent = _comments.get(i).parent.parent
			}
			_lastNode = null
		}

		result
	}

	def boolean isNonEmptyNode(ParseTree node) {
		if (node instanceof ParserRuleContext) {
			if (node.childCount > 1) {
				return true
			}
			node.childCount == 1 && node.children.exists[isNonEmptyNode]
		} else {
			true
		}
	}

	override public visitTerminal(TerminalNode node) {
		if (_isDebugMode) {
			println("visit TERMINAL : " + node.text)
		}

		val token = node.symbol
		if (token.type > 0) {
			val count = token.tokenIndex
			val List<String> contents = newArrayList
			var i = _nextTokenIndex
			for (; i < count; i++) {
				val hiddenToken = _stream.get(i) // Includes skipped tokens (maybe)
				if (_lastNode !== null && _stream.get(_nextTokenIndex - 1).line == hiddenToken.line) {
					if (_lastNode.comments === null) {
						_lastNode.comments = newArrayList
					}
					_lastNode.comments += hiddenToken.text
				} else {
					contents += hiddenToken.text
				}
			}
			val count2 = _stream.size - 1
			for (i = count + 1; i < count2 && _stream.get(i).channel == Token.HIDDEN_CHANNEL &&
				_stream.get(count).line == _stream.get(i).line; i++) {
				contents += _stream.get(i).text
			}
			if (contents.size > 0) {
				_comments.add(new Comment(contents, node.parent))
			}
			_nextTokenIndex = i
		}
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
		if (obj instanceof Map<?, ?>) {
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
						if (value instanceof Map<?, ?>) {
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
		if (temp instanceof Map<?, ?>) {
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
			return if (first === null) {
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
		].visit as String
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
		].visit as String
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
		].visit as String
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
		].visit as String
		return new UniStringLiteral(text.substring(1, text.length - 1))
	}

	override public visitPrimitiveType(Java8Parser.PrimitiveTypeContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 538: {
						ret += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.BOOLEAN: {
						ret += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
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
					case 582: {
						add += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						add += it.visit.flatten
					}
					case Java8Parser.DOT: {
						add += it.visit.flatten
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
		val ret = newArrayList
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
						ret += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
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
						add += it.visit.flatten
					}
					case Java8Parser.RBRACK: {
						add += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitTypeName(Java8Parser.TypeNameContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val receiver = newArrayList
		map.put("receiver", receiver)
		val ret = newArrayList
		val fieldName = newArrayList
		map.put("fieldName", fieldName)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 733: {
						ret += it.visit
					}
					case 734: {
						receiver += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						fieldName += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniFieldAccess)
	}

	override public visitPackageOrTypeName(Java8Parser.PackageOrTypeNameContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val receiver = newArrayList
		map.put("receiver", receiver)
		val ret = newArrayList
		val fieldName = newArrayList
		map.put("fieldName", fieldName)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 741: {
						ret += it.visit
					}
					case 68: {
						receiver += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						fieldName += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniFieldAccess)
	}

	override public visitExpressionName(Java8Parser.ExpressionNameContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val receiver = newArrayList
		map.put("receiver", receiver)
		val ret = newArrayList
		val fieldName = newArrayList
		map.put("fieldName", fieldName)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 751: {
						ret += it.visit
					}
					case 752: {
						receiver += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						fieldName += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniFieldAccess)
	}

	override public visitAmbiguousName(Java8Parser.AmbiguousNameContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val receiver = newArrayList
		map.put("receiver", receiver)
		val ret = newArrayList
		val fieldName = newArrayList
		map.put("fieldName", fieldName)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 759: {
						ret += it.visit
					}
					case 72: {
						receiver += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						fieldName += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniFieldAccess)
	}

	override public visitIdent(Java8Parser.IdentContext ctx) {
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
						name += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniIdent)
	}

	override public visitCompilationUnit(Java8Parser.CompilationUnitContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 780: {
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
		val node = map.castTo(UniProgram)
		merge.forEach[node.merge(it.castTo(UniProgram))]
		node
	}

	override public visitTypeDeclaration(Java8Parser.TypeDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val interfaces = newArrayList
		map.put("interfaces", interfaces)
		val classes = newArrayList
		map.put("classes", classes)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 835: {
						classes += it.visit
					}
					case 836: {
						interfaces += it.visit
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
		map.castTo(UniProgram)
	}

	override public visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 840: {
						merge += it.visit
					}
					case 841: {
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
					case 844: {
						modifiers += it.visit
					}
					case 846: {
						className += it.visit
					}
					case 850: {
						superClass += it.visit
					}
					case 853: {
						interfaces += it.visit
					}
					case 856: {
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
						case 860: {
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
						case 889: {
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
						case 892: {
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
						case 894: {
							add += it.visit
						}
						case 896: {
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
						case 903: {
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
						case 911: {
							add += it.visit
						}
						case 914: {
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
						case 917: {
							add += it.visit
						}
						case 918: {
							add += it.visit
						}
						case 919: {
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
						case 924: {
							modifiers += it.visit
						}
						case 925: {
							type += it.visit
						}
						case 926: {
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
						case 929: {
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
					case 945: {
						add += it.visit
					}
					case 947: {
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
					case 953: {
						merge += it.visit
					}
					case 955: {
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
		merge.forEach [
			if (it instanceof Map<?, ?>) {
				it.forEach [ k, v |
					if (map.containsKey(k)) {
						map.get(k) += v
					} else {
						map.put(k, v as ArrayList<Object>)
					}
				]
			}
		]
		map
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
					case 959: {
						type += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						name += it.visit.flatten
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
					case 1042: {
						modifiers += it.visit
					}
					case 1048: {
						merge += it.visit
					}
					case 1049: {
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
					case 1063: {
						returnType += it.visit
					}
					case 1064: {
						merge += it.visit
					}
					case 1075: {
						returnType += it.visit
					}
					case 1076: {
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
					case 1086: {
						methodName += it.visit
					}
					case 1088: {
						args += it.visit
					}
					case 1092: {
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
						case 1097: {
							add += it.visit
						}
						case 1099: {
							add += it.visit
						}
						case 1101: {
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
						case 1104: {
							add += it.visit
						}
						case 1106: {
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
					case 1128: {
						type += it.visit
					}
					case 1129: {
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
					case 1131: {
						name += it.visit
					}
					case 1132: {
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
					case 1188: {
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
					case 1197: {
						modifiers += it.visit
					}
					case 1203: {
						merge += it.visit
					}
					case 1207: {
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
					case 1218: {
						methodName += it.visit
					}
					case 1220: {
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

	override public visitEnumDeclaration(Java8Parser.EnumDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val className = newArrayList
		val Object symbol = "_"
		className.add(symbol)
		map.put("className", className)
		val interfaces = newArrayList
		map.put("interfaces", interfaces)
		val modifiers = newArrayList
		map.put("modifiers", modifiers)
		val members = newArrayList
		map.put("members", members)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1284: {
						modifiers += it.visit
					}
					case 1286: {
						className += it.visit
					}
					case 1287: {
						interfaces += it.visit
					}
					case 1290: {
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

	override public visitEnumName(Java8Parser.EnumNameContext ctx) {
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

	override public visitEnumBody(Java8Parser.EnumBodyContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1295: {
							add += it.visit
						}
						case 1301: {
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

	override public visitEnumConstantList(Java8Parser.EnumConstantListContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1306: {
							add += it.visit
						}
						case 1308: {
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
		map.castToList(UniEnumConstant)
	}

	override public visitEnumConstant(Java8Parser.EnumConstantContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val name = newArrayList
		map.put("name", name)
		val args = newArrayList
		map.put("args", args)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1322: {
						args += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						name += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniEnumConstant)
	}

	override public visitEnumBodyDeclarations(Java8Parser.EnumBodyDeclarationsContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1334: {
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

	override public visitInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1340: {
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
		val node = map.castTo(UniInterfaceDec)
		merge.forEach[node.merge(it.castTo(UniInterfaceDec))]
		node
	}

	override public visitNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val interfaceName = newArrayList
		map.put("interfaceName", interfaceName)
		val modifiers = newArrayList
		map.put("modifiers", modifiers)
		val superInterface = newArrayList
		map.put("superInterface", superInterface)
		val members = newArrayList
		map.put("members", members)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1344: {
						modifiers += it.visit
					}
					case 1346: {
						interfaceName += it.visit
					}
					case 1350: {
						superInterface += it.visit
					}
					case 1353: {
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
		map.castTo(UniInterfaceDec)
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
						case 1355: {
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
						case 1376: {
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
						case 1384: {
							add += it.visit
						}
						case 1385: {
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
						case 1391: {
							modifiers += it.visit
						}
						case 1392: {
							type += it.visit
						}
						case 1393: {
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
						case 1396: {
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
					case 1408: {
						modifiers += it.visit
					}
					case 1409: {
						merge += it.visit
					}
					case 1410: {
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
						case 1412: {
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
					case 1536: {
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
						case 1544: {
							add += it.visit
						}
						case 1546: {
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
					case 1553: {
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
						case 1558: {
							add += it.visit
						}
						case 1559: {
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
		val ret = newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1570: {
							ret += it.visit
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
		if (!ret.isEmpty) {
			return ret
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
						case 1573: {
							modifiers += it.visit
						}
						case 1579: {
							type += it.visit
						}
						case 1580: {
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
		val ret = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1621: {
						ret += it.visit
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
		if (!ret.isEmpty) {
			return ret
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
					case 1635: {
						cond += it.visit
					}
					case 1637: {
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

	override public visitIfThenElseStatement(Java8Parser.IfThenElseStatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val cond = newArrayList
		map.put("cond", cond)
		val falseStatement = newArrayList
		map.put("falseStatement", falseStatement)
		val trueStatement = newArrayList
		map.put("trueStatement", trueStatement)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1641: {
						cond += it.visit
					}
					case 1643: {
						trueStatement += it.visit
					}
					case 1645: {
						falseStatement += it.visit
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

	override public visitSwitchStatement(Java8Parser.SwitchStatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val cond = newArrayList
		map.put("cond", cond)
		val cases = newArrayList
		map.put("cases", cases)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1669: {
						cond += it.visit
					}
					case 1671: {
						cases += it.visit
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
		map.castTo(UniSwitch)
	}

	override public visitSwitchBlock(Java8Parser.SwitchBlockContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1674: {
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
		map.castToList(UniSwitchUnit)
	}

	override public visitSwitchBlockStatementGroup(Java8Parser.SwitchBlockStatementGroupContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val statement = newArrayList
		map.put("statement", statement)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1688: {
						merge += it.visit
					}
					case 1689: {
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
		val node = map.castTo(UniSwitchUnit)
		merge.forEach[node.merge(it.castTo(UniSwitchUnit))]
		node
	}

	override public visitSwitchLabels(Java8Parser.SwitchLabelsContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1691: {
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
		val node = map.castTo(UniSwitchUnit)
		merge.forEach[node.merge(it.castTo(UniSwitchUnit))]
		node
	}

	override public visitSwitchLabel(Java8Parser.SwitchLabelContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val cond = newArrayList
		map.put("cond", cond)
		val label = newArrayList
		map.put("label", label)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1699: {
						cond += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.CASE: {
						label += it.visit.flatten
					}
					case Java8Parser.DEFAULT: {
						label += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniSwitchUnit)
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
					case 1742: {
						init += it.visit
					}
					case 1746: {
						cond += it.visit
					}
					case 1750: {
						step += it.visit
					}
					case 1754: {
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

	override public visitEnhancedForStatement(Java8Parser.EnhancedForStatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val container = newArrayList
		map.put("container", container)
		val statement = newArrayList
		map.put("statement", statement)
		val modifiers = newArrayList
		map.put("modifiers", modifiers)
		val type = newArrayList
		map.put("type", type)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1788: {
						modifiers += it.visit
					}
					case 1794: {
						type += it.visit
					}
					case 1795: {
						merge += it.visit
					}
					case 1797: {
						container += it.visit
					}
					case 1799: {
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
		val node = map.castTo(UniEnhancedFor)
		merge.forEach[node.merge(it.castTo(UniEnhancedFor))]
		node
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
					case 1829: {
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
		val add = newArrayList
		map.put("add", add)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1926: {
						add += it.visit.flatten
					}
					case 1927: {
						add += it.visit.flatten
					}
					case 1930: {
						add += it.visit.flatten
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
		var node = add.get(0) as UniExpr
		add.remove(node)
		for (Object obj : add) {
			switch (obj) {
				UniMethodCall: {
					obj.receiver = node
					node = obj
				}
				UniFieldAccess: {
					obj.receiver = node
					node = obj
				}
			}
		}
		node
	}

	override public visitPrimaryNoNewArray_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2014: {
						ret += it.visit
					}
					case 2050: {
						ret += it.visit
					}
					case 2052: {
						ret += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.THIS: {
						ret += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map
	}

	override public visitClassInstanceCreationExpression_lfno_primary(Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val type = newArrayList
		map.put("type", type)
		val args = newArrayList
		map.put("args", args)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2231: {
						type += it.visit
					}
					case 2235: {
						args += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						type += it.visit.flatten
					}
					case Java8Parser.DOT: {
						type += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniNew)
	}

	override public visitFieldAccess(Java8Parser.FieldAccessContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val receiver = newArrayList
		map.put("receiver", receiver)
		val fieldName = newArrayList
		map.put("fieldName", fieldName)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2273: {
						receiver += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						fieldName += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniFieldAccess)
	}

	override public visitMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val args = newArrayList
		map.put("args", args)
		val receiver = newArrayList
		map.put("receiver", receiver)
		val methodName = newArrayList
		map.put("methodName", methodName)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2361: {
						methodName += it.visit
					}
					case 2363: {
						args += it.visit
					}
					case 2368: {
						receiver += it.visit
					}
					case 2375: {
						args += it.visit
					}
					case 2380: {
						receiver += it.visit
					}
					case 2387: {
						args += it.visit
					}
					case 2392: {
						receiver += it.visit
					}
					case 2399: {
						args += it.visit
					}
					case 2411: {
						args += it.visit
					}
					case 2424: {
						args += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						methodName += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniMethodCall)
	}

	override public visitMethodInvocation_lf_primary(Java8Parser.MethodInvocation_lf_primaryContext ctx) {
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
					case 2437: {
						args += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						methodName += it.visit.flatten
					}
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
		val receiver = newArrayList
		map.put("receiver", receiver)
		val methodName = newArrayList
		map.put("methodName", methodName)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2442: {
						methodName += it.visit
					}
					case 2444: {
						args += it.visit
					}
					case 2449: {
						receiver += it.visit
					}
					case 2456: {
						args += it.visit
					}
					case 2461: {
						receiver += it.visit
					}
					case 2468: {
						args += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						methodName += it.visit.flatten
					}
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
					case 2500: {
						add += it.visit
					}
					case 2502: {
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
					case 2606: {
						type += it.visit
					}
					case 2607: {
						merge += it.visit
					}
					case 2608: {
						type += it.visit
					}
					case 2612: {
						type += it.visit
					}
					case 2613: {
						merge += it.visit
					}
					case 2614: {
						type += it.visit
					}
					case 2618: {
						type += it.visit
					}
					case 2619: {
						type += it.visit
					}
					case 2620: {
						value += it.visit
					}
					case 2623: {
						type += it.visit
					}
					case 2624: {
						type += it.visit
					}
					case 2625: {
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
					case 2629: {
						merge += it.visit
					}
					case 2630: {
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
					case 2643: {
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
					case 2684: {
						left += it.visit
					}
					case 2685: {
						operator += it.visit
					}
					case 2686: {
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
		val ret = newArrayList
		val cond = newArrayList
		map.put("cond", cond)
		val falseExpr = newArrayList
		map.put("falseExpr", falseExpr)
		val trueExpr = newArrayList
		map.put("trueExpr", trueExpr)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2695: {
						ret += it.visit
					}
					case 2696: {
						cond += it.visit
					}
					case 2698: {
						trueExpr += it.visit
					}
					case 2700: {
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
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniTernaryOp)
	}

	override public visitConditionalOrExpression(Java8Parser.ConditionalOrExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2705: {
						ret += it.visit
					}
					case 468: {
						left += it.visit
					}
					case 2709: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.OR: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniBinOp)
	}

	override public visitConditionalAndExpression(Java8Parser.ConditionalAndExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2716: {
						ret += it.visit
					}
					case 470: {
						left += it.visit
					}
					case 2720: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.AND: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniBinOp)
	}

	override public visitInclusiveOrExpression(Java8Parser.InclusiveOrExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2727: {
						ret += it.visit
					}
					case 472: {
						left += it.visit
					}
					case 2731: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.BITOR: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniBinOp)
	}

	override public visitExclusiveOrExpression(Java8Parser.ExclusiveOrExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2738: {
						ret += it.visit
					}
					case 474: {
						left += it.visit
					}
					case 2742: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.CARET: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniBinOp)
	}

	override public visitAndExpression(Java8Parser.AndExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2749: {
						ret += it.visit
					}
					case 476: {
						left += it.visit
					}
					case 2753: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.BITAND: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniBinOp)
	}

	override public visitEqualityExpression(Java8Parser.EqualityExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2760: {
						ret += it.visit
					}
					case 478: {
						left += it.visit
					}
					case 2764: {
						right += it.visit
					}
					case 2767: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.EQUAL: {
						operator += it.visit.flatten
					}
					case Java8Parser.NOTEQUAL: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniBinOp)
	}

	override public visitRelationalExpression(Java8Parser.RelationalExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2774: {
						ret += it.visit
					}
					case 480: {
						left += it.visit
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
					case 2790: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.LT: {
						operator += it.visit.flatten
					}
					case Java8Parser.GT: {
						operator += it.visit.flatten
					}
					case Java8Parser.LE: {
						operator += it.visit.flatten
					}
					case Java8Parser.GE: {
						operator += it.visit.flatten
					}
					case Java8Parser.INSTANCEOF: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniBinOp)
	}

	override public visitShiftExpression(Java8Parser.ShiftExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2797: {
						ret += it.visit
					}
					case 482: {
						left += it.visit
					}
					case 2802: {
						right += it.visit
					}
					case 2806: {
						right += it.visit
					}
					case 2811: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.LT: {
						operator += it.visit.flatten
					}
					case Java8Parser.GT: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniBinOp)
	}

	override public visitAdditiveExpression(Java8Parser.AdditiveExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2818: {
						ret += it.visit
					}
					case 484: {
						left += it.visit
					}
					case 2822: {
						right += it.visit
					}
					case 2825: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.ADD: {
						operator += it.visit.flatten
					}
					case Java8Parser.SUB: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniBinOp)
	}

	override public visitMultiplicativeExpression(Java8Parser.MultiplicativeExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		val right = newArrayList
		map.put("right", right)
		val left = newArrayList
		map.put("left", left)
		val operator = newArrayList
		map.put("operator", operator)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2832: {
						ret += it.visit
					}
					case 486: {
						left += it.visit
					}
					case 2836: {
						right += it.visit
					}
					case 2839: {
						right += it.visit
					}
					case 2842: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.MUL: {
						operator += it.visit.flatten
					}
					case Java8Parser.DIV: {
						operator += it.visit.flatten
					}
					case Java8Parser.MOD: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniBinOp)
	}

	override public visitUnaryExpression(Java8Parser.UnaryExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		val operator = newArrayList
		map.put("operator", operator)
		val expr = newArrayList
		map.put("expr", expr)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2848: {
						ret += it.visit
					}
					case 2849: {
						ret += it.visit
					}
					case 2851: {
						expr += it.visit
					}
					case 2853: {
						expr += it.visit
					}
					case 2854: {
						ret += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.ADD: {
						operator += it.visit.flatten
					}
					case Java8Parser.SUB: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
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
					case 2858: {
						expr += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.INC: {
						operator += it.visit.flatten
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
					case 2861: {
						expr += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.DEC: {
						operator += it.visit.flatten
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
		val ret = newArrayList
		val operator = newArrayList
		map.put("operator", operator)
		val expr = newArrayList
		map.put("expr", expr)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2863: {
						ret += it.visit
					}
					case 2865: {
						expr += it.visit
					}
					case 2867: {
						expr += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.TILDE: {
						operator += it.visit.flatten
					}
					case Java8Parser.BANG: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniUnaryOp)
	}

	override public visitPostfixExpression(Java8Parser.PostfixExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2871: {
						ret += it.visit
					}
					case 2872: {
						ret += it.visit
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
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniUnaryOp)
	}

	override public visitPostIncrementExpression(Java8Parser.PostIncrementExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val expr = newArrayList
		map.put("expr", expr)
		val operator = newArrayList
		map.put("operator", operator)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2882: {
						expr += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.INC: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniUnaryOp)
	}

	override public visitPostDecrementExpression(Java8Parser.PostDecrementExpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val expr = newArrayList
		map.put("expr", expr)
		val operator = newArrayList
		map.put("operator", operator)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2887: {
						expr += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.DEC: {
						operator += it.visit.flatten
					}
					default: {
						none += it.visit
					}
				}
			}
		]
		map.castTo(UniUnaryOp)
	}

}
