package net.unicoen.generator;

import static net.unicoen.node_helper.Builder.list;
import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;

import net.unicoen.node.UniClassDec;

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
}
