package net.unicoen.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

import net.unicoen.node.Traverser;
import net.unicoen.node.UniArg;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniBreak;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniCondOp;
import net.unicoen.node.UniContinue;
import net.unicoen.node.UniDecVar;
import net.unicoen.node.UniDecVarWithValue;
import net.unicoen.node.UniDoWhile;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
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
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniWhile;

public class JavaGenerator extends Traverser {

	private final PrintStream out;
	private int indent = 0;

	private JavaGenerator(PrintStream out) {
		this.out = out;
	}

	/**
	 * インデントする
	 */
	private void printIndent() {
		for (int i = 0; i < indent; i++) {
			out.print("\t");
		}
	}

	private void print(String str) {
		out.print(str);
	}

	private void println(String str) {
		out.println(str);
	}

	/**
	 * インデント付きで出力する。
	 */
	private void printlnIndent(String str) {
		printIndent();
		out.println(str);
	}

	/**
	 * インデント付きで出力する。
	 */
	private void printlnIndent(String format, Object... args) {
		printlnIndent(String.format(format, args));
	}

	private void genBlockInnerS(UniBlock block, String preStatement, Runnable afterBlock) {
		genBlockInner(block, () ->{ print(preStatement); }, afterBlock);
	}

	private void genBlockInner(UniBlock block, Runnable beforeBlock, Runnable afterBlock) {
		if (beforeBlock != null) {
			printIndent();
			beforeBlock.run();
			println(" {");
		} else {
			printlnIndent("{");
		}
		indent++;
		if (block != null) {
			for (UniExpr expr : iter(block.body)) {
				if (expr.isStatement()) {
					traverseExpr(expr);
				} else {
					printIndent();
					traverseExpr(expr);
					println(";");
				}
			}
		}
		indent--;
		if (afterBlock != null) {
			printIndent();
			print("} ");
			afterBlock.run();
			println("");
		} else {
			printlnIndent("}");
		}
	}

	public static String generate(UniClassDec dec) {
		try (ByteArrayOutputStream out = new ByteArrayOutputStream(); PrintStream printer = new PrintStream(out)) {
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
	 * overrides
	 * ***** ***** ***** ***** ***** ***** ***** ***** ***** ***** */

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
		traverseExpr(fa.receiver);
		print(".");
		print(fa.fieldName);
	}

	@Override
	public void traverseMethodCall(UniMethodCall mCall) {
		traverseExpr(mCall.receiver);
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
			traverseExpr(innerExpr);
		}
		print(")");
	}

	@Override
	public void traverseUnaryOp(UniUnaryOp node) {
		print(node.operator);
		traverseExpr(node.expr);
	}

	@Override
	public void traverseBinOp(UniBinOp node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseCondOp(UniCondOp node) {
		traverseExpr(node.cond);
		print(" ? ");
		traverseExpr(node.trueExpr);
		print(" : ");
		traverseExpr(node.falseExpr);
	}

	@Override
	public void traverseReturn(UniReturn node) {
		print("return ");
		traverseExpr(node.value);
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
		genBlockInner(node, null, null);
	}

	@Override
	public void traverseIf(UniIf node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseFor(UniFor node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseWhile(UniWhile node) {

		// TODO Auto-generated method stub

	}

	@Override
	public void traverseDoWhile(UniDoWhile node) {
		genBlockInnerS(node.block, "do", () -> {
			print("while (");
			traverseExpr(node.cond);
			print(";");
		});
	}

	@Override
	public void traverseDecVar(UniDecVar node) {
		String mod = String.join(" ", node.modifiers);
		printlnIndent(String.join(" ", mod, node.type, node.name));
	}

	@Override
	public void traverseDecVarWithValue(UniDecVarWithValue node) {
		String mod = String.join(" ", node.modifiers);
		printIndent();
		print(String.join(" ", mod, node.type, node.name));
		print(" = ");
		traverseExpr(node.value);
	}

	@Override
	public void traverseMethodDec(UniMethodDec methDec) {
		String mod = String.join(" ", methDec.modifiers);
		ArrayList<String> args = new ArrayList<>();
		for (UniArg arg : iter(methDec.args)) {
			args.add(arg.type + " " + arg.name);
		}
		String argWithParen = "(" + String.join(", ", args) + ")";
		String declare = String.join(" ", mod, methDec.returnType, methDec.methodName, argWithParen);
		genBlockInnerS(methDec.block, declare, null);
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
}
