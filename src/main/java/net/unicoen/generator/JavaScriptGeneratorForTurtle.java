package net.unicoen.generator;

import java.io.PrintStream;

import net.unicoen.node.UniMethodDec;

public class JavaScriptGeneratorForTurtle extends JavaScriptGenerator {
	public JavaScriptGeneratorForTurtle(PrintStream out) {
		super(out);
	}

	@Override
	public void traverseMethodDec(UniMethodDec node) {
		super.traverseMethodDec(node);
		newline();
		print(node.methodName + "();");
	}
}
