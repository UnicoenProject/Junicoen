package net.unicoen.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniImport;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniProgram;

public class JavaGeneratorForTurtle extends JavaGenerator {
	protected JavaGeneratorForTurtle(PrintStream out) {
		super(out);
	}

	@Override
	public void dontCallTraverseClassDec(UniClassDec classDec) {
		String mod = safeJoin(classDec.modifiers, " ");
		String extendsdecl = "";
		if (classDec.superClass != null && classDec.superClass.size() > 0) {
			extendsdecl = String.join(" ", "extends", classDec.superClass.get(0));
		}
		String declare = String.join(" ", mod, "class", classDec.className, extendsdecl, "{");
		print(declare);
		newline();
		newline();

		withIndent(() -> {
			for (UniMemberDec dec : iter(classDec.members)) {
				traverseMemberDec(dec);
				newline();
				newline();
			}
		});
		print("}");
	}

	public static String generate(UniProgram fileDec) {
		try (ByteArrayOutputStream out = new ByteArrayOutputStream(); PrintStream printer = new PrintStream(out)) {
			generate(fileDec, printer);
			return out.toString();
		} catch (IOException e) {
			return null;
		}
	}
	
	public static void generate(UniProgram fileDec, PrintStream out) {
		JavaGeneratorForTurtle g = new JavaGeneratorForTurtle(out);
		for(UniImport importStatement : fileDec.imports){
			g.traverseImport(importStatement);
		}
		
		g.newline();
		g.newline();
		
		for(UniExpr node : fileDec.nodes){
			if(node instanceof UniClassDec){
				g.traverseClassDec((UniClassDec)node);
			}
		}
	}
}
