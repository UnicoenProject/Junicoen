package net.unicoen.generator;

import static net.unicoen.node_helper.Builder.*;
import static org.junit.Assert.*;

import java.util.regex.Pattern;

import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniBreak;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniTernaryOp;
import net.unicoen.node.UniContinue;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniDoWhile;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniLongLiteral;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniWhile;

import org.junit.Test;

public class JavaGeneratorTest {

	private static Pattern whitespace = Pattern.compile("\\s+");

	public static String normalize(String str) {
		String replaced = whitespace.matcher(str).replaceAll(" ");
		if (replaced.charAt(replaced.length() - 1) == ' ') {
			replaced = replaced.substring(0, replaced.length() - 1);
		}
		return replaced;
	}

	@Test
	public void genClass() {
		UniClassDec dec = new UniClassDec("Foo", list("public"), null);
		String code = JavaGenerator.generate(dec);
		assertEquals("public class Foo { }", normalize(code));
	}

	@Test
	public void genHelloWorld() {
		UniExpr body = new UniMethodCall(new UniFieldAccess(ident("System"), "out"), "println", list(lit("Hello, world")));
		String bodyStr = "System.out.println(\"Hello, world\");";

		UniMethodDec mDec = new UniMethodDec("main", list("public", "static"), "void", list(arg("String[]", "args")), block(body));
		String mDecStr = "public static void main (String[] args) { " + bodyStr + " }";

		UniClassDec cDec = new UniClassDec("Foo", list("public"), list(mDec));
		String cDecStr = "public class Foo { " + mDecStr + " }";

		String code = JavaGenerator.generate(cDec);
		assertEquals(normalize(cDecStr), normalize(code));
	}

	private void assertGen(String code, UniExpr expr) {
		assertGen(new String[] { code }, new UniExpr[] { expr });
	}

	private void assertGen(String[] codes, UniExpr expr) {
		assertGen(codes, new UniExpr[] { expr });
	}

	private void assertGen(String[] codes, UniExpr[] exprs) {
		StringBuilder buff = new StringBuilder();
		buff.append("public class Foo {\n");
		buff.append("	public static void main (String[] args) {\n");
		for (String line : codes) {
			buff.append("\t\t" + line + "\n");
		}
		buff.append("	}\n");
		buff.append("}\n");

		UniMethodDec mDec = new UniMethodDec("main", list("public", "static"), "void", list(arg("String[]", "args")), block(exprs));
		UniClassDec cDec = new UniClassDec("Foo", list("public"), list(mDec));

		String code = JavaGenerator.generate(cDec);
		assertEquals(buff.toString(), code.replace("\r\n", "\n"));
	}

	@Test
	public void genHelloWorld_with_indent() {
		UniExpr body = new UniMethodCall(new UniFieldAccess(ident("System"), "out"), "println", list(lit("Hello, world")));
		String code = "System.out.println(\"Hello, world\");";
		assertGen(code, body);
	}

	@Test
	public void test_Literal() {
		UniExpr[] exprs = {
				new UniBoolLiteral(true),
				new UniIntLiteral(1),
				new UniLongLiteral(2),
				new UniDoubleLiteral(1),
				new UniStringLiteral("foo"),
		};
		String[] codes = {
				"true;",
				"1;",
				"2L;",
				"1.0;",
				"\"foo\";",
		};
		assertGen(codes, exprs);
	}

	@Test
	public void test_FieldAccess() {
		UniExpr expr = new UniFieldAccess(ident("System"), "out");
		String code = "System.out;";
		assertGen(code, expr);
	}

	@Test
	public void test_MethodCall() {
		UniExpr[] exprs = {
				new UniMethodCall(lit("Hello"), "length", null),
				new UniMethodCall(ident("Integer"), "toString", list(lit(5)))
		};
		String[] codes = {
				"\"Hello\".length();",
				"Integer.toString(5);"
		};
		assertGen(codes, exprs);
	}

	@Test
	public void test_BinOp() {
		{
			UniExpr expr = new UniBinOp("+", new UniBinOp("+", lit(1), lit(2)), new UniBinOp("+", lit(3), lit(4)));
			String code = "1 + 2 + (3 + 4);";
			assertGen(code, expr);
		}
		{
			UniExpr expr = new UniBinOp("+", new UniBinOp("*", lit(1), lit(2)), new UniBinOp("*", lit(3), lit(4)));
			String code = "1 * 2 + 3 * 4;";
			assertGen(code, expr);
		}
		{
			UniExpr expr = new UniBinOp("*", new UniBinOp("+", lit(1), lit(2)), new UniBinOp("+", lit(3), lit(4)));
			String code = "(1 + 2) * (3 + 4);";
			assertGen(code, expr);
		}
	}

	@Test
	public void test_CondOp() {
		UniExpr expr = new UniTernaryOp(lit(true), lit(1), lit(2));
		String code = "true ? 1 : 2;";
		assertGen(code, expr);
	}

	@Test
	public void test_Return() {
		UniExpr expr = new UniReturn(lit(41));
		String code = "return 41;";
		assertGen(code, expr);
	}

	@Test
	public void test_Block() {
		UniExpr expr = block(lit(3));
		String[] codes = {
				"{",
				"	3;",
				"}",
		};
		assertGen(codes, expr);
	}

	@Test
	public void test_If() {
		{
			UniExpr ifStmt = new UniIf(lit(true), block(lit(6)), null);
			String[] codes = {
					"if (true) {",
					"	6;",
					"}",
			};
			assertGen(codes, ifStmt);
		}
		{
			UniExpr ifStmt = new UniIf(lit(true), block(lit(6)), block(lit(3)));
			String[] codes = {
					"if (true) {",
					"	6;",
					"} else {",
					"	3;",
					"}",
			};
			assertGen(codes, ifStmt);
		}
	}

	@Test
	public void test_For() {
		UniExpr init = new UniVariableDec(null, "int", "i", lit(0));
		UniExpr cond = new UniBinOp("<", ident("i"), lit(10));
		UniExpr step = new UniUnaryOp("_++", ident("i"));
		UniExpr body = new UniFor(init, cond, step, block(new UniContinue()));
		String[] codes = {
				"for (int i = 0; i < 10; i++) {",
				"	continue;",
				"}",
		};
		assertGen(codes, body);
	}

	@Test
	public void test_While() {
		UniExpr body = new UniWhile(lit(true), block(new UniBreak()));
		String[] codes = {
				"while (true) {",
				"	break;",
				"}",
		};
		assertGen(codes, body);
	}

	@Test
	public void test_DoWhile() {
		UniExpr body = new UniDoWhile(block(lit(1)), lit(false));
		String[] codes = {
				"do {",
				"	1;",
				"} while (false);",
		};
		assertGen(codes, body);
	}

	@Test
	public void test_DecVarWithValue() {
		UniExpr body = new UniVariableDec(list("final"), "int", "a", lit(1));
		String code = "final int a = 1;";
		assertGen(code, body);
	}
}
