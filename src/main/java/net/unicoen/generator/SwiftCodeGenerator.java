package net.unicoen.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

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
import net.unicoen.node.UniEnumConstant;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniFieldDec;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniImport;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniInterfaceDec;
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
import net.unicoen.node.UniSwitch;
import net.unicoen.node.UniSwitchUnit;
import net.unicoen.node.UniTernaryOp;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;

public class SwiftCodeGenerator extends Traverser {
	private final String NEW_LINE = System.getProperty("line.separator");

	//variable declaration
	//"final" declaration without value -> var
	//"final" declaration with value -> let
	
	//value of variable including UniIdent -> cast
	private final PrintStream printOut;
	private int indent = 0;
	private boolean indentAtThisLine = false;
	private String className;
	private UniMethodDec mainDec = null;//store main() method
	private String varType = "";

	private final IntStack exprPriority = new IntStack();

	protected SwiftCodeGenerator(PrintStream printOut) {
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

	protected void printNewLine() {
//		printOut.print(NEW_LINE);
		printOut.println();
		indentAtThisLine = false;
	}
	private String toSwiftDataType(String type){
		switch(type){
		case "int":
			return "Int";
		case "float":
			return "Float";
		case "double":
			return "Double";
		case "String":
			return "String";
		case "boolean":
			return "Boolean";
		case "Integer":
			return "Int";
		}
		if(type.contains("[")){ //array
			return toSwiftArrayType(type);
		}
		return type;
	}
	private String toSwiftArrayType(String type) {
		// TODO Auto-generated method stub
		//split type to two strings by "["
		StringTokenizer st = new StringTokenizer(type, "[");
		String[] temp = new String[st.countTokens()];
		int strLeng = st.countTokens();
		for (int i=0; i<strLeng; i++) {
			temp[i] = st.nextToken();
		}
		switch(temp[0]){
		case "int":
			return "[Int"+temp[1];
		case "float":
			return "[Float"+temp[1];
		case "double":
			return "[Double"+temp[1];
		case "String":
			return "[String"+temp[1];
		case "boolean":
			return "[Boolean"+temp[1];
		}
		return null;
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
//		if (node instanceof UniIdent) {//change data type
//			//print cast(var)
//			print(varType);
//			print("(");
//			traverseIdent((UniIdent)node);
//			print(")"); 
//			return;
//		}else{
			traverseExpr(node);
//		}
		exprPriority.pop();
	}

	protected void parseExpr(UniExpr node) {
		parseExpr(node, 0);
	}

	private void parseStatement(UniExpr expr) {
		parseExpr(expr);
//		if (expr.isStatement() == false) {
//			print(";");
//		}
		printNewLine();
	}

	private void parseBlockInner(UniBlock block) {
		if(block.body!=null){
//			withIndent(() -> {
				for (UniExpr expr : block.body)
					parseStatement(expr);
//			});
		}
		else	return;
	}

	public static String generate(Object dec) {
		try (ByteArrayOutputStream out = new ByteArrayOutputStream();
				PrintStream printer = new PrintStream(out)) {
			generate((UniProgram) dec, printer);
			return out.toString();
		} catch (IOException e) {
			return null;
		}
	}

	public static void generate(UniProgram program, PrintStream out) {
		SwiftCodeGenerator g = new SwiftCodeGenerator(out);
		if(program.imports!= null){
			for (UniImport importStatement : program.imports) {
				g.traverseImport(importStatement);
			}			
		}
		if(program.classes!=null){
			for (UniClassDec classDec : program.classes) {
				g.traverseClassDec(classDec);
			}
		}
		if(program.interfaces!=null){
			for(UniInterfaceDec interfaceDec : program.interfaces){
				g.traverseInterfaceDec(interfaceDec);
			}
		}
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
		if(fa.receiver!=null){
			parseExpr(fa.receiver);
		}
		if(fa.fieldName!=null){
			print(".");
			print(fa.fieldName);
		}
		if(fa.index!=null){
			print("[");
			parseExpr(fa.index);
			print("]");
		}
	}

	@Override
	public void traverseMethodCall(UniMethodCall mCall) {
		//analyze system.out.println
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
		if(node.type.equals("Dictionary")){
			node.type = "";
			print("[");
			String delimiter = "";
			for (UniExpr innerExpr : iter(node.args)) {
				print(delimiter);
				delimiter = ": ";
				parseExpr(innerExpr);
			}
			print("]");
			print("(");
			print(")");
			
		}else{
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
	}

	@Override
	public void traverseUnaryOp(UniUnaryOp node) {
		if (node.operator.startsWith("_")) {//++i
			parseExpr(node.expr);
			print(node.operator.substring(1));
			print("1");
		} else if (node.operator.endsWith("_")) {//i++
			parseExpr(node.expr);
			print("=");
			parseExpr(node.expr);
			print(node.operator.substring(0, node.operator.length()-1));
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
		if((node.left!=null)&&(node.right==null)){
			parseExpr(node.left, priority);
			print(" ");
			print(node.operator);
			print(" ");
			parseExpr(node.right, priority-1);
			if (requireParen) {
				print(")");
			}
		}
		else{
			parseExpr(node.left, priority - 1);
			print(" ");
			print(node.operator);
			print(" ");
			parseExpr(node.right, priority);
			if (requireParen) {
				print(")");
			}
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
		if(node.value != null)
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
//		if(((this.mainDec == null)&&(node != null))||(this.mainDec.block!=node))//have main method & current node is not the main method
//			print("{");
		withIndent(() -> {
			if (node.blockLabel != null) {
				print("//" + node.blockLabel);
			}
		});
		printNewLine();
		parseBlockInner(node);
		
//		if(((this.mainDec == null)&&(node != null))||(this.mainDec.block!=node))
//			print("}");
	}

	@Override
	public void traverseIf(UniIf node) {
		printNewLine();
		print("if");
		print(" ");
		parseExpr(node.cond);

		if(node.trueStatement!=null){
			print(" ");
			print("{");
			printNewLine();
			if (node.trueStatement instanceof UniBlock) {
				withIndent(()-> {
					traverseBlock((UniBlock) node.trueStatement);
				});
				
			} else {
				withIndent(() -> {
					parseStatement(node.trueStatement);
				});
			}
			print("}");
			printNewLine();
			
		}
		
		if (node.falseStatement != null) {
			print("else");
			print(" ");
			print("{");
			printNewLine();
			if (node.falseStatement instanceof UniBlock) {
				withIndent(() -> {
					traverseBlock((UniBlock) node.falseStatement);
				});
			} else {
				withIndent(() -> {
					parseStatement(node.falseStatement);
				});
			}
			print("}");
			
		}
	}

	@Override
	public void traverseFor(UniFor node) {
		print("for");
		print(" ");
		parseExpr(node.init);
		print("; ");
		parseExpr(node.cond);
		print("; ");
		parseExpr(node.step);
		if (node.statement instanceof UniBlock) {
			print(" ");
			print("{");
			withIndent(() -> {
				traverseBlock((UniBlock) node.statement);
			});
			print("}");
		} else {
			print(" ");
			print("{");
			printNewLine();
			withIndent(() -> {
				parseStatement(node.statement);
			});
			printNewLine();
			print("}");
		}
	}

	@Override
	public void traverseWhile(UniWhile node) {
		print("while");
		print(" ");
		parseExpr(node.cond);
		if (node.statement instanceof UniBlock) {
			print(" ");
			print("{");
			withIndent(() -> {
				traverseBlock((UniBlock) node.statement);
			});
			print("}");
		} else {
			print(" ");
			print("{");
			printNewLine();
			withIndent(() -> {
				parseStatement(node.statement);
			});
			print("}");
			printNewLine();
		}
	}

	@Override
	public void traverseDoWhile(UniDoWhile node) {
		//throw new RuntimeException("HOGE");
		print("repeat");
		print(" ");
		if(node.statement instanceof UniBlock){
			print("{");
			if(((UniBlock)node.statement).body != null){
				withIndent(()-> {
					traverseBlock((UniBlock) node.statement);
				});
			}
			print("}");
		}
		print("while");
		print(" ");
		if(node.cond != null){
			parseExpr(node.cond);
		}
		print(" ");
	}

	@Override
	//variale with value-----need to edit
	public void traverseVariableDec(UniVariableDec node) {
		if (node.modifiers != null) {
			for (String modifier : node.modifiers) {
				print(modifier);
				print(" ");
			}
		}
		print(node.name);
		if(node.type!=""){
			print(" : ");
			print(toSwiftDataType(node.type));
		}
		if((node.value!=null)&&(!(node.value instanceof UniNewArray))){
			print(" = ");
			parseExpr(node.value);
		}
		
//		declaration = String.join(" ", , node2.name, ":", toSwiftDataType(node2.type));
//		if((node2.value!=null)&&(!(node2.value instanceof UniNewArray))){
//			declaration = declaration + "=";
//		}
//		print(declaration);
//		if((node2.value!=null)&&(!(node2.value instanceof UniNewArray))){
//			varType = toSwiftDataType(node2.type);//for Cast
//			parseExpr(node2.value);
//		}
	}

	@Override
	public void traverseMethodDec(UniMethodDec node) {
		//if it is main method
		if(node.methodName.equals("main")){
			if(node.block==null||node.block.body.size()==0)	return;
			//if not empty-> store into mainDec temporary
			this.mainDec = node;
		}else{
			String modifier = "";
			if(node.methodName!="init"){
				for (String temp : iter(node.modifiers)) {
					if (temp.equals("public")) {
						modifier = "public";
					}
				}
			}
			ArrayList<String> args = new ArrayList<>();
			for (UniArg arg : iter(node.args)) {
				String argtype = toSwiftDataType(arg.type);
				args.add(arg.name+" : "+argtype);
			}
			String argWithParen = "(" + String.join(", ", args) + ")";
			//if it is constructor -> traverse to "init"
			String declaration;
			String returnType  = "";
			if(node.returnType!=null){
				if(!(node.returnType.equals("void"))){
					returnType = toSwiftDataType(node.returnType);
					returnType = "->"+returnType;
				}
			}
			if(node.methodName=="init"){
				declaration = String.join(" ",node.methodName, argWithParen);
			} else {
				declaration = String.join(" ", modifier, "func", node.methodName, argWithParen, returnType);
			}
			print(declaration + ' ');
			print("{");
			withIndent(() -> {
				traverseBlock(node.block);
			});
			print("}");
			
		}
	}

	@Override
	public void traverseArg(UniArg node) {
		// TODO Auto-generated method stub
	}

	@Override
	public void traverseClassDec(UniClassDec node) {
		String modifiers = "";
		String declaration = "";
		String keyword = "class";
		if(node.className.startsWith("_")){
			node.className = node.className.substring(1,node.className.length());
			keyword = "enum";
		}
		if(node.modifiers!=null){
			modifiers = safeJoin(node.modifiers, " ");
			declaration = String.join(" ", modifiers, keyword, node.className);
		}else{
			declaration = String.join(" ", keyword, node.className);
		}
		print(declaration);
		
		if(node.superClass!=null&&node.superClass.size()!=0){
			String superclass = " : "+node.superClass.get(0);
			print(superclass);
		}
		print("{");
		printNewLine();

		withIndent(() -> {
			for (UniMemberDec dec : iter(node.members)) {
				traverseMemberDec(dec);
				printNewLine();
			}
		});
		printNewLine();
		print("}");
		if(this.mainDec!=null){
			//get the inside of main method and append after class declaration
			traverseBlock(this.mainDec.block);
		}
		printNewLine();
	}

	@Override
	public void traverseFieldDec(UniFieldDec node) {
		if (node.modifiers != null) {
			for (String modifier : node.modifiers) {
				print(modifier);
				print(" ");
			}
		}
		print(node.name);
		if(node.type!=""){
			print(" : ");
			print(toSwiftDataType(node.type));//if multiple array -> print []
		}
		if((node.value!=null)&&(!(node.value instanceof UniNewArray))){
			print(" = ");
			parseExpr(node.value);
		}
//		boolean flag = true;
//		UniFieldDec node2 = (UniFieldDec) node;
//		String modifier = "";
//		for (String temp : iter(node2.modifiers)){
//			if(temp.equals("public")){
//				modifier = "public";
//			}
//		}
//		String declaration = "";
//		declaration = String.join(" ", modifier, "var", node2.name, ":", toSwiftDataType(node2.type));
//		if((node2.value!=null)&&(!(node2.value instanceof UniNewArray))){
//			declaration = declaration + "=";
//		}
//		print(declaration);
//		if((node2.value!=null)&&(!(node2.value instanceof UniNewArray))){
//			varType = toSwiftDataType(node2.type);//for Cast
//			parseExpr(node2.value);
//		}
			
	}

	private boolean isEmptyArray(UniNewArray node) {
		// TODO Auto-generated method stub
		if(node.value.items!=null)
			return false;
		return true;
	}

	@Override
	public void traverseArray(UniArray node) {
//		throw new RuntimeException("Not Implemented");
		print("[");
		int num = node.items.size();
		if (node.items != null) {
			withIndent(() -> {
				int time = 0;
				for (UniExpr item : node.items) {
					parseExpr(item);
					time++;
					if(time!=num){
						print(",");
					}
				}
			});
		}
		print("]");
	}

	@Override
	public void traverseNewArray(UniNewArray node) {
//		throw new RuntimeException("Not Implemented");
		//arr[1]? -- elementsNum
		if(node.value!=null){
			print("[");
			if (node.value.items != null) {
				int num = node.value.items.size();
				withIndent(() -> {
					int time = 0;
					for (UniExpr item : node.value.items) {
						parseExpr(item);
						time++;
						if(time!=num){
							print(",");
						}
					}
				});
			}
			print("]");
		}
		
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
		// 
		
	}

	@Override
	public void traverseEnhancedFor(UniEnhancedFor node) {
		// TODO Auto-generated method stub
		print("for");
		print(" ");
		print(node.name);
		print(" ");
		print("in");
		print(" ");
		parseExpr(node.container);
		print("{");
		withIndent(()->{
			parseExpr(node.statement);
		});
		print("}");
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

	@Override
	public void traverseInterfaceDec(UniInterfaceDec node) {
		// TODO Auto-generated method stub
		String modifiers = "";
		String declaration = "ssss"+node.interfaceName;
		if(node.modifiers!=null){
			modifiers = safeJoin(node.modifiers, " ");
			declaration = String.join(" ", modifiers, "interface", node.interfaceName);
		}else{
			declaration = String.join(" ", "interface", node.interfaceName);
		}
		
		print(declaration);
		if(node.superInterface!=null&&node.superInterface.size()!=0){
			String superclass = " : "+node.superInterface.get(0);
			print(superclass);
		}
		print("{");
		printNewLine();

		withIndent(() -> {
			for (UniMemberDec dec : iter(node.members)) {
				traverseMemberDec(dec);
				printNewLine();
			}
		});
		printNewLine();
		print("}");
		if(this.mainDec!=null){
			//get the inside of main method and append after class declaration
			traverseBlock(this.mainDec.block);
		}
		printNewLine();
	}

	@Override
	public void traverseSwitch(UniSwitch node) {
		// TODO Auto-generated method stub
		print("switch");
		print(" ");
		parseExpr(node.cond);
		print(" ");
		print("{");
		if(node.cases!=null){
			for (UniSwitchUnit unit: node.cases)
				parseExpr(unit);
		}
		printNewLine();
		print("}");
	}

	@Override
	public void traverseSwitchUnit(UniSwitchUnit node) {
		// TODO Auto-generated method stub
		printNewLine();
		print(node.label);
		print(" ");
		if(node.cond!=null){//default: 
			parseExpr(node.cond);
		}
		print(":");
		printNewLine();
		withIndent(() -> {
			if(node.statement!=null){
				for (UniExpr expr : node.statement){
					parseExpr(expr);
					printNewLine();
				}
			}
		});
	}

	@Override
	public void traverseEnumConstant(UniEnumConstant node) {
		// TODO Auto-generated method stub
		//constants without arguments
		print("case");
		print(" ");
		print(node.name);
		int num = node.args.size();
		if(num == 1){
			//constants with one arguments
			print("=");
			parseExpr(node.args.get(0));
		}
		else if(num>=2){
			//constants with two or more arguments
			//NEED TO MODIFY
			print("=");
			parseExpr(node.args.get(0));
		}
	}


}