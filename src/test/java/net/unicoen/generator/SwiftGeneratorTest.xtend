package net.unicoen.generator;

import org.junit.Test

import net.unicoen.mapper.Java8Mapper
import static org.junit.Assert.*
import java.util.regex.Pattern

public class SwiftGeneratorTest{
	
	val mapper = new Java8Mapper(true)
	private val whitespace = Pattern.compile("\\s+");
	public def format(String str) {
		
		var replaced = whitespace.matcher(str).replaceAll(" ");
		if (replaced.charAt(replaced.length() - 1) == ' ') {
			replaced = replaced.substring(0, replaced.length() - 1);
		}
		return replaced;
	}
	@Test
	def void parseClass() {
		val tree = mapper.parse("public class A {}")
		val target = SwiftGenerator.generate(tree)
		assertEquals("public class A { } ",format(target))
	}
	@Test
	def void parseClassWithExtendsAndImplements(){
		val tree = mapper.parse("public static class A extends SuperClass implements Interface,Interface1 {}")
		val target = SwiftGenerator.generate(tree)
		assertEquals("public static class A : SuperClass{ } ",format(target))
	}
	
}