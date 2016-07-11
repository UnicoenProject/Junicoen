package net.unicoen.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
import net.unicoen.node.UniNode;
import net.unicoen.node.UniProgram;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniSwitch;
import net.unicoen.node.UniSwitchUnit;
import net.unicoen.node.UniTernaryOp;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;

public class JavaToSwiftTreeConverter extends Traverser {
	
	public static int counter = 0;
	public static UniNode keyWord = null;
	
	private static String className = null;
	private static String enumType = null;
	private static boolean enumFlag = false;
	
	/////////////////////////////////////
	/////////////////////////////////////
	
	private final IntStack exprPriority = new IntStack();
	
	protected JavaToSwiftTreeConverter(){
		exprPriority.push(0);
	}
	
	private void parseExpr(UniExpr node, int priority) {
		exprPriority.push(priority);
		traverseExpr(node);
		exprPriority.pop();
	}

	protected void parseExpr(UniExpr node) {
		parseExpr(node, 0);
	}
	private void parseStatement(UniExpr expr) {
		parseExpr(expr);
	}

	private void parseBlockInner(UniBlock block) {
		if(block.body!=null){
			for (UniExpr expr : block.body)
				parseStatement(expr);
		}
		else	return;
	}
	
	protected static <T> Iterable<T> iter(Iterable<T> iter) {
		if (iter == null) {
			return Collections.emptyList();
		}
		return iter;
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
	
	/////////////////////////////////////
	/////////////////////////////////////
	
	public static Object convert(Object node) {
		
		JavaToSwiftTreeConverter g = new JavaToSwiftTreeConverter();
		UniProgram program = ((UniProgram) node);
		if(program.imports!= null){
			for (UniImport importStatement : program.imports) {
				g.traverseImport(importStatement);
			}			
		}
		if(program.classes!=null){
			for (UniClassDec classDec : program.classes) {
				className = classDec.className;
				g.traverseClassDec(classDec);
			}
		}
		if(program.interfaces!=null){
			for(UniInterfaceDec interfaceDec : program.interfaces){
				g.traverseInterfaceDec(interfaceDec);
			}
		}
		if(enumFlag&&(enumType!=null)){//it is enum with value
			if(program.classes!=null){
				for (UniClassDec classDec : program.classes) {
					classDec.className = classDec.className+" : "+enumType;
				}
			}
		}
		return node;
	}
	public static int search(Object node, UniNode toSearch) {
		keyWord = toSearch;
		JavaToSwiftTreeConverter g = new JavaToSwiftTreeConverter();
		g.traverseClassDec((UniClassDec) node);
		return counter;
	}
	
	
	@Override
	public void traverseBoolLiteral(UniBoolLiteral node) {
		// TODO Auto-generated method stub
		if(enumType==null){
			enumType = "Boolean";
		}
	}
	@Override
	public void traverseIntLiteral(UniIntLiteral node) {
		// TODO Auto-generated method stub
		if(enumType==null){
			enumType = "Int";
		}
	}
	@Override
	public void traverseLongLiteral(UniLongLiteral node) {
		// TODO Auto-generated method stub
		if(enumType==null){
			enumType = "Double";
		}
	}
	@Override
	public void traverseDoubleLiteral(UniDoubleLiteral node) {
		// TODO Auto-generated method stub
		if(enumType==null){
			enumType = "Double";
		}
	}
	@Override
	public void traverseStringLiteral(UniStringLiteral node) {
		// TODO Auto-generated method stub
		if(enumType==null){
			enumType = "String";
		}
	}
	@Override
	public void traverseIdent(UniIdent node) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void traverseArray(UniArray node) {
		// TODO Auto-generated method stub
		if (node.items != null) {
				for (UniExpr item : node.items) {
					parseExpr(item);
				}
		}
	}
	@Override
	public void traverseFieldAccess(UniFieldAccess node) {
		// TODO Auto-generated method stub
		parseExpr(node.receiver);
	}
	@Override
	public void traverseMethodCall(UniMethodCall node) {
		// TODO Auto-generated method stub
		
		//find out library function node

		/////////////////////////////////////
		//Java- System.out.println
		/////////////////////////////////////

		UniIdent system = new UniIdent();
		system.name = "System";
		
		UniFieldAccess receiver = new UniFieldAccess();
		receiver.receiver = system;
		receiver.fieldName = "out";
		
		String methodName = "println";

		/////////////////////////////////////
		/////////////////////////////////////
		
		if (node.receiver != null) {
			parseExpr(node.receiver);
			if((node.receiver.equals(receiver))&&(node.methodName.equals(methodName))){
				//replace
				node.receiver = null;
				node.methodName = "println";
				
			}
		}
		
		for (UniExpr innerExpr : iter(node.args)) {
			parseExpr(innerExpr);
		}
		
	}
	@Override
	public void traverseNew(UniNew node) {
		// TODO Auto-generated method stub
		for (UniExpr innerExpr : iter(node.args)) {
			parseExpr(innerExpr);
		}
	}
	@Override
	public void traverseNewArray(UniNewArray node) {
		// TODO Auto-generated method stub
		if(node.value!=null){
			if (node.value.items != null) {
				for (UniExpr item : node.value.items) {
					parseExpr(item);
				}
			}
		}
		
	}
	@Override
	public void traverseUnaryOp(UniUnaryOp node) {
		// TODO Auto-generated method stub
		if (node.operator.startsWith("_")) {
			parseExpr(node.expr);
		} else if (node.operator.endsWith("_")) {
			parseExpr(node.expr);
		} else {
			parseExpr(node.expr);
		}
	}
	@Override
	public void traverseBinOp(UniBinOp node) {
		// TODO Auto-generated method stub
		int priority = priorityTable(node.operator) * 10 + 1;
		assert priority > 0;
		if((node.left!=null)&&(node.right==null)){
			parseExpr(node.left, priority);
			parseExpr(node.right, priority-1);
		}
		else{
			parseExpr(node.left, priority - 1);
			parseExpr(node.right, priority);
		}
	}
	@Override
	public void traverseTernaryOp(UniTernaryOp node) {
		// TODO Auto-generated method stub
		parseExpr(node.cond);
		parseExpr(node.trueExpr);
		parseExpr(node.falseExpr);
	}
	@Override
	public void traverseCast(UniCast node) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void traverseReturn(UniReturn node) {
		// TODO Auto-generated method stub
		if(node.value != null)
			parseExpr(node.value);
	}
	@Override
	public void traverseBreak(UniBreak node) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void traverseContinue(UniContinue node) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void traverseBlock(UniBlock node) {
		// TODO Auto-generated method stub
		parseBlockInner(node);
	}
	@Override
	public void traverseIf(UniIf node) {
		// TODO Auto-generated method stub
		parseExpr(node.cond);
		if (node.trueStatement instanceof UniBlock) {
			traverseBlock((UniBlock) node.trueStatement);
		} else {
				parseStatement(node.trueStatement);
		}
		if (node.falseStatement != null) {
			if (node.falseStatement instanceof UniBlock) {
				traverseBlock((UniBlock) node.falseStatement);
			} else {
					parseStatement(node.falseStatement);
			}
		}
	}
	@Override
	public void traverseFor(UniFor node) {
		// TODO Auto-generated method stub
		parseExpr(node.init);
		parseExpr(node.cond);
		parseExpr(node.step);
		if (node.statement instanceof UniBlock) {
			traverseBlock((UniBlock) node.statement);
		} else {
				parseStatement(node.statement);
		}
	}
	@Override
	public void traverseEnhancedFor(UniEnhancedFor node) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void traverseWhile(UniWhile node) {
		// TODO Auto-generated method stub
		parseExpr(node.cond);
		if (node.statement == null) {
		} else if (node.statement instanceof UniBlock) {
			traverseBlock((UniBlock) node.statement);
		} else {
				parseStatement(node.statement);
		}
	}
	@Override
	public void traverseDoWhile(UniDoWhile node) {
		// TODO Auto-generated method stub
		if(node.statement instanceof UniBlock){
			if(((UniBlock)node.statement).body != null)
				traverseBlock((UniBlock) node.statement);
		}
		if(node.cond != null){
			parseExpr(node.cond);
		}
	}
	@Override
	public void traverseVariableDec(UniVariableDec node) {
		// TODO Auto-generated method stub
		String keyword = "var";
		List<String> modifiers = new ArrayList<String>();
		for (String modifier : iter(node.modifiers)){
			if(modifier.equals("final")){
				if(node.value!=null){
					//value is instance of UniNewArray and without value -> var
					keyword = "let";
				}
			}
			else{
				modifiers.add(modifier);
			}
		}
		modifiers.add(keyword);
		node.modifiers = modifiers;
		if (node.value != null) {
			parseExpr(node.value);
		}
	}
	@Override
	public void traverseEmptyStatement(UniEmptyStatement node) {
		// TODO Auto-generated method stub
	}
	@Override
	public void traverseFieldDec(UniFieldDec node) {
		// TODO Auto-generated method stub
		//Java- Change modifiers
		String keyword = "var";
		List<String> modifiers = new ArrayList<String>();
		for (String modifier : iter(node.modifiers)){
			if(modifier.equals("final")){
				if(node.value!=null){
					//value is instance of UniNewArray and without value -> var
					keyword = "let";
				}
			}
			else{
				modifiers.add(modifier);
			}
		}
		modifiers.add(keyword);
		node.modifiers = modifiers;
		if (node.value != null) {
			parseExpr(node.value);
		}
	}
	private boolean isEmptyArray(UniNewArray node) {
		// TODO Auto-generated method stub
		if(node.value.items!=null)
			return false;
		return true;
	}
	@Override
	public void traverseMethodDec(UniMethodDec node) {
		// TODO Auto-generated method stub
		List<String> modifiers = new ArrayList<String>();
		for (String temp : iter(node.modifiers)){
			if(temp.equals("public")){
				modifiers.add("public");
			}else if(temp.equals("private")){
				modifiers.add("private");
			}
		}
		node.modifiers = modifiers;
		String methodName = node.methodName;
		if(methodName.equals(className)){
			node.methodName = "init";
		}
//		if(node.returnType!=null){
//			if(node.returnType.equals("void")){
//				node.returnType = null;
//			}
//		}
//		if(node.returnType.equals("void")){
//			node.returnType = null;
//		}
		traverseBlock(node.block);
	}
	

	@Override
	public void traverseArg(UniArg node) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void traverseClassDec(UniClassDec node) {
		// TODO Auto-generated method stub
		//if it is enum and args are not empty
		for (UniMemberDec dec : iter(node.members)) {
			traverseMemberDec(dec);
		}
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
	}

	@Override
	public void traverseSwitchUnit(UniSwitchUnit node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseSwitch(UniSwitch node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseEnumConstant(UniEnumConstant node) {
		// TODO Auto-generated method stub
		if(node.args!=null){
			for(UniExpr arg : iter(node.args)){
				if(!enumFlag){
					enumFlag = true;
				}
				traverseExpr(arg);
			}
		}
		
	}


}
