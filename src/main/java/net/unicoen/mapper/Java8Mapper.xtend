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

class Java8Mapper extends Java8BaseVisitor<Object> {

	val boolean _isDebugMode
	val List<Comment> _comments = new ArrayList<Comment>
	var CommonTokenStream _stream
	var UniNode _lastNode
	var int _nextTokenIndex

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
		_comments.clear
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
		MapperUtility.flatten(obj)
	}

	public def <T> List<T> castToList(Object obj, Class<T> clazz) {
		MapperUtility.castToList(obj, clazz)
	}

	public def <T> T castTo(Object obj, Class<T> clazz) {
		MapperUtility.castTo(obj, clazz)
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
		map.put("none", newArrayList)
		val ret = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 536: {
						ret += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.BOOLEAN: {
						ret += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 580: {
						map.get("add") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						map.get("add") += it.visit.flatten
					}
					case Java8Parser.DOT: {
						map.get("add") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitTypeVariable(Java8Parser.TypeVariableContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		val ret = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						ret += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.RBRACK: {
						map.get("add") += it.visit.flatten
					}
					case Java8Parser.LBRACK: {
						map.get("add") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitTypeName(Java8Parser.TypeNameContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("receiver", newArrayList)
		val ret = newArrayList
		map.put("fieldName", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 731: {
						map.get("receiver") += it.visit
					}
					case 732: {
						ret += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						map.get("fieldName") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("receiver", newArrayList)
		val ret = newArrayList
		map.put("fieldName", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 739: {
						map.get("receiver") += it.visit
					}
					case 68: {
						ret += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						map.get("fieldName") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val ret = newArrayList
		map.put("receiver", newArrayList)
		map.put("fieldName", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 749: {
						ret += it.visit
					}
					case 750: {
						map.get("receiver") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						map.get("fieldName") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("receiver", newArrayList)
		val ret = newArrayList
		map.put("fieldName", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 757: {
						map.get("receiver") += it.visit
					}
					case 72: {
						ret += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						map.get("fieldName") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("name", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						map.get("name") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniIdent)
	}

	override public visitTypeDeclaration(Java8Parser.TypeDeclarationContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		val ret = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 833: {
						ret += it.visit
					}
					case 834: {
						ret += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		if (!ret.isEmpty) {
			return ret
		}
		map
	}

	override public visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 838: {
						merge += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("interfaces", newArrayList)
		map.put("className", newArrayList)
		map.put("modifiers", newArrayList)
		map.put("superClass", newArrayList)
		map.put("members", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 842: {
						map.get("members") += it.visit
					}
					case 844: {
						map.get("modifiers") += it.visit
					}
					case 848: {
						map.get("interfaces") += it.visit
					}
					case 851: {
						map.get("className") += it.visit
					}
					case 854: {
						map.get("superClass") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniClassDec)
	}

	override public visitClassName(Java8Parser.ClassNameContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitClassModifiers(Java8Parser.ClassModifiersContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 858: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitClassModifier(Java8Parser.ClassModifierContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitSuperclass(Java8Parser.SuperclassContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 887: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitSuperinterfaces(Java8Parser.SuperinterfacesContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 890: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitInterfaceTypeList(Java8Parser.InterfaceTypeListContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 892: {
							map.get("add") += it.visit
						}
						case 894: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitClassBody(Java8Parser.ClassBodyContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 901: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}

	override public visitClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 909: {
							map.get("add") += it.visit
						}
						case 912: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}

	override public visitClassMemberDeclaration(Java8Parser.ClassMemberDeclarationContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 915: {
							map.get("add") += it.visit
						}
						case 916: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}

	override public visitFieldDeclaration(Java8Parser.FieldDeclarationContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("modifiers", newArrayList)
		map.put("type", newArrayList)
		val merge = newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 922: {
							map.get("modifiers") += it.visit
						}
						case 923: {
							merge += it.visit
						}
						case 924: {
							map.get("type") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 927: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitFieldModifier(Java8Parser.FieldModifierContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitVariableDeclaratorList(Java8Parser.VariableDeclaratorListContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 943: {
						map.get("add") += it.visit
					}
					case 945: {
						map.get("add") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map
	}

	override public visitVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("value", newArrayList)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 951: {
						map.get("value") += it.visit
					}
					case 953: {
						merge += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("name", newArrayList)
		map.put("type", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 957: {
						map.get("type") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						map.get("name") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map
	}

	override public visitUnannType(Java8Parser.UnannTypeContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("modifiers", newArrayList)
		map.put("block", newArrayList)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1040: {
						map.get("modifiers") += it.visit
					}
					case 1046: {
						merge += it.visit
					}
					case 1047: {
						map.get("block") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("returnType", newArrayList)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1061: {
						merge += it.visit
					}
					case 1062: {
						map.get("returnType") += it.visit
					}
					case 1073: {
						map.get("returnType") += it.visit
					}
					case 1074: {
						merge += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("args", newArrayList)
		map.put("methodName", newArrayList)
		map.put("returnType", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1084: {
						map.get("returnType") += it.visit
					}
					case 1086: {
						map.get("methodName") += it.visit
					}
					case 1090: {
						map.get("args") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniMethodDec)
	}

	override public visitMethodName(Java8Parser.MethodNameContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitFormalParameterList(Java8Parser.FormalParameterListContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1095: {
							map.get("add") += it.visit
						}
						case 1097: {
							map.get("add") += it.visit
						}
						case 1099: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniArg)
	}

	override public visitFormalParameters(Java8Parser.FormalParametersContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1102: {
							map.get("add") += it.visit
						}
						case 1104: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniArg)
	}

	override public visitFormalParameter(Java8Parser.FormalParameterContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("type", newArrayList)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1126: {
						map.get("type") += it.visit
					}
					case 1127: {
						merge += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("name", newArrayList)
		map.put("type", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1129: {
						map.get("name") += it.visit
					}
					case 1130: {
						map.get("type") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniArg)
	}

	override public visitParameterName(Java8Parser.ParameterNameContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitMethodBody(Java8Parser.MethodBodyContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1186: {
						merge += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("modifiers", newArrayList)
		map.put("block", newArrayList)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1195: {
						merge += it.visit
					}
					case 1201: {
						map.get("block") += it.visit
					}
					case 1205: {
						map.get("modifiers") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitConstructorDeclarator(Java8Parser.ConstructorDeclaratorContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("args", newArrayList)
		map.put("methodName", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1216: {
						map.get("args") += it.visit
					}
					case 1218: {
						map.get("methodName") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniMethodDec)
	}

	override public visitSimpleTypeName(Java8Parser.SimpleTypeNameContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitConstructorBody(Java8Parser.ConstructorBodyContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("body", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1229: {
						map.get("body") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniBlock)
	}

	override public visitInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1341: {
						merge += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("className", newArrayList)
		map.put("modifiers", newArrayList)
		map.put("superClass", newArrayList)
		map.put("members", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1345: {
						map.get("className") += it.visit
					}
					case 1347: {
						map.get("members") += it.visit
					}
					case 1351: {
						map.get("modifiers") += it.visit
					}
					case 1354: {
						map.get("superClass") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniClassDec)
	}

	override public visitInterfaceModifiers(Java8Parser.InterfaceModifiersContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1356: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitInterfaceName(Java8Parser.InterfaceNameContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitInterfaceModifier(Java8Parser.InterfaceModifierContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitExtendsInterfaces(Java8Parser.ExtendsInterfacesContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1374: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitInterfaceBody(Java8Parser.InterfaceBodyContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1377: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}

	override public visitInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1385: {
							map.get("add") += it.visit
						}
						case 1386: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}

	override public visitConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("modifiers", newArrayList)
		map.put("type", newArrayList)
		val merge = newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1392: {
							map.get("modifiers") += it.visit
						}
						case 1393: {
							map.get("type") += it.visit
						}
						case 1394: {
							merge += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1397: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitConstantModifier(Java8Parser.ConstantModifierContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("modifiers", newArrayList)
		map.put("block", newArrayList)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1409: {
						merge += it.visit
					}
					case 1410: {
						map.get("block") += it.visit
					}
					case 1411: {
						map.get("modifiers") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1413: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitArrayInitializer(Java8Parser.ArrayInitializerContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("items", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1537: {
						map.get("items") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniArray)
	}

	override public visitVariableInitializerList(Java8Parser.VariableInitializerListContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1545: {
							map.get("add") += it.visit
						}
						case 1547: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniExpr)
	}

	override public visitBlock(Java8Parser.BlockContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("body", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1554: {
						map.get("body") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniBlock)
	}

	override public visitBlockStatements(Java8Parser.BlockStatementsContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1559: {
							map.get("add") += it.visit
						}
						case 1560: {
							map.get("add") += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniExpr)
	}

	override public visitLocalVariableDeclarationStatement(Java8Parser.LocalVariableDeclarationStatementContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		val ret = newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1571: {
							ret += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("type", newArrayList)
		map.put("modifiers", newArrayList)
		val merge = newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1574: {
							map.get("type") += it.visit
						}
						case 1580: {
							map.get("modifiers") += it.visit
						}
						case 1581: {
							merge += it.visit
						}
						default: {
							map.get("none") += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						default: {
							map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val ret = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1622: {
						ret += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("cond", newArrayList)
		map.put("trueStatement", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1636: {
						map.get("cond") += it.visit
					}
					case 1638: {
						map.get("trueStatement") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniIf)
	}

	override public visitIfThenElseStatement(Java8Parser.IfThenElseStatementContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("cond", newArrayList)
		map.put("falseStatement", newArrayList)
		map.put("trueStatement", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1642: {
						map.get("cond") += it.visit
					}
					case 1644: {
						map.get("trueStatement") += it.visit
					}
					case 1646: {
						map.get("falseStatement") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniIf)
	}

	override public visitBasicForStatement(Java8Parser.BasicForStatementContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("statement", newArrayList)
		map.put("init", newArrayList)
		map.put("step", newArrayList)
		map.put("cond", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1743: {
						map.get("init") += it.visit
					}
					case 1747: {
						map.get("statement") += it.visit
					}
					case 1751: {
						map.get("cond") += it.visit
					}
					case 1755: {
						map.get("step") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniFor)
	}

	override public visitEnhancedForStatement(Java8Parser.EnhancedForStatementContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("statement", newArrayList)
		map.put("container", newArrayList)
		map.put("modifiers", newArrayList)
		map.put("type", newArrayList)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1789: {
						map.get("modifiers") += it.visit
					}
					case 1795: {
						map.get("statement") += it.visit
					}
					case 1796: {
						map.get("type") += it.visit
					}
					case 1798: {
						merge += it.visit
					}
					case 1800: {
						map.get("container") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("value", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1830: {
						map.get("value") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniReturn)
	}

	override public visitPrimary(Java8Parser.PrimaryContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1927: {
						map.get("add") += it.visit.flatten
					}
					case 1928: {
						map.get("add") += it.visit.flatten
					}
					case 1931: {
						map.get("add") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		var node = map.get("add").get(0) as UniExpr
		map.get("add").remove(node)
		for (Object obj : map.get("add")) {
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
		map.put("none", newArrayList)
		val ret = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2015: {
						ret += it.visit
					}
					case 2051: {
						ret += it.visit
					}
					case 2053: {
						ret += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("type", newArrayList)
		map.put("args", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2232: {
						map.get("type") += it.visit
					}
					case 2236: {
						map.get("args") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.DOT: {
						map.get("type") += it.visit.flatten
					}
					case Java8Parser.Identifier: {
						map.get("type") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniNew)
	}

	override public visitMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("args", newArrayList)
		map.put("receiver", newArrayList)
		map.put("methodName", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2362: {
						map.get("args") += it.visit
					}
					case 2364: {
						map.get("args") += it.visit
					}
					case 2369: {
						map.get("receiver") += it.visit
					}
					case 2376: {
						map.get("receiver") += it.visit
					}
					case 2381: {
						map.get("args") += it.visit
					}
					case 2388: {
						map.get("methodName") += it.visit
					}
					case 2393: {
						map.get("args") += it.visit
					}
					case 2400: {
						map.get("args") += it.visit
					}
					case 2412: {
						map.get("args") += it.visit
					}
					case 2425: {
						map.get("receiver") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						map.get("methodName") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniMethodCall)
	}

	override public visitMethodInvocation_lf_primary(Java8Parser.MethodInvocation_lf_primaryContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("args", newArrayList)
		map.put("methodName", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2438: {
						map.get("args") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						map.get("methodName") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniMethodCall)
	}

	override public visitMethodInvocation_lfno_primary(Java8Parser.MethodInvocation_lfno_primaryContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("args", newArrayList)
		map.put("receiver", newArrayList)
		map.put("methodName", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2443: {
						map.get("args") += it.visit
					}
					case 2445: {
						map.get("methodName") += it.visit
					}
					case 2450: {
						map.get("receiver") += it.visit
					}
					case 2457: {
						map.get("args") += it.visit
					}
					case 2462: {
						map.get("args") += it.visit
					}
					case 2469: {
						map.get("receiver") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.Identifier: {
						map.get("methodName") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniMethodCall)
	}

	override public visitArgumentList(Java8Parser.ArgumentListContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("add", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2501: {
						map.get("add") += it.visit
					}
					case 2503: {
						map.get("add") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map
	}

	override public visitArrayCreationExpression(Java8Parser.ArrayCreationExpressionContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("type", newArrayList)
		map.put("value", newArrayList)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2607: {
						map.get("type") += it.visit
					}
					case 2608: {
						map.get("value") += it.visit
					}
					case 2609: {
						merge += it.visit
					}
					case 2613: {
						map.get("type") += it.visit
					}
					case 2614: {
						map.get("type") += it.visit
					}
					case 2615: {
						map.get("type") += it.visit
					}
					case 2619: {
						map.get("type") += it.visit
					}
					case 2620: {
						merge += it.visit
					}
					case 2621: {
						map.get("type") += it.visit
					}
					case 2624: {
						map.get("type") += it.visit
					}
					case 2625: {
						map.get("value") += it.visit
					}
					case 2626: {
						map.get("type") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val merge = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2630: {
						merge += it.visit
					}
					case 2631: {
						merge += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("elementsNum", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2644: {
						map.get("elementsNum") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniNewArray)
	}

	override public visitAssignment(Java8Parser.AssignmentContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("left", newArrayList)
		map.put("operator", newArrayList)
		map.put("right", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2685: {
						map.get("operator") += it.visit
					}
					case 2686: {
						map.get("left") += it.visit
					}
					case 2687: {
						map.get("right") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniBinOp)
	}

	override public visitAssignmentOperator(Java8Parser.AssignmentOperatorContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(String)
	}

	override public visitConditionalExpression(Java8Parser.ConditionalExpressionContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		val ret = newArrayList
		map.put("falseExpr", newArrayList)
		map.put("cond", newArrayList)
		map.put("trueExpr", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2696: {
						map.get("falseExpr") += it.visit
					}
					case 2697: {
						ret += it.visit
					}
					case 2699: {
						map.get("trueExpr") += it.visit
					}
					case 2701: {
						map.get("cond") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val ret = newArrayList
		map.put("right", newArrayList)
		map.put("left", newArrayList)
		map.put("operator", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2706: {
						ret += it.visit
					}
					case 466: {
						map.get("left") += it.visit
					}
					case 2710: {
						map.get("right") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.OR: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val ret = newArrayList
		map.put("right", newArrayList)
		map.put("left", newArrayList)
		map.put("operator", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2717: {
						ret += it.visit
					}
					case 468: {
						map.get("left") += it.visit
					}
					case 2721: {
						map.get("right") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.AND: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val ret = newArrayList
		map.put("right", newArrayList)
		map.put("left", newArrayList)
		map.put("operator", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2728: {
						map.get("right") += it.visit
					}
					case 470: {
						ret += it.visit
					}
					case 2732: {
						map.get("left") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.BITOR: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val ret = newArrayList
		map.put("right", newArrayList)
		map.put("left", newArrayList)
		map.put("operator", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2739: {
						map.get("right") += it.visit
					}
					case 472: {
						ret += it.visit
					}
					case 2743: {
						map.get("left") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.CARET: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val ret = newArrayList
		map.put("right", newArrayList)
		map.put("left", newArrayList)
		map.put("operator", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2750: {
						ret += it.visit
					}
					case 474: {
						map.get("right") += it.visit
					}
					case 2754: {
						map.get("left") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.BITAND: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val ret = newArrayList
		map.put("right", newArrayList)
		map.put("left", newArrayList)
		map.put("operator", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2761: {
						map.get("left") += it.visit
					}
					case 476: {
						map.get("left") += it.visit
					}
					case 2765: {
						map.get("right") += it.visit
					}
					case 2768: {
						ret += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.NOTEQUAL: {
						map.get("operator") += it.visit.flatten
					}
					case Java8Parser.EQUAL: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val ret = newArrayList
		map.put("right", newArrayList)
		map.put("left", newArrayList)
		map.put("operator", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2775: {
						map.get("left") += it.visit
					}
					case 478: {
						map.get("right") += it.visit
					}
					case 2779: {
						map.get("left") += it.visit
					}
					case 2782: {
						map.get("right") += it.visit
					}
					case 2785: {
						map.get("right") += it.visit
					}
					case 2788: {
						map.get("left") += it.visit
					}
					case 2791: {
						map.get("right") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.LT: {
						map.get("operator") += it.visit.flatten
					}
					case Java8Parser.GT: {
						map.get("operator") += it.visit.flatten
					}
					case Java8Parser.LE: {
						map.get("operator") += it.visit.flatten
					}
					case Java8Parser.INSTANCEOF: {
						map.get("operator") += it.visit.flatten
					}
					case Java8Parser.GE: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val ret = newArrayList
		map.put("right", newArrayList)
		map.put("left", newArrayList)
		map.put("operator", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2798: {
						map.get("left") += it.visit
					}
					case 480: {
						map.get("right") += it.visit
					}
					case 2803: {
						map.get("right") += it.visit
					}
					case 2807: {
						map.get("left") += it.visit
					}
					case 2812: {
						map.get("right") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.GT: {
						map.get("operator") += it.visit.flatten
					}
					case Java8Parser.LT: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val ret = newArrayList
		map.put("right", newArrayList)
		map.put("left", newArrayList)
		map.put("operator", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2819: {
						ret += it.visit
					}
					case 482: {
						map.get("right") += it.visit
					}
					case 2823: {
						map.get("left") += it.visit
					}
					case 2826: {
						map.get("left") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.SUB: {
						map.get("operator") += it.visit.flatten
					}
					case Java8Parser.ADD: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val ret = newArrayList
		map.put("right", newArrayList)
		map.put("left", newArrayList)
		map.put("operator", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2833: {
						ret += it.visit
					}
					case 484: {
						map.get("right") += it.visit
					}
					case 2837: {
						map.get("left") += it.visit
					}
					case 2840: {
						map.get("right") += it.visit
					}
					case 2843: {
						map.get("left") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.MOD: {
						map.get("operator") += it.visit.flatten
					}
					case Java8Parser.MUL: {
						map.get("operator") += it.visit.flatten
					}
					case Java8Parser.DIV: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val ret = newArrayList
		map.put("operator", newArrayList)
		map.put("expr", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2849: {
						ret += it.visit
					}
					case 2850: {
						ret += it.visit
					}
					case 2852: {
						ret += it.visit
					}
					case 2854: {
						map.get("expr") += it.visit
					}
					case 2855: {
						map.get("expr") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.ADD: {
						map.get("operator") += it.visit.flatten
					}
					case Java8Parser.SUB: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("operator", newArrayList)
		map.put("expr", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2859: {
						map.get("expr") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.INC: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniUnaryOp)
	}

	override public visitPreDecrementExpression(Java8Parser.PreDecrementExpressionContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		map.put("operator", newArrayList)
		map.put("expr", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2862: {
						map.get("expr") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.DEC: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniUnaryOp)
	}

	override public visitUnaryExpressionNotPlusMinus(Java8Parser.UnaryExpressionNotPlusMinusContext ctx) {
		val map = newHashMap
		map.put("none", newArrayList)
		val ret = newArrayList
		map.put("expr", newArrayList)
		map.put("operator", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2864: {
						map.get("expr") += it.visit
					}
					case 2866: {
						map.get("expr") += it.visit
					}
					case 2868: {
						ret += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.TILDE: {
						map.get("operator") += it.visit.flatten
					}
					case Java8Parser.BANG: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		val ret = newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2872: {
						ret += it.visit
					}
					case 2873: {
						ret += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					default: {
						map.get("none") += it.visit
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
		map.put("none", newArrayList)
		map.put("operator", newArrayList)
		map.put("expr", newArrayList)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2883: {
						map.get("expr") += it.visit
					}
					default: {
						map.get("none") += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					case Java8Parser.INC: {
						map.get("operator") += it.visit.flatten
					}
					default: {
						map.get("none") += it.visit
					}
				}
			}
		]
		map.castTo(UniUnaryOp)
	}

}
