package net.unicoen.mapper

import com.google.common.collect.Lists
import java.io.File
import java.io.FileInputStream
import java.util.ArrayList
import net.unicoen.node.UniBinOp
import net.unicoen.node.UniBlock
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniExpr
import net.unicoen.node.UniIdent
import net.unicoen.node.UniIf
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniMethodCall
import net.unicoen.node.UniMethodDec
import net.unicoen.node.UniNode
import net.unicoen.node.UniStringLiteral
import net.unicoen.node.UniUnaryOp
import net.unicoen.node.UniVariableDec
import net.unicoen.node.UniWhile
import net.unicoen.parser.ECMAScriptBaseVisitor
import net.unicoen.parser.ECMAScriptLexer
import net.unicoen.parser.ECMAScriptParser
import net.unicoen.parser.ECMAScriptParser.AdditiveExpressionContext
import net.unicoen.parser.ECMAScriptParser.ArgumentListContext
import net.unicoen.parser.ECMAScriptParser.ArgumentsContext
import net.unicoen.parser.ECMAScriptParser.AssignmentExpressionContext
import net.unicoen.parser.ECMAScriptParser.BlockContext
import net.unicoen.parser.ECMAScriptParser.EqualityExpressionContext
import net.unicoen.parser.ECMAScriptParser.ExpressionSequenceContext
import net.unicoen.parser.ECMAScriptParser.ExpressionStatementContext
import net.unicoen.parser.ECMAScriptParser.FunctionBodyContext
import net.unicoen.parser.ECMAScriptParser.FunctionDeclarationContext
import net.unicoen.parser.ECMAScriptParser.IdentifierExpressionContext
import net.unicoen.parser.ECMAScriptParser.IdentifierNameContext
import net.unicoen.parser.ECMAScriptParser.IfStatementContext
import net.unicoen.parser.ECMAScriptParser.LiteralContext
import net.unicoen.parser.ECMAScriptParser.MemberDotExpressionContext
import net.unicoen.parser.ECMAScriptParser.MultiplicativeExpressionContext
import net.unicoen.parser.ECMAScriptParser.NotExpressionContext
import net.unicoen.parser.ECMAScriptParser.NumericLiteralContext
import net.unicoen.parser.ECMAScriptParser.PostDecreaseExpressionContext
import net.unicoen.parser.ECMAScriptParser.PostIncrementExpressionContext
import net.unicoen.parser.ECMAScriptParser.RelationalExpressionContext
import net.unicoen.parser.ECMAScriptParser.SingleExpressionContext
import net.unicoen.parser.ECMAScriptParser.SourceElementContext
import net.unicoen.parser.ECMAScriptParser.StatementContext
import net.unicoen.parser.ECMAScriptParser.StatementListContext
import net.unicoen.parser.ECMAScriptParser.VariableDeclarationContext
import net.unicoen.parser.ECMAScriptParser.VariableDeclarationListContext
import net.unicoen.parser.ECMAScriptParser.VariableStatementContext
import net.unicoen.parser.ECMAScriptParser.WhileStatementContext
import net.unicoen.parser.ECMAScriptParser.FormalParameterListContext
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.TerminalNode
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import net.unicoen.node.UniProgram
import net.unicoen.node.UniArg
import net.unicoen.node.UniNew

class JavaScriptMapper extends ECMAScriptBaseVisitor<Object> {

	var _isDebugMode = true
	var className = "";

	def parse(String code) {
		className = "Test"
		parseCore(new ANTLRInputStream(code));
	}

	def parseFile(String path) {
		var file = new File(path)
		var fileName = file.name
		var tmp  = fileName.split("\\.tmp") as String[]
		fileName = tmp.get(1)
		tmp = fileName.split("\\.")
		className = tmp.get(0)
		

		val inputStream = new FileInputStream(path);
		try {
			var program = parseCore(new ANTLRInputStream(inputStream)) as UniProgram;
			
			var main = new UniMethodDec("main",Lists.newArrayList("public", "static"), "void", Lists.newArrayList(new UniArg("String[]", "args")),new UniBlock);
			var startTurtle = new UniMethodCall(new UniIdent("Turtle"), "startTurtle", Lists.newArrayList(new UniNew(className, Lists.newArrayList), new UniIdent("args")));
			main.block = new UniBlock(Lists.newArrayList(startTurtle), null);
			
			program.classes.get(0).className = className;
			program.classes.get(0).members.add(0,main);
			
			program	
		} finally {
			inputStream.close();
		}
	}

	def parseCore(CharStream chars) {
		val lexer = new ECMAScriptLexer(chars);
		val tokens = new CommonTokenStream(lexer);
		val parser = new ECMAScriptParser(tokens);
		val tree = parser.program // parse
		tree.visit
	}

	override public visit(ParseTree tree) {
		if (_isDebugMode) {

			if (!(tree instanceof ParserRuleContext)) {
				return visitTerminal(tree as TerminalNode)
			}

			var ruleName = ECMAScriptParser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
			println("*** visit" + ruleName + " ***")
			println(tree.text)
			val ret = tree.accept(this)
			println("returned: " + ret)
			ret
		} else {
			tree.accept(this)
		}
	}

	override public visitProgram(ECMAScriptParser.ProgramContext ctx) {
		var programModel = new UniProgram
		var dec = new UniClassDec
		dec.className = className
		dec.members = Lists.newArrayList
		dec.modifiers = Lists.newArrayList
		dec.superClass = Lists.newArrayList("Turtle")
			
		for (ParseTree node : ctx.children) {
			var nodeModel = node.visit as UniNode
			if (nodeModel instanceof UniMethodDec) {
				dec.members.add(nodeModel)
			} else { // UniBlockが返ってきた
				// メソッドブロック外に書いた処理 未実装
			}
		}
		
		programModel.classes = Lists.newArrayList(dec)
		
		programModel
	}

	// should return List or MethodDec
	override public visitSourceElements(ECMAScriptParser.SourceElementsContext ctx) {
		var UniBlock block = new UniBlock
		block.body = Lists.newArrayList

		for (ParseTree node : ctx.children) {
			var nodeUniModel = node.visit as UniNode
			// sourceElementはMethodDecかUniExprを返す 
			if (nodeUniModel instanceof UniMethodDec) {
				return nodeUniModel
			} else {
				block.body.add(nodeUniModel as UniExpr)
			}
		}
		block
	}

	override public visitSourceElement(SourceElementContext ctx) {
		for (ParseTree node : ctx.children) {
			if (node instanceof ECMAScriptParser.StatementContext) {
				return node.visit // return UniExpr
			} else { // functionDec
				return node.visit // return UniMethodDec
			}
		}
	}

	override public visitStatementList(ECMAScriptParser.StatementListContext ctx) {
		var statements = Lists.newArrayList

		for (ParseTree node : ctx.children) {
			statements.add(node.visit as UniExpr)
		}

		statements
	}

	override public visitFunctionDeclaration(FunctionDeclarationContext ctx) {
		var dec = new UniMethodDec
		dec.args = Lists.newArrayList
		dec.modifiers = Lists.newArrayList
		dec.returnType = "void" // とりあえず仮にvoidとしておく
		for (ParseTree node : ctx.children) {
			if (node instanceof FormalParameterListContext) {
				// メソッド引数のパース return List<UniArg>
			} else if (node instanceof FunctionBodyContext) {
				dec.block = if (node.children != null) {
					node.children.get(0).visit as UniBlock
				} else {
					new UniBlock(Lists.newArrayList, null)
				}
			} else if (node instanceof TerminalNodeImpl) {
				// 終端記号TerminalNodeImplのリストはECMAScriptParserに
				if (node.symbol.type == ECMAScriptParser.Identifier) {
					dec.methodName = node.text
				}
			}
		}
		dec
	}

//	functionBody: sourceElements?;
	override public visitFunctionBody(ECMAScriptParser.FunctionBodyContext ctx) {
		var block = new UniBlock

		for (ParseTree node : ctx.children) {
			block = node.visit as UniBlock
		}

		block
	}

//statement
// : block
// | variableStatement◯
// | emptyStatement
// | expressionStatement◯
// | ifStatement
// | iterationStatement
// | continueStatement
// | breakStatement
// | returnStatement
// | withStatement
// | labelledStatement
// | switchStatement
// | throwStatement
// | tryStatement
// | debuggerStatement
// ;
	override public visitStatement(StatementContext ctx) {
		for (ParseTree node : ctx.children) {
			return node.visit as UniExpr
		}
	}

	override public visitBlock(BlockContext ctx) {
		var block = new UniBlock(Lists.newArrayList, null)
		for (ParseTree node : ctx.children) {
			if (node instanceof StatementListContext) {
				block.body = node.visit as ArrayList<UniExpr>
			}
		}
		block
	}

//	ifStatement : If '(' expressionSequence ')' statement ( Else statement )?;	
	override public visitIfStatement(IfStatementContext ctx) {
		var ret = new UniIf

		for (ParseTree node : ctx.children) {
			if (node instanceof ECMAScriptParser.ExpressionSequenceContext) {
				ret.cond = node.visit as UniExpr
			} else if (node instanceof ECMAScriptParser.StatementContext) {
				if (ret.trueStatement == null) {
					ret.trueStatement = node.visit as UniExpr
				} else {
					ret.falseStatement = node.visit as UniExpr
				}
			}
		}

		ret
	}

	// While '(' expressionSequence ')' statement  
	override public visitWhileStatement(WhileStatementContext ctx) {
		var ret = new UniWhile
		for (ParseTree node : ctx.children) {
			if (node instanceof ECMAScriptParser.ExpressionSequenceContext) {
				ret.cond = node.visit as UniExpr
			} else if (node instanceof ECMAScriptParser.StatementContext) {
				ret.statement = node.visit as UniExpr
			}
		}

		ret
	}

	// variableStatement: Var variableDeclarationList eos
	override public visitVariableStatement(VariableStatementContext ctx) {
		// 変数宣言
		// とりあえずTurtle決め打ちで
		for (ParseTree node : ctx.children) {
			if (node instanceof VariableDeclarationListContext) {
				return node.visit as UniExpr
			}
		}
	}

	// variableDeclarationList : variableDeclaration ( ',' variableDeclaration )* ;
	override public visitVariableDeclarationList(ECMAScriptParser.VariableDeclarationListContext ctx) {
		for (ParseTree node : ctx.children) {
			return node.visit as UniExpr
		}
	}

	// VariableDeclaration : Identifier Initialiser?
	override public visitVariableDeclaration(VariableDeclarationContext ctx) {
		var dec = new UniVariableDec
		dec.modifiers = new ArrayList
		for (ParseTree node : ctx.children) {
			if (node instanceof TerminalNodeImpl) {
				dec.name = node.text
			} else { // initializer?
				dec.value = node.visit as UniExpr
			}
		}
		
		// TODO: Improve type inference routine
		if (dec.value == null) {
			dec.type = "Object"
		} else if (dec.value instanceof UniIntLiteral) {
			dec.type = "int"
		} else if (dec.value instanceof UniStringLiteral) {
			dec.type = "String"
		} else if (dec.value instanceof UniDoubleLiteral) {
			dec.type = "double"
		} else {
			dec.type = "Turtle"
		}

		dec
	}

	override public visitExpressionStatement(ExpressionStatementContext ctx) {
		for (ParseTree node : ctx.children) {
			return node.visit as UniExpr
		}
	}

	// expressionSequence: singleExpression ( ',' singleExpression )*;
	override public visitExpressionSequence(ExpressionSequenceContext ctx) {
		for (ParseTree node : ctx.children) {
			return node.visit as UniExpr
		}
	}

//singleExpression
// : Function Identifier? '(' formalParameterList? ')' '{' functionBody '}' # FunctionExpression
// | singleExpression '[' expressionSequence ']'                            # MemberIndexExpression
// | singleExpression '.' identifierName                                    # MemberDotExpression
// | singleExpression arguments                                             # ArgumentsExpression
// | New singleExpression arguments?                                        # NewExpression
// | singleExpression {!here(LineTerminator)}? '++'                         # PostIncrementExpression
// | singleExpression {!here(LineTerminator)}? '--'                         # PostDecreaseExpression
// | Delete singleExpression                                                # DeleteExpression
// | Void singleExpression                                                  # VoidExpression
// | Typeof singleExpression                                                # TypeofExpression
// | '++' singleExpression                                                  # PreIncrementExpression
// | '--' singleExpression                                                  # PreDecreaseExpression
// | '+' singleExpression                                                   # UnaryPlusExpression
// | '-' singleExpression                                                   # UnaryMinusExpression
// | '~' singleExpression                                                   # BitNotExpression
// | '!' singleExpression                                                   # NotExpression
// | singleExpression ( '*' | '/' | '%' ) singleExpression                  # MultiplicativeExpression
// | singleExpression ( '+' | '-' ) singleExpression                        # AdditiveExpression
// | singleExpression ( '<<' | '>>' | '>>>' ) singleExpression              # BitShiftExpression
// | singleExpression ( '<' | '>' | '<=' | '>=' ) singleExpression          # RelationalExpression
// | singleExpression Instanceof singleExpression                           # InstanceofExpression
// | singleExpression In singleExpression                                   # InExpression
// | singleExpression ( '==' | '!=' | '===' | '!==' ) singleExpression      # EqualityExpression
// | singleExpression '&' singleExpression                                  # BitAndExpression
// | singleExpression '^' singleExpression                                  # BitXOrExpression
// | singleExpression '|' singleExpression                                  # BitOrExpression
// | singleExpression '&&' singleExpression                                 # LogicalAndExpression
// | singleExpression '||' singleExpression                                 # LogicalOrExpression
// | singleExpression '?' singleExpression ':' singleExpression             # TernaryExpression
// | singleExpression '=' expressionSequence                                # AssignmentExpression
// | singleExpression assignmentOperator expressionSequence                 # AssignmentOperatorExpression
// | This                                                                   # ThisExpression
// | Identifier                                                             # IdentifierExpression
// | literal                                                                # LiteralExpression
// | arrayLiteral                                                           # ArrayLiteralExpression
// | objectLiteral                                                          # ObjectLiteralExpression
// | '(' expressionSequence ')'                                             # ParenthesizedExpression
// ;
	override public visitNotExpression(NotExpressionContext ctx) {
		// TODO Unary OP convertion !
	}

	override public visitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
		return parseBinaryOp(ctx)
	}

	override public visitAdditiveExpression(AdditiveExpressionContext ctx) {
		return parseBinaryOp(ctx)
	}

	override public visitRelationalExpression(RelationalExpressionContext ctx) {
		return parseBinaryOp(ctx)
	}

	override public visitEqualityExpression(EqualityExpressionContext ctx) {
		return parseBinaryOp(ctx)
	}

	override public visitAssignmentExpression(AssignmentExpressionContext ctx) {
		return parseBinaryOp(ctx)
	}

	override public visitPostIncrementExpression(PostIncrementExpressionContext ctx) {
		var op = new UniUnaryOp("_++", ctx.children.get(0).visit as UniExpr)
		return op
	}

	override public visitPostDecreaseExpression(PostDecreaseExpressionContext ctx) {
		var op = new UniUnaryOp("_--", ctx.children.get(0).visit as UniExpr)
		return op
	}

	def public parseBinaryOp(SingleExpressionContext ctx) {
		var binOp = new UniBinOp

		for (ParseTree node : ctx.children) {
			if (node instanceof TerminalNodeImpl) {
				if (isBinaryOperator(node.symbol.type)) {
					binOp.operator = node.text
				}
			} else {
				if (binOp.left == null) {
					binOp.left = node.visit as UniExpr
				} else {
					binOp.right = node.visit as UniExpr
				}
			}
		}
		binOp
	}

	def public isBinaryOperator(int type) {
		isAddapitiveOperator(type) || isRelationalOperator(type) || isAssignOperator(type) ||
			isMultiplicativeOperator(type)
	}

	// +, -かどうか
	def public isAddapitiveOperator(int type) {
		type == ECMAScriptParser.Plus || type == ECMAScriptParser.Minus
	}

	def public isMultiplicativeOperator(int type) {
		type == ECMAScriptParser.Divide || type == ECMAScriptParser.Multiply || type == ECMAScriptParser.Modulus
	}

	// =かどうか
	def public isAssignOperator(int type) {
		type == ECMAScriptParser.Assign
	}

	// >=,>,<.<=, ==かどうかを返す
	def public isRelationalOperator(int type) {
		type == ECMAScriptParser.LessThanEquals || type == ECMAScriptParser.LessThan ||
			type == ECMAScriptParser.MoreThan || type == ECMAScriptParser.GreaterThanEquals ||
			type == ECMAScriptParser.Equals
	}

			// EqualityExpression
			// singleExpression arguments
			override public visitArgumentsExpression(ECMAScriptParser.ArgumentsExpressionContext ctx) {
				var caller = new UniMethodCall
				for (ParseTree node : ctx.children) {
					if (node instanceof MemberDotExpressionContext) {
						caller = visit(node) as UniMethodCall
					} else if (node instanceof ECMAScriptParser.IdentifierExpressionContext) {
						caller.methodName = node.text
					} else if (node instanceof ArgumentsContext) {
						caller.args = visit(node) as ArrayList<UniExpr>
					}
				}
				caller
			}

			override public visitArguments(ArgumentsContext ctx) {
				var args = Lists.newArrayList

				for (ParseTree node : ctx.children) {
					if (node instanceof ECMAScriptParser.ArgumentListContext) {
						args = node.visit as ArrayList<UniExpr>
					}
				}

				args
			}

			override public visitArgumentList(ArgumentListContext ctx) {
				var ret = Lists.newArrayList
				for (ParseTree node : ctx.children) {
					ret.add(node.visit as UniExpr)
				}
				ret
			}

			// DotExpression : singleExpression.identifierName
			override public visitMemberDotExpression(MemberDotExpressionContext ctx) {
				var ret = new UniMethodCall
				for (ParseTree node : ctx.children) {
					if (node instanceof IdentifierNameContext) {
						ret.methodName = node.text
					} else if (node instanceof IdentifierExpressionContext) {
						ret.receiver = new UniIdent(node.text)
					}
				}
				ret
			}

			// Literal
			override public visitLiteral(LiteralContext ctx) {
				var node = ctx.children.get(0)

				if (node instanceof NumericLiteralContext) {
					return new UniIntLiteral(Integer.parseInt(ctx.text))
				} else if (node instanceof TerminalNodeImpl) {
					if (node.symbol.type == ECMAScriptParser.BooleanLiteral) {
						return new UniBoolLiteral(Boolean.valueOf(node.text))
					} else if (node.symbol.type == ECMAScriptParser.StringLiteral) {
						return new UniStringLiteral(node.text)
					} else {
						throw new RuntimeException(ctx.text + "is not implemented yet")
					}
				} else {
					return node.visit as UniExpr
				}
			}

			override public visitIdentifierExpression(ECMAScriptParser.IdentifierExpressionContext ctx) {
				return new UniIdent(ctx.text)
			}

		}