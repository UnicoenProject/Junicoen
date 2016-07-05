package net.unicoen.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Lists;

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

/**
 * Dolittle出力のテスト
 * 
 * @author ymatsuzawa
 *
 */
public class DolittleGenerator extends CodeGenerator {

	Map<String, String> turtleMethodNameMap = new HashMap<String, String>();

	public DolittleGenerator(PrintStream out) {
		super(out);
		initMap();
	}

	public static String generate(UniClassDec dec) {
		try (ByteArrayOutputStream out = new ByteArrayOutputStream(); PrintStream printer = new PrintStream(out)) {
			generate(dec, printer);
			return out.toString();
		} catch (IOException e) {
			return null;
		}
	}

	public static void generate(UniClassDec classDec, PrintStream out) {
		DolittleGenerator g = new DolittleGenerator(out);
		for(int i = 0 ; i < classDec.members.size();i++){
			if(classDec.members.get(i)instanceof UniMethodDec){
				UniMethodDec dec = (UniMethodDec)classDec.members.get(i);
				if(dec.methodName.equals("start")){
					UniVariableDec kameta = new UniVariableDec(Lists.newArrayList(), "Type", "かめた", new UniMethodCall(null, "createTurtle", Lists.newArrayList()));
					dec.block.body.add(0,kameta);
				}
			}
		}
		g.traverseClassDec(classDec);
	}

	public void initMap() {
		turtleMethodNameMap.put("fd", "歩く");
		turtleMethodNameMap.put("rt", "右回り");
		turtleMethodNameMap.put("lt", "左回り");
		turtleMethodNameMap.put("createTurtle", "タートル！作る");
	}

	@Override
	public void dontCallTraverseBoolLiteral(UniBoolLiteral node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseIntLiteral(UniIntLiteral node) {
		print(node.value + " ");
	}

	@Override
	public void dontCallTraverseLongLiteral(UniLongLiteral node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseDoubleLiteral(UniDoubleLiteral node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseStringLiteral(UniStringLiteral node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseIdent(UniIdent node) {
		print(node.name);
	}

	@Override
	public void dontCallTraverseArray(UniArray node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseFieldAccess(UniFieldAccess node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseMethodCall(UniMethodCall node) {
		String name = turtleMethodNameMap.get(node.methodName);
		if(!node.methodName.equals("createTurtle")){
			node.receiver=new UniIdent("かめた");
		}
		if (node.receiver != null) {
			traverseExpr(node.receiver);
			print("！ ");
		}

		if (name != null) {
			for (UniExpr arg : node.args) {
				traverseExpr(arg);
			}
			print(turtleMethodNameMap.get(node.methodName));
		} else {
			print(node.methodName);
		}
	}

	@Override
	public void dontCallTraverseUnaryOp(UniUnaryOp node) {
		if (node.operator.equals("_++")) {
			traverseExpr(node.expr);
			print("=");
			traverseExpr(node.expr);
			print(" + 1");
		} else {
			throw new RuntimeException("not impl" + node.operator);
		}
	}

	@Override
	public void dontCallTraverseBinOp(UniBinOp node) {
		traverseExpr(node.left);
		print(node.operator);
		traverseExpr(node.right);
	}

	@Override
	public void dontCallTraverseTernaryOp(UniTernaryOp node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseReturn(UniReturn node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseBreak(UniBreak node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseContinue(UniContinue node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseBlock(UniBlock node) {
		if (node.body != null && !node.body.isEmpty()) {
			for (int i = 0; i < node.body.size(); i++) {
				traverseExpr(node.body.get(i));
				if (i != node.body.size() - 1) {
					out.println("。");
				}
			}
		}
	}

	@Override
	public void dontCallTraverseIf(UniIf node) {
		// cond
		print("「");
		traverseExpr(node.cond);
		print("」！なら");
		if (node.trueStatement != null) {
			UniBlock block = (UniBlock) node.trueStatement;
			// @TODO blockのなかで「」を作りたい．
			print("「");
			traverseBlock(block);
			print("」");
		}
		if (node.falseStatement != null) {
			UniBlock block = (UniBlock) node.falseStatement;
			// @TODO blockのなかで「」を作りたい．
			print("「");
			traverseBlock(block);
			print("」");
		}
		print("実行");

	}

	// private void traverseBlock(UniBlock block){
	// print("「");
	// for (UniExpr expr : block.body) {
	// traverseExpr(expr);
	// print("。");
	// }
	// }

	@Override
	public void dontCallTraverseFor(UniFor node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseWhile(UniWhile node) {
		UniBlock block = (UniBlock) node.statement;
		// cond
		print("「");
		traverseExpr(node.cond);
		print("」！の間");
		print("\n");

		// body
		print("「");
		print("\n");
		traverseBlock(block);
		print("」");
		print("\n");
		print("実行");
	}

	@Override
	public void dontCallTraverseDoWhile(UniDoWhile node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseVariableDec(UniVariableDec node) {
		print(node.name);

		if (node.value != null) {
			print(" = ");
			traverseExpr(node.value);
		}
	}

	@Override
	public void dontCallTraverseNewArray(UniNewArray node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseFieldDec(UniFieldDec node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseMethodDec(UniMethodDec node) {
		if(!node.methodName.equals("main")){
			for (UniExpr expr : node.block.body) {
				traverseExpr(expr);
				print("。");
				newLine();
			}			
		}
	}

	@Override
	public void dontCallTraverseArg(UniArg node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseClassDec(UniClassDec node) {
		for (UniMemberDec dec : node.members) {
			traverseMemberDec(dec);
		}
	}

	public void newLine() {
		print(System.getProperty("line.separator"));
	}

	public void print(String str) {
		out.print(str);
	}

	@Override
	public void dontCallTraverseNew(UniNew node) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void dontCallTraverseImport(UniImport node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dontCallTraverseNamespace(UniNamespace node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dontCallTraverseEmptyStatement(UniEmptyStatement node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dontCallTraverseCast(UniCast node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dontCallTraverseEnhancedFor(UniEnhancedFor node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dontCallTraverseProgram(UniProgram node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseInterfaceDec(UniInterfaceDec node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseSwitch(UniSwitch node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseSwitchUnit(UniSwitchUnit node) {
		// TODO Auto-generated method stub
		
	}

}
