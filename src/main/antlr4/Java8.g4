grammar Java8;

@header {
package net.unicoen.parser;
}

literal
	:	integerLiteral 
	|	floatingPointLiteral 
	|	booleanLiteral 
	|	characterLiteral 
	|	stringLiteral 
	|	nullLiteral 
	;

integerLiteral
	:	IntegerLiteral 
	;

floatingPointLiteral
	:	FloatingPointLiteral 
	;

booleanLiteral
	:	BooleanLiteral 
	;

stringLiteral
	:	StringLiteral 
	;

characterLiteral
	:	CharacterLiteral 
	;

nullLiteral
	:	NullLiteral 
	;

type
	:	primitiveType 
	|	referenceType 
	;

primitiveType
	:	annotation* numericType 
	|	annotation* BOOLEAN 
	;

numericType
	:	integralType 
	|	floatingPointType 
	;

integralType
	:	'byte' 
	|	'short' 
	|	'int' 
	|	'long' 
	|	'char' 
	;

floatingPointType
	:	'float' 
	|	'double' 
	;

referenceType
	:	classOrInterfaceType 
	|	typeVariable 
	|	arrayType 
	;

classOrInterfaceType
	:	(classType_lfno_classOrInterfaceType |interfaceType_lfno_classOrInterfaceType ) (classType_lf_classOrInterfaceType |interfaceType_lf_classOrInterfaceType )* 
	;

classType
	:	annotation* Identifier typeArguments? 
	|	classOrInterfaceType DOT annotation* Identifier typeArguments? 
	;

classType_lf_classOrInterfaceType
	:	'.' annotation* Identifier typeArguments? 
	;

classType_lfno_classOrInterfaceType
	:	annotation* Identifier typeArguments? 
	;

interfaceType
	:	classType 
	;

interfaceType_lf_classOrInterfaceType
	:	classType_lf_classOrInterfaceType 
	;

interfaceType_lfno_classOrInterfaceType
	:	classType_lfno_classOrInterfaceType 
	;

typeVariable
	:	annotation* Identifier 
	;

arrayType
	:	primitiveType dims 
	|	classOrInterfaceType dims 
	|	typeVariable dims 
	;

dims
	:	annotation* LBRACK RBRACK (annotation* LBRACK RBRACK )* 
	;

typeParameter
	:	typeParameterModifier* Identifier typeBound? 
	;

typeParameterModifier
	:	annotation 
	;

typeBound
	:	'extends' typeVariable 
	|	'extends' classOrInterfaceType additionalBound* 
	;

additionalBound
	:	'&' interfaceType 
	;

typeArguments
	:	'<' typeArgumentList '>' 
	;

typeArgumentList
	:	typeArgument (',' typeArgument )* 
	;

typeArgument
	:	referenceType 
	|	wildcard 
	;

wildcard
	:	annotation* '?' wildcardBounds? 
	;

wildcardBounds
	:	'extends' referenceType 
	|	'super' referenceType 
	;

packageName
	:	Identifier 
	|	packageName '.' Identifier 
	;

typeName
	:	ident 
	|	packageOrTypeName '.' Identifier 
	;

packageOrTypeName
	:	ident 
	|	packageOrTypeName '.' Identifier 
	;

expressionName
	:	ident 
	|	ambiguousName '.' Identifier 
	;

ambiguousName
	:	ident 
	|	ambiguousName '.' Identifier 
	;

ident
	:	Identifier 
	;

compilationUnit
	:	packageDeclaration? importDeclaration* typeDeclaration*  
	;

packageDeclaration
	:	packageModifier* 'package' Identifier ('.' Identifier )* ';' 
	;

packageModifier
	:	annotation 
	;

importDeclaration
	:	singleTypeImportDeclaration 
	|	typeImportOnDemandDeclaration 
	|	singleStaticImportDeclaration 
	|	staticImportOnDemandDeclaration 
	;

singleTypeImportDeclaration
	:	'import' typeName ';' 
	;

typeImportOnDemandDeclaration
	:	'import' packageOrTypeName '.' '*' ';' 
	;

singleStaticImportDeclaration
	:	'import' 'static' typeName '.' Identifier ';' 
	;

staticImportOnDemandDeclaration
	:	'import' 'static' typeName '.' '*' ';' 
	;

typeDeclaration
	:	classDeclaration 
	|	interfaceDeclaration 
	|	';' 
	;

classDeclaration
	:	normalClassDeclaration 
	|	enumDeclaration 
	;

normalClassDeclaration
	:	classModifiers 'class' className typeParameters? superclass? superinterfaces? classBody 
	;

className
	:	Identifier 
	;

classModifiers
	:	classModifier* 
	;

classModifier
	:	annotation 
	|	'public' 
	|	'protected' 
	|	'private' 
	|	'abstract' 
	|	'static' 
	|	'final' 
	|	'strictfp' 
	;

typeParameters
	:	'<' typeParameterList '>' 
	;

typeParameterList
	:	typeParameter (',' typeParameter )* 
	;

superclass
	:	'extends' classType 
	;

superinterfaces
	:	'implements' interfaceTypeList 
	;

interfaceTypeList
	:	interfaceType (',' interfaceType )* 
	;

classBody
	:	'{' classBodyDeclaration* '}' 
	;

classBodyDeclaration
	:	classMemberDeclaration 
	|	instanceInitializer 
	|	staticInitializer 
	|	constructorDeclaration 
	;

classMemberDeclaration
	:	fieldDeclaration 
	|	methodDeclaration 
	|	classDeclaration 
	|	interfaceDeclaration 
	|	';' 
	;

fieldDeclaration
	:	fieldModifiers unannType variableDeclaratorList ';' 
	;

fieldModifiers
	:	fieldModifier* 
	;

fieldModifier
	:	annotation 
	|	'public' 
	|	'protected' 
	|	'private' 
	|	'static' 
	|	'final' 
	|	'transient' 
	|	'volatile' 
	;

variableDeclaratorList
	:	variableDeclarator (',' variableDeclarator )* 
	;

variableDeclarator
	:	variableDeclaratorId ('=' variableInitializer )? 
	;

variableDeclaratorId
	:	Identifier dims? 
	;

variableInitializer
	:	expression 
	|	arrayInitializer 
	;

unannType
	:	unannPrimitiveType 
	|	unannReferenceType 
	;

unannPrimitiveType
	:	numericType 
	|	'boolean' 
	;

unannReferenceType
	:	unannClassOrInterfaceType 
	|	unannTypeVariable 
	|	unannArrayType 
	;

unannClassOrInterfaceType
	:	(unannClassType_lfno_unannClassOrInterfaceType |unannInterfaceType_lfno_unannClassOrInterfaceType ) (unannClassType_lf_unannClassOrInterfaceType |unannInterfaceType_lf_unannClassOrInterfaceType )* 
	;

unannClassType
	:	Identifier typeArguments? 
	|	unannClassOrInterfaceType '.' annotation* Identifier typeArguments? 
	;

unannClassType_lf_unannClassOrInterfaceType
	:	'.' annotation* Identifier typeArguments? 
	;

unannClassType_lfno_unannClassOrInterfaceType
	:	Identifier typeArguments? 
	;

unannInterfaceType
	:	unannClassType 
	;

unannInterfaceType_lf_unannClassOrInterfaceType
	:	unannClassType_lf_unannClassOrInterfaceType 
	;

unannInterfaceType_lfno_unannClassOrInterfaceType
	:	unannClassType_lfno_unannClassOrInterfaceType 
	;

unannTypeVariable
	:	Identifier 
	;

unannArrayType
	:	unannPrimitiveType dims 
	|	unannClassOrInterfaceType dims 
	|	unannTypeVariable dims 
	;

methodDeclaration
	:	methodModifier* methodHeader methodBody 
	;

methodModifier
	:	annotation 
	|	'public' 
	|	'protected' 
	|	'private' 
	|	'abstract' 
	|	'static' 
	|	'final' 
	|	'synchronized' 
	|	'native' 
	|	'strictfp' 
	;

methodHeader
	:	result methodDeclarator throws_? 
	|	typeParameters annotation* result methodDeclarator throws_? 
	;

result
	:	unannType 
	|	'void' 
	;

methodDeclarator
	:	methodName '(' formalParameterList? ')' dims? 
	;

methodName
	:	Identifier 
	;

formalParameterList
	:	formalParameters ',' lastFormalParameter 
	|	lastFormalParameter 
	;

formalParameters
	:	formalParameter (',' formalParameter )* 
	|	receiverParameter (',' formalParameter )* 
	;

formalParameter
	:	variableModifier* unannType parameterDeclaratorId 
	;

parameterDeclaratorId
	:	parameterName dims? 
	;

parameterName
	:	Identifier 
	;

variableModifier
	:	annotation 
	|	'final' 
	;

lastFormalParameter
	:	variableModifier* unannType annotation* '...' variableDeclaratorId 
	|	formalParameter 
	;

receiverParameter
	:	annotation* unannType (Identifier '.' )? 'this' 
	;

throws_
	:	'throws' exceptionTypeList 
	;

exceptionTypeList
	:	exceptionType (',' exceptionType )* 
	;

exceptionType
	:	classType 
	|	typeVariable 
	;

methodBody
	:	block 
	|	emptyBlock
	;


emptyBlock
	:	SEMI 
	;

instanceInitializer
	:	block 
	;

staticInitializer
	:	'static' block 
	;

constructorDeclaration
	:	constructorModifier* constructorDeclarator throws_? constructorBody 
	;

constructorModifier
	:	annotation 
	|	'public' 
	|	'protected' 
	|	'private' 
	;

constructorDeclarator
	:	typeParameters? simpleTypeName '(' formalParameterList? ')' 
	;

simpleTypeName
	:	Identifier 
	;

constructorBody
	:	'{' explicitConstructorInvocation? blockStatements? '}' 
	;

explicitConstructorInvocation
	:	typeArguments? ssTHIS '(' argumentList? ')' ';' 
	|	typeArguments? ssSUPER '(' argumentList? ')' ';' 
	|	expressionName '.' typeArguments? 'super' '(' argumentList? ')' ';' 
	|	primary '.' typeArguments? 'super' '(' argumentList? ')' ';' 
	;
ssTHIS
	:	THIS
	;
ssSUPER
	:	SUPER 
	;

enumDeclaration
	:	classModifiers 'enum' enumName superinterfaces? enumBody 
	;

enumName
	:	Identifier 
	;

enumBody
	:	'{' enumConstantList? ','? enumBodyDeclarations? '}' 
	;

enumConstantList
	:	enumConstant (',' enumConstant )* 
	;

enumConstant
	:	enumConstantModifier* Identifier ('(' argumentList? ')' )? classBody? 
	;

enumConstantModifier
	:	annotation 
	;

enumBodyDeclarations
	:	';' classBodyDeclaration* 
	;

interfaceDeclaration
	:	normalInterfaceDeclaration 
	|	annotationTypeDeclaration 
	;

normalInterfaceDeclaration
	:	interfaceModifiers 'interface' interfaceName typeParameters? extendsInterfaces? interfaceBody 
	;

interfaceModifiers
	:	interfaceModifier* 
	;

interfaceName
	:	Identifier 
	;

interfaceModifier
	:	annotation 
	|	'public' 
	|	'protected' 
	|	'private' 
	|	'abstract' 
	|	'static' 
	|	'strictfp' 
	;

extendsInterfaces
	:	'extends' interfaceTypeList 
	;

interfaceBody
	:	'{' interfaceMemberDeclaration* '}' 
	;

interfaceMemberDeclaration
	:	constantDeclaration 
	|	interfaceMethodDeclaration 
	|	classDeclaration 
	|	interfaceDeclaration 
	|	';' 
	;

constantDeclaration
	:	constantModifiers unannType variableDeclaratorList ';' 
	;

constantModifiers
	:	constantModifier* 
	;

constantModifier
	:	annotation 
	|	'public' 
	|	'static' 
	|	'final' 
	;

interfaceMethodDeclaration
	:	interfaceMethodModifiers methodHeader methodBody 
	;

interfaceMethodModifiers
	:	interfaceMethodModifier* 
	;

interfaceMethodModifier
	:	annotation 
	|	'public' 
	|	'abstract' 
	|	'default' 
	|	'static' 
	|	'strictfp' 
	;

annotationTypeDeclaration
	:	interfaceModifier* '@' 'interface' Identifier annotationTypeBody 
	;

annotationTypeBody
	:	'{' annotationTypeMemberDeclaration* '}' 
	;

annotationTypeMemberDeclaration
	:	annotationTypeElementDeclaration 
	|	constantDeclaration 
	|	classDeclaration 
	|	interfaceDeclaration 
	|	';' 
	;

annotationTypeElementDeclaration
	:	annotationTypeElementModifier* unannType Identifier '(' ')' dims? defaultValue? ';' 
	;

annotationTypeElementModifier
	:	annotation 
	|	'public' 
	|	'abstract' 
	;

defaultValue
	:	'default' elementValue 
	;

annotation
	:	normalAnnotation 
	|	markerAnnotation 
	|	singleElementAnnotation 
	;

normalAnnotation
	:	'@' typeName '(' elementValuePairList? ')' 
	;

elementValuePairList
	:	elementValuePair (',' elementValuePair )* 
	;

elementValuePair
	:	Identifier '=' elementValue 
	;

elementValue
	:	conditionalExpression 
	|	elementValueArrayInitializer 
	|	annotation 
	;

elementValueArrayInitializer
	:	'{' elementValueList? ','? '}' 
	;

elementValueList
	:	elementValue (',' elementValue )* 
	;

markerAnnotation
	:	'@' typeName 
	;

singleElementAnnotation
	:	'@' typeName '(' elementValue ')' 
	;

arrayInitializer
	:	'{' variableInitializerList? ','? '}' 
	;

variableInitializerList
	:	variableInitializer (',' variableInitializer )* 
	;

block
	:	'{' blockStatements? '}' 
	;

blockStatements
	:	blockStatement blockStatement* 
	;

blockStatement
	:	localVariableDeclarationStatement 
	|	classDeclaration 
	|	statement 
	;

localVariableDeclarationStatement
	:	localVariableDeclaration ';' 
	;

localVariableDeclaration
	:	variableModifier* unannType variableDeclaratorList 
	;

statement
	:	statementWithoutTrailingSubstatement 
	|	labeledStatement 
	|	ifThenStatement 
	|	ifThenElseStatement 
	|	whileStatement 
	|	forStatement 
	;

statementNoShortIf
	:	statementWithoutTrailingSubstatement 
	|	labeledStatementNoShortIf 
	|	ifThenElseStatementNoShortIf 
	|	whileStatementNoShortIf 
	|	forStatementNoShortIf 
	;

statementWithoutTrailingSubstatement
	:	block 
	|	emptyStatement 
	|	expressionStatement 
	|	assertStatement 
	|	switchStatement 
	|	doStatement 
	|	breakStatement 
	|	continueStatement 
	|	returnStatement 
	|	synchronizedStatement 
	|	throwStatement 
	|	tryStatement 
	;

emptyStatement
	:	';' 
	;

labeledStatement
	:	Identifier ':' statement 
	;

labeledStatementNoShortIf
	:	Identifier ':' statementNoShortIf 
	;

expressionStatement
	:	statementExpression ';' 
	;

statementExpression
	:	assignment 
	|	preIncrementExpression 
	|	preDecrementExpression 
	|	postIncrementExpression 
	|	postDecrementExpression 
	|	methodInvocation 
	|	classInstanceCreationExpression 
	;

ifThenStatement
	:	'if' '(' expression ')' statement 
	;

ifThenElseStatement
	:	'if' '(' expression ')' statementNoShortIf 'else' statement 
	;

ifThenElseStatementNoShortIf
	:	'if' '(' expression ')' statementNoShortIf 'else' statementNoShortIf 
	;

assertStatement
	:	'assert' expression ';' 
	|	'assert' expression ':' expression ';' 
	;

switchStatement
	:	'switch' '(' expression ')' switchBlock 
	;

switchBlock
	:	'{' switchBlockStatementGroup* switchLabel* '}' 
	;

switchBlockStatementGroup
	:	switchLabels blockStatements 
	;

switchLabels
	:	switchLabel switchLabel* 
	;

switchLabel
	:	CASE constantExpression ':' 
	|	'case' enumConstantName ':' 
	|	DEFAULT ':' 
	;

enumConstantName
	:	Identifier 
	;

whileStatement
	:	'while' '(' expression ')' statement 
	;

whileStatementNoShortIf
	:	'while' '(' expression ')' statementNoShortIf 
	;

doStatement
	:	'do' statement 'while' '(' expression ')' ';' 
	;

forStatement
	:	basicForStatement 
	|	enhancedForStatement 
	;

forStatementNoShortIf
	:	basicForStatementNoShortIf 
	|	enhancedForStatementNoShortIf 
	;

basicForStatement
	:	'for' '(' forInit? ';' expression? ';' forUpdate? ')' statement 
	;

basicForStatementNoShortIf
	:	'for' '(' forInit? ';' expression? ';' forUpdate? ')' statementNoShortIf 
	;

forInit
	:	statementExpressionList 
	|	localVariableDeclaration 
	;

forUpdate
	:	statementExpressionList 
	;

statementExpressionList
	:	statementExpression (',' statementExpression )* 
	;

enhancedForStatement
	:	'for' '(' variableModifier* unannType variableDeclaratorId ':' expression ')' statement 
	;

enhancedForStatementNoShortIf
	:	'for' '(' variableModifier* unannType variableDeclaratorId ':' expression ')' statementNoShortIf 
	;

breakStatement
	:	'break' Identifier? ';' 
	;

continueStatement
	:	'continue' Identifier? ';' 
	;

returnStatement
	:	'return' expression? ';' 
	;

throwStatement
	:	'throw' expression ';' 
	;

synchronizedStatement
	:	'synchronized' '(' expression ')' block 
	;

tryStatement
	:	'try' block catches 
	|	'try' block catches? finally_ 
	|	tryWithResourcesStatement 
	;

catches
	:	catchClause catchClause* 
	;

catchClause
	:	'catch' '(' catchFormalParameter ')' block 
	;

catchFormalParameter
	:	variableModifier* catchType variableDeclaratorId 
	;

catchType
	:	unannClassType ('|' classType )* 
	;

finally_
	:	'finally' block 
	;

tryWithResourcesStatement
	:	'try' resourceSpecification block catches? finally_? 
	;

resourceSpecification
	:	'(' resourceList ';'? ')' 
	;

resourceList
	:	resource (';' resource )* 
	;

resource
	:	variableModifier* unannType variableDeclaratorId '=' expression 
	;

primary
	:	(primaryNoNewArray_lfno_primary |arrayCreationExpression ) (primaryNoNewArray_lf_primary )* 
	;

primaryNoNewArray
	:	literal 
	|	typeName ('[' ']' )* '.' 'class' 
	|	'void' '.' 'class' 
	|	'this' 
	|	typeName '.' 'this' 
	|	'(' expression ')' 
	|	classInstanceCreationExpression 
	|	fieldAccess 
	|	arrayAccess 
	|	methodInvocation 
	|	methodReference 
	;

primaryNoNewArray_lf_arrayAccess
	:	
	;

primaryNoNewArray_lfno_arrayAccess
	:	literal 
	|	typeName ('[' ']' )* '.' 'class' 
	|	'void' '.' 'class' 
	|	'this' 
	|	typeName '.' 'this' 
	|	'(' expression ')' 
	|	classInstanceCreationExpression 
	|	fieldAccess 
	|	methodInvocation 
	|	methodReference 
	;

primaryNoNewArray_lf_primary
	:	classInstanceCreationExpression_lf_primary 
	|	fieldAccess_lf_primary 
	|	arrayAccess_lf_primary 
	|	methodInvocation_lf_primary 
	|	methodReference_lf_primary 
	;

primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
	:	
	;

primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
	:	classInstanceCreationExpression_lf_primary 
	|	fieldAccess_lf_primary 
	|	methodInvocation_lf_primary 
	|	methodReference_lf_primary 
	;

primaryNoNewArray_lfno_primary
	:	literal 
	|	typeName ('[' ']' )* '.' 'class' 
	|	unannPrimitiveType ('[' ']' )* '.' 'class' 
	|	'void' '.' 'class' 
	|	iiTHIS 
	|	typeName '.' 'this' 
	|	'(' expression ')' 
	|	classInstanceCreationExpression_lfno_primary 
	|	fieldAccess_lfno_primary 
	|	arrayAccess_lfno_primary 
	|	methodInvocation_lfno_primary 
	|	methodReference_lfno_primary 
	;

iiTHIS
	:	THIS 
	;
primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
	:	
	;

primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
	:	literal 
	|	typeName ('[' ']' )* '.' 'class' 
	|	unannPrimitiveType ('[' ']' )* '.' 'class' 
	|	'void' '.' 'class' 
	|	'this' 
	|	typeName '.' 'this' 
	|	'(' expression ')' 
	|	classInstanceCreationExpression_lfno_primary 
	|	fieldAccess_lfno_primary 
	|	methodInvocation_lfno_primary 
	|	methodReference_lfno_primary 
	;

classInstanceCreationExpression
	:	'new' typeArguments? annotation* Identifier ('.' annotation* Identifier )* typeArgumentsOrDiamond? '(' argumentList? ')' classBody? 
	|	expressionName '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody? 
	|	primary '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody? 
	;

classInstanceCreationExpression_lf_primary
	:	'.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody? 
	;

classInstanceCreationExpression_lfno_primary
	:	'new' typeArguments? annotation* Identifier (DOT annotation* Identifier )* typeArgumentsOrDiamond? '(' argumentList? ')' classBody? 
	|	expressionName '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody? 
	;

typeArgumentsOrDiamond
	:	typeArguments 
	|	'<' '>' 
	;

fieldAccess
	:	primary '.' Identifier 
	|	'super' '.' Identifier 
	|	typeName '.' 'super' '.' Identifier 
	;

fieldAccess_lf_primary
	:	'.' Identifier 
	;

fieldAccess_lfno_primary
	:	iiSUPER '.' Identifier 
	|	typeName '.' 'super' '.' Identifier 
	;

iiSUPER
	:	SUPER 
	;

arrayAccess
	:	(expressionName '[' expression ']' |primaryNoNewArray_lfno_arrayAccess '[' expression ']' ) (primaryNoNewArray_lf_arrayAccess '[' expression ']' )* 
	;

arrayAccess_lf_primary
	:	(primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary '[' expression ']' ) (primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary '[' expression ']' )* 
	;

arrayAccess_lfno_primary
	:	(expressionName '[' expression ']' |primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary '[' expression ']' ) (primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary '[' expression ']' )* 
	;

methodInvocation
	:	methodName '(' argumentList? ')' 
	|	typeName '.' typeArguments? Identifier '(' argumentList? ')' 
	|	expressionName '.' typeArguments? Identifier '(' argumentList? ')' 
	|	primary '.' typeArguments? Identifier '(' argumentList? ')' 
	|	iiSUPER '.' typeArguments? Identifier '(' argumentList? ')' 
	|	typeName '.' 'super' '.' typeArguments? Identifier '(' argumentList? ')' 
	;

methodInvocation_lf_primary
	:	'.' typeArguments? Identifier '(' argumentList? ')' 
	;

methodInvocation_lfno_primary
	:	methodName '(' argumentList? ')' 
	|	typeName '.' typeArguments? Identifier '(' argumentList? ')' 
	|	expressionName '.' typeArguments? Identifier '(' argumentList? ')' 
	|	'super' '.' typeArguments? Identifier '(' argumentList? ')' 
	|	typeName '.' 'super' '.' typeArguments? Identifier '(' argumentList? ')' 
	;

argumentList
	:	expression (',' expression )* 
	;

methodReference
	:	expressionName '::' typeArguments? Identifier 
	|	referenceType '::' typeArguments? Identifier 
	|	primary '::' typeArguments? Identifier 
	|	'super' '::' typeArguments? Identifier 
	|	typeName '.' 'super' '::' typeArguments? Identifier 
	|	classType '::' typeArguments? 'new' 
	|	arrayType '::' 'new' 
	;

methodReference_lf_primary
	:	'::' typeArguments? Identifier 
	;

methodReference_lfno_primary
	:	expressionName '::' typeArguments? Identifier 
	|	referenceType '::' typeArguments? Identifier 
	|	'super' '::' typeArguments? Identifier 
	|	typeName '.' 'super' '::' typeArguments? Identifier 
	|	classType '::' typeArguments? 'new' 
	|	arrayType '::' 'new' 
	;

arrayCreationExpression
	:	'new' primitiveType dimExprs dims? 
	|	'new' classOrInterfaceType dimExprs dims? 
	|	'new' primitiveType dims arrayInitializer 
	|	'new' classOrInterfaceType dims arrayInitializer 
	;

dimExprs
	:	dimExpr dimExpr* 
	;

dimExpr
	:	annotation* '[' expression ']' 
	;

constantExpression
	:	expression 
	;

expression
	:	lambdaExpression 
	|	assignmentExpression 
	;

lambdaExpression
	:	lambdaParameters '->' lambdaBody 
	;

lambdaParameters
	:	Identifier 
	|	'(' formalParameterList? ')' 
	|	'(' inferredFormalParameterList ')' 
	;

inferredFormalParameterList
	:	Identifier (',' Identifier )* 
	;

lambdaBody
	:	expression 
	|	block 
	;

assignmentExpression
	:	conditionalExpression 
	|	assignment 
	;

assignment
	:	leftHandSide assignmentOperator expression 
	;

leftHandSide
	:	expressionName 
	|	fieldAccess 
	|	arrayAccess 
	;

assignmentOperator
	:	'=' 
	|	'*=' 
	|	'/=' 
	|	'%=' 
	|	'+=' 
	|	'-=' 
	|	'<<=' 
	|	'>>=' 
	|	'>>>=' 
	|	'&=' 
	|	'^=' 
	|	'|=' 
	;

conditionalExpression
	:	conditionalOrExpression 
	|	conditionalOrExpression '?' expression ':' conditionalExpression 
	;

conditionalOrExpression
	:	conditionalAndExpression 
	|	conditionalOrExpression OR conditionalAndExpression 
	;

conditionalAndExpression
	:	inclusiveOrExpression 
	|	conditionalAndExpression AND inclusiveOrExpression 
	;

inclusiveOrExpression
	:	exclusiveOrExpression 
	|	inclusiveOrExpression BITOR exclusiveOrExpression 
	;

exclusiveOrExpression
	:	andExpression 
	|	exclusiveOrExpression CARET andExpression 
	;

andExpression
	:	equalityExpression 
	|	andExpression BITAND equalityExpression 
	;

equalityExpression
	:	relationalExpression 
	|	equalityExpression EQUAL relationalExpression 
	|	equalityExpression NOTEQUAL relationalExpression 
	;

relationalExpression
	:	shiftExpression 
	|	relationalExpression LT shiftExpression 
	|	relationalExpression GT shiftExpression 
	|	relationalExpression LE shiftExpression 
	|	relationalExpression GE shiftExpression 
	|	relationalExpression INSTANCEOF referenceType 
	;

shiftExpression
	:	additiveExpression 
	|	shiftExpression LT LT additiveExpression 
	|	shiftExpression GT GT additiveExpression 
	|	shiftExpression GT GT GT additiveExpression 
	;

additiveExpression
	:	multiplicativeExpression 
	|	additiveExpression ADD multiplicativeExpression 
	|	additiveExpression SUB multiplicativeExpression 
	;

multiplicativeExpression
	:	unaryExpression 
	|	multiplicativeExpression MUL unaryExpression 
	|	multiplicativeExpression DIV unaryExpression 
	|	multiplicativeExpression MOD unaryExpression 
	;

unaryExpression
	:	preIncrementExpression 
	|	preDecrementExpression 
	|	ADD unaryExpression 
	|	SUB unaryExpression 
	|	unaryExpressionNotPlusMinus 
	;

preIncrementExpression
	:	INC unaryExpression 
	;

preDecrementExpression
	:	DEC unaryExpression 
	;

unaryExpressionNotPlusMinus
	:	postfixExpression 
	|	TILDE unaryExpression 
	|	BANG unaryExpression 
	|	castExpression 
	;

postfixExpression
	:	(primary |expressionName ) (postIncrementExpression_lf_postfixExpression |postDecrementExpression_lf_postfixExpression )* 
	;

postIncrementExpression
	:	postfixExpression INC 
	;

postIncrementExpression_lf_postfixExpression
	:	'++' 
	;

postDecrementExpression
	:	postfixExpression DEC 
	;

postDecrementExpression_lf_postfixExpression
	:	'--' 
	;

castExpression
	:	'(' primitiveType ')' unaryExpression 
	|	'(' referenceType additionalBound* ')' unaryExpressionNotPlusMinus 
	|	'(' referenceType additionalBound* ')' lambdaExpression 
	;

ABSTRACT
	:	'abstract' 
	;

ASSERT
	:	'assert' 
	;

BOOLEAN
	:	'boolean' 
	;

BREAK
	:	'break' 
	;

BYTE
	:	'byte' 
	;

CASE
	:	'case' 
	;

CATCH
	:	'catch' 
	;

CHAR
	:	'char' 
	;

CLASS
	:	'class' 
	;

CONST
	:	'const' 
	;

CONTINUE
	:	'continue' 
	;

DEFAULT
	:	'default' 
	;

DO
	:	'do' 
	;

DOUBLE
	:	'double' 
	;

ELSE
	:	'else' 
	;

ENUM
	:	'enum' 
	;

EXTENDS
	:	'extends' 
	;

FINAL
	:	'final' 
	;

FINALLY
	:	'finally' 
	;

FLOAT
	:	'float' 
	;

FOR
	:	'for' 
	;

IF
	:	'if' 
	;

GOTO
	:	'goto' 
	;

IMPLEMENTS
	:	'implements' 
	;

IMPORT
	:	'import' 
	;

INSTANCEOF
	:	'instanceof' 
	;

INT
	:	'int' 
	;

INTERFACE
	:	'interface' 
	;

LONG
	:	'long' 
	;

NATIVE
	:	'native' 
	;

NEW
	:	'new' 
	;

PACKAGE
	:	'package' 
	;

PRIVATE
	:	'private' 
	;

PROTECTED
	:	'protected' 
	;

PUBLIC
	:	'public' 
	;

RETURN
	:	'return' 
	;

SHORT
	:	'short' 
	;

STATIC
	:	'static' 
	;

STRICTFP
	:	'strictfp' 
	;

SUPER
	:	'super' 
	;

SWITCH
	:	'switch' 
	;

SYNCHRONIZED
	:	'synchronized' 
	;

THIS
	:	'this' 
	;

THROW
	:	'throw' 
	;

THROWS
	:	'throws' 
	;

TRANSIENT
	:	'transient' 
	;

TRY
	:	'try' 
	;

VOID
	:	'void' 
	;

VOLATILE
	:	'volatile' 
	;

WHILE
	:	'while' 
	;

IntegerLiteral
	:	DecimalIntegerLiteral 
	|	HexIntegerLiteral 
	|	OctalIntegerLiteral 
	|	BinaryIntegerLiteral 
	;

fragment
DecimalIntegerLiteral
	:	DecimalNumeral IntegerTypeSuffix? 
	;

fragment
HexIntegerLiteral
	:	HexNumeral IntegerTypeSuffix? 
	;

fragment
OctalIntegerLiteral
	:	OctalNumeral IntegerTypeSuffix? 
	;

fragment
BinaryIntegerLiteral
	:	BinaryNumeral IntegerTypeSuffix? 
	;

fragment
IntegerTypeSuffix
	:	[lL] 
	;

fragment
DecimalNumeral
	:	'0' 
	|	NonZeroDigit (	Digits? 
	|	Underscores Digits 
	) 
	;

fragment
Digits
	:	Digit (	DigitsAndUnderscores? Digit 
	)? 
	;

fragment
Digit
	:	'0' 
	|	NonZeroDigit 
	;

fragment
NonZeroDigit
	:	[1-9] 
	;

fragment
DigitsAndUnderscores
	:	DigitOrUnderscore+ 
	;

fragment
DigitOrUnderscore
	:	Digit 
	|	'_' 
	;

fragment
Underscores
	:	'_'+ 
	;

fragment
HexNumeral
	:	'0' [xX] HexDigits 
	;

fragment
HexDigits
	:	HexDigit (	HexDigitsAndUnderscores? HexDigit 
	)? 
	;

fragment
HexDigit
	:	[0-9a-fA-F] 
	;

fragment
HexDigitsAndUnderscores
	:	HexDigitOrUnderscore+ 
	;

fragment
HexDigitOrUnderscore
	:	HexDigit 
	|	'_' 
	;

fragment
OctalNumeral
	:	'0' Underscores? OctalDigits 
	;

fragment
OctalDigits
	:	OctalDigit (	OctalDigitsAndUnderscores? OctalDigit 
	)? 
	;

fragment
OctalDigit
	:	[0-7] 
	;

fragment
OctalDigitsAndUnderscores
	:	OctalDigitOrUnderscore+ 
	;

fragment
OctalDigitOrUnderscore
	:	OctalDigit 
	|	'_' 
	;

fragment
BinaryNumeral
	:	'0' [bB] BinaryDigits 
	;

fragment
BinaryDigits
	:	BinaryDigit (	BinaryDigitsAndUnderscores? BinaryDigit 
	)? 
	;

fragment
BinaryDigit
	:	[01] 
	;

fragment
BinaryDigitsAndUnderscores
	:	BinaryDigitOrUnderscore+ 
	;

fragment
BinaryDigitOrUnderscore
	:	BinaryDigit 
	|	'_' 
	;

FloatingPointLiteral
	:	DecimalFloatingPointLiteral 
	|	HexadecimalFloatingPointLiteral 
	;

fragment
DecimalFloatingPointLiteral
	:	Digits '.' Digits? ExponentPart? FloatTypeSuffix? 
	|	'.' Digits ExponentPart? FloatTypeSuffix? 
	|	Digits ExponentPart FloatTypeSuffix? 
	|	Digits FloatTypeSuffix 
	;

fragment
ExponentPart
	:	ExponentIndicator SignedInteger 
	;

fragment
ExponentIndicator
	:	[eE] 
	;

fragment
SignedInteger
	:	Sign? Digits 
	;

fragment
Sign
	:	[+-] 
	;

fragment
FloatTypeSuffix
	:	[fFdD] 
	;

fragment
HexadecimalFloatingPointLiteral
	:	HexSignificand BinaryExponent FloatTypeSuffix? 
	;

fragment
HexSignificand
	:	HexNumeral '.'? 
	|	'0' [xX] HexDigits? '.' HexDigits 
	;

fragment
BinaryExponent
	:	BinaryExponentIndicator SignedInteger 
	;

fragment
BinaryExponentIndicator
	:	[pP] 
	;

BooleanLiteral
	:	'true' 
	|	'false' 
	;

CharacterLiteral
	:	'\'' SingleCharacter '\'' 
	|	'\'' EscapeSequence '\'' 
	;

fragment
SingleCharacter
	:	~['\\] 
	;

StringLiteral
	:	'"' StringCharacters? '"' 
	;

fragment
StringCharacters
	:	StringCharacter+ 
	;

fragment
StringCharacter
	:	~["\\] 
	|	EscapeSequence 
	;

fragment
EscapeSequence
	:	'\\' [btnfr'"\\] 
	|	OctalEscape 
	|	UnicodeEscape 
	;

fragment
OctalEscape
	:	'\\' OctalDigit 
	|	'\\' OctalDigit OctalDigit 
	|	'\\' ZeroToThree OctalDigit OctalDigit 
	;

fragment
ZeroToThree
	:	[0-3] 
	;

fragment
UnicodeEscape
	:	'\\' 'u' HexDigit HexDigit HexDigit HexDigit 
	;

NullLiteral
	:	'null' 
	;

LPAREN
	:	'(' 
	;

RPAREN
	:	')' 
	;

LBRACE
	:	'{' 
	;

RBRACE
	:	'}' 
	;

LBRACK
	:	'[' 
	;

RBRACK
	:	']' 
	;

SEMI
	:	';' 
	;

COMMA
	:	',' 
	;

DOT
	:	'.' 
	;

ASSIGN
	:	'=' 
	;

GT
	:	'>' 
	;

LT
	:	'<' 
	;

BANG
	:	'!' 
	;

TILDE
	:	'~' 
	;

QUESTION
	:	'?' 
	;

COLON
	:	':' 
	;

EQUAL
	:	'==' 
	;

LE
	:	'<=' 
	;

GE
	:	'>=' 
	;

NOTEQUAL
	:	'!=' 
	;

AND
	:	'&&' 
	;

OR
	:	'||' 
	;

INC
	:	'++' 
	;

DEC
	:	'--' 
	;

ADD
	:	'+' 
	;

SUB
	:	'-' 
	;

MUL
	:	'*' 
	;

DIV
	:	'/' 
	;

BITAND
	:	'&' 
	;

BITOR
	:	'|' 
	;

CARET
	:	'^' 
	;

MOD
	:	'%' 
	;

ARROW
	:	'->' 
	;

COLONCOLON
	:	'::' 
	;

ADD_ASSIGN
	:	'+=' 
	;

SUB_ASSIGN
	:	'-=' 
	;

MUL_ASSIGN
	:	'*=' 
	;

DIV_ASSIGN
	:	'/=' 
	;

AND_ASSIGN
	:	'&=' 
	;

OR_ASSIGN
	:	'|=' 
	;

XOR_ASSIGN
	:	'^=' 
	;

MOD_ASSIGN
	:	'%=' 
	;

LSHIFT_ASSIGN
	:	'<<=' 
	;

RSHIFT_ASSIGN
	:	'>>=' 
	;

URSHIFT_ASSIGN
	:	'>>>=' 
	;

Identifier
	:	JavaLetter JavaLetterOrDigit* 
	;

fragment
JavaLetter
	:	[a-zA-Z$_] 
	|	~[\u0000-\u00FF\uD800-\uDBFF] {Character.isJavaIdentifierStart(_input.LA(-1))}? 
	|	[\uD800-\uDBFF] [\uDC00-\uDFFF] {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}? 
	;

fragment
JavaLetterOrDigit
	:	[a-zA-Z0-9$_] 
	|	~[\u0000-\u00FF\uD800-\uDBFF] {Character.isJavaIdentifierPart(_input.LA(-1))}? 
	|	[\uD800-\uDBFF] [\uDC00-\uDFFF] {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}? 
	;

AT
	:	'@' 
	;

ELLIPSIS
	:	'...' 
	;

WS  :  [ \t\r\n\u000C]+ -> skip
    ;
COMMENT
	:	'/*' .* ? '*/'  ->skip
	;

LINE_COMMENT
	:	'//' ~[\r\n]*  ->skip
	;
