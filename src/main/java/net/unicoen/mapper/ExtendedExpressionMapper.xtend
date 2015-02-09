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
import java.util.List

class ExtendedExpressionMapper extends ExtendedExpressionBaseVisitor<Object> {
	var isDebugMode = false

	new(boolean isDebugMode) {
		this.isDebugMode = isDebugMode
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
		if (isDebugMode) {
			if (!(tree instanceof ParserRuleContext)) {
				throw new RuntimeException("Don't visit terminal nodes!")
			}
			var ruleName = ExtendedExpressionParser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
			println("*** visit" + ruleName + " ***")
			println(tree.text)
			val ret = tree.accept(this)
			println(ret)

			ret
		} else {
			tree.accept(this)
		}
	}

	override public visitProgram(ExtendedExpressionParser.ProgramContext ctx) {
		val ret = new UniClassDec
		ret.members = Lists.newArrayList
		ctx.children.listIterator.forEach [
			switch it {
				ExtendedExpressionParser.NameContext:
					ret.className = visit(it) as String
				ExtendedExpressionParser.MethodDeclarationContext:
					ret.members += visit(it) as UniMemberDec
				ExtendedExpressionParser.ClassModifiersContext:
					ret.modifiers = visit(it) as List<String>
			}
		]
		ret
	}

	override public visitClassModifiers(ExtendedExpressionParser.ClassModifiersContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				list += visit(it)
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

	override public visitMethodDeclaration(ExtendedExpressionParser.MethodDeclarationContext ctx) {
		val ret = new UniMethodDec
		ctx.children.forEach [
			switch it {
				case ExtendedExpressionParser.TypeContext:
					ret.returnType = visit(it) as String
				case ExtendedExpressionParser.NameContext:
					ret.methodName = visit(it) as String
				case ExtendedExpressionParser.MethodBodyContext:
					ret.block = visit(it) as UniBlock
				case ExtendedExpressionParser.MethodModifiersContext:
					ret.modifiers = visit(it) as List<String>
			}
		]
		ret
	}

	override public visitMethodModifiers(ExtendedExpressionParser.MethodModifiersContext ctx) {
		val list = Lists.newArrayList
		ctx.children.forEach [
			list += visit(it) as String
		]
		list
	}

	override public visitFin(ExtendedExpressionParser.FinContext ctx) {
		ctx.text
	}

	override public visitMethodBody(ExtendedExpressionParser.MethodBodyContext ctx) {
		val ret = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof ExtendedExpressionParser.StatementContext) {
				ret.add(visit(it) as UniExpr)
			}
		]
		new UniBlock(ret)
	}

	override public visitName(ExtendedExpressionParser.NameContext ctx) {
		ctx.text
	}

	override public visitType(ExtendedExpressionParser.TypeContext ctx) {
		ctx.text
	}

	override public visitVariableDeclaration(ExtendedExpressionParser.VariableDeclarationContext ctx) {
		val ret = new UniVariableDecWithValue
		ctx.children.forEach [
			switch it {
				case ExtendedExpressionParser.TypeContext:
					ret.type = visit(it) as String
				case ExtendedExpressionParser.NameContext:
					ret.name = visit(it) as String
				case ExtendedExpressionParser.NormalExpContext:
					ret.value = visit(it) as UniExpr
			}
		]
		ret
	}

	override public visitIfStatement(ExtendedExpressionParser.IfStatementContext ctx) {
		val ret = new UniIf
		for (it : ctx.children) {
			if (it instanceof ExtendedExpressionParser.CompareExpContext) {
				ret.cond = visit(it) as UniExpr
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
