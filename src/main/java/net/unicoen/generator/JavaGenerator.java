package net.unicoen.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniStringLiteral;

public class JavaGenerator {

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

	/**
	 * クラスの生成
	 */
	private void genClass(UniClassDec classDec) {
		String mod = String.join(" ", classDec.modifiers);
		printlnIndent("%s class %s {", mod, classDec.className);
		indent++;
		for (UniMemberDec dec : iter(classDec.members)) {
			genMember(dec);
		}
		indent--;
		printlnIndent("}");
	}

	private void genMember(UniMemberDec memDec) {
		if (memDec instanceof UniMethodDec) {
			genMethodDec((UniMethodDec) memDec);
			return;
		}
		throw new RuntimeException("Unknown node: " + memDec);
	}

	private void genMethodDec(UniMethodDec methDec) {
		String mod = String.join(" ", methDec.modifiers);
		ArrayList<String> args = new ArrayList<>();
		for (UniArg arg : iter(methDec.args)) {
			args.add(arg.type + " " + arg.name);
		}
		String argWithParen = "(" + String.join(", ", args) + ")";
		printlnIndent(String.join(" ", mod, methDec.returnType, methDec.methodName, argWithParen, "{"));
		indent++;
		genBlockInner(methDec.block);
		indent--;
		printlnIndent("}");
	}

	private void genBlockInner(UniBlock block) {
		if (block == null) {
			return;
		}
		for (UniExpr expr : iter(block.body)) {
			printIndent();
			genExpr(expr);
			println(";");
		}
	}

	private void genExpr(UniExpr expr) {
		if (expr instanceof UniIdent) {
			print(((UniIdent) expr).name);
			return;
		}
		if (expr instanceof UniStringLiteral) {
			print('"' + ((UniStringLiteral) expr).value.replaceAll("\"", "\\\"") + '"');
			return;
		}
		if (expr instanceof UniFieldAccess) {
			UniFieldAccess fa = (UniFieldAccess) expr;
			genExpr(fa.receiver);
			print(".");
			print(fa.fieldName);
			return;
		}
		if (expr instanceof UniMethodCall) {
			UniMethodCall mCall = (UniMethodCall) expr;
			genExpr(mCall.receiver);
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
				genExpr(innerExpr);
			}
			print(")");
			return;
		}
		throw new RuntimeException("Unknown expr: " + expr);
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
		g.genClass(classDec);
	}

	// ----- ----- ----- ----- HELPER ----- ----- ----- -----

	private static <T> Iterable<T> iter(Iterable<T> iter) {
		if (iter == null) {
			return Collections.emptyList();
		}
		return iter;
	}
}
