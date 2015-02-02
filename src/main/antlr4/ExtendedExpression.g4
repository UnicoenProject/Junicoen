grammar ExtendedExpression;

@header{
	package net.unicoen.parser;
}

program :
		(ifStatement | expression)* EOF;
ifStatement :
		IF LEFTPAREN compareExp RIGHTPAREN LEFTBRACE RIGHTBRACE (  ELSE LEFTBRACE RIGHTBRACE ) ? ;
expression :
		compareExp | normalExp ;
compareExp :
		normalExp compareOp normalExp ;
compareOp :
		LARGER | LARGEROREQUALS | EQUALS | SMALLEROREQUALS | SMALLER ;
normalExp :
		term (  addSubOp term ) * ;
term :
		factor (  mulDivOp factor ) * ;
factor :
		number | LEFTPAREN normalExp RIGHTPAREN ;
number :
		integer | decimal ;
integer :
		ZERO | NONZERODIGIT digit* ;
decimal :
		NONZERODIGIT digit* DOT digit* | ZERO DOT digit* ;
mulDivOp :
		MUL | DIV ;
addSubOp :
		ADD | SUB ;
digit :
		ZERO | NONZERODIGIT ;
LEFTPAREN :
		'(' ;
RIGHTPAREN :
		')' ;
ZERO :
		'0' ;
NONZERODIGIT :
		'1' |'2' |'3' |'4' |'5' |'6' |'7' |'8' |'9' ;
ADD :
		'+' ;
SUB :
		'-' ;
MUL :
		'*' ;
DIV :
		'/' ;
DOT :
		'.' ;
LARGER :
		'>' ;
LARGEROREQUALS :
		'>=' ;
EQUALS :
		'==' ;
SMALLEROREQUALS :
		'<=' ;
SMALLER :
		'<' ;
IF :
		'if' ;
ELSE :
		'else' ;
LEFTBRACE :
		'{' ;
RIGHTBRACE :
		'}' ;
ID :
		[a-zA-Z] ;
SEMICOLON :
		';' ;
