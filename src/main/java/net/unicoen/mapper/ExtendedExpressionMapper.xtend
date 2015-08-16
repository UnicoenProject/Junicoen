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
import net.unicoen.parser.ExtendedExpressionLexer
import net.unicoen.parser.ExtendedExpressionParser
import net.unicoen.parser.ExtendedExpressionBaseVisitor
import net.unicoen.node.*

class ExtendedExpressionMapper extends ExtendedExpressionBaseVisitor<Object> {
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
		val lexer = new ExtendedExpressionLexer(chars)
		val tokens = new CommonTokenStream(lexer)
		val parser = new ExtendedExpressionParser(tokens)
		val tree = parser.program

		tree.visit
	}

	override public visitChildren(RuleNode node) {
		val n = node.childCount;
		(0 ..< n).fold(defaultResult) [ acc, i |
			if (!node.shouldVisitNextChild(acc)) {
				acc
			} else {
				val c = node.getChild(i)
				val childResult = c.visit
				acc.aggregateResult(childResult)
			}
		]
	}

	override public visit(ParseTree tree) {
		if (_isDebugMode) {
			if (!(tree instanceof ParserRuleContext)) {
				return visitTerminal(tree as TerminalNode)
			}
			val ruleName = ExtendedExpressionParser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
			println("*** visit" + ruleName + " ***")
			println(tree.text)
			val ret = tree.accept(this)
			println("returned: " + ret)
			ret
		} else {
			tree.accept(this)
		}
	}

	override public visitProgram(ExtendedExpressionParser.ProgramContext ctx) {
		val bind = new UniClassDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
					case 60: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit as java.util.List<java.lang.String>
						} else {
							bind.modifiers += it.visit as java.util.List<java.lang.String>
						}
					}
					case 62: {
						bind.className = it.visit as java.lang.String
					}
				}
			}
		]
		bind
	}

	override public visitClassModifiers(ExtendedExpressionParser.ClassModifiersContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch (it as RuleContext).invokingState {
						case 73: {
							list += it.visit as String
						}
						case 76: {
							list += it.visit as String
						}
						case 79: {
							list += it.visit as String
						}
					}
				}
			]
		}
		list
	}

	override public visitClassVisibility(ExtendedExpressionParser.ClassVisibilityContext ctx) {
		ctx.text
	}

	override public visitAbs(ExtendedExpressionParser.AbsContext ctx) {
		ctx.text
	}

	override public visitStat(ExtendedExpressionParser.StatContext ctx) {
		ctx.text
	}

	override public visitName(ExtendedExpressionParser.NameContext ctx) {
		ctx.text
	}

}
