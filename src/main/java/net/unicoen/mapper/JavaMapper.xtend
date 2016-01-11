package net.unicoen.mapper

import java.io.FileInputStream
import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Map
import net.unicoen.node.UniBinOp
import net.unicoen.node.UniBlock
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniExpr
import net.unicoen.node.UniFieldAccess
import net.unicoen.node.UniIdent
import net.unicoen.node.UniIf
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniMethodCall
import net.unicoen.node.UniMethodDec
import net.unicoen.node.UniNew
import net.unicoen.node.UniNode
import net.unicoen.node.UniStringLiteral
import net.unicoen.node.UniVariableDec
import net.unicoen.node.UniWhile
import net.unicoen.parser.JavaBaseVisitor
import net.unicoen.parser.JavaLexer
import net.unicoen.parser.JavaParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import org.eclipse.xtext.xbase.lib.Functions.Function1
import net.unicoen.node.UniTernaryOp
import net.unicoen.node.UniArg
import net.unicoen.node.UniUnaryOp
import org.antlr.v4.runtime.RuleContext
import net.unicoen.node.UniReturn
import net.unicoen.node.UniEmptyStatement
import net.unicoen.node.UniCast
import net.unicoen.node.UniFor

class JavaMapper extends JavaBaseVisitor<UniNode> {
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

	def parse(String code, Function1<JavaParser, ParseTree> parseAction) {
		parseCore(new ANTLRInputStream(code), parseAction);
	}

	def parseFile(String path, Function1<JavaParser, ParseTree> parseAction) {
		val inputStream = new FileInputStream(path);
		try {
			parseCore(new ANTLRInputStream(inputStream), parseAction);
		} finally {
			inputStream.close();
		}
	}

	def parseCore(CharStream chars, Function1<JavaParser, ParseTree> parseAction) {
		val lexer = new JavaLexer(chars);
		val tokens = new CommonTokenStream(lexer);
		val parser = new JavaParser(tokens);
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

	override visitNormalClassDeclaration(JavaParser.NormalClassDeclarationContext ctx) {
		// normalClassDeclaration
		// :	classModifier* 'class' className typeParameters? superclass? superinterfaces? classBody		
		val nodes = createNodeMap(ctx)
		val ret = new UniClassDec()

		ret.modifiers = nodes.getOrEmpty(JavaParser.RULE_classModifier).map[it.toString].toList
		ret.superClass = nodes.getOrEmpty(JavaParser.RULE_superclass).map[it.toString].toList
		ret.className = nodes.getOneNode(JavaParser.RULE_className).toString
		ret.members = nodes.getOneNode(JavaParser.RULE_classBody).flattenForBuilding
		ret
	}

	override visitClassModifier(JavaParser.ClassModifierContext ctx) {
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

	override visitEmptyStatement(JavaParser.EmptyStatementContext ctx) {
		new UniEmptyStatement
	}

	override visitClassName(JavaParser.ClassNameContext ctx) {
		// className
		// :	Identifier
		new StringNode(ctx.children.head.text)
	}

	override visitClassType(JavaParser.ClassTypeContext ctx) {
		return new StringNode(ctx.children.head.text)
	}

	override visitClassBody(JavaParser.ClassBodyContext ctx) {
		// classBody
		// :	'{' classBodyDeclaration* '}' ;
		val nodes = createNodeMap(ctx)
		new ListNode(nodes.getOrEmpty(JavaParser.RULE_classBodyDeclaration))
	}

	override visitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
		// classBodyDeclaration
		// :	classMemberDeclaration
		// |	instanceInitializer
		// |	staticInitializer
		// |	constructorDeclaration		
		val nodes = createNodeMap(ctx)
		val mems = nodes.get(JavaParser.RULE_classMemberDeclaration)
		if (mems.size() > 0) {
			mems.get(0)
		}
	}

	override visitClassMemberDeclaration(JavaParser.ClassMemberDeclarationContext ctx) {
		// classMemberDeclaration
		// :	fieldDeclaration
		// |	methodDeclaration
		// |	classDeclaration
		// |	interfaceDeclaration
		// |	';'
		val nodes = createNodeMap(ctx)
		val mems = nodes.get(JavaParser.RULE_methodDeclaration)
		if (mems.size() > 0) {
			mems.get(0)
		}
	}

	override visitMethodModifier(JavaParser.MethodModifierContext ctx) {
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

	override visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
		// methodDeclaration
		// :	methodModifier* methodHeader methodBody ;
		val nodes = createNodeMap(ctx)
		val methodDec = new UniMethodDec()
		methodDec.modifiers = nodes.getOrEmpty(JavaParser.RULE_methodModifier).map[it.toString]
		val methodHeaderMaps = nodes.getOneNode(JavaParser.RULE_methodHeader) as MapNode
		methodDec.returnType = methodHeaderMaps.item.getOne(JavaParser.RULE_result).toString
		val methodDeclaratorMaps = methodHeaderMaps.item.getOne(JavaParser.RULE_methodDeclarator) as MapNode
		methodDec.methodName = methodDeclaratorMaps.item.identifierStr
		methodDec.block = nodes.getOneNode(JavaParser.RULE_methodBody)
		methodDec.args = new ArrayList
		val args = methodDeclaratorMaps.item.get(JavaParser.RULE_formalParameterList)
		if (args != null) {
			val argsList = args.get(0) as ListNode<UniArg>

			argsList.item.forEach[methodDec.args.add(it as UniArg)]
		}

		methodDec
	}

	override visitMethodHeader(JavaParser.MethodHeaderContext ctx) {
		// methodHeader
		// :	result methodDeclarator throws_?
		// |	typeParameters annotation* result methodDeclarator throws_?
		new MapNode(createMap(ctx))
	}

	override visitResult(JavaParser.ResultContext ctx) {
		// result
		// :	unannType
		// |	'void' ;
		new StringNode(ctx.children.head.text)
	}

	override visitMethodDeclarator(JavaParser.MethodDeclaratorContext ctx) {
		// methodDeclarator
		// :	Identifier '(' formalParameterList? ')' dims?
		new MapNode(createMap(ctx))
	}

	override visitMethodBody(JavaParser.MethodBodyContext ctx) {
		// methodBody
		// :	block
		// |	';'
		val nodes = createNodeMap(ctx)
		if (nodes.containsKey(JavaParser.RULE_block)) {
			nodes.getOneNode(JavaParser.RULE_block)
		}
	}

	override visitMethodInvocation(JavaParser.MethodInvocationContext ctx) {
		// methodInvocation
		// :	methodName '(' argumentList? ')'
		// |	typeName '.' typeArguments? Identifier '(' argumentList? ')'
		// |	expressionName '.' typeArguments? Identifier '(' argumentList? ')'
		// |	primary '.' typeArguments? Identifier '(' argumentList? ')'
		// |	'super' '.' typeArguments? Identifier '(' argumentList? ')'
		// |	typeName '.' 'super' '.' typeArguments? Identifier '(' argumentList? ')'		
		val nodes = createNodeMap(ctx)
		val texts = createTextMap(ctx)
		val argumentList = if (nodes.containsKey(JavaParser.RULE_argumentList)) {
				nodes.getOneNode(JavaParser.RULE_argumentList).flattenForBuilding
			} else {
				Collections.emptyList()
			}
		if (nodes.containsKey(JavaParser.RULE_methodName)) {
			val methodName = nodes.getOneNode(JavaParser.RULE_methodName)
			// TODO parse "argumentList"
			return new UniMethodCall(null, methodName.toString, argumentList)
		}
		if (nodes.containsKey(JavaParser.RULE_typeName)) {
			val typeName = nodes.getOneNode(JavaParser.RULE_typeName)
			if (!texts.containsKey(-JavaParser.SUPER)) {
				// TODO parse "argumentList"
				return new UniMethodCall(typeName, texts.identifierStr, argumentList)
			} else {
			}
		}
		throw new RuntimeException("Not implemented")
	}

	override visitFieldAccess(JavaParser.FieldAccessContext ctx) {
//			:	primary '.' Identifier
//	|	'super' '.' Identifier
//	|	typeName '.' 'super' '.' Identifier
//	;
		val model = new UniFieldAccess
		model.receiver = ctx.children.head.accept(this) as UniExpr
		model.fieldName = ctx.children.last.text

		model
	}

	override visitTypeName(JavaParser.TypeNameContext ctx) {
		// typeName
		// :	Identifier
		// |	packageOrTypeName '.' Identifier		
		val nodes = createNodeMap(ctx)
		val identifier = ctx.identifierStr
		if (nodes.containsKey(JavaParser.RULE_packageOrTypeName)) {
			new UniFieldAccess(nodes.getOneNode(JavaParser.RULE_packageOrTypeName), identifier)
		} else {
			new UniIdent(identifier)
		}
	}

	override visitPackageOrTypeName(JavaParser.PackageOrTypeNameContext ctx) {
		// packageOrTypeName
		// :	Identifier
		// |	packageOrTypeName '.' Identifier
		val nodes = createNodeMap(ctx)
		val identifier = ctx.identifierStr
		if (nodes.containsKey(JavaParser.RULE_packageOrTypeName)) {
			new UniFieldAccess(nodes.getOneNode(JavaParser.RULE_packageOrTypeName), identifier)
		} else {
			new UniIdent(identifier)
		}
	}

	override visitArgumentList(JavaParser.ArgumentListContext ctx) {
		// argumentList
		// :	expression (',' expression)*		
		val nodes = createNodeMap(ctx)
		new ListNode(nodes.get(JavaParser.RULE_expression))
	}

	override visitMethodName(JavaParser.MethodNameContext ctx) {
		// methodName
		// :	Identifier
		new StringNode(ctx.children.head.text)
	}

	override visitIfThenStatement(JavaParser.IfThenStatementContext ctx) {
		// ifThenStatement
		// :	'if' '(' expression ')' statement		
		val nodes = createNodeMap(ctx)
		val cond = nodes.getOneNode(JavaParser.RULE_expression)
		val trueBlcok = nodes.getOneNode(JavaParser.RULE_statement)
		return new UniIf(cond, trueBlcok, null)
	}

	override visitIfThenElseStatement(JavaParser.IfThenElseStatementContext ctx) {
		// ifThenElseStatement
		// :	'if' '(' expression ')' statementNoShortIf 'else' statement		
		val nodes = createNodeMap(ctx)
		val cond = nodes.getOneNode(JavaParser.RULE_expression)
		val trueBlcok = nodes.getOneNode(JavaParser.RULE_statementNoShortIf)
		val falseBlcok = nodes.getOneNode(JavaParser.RULE_statement)
		return new UniIf(cond, trueBlcok, falseBlcok)
	}

	override visitIfThenElseStatementNoShortIf(JavaParser.IfThenElseStatementNoShortIfContext ctx) {
		// ifThenElseStatementNoShortIf
		// :	'if' '(' expression ')' statementNoShortIf 'else' statementNoShortIf
		val nodes = createNodeMap(ctx)
		val cond = nodes.getOneNode(JavaParser.RULE_expression)
		val trueBlcok = nodes.getOneNode(JavaParser.RULE_statement)
		return new UniIf(cond, trueBlcok, null)
	}

	override visitStatement(JavaParser.StatementContext ctx) {
		// statement
		// :	statementWithoutTrailingSubstatement
		// |	labeledStatement
		// |	ifThenStatement
		// |	ifThenElseStatement
		// |	whileStatement
		// |	forStatement		
		ctx.children.head.accept(this)
	}

	override visitWhileStatement(JavaParser.WhileStatementContext ctx) {
		// whileStatement
		// :	'while' '(' expression ')' statement		
		val nodes = createNodeMap(ctx)
		new UniWhile(nodes.getOneNode(JavaParser.RULE_expression), nodes.getOneNode(JavaParser.RULE_statement))
	}

	override visitStatementWithoutTrailingSubstatement(JavaParser.StatementWithoutTrailingSubstatementContext ctx) {
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

	override visitBlock(JavaParser.BlockContext ctx) {
		// block
		// :	'{' blockStatements? '}'		
		val nodes = createNodeMap(ctx)
		if (nodes.containsKey(JavaParser.RULE_blockStatements)) {
			return nodes.getOneNode(JavaParser.RULE_blockStatements)
		}
		new UniBlock()
	}

	override visitBlockStatements(JavaParser.BlockStatementsContext ctx) {
		// blockStatements
		// :	blockStatement blockStatement*
		val nodes = createNodeMap(ctx)
		val list = nodes.getOrEmpty(JavaParser.RULE_blockStatement)
		new UniBlock(list.map[it.flattenForBuilding].flatten.toList, null)
	}

	override visitBlockStatement(JavaParser.BlockStatementContext ctx) {
		// blockStatement
		// :	localVariableDeclarationStatement
		// |	classDeclaration
		// |	statement
		ctx.children.head.accept(this)
	}

	override visitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx) {
		// localVariableDeclarationStatement
		// :	localVariableDeclaration ';'
		ctx.children.head.accept(this)
	}

	override visitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
		// localVariableDeclaration
		// :	variableModifier* unannType variableDeclaratorList
		val nodes = createNodeMap(ctx)
		val modifiers = nodes.getOrEmpty(JavaParser.RULE_variableModifier).map[it.toString]
		val type = nodes.getOneNode(JavaParser.RULE_unannType).toString
		val varDecList = (nodes.getOneNode(JavaParser.
			RULE_variableDeclaratorList) as DummyNode<List<DummyNode<Pair<DummyNode<Pair<String, String>>, UniExpr>>>>).
			item.map [
				val nameAndTypeSuffix = it.item.key.item
				new UniVariableDec(modifiers, type + nameAndTypeSuffix.value, nameAndTypeSuffix.key, it.item.value)
			]
		new ListNode(varDecList)
	}

	override visitVariableModifier(JavaParser.VariableModifierContext ctx) {
		// variableModifier
		// :	annotation
		// |	'final'
		return new StringNode(ctx.children.head.text) // TODO: this code treat annotation as a string
	}

	override visitUnannType(JavaParser.UnannTypeContext ctx) {
		// unannType
		// :	unannPrimitiveType
		// |	unannReferenceType
		return new StringNode(ctx.children.head.text)
	}

	override visitPrimitiveType(JavaParser.PrimitiveTypeContext ctx) {
//		primitiveType
//	:	annotation* numericType
//	|	annotation* 'boolean'
//	;
		return new StringNode(ctx.children.last.text)
	}

	override visitVariableDeclaratorList(JavaParser.VariableDeclaratorListContext ctx) {
		// variableDeclaratorList
		// :	variableDeclarator (',' variableDeclarator)*
		val nodes = createNodeMap(ctx)
		new DummyNode(nodes.get(JavaParser.RULE_variableDeclarator))
	}

	override visitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
		// variableDeclarator
		// :	variableDeclaratorId ('=' variableInitializer)?
		val nodes = createNodeMap(ctx)
		val id = nodes.getOneNode(JavaParser.RULE_variableDeclaratorId)
		if (nodes.containsKey(JavaParser.RULE_variableInitializer)) {
			return new DummyNode(id -> nodes.getOneNode(JavaParser.RULE_variableInitializer))
		}
		return new DummyNode(id -> null)
	}

	override visitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
		// variableDeclaratorId
		// :	Identifier dims?
		if (ctx.children.size == 1) {
			return new DummyNode(ctx.children.head.text -> "")
		} else {
			return new DummyNode(ctx.children.head.text -> ctx.children.last.text)
		}
	}

	override visitVariableInitializer(JavaParser.VariableInitializerContext ctx) {
		// variableInitializer
		// :	expression
		// |	arrayInitializer
		val map = createMap(ctx)
		if (map.containsKey(JavaParser.RULE_expression)) {
			return getOne(map, JavaParser.RULE_expression) as UniExpr
		}
		throw new RuntimeException("not implemented")
	}

	override visitExpression(JavaParser.ExpressionContext ctx) {
		// expression
		// :	lambdaExpression
		// |	assignmentExpression
		ctx.children.head.accept(this)
	}

	override visitAssignmentExpression(JavaParser.AssignmentExpressionContext ctx) {
		// assignmentExpression
		// :	conditionalExpression
		// |	assignment
		ctx.children.head.accept(this)
	}

	override visitAssignment(JavaParser.AssignmentContext ctx) {
		// assignment
		// :	leftHandSide assignmentOperator expression
		new UniBinOp(ctx.children.get(1).text, ctx.children.head.accept(this) as UniExpr,
			ctx.children.last.accept(this) as UniExpr)
	}

	override visitLeftHandSide(JavaParser.LeftHandSideContext ctx) {
		// leftHandSide
		// :	expressionName
		// |	fieldAccess
		// |	arrayAccess
		ctx.children.head.accept(this)
	}

	override visitConditionalExpression(JavaParser.ConditionalExpressionContext ctx) {
		// conditionalExpression
		// :	conditionalOrExpression
		// |	conditionalOrExpression '?' expression ':' conditionalExpression
		if (ctx.children.size == 1) {
			ctx.children.head.accept(this)
		} else {
			val nodes = createNodeMap(ctx)
			new UniTernaryOp(nodes.getOneNode(JavaParser.RULE_conditionalOrExpression),
				nodes.getOneNode(JavaParser.RULE_expression), nodes.getOneNode(JavaParser.RULE_conditionalExpression))
		}
	}

	override visitConditionalOrExpression(JavaParser.ConditionalOrExpressionContext ctx) {
		// conditionalOrExpression
		// :	conditionalAndExpression
		// |	conditionalOrExpression '||' conditionalAndExpression
		if (ctx.children.size == 1) {
			ctx.children.head.accept(this)
		} else {
			new UniBinOp(getTerminals(ctx).join, ctx.children.head.accept(this) as UniExpr,
				ctx.children.last.accept(this) as UniExpr)
		}
	}

	override visitConditionalAndExpression(JavaParser.ConditionalAndExpressionContext ctx) {
		// conditionalAndExpression
		// :	inclusiveOrExpression
		// |	conditionalAndExpression '&&' inclusiveOrExpression
		if (ctx.children.size == 1) {
			ctx.children.head.accept(this)
		} else {
			new UniBinOp(getTerminals(ctx).join, ctx.children.head.accept(this) as UniExpr,
				ctx.children.last.accept(this) as UniExpr)
		}
	}

	override visitInclusiveOrExpression(JavaParser.InclusiveOrExpressionContext ctx) {
		// inclusiveOrExpression
		// :	exclusiveOrExpression
		// |	inclusiveOrExpression '|' exclusiveOrExpression
		if (ctx.children.size == 1) {
			ctx.children.head.accept(this)
		} else {
			new UniBinOp(getTerminals(ctx).join, ctx.children.head.accept(this) as UniExpr,
				ctx.children.last.accept(this) as UniExpr)
		}
	}

	override visitExclusiveOrExpression(JavaParser.ExclusiveOrExpressionContext ctx) {
		// exclusiveOrExpression
		// :	andExpression
		// |	exclusiveOrExpression '^' andExpression
		if (ctx.children.size == 1) {
			ctx.children.head.accept(this)
		} else {
			new UniBinOp(getTerminals(ctx).join, ctx.children.head.accept(this) as UniExpr,
				ctx.children.last.accept(this) as UniExpr)
		}
	}

	override visitAndExpression(JavaParser.AndExpressionContext ctx) {
		// andExpression
		// :	equalityExpression
		// |	andExpression '&' equalityExpression
		if (ctx.children.size == 1) {
			ctx.children.head.accept(this)
		} else {
			new UniBinOp(getTerminals(ctx).join, ctx.children.head.accept(this) as UniExpr,
				ctx.children.last.accept(this) as UniExpr)
		}
	}

	override visitEqualityExpression(JavaParser.EqualityExpressionContext ctx) {
		// equalityExpression
		// :	relationalExpression
		// |	equalityExpression '==' relationalExpression
		// |	equalityExpression '!=' relationalExpression
		if (ctx.children.size == 1) {
			ctx.children.head.accept(this)
		} else {
			new UniBinOp(getTerminals(ctx).join, ctx.children.head.accept(this) as UniExpr,
				ctx.children.last.accept(this) as UniExpr)
		}
	}

	override visitRelationalExpression(JavaParser.RelationalExpressionContext ctx) {
		// relationalExpression
		// :	shiftExpression
		// |	relationalExpression '<' shiftExpression
		// |	relationalExpression '>' shiftExpression
		// |	relationalExpression '<=' shiftExpression
		// |	relationalExpression '>=' shiftExpression
		// |	relationalExpression 'instanceof' referenceType
		if (ctx.children.size == 1) {
			ctx.children.head.accept(this)
		} else {
			new UniBinOp(getTerminals(ctx).join, ctx.children.head.accept(this) as UniExpr,
				ctx.children.last.accept(this) as UniExpr)
		}
	}

	override visitShiftExpression(JavaParser.ShiftExpressionContext ctx) {
		// shiftExpression
		// :	additiveExpression
		// |	shiftExpression '<' '<' additiveExpression
		// |	shiftExpression '>' '>' additiveExpression
		// |	shiftExpression '>' '>' '>' additiveExpression
		if (ctx.children.size == 1) {
			ctx.children.head.accept(this)
		} else {
			new UniBinOp(getTerminals(ctx).join, ctx.children.head.accept(this) as UniExpr,
				ctx.children.last.accept(this) as UniExpr)
		}
	}

	override visitAdditiveExpression(JavaParser.AdditiveExpressionContext ctx) {
		// additiveExpression
		// :	multiplicativeExpression
		// |	additiveExpression '+' multiplicativeExpression
		// |	additiveExpression '-' multiplicativeExpression
		if (ctx.children.size == 1) {
			ctx.children.head.accept(this)
		} else {
			new UniBinOp(getTerminals(ctx).join, ctx.children.head.accept(this) as UniExpr,
				ctx.children.last.accept(this) as UniExpr)
		}
	}

	override visitMultiplicativeExpression(JavaParser.MultiplicativeExpressionContext ctx) {
		// multiplicativeExpression
		// :	unaryExpression
		// |	multiplicativeExpression '*' unaryExpression
		// |	multiplicativeExpression '/' unaryExpression
		// |	multiplicativeExpression '%' unaryExpression
		if (ctx.children.size == 1) {
			ctx.children.head.accept(this)
		} else {
			new UniBinOp(getTerminals(ctx).join, ctx.children.head.accept(this) as UniExpr,
				ctx.children.last.accept(this) as UniExpr)
		}
	}

	override visitUnaryExpression(JavaParser.UnaryExpressionContext ctx) {
		// unaryExpression
		// :	preIncrementExpression
		// |	preDecrementExpression
		// |	'+' unaryExpression
		// |	'-' unaryExpression
		// |	unaryExpressionNotPlusMinus
		if (ctx.children.size == 1) {
			ctx.children.head.accept(this)
		} else {
			ctx.children.last.accept(this)
		}

	}

	override public visitPostIncrementExpression(JavaParser.PostIncrementExpressionContext ctx) {
		val bind = new UniUnaryOp
		bind.operator = "_" + ctx.children.last.text
		bind.expr = ctx.children.head.accept(this) as UniExpr
		bind
	}

	override public visitPostDecrementExpression(JavaParser.PostDecrementExpressionContext ctx) {
		val bind = new UniUnaryOp
		bind.operator = "_" + ctx.children.last.text
		bind.expr = ctx.children.head.accept(this) as UniExpr
		bind
	}

	override public visitUnaryExpressionNotPlusMinus(JavaParser.UnaryExpressionNotPlusMinusContext ctx) {
//			:	postfixExpression
//	|	'~' unaryExpression
//	|	'!' unaryExpression
//	|	castExpression
//	;
		if (ctx.childCount == 1) {
			// postfix?
			return ctx.children.head.accept(this) as UniExpr
		} else {
			val model = new UniUnaryOp
			model.operator = ctx.children.head.text
			model.expr = ctx.children.last.accept(this) as UniExpr

			model
		}
	}

	override public visitCastExpression(JavaParser.CastExpressionContext ctx) {
//		castExpression
//	:	'(' primitiveType ')' unaryExpression
//	|	'(' referenceType additionalBound* ')' unaryExpressionNotPlusMinus
//	|	'(' referenceType additionalBound* ')' lambdaExpression
//	;
		val nodes = createMap(ctx)
		val model = new UniCast
		model.type = nodes.getOne(JavaParser.RULE_primitiveType).toString
		model.value = nodes.getOne(JavaParser.RULE_unaryExpression)

		model
	}

	override visitPostfixExpression(JavaParser.PostfixExpressionContext ctx) {
		// postfixExpression
		// :	(	primary
		// |	expressionName
		// )
		// (	postIncrementExpression_lf_postfixExpression
		// |	postDecrementExpression_lf_postfixExpression
		// )*
		if (ctx.children.size == 1) {
			ctx.children.head.accept(this)
		}
	}

	override visitExpressionName(JavaParser.ExpressionNameContext ctx) {
		// expressionName
		// :	Identifier
		// |	ambiguousName '.' Identifier
		if (ctx.children.size == 1) {
			new UniIdent(ctx.children.head.text)
		} else {
			val model = new UniFieldAccess()
			model.receiver = ctx.children.head.accept(this) as UniExpr
			model.fieldName = ctx.children.last.text

			model
		}
	}

	override visitAmbiguousName(JavaParser.AmbiguousNameContext ctx) {
//		ambiguousName
//	:	Identifier
//	|	ambiguousName '.' Identifier
//	; 
		if (ctx.children.length == 1) {
			new UniIdent(ctx.children.head.text)
		} else {
			val model = new UniFieldAccess
			model.receiver = ctx.children.head.accept(this) as UniExpr
			model.fieldName = ctx.children.last.text
			model
		}
	}

	override visitPrimary(JavaParser.PrimaryContext ctx) {
		// primary
		// :	(	primaryNoNewArray_lfno_primary
		// |	arrayCreationExpression
		// )
		// (	primaryNoNewArray_lf_primary
		// )*
		if (ctx.children.size == 1) {
			ctx.children.head.accept(this)
		} else {
			val head = ctx.children.head.accept(this)
			val las = ctx.children.last.accept(this)
			val model = las as UniMethodCall
			model.receiver = head as UniExpr

			model
		}
	}

	override visitPrimaryNoNewArray_lf_primary(JavaParser.PrimaryNoNewArray_lf_primaryContext ctx) {
//			:	classInstanceCreationExpression_lf_primary
//	|	fieldAccess_lf_primary
//	|	arrayAccess_lf_primary
//	|	methodInvocation_lf_primary
//	|	methodReference_lf_primary
//	;
		ctx.children.head.accept(this)
	}

	override visitMethodInvocation_lf_primary(JavaParser.MethodInvocation_lf_primaryContext ctx) {
		// TODO should impl
		val model = new UniMethodCall
		model.args = new ArrayList
		model.methodName = ctx.children.get(1).text
		model
	}

	override visitFieldAccess_lf_primary(JavaParser.FieldAccess_lf_primaryContext ctx) {
		// TODO should impl
	}

	override visitFormalParameterList(JavaParser.FormalParameterListContext ctx) {
//formalParameterList
//			:	formalParameters ',' lastFormalParameter
//	|	lastFormalParameter
//
		val nodes = createMap(ctx)
		if (nodes.size == 1) {
			val args = new ArrayList<UniArg>
			args.add(nodes.getOne(JavaParser.RULE_lastFormalParameter))
			new ListNode(args)
		} else {
			val parameters = ctx.children.head.accept(this) as ListNode<UniArg>
			val last = ctx.children.last.accept(this) as UniArg
			val args = parameters.item as ArrayList<UniArg>
			args.add(last)

			new ListNode(args)
		}
	}

	override visitForStatement(JavaParser.ForStatementContext ctx) {
//		forStatement
//	:	basicForStatement
//	|	enhancedForStatement
//	;
		ctx.children.head.accept(this)
	}

	override visitBasicForStatement(JavaParser.BasicForStatementContext ctx) {
//		basicForStatement
//	:	'for' '(' forInit? ';' expression? ';' forUpdate? ')' statement
//	;
		val nodes = createNodeMap(ctx)
		val model = new UniFor
		val init = nodes.getOneNodeOrEmpty(JavaParser.RULE_forInit).flattenForBuilding

		if (!init.empty) {
			model.init = init.get(0)
		}

		model.cond = nodes.getOneNode(JavaParser.RULE_expression)
		model.step = nodes.getOneNode(JavaParser.RULE_forUpdate)
		model.statement = nodes.getOneNode(JavaParser.RULE_statement)

		val update = nodes.getOneNodeOrEmpty(JavaParser.RULE_forUpdate).flattenForBuilding

		if (!update.empty) {
			model.step = update.get(0)
		}

		model
	}

	override visitForInit(JavaParser.ForInitContext ctx) {
		// forInit
//	:	statementExpressionList
//	|	localVariableDeclaration
//	;
		return ctx.children.head.accept(this)
	}

	override visitFormalParameters(JavaParser.FormalParametersContext ctx) {
//formalParameters
//	:	formalParameter (',' formalParameter)*
//	|	receiverParameter (',' formalParameter)*
//	;
		val list = new ArrayList<UniArg>

		ctx.children.forEach [
			if (it instanceof RuleContext) {
				list.add(it.accept(this) as UniArg)
			}

		]
		new ListNode(list)
	}

	override visitFormalParameter(JavaParser.FormalParameterContext ctx) {
		val nodes = createMap(ctx)
		val model = new UniArg
		val name = nodes.getOne(
			JavaParser.RULE_variableDeclaratorId) as net.unicoen.mapper.JavaMapper.DummyNode<Pair<String, String>>

		model.name = name.item.key
		model.type = nodes.getOne(JavaParser.RULE_unannType).toString

		return model
	}

	override visitLastFormalParameter(JavaParser.LastFormalParameterContext ctx) {
		val nodes = createMap(ctx)

		return nodes.getOne(JavaParser.RULE_formalParameter)
	}

	override visitReturnStatement(JavaParser.ReturnStatementContext ctx) {
//returnStatement
//	:	'return' expression? ';'
//	;
		if (ctx.childCount == 2) {
			new UniReturn(null)
		} else {
			val model = new UniReturn
			model.value = ctx.children.get(1).accept(this) as UniExpr
			model
		}
	}

	override visitPrimaryNoNewArray_lfno_primary(JavaParser.PrimaryNoNewArray_lfno_primaryContext ctx) {
		// primaryNoNewArray_lfno_primary
		// :	literal
		// |	typeName ('[' ']')* '.' 'class'
		// |	unannPrimitiveType ('[' ']')* '.' 'class'
		// |	'void' '.' 'class'
		// |	'this'
		// |	typeName '.' 'this'
		// |	'(' expression ')'
		// |	classInstanceCreationExpression_lfno_primary
		// |	fieldAccess_lfno_primary
		// |	arrayAccess_lfno_primary
		// |	methodInvocation_lfno_primary
		// |	methodReference_lfno_primary
		val headText = ctx.children.head.text
		if (headText.equals("this")) {
			return new UniIdent("this")
		}
		if (headText.equals("(")) {
			return ctx.children.get(1).accept(this)
		}
		if (ctx.children.size == 1) {
			return ctx.children.head.accept(this)
		}
		throw new RuntimeException("Not implemented")
	}

	override visitMethodInvocation_lfno_primary(JavaParser.MethodInvocation_lfno_primaryContext ctx) {
		// methodInvocation_lfno_primary
		// :	methodName '(' argumentList? ')'
		// |	typeName '.' typeArguments? Identifier '(' argumentList? ')'
		// |	expressionName '.' typeArguments? Identifier '(' argumentList? ')'
		// |	'super' '.' typeArguments? Identifier '(' argumentList? ')'
		// |	typeName '.' 'super' '.' typeArguments? Identifier '(' argumentList? ')'
		val nodes = createNodeMap(ctx)
		val texts = createTextMap(ctx)
		val argumentList = if (nodes.containsKey(JavaParser.RULE_argumentList)) {
				nodes.getOneNode(JavaParser.RULE_argumentList).flattenForBuilding
			} else {
				Collections.emptyList()
			}
		if (nodes.containsKey(JavaParser.RULE_methodName)) {
			val methodName = nodes.getOneNode(JavaParser.RULE_methodName)
			// TODO parse "argumentList"
			return new UniMethodCall(null, methodName.toString, argumentList)
		}
		if (nodes.containsKey(JavaParser.RULE_typeName)) {
			val typeName = nodes.getOneNode(JavaParser.RULE_typeName)
			if (!texts.containsKey(-JavaParser.SUPER)) {
				// TODO parse "argumentList"
				return new UniMethodCall(typeName, texts.identifierStr, argumentList)
			} else {
			}
		}
		throw new RuntimeException("Not implemented")
	}

	override visitExpressionStatement(JavaParser.ExpressionStatementContext ctx) {
		// expressionStatement
		// :	statementExpression ';'
		ctx.children.head.accept(this)
	}

	override visitStatementExpression(JavaParser.StatementExpressionContext ctx) {
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

	override visitClassInstanceCreationExpression_lf_primary(
		JavaParser.ClassInstanceCreationExpression_lf_primaryContext ctx) {
		// classInstanceCreationExpression_lf_primary
		// :	'.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
		val nodes = createNodeMap(ctx)
		val texts = createTextMap(ctx)
		val type = texts.get(JavaParser.Identifier).join(".")
		if (ctx.children.head.text.equals("new")) {
			val argumentList = if (nodes.containsKey(JavaParser.RULE_argumentList)) {
					nodes.getOneNode(JavaParser.RULE_argumentList).flattenForBuilding
				} else {
					Collections.emptyList()
				}
			return new UniNew(type, argumentList)
		}
		throw new RuntimeException("Not implemented")
	}

	override visitClassInstanceCreationExpression_lfno_primary(
		JavaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx) {
		// classInstanceCreationExpression_lfno_primary
		// :	'new' typeArguments? annotation* Identifier ('.' annotation* Identifier)* typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
		// |	expressionName '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
		val nodes = createNodeMap(ctx)
		val texts = createTextMap(ctx)
		val type = texts.get(-JavaParser.Identifier).join(".")
		if (ctx.children.head.text.equals("new")) {
			val argumentList = if (nodes.containsKey(JavaParser.RULE_argumentList)) {
					nodes.getOneNode(JavaParser.RULE_argumentList).flattenForBuilding
				} else {
					Collections.emptyList()
				}
			return new UniNew(type, argumentList)
		}
		throw new RuntimeException("Not implemented")
	}

	override visitClassInstanceCreationExpression(JavaParser.ClassInstanceCreationExpressionContext ctx) {
		// classInstanceCreationExpression
		// :	'new' typeArguments? annotation* Identifier ('.' annotation* Identifier)* typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
		// |	expressionName '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
		// |	primary '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
		val nodes = createNodeMap(ctx)
		val texts = createTextMap(ctx)
		val type = texts.get(JavaParser.Identifier).join(".")
		if (ctx.children.head.text.equals("new")) {
			val argumentList = if (nodes.containsKey(JavaParser.RULE_argumentList)) {
					nodes.getOneNode(JavaParser.RULE_argumentList).flattenForBuilding
				} else {
					Collections.emptyList()
				}
			return new UniNew(type, argumentList)
		}
		throw new RuntimeException("Not implemented")
	}

	override visitLiteral(JavaParser.LiteralContext ctx) {
		// literal
		// :	IntegerLiteral
		// |	FloatingPointLiteral
		// |	BooleanLiteral
		// |	CharacterLiteral
		// |	StringLiteral
		// |	NullLiteral
		val texts = createTextMap(ctx)
		val convertMap = newHashMap(
			-JavaParser.BooleanLiteral -> [new UniBoolLiteral("true".equals(it))],
			-JavaParser.IntegerLiteral -> [new UniIntLiteral(Integer.parseInt(it))],
			-JavaParser.FloatingPointLiteral -> [new UniDoubleLiteral(Double.parseDouble(it))],
			// TODO support escaped string
			-JavaParser.StringLiteral -> [String s|new UniStringLiteral(s.substring(1, s.length - 1))]
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

	private static def <T extends UniNode> T getOneNodeOrEmpty(Map<Integer, List<UniNode>> map, Integer key) {
		if (map.containsKey(key)) {
			val items = map.get(key)
			if (items.size() > 0) {
				return items.get(0) as T
			}
		}
		new net.unicoen.mapper.JavaMapper.ListNode(new ArrayList()) as T
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
		map.get(-JavaParser.Identifier).head as String
	}

	private static def getIdentifierStr(ParserRuleContext ctx) {
		ctx.children.findFirst [
			switch (it) {
				TerminalNodeImpl: it.symbol.type == JavaParser.Identifier
				default: false
			}
		].text
	}

	private static def getTerminals(ParserRuleContext ctx) {
		ctx.children.filter[it instanceof TerminalNodeImpl].map[it.text]
	}

}
