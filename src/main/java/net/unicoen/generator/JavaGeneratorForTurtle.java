package net.unicoen.generator;

import java.io.PrintStream;

import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniMemberDec;

public class JavaGeneratorForTurtle extends JavaGenerator {
	protected JavaGeneratorForTurtle(PrintStream out) {
		super(out);
	}

	@Override
	public void traverseClassDec(UniClassDec classDec) {
		String mod = safeJoin(classDec.modifiers, " ");
		String declare = String.join(" ", mod, "class", classDec.className,
				"extends Turtle {");
		print(declare);
		newline();

		withIndent(() -> {
			print("public static void main (String[] args) {");
			newline();
			withIndent(() -> {
				print("Turtle.startTurtle(new " + classDec.className
						+ "(), args);");
				newline();
			});
			print("}");
			newline();
			newline();

			for (UniMemberDec dec : iter(classDec.members)) {
				traverseMemberDec(dec);
			}
		});
		newline();
		print("}");
		newline();
	}
}
