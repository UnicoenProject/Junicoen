grammar ExtendedCalculator;

@header {
package net.unicoen.parser;
}

compilationUnit
	:	(classNameDeclaration )? expressionList 
	;

classNameDeclaration
	:	'class' Identifier ';' 
	;

expressionList
	:	(expression )* 
	;

expression
	:	variableDeclaration 
	|	functionDeclaration 
	;

addSubExpression
	:	mulDivExpression 
	|	addSubExpression PLUS mulDivExpression 
	|	addSubExpression MINUS mulDivExpression 
	;

mulDivExpression
	:	factor 
	|	mulDivExpression MUL factor 
	|	mulDivExpression DIV factor 
	|	mulDivExpression MOD factor 
	;

factor
	:	functionCall 
	|	variableAccess 
	|	literal 
	|	nestedExpression 
	;

nestedExpression
	:	'(' addSubExpression ')' 
	;

functionCall
	:	functionName '(' argumentList? ')' 
	;

functionName
	:	Identifier 
	;

argumentList
	:	argument (',' argument )* 
	;

argument
	:	addSubExpression 
	;

variableAccess
	:	variableName 
	;

literal
	:	integerLiteral 
	|	floatingPointLiteral 
	;

variableDeclaration
	:	variableName '=' addSubExpression ';' 
	;

variableName
	:	Identifier 
	;

functionDeclaration
	:	functionName '(' parameterList? ')' '=' methodBody 
	;

methodBody
	:	'{' addSubExpressionList '}' 
	;

addSubExpressionList
	:	addSubExpression 
	;

parameterList
	:	parameter (',' parameter )* 
	;

parameter
	:	variableName 
	;

integerLiteral
	:	IntegerLiteral 
	;

floatingPointLiteral
	:	FloatingPointLiteral 
	;

Identifier
	:	[a-zA-Z_]+ 
	;

IntegerLiteral
	:	DecimalNumeral 
	;

fragment
DecimalNumeral
	:	'0' 
	|	NonZeroDigit Digits? 
	;

fragment
Digits
	:	Digit* 
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

FloatingPointLiteral
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
BinaryExponent
	:	BinaryExponentIndicator SignedInteger 
	;

fragment
BinaryExponentIndicator
	:	[pP] 
	;

PLUS
	:	'+' 
	;

MINUS
	:	'-' 
	;

MUL
	:	'*' 
	;

DIV
	:	'/' 
	;

MOD
	:	'%' 
	;

WS
	:	[ \t\r\n\u000C]+  ->skip
	;

COMMENT
	:	'/*' .* ? '*/'  ->skip
	;

LINE_COMMENT
	:	'//' ~[\r\n]*  ->skip
	;

