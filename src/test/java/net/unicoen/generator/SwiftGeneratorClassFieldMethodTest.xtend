package net.unicoen.generator;

import com.google.common.collect.Lists
import java.util.HashMap
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniStringLiteral
import org.junit.Test

import static net.unicoen.node_helper.Builder.*
import net.unicoen.mapper.Java8Mapper
import static org.junit.Assert.*
import java.util.regex.Pattern

public class SwiftGeneratorClassFieldMethodTest{
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
	def void parseEmptyMethod() {
		val tree = mapper.parse("public class Main{ public static void main(String[] args){}}")
		val target = SwiftGenerator.generate(tree)
		assertEquals("public class Main { } ", format(target))
	}
	@Test
	def void parseEmptyConstructor() {
		val tree = mapper.parse("public class Main{ private Main(){} }")
		val target = SwiftGenerator.generate(tree)
		assertEquals("public class Main { init() { } } ", format(target))
	}
	@Test
	def void parseMethodWithSingleLocalVar() {
		val tree = mapper.parse("public class Main{ public static void main(){int a;}}")
		val target = SwiftGenerator.generate(tree);
		assertEquals("public class Main { } var a : Int ", format(target))
	}
	@Test
	def void parseMethodWithMultipleLocalVar() {
		val tree = mapper.parse("public class Main{ public static void main(){int a,b,c;}}")
		val target = SwiftGenerator.generate(tree);
		assertEquals("public class Main { } var a : Int; var b : Int; var c : Int; ", format(target))
	}
	
}