package net.unicoen.generator;

import java.io.PrintStream;

import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniProgram;

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
		if(!node.methodName.equals("main")){
			super.dontCallTraverseMethodDec(node);
			newline();
			if(node.methodName.equals("start")){
				print(node.methodName + "();");	
			}	
		}		
	}
	
	public static void generate(UniProgram program, PrintStream out) {
		JavaScriptGeneratorForTurtle g = new JavaScriptGeneratorForTurtle(out);
		for(UniExpr node : program.nodes){
			if(node instanceof UniClassDec){
				g.traverseClassDec((UniClassDec)node);
			}
		}
	}
}
