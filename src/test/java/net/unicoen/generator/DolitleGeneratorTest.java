package net.unicoen.generator;

import org.junit.Test;

import net.unicoen.mapper.JavaScriptMapper;
import net.unicoen.node.UniProgram;

public class DolitleGeneratorTest {

	@Test
	public void test() {
		JavaScriptMapper mapper = new JavaScriptMapper();
		UniProgram dec = (UniProgram) mapper
				.parse("function start(){var t = createTurtle();t.fd(50);}");
		System.out.println(DolittleGenerator.generate(dec.classes.get(0)));
	}

}
