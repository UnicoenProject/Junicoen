package net.unicoen.mapper

import java.io.FileInputStream
import java.util.ArrayList
import java.util.List
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniNode
import net.unicoen.parser.Java8BaseVisitor
import net.unicoen.parser.Java8Lexer
import net.unicoen.parser.Java8Parser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.TerminalNodeImpl

class JavaMapper extends Java8BaseVisitor<UniNode> {

	/**
	 * Visitorでリストを返すために用意
	 */
	static class AggregatedNode implements UniNode {
		public List<UniNode> list;

		def List<UniNode> flatten() {
			flattenTo(new ArrayList<UniNode>())
		}

		def List<UniNode> flattenTo(List<UniNode> dst) {
			list.forEach [
				if (it != null) {
					switch it {
						AggregatedNode:
							it.flattenTo(dst)
						default:
							dst.add(it)
					}
				}
			]
			dst
		}
	}

	def parseFile(String path) {
		val inputStream = new FileInputStream(path);
		try {
			parseCore(new ANTLRInputStream(inputStream));
		} finally {
			inputStream.close();
		}
	}

	def parse(String code) {
		parseCore(new ANTLRInputStream(code));
	}

	def parseCore(CharStream chars) {
		val lexer = new Java8Lexer(chars);
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
		ret.members = (maps.get("classBody").get(0) as AggregatedNode).flatten.map[it as UniMemberDec]
		return ret
	}

	override protected aggregateResult(UniNode aggregate, UniNode nextResult) {
		if (aggregate == null) {
			nextResult
		} else {
			aggregate
		}
	}

	override visitClassBody(Java8Parser.ClassBodyContext ctx) {
		val maps = createMaps(ctx)
		var ret = new AggregatedNode()
		ret.list = maps.get("classBodyDeclaration").map[it as UniMemberDec]
		ret
	}

	override public visitClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
		val maps = createMaps(ctx)
		val mems = maps.get("classMemberDeclaration")
		if (mems.size() > 0) {
			return mems.get(0) as UniNode
		}
		null
	}

	override public visitClassMemberDeclaration(Java8Parser.ClassMemberDeclarationContext ctx) {
		val maps = createMaps(ctx)
		val mems = maps.get("methodDeclaration")
		if (mems.size() > 0) {
			return mems.get(0) as UniNode
		}
		null
	}
}
