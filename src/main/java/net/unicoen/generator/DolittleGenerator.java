package net.unicoen.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import net.unicoen.node.Traverser;
import net.unicoen.node.UniArg;
import net.unicoen.node.UniArray;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniBreak;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniContinue;
import net.unicoen.node.UniDoWhile;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniFieldDec;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniLongLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNewArray;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniTernaryOp;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;

public class DolittleGenerator extends Traverser {

	PrintStream out;
	Map<String, String> turtleMethodNameMap = new HashMap<String, String>();
	
	public DolittleGenerator(PrintStream out){
		this.out = out;
		initMap();
	}
	
	public static String generate(UniClassDec dec) {
		try (ByteArrayOutputStream out = new ByteArrayOutputStream();
				PrintStream printer = new PrintStream(out)) {
			generate(dec, printer);
			return out.toString();
		} catch (IOException e) {
			return null;
		}
	}
	
	public static void generate(UniClassDec classDec, PrintStream out) {
		DolittleGenerator g = new DolittleGenerator(out);
		g.traverseClassDec(classDec);
	}
	
	public void initMap(){
		turtleMethodNameMap.put("fd", "歩く");
		turtleMethodNameMap.put("rt", "右回り");
		turtleMethodNameMap.put("lt", "左回り");
		turtleMethodNameMap.put("createTurtle", "タートル！作る");
	}
	
	@Override
	public void traverseBoolLiteral(UniBoolLiteral node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseIntLiteral(UniIntLiteral node) {
		print(node.value + " ");
	}

	@Override
	public void traverseLongLiteral(UniLongLiteral node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseDoubleLiteral(UniDoubleLiteral node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseStringLiteral(UniStringLiteral node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseIdent(UniIdent node) {
		print(node.name);
	}

	@Override
	public void traverseArray(UniArray node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseFieldAccess(UniFieldAccess node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseMethodCall(UniMethodCall node) {
		String name = turtleMethodNameMap.get(node.methodName);
		if(node.receiver !=null){
			traverseExpr(node.receiver);
			print("！ ");
		}
		
		if(name != null){
			for(UniExpr arg : node.args){
				traverseExpr(arg);
			}
			print(turtleMethodNameMap.get(node.methodName));
		}else{
			print(node.methodName);
		}		
	}

	@Override
	public void traverseUnaryOp(UniUnaryOp node) {
		if(node.operator.equals("_++")){
			traverseExpr(node.expr);
			print("=");
			traverseExpr(node.expr);
			print(" + 1");
		}else{
			throw new RuntimeException("not impl" + node.operator);
		}
	}

	@Override
	public void traverseBinOp(UniBinOp node) {
		traverseExpr(node.left);
		print(node.operator);
		traverseExpr(node.right);
	}

	@Override
	public void traverseTernaryOp(UniTernaryOp node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseReturn(UniReturn node) {
		// TODO Auto-generated method stub

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
		if(node.body != null && !node.body.isEmpty()){
			for(int i =0;i<node.body.size();i++){
				traverseExpr(node.body.get(i));
				if(i != node.body.size()-1){
					out.println("。");	
				}
			}			
		}
	}

	@Override
	public void traverseIf(UniIf node) {
		//cond
		print("「");
		traverseExpr(node.cond);
		print("」！なら");
		if(node.falseStatement!=null){
			UniBlock block = (UniBlock)node.falseStatement;
			if(block.body != null && block.body.size()>0){
				parseElseStatement((UniBlock)node.falseStatement);	
			}
		}
		print("実行");
		
	}
	
	public void parseElseStatement(UniBlock falseBlock){
//		if(falseBlock.body)
	}

	@Override
	public void traverseFor(UniFor node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseWhile(UniWhile node) {
		UniBlock block = (UniBlock)node.statement;
		//cond
		print("「");
		traverseExpr(node.cond);
		print("」！の間");
		
		//body
		print("「");
		for(UniExpr expr: block.body){
			traverseExpr(expr);
			print("。");
		}
		print("」実行");	
	}

	@Override
	public void traverseDoWhile(UniDoWhile node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseVariableDec(UniVariableDec node) {
		print(node.name);
		
		if(node.value != null){
			print(" = ");
			traverseExpr(node.value);
		}
	}

	@Override
	public void traverseNewArray(UniNewArray node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseFieldDec(UniFieldDec node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseMethodDec(UniMethodDec node) {
		for(UniExpr expr :node.block.body){
			traverseExpr(expr);
			print("。");
			newLine();
		}
	}

	@Override
	public void traverseArg(UniArg node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseClassDec(UniClassDec node) {
		for(UniMemberDec dec : node.members){
			traverseMemberDec(dec);
		}
	}
	
	public void newLine(){
		print(System.getProperty("line.separator"));	
	}

	public void print(String str){
		out.print(str);
	}
}
