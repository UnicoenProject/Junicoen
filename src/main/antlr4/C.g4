grammar C;

@header{
	package net.unicoen.parser;
}

compilationUnit :
		translationUnit? EOF ;
translationUnit :
		externalDeclaration+ ;
externalDeclaration :
		functionDefinition | declaration | ';' ;
functionDefinition :
		declarationSpecifiers? declarator '{' blockItemList? '}' ;
declarator :
		directDeclarator ;
directDeclarator :
		Identifier ;
declarationSpecifiers :
		declarationSpecifier+ ;
declarationSpecifier :
		typeSpecifier ;
typeSpecifier :
		'int' ;
Identifier :
		IdentifierNondigit(IdentifierNondigit |Digit )* ;
IdentifierNondigit :
		Nondigit ;
Nondigit :
		[a-zA-Z_] ;
Digit :
		[0-9] ;
compoundStatement :
		'{' blockItemList? '}' ;
blockItemList :
		blockItem+ ;
blockItem :
		declaration ;
declaration :
		declarationWithValue | declarationWithoutValue ;
declarationWithValue :
		declarationSpecifiers initDeclaratorList+ ';' ;
declarationWithoutValue :
		declarationSpecifier declarator ';' ;
initDeclaratorList :
		initDeclarator ;
initDeclarator :
		declarator '=' initializer ;
initializer :
		assignmentExpression ;
assignmentExpression :
		conditionalExpression | unaryExpression assignmentOperator assignmentExpression ;
unaryExpression :
		postfixExpression ;
postfixExpression :
		primaryExpression ;
primaryExpression :
		Identifier | Constant ;
expression :
		assignmentExpression | expression ',' assignmentExpression ;
assignmentOperator :
		'=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' ;
castExpression :
		unaryExpression ;
multiplicativeExpression :
		castExpression | multiplicativeExpression '*' castExpression | multiplicativeExpression '/' castExpression | multiplicativeExpression '%' castExpression ;
additiveExpression :
		multiplicativeExpression | additiveExpression '+' multiplicativeExpression | additiveExpression '-' multiplicativeExpression ;
shiftExpression :
		additiveExpression | shiftExpression '<<' additiveExpression | shiftExpression '>>' additiveExpression ;
relationalExpression :
		shiftExpression | relationalExpression '<' shiftExpression | relationalExpression '>' shiftExpression | relationalExpression '<=' shiftExpression | relationalExpression '>=' shiftExpression ;
equalityExpression :
		relationalExpression | equalityExpression '==' relationalExpression | equalityExpression '!=' relationalExpression ;
andExpression :
		equalityExpression | andExpression '&' equalityExpression ;
exclusiveOrExpression :
		andExpression | exclusiveOrExpression '^' andExpression ;
inclusiveOrExpression :
		exclusiveOrExpression | inclusiveOrExpression '|' exclusiveOrExpression ;
logicalAndExpression :
		inclusiveOrExpression | logicalAndExpression '&&' inclusiveOrExpression ;
logicalOrExpression :
		logicalAndExpression | logicalOrExpression '||' logicalAndExpression ;
conditionalExpression :
		logicalOrExpression (  '?' expression ':' conditionalExpression ) ? ;
Constant :
		IntegerConstant ;
IntegerConstant :
		DecimalConstant ;
DecimalConstant :
		NonzeroDigit Digit* ;
NonzeroDigit :
		[1-9] ;
