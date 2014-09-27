package net.unicoen.mapper

import net.unicoen.node.UniClassDec
import net.unicoen.node.UniNode
import net.unicoen.parser.Java8BaseVisitor
import net.unicoen.parser.Java8Lexer
import net.unicoen.parser.Java8Parser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.TerminalNodeImpl

class JavaMapper extends Java8BaseVisitor<UniNode> {
	def parse(String code) {
		val input = new ANTLRInputStream(code);
		val lexer = new Java8Lexer(input);
		val tokens = new CommonTokenStream(lexer);
		val parser = new Java8Parser(tokens);
		val tree = parser.compilationUnit(); // parse
		visit(tree)
	}

	def createMaps(ParserRuleContext context) {
		context.children.map [
			switch (it) {
				TerminalNodeImpl: Java8Parser.tokenNames.get(it.symbol.type) -> it.text
				ParserRuleContext: Java8Parser.ruleNames.get(it.ruleIndex) -> it.accept(this)
				default: "" -> null
			}
		].groupBy [
			it.key
		].mapValues [
			it.map[it.value]
		]
	}

	override public visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		val maps = createMaps(ctx)
		val ret = new UniClassDec()
		ret.className = maps.get("Identifier").get(0) as String
		return new UniClassDec();
	}

	override protected aggregateResult(UniNode aggregate, UniNode nextResult) {
		if (aggregate == null) {
			nextResult
		} else {
			aggregate
		}
	}
}
