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
import com.google.common.collect.Lists
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniMethodDec
import net.unicoen.node.UniBlock
import net.unicoen.node.UniVariableDecWithValue
import net.unicoen.node.UniIf

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
		val ret = new UniClassDec
		val methods = Lists.newArrayList
		for (child : ctx.children) {
			if (child instanceof ExtendedExpressionParser.NameContext) {
				ret.className = visit(child) as String
			} else if (child instanceof ExtendedExpressionParser.MethodDeclarationContext) {
				methods.add(visit(child) as UniMemberDec)
			}
		}
		ret.members = methods
		ret
	}

	override public visitMethodDeclaration(ExtendedExpressionParser.MethodDeclarationContext ctx) {
		val ret = new UniMethodDec
		ret.returnType = "void"
		for (child : ctx.children) {
			if (child instanceof ExtendedExpressionParser.NameContext) {
				ret.methodName = visit(child) as String
			}
			if (child instanceof ExtendedExpressionParser.MethodBodyContext) {
				ret.block = visit(child) as UniBlock
			}
		}
		ret
	}

	override public visitMethodBody(ExtendedExpressionParser.MethodBodyContext ctx) {
		val ret = Lists.newArrayList
		for (child : ctx.children) {
			if (child instanceof ExtendedExpressionParser.StatementContext) {
				ret.add(visit(child) as UniExpr)
			}
		}
		new UniBlock(ret)
	}

	override public visitName(ExtendedExpressionParser.NameContext ctx) {
		ctx.text
	}

	override public visitVariableDeclaration(ExtendedExpressionParser.VariableDeclarationContext ctx) {
		val ret = new UniVariableDecWithValue
		ret.type = "int"
		for (child : ctx.children) {
			if (child instanceof ExtendedExpressionParser.NameContext) {
				ret.name = visit(child) as String
			}
			if (child instanceof ExtendedExpressionParser.NormalExpContext) {
				ret.value = visit(child) as UniExpr
			}
		}
		ret
	}

	override public visitIfStatement(ExtendedExpressionParser.IfStatementContext ctx) {
		val ret = new UniIf
		for (child : ctx.children) {
			if (child instanceof ExtendedExpressionParser.CompareExpContext) {
				ret.cond = visit(child) as UniExpr
			}
		}
		ret
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
				temp.operator = visit(tree) as String
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

	override public visitCompareOp(ExtendedExpressionParser.CompareOpContext ctx) {
		ctx.text
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
