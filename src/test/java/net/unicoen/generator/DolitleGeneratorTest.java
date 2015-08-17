package net.unicoen.generator;

import org.junit.Test;

import net.unicoen.mapper.JavaScriptMapper;
import net.unicoen.node.UniClassDec;

public class DolitleGeneratorTest {

	@Test
	public void test() {
		JavaScriptMapper mapper = new JavaScriptMapper();
		UniClassDec dec = (UniClassDec) mapper
				.parse("function start(){var t = createTurtle();t.fd(50);}");
		System.out.println(DolittleGenerator.generate(dec));
	}

}
