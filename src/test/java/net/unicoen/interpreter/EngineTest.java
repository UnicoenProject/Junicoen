package net.unicoen.interpreter;

import static net.unicoen.node_helper.Builder.bin;
import static net.unicoen.node_helper.Builder.block;
import static net.unicoen.node_helper.Builder.ident;
import static net.unicoen.node_helper.Builder.list;
import static net.unicoen.node_helper.Builder.lit;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.function.IntUnaryOperator;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniDecVarWithValue;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFuncDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniWhile;

import org.junit.Test;

public class EngineTest {

	private UniClassDec mkClassDec() {
		/*
		 * public class Main {
		 *     public static void main(String[] args) {
		 *         if (true && false) {
		 *             MyLib.printInt(1);
		 *         } else {
		 *             MyLib.printInt(1 + 2);
		 *         }
		 *         while (false) {
		 *             1;
		 *         }
		 *     }
		 * }
		 */
		UniClassDec cDec = new UniClassDec();
		cDec.className = "Main";
		cDec.modifiers = list("public");

		UniFuncDec fDec = new UniFuncDec();
		{
			fDec.funcName = "start";
			fDec.modifiers = list("public", "static");
			fDec.returnType = "void";
			UniArg arg = new UniArg();
			{
				arg.type = "String[]";
				arg.name = "args";
			}
			fDec.args = list(arg);
			UniIf uIf = new UniIf();
			{
				uIf.cond = bin(lit(true), "&&", lit(false));
				UniMethodCall mCallT = new UniMethodCall();
				{
					mCallT.receiver = ident("MyLib");
					mCallT.methodName = "printInt";
					mCallT.args = list(lit(1));
				}
				uIf.trueBlock = block(mCallT);
				UniMethodCall mCallF = new UniMethodCall();
				{
					mCallF.receiver = ident("MyLib");
					mCallF.methodName = "printInt";
					mCallF.args = list(bin(lit(1), "+", lit(2)));
				}
				uIf.falseBlock = block(mCallF);
			}
			UniWhile uWhile = new UniWhile();
			uWhile.cond = lit(false);
			uWhile.block = block(lit(1));
			fDec.block = block(uIf, uWhile);
		}
		cDec.members = list(fDec);
		return cDec;
	}

	@Test
	public void test() throws UnsupportedEncodingException {
		Engine engine = new Engine();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		engine.out = new PrintStream(baos);

		engine.execute(mkClassDec());
		String output = baos.toString("UTF8");

		String expect = "3" + System.lineSeparator();
		assertEquals(expect, output);
	}

	@Test
	public void testFunctionObject() {
		// f(100)
		UniExpr expr = new UniMethodCall(null, "f", list(lit(100)));
		IntUnaryOperator twice = n -> n * 2;
		Object result = Engine.executeSimple(expr, "f", twice);
		assertEquals(200, result);
	}

	@Test
	public void testNativeMethod() {
		String str = "1234567890";
		// str.substring(3,7)
		UniExpr expr = new UniMethodCall(new UniIdent("str"), "substring", list(lit(3), lit(7)));
		Object result = Engine.executeSimple(expr, "str", str);
		assertEquals(str.substring(3, 7), result);
	}

	@Test
	public void testStaticMethod() {
		// Integer.toString(100)
		UniExpr expr = new UniMethodCall(new UniIdent("Integer"), "toString", list(lit(100)));
		Object result = Engine.executeSimple(expr, "Integer", Integer.class);
		assertEquals("100", result);
	}

	@Test
	public void testScope() {
		// { int i = 1; { int i = 100; }; i += 1; i }
		UniExpr exp1 = new UniDecVarWithValue(null, "int", "i", lit(1));
		UniExpr exp2 = new UniDecVarWithValue(null, "int", "i", lit(100));
		UniExpr exp3 = new UniBinOp("+=", ident("i"), lit(1));
		UniExpr exp4 = ident("i");
		UniBlock program = block(exp1, block(exp2), exp3, exp4);

		Object result = Engine.executeSimple(program);
		assertEquals(2, result);
	}

	@Test
	public void testIncrement() {
		// { int i = 0; ???; j; }
		UniExpr exp1 = new UniDecVarWithValue(null, "int", "i", lit(0));
		UniExpr exp2;
		UniExpr exp3 = ident("j");

		// int j = i++;
		exp2 = new UniDecVarWithValue(null, "int", "j", new UniUnaryOp("_++", ident("i")));
		assertEquals(0, Engine.executeSimple(block(exp1, exp2, exp3)));

		// int j = ++i;
		exp2 = new UniDecVarWithValue(null, "int", "j", new UniUnaryOp("++_", ident("i")));
		assertEquals(1, Engine.executeSimple(block(exp1, exp2, exp3)));

		// int j = i--;
		exp2 = new UniDecVarWithValue(null, "int", "j", new UniUnaryOp("_--", ident("i")));
		assertEquals(0, Engine.executeSimple(block(exp1, exp2, exp3)));

		// int j = --i;
		exp2 = new UniDecVarWithValue(null, "int", "j", new UniUnaryOp("--_", ident("i")));
		assertEquals(-1, Engine.executeSimple(block(exp1, exp2, exp3)));
	}

	@Test
	public void testLibLoader() {
		Scope global = Scope.createGlobal();
		StdLibLoader.initialize(global);

		assertEquals(Integer.class, Engine.executeSimple(ident("Integer"), global));
	}
}
