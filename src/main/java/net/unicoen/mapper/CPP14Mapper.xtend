package net.unicoen.mapper

import java.io.FileInputStream
import java.util.List
import java.util.ArrayList
import java.util.Map
import net.unicoen.node.*
import net.unicoen.parser.CPP14BaseVisitor
import net.unicoen.parser.CPP14Lexer
import net.unicoen.parser.CPP14Parser
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
import net.unicoen.node_helper.CodeLocation
import net.unicoen.node_helper.CodeRange

class CPP14Mapper extends CPP14BaseVisitor<Object> {

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
		parseCore(chars, [parser|parser.translationunit])
	}

	def parse(String code, Function1<CPP14Parser, ParseTree> parseAction) {
		parseCore(new ANTLRInputStream(code), parseAction)
	}

	def parseFile(String path, Function1<CPP14Parser, ParseTree> parseAction) {
		val inputStream = new FileInputStream(path)
		try {
			parseCore(new ANTLRInputStream(inputStream), parseAction)
		} finally {
			inputStream.close
		}
	}

	def parseCore(CharStream chars, Function1<CPP14Parser, ParseTree> parseAction) {
		val lexer = new CPP14Lexer(chars)
		val tokens = new CommonTokenStream(lexer)
		val parser = new CPP14Parser(tokens)
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
				val ruleName = CPP14Parser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
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
			if (tree instanceof RuleContext)
			{
				val start = (tree as ParserRuleContext).start
				val stop = (tree as ParserRuleContext).stop
				val begin = new CodeLocation(start.charPositionInLine,start.line)
				val endPos = stop.charPositionInLine
				val length = 1 + stop.stopIndex - stop.startIndex
				val end = new CodeLocation(endPos + length, stop.line)
				node.codeRange = new CodeRange(begin,end)
			}
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

	override public visitPrimaryexpression(CPP14Parser.PrimaryexpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 463: {
						ret += it.visit
					}
					case 466: {
						ret += it.visit
					}
					case 469: {
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

	override public visitIdentexpression(CPP14Parser.IdentexpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val name = newArrayList
		map.put("name", name)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 477: {
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
		map.castTo(UniIdent)
	}

	override public visitIdexpressionlapper(CPP14Parser.IdexpressionlapperContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val name = newArrayList
		map.put("name", name)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 596: {
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
		map.castTo(UniIdent)
	}

	override public visitPostfixexpression(CPP14Parser.PostfixexpressionContext ctx) {
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
					case 599: {
						ret += it.visit
					}
					case 34: {
						left += it.visit
					}
					case 666: {
						right += it.visit
					}
					case 676: {
						right += it.visit
					}
					case 685: {
						right += it.visit
					}
					case 691: {
						right += it.visit
					}
					case 694: {
						right += it.visit
					}
					case 697: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.LeftBracket: {
						operator += it.visit.flatten
					}
					case CPP14Parser.RightBracket: {
						operator += it.visit.flatten
					}
					case CPP14Parser.LeftParen: {
						operator += it.visit.flatten
					}
					case CPP14Parser.RightParen: {
						operator += it.visit.flatten
					}
					case CPP14Parser.Dot: {
						operator += it.visit.flatten
					}
					case CPP14Parser.Arrow: {
						operator += it.visit.flatten
					}
					case CPP14Parser.PlusPlus: {
						operator += it.visit.flatten
					}
					case CPP14Parser.MinusMinus: {
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

	override public visitExpressionlist(CPP14Parser.ExpressionlistContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val items = newArrayList
		map.put("items", items)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 707: {
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

	override public visitBinaryexpression(CPP14Parser.BinaryexpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 733: {
						ret += it.visit
					}
					case 734: {
						ret += it.visit
					}
					case 735: {
						ret += it.visit
					}
					case 736: {
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
		map.castTo(UniBinOp)
	}

	override public visitUnaryexpression(CPP14Parser.UnaryexpressionContext ctx) {
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
					case 740: {
						expr += it.visit
					}
					case 742: {
						expr += it.visit
					}
					case 743: {
						operator += it.visit
					}
					case 744: {
						expr += it.visit
					}
					case 747: {
						expr += it.visit
					}
					case 750: {
						expr += it.visit
					}
					case 755: {
						expr += it.visit
					}
					case 765: {
						expr += it.visit
					}
					case 768: {
						ret += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.PlusPlus: {
						operator += it.visit.flatten
					}
					case CPP14Parser.MinusMinus: {
						operator += it.visit.flatten
					}
					case CPP14Parser.Sizeof: {
						operator += it.visit.flatten
					}
					case CPP14Parser.Identifier: {
						expr += it.visit.flatten
					}
					case CPP14Parser.Alignof: {
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

	override public visitTypeidlapper(CPP14Parser.TypeidlapperContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val name = newArrayList
		map.put("name", name)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 771: {
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
		map.castTo(UniIdent)
	}

	override public visitCastexpression(CPP14Parser.CastexpressionContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		val type = newArrayList
		map.put("type", type)
		val value = newArrayList
		map.put("value", value)
		val operator = newArrayList
		map.put("operator", operator)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 862: {
						ret += it.visit
					}
					case 864: {
						type += it.visit
					}
					case 866: {
						value += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.RightParen: {
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
		map.castTo(UniCast)
	}

	override public visitPmexpression(CPP14Parser.PmexpressionContext ctx) {
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
					case 871: {
						ret += it.visit
					}
					case 66: {
						left += it.visit
					}
					case 875: {
						right += it.visit
					}
					case 878: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.DotStar: {
						operator += it.visit.flatten
					}
					case CPP14Parser.ArrowStar: {
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

	override public visitMultiplicativeexpression(CPP14Parser.MultiplicativeexpressionContext ctx) {
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
					case 885: {
						ret += it.visit
					}
					case 68: {
						left += it.visit
					}
					case 889: {
						right += it.visit
					}
					case 892: {
						right += it.visit
					}
					case 895: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.Star: {
						operator += it.visit.flatten
					}
					case CPP14Parser.Div: {
						operator += it.visit.flatten
					}
					case CPP14Parser.Mod: {
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

	override public visitAdditiveexpression(CPP14Parser.AdditiveexpressionContext ctx) {
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
					case 902: {
						ret += it.visit
					}
					case 70: {
						left += it.visit
					}
					case 906: {
						right += it.visit
					}
					case 909: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.Plus: {
						operator += it.visit.flatten
					}
					case CPP14Parser.Minus: {
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

	override public visitShiftexpression(CPP14Parser.ShiftexpressionContext ctx) {
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
					case 916: {
						ret += it.visit
					}
					case 72: {
						left += it.visit
					}
					case 920: {
						right += it.visit
					}
					case 922: {
						operator += it.visit
					}
					case 923: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.LeftShift: {
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

	override public visitRelationalexpression(CPP14Parser.RelationalexpressionContext ctx) {
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
					case 931: {
						ret += it.visit
					}
					case 74: {
						left += it.visit
					}
					case 935: {
						right += it.visit
					}
					case 938: {
						right += it.visit
					}
					case 941: {
						right += it.visit
					}
					case 944: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.Less: {
						operator += it.visit.flatten
					}
					case CPP14Parser.Greater: {
						operator += it.visit.flatten
					}
					case CPP14Parser.LessEqual: {
						operator += it.visit.flatten
					}
					case CPP14Parser.GreaterEqual: {
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

	override public visitEqualityexpression(CPP14Parser.EqualityexpressionContext ctx) {
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
					case 951: {
						ret += it.visit
					}
					case 76: {
						left += it.visit
					}
					case 955: {
						right += it.visit
					}
					case 958: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.Equal: {
						operator += it.visit.flatten
					}
					case CPP14Parser.NotEqual: {
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

	override public visitAndexpression(CPP14Parser.AndexpressionContext ctx) {
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
					case 965: {
						ret += it.visit
					}
					case 78: {
						left += it.visit
					}
					case 969: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.And: {
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

	override public visitExclusiveorexpression(CPP14Parser.ExclusiveorexpressionContext ctx) {
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
					case 976: {
						ret += it.visit
					}
					case 80: {
						left += it.visit
					}
					case 980: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.Caret: {
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

	override public visitInclusiveorexpression(CPP14Parser.InclusiveorexpressionContext ctx) {
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
					case 987: {
						ret += it.visit
					}
					case 82: {
						left += it.visit
					}
					case 991: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.Or: {
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

	override public visitLogicalandexpression(CPP14Parser.LogicalandexpressionContext ctx) {
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
					case 998: {
						ret += it.visit
					}
					case 84: {
						left += it.visit
					}
					case 1002: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.AndAnd: {
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

	override public visitLogicalorexpression(CPP14Parser.LogicalorexpressionContext ctx) {
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
					case 1009: {
						ret += it.visit
					}
					case 86: {
						left += it.visit
					}
					case 1013: {
						right += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.OrOr: {
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

	override public visitConditionalexpression(CPP14Parser.ConditionalexpressionContext ctx) {
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
					case 1019: {
						ret += it.visit
					}
					case 1020: {
						cond += it.visit
					}
					case 1024: {
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

	override public visitAssignmentexpression(CPP14Parser.AssignmentexpressionContext ctx) {
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
					case 1028: {
						ret += it.visit
					}
					case 1029: {
						left += it.visit
					}
					case 1030: {
						operator += it.visit
					}
					case 1031: {
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
		if (!ret.isEmpty) {
			return ret
		}
		map.castTo(UniBinOp)
	}

	override public visitExpressionstatement(CPP14Parser.ExpressionstatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1137: {
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

	override public visitCompoundstatement(CPP14Parser.CompoundstatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val body = newArrayList
		map.put("body", body)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1143: {
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

	override public visitStatementseq(CPP14Parser.StatementseqContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1148: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
								add += it.visit
						}
						case 1149: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
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

	override public visitSelectionstatement(CPP14Parser.SelectionstatementContext ctx) {
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
					case 1157: {
						cond += it.visit
					}
					case 1159: {
						trueStatement += it.visit
					}
					case 1163: {
						cond += it.visit
					}
					case 1165: {
						trueStatement += it.visit
					}
					case 1167: {
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

	override public visitWhilestatement(CPP14Parser.WhilestatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val cond = newArrayList
		map.put("cond", cond)
		val statement = newArrayList
		map.put("statement", statement)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1197: {
						cond += it.visit
					}
					case 1199: {
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
		map.castTo(UniWhile)
	}

	override public visitDowhilestatement(CPP14Parser.DowhilestatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val statement = newArrayList
		map.put("statement", statement)
		val cond = newArrayList
		map.put("cond", cond)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1202: {
						statement += it.visit
					}
					case 1205: {
						cond += it.visit
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
		map.castTo(UniDoWhile)
	}

	override public visitIterationstatement(CPP14Parser.IterationstatementContext ctx) {
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
					case 1211: {
						init += it.visit
					}
					case 1212: {
						cond += it.visit
					}
					case 1216: {
						step += it.visit
					}
					case 1220: {
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

	override public visitEnhancedForStatement(CPP14Parser.EnhancedForStatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val container = newArrayList
		map.put("container", container)
		val statement = newArrayList
		map.put("statement", statement)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1224: {
						merge += it.visit
					}
					case 1226: {
						container += it.visit
					}
					case 1228: {
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

	override public visitBreakStatement(CPP14Parser.BreakStatementContext ctx) {
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
		map.castTo(UniBreak)
	}

	override public visitContinueStatement(CPP14Parser.ContinueStatementContext ctx) {
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
		map.castTo(UniContinue)
	}

	override public visitReturnStatement(CPP14Parser.ReturnStatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val value = newArrayList
		map.put("value", value)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1256: {
						value += it.visit
					}
					case 1261: {
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

	override public visitMyclassbody(CPP14Parser.MyclassbodyContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1280: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
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

	override public visitMyclassspecifier(CPP14Parser.MyclassspecifierContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val members = newArrayList
		map.put("members", members)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1283: {
						merge += it.visit
					}
					case 1285: {
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

	override public visitMyclasshead(CPP14Parser.MyclassheadContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val className = newArrayList
		map.put("className", className)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1296: {
						className += it.visit
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

	override public visitVariabledeclarationstatement(CPP14Parser.VariabledeclarationstatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1347: {
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

	override public visitVariabledeclaration(CPP14Parser.VariabledeclarationContext ctx) {
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
						case 1353: {
							modifiers += it.visit
						}
						case 1356: {
							type += it.visit
						}
						case 1357: {
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

	override public visitVariableDeclaratorList(CPP14Parser.VariableDeclaratorListContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1361: {
						add += it.visit
					}
					case 1363: {
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

	override public visitVariableDeclarator(CPP14Parser.VariableDeclaratorContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val name = newArrayList
		map.put("name", name)
		val value = newArrayList
		map.put("value", value)
		val arrayLength = newArrayList
		map.put("arrayLength", arrayLength)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1371: {
						name += it.visit
					}
					case 1377: {
						name += it.visit
					}
					case 1379: {
						arrayLength += it.visit
					}
					case 1389: {
						value += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.LeftBracket: {
						name += it.visit.flatten
					}
					case CPP14Parser.RightBracket: {
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

	override public visitDims(CPP14Parser.DimsContext ctx) {
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

	override public visitTrailingtypespecifier(CPP14Parser.TrailingtypespecifierContext ctx) {
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

	override public visitInitdeclaratorlist(CPP14Parser.InitdeclaratorlistContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1842: {
						add += it.visit
					}
					case 1844: {
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

	override public visitDeclaratorid(CPP14Parser.DeclaratoridContext ctx) {
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

	override public visitParameterdeclarationclause(CPP14Parser.ParameterdeclarationclauseContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 2032: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
								add += it.visit
						}
						case 2038: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
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

	override public visitParameterdeclarationlist(CPP14Parser.ParameterdeclarationlistContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 2045: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
								add += it.visit
						}
						case 310: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
								add += it.visit
						}
						case 2049: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
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

	override public visitParameterdeclaration(CPP14Parser.ParameterdeclarationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val type = newArrayList
		map.put("type", type)
		val name = newArrayList
		map.put("name", name)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2058: {
						type += it.visit
					}
					case 2059: {
						name += it.visit
					}
					case 2064: {
						type += it.visit
					}
					case 2065: {
						name += it.visit
					}
					case 2072: {
						type += it.visit
					}
					case 2073: {
						name += it.visit
					}
					case 2079: {
						type += it.visit
					}
					case 2080: {
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

	override public visitFunctiondefinition(CPP14Parser.FunctiondefinitionContext ctx) {
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
					case 2091: {
						modifiers += it.visit
					}
					case 2094: {
						merge += it.visit
					}
					case 2098: {
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

	override public visitFunctionheader(CPP14Parser.FunctionheaderContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val returnType = newArrayList
		map.put("returnType", returnType)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2100: {
						returnType += it.visit
					}
					case 2103: {
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

	override public visitFunctiondeclarator(CPP14Parser.FunctiondeclaratorContext ctx) {
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
					case 2105: {
						methodName += it.visit
					}
					case 2107: {
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

	override public visitFunctionbody(CPP14Parser.FunctionbodyContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2113: {
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

	override public visitInitializerlist(CPP14Parser.InitializerlistContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 2139: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
								add += it.visit
						}
						case 2141: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
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

	override public visitBracedinitlist(CPP14Parser.BracedinitlistContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val items = newArrayList
		map.put("items", items)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2148: {
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

	override public visitMyclassname(CPP14Parser.MyclassnameContext ctx) {
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

	override public visitClassspecifier(CPP14Parser.ClassspecifierContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val members = newArrayList
		map.put("members", members)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1283: {
						merge += it.visit
					}
					case 1285: {
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

	override public visitClassbody(CPP14Parser.ClassbodyContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1280: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
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

	override public visitClasshead(CPP14Parser.ClassheadContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val className = newArrayList
		map.put("className", className)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1296: {
						className += it.visit
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

	override public visitMemberspecification(CPP14Parser.MemberspecificationContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 2203: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
								add += it.visit
						}
						case 2204: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
								add += it.visit
						}
						case 2207: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
								add += it.visit
						}
						case 2209: {
							val results = it.visit.flatten
							if(results instanceof ArrayList<?>){
								for (result: results)
									add += result
							}
							else
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

	override public visitMembervariabledeclarationstatement(CPP14Parser.MembervariabledeclarationstatementContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val ret = newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 2223: {
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
		map.castToList(UniFieldDec)
	}

	override public visitMembervariabledeclaration(CPP14Parser.MembervariabledeclarationContext ctx) {
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
						case 2229: {
							modifiers += it.visit
						}
						case 2232: {
							type += it.visit
						}
						case 2233: {
							type += it.visit
						}
						case 2239: {
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

	override public visitMemberdeclaratorlist(CPP14Parser.MemberdeclaratorlistContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val add = newArrayList
		map.put("add", add)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2243: {
						add += it.visit
					}
					case 354: {
						add += it.visit
					}
					case 2247: {
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

	override public visitMemberdeclarator(CPP14Parser.MemberdeclaratorContext ctx) {
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		val name = newArrayList
		map.put("name", name)
		val modifiers = newArrayList
		map.put("modifiers", modifiers)
		val value = newArrayList
		map.put("value", value)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2253: {
						name += it.visit
					}
					case 2254: {
						modifiers += it.visit
					}
					case 2260: {
						name += it.visit
					}
					case 2262: {
						value += it.visit
					}
					case 2265: {
						name += it.visit
					}
					case 2266: {
						value += it.visit
					}
					case 2276: {
						value += it.visit
					}
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case CPP14Parser.Identifier: {
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

	override public visitIntegerliteral(CPP14Parser.IntegerliteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == CPP14Parser.Integerliteral) {
					return true
				}
			}
			return false
		].visit as String
		return new UniIntLiteral(Integer.parseInt(text))
	}

	override public visitCharacterliteral(CPP14Parser.CharacterliteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == CPP14Parser.Characterliteral) {
					return true
				}
			}
			return false
		].visit as String
		return new UniCharacterLiteral(text.substring(1, text.length - 1).charAt(0))
	}

	override public visitFloatingliteral(CPP14Parser.FloatingliteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == CPP14Parser.Floatingliteral) {
					return true
				}
			}
			return false
		].visit as String
		return new UniDoubleLiteral(Double.parseDouble(text))
	}

	override public visitStringliteral(CPP14Parser.StringliteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == CPP14Parser.Stringliteral) {
					return true
				}
			}
			return false
		].visit as String
		return new UniStringLiteral(text.substring(1, text.length - 1))
	}

	override public visitBooleanliteral(CPP14Parser.BooleanliteralContext ctx) {
		val text = ctx.children.findFirst [
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == CPP14Parser.Booleanliteral) {
					return true
				}
			}
			return false
		].visit as String
		return new UniBoolLiteral(Boolean.parseBoolean(text))
	}

}
