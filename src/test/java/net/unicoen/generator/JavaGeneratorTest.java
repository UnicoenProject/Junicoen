package net.unicoen.generator;

import static net.unicoen.node_helper.Builder.arg;
import static net.unicoen.node_helper.Builder.block;
import static net.unicoen.node_helper.Builder.ident;
import static net.unicoen.node_helper.Builder.list;
import static net.unicoen.node_helper.Builder.lit;
import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;

import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;

import org.junit.Test;

public class JavaGeneratorTest {

	private static Pattern whitespace = Pattern.compile("\\s+");

	private static String normalize(String str) {
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
}
