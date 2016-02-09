package net.unicoen.generator;

import java.io.PrintStream;

import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniMethodDec;

public class JavaScriptGeneratorForTurtle extends JavaScriptGenerator {
	public JavaScriptGeneratorForTurtle(PrintStream out) {
		super(out);
	}

	public static void generate(UniClassDec classDec, PrintStream out) {
		JavaScriptGeneratorForTurtle g = new JavaScriptGeneratorForTurtle(out);
		g.traverseClassDec(classDec);
	}

	@Override
	public void dontCallTraverseMethodDec(UniMethodDec node) {
		super.dontCallTraverseMethodDec(node);
		newline();
		print(node.methodName + "();");
	}
}
