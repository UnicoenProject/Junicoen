package net.unicoen.mapper

import java.io.FileInputStream
import java.util.ArrayList
import java.util.List
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniMemberDec
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
			println("*** visit" + ruleName + " (" + (tree as ParserRuleContext).invokingState + ") ***")
			println(tree.text)
			val ret = tree.accept(this)
			println("returned: " + ret)
			ret
		} else {
			tree.accept(this)
		}
	}

	override public visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		val bind = new UniClassDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
					case 73: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit as List<String>
						} else {
							bind.modifiers += it.visit as List<String>
						}
					}
					case 74:
						bind.className = it.visit as String
					case 78: {
						val child = it.visit as UniClassDec
						bind.merge(child)
					}
				}
			}
		]
		bind
	}

	override public visitClassName(Java8Parser.ClassNameContext ctx) {
		ctx.text
	}

	override public visitClassModifier(Java8Parser.ClassModifierContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {
//			ctx.children.forEach [
//				switch (it) {
//				}
//
//			]
		}

	}

	override public visitClassBody(Java8Parser.ClassBodyContext ctx) {
		val bind = new UniClassDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
					case 139: {
						if (bind.members == null) {
							bind.members = it.visit as List<UniMemberDec>
						} else {
							bind.members += it.visit as List<UniMemberDec>
						}
					}
				}
			}
		]
		bind
	}

	override public visitClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
		val list = new ArrayList<UniMemberDec>
		if (ctx.children != null) {
//			ctx.children.forEach [
//				switch (it) {
//				}
//
//			]
		}

	}
}
