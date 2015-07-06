package net.unicoen.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

import net.unicoen.node.Traverser;
import net.unicoen.node.UniArg;
import net.unicoen.node.UniArray;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniBreak;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniContinue;
import net.unicoen.node.UniDoWhile;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniFieldDec;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniLongLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniTernaryOp;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;

public class JavaGenerator extends Traverser {

	private final PrintStream out;
	private int indent = 0;
	private boolean indentAtThisLine = false;

	private final IntStack exprPriority = new IntStack();

	private JavaGenerator(PrintStream out) {
		this.out = out;
		exprPriority.push(0);
	}

	private void withIndent(Runnable runnable) {
		indent++;
		runnable.run();
		indent--;
	}

	private void print(String str) {
		if (indentAtThisLine == false) {
			indentAtThisLine = true;
			for (int i = 0; i < indent; i++) {
				out.print("\t");
			}
		}
		out.print(str);
	}

	private void newline() {
		out.print("\n");
		indentAtThisLine = false;
	}

	private void x_println(String str) {
		print(str);
		newline();
	}

	private int priorityTable(String operator) {
		switch (operator) {
		case "*":
		case "/":
		case "%":
			return 11;
		case "+":
		case "-":
			return 10;
		case ">>":
		case "<<":
			return 9;
		case ">":
		case ">=":
		case "<":
		case "<=":
		case "instanceof":
			return 8;
		case "==":
		case "!=":
			return 7;
		case "&":
			return 6;
		case "^":
			return 5;
		case "|":
			return 4;
		case "&&":
			return 3;
		case "||":
			return 2;
		case "?":
		case ":":
			return 1;
		}
		return 0;
	}

	private void parseExpr(UniExpr node, int priority) {
		exprPriority.push(priority);
		traverseExpr(node);
		exprPriority.pop();
	}

	private void parseExpr(UniExpr node) {
		parseExpr(node, 0);
	}

	/**
	 * ステートメントを出力し、改行します。 関数呼び出し等の場合は、セミコロンも出力します。
	 */
	private void parseStatement(UniExpr expr) {
		parseExpr(expr);
		if (expr.isStatement() == false) {
			print(";");
		}
		newline();
	}

	/** インデントし、複数のステートメントを出力します */
	private void parseBlockInner(UniBlock block) {
		withIndent(() -> {
			for (UniExpr expr : block.body)
				parseStatement(expr);
		});
	}

	public static String generate(UniClassDec dec) {
		try (ByteArrayOutputStream out = new ByteArrayOutputStream();
				PrintStream printer = new PrintStream(out)) {
			generate(dec, printer);
			return out.toString();
		} catch (IOException e) {
			return null;
		}
	}

	public static void generate(UniClassDec classDec, PrintStream out) {
		JavaGenerator g = new JavaGenerator(out);
		g.traverseClassDec(classDec);
	}

	// ----- ----- ----- ----- HELPER ----- ----- ----- -----

	private static <T> Iterable<T> iter(Iterable<T> iter) {
		if (iter == null) {
			return Collections.emptyList();
		}
		return iter;
	}

	/* ***** ***** ***** ***** ***** ***** ***** ***** ***** *****
	 * overrides ***** ***** ***** ***** ***** ***** ***** ***** ***** *****
	 */

	@Override
	public void traverseBoolLiteral(UniBoolLiteral node) {
		print(node.value ? "true" : "false");
	}

	@Override
	public void traverseIntLiteral(UniIntLiteral node) {
		print(Integer.toString(node.value));
	}

	@Override
	public void traverseLongLiteral(UniLongLiteral node) {
		print(Long.toString(node.value));
		print("L");
	}

	@Override
	public void traverseDoubleLiteral(UniDoubleLiteral node) {
		print(Double.toString(node.value));
	}

	@Override
	public void traverseStringLiteral(UniStringLiteral node) {
		print('"' + node.value.replaceAll("\"", "\\\"") + '"');
	}

	@Override
	public void traverseIdent(UniIdent node) {
		print(node.name);
	}

	@Override
	public void traverseFieldAccess(UniFieldAccess fa) {
		parseExpr(fa.receiver);
		print(".");
		print(fa.fieldName);
	}

	@Override
	public void traverseMethodCall(UniMethodCall mCall) {
		parseExpr(mCall.receiver);
		print(".");
		print(mCall.methodName);
		print("(");
		boolean isFirst = true;
		for (UniExpr innerExpr : iter(mCall.args)) {
			if (isFirst) {
				isFirst = false;
			} else {
				print(", ");
			}
			parseExpr(innerExpr);
		}
		print(")");
	}

	@Override
	public void traverseUnaryOp(UniUnaryOp node) {
		if (node.operator.startsWith("_")) {
			parseExpr(node.expr);
			print(node.operator.substring(1));
		} else if (node.operator.endsWith("_")) {
			print(node.operator.substring(0, node.operator.length() - 1));
			parseExpr(node.expr);
		} else {
			print(node.operator);
			parseExpr(node.expr);
		}
	}

	@Override
	public void traverseBinOp(UniBinOp node) {
		int priority = priorityTable(node.operator) * 10 + 1;
		assert priority > 0;
		boolean requireParen = exprPriority.peek() >= priority;
		if (requireParen) {
			print("(");
		}
		parseExpr(node.left, priority - 1);
		print(" ");
		print(node.operator);
		print(" ");
		parseExpr(node.right, priority);
		if (requireParen) {
			print(")");
		}
	}

	@Override
	public void traverseTernaryOp(UniTernaryOp node) {
		parseExpr(node.cond);
		print(" ? ");
		parseExpr(node.trueExpr);
		print(" : ");
		parseExpr(node.falseExpr);
	}

	@Override
	public void traverseReturn(UniReturn node) {
		print("return ");
		parseExpr(node.value);
	}

	@Override
	public void traverseBreak(UniBreak node) {
		print("break");
	}

	@Override
	public void traverseContinue(UniContinue node) {
		print("continue");
	}

	@Override
	public void traverseBlock(UniBlock node) {
		x_println("{");
		parseBlockInner(node);
		x_println("}");
	}

	@Override
	public void traverseIf(UniIf node) {
		print("if (");
		parseExpr(node.cond);
		print(")");
		if (node.trueStatement == null) {
			x_println(" {");
			print("}");
		} else if (node.trueStatement instanceof UniBlock) {
			x_println(" {");
			parseBlockInner((UniBlock) node.trueStatement);
			print("}");
		} else {
			newline(); // ifの後ろの改行
			withIndent(() -> {
				parseStatement(node.trueStatement);
			});
		}
		if (node.falseStatement != null) {
			if (indentAtThisLine) {
				print(" "); // 閉じカッコがすでに出力されているので空白を開ける
			}
			print("else");
			if (node.falseStatement instanceof UniBlock) {
				x_println(" {");
				parseBlockInner((UniBlock) node.falseStatement);
				println("}");
			} else {
				newline(); // elseの後ろの改行
				withIndent(() -> {
					parseStatement(node.falseStatement);
				});
			}
		}
	}

	@Override
	public void traverseFor(UniFor node) {
		throw new RuntimeException("HOGE");
		// genBlock(node.block, () -> {
		// print("for (");
		// parseExpr(node.init);
		// print("; ");
		// parseExpr(node.cond);
		// print("; ");
		// parseExpr(node.step);
		// print(")");
		// }, null);
	}

	@Override
	public void traverseWhile(UniWhile node) {
		throw new RuntimeException("HOGE");
		// genBlock(node.block, () -> {
		// print("while (");
		// parseExpr(node.cond);
		// print(")");
		// }, null);
	}

	@Override
	public void traverseDoWhile(UniDoWhile node) {
		throw new RuntimeException("HOGE");
		genBlockS(node.statement, "do", () -> {
			print("while (");
			parseExpr(node.cond);
			print(");");
		});
	}

	@Override
	public void traverseVariableDec(UniVariableDec node) {
		if (node.modifiers != null) {
			for (String mod : node.modifiers) {
				print(mod);
				print(" ");
			}
		}
		print(String.join(" ", node.type, node.name));
		print(" = ");
		parseExpr(node.value);
	}

	@Override
	public void traverseMethodDec(UniMethodDec methDec) {
		String mod = String.join(" ", methDec.modifiers);
		ArrayList<String> args = new ArrayList<>();
		for (UniArg arg : iter(methDec.args)) {
			args.add(arg.type + " " + arg.name);
		}
		String argWithParen = "(" + String.join(", ", args) + ")";
		String declare = String.join(" ", mod, methDec.returnType,
				methDec.methodName, argWithParen);
		genBlockS(methDec.block, declare, null);
	}

	@Override
	public void traverseArg(UniArg node) {
		// TODO Auto-generated method stub
	}

	@Override
	public void traverseClassDec(UniClassDec classDec) {
		String mod = String.join(" ", classDec.modifiers);
		printlnIndent("%s class %s {", mod, classDec.className);
		indent++;
		for (UniMemberDec dec : iter(classDec.members)) {
			traverseMemberDec(dec);
		}
		indent--;
		printlnIndent("}");
	}

	@Override
	public void traverseFieldDec(UniFieldDec node) {
		throw new RuntimeException("Not Implemented");
	}

	@Override
	public void traverseArray(UniArray node) {
		throw new RuntimeException("Not Implemented");
	}
}
