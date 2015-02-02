package net.unicoen.mapper

import java.io.FileInputStream
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTree
import net.unicoen.parser.ExtendedExpressionLexer
import net.unicoen.parser.ExtendedExpressionParser
import net.unicoen.parser.ExtendedExpressionBaseVisitor
import net.unicoen.node.UniBinOp
import net.unicoen.node.UniExpr
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniDoubleLiteral
import org.antlr.v4.runtime.tree.RuleNode
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniMethodDec
import com.google.common.collect.Lists
import net.unicoen.node.UniBlock
import org.antlr.v4.runtime.tree.TerminalNode

class ExtendedExpressionMapper extends ExtendedExpressionBaseVisitor<Object> {
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
		visit(tree)
	}

	override public visitChildren(RuleNode node) {
		val n = node.getChildCount();
		(0 ..< n).fold(defaultResult()) [ acc, i |
			if (!shouldVisitNextChild(node, acc)) {
				acc
			} else {
				val c = node.getChild(i);
				val childResult = visit(c);
				aggregateResult(acc, childResult);
			}
		]
	}

	override public visit(ParseTree tree) {
		if (!(tree instanceof ParserRuleContext)) {
			throw new RuntimeException("Don't visit terminal nodes!")
		}
		var ruleName = ExtendedExpressionParser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
		println("*** visit" + ruleName + " ***")
		println(tree.text)
		val ret = tree.accept(this)
		println(ret)

		ret
	}

	override public visitProgram(ExtendedExpressionParser.ProgramContext ctx) {
		val stmts = ctx.children.takeWhile [ child |
			if (child instanceof TerminalNode) {
				child.symbol.type != -1
			} else {
				true
			}
		].map [ child |
			visit(child) as UniExpr
		].toList
		val members = Lists.newArrayList(
			new UniMethodDec("main", null, "void", null, new UniBlock(stmts)) as UniMemberDec
		)

		new UniClassDec("", null, members)
	}

	override public visitIfStatement(ExtendedExpressionParser.IfStatementContext ctx) {
		super.visitIfStatement(ctx)
	}

	override public visitCompareExp(ExtendedExpressionParser.CompareExpContext ctx) {
		if (ctx.childCount == 1) {
			return visit(ctx.getChild(0))
		}
		var ret = new UniBinOp
		for (tree : ctx.children) {
			if (tree instanceof ExtendedExpressionParser.NormalExpContext) {
				ret.right = visit(tree) as UniExpr
			} else if (tree instanceof ExtendedExpressionParser.CompareOpContext) {
				var temp = new UniBinOp
				temp.operator = tree.text
				if (ret.operator == null) {
					temp.left = ret.right
				} else {
					temp.left = ret
				}
				ret = temp
			} else {
				throw new RuntimeException
			}
		}
		ret
	}

	override public visitNormalExp(ExtendedExpressionParser.NormalExpContext ctx) {
		if (ctx.childCount == 1) {
			return visit(ctx.getChild(0))
		}
		var ret = new UniBinOp
		for (tree : ctx.children) {
			if (tree instanceof ExtendedExpressionParser.TermContext) {
				ret.right = visit(tree) as UniExpr
			} else if (tree instanceof ExtendedExpressionParser.AddSubOpContext) {
				var temp = new UniBinOp
				temp.operator = tree.text
				if (ret.operator == null) {
					temp.left = ret.right
				} else {
					temp.left = ret
				}
				ret = temp
			} else {
				throw new RuntimeException
			}
		}
		ret
	}

	override public visitTerm(ExtendedExpressionParser.TermContext ctx) {
		if (ctx.childCount == 1) {
			return visit(ctx.getChild(0))
		}
		var ret = new UniBinOp
		for (tree : ctx.children) {
			if (tree instanceof ExtendedExpressionParser.FactorContext) {
				ret.right = visit(tree) as UniExpr
			} else if (tree instanceof ExtendedExpressionParser.MulDivOpContext) {
				var temp = new UniBinOp
				temp.operator = tree.text
				if (ret.operator == null) {
					temp.left = ret.right
				} else {
					temp.left = ret
				}
				ret = temp
			} else {
				throw new RuntimeException
			}
		}
		ret
	}

	override public visitFactor(ExtendedExpressionParser.FactorContext ctx) {
		for (tree : ctx.children) {
			if (tree instanceof ExtendedExpressionParser.NumberContext) {
				return visit(tree)
			}
			if (tree instanceof ExtendedExpressionParser.NormalExpContext) {
				return visit(tree)
			}
		}
	}

	override public visitInteger(ExtendedExpressionParser.IntegerContext ctx) {
		new UniIntLiteral(Integer.parseInt(ctx.text))
	}

	override public visitDecimal(ExtendedExpressionParser.DecimalContext ctx) {
		new UniDoubleLiteral(Double.parseDouble(ctx.text))
	}

}
