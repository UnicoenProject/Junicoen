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
import net.unicoen.node.UniIf
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniMethodCall
import net.unicoen.node.UniMethodDec
import net.unicoen.node.UniNode
import net.unicoen.node.UniStringLiteral
import net.unicoen.node.UniVariableDec
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
import net.unicoen.node.UniIdent
import net.unicoen.node.UniWhile

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
		val nodes = createNodeMap(ctx)
		val ret = new UniClassDec()
		ret.modifiers = nodes.getOrEmpty(Java8Parser.RULE_classModifier).map[it.toString].toList
		ret.className = nodes.getOneNode(Java8Parser.RULE_className).toString
		ret.members = nodes.getOneNode(Java8Parser.RULE_classBody).flattenForBuilding
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
		new StringNode(ctx.children.head.text) // TODO: this code treat annotation as a string
	}

	override visitClassName(Java8Parser.ClassNameContext ctx) {
		// className
		// :	Identifier
		new StringNode(ctx.children.head.text)
	}

	override visitClassBody(Java8Parser.ClassBodyContext ctx) {
		// classBody
		// :	'{' classBodyDeclaration* '}' ;
		val nodes = createNodeMap(ctx)
		new ListNode(nodes.getOrEmpty(Java8Parser.RULE_classBodyDeclaration))
	}

	override visitClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
		// classBodyDeclaration
		// :	classMemberDeclaration
		// |	instanceInitializer
		// |	staticInitializer
		// |	constructorDeclaration		
		val nodes = createNodeMap(ctx)
		val mems = nodes.get(Java8Parser.RULE_classMemberDeclaration)
		if (mems.size() > 0) {
			mems.get(0)
		}
	}

	override visitClassMemberDeclaration(Java8Parser.ClassMemberDeclarationContext ctx) {
		// classMemberDeclaration
		// :	fieldDeclaration
		// |	methodDeclaration
		// |	classDeclaration
		// |	interfaceDeclaration
		// |	';'
		val nodes = createNodeMap(ctx)
		val mems = nodes.get(Java8Parser.RULE_methodDeclaration)
		if (mems.size() > 0) {
			mems.get(0)
		}
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
		new StringNode(ctx.children.head.text) // TODO: this code treat annotation as a string
	}

	override visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
		// methodDeclaration
		// :	methodModifier* methodHeader methodBody ;
		val nodes = createNodeMap(ctx)
		val methodDec = new UniMethodDec()
		methodDec.modifiers = nodes.getOrEmpty(Java8Parser.RULE_methodModifier).map[it.toString]
		val methodHeaderMaps = nodes.getOneNode(Java8Parser.RULE_methodHeader) as MapNode
		methodDec.returnType = methodHeaderMaps.item.getOne(Java8Parser.RULE_result).toString
		val methodDeclaratorMaps = methodHeaderMaps.item.getOne(Java8Parser.RULE_methodDeclarator) as MapNode
		methodDec.methodName = methodDeclaratorMaps.item.identifierStr
		methodDec.block = nodes.getOneNode(Java8Parser.RULE_methodBody)
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
		new StringNode(ctx.children.head.text)
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
		val nodes = createNodeMap(ctx)
		if (nodes.containsKey(Java8Parser.RULE_block)) {
			nodes.getOneNode(Java8Parser.RULE_block)
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
		val nodes = createNodeMap(ctx)
		val texts = createTextMap(ctx)
		val argumentList = if (nodes.containsKey(Java8Parser.RULE_argumentList)) {
				nodes.getOneNode(Java8Parser.RULE_argumentList).flattenForBuilding
			} else {
				Collections.emptyList()
			}
		if (nodes.containsKey(Java8Parser.RULE_methodName)) {
			val methodName = nodes.getOneNode(Java8Parser.RULE_methodName)
			// TODO parse "argumentList"
			return new UniMethodCall(null, methodName.toString, argumentList)
		}
		if (nodes.containsKey(Java8Parser.RULE_typeName)) {
			val typeName = nodes.getOneNode(Java8Parser.RULE_typeName)
			if (!texts.containsKey(-Java8Parser.SUPER)) {
				// TODO parse "argumentList"
				return new UniMethodCall(typeName, texts.identifierStr, argumentList)
			} else {
			}
		}
		throw new RuntimeException("Not implemented")
	}

	override visitTypeName(Java8Parser.TypeNameContext ctx) {
		// typeName
		// :	Identifier
		// |	packageOrTypeName '.' Identifier		
		val nodes = createNodeMap(ctx)
		val identifier = ctx.identifierStr
		if (nodes.containsKey(Java8Parser.RULE_packageOrTypeName)) {
			new UniFieldAccess(nodes.getOneNode(Java8Parser.RULE_packageOrTypeName), identifier)
		} else {
			new UniIdent(identifier)
		}
	}

	override visitPackageOrTypeName(Java8Parser.PackageOrTypeNameContext ctx) {
		// packageOrTypeName
		// :	Identifier
		// |	packageOrTypeName '.' Identifier
		val nodes = createNodeMap(ctx)
		val identifier = ctx.identifierStr
		if (nodes.containsKey(Java8Parser.RULE_packageOrTypeName)) {
			new UniFieldAccess(nodes.getOneNode(Java8Parser.RULE_packageOrTypeName), identifier)
		} else {
			new UniIdent(identifier)
		}
	}

	override visitArgumentList(Java8Parser.ArgumentListContext ctx) {
		// argumentList
		// :	expression (',' expression)*		
		val nodes = createNodeMap(ctx)
		new ListNode(nodes.get(Java8Parser.RULE_expression))
	}

	override visitMethodName(Java8Parser.MethodNameContext ctx) {
		// methodName
		// :	Identifier
		new StringNode(ctx.children.head.text)
	}

	override visitIfThenStatement(Java8Parser.IfThenStatementContext ctx) {
		// ifThenStatement
		// :	'if' '(' expression ')' statement		
		val nodes = createNodeMap(ctx)
		val cond = nodes.getOneNode(Java8Parser.RULE_expression)
		val trueBlcok = nodes.getOneNode(Java8Parser.RULE_statement)
		return new UniIf(cond, trueBlcok, null)
	}

	override visitIfThenElseStatement(Java8Parser.IfThenElseStatementContext ctx) {
		// ifThenElseStatement
		// :	'if' '(' expression ')' statementNoShortIf 'else' statement		
		val nodes = createNodeMap(ctx)
		val cond = nodes.getOneNode(Java8Parser.RULE_expression)
		val trueBlcok = nodes.getOneNode(Java8Parser.RULE_statementNoShortIf)
		val falseBlcok = nodes.getOneNode(Java8Parser.RULE_statement)
		return new UniIf(cond, trueBlcok, falseBlcok)
	}

	override visitIfThenElseStatementNoShortIf(Java8Parser.IfThenElseStatementNoShortIfContext ctx) {
		// ifThenElseStatementNoShortIf
		// :	'if' '(' expression ')' statementNoShortIf 'else' statementNoShortIf
		val nodes = createNodeMap(ctx)
		val cond = nodes.getOneNode(Java8Parser.RULE_expression)
		val trueBlcok = nodes.getOneNode(Java8Parser.RULE_statement)
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
		ctx.children.head.accept(this)
	}

	override visitWhileStatement(Java8Parser.WhileStatementContext ctx) {
		// whileStatement
		// :	'while' '(' expression ')' statement		
		val nodes = createNodeMap(ctx)
		new UniWhile(nodes.getOneNode(Java8Parser.RULE_expression), nodes.getOneNode(Java8Parser.RULE_statement))
	}

	override visitStatementWithoutTrailingSubstatement(Java8Parser.StatementWithoutTrailingSubstatementContext ctx) {
		// statementWithoutTrailingSubstatement
		// :	block
		// |	emptyStatement
		// |	expressionStatement
		// |	assertStatement
		// |	switchStatement
		// |	doStatement
		// |	breakStatement
		// |	continueStatement
		// |	returnStatement
		// |	synchronizedStatement
		// |	throwStatement
		// |	tryStatement
		ctx.children.head.accept(this)
	}

	override visitBlock(Java8Parser.BlockContext ctx) {
		// block
		// :	'{' blockStatements? '}'		
		val nodes = createNodeMap(ctx)
		if (nodes.containsKey(Java8Parser.RULE_blockStatements)) {
			return nodes.getOneNode(Java8Parser.RULE_blockStatements)
		}
		new UniBlock()
	}

	override visitBlockStatements(Java8Parser.BlockStatementsContext ctx) {
		// blockStatements
		// :	blockStatement blockStatement*
		val nodes = createNodeMap(ctx)
		val list = nodes.getOrEmpty(Java8Parser.RULE_blockStatement)
		new UniBlock(list.map[it.flattenForBuilding].flatten.toList)
	}

	override visitBlockStatement(Java8Parser.BlockStatementContext ctx) {
		// blockStatement
		// :	localVariableDeclarationStatement
		// |	classDeclaration
		// |	statement
		ctx.children.head.accept(this)
	}

	override visitLocalVariableDeclarationStatement(Java8Parser.LocalVariableDeclarationStatementContext ctx) {
		// localVariableDeclarationStatement
		// :	localVariableDeclaration ';'
		ctx.children.head.accept(this)
	}

	override visitLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx) {
		// localVariableDeclaration
		// :	variableModifier* unannType variableDeclaratorList
		val nodes = createNodeMap(ctx)
		val modifiers = nodes.getOrEmpty(Java8Parser.RULE_variableModifier).map[it.toString]
		val type = nodes.getOneNode(Java8Parser.RULE_unannType).toString
		val varDecList = (nodes.getOneNode(Java8Parser.
			RULE_variableDeclaratorList) as DummyNode<List<DummyNode<Pair<DummyNode<Pair<String, String>>, UniExpr>>>>).
			item.map [
				val nameAndTypeSuffix = it.item.key.item
				new UniVariableDec(modifiers, type + nameAndTypeSuffix.value, nameAndTypeSuffix.key, it.item.value)
			]
		new ListNode(varDecList)
	}

	override visitVariableModifier(Java8Parser.VariableModifierContext ctx) {
		// variableModifier
		// :	annotation
		// |	'final'
		return new StringNode(ctx.children.head.text) // TODO: this code treat annotation as a string
	}

	override visitUnannType(Java8Parser.UnannTypeContext ctx) {
		// unannType
		// :	unannPrimitiveType
		// |	unannReferenceType
		return new StringNode(ctx.children.head.text)
	}

	override visitVariableDeclaratorList(Java8Parser.VariableDeclaratorListContext ctx) {
		// variableDeclaratorList
		// :	variableDeclarator (',' variableDeclarator)*
		val nodes = createNodeMap(ctx)
		new DummyNode(nodes.get(Java8Parser.RULE_variableDeclarator))
	}

	override visitVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx) {
		// variableDeclarator
		// :	variableDeclaratorId ('=' variableInitializer)?
		val nodes = createNodeMap(ctx)
		val id = nodes.getOneNode(Java8Parser.RULE_variableDeclaratorId)
		if (nodes.containsKey(Java8Parser.RULE_variableInitializer)) {
			return new DummyNode(id -> nodes.getOneNode(Java8Parser.RULE_variableInitializer))
		}
		return new DummyNode(id -> null)
	}

	override visitVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx) {
		// variableDeclaratorId
		// :	Identifier dims?
		if (ctx.children.size == 1) {
			return new DummyNode(ctx.children.head.text -> "")
		} else {
			return new DummyNode(ctx.children.head.text -> ctx.children.last.text)
		}
	}

	override visitVariableInitializer(Java8Parser.VariableInitializerContext ctx) {
		// variableInitializer
		// :	expression
		// |	arrayInitializer
		val map = createMap(ctx)
		if (map.containsKey(Java8Parser.RULE_expression)) {
			return getOne(map, Java8Parser.RULE_expression) as UniExpr
		}
		throw new RuntimeException("not implemented")
	}

	override visitExpressionStatement(Java8Parser.ExpressionStatementContext ctx) {
		// expressionStatement
		// :	statementExpression ';'
		ctx.children.head.accept(this)
	}

	override visitStatementExpression(Java8Parser.StatementExpressionContext ctx) {
		// statementExpression
		// :	assignment
		// |	preIncrementExpression
		// |	preDecrementExpression
		// |	postIncrementExpression
		// |	postDecrementExpression
		// |	methodInvocation
		// |	classInstanceCreationExpression
		ctx.children.head.accept(this)
	}

	override visitClassInstanceCreationExpression(Java8Parser.ClassInstanceCreationExpressionContext ctx) {
		// classInstanceCreationExpression
		// :	'new' typeArguments? annotation* Identifier ('.' annotation* Identifier)* typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
		// |	expressionName '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
		// |	primary '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
		val texts = createTextMap(ctx)
		val type = texts.get(Java8Parser.Identifier).join(".")
		if (ctx.children.head.text.equals("new")) {
			
		}
		throw new RuntimeException("Not implemented")
	}

	override visitLiteral(Java8Parser.LiteralContext ctx) {
		// literal
		// :	IntegerLiteral
		// |	FloatingPointLiteral
		// |	BooleanLiteral
		// |	CharacterLiteral
		// |	StringLiteral
		// |	NullLiteral
		val texts = createTextMap(ctx)
		val convertMap = newHashMap(
			-Java8Parser.BooleanLiteral -> [new UniBoolLiteral("true".equals(it))],
			-Java8Parser.IntegerLiteral -> [new UniIntLiteral(Integer.parseInt(it))],
			-Java8Parser.FloatingPointLiteral -> [new UniDoubleLiteral(Double.parseDouble(it))],
			// TODO support escaped string
			-Java8Parser.StringLiteral -> [String s|new UniStringLiteral(s.substring(1, s.length - 1))]
		)
		for (entry : convertMap.entrySet) {
			if (texts.containsKey(entry.key)) {
				val str = texts.get(entry.key).get(0)
				return entry.value.apply(str)
			}
		}
		throw new RuntimeException("Unknown literal type")
	}

	/**
	 * VisitorでUniNodeの以外のオブジェクトを返すためのクラスです。
	 */
	static class DummyNode<T> extends UniNode {
		public T item;

		new(T item) {
			this.item = item;
		}
	}

	static class StringNode extends DummyNode<String> {
		new(String item) {
			super(item)
		}

		override toString() {
			item
		}
	}

	static class ListNode<T extends UniNode> extends DummyNode<List<T>> {
		new(List<T> item) {
			super(item)
		}

		override <T2 extends UniNode> List<T2> flattenForBuilding() {
			flattenTo(new ArrayList<T2>())
		}

		def <T2 extends UniNode> List<T2> flattenTo(List<T2> dst) {
			item.forEach [
				if (it != null) {
					switch it {
						ListNode<T2>:
							it.flattenTo(dst)
						default:
							dst.add(it as T2)
					}
				}
			]
			dst
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

	private def createTextMap(ParserRuleContext context) {
		context.children.map [
			switch (it) {
				TerminalNodeImpl: -it.symbol.type -> it.text
			}
		].filter[it != null].groupBy [
			it.key
		].mapValues [
			it.map[it.value]
		]
	}

	private def <T extends UniNode> createNodeMap(ParserRuleContext context) {
		context.children.map [
			switch (it) {
				ParserRuleContext: it.ruleIndex -> it.accept(this)
			}
		].filter[it != null].groupBy [
			it.key
		].mapValues [
			it.map[it.value as T]
		]
	}

	private static def <T> List<T> getOrEmpty(Map<Integer, List<T>> map, Integer key) {
		if (map.containsKey(key)) {
			return map.get(key)
		} else {
			Collections.emptyList()
		}
	}

	private static def <T extends UniNode> T getOneNode(Map<Integer, List<UniNode>> map, Integer key) {
		if (map.containsKey(key)) {
			val items = map.get(key)
			if (items.size() > 0) {
				return items.get(0) as T
			}
		}
		throw new RuntimeException("No item")
	}

	private static def <T> T getOne(Map<Integer, List<Object>> map, Integer key) {
		if (map.containsKey(key)) {
			val items = map.get(key)
			if (items.size() > 0) {
				return items.get(0) as T
			}
		}
		throw new RuntimeException("No item")
	}

	private static def <T> getIdentifierStr(Map<Integer, List<T>> map) {
		map.get(-Java8Parser.Identifier).head as String
	}

	private static def getIdentifierStr(ParserRuleContext ctx) {
		ctx.children.findFirst [
			switch (it) {
				TerminalNodeImpl: it.symbol.type == Java8Parser.Identifier
				default: false
			}
		].text
	}
}
