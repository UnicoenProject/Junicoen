package net.unicoen.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import net.unicoen.node.UniClassDec;

public class JavaGenerator {

	private final PrintStream out;
	private int indent = 0;

	private JavaGenerator(PrintStream out) {
		this.out = out;
	}

	/**
	 * インデント付きで出力する。
	 */
	private void println(String str) {
		for (int i = 0; i < indent; i++) {
			out.print("\t");
		}
		out.println(str);
	}

	/**
	 * インデント付きで出力する。
	 */
	private void println(String format, Object... args) {
		println(String.format(format, args));
	}

	/**
	 * クラスの生成
	 */
	private void gen(UniClassDec classDec) {
		String mod = String.join(" ", classDec.modifiers);
		println("%s class %s {", mod, classDec.className);
		println("}");
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
		g.gen(classDec);
	}
}
