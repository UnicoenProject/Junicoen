package net.unicoen.mapper

import java.io.FileInputStream
import java.util.ArrayList
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.RuleContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode
import net.unicoen.parser.Java8Lexer
import net.unicoen.parser.Java8Parser
import net.unicoen.parser.Java8BaseVisitor
import net.unicoen.node.*

class Java8Mapper extends Java8BaseVisitor<Object> {
	var _isDebugMode = false

	new(boolean isDebugMode) {
		_isDebugMode = isDebugMode
	}

	def parseFile(String path) {
		val inputStream = new FileInputStream(path)
		try {
			parseCore(new ANTLRInputStream(inputStream))
		} finally {
			inputStream.close
		}
	}

	def parse(String code) {
		parseCore(new ANTLRInputStream(code))
	}

	def parseCore(CharStream chars) {
		val lexer = new Java8Lexer(chars)
		val tokens = new CommonTokenStream(lexer)
		val parser = new Java8Parser(tokens)
		val tree = parser.compilationUnit
		tree.visit
	}

	override public visitChildren(RuleNode node) {
		val n = node.childCount;
		(0 ..< n).fold(defaultResult) [ acc, i |
			if (!node.shouldVisitNextChild(acc)) {
				acc
			} else {
				val c = node.getChild(i);
				val childResult = c.visit;
				acc.aggregateResult(childResult);
			}
		]
	}

	override public visit(ParseTree tree) {
		if (_isDebugMode) {
			if (!(tree instanceof ParserRuleContext)) {
				return visitTerminal(tree as TerminalNode)
			}
			val ruleName = Java8Parser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
			println("*** visit" + ruleName + " ***")
			println(tree.text)
			val ret = tree.accept(this)
			println("returned: " + ret)
			ret
		} else {
			tree.accept(this)
		}
	}

	override public visitDims(Java8Parser.DimsContext ctx) {
		ctx.text
	}

	override public visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		val ret = new UniClassDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
					case 71: {
						if (ret.modifiers == null) {
							ret.modifiers = new ArrayList<String>
						}
						ret.modifiers += it.visit as java.util.List<java.lang.String>
					}
					case 72:
						ret.className = it.visit as java.lang.String
					case 76: {
						if (ret.members == null) {
							ret.members = it.visit as java.util.List<net.unicoen.node.UniMemberDec>
						} else {
							ret.members += it.visit as java.util.List<net.unicoen.node.UniMemberDec>
						}
					}
				}
			}
		]
		ret
	}

	override public visitClassName(Java8Parser.ClassNameContext ctx) {
		ctx.text
	}

	override public visitClassModifier(Java8Parser.ClassModifierContext ctx) {
		ctx.text
	}

	override public visitClassBody(Java8Parser.ClassBodyContext ctx) {
		val list = new ArrayList<UniMemberDec>
		if (ctx.children != null) {
			ctx.children.forEach [
				list += it.visit as UniMemberDec
			]
		}
		list
	}

	override public visitFieldDeclaration(Java8Parser.FieldDeclarationContext ctx) {
		val list = new ArrayList<UniFieldDec>
		if (ctx.children != null) {
			ctx.children.forEach [
				list += it.visit as UniFieldDec
			]
		}
		list
	}

	override public visitFieldModifier(Java8Parser.FieldModifierContext ctx) {
		ctx.text
	}

	override public visitVariableDeclaratorList(Java8Parser.VariableDeclaratorListContext ctx) {
		val list = new ArrayList<UniFieldDec>
		if (ctx.children != null) {
			ctx.children.forEach [
				list += it.visit as UniFieldDec
			]
		}
		list
	}

	override public visitVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx) {
		val ret = new UniFieldDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
				case 159: {
					val child = it.visit as UniFieldDec
					ret.merge(child)
				}
					case 160:
						ret.value = it.visit as net.unicoen.node.UniExpr
				}
			}
		]
		ret
	}

	override public visitVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx) {
		val ret = new UniFieldDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
					case 161:
						ret.type = it.visit as java.lang.String
				}
			}
		]
		ret
	}

	override public visitUnannType(Java8Parser.UnannTypeContext ctx) {
		ctx.text
	}

}
