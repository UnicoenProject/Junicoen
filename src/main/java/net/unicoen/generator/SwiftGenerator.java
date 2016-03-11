package net.unicoen.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

import net.unicoen.node.Traverser;
import net.unicoen.node.UniArg;
import net.unicoen.node.UniArray;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniBreak;
import net.unicoen.node.UniCast;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniContinue;
import net.unicoen.node.UniDoWhile;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniEmptyStatement;
import net.unicoen.node.UniEnhancedFor;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniFieldDec;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniImport;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniLongLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNamespace;
import net.unicoen.node.UniNew;
import net.unicoen.node.UniNewArray;
import net.unicoen.node.UniProgram;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniTernaryOp;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;

public class SwiftGenerator extends Traverser {
	private final String NEW_LINE = System.getProperty("line.separator");

	private final PrintStream printOut;
	private int indent = 0;
	private boolean indentAtThisLine = false;
	private String className;
	private UniMethodDec mainDec = null;//store main() method

	private final IntStack exprPriority = new IntStack();

	protected SwiftGenerator(PrintStream printOut) {
		this.printOut = printOut;
		exprPriority.push(0);
	}

	protected void withIndent(Runnable runnable) {
		indent++;
		runnable.run();
		indent--;
	}

	protected void print(String str) {
		if (indentAtThisLine == false) {
			indentAtThisLine = true;
			for (int i = 0; i < indent; i++) {
				printOut.print("\t");
			}
		}
		printOut.print(str);
	}

	protected void newLine() {
		printOut.print(NEW_LINE);
		indentAtThisLine = false;
	}
	private String dataTypeTable(String type){
		switch(type){
		case "int":
			return "Int";
		case "float":
			return "Float";
		case "double":
			return "Double";
		case "String":
			return "String";
		}
		return "";
	}
	private int priorityTable(String operator) {
		switch (operator) {
		case "*":
		case "/":
		case "%":
			return 11;
		case "+":
		case "-":
			return 10;
		case ">>":
		case "<<":
			return 9;
		case ">":
		case ">=":
		case "<":
		case "<=":
		case "instanceof":
			return 8;
		case "==":
		case "!=":
			return 7;
		case "&":
			return 6;
		case "^":
			return 5;
		case "|":
			return 4;
		case "&&":
			return 3;
		case "||":
			return 2;
		case "?":
		case ":":
			return 1;
		}
		return 0;
	}

	private void parseExpr(UniExpr node, int priority) {
		exprPriority.push(priority);
		traverseExpr(node);
		exprPriority.pop();
	}

	protected void parseExpr(UniExpr node) {
		parseExpr(node, 0);
	}

	/**
	 * ステートメントを出力し、改行します。 関数呼び出し等の場合は、セミコロンも出力します。
	 */
	private void parseStatement(UniExpr expr) {
		parseExpr(expr);
//		if (expr.isStatement() == false) {
//			print(";");
//		}
		newLine();
	}

	/** インデントし、複数のステートメントを出力します */
	private void parseBlockInner(UniBlock block) {
		if(block.body!=null){
			withIndent(() -> {
				for (UniExpr expr : block.body)
					parseStatement(expr);
			});
		}
		else	return;
	}

	public static String generate(Object dec) {
		try (ByteArrayOutputStream out = new ByteArrayOutputStream();
				PrintStream printer = new PrintStream(out)) {
			generate((UniClassDec) dec, printer);
			return out.toString();
		} catch (IOException e) {
			return null;
		}
	}

	public static void generate(UniClassDec classDec, PrintStream out) {
		SwiftGenerator g = new SwiftGenerator(out);
		g.traverseClassDec(classDec);
	}

	// ----- ----- ----- ----- HELPER ----- ----- ----- -----

	protected static <T> Iterable<T> iter(Iterable<T> iter) {
		if (iter == null) {
			return Collections.emptyList();
		}
		return iter;
	}

	/*
	 * ***** ***** ***** ***** ***** ***** ***** ***** ***** ***** overrides
	 * ***** ***** ***** ***** ***** ***** ***** ***** ***** *****
	 */

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
		print("L");
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
		parseExpr(fa.receiver);
		print(".");
		print(fa.fieldName);
	}

	@Override
	public void traverseMethodCall(UniMethodCall mCall) {
		if (mCall.receiver != null) {
			parseExpr(mCall.receiver);
			print(".");
		}
		print(mCall.methodName);
		print("(");
		String delimiter = "";
		for (UniExpr innerExpr : iter(mCall.args)) {
			print(delimiter);
			delimiter = ", ";
			parseExpr(innerExpr);
		}
		print(")");
	}

	@Override
	public void traverseNew(UniNew node) {
		print("new ");
		print(node.type);
		print("(");
		String delimiter = "";
		for (UniExpr innerExpr : iter(node.args)) {
			print(delimiter);
			delimiter = ", ";
			parseExpr(innerExpr);
		}
		print(")");
	}

	@Override
	public void traverseUnaryOp(UniUnaryOp node) {
		if (node.operator.startsWith("_")) {
			parseExpr(node.expr);
			print(node.operator.substring(1));
		} else if (node.operator.endsWith("_")) {
			print(node.operator.substring(0, node.operator.length() - 1));
			parseExpr(node.expr);
		} else {
			print(node.operator);
			parseExpr(node.expr);
		}
	}

	@Override
	public void traverseBinOp(UniBinOp node) {
		int priority = priorityTable(node.operator) * 10 + 1;
		assert priority > 0;
		boolean requireParen = exprPriority.peek() >= priority;
		if (requireParen) {
			print("(");
		}
		parseExpr(node.left, priority - 1);
		print(" ");
		print(node.operator);
		print(" ");
		parseExpr(node.right, priority);
		if (requireParen) {
			print(")");
		}
	}

	@Override
	public void traverseTernaryOp(UniTernaryOp node) {
		parseExpr(node.cond);
		print(" ? ");
		parseExpr(node.trueExpr);
		print(" : ");
		parseExpr(node.falseExpr);
	}

	@Override
	public void traverseReturn(UniReturn node) {
		print("return ");
		parseExpr(node.value);
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
		if(((this.mainDec == null)&&(node != null))||(this.mainDec.block!=node))//have main method & current node is not the main method
			print("{");
		withIndent(() -> {
			if (node.blockLabel != null) {
				print("//" + node.blockLabel);
			}
		});
		newLine();
		parseBlockInner(node);
		
		if(((this.mainDec == null)&&(node != null))||(this.mainDec.block!=node))
			print("}");
	}

	@Override
	public void traverseIf(UniIf node) {
		print("if (");
		parseExpr(node.cond);
		print(")");
		if (node.trueStatement == null) {
			print("{");
			print("}");
		} else if (node.trueStatement instanceof UniBlock) {
			print(" ");
			traverseBlock((UniBlock) node.trueStatement);
		} else {
			newLine(); // ifの後ろの改行
			withIndent(() -> {
				parseStatement(node.trueStatement);
			});
		}
		if (node.falseStatement != null) {
			if (indentAtThisLine) {
				print(" "); // 閉じカッコがすでに出力されているので空白を開ける
			}
			print("else");
			if (node.falseStatement instanceof UniBlock) {
				print(" ");
				traverseBlock((UniBlock) node.falseStatement);
			} else {
				newLine(); // elseの後ろの改行
				withIndent(() -> {
					parseStatement(node.falseStatement);
				});
			}
		}
	}

	@Override
	public void traverseFor(UniFor node) {
		throw new RuntimeException("HOGE");
		// genBlock(node.block, () -> {
		// print("for (");
		// parseExpr(node.init);
		// print("; ");
		// parseExpr(node.cond);
		// print("; ");
		// parseExpr(node.step);
		// print(")");
		// }, null);
	}

	@Override
	public void traverseWhile(UniWhile node) {
		print("while (");
		parseExpr(node.cond);
		print(")");
		if (node.statement == null) {
			print("{");
			print("}");
		} else if (node.statement instanceof UniBlock) {
			print(" ");
			traverseBlock((UniBlock) node.statement);
		} else {
			newLine(); // whileの後ろの改行
			withIndent(() -> {
				parseStatement(node.statement);
			});
		}

		// genBlock(node.block, () -> {
		// print("while (");
		// parseExpr(node.cond);
		// print(")");
		// }, null);
	}

	@Override
	public void traverseDoWhile(UniDoWhile node) {
		throw new RuntimeException("HOGE");
		// print("do");
		// genBlockS(node.statement, "do", () -> {
		// print("while (");
		// parseExpr(node.cond);
		// print(");");
		// });
	}

	@Override
	//variale with value-----need to edit
	public void traverseVariableDec(UniVariableDec node) {
		if (node.modifiers != null) {
			for (String modifiers : node.modifiers) {
				print(modifiers);
				print(" ");
			}
		}
		String type = dataTypeTable(node.type);
		print("var "+node.name+" : "+type+";");
		if (node.value != null) {
			print(" = ");
			parseExpr(node.value);
		}
	}

	@Override
	public void traverseMethodDec(UniMethodDec node) {
		//if it is main method
		if(node.methodName.equals("main")){
			if(node.block==null||node.block.body.size()==0)	return;
			//if not empty-> store into mainDec temporary
			this.mainDec = node;
		}else{
			String modifiers = String.join(" ", node.modifiers);
		
			ArrayList<String> args = new ArrayList<>();
			for (UniArg arg : iter(node.args)) {
				args.add(arg.name+" : "+arg.type);
			}
			String argWithParen = "(" + String.join(", ", args) + ")";
			//if it is constructor -> traverse to "init"
			String declaration;
			if(this.className.equals(node.methodName)){//constructor
				declaration = "init"+argWithParen;
			}else{
				String returnType = "->"+node.returnType;
				if(node.returnType.equals("void"))	returnType = "";
					declaration = String.join(" ", modifiers, "func",
							node.methodName, argWithParen, returnType);
			}
			print(declaration + ' ');
			traverseBlock(node.block);
		}
	}

	@Override
	public void traverseArg(UniArg node) {
		// TODO Auto-generated method stub
	}

	@Override
	public void traverseClassDec(UniClassDec node) {
		this.className = node.className;
		String modifiers = safeJoin(node.modifiers, " ");
		String declaration = String.join(" ", modifiers, "class", node.className, " ");
		print(declaration);
		if(node.superClass!=null&&node.superClass.size()!=0){
			String superclass = " : "+node.superClass.get(0);
			print(superclass);
		}
		print("{");
		newLine();

		withIndent(() -> {
			for (UniMemberDec dec : iter(node.members)) {
				traverseMemberDec(dec);
			}
		});
		newLine();
		print("}");
		if(this.mainDec!=null){
			//get the inside of main method and append after class declaration
			traverseBlock(this.mainDec.block);
		}
		newLine();
	}

	@Override
	public void traverseFieldDec(UniFieldDec node) {
		String modifiers = safeJoin(node.modifiers, " ");
		String declaration = String.join(" ", modifiers, node.type, node.name);
		print(declaration);
		
		if(node.value != null){
			print(" = ");
			parseExpr(node.value);
		}
		print(";");
	}

	@Override
	public void traverseArray(UniArray node) {
		throw new RuntimeException("Not Implemented");
	}

	@Override
	public void traverseNewArray(UniNewArray node) {
		throw new RuntimeException("Not Implemented");
	}

	public static String safeJoin(Iterable<String> objs, String delimiter) {
		if (objs == null) {
			return "";
		} else {
			return String.join(delimiter, objs);
		}
	}

	@Override
	public void traverseCast(UniCast node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseEnhancedFor(UniEnhancedFor node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseEmptyStatement(UniEmptyStatement node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseProgram(UniProgram node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseImport(UniImport node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseNamespace(UniNamespace node) {
		// TODO Auto-generated method stub
		
	}
}
