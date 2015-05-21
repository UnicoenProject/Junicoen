package net.unicoen.mapper

import java.io.FileInputStream
import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Map
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniMethodDec
import net.unicoen.node.UniNode
import net.unicoen.parser.Java8BaseVisitor
import net.unicoen.parser.Java8Lexer
import net.unicoen.parser.Java8Parser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import org.eclipse.xtext.xbase.lib.Functions.Function1
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniStringLiteral
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniExpr
import net.unicoen.node.UniIf
import net.unicoen.node.UniBlock
import net.unicoen.node.UniIdent
import net.unicoen.node.UniMethodCall

class JavaMapper extends Java8BaseVisitor<UniNode> {

	/**
	 * Visitorでリストを返すためのクラスです．
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

	/**
	 * VisitorでStringを返すためのクラスです．
	 */
	static class StringNode implements UniNode {
		public String text;

		new(String text) {
			this.text = text;
		}
	}

	private static def getName(ParseTree tree) {
		switch (tree) {
			TerminalNodeImpl: Java8Parser.tokenNames.get(tree.symbol.type)
			ParserRuleContext: Java8Parser.ruleNames.get(tree.ruleIndex)
			default: null
		}
	}

	private static def getTokenName(ParseTree tree) {
		switch (tree) {
			TerminalNodeImpl: Java8Parser.tokenNames.get(tree.symbol.type)
			default: null
		}
	}

	private static def getRuleName(ParseTree tree) {
		switch (tree) {
			ParserRuleContext: Java8Parser.ruleNames.get(tree.ruleIndex)
			default: null
		}
	}

	private def createMaps(ParserRuleContext context) {
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

	protected override aggregateResult(UniNode aggregate, UniNode nextResult) {
		if (aggregate == null) {
			nextResult
		} else {
			aggregate
		}
	}

	def parse(String code) {
		parseCore(new ANTLRInputStream(code));
	}

	def parseFile(String path) {
		val inputStream = new FileInputStream(path);
		try {
			parseCore(new ANTLRInputStream(inputStream));
		} finally {
			inputStream.close();
		}
	}

	def parseCore(CharStream chars) {
		parseCore(chars, [parser|parser.compilationUnit()])
	}

	def parse(String code, Function1<Java8Parser, ParseTree> parseAction) {
		parseCore(new ANTLRInputStream(code), parseAction);
	}

	def parseFile(String path, Function1<Java8Parser, ParseTree> parseAction) {
		val inputStream = new FileInputStream(path);
		try {
			parseCore(new ANTLRInputStream(inputStream), parseAction);
		} finally {
			inputStream.close();
		}
	}

	def parseCore(CharStream chars, Function1<Java8Parser, ParseTree> parseAction) {
		val lexer = new Java8Lexer(chars);
		val tokens = new CommonTokenStream(lexer);
		val parser = new Java8Parser(tokens);
		val tree = parseAction.apply(parser) // parse
		visit(tree)
	}

	def getTextList(ParseTree node) {
		privateGetTextList(node, new ArrayList<String>())
	}

	def privateGetTextList(ParseTree node, List<String> ret) {
		val count = node.childCount
		if (count == 0) {
			ret.add(node.text)
		} else {
			(0 ..< count).forEach [ i |
				privateGetTextList(node.getChild(i), ret)
			]
		}
		ret
	}

	override visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		val maps = createMaps(ctx)
		val ret = new UniClassDec()
		ret.className = maps.get("Identifier").get(0) as String
		ret.members = (maps.get("classBody").get(0) as AggregatedNode).flatten.map[it as UniMemberDec]
		return ret
	}

	override visitClassBody(Java8Parser.ClassBodyContext ctx) {
		// classBody
		// :	'{' classBodyDeclaration* '}' ;
		val maps = createMaps(ctx)
		var ret = new AggregatedNode()
		ret.list = maps.getOrEmpty("classBodyDeclaration").map[it as UniMemberDec]
		ret
	}

	override visitClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
		val maps = createMaps(ctx)
		val mems = maps.get("classMemberDeclaration")
		if (mems.size() > 0) {
			return mems.get(0) as UniNode
		}
		null
	}

	override visitClassMemberDeclaration(Java8Parser.ClassMemberDeclarationContext ctx) {
		val maps = createMaps(ctx)
		val mems = maps.get("methodDeclaration")
		if (mems.size() > 0) {
			return mems.get(0) as UniNode
		}
		null
	}

	override visitMethodModifier(Java8Parser.MethodModifierContext ctx) {
		// methodModifier
		// :	annotation
		// |	'public'
		// |	'protected'
		// |	'private'
		// |	'abstract'
		// |	'static'
		// |	'final'
		// |	'synchronized'
		// |	'native'
		// |	'strictfp' ;
		val node = ctx.children.get(0)
		if (node.ruleName == "annotation") {
			throw new UnsupportedOperationException("Not yet implemented: annotation")
		}
		new StringNode(node.text)
	}

	override visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
		// methodDeclaration
		// :	methodModifier* methodHeader methodBody ;
		val maps = createMaps(ctx)
		val methodDec = new UniMethodDec()
		methodDec.modifiers = maps.get("methodModifier").map[m|(m as StringNode).text]
		// methodHeader
		// methodBody
		methodDec
	}

	override visitResult(Java8Parser.ResultContext ctx) {
		// result
		// :	unannType
		// |	'void' ;
		new StringNode(ctx.children.get(0).text)

	}

	override visitMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
		val maps = createMaps(ctx)
		if (maps.containsKey("methodName")) {
			val methodName = getOne(maps, "methodName") as UniIdent
			val argumentList = getOne(maps, "argumentList") as AggregatedNode
			return new UniMethodCall(null, methodName.name, argumentList.list.map[x|x as UniExpr])
		}
		throw new RuntimeException("Not implemented")
	}

	override visitMethodName(Java8Parser.MethodNameContext ctx) {
		val maps = createMaps(ctx)
		val str = maps.get("Identifier").get(0) as String
		return new UniIdent(str)
	}

	override visitIfThenStatement(Java8Parser.IfThenStatementContext ctx) {
		val maps = createMaps(ctx)
		val cond = getOne(maps, "expression") as UniExpr
		val trueBlcok = (getOne(maps, "statement") as AggregatedNode).list.map[x|x as UniExpr]
		return new UniIf(cond, new UniBlock(trueBlcok), null)
	}

	override visitLiteral(Java8Parser.LiteralContext ctx) {
		val maps = createMaps(ctx)
		val convertMap = newHashMap(
			"BooleanLiteral" -> [x|new UniBoolLiteral("true".equals(x))],
			"IntegerLiteral" -> [x|new UniIntLiteral(Integer.parseInt(x))],
			"FloatingPointLiteral" -> [x|new UniDoubleLiteral(Double.parseDouble(x))],
			// TODO support escaped string
			"StringLiteral" -> [String x|new UniStringLiteral(x.substring(1, x.length - 1))]
		)
		for (entry : convertMap.entrySet) {
			if (maps.containsKey(entry.key)) {
				val str = maps.get(entry.key).get(0) as String
				return entry.value.apply(str)
			}
		}
		throw new RuntimeException("Unknown literal type")
	}

	private static def <T> List<T> getOrEmpty(Map<String, List<T>> map, String key) {
		if (map.containsKey(key)) {
			return map.get(key)
		} else {
			Collections.emptyList()
		}
	}

	private static def <T> T getOne(Map<String, List<T>> map, String key) {
		if (map.containsKey(key)) {
			val items = map.get(key)
			if (items.size() > 0) {
				return items.get(0)
			}
		}
		throw new RuntimeException("No item")
	}
}
