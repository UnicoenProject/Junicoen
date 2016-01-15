package net.unicoen.generator;

import java.io.PrintStream;

import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniImport;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniProgram;

public class JavaGeneratorForTurtle extends JavaGenerator {
	protected JavaGeneratorForTurtle(PrintStream out) {
		super(out);
	}

	
	@Override
	public void traverseClassDec(UniClassDec classDec) {
		String mod = safeJoin(classDec.modifiers, " ");
		String extendsdecl = "";
		if(classDec.superClass != null && classDec.superClass.size()>0){
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
	
	public static void generate(UniProgram fileDec, PrintStream out) {
		JavaGeneratorForTurtle g = new JavaGeneratorForTurtle(out);
		if(fileDec.imports.size()>0){
			for(UniImport importStatement : fileDec.imports){
				g.traverseImport(importStatement);
			}
			g.newline();
			g.newline();
		}		
		
		for(UniClassDec classDec : fileDec.classes){
			g.traverseClassDec(classDec);
		}
		
	}
}
