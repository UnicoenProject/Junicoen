package net.unicoen.mapper

import java.io.FileInputStream
import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Map
import net.unicoen.node.UniBlock
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniExpr
import net.unicoen.node.UniFieldAccess
import net.unicoen.node.UniIdent
import net.unicoen.node.UniIf
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniMethodCall
import net.unicoen.node.UniMethodDec
import net.unicoen.node.UniNode
import net.unicoen.node.UniStringLiteral
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

class JavaMapper extends Java8BaseVisitor<UniNode> {
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

	protected override aggregateResult(UniNode aggregate, UniNode nextResult) {
		if (aggregate == null) {
			nextResult
		} else {
			aggregate
		}
	}

	override visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		// normalClassDeclaration
		// :	classModifier* 'class' className typeParameters? superclass? superinterfaces? classBody		
		val map = createMap(ctx)
		val ret = new UniClassDec()
		ret.modifiers = map.getOrEmpty(Java8Parser.RULE_classModifier).map[(it as DummyNode<String>).item].toList
		ret.className = (map.get(Java8Parser.RULE_className).head as DummyNode<String>).item
		ret.members = (map.get(Java8Parser.RULE_classBody).head as AggregatedNode).flatten.map[it as UniMemberDec]
		ret
	}

	override visitClassModifier(Java8Parser.ClassModifierContext ctx) {
		// classModifier
		// :	annotation
		// |	'public'
		// |	'protected'
		// |	'private'
		// |	'abstract'
		// |	'static'
		// |	'final'
		// |	'strictfp'
		val node = ctx.children.get(0)
		if (node.ruleName == "annotation") {
			throw new UnsupportedOperationException("Not yet implemented: annotation")
		}
		new DummyNode(node.text)
	}

	override visitClassName(Java8Parser.ClassNameContext ctx) {
		// className
		// :	Identifier
		val map = createMap(ctx)
		new DummyNode(map.identifierStr)
	}

	override visitClassBody(Java8Parser.ClassBodyContext ctx) {
		// classBody
		// :	'{' classBodyDeclaration* '}' ;
		val map = createMap(ctx)
		var ret = new AggregatedNode()
		ret.list = map.getOrEmpty(Java8Parser.RULE_classBodyDeclaration).map[it as UniMemberDec]
		ret
	}

	override visitClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
		val map = createMap(ctx)
		val mems = map.get(Java8Parser.RULE_classMemberDeclaration)
		if (mems.size() > 0) {
			return mems.get(0) as UniNode
		}
		null
	}

	override visitClassMemberDeclaration(Java8Parser.ClassMemberDeclarationContext ctx) {
		val map = createMap(ctx)
		val mems = map.get(Java8Parser.RULE_methodDeclaration)
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
		new DummyNode(node.text)
	}

	override visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
		// methodDeclaration
		// :	methodModifier* methodHeader methodBody ;
		val map = createMap(ctx)
		val methodDec = new UniMethodDec()
		methodDec.modifiers = map.getOrEmpty(Java8Parser.RULE_methodModifier).map[(it as DummyNode<String>).item]
		val methodHeaderMaps = map.get(Java8Parser.RULE_methodHeader).head as MapNode
		methodDec.returnType = (methodHeaderMaps.item.get(Java8Parser.RULE_result).head as DummyNode<String>).item
		val methodDeclaratorMaps = methodHeaderMaps.item.get(Java8Parser.RULE_methodDeclarator).head as MapNode
		methodDec.methodName = methodDeclaratorMaps.item.identifierStr
		methodDec.block = map.get(Java8Parser.RULE_methodBody).head as UniBlock
		methodDec
	}

	override visitMethodHeader(Java8Parser.MethodHeaderContext ctx) {
		// methodHeader
		// :	result methodDeclarator throws_?
		// |	typeParameters annotation* result methodDeclarator throws_?
		new MapNode(createMap(ctx))
	}

	override visitResult(Java8Parser.ResultContext ctx) {
		// result
		// :	unannType
		// |	'void' ;
		new DummyNode(ctx.children.head.text)
	}

	override visitMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
		// methodDeclarator
		// :	Identifier '(' formalParameterList? ')' dims?
		new MapNode(createMap(ctx))
	}

	override visitMethodBody(Java8Parser.MethodBodyContext ctx) {
		// methodBody
		// :	block
		// |	';'
		val map = createMap(ctx)
		if (map.containsKey(Java8Parser.RULE_block)) {
			map.getOne(Java8Parser.RULE_block) as UniBlock
		} else {
			null
		}
	}

	override visitMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
		// methodInvocation
		// :	methodName '(' argumentList? ')'
		// |	typeName '.' typeArguments? Identifier '(' argumentList? ')'
		// |	expressionName '.' typeArguments? Identifier '(' argumentList? ')'
		// |	primary '.' typeArguments? Identifier '(' argumentList? ')'
		// |	'super' '.' typeArguments? Identifier '(' argumentList? ')'
		// |	typeName '.' 'super' '.' typeArguments? Identifier '(' argumentList? ')'		
		val map = createMap(ctx)
		val argumentList = if (map.containsKey(Java8Parser.RULE_argumentList)) {
				(map.getOne(Java8Parser.RULE_argumentList) as DummyNode<List<UniExpr>>).item
			} else {
				Collections.emptyList()
			}
		if (map.containsKey(Java8Parser.RULE_methodName)) {
			val methodName = map.getOne(Java8Parser.RULE_methodName) as UniIdent
			// TODO parse "argumentList"
			return new UniMethodCall(null, methodName.name, argumentList)
		}
		if (map.containsKey(Java8Parser.RULE_typeName)) {
			val typeName = map.getOne(Java8Parser.RULE_typeName) as UniExpr
			if (!map.containsKey(-Java8Parser.SUPER)) {
				// TODO parse "argumentList"
				return new UniMethodCall(typeName, map.identifierStr, argumentList)
			} else {
			}
		}
		throw new RuntimeException("Not implemented")
	}

	override visitTypeName(Java8Parser.TypeNameContext ctx) {
		// typeName
		// :	Identifier
		// |	packageOrTypeName '.' Identifier		
		val map = createMap(ctx)
		val identifier = map.identifierStr
		if (map.containsKey(Java8Parser.RULE_packageOrTypeName)) {
			new UniFieldAccess(map.get(Java8Parser.RULE_packageOrTypeName).head as UniExpr, identifier)
		} else {
			new UniIdent(identifier)
		}
	}

	override visitPackageOrTypeName(Java8Parser.PackageOrTypeNameContext ctx) {
		// packageOrTypeName
		// :	Identifier
		// |	packageOrTypeName '.' Identifier		
		val map = createMap(ctx)
		val identifier = map.identifierStr
		if (map.containsKey(Java8Parser.RULE_packageOrTypeName)) {
			new UniFieldAccess(map.get(Java8Parser.RULE_packageOrTypeName).head as UniExpr, identifier)
		} else {
			new UniIdent(identifier)
		}
	}

	override visitArgumentList(Java8Parser.ArgumentListContext ctx) {
		// argumentList
		// :	expression (',' expression)*		
		val map = createMap(ctx)
		new DummyNode(map.get(Java8Parser.RULE_expression))
	}

	override visitMethodName(Java8Parser.MethodNameContext ctx) {
		val map = createMap(ctx)
		val str = map.get(-Java8Parser.Identifier).get(0) as String
		return new UniIdent(str)
	}

	override visitIfThenStatement(Java8Parser.IfThenStatementContext ctx) {
		val map = createMap(ctx)
		val cond = map.getOne(Java8Parser.RULE_expression) as UniExpr
		val trueBlcok = map.getOne(Java8Parser.RULE_statement) as UniBlock
		return new UniIf(cond, trueBlcok, null)
	}

	override visitIfThenElseStatement(Java8Parser.IfThenElseStatementContext ctx) {
		val map = createMap(ctx)
		val cond = map.getOne(Java8Parser.RULE_expression) as UniExpr
		val trueBlcok = map.getOne(Java8Parser.RULE_statementNoShortIf) as UniBlock
		val falseBlcok = map.getOne(Java8Parser.RULE_statement) as UniBlock
		return new UniIf(cond, trueBlcok, falseBlcok)
	}

	override visitIfThenElseStatementNoShortIf(Java8Parser.IfThenElseStatementNoShortIfContext ctx) {
		val map = createMap(ctx)
		val cond = map.getOne(Java8Parser.RULE_expression) as UniExpr
		val trueBlcok = map.getOne(Java8Parser.RULE_statement) as UniBlock
		return new UniIf(cond, trueBlcok, null)
	}

	override visitStatement(Java8Parser.StatementContext ctx) {
		// statement
		// :	statementWithoutTrailingSubstatement
		// |	labeledStatement
		// |	ifThenStatement
		// |	ifThenElseStatement
		// |	whileStatement
		// |	forStatement		
		val map = createMap(ctx)
		map.values.head.head as UniExpr
	}

	override visitStatementWithoutTrailingSubstatement(Java8Parser.StatementWithoutTrailingSubstatementContext ctx) {
		val map = createMap(ctx)
		if (map.containsKey(Java8Parser.RULE_expressionStatement)) {
			return getOne(map, Java8Parser.RULE_expressionStatement) as UniNode
		}
		if (map.containsKey(Java8Parser.RULE_block)) {
			return getOne(map, Java8Parser.RULE_block) as UniNode
		}
		throw new RuntimeException("not implemented")
	}

	override visitBlock(Java8Parser.BlockContext ctx) {
		// block
		// :	'{' blockStatements? '}'		
		val map = createMap(ctx)
		if (map.containsKey(Java8Parser.RULE_blockStatements)) {
			return getOne(map, Java8Parser.RULE_blockStatements) as UniNode
		}
		new UniBlock()
	}

	override visitBlockStatements(Java8Parser.BlockStatementsContext ctx) {
		// blockStatements
		// :	blockStatement blockStatement*
		val map = createMap(ctx)
		val list = JavaMapper.getOrEmpty(map, Java8Parser.RULE_blockStatement)
		new UniBlock(list.map[x|x as UniExpr])
	}

	override visitBlockStatement(Java8Parser.BlockStatementContext ctx) {
		// blockStatement
		// :	localVariableDeclarationStatement
		// |	classDeclaration
		// |	statement		
		val map = createMap(ctx)
		if (map.containsKey(Java8Parser.RULE_statement)) {
			return getOne(map, Java8Parser.RULE_statement) as UniNode
		}
		throw new RuntimeException("not implemented")
	}

	override visitExpressionStatement(Java8Parser.ExpressionStatementContext ctx) {
		val map = createMap(ctx)
		if (map.containsKey(Java8Parser.RULE_statementExpression)) {
			return getOne(map, Java8Parser.RULE_statementExpression) as UniNode
		}
		throw new RuntimeException("not implemented")
	}

	override visitStatementExpression(Java8Parser.StatementExpressionContext ctx) {
		val map = createMap(ctx)
		if (map.containsKey(Java8Parser.RULE_methodInvocation)) {
			return getOne(map, Java8Parser.RULE_methodInvocation) as UniNode
		}
		throw new RuntimeException("not implemented")
	}

	override visitLiteral(Java8Parser.LiteralContext ctx) {
		val map = createMap(ctx)
		val convertMap = newHashMap(
			-Java8Parser.BooleanLiteral -> [x|new UniBoolLiteral("true".equals(x))],
			-Java8Parser.IntegerLiteral -> [x|new UniIntLiteral(Integer.parseInt(x))],
			-Java8Parser.FloatingPointLiteral -> [x|new UniDoubleLiteral(Double.parseDouble(x))],
			// TODO support escaped string
			-Java8Parser.StringLiteral -> [String x|new UniStringLiteral(x.substring(1, x.length - 1))]
		)
		for (entry : convertMap.entrySet) {
			if (map.containsKey(entry.key)) {
				val str = map.get(entry.key).get(0) as String
				return entry.value.apply(str)
			}
		}
		throw new RuntimeException("Unknown literal type")
	}

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
	 * VisitorでUniNodeの以外のオブジェクトを返すためのクラスです。
	 */
	static class DummyNode<T> implements UniNode {
		public T item;

		new(T item) {
			this.item = item;
		}
	}

	static class MapNode extends DummyNode<Map<Integer, List<Object>>> {
		new(Map<Integer, List<Object>> item) {
			super(item)
		}
	}

	private def createMap(ParserRuleContext context) {
		context.children.map [
			switch (it) {
				TerminalNodeImpl: -it.symbol.type -> it.text
				ParserRuleContext: it.ruleIndex -> it.accept(this)
			}
		].groupBy [
			it.key
		].mapValues [
			it.map[it.value]
		]
	}

//	private static def getName(ParseTree tree) {
//		switch (tree) {
//			TerminalNodeImpl: tree.name
//			ParserRuleContext: tree.name
//			default: null
//		}
//	}
//	private static def getName(TerminalNodeImpl node) {
//		Java8Parser.VOCABULARY.getSymbolicName(node.symbol.type)
//	}
	private static def getName(ParserRuleContext node) {
		Java8Parser.ruleNames.get(node.ruleIndex)
	}

//	private static def getTokenName(ParseTree tree) {
//		switch (tree) {
//			TerminalNodeImpl: tree.name
//			default: null
//		}
//	}
	private static def getRuleName(ParseTree tree) {
		switch (tree) {
			ParserRuleContext: tree.name
			default: null
		}
	}

//	private static def getTextList(ParseTree node) {
//		privateGetTextList(node, new ArrayList<String>())
//	}
//
//	private static def privateGetTextList(ParseTree node, List<String> ret) {
//		val count = node.childCount
//		if (count == 0) {
//			ret.add(node.text)
//		} else {
//			(0 ..< count).forEach [ i |
//				privateGetTextList(node.getChild(i), ret)
//			]
//		}
//		ret
//	}
	private static def <T> List<T> getOrEmpty(Map<Integer, List<T>> map, Integer key) {
		if (map.containsKey(key)) {
			return map.get(key)
		} else {
			Collections.emptyList()
		}
	}

	private static def <T> T getOne(Map<Integer, List<T>> map, Integer key) {
		if (map.containsKey(key)) {
			val items = map.get(key)
			if (items.size() > 0) {
				return items.get(0)
			}
		}
		throw new RuntimeException("No item")
	}

//	private static def <T> getIdentifier(Map<Integer, List<T>> map) {
//		new UniIdent(map.identifierStr)
//	}

	private static def <T> getIdentifierStr(Map<Integer, List<T>> map) {
		map.get(-Java8Parser.Identifier).head as String
	}
}
