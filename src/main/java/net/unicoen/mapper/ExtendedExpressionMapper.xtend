package net.unicoen.mapper

import java.io.FileInputStream
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode
import net.unicoen.parser.ExtendedExpressionLexer
import net.unicoen.parser.ExtendedExpressionParser
import net.unicoen.parser.ExtendedExpressionBaseVisitor
import net.unicoen.node.UniBinOp
import net.unicoen.node.UniExpr
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniMethodDec
import net.unicoen.node.UniBlock
import net.unicoen.node.UniVariableDecWithValue
import net.unicoen.node.UniIf
import net.unicoen.node.UniArg
import net.unicoen.node.UniWhile
import com.google.common.collect.Lists
import java.util.List

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
			var ruleName = ExtendedExpressionParser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
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
		val ret = new UniClassDec
		ret.members = Lists.newArrayList
		ctx.children.forEach [
			switch it {
				ExtendedExpressionParser.NameContext:
					ret.className = it.visit as String
				ExtendedExpressionParser.MethodDeclarationContext:
					ret.members += it.visit as UniMemberDec
				ExtendedExpressionParser.ClassModifiersContext:
					ret.modifiers = it.visit as List<String>
			}
		]
		ret
	}

	override public visitClassModifiers(ExtendedExpressionParser.ClassModifiersContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				list += it.visit as String
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
				ExtendedExpressionParser.TypeContext:
					ret.returnType = it.visit as String
				ExtendedExpressionParser.NameContext:
					ret.methodName = it.visit as String
				ExtendedExpressionParser.MethodBodyContext:
					ret.block = it.visit as UniBlock
				ExtendedExpressionParser.MethodModifiersContext:
					ret.modifiers = it.visit as List<String>
				ExtendedExpressionParser.MethodArgumentsContext:
					ret.args = it.visit as List<UniArg>
			}
		]
		ret
	}

	override public visitMethodModifiers(ExtendedExpressionParser.MethodModifiersContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				list += it.visit as String
			]
		}
		list
	}

	override public visitFin(ExtendedExpressionParser.FinContext ctx) {
		ctx.text
	}

	override public visitMethodVisibility(ExtendedExpressionParser.MethodVisibilityContext ctx) {
		ctx.text
	}

	override public visitMethodArguments(ExtendedExpressionParser.MethodArgumentsContext ctx) {
		val list = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				switch it {
					ExtendedExpressionParser.MethodArgumentContext:
						list += it.visit as UniArg
				}
			]
		}
		list
	}

	override public visitMethodArgument(ExtendedExpressionParser.MethodArgumentContext ctx) {
		val ret = new UniArg
		ctx.children.forEach [
			switch it {
				ExtendedExpressionParser.TypeContext:
					ret.type = it.visit as String
				ExtendedExpressionParser.NameContext:
					ret.name = it.visit as String
			}
		]
		ret
	}

	override public visitMethodBody(ExtendedExpressionParser.MethodBodyContext ctx) {
		val ret = Lists.newArrayList
		ctx.children.forEach [
			switch it {
				ExtendedExpressionParser.StatementContext:
					ret += it.visit as UniExpr
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
				ExtendedExpressionParser.TypeContext:
					ret.type = it.visit as String
				ExtendedExpressionParser.NameContext:
					ret.name = it.visit as String
				ExtendedExpressionParser.NormalExpContext:
					ret.value = it.visit as UniExpr
			}
		]
		ret
	}

	override public visitIfStatement(ExtendedExpressionParser.IfStatementContext ctx) {
		val ret = new UniIf
		val tList = Lists.newArrayList
		ctx.children.forEach [
			switch it {
				ExtendedExpressionParser.CompareExpContext:
					ret.cond = it.visit as UniExpr
				ExtendedExpressionParser.StatementContext:
					tList += it.visit as UniExpr
			}
		]
		val tBlock = new UniBlock(tList)
		ret.trueBlock = tBlock
		ret
	}

	override public visitWhileStatement(ExtendedExpressionParser.WhileStatementContext ctx) {
		val ret = new UniWhile
		val list = Lists.newArrayList
		ctx.children.forEach [
			switch it {
				ExtendedExpressionParser.CompareExpContext:
					ret.cond = it.visit as UniExpr
				ExtendedExpressionParser.StatementContext:
					list += it.visit as UniExpr
			}
		]
		val block = new UniBlock(list)
		ret.block = block
		ret
	}

	override public visitCompareExp(ExtendedExpressionParser.CompareExpContext ctx) {
		var ret = new UniBinOp
		for (tree : ctx.children) {
			switch tree {
				ExtendedExpressionParser.NormalExpContext:
					ret.right = tree.visit as UniExpr
				ExtendedExpressionParser.CompareOpContext: {
					val temp = new UniBinOp
					temp.operator = visit(tree) as String
					if (ret.operator == null) {
						temp.left = ret.right
					} else {
						temp.left = ret
						ret = temp
					}
				}
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
			switch tree {
				ExtendedExpressionParser.TermContext:
					ret.right = tree.visit as UniExpr
				ExtendedExpressionParser.AddSubOpContext: {
					val temp = new UniBinOp
					temp.operator = tree.text
					if (ret.operator == null) {
						temp.left = ret.right
					} else {
						temp.left = ret
					}
					ret = temp
				}
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
			switch tree {
				ExtendedExpressionParser.FactorContext:
					ret.right = tree.visit as UniExpr
				ExtendedExpressionParser.MulDivOpContext: {
					var temp = new UniBinOp
					temp.operator = tree.text
					if (ret.operator == null) {
						temp.left = ret.right
					} else {
						temp.left = ret
					}
					ret = temp
				}
			}
		}
		ret
	}

	override public visitInteger(ExtendedExpressionParser.IntegerContext ctx) {
		new UniIntLiteral(Integer.parseInt(ctx.text))
	}

	override public visitDecimal(ExtendedExpressionParser.DecimalContext ctx) {
		new UniDoubleLiteral(Double.parseDouble(ctx.text))
	}

}
