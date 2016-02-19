package net.unicoen.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniProgram;
import net.unicoen.node.UniVariableDec;

public class JavaScriptGenerator extends JavaGenerator {

	public JavaScriptGenerator(PrintStream out) {
		super(out);
	}

	@Override
	public void dontCallTraverseVariableDec(UniVariableDec node) {
		print(String.join(" ", "var", node.name));

		if (node.value != null) {
			print(" = ");
			parseExpr(node.value);
		}
	}

	@Override
	public void dontCallTraverseMethodDec(UniMethodDec node) {
		ArrayList<String> args = new ArrayList<>();
		if (node.args != null) {
			for (UniArg arg : node.args) {
				args.add(arg.name);
			}
		}

		print("function " + node.methodName + "(" + String.join(", ", args)
				+ ")");
		traverseBlock(node.block);
	}

	@Override
	public void dontCallTraverseClassDec(UniClassDec node) {
		for (UniMemberDec dec : JavaGenerator.iter(node.members)) {
			traverseMemberDec(dec);
		}
	}

	public static String generate(UniClassDec dec) {
		try (ByteArrayOutputStream out = new ByteArrayOutputStream();
				PrintStream printer = new PrintStream(out)) {
			generate(dec, printer);
			return out.toString();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return e.getMessage();
		}
	}
	
	public static String generate(UniProgram dec) {
		try (ByteArrayOutputStream out = new ByteArrayOutputStream();
			PrintStream printer = new PrintStream(out)) {
			generate(dec.classes.get(0), printer);
			return out.toString();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return e.getMessage();
		}
	}
	

	public static void generate(UniClassDec classDec, PrintStream out) {
		JavaScriptGenerator g = new JavaScriptGenerator(out);
		g.traverseClassDec(classDec);
	}

}
