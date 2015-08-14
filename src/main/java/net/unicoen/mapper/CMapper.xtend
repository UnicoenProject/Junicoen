package net.unicoen.mapper

import java.io.FileInputStream
import net.unicoen.node.UniBlock
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniMethodDec
import net.unicoen.parser.CBaseVisitor
import net.unicoen.parser.CLexer
import net.unicoen.parser.CParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode

class CMapper extends CBaseVisitor<Object> {
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
		val lexer = new CLexer(chars)
		val tokens = new CommonTokenStream(lexer)
		val parser = new CParser(tokens)
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
			val ruleName = CParser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
			println("*** visit" + ruleName + " ***")
			println(tree.text)
			val ret = tree.accept(this)
			println("returned: " + ret)
			ret
		} else {
			tree.accept(this)
		}
	}

	override public visitTranslationUnit(CParser.TranslationUnitContext ctx) {
		val ret = new UniClassDec
		ctx.children.forEach [
			switch it {
				CParser.ExternalDeclarationContext:
					ret.members += it.visit as UniMemberDec
				case null:{}
					// do nothing
			}
		]
		ret
	}

	override public visitFunctionDefinition(CParser.FunctionDefinitionContext ctx) {
		val ret = new UniMethodDec
		ctx.children.forEach [
			switch it {
				CParser.DeclarationSpecifiersContext:
					ret.returnType = it.visit as String
				CParser.DeclaratorContext:
					ret.methodName = it.visit as String
				CParser.BlockItemListContext:
					ret.block = it.visit as UniBlock
			}
		]
		ret
	}

	override public visitDeclarationWithValue(CParser.DeclarationWithValueContext ctx) {
		// Return type UniVariableDecWithValue is not supported.
		super.visitDeclarationWithValue(ctx)
	}

	override public visitDeclarationWithoutValue(CParser.DeclarationWithoutValueContext ctx) {
		// Return type UniVariableDec is not supported.
		super.visitDeclarationWithoutValue(ctx)
	}

}
