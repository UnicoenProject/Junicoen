package net.unicoen.mapper

import com.google.common.collect.Lists
import java.util.HashMap
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniStringLiteral
import org.junit.Test

import static net.unicoen.node_helper.Builder.*
import net.unicoen.generator.JavaGenerator

class Java8MapperTest extends MapperTest {
	val mapper = new Java8Mapper(true)

	@Test
	def void parseClass() {
		val actual = mapper.parse("public class A {}")

		val expected = new UniClassDec
		expected.className = "A"
		expected.interfaces = #[]
		expected.members = #[]
		expected.modifiers = #["public"]
		expected.superClass = #[]

		expected.evaluate(actual)

		println(JavaGenerator.generate(actual as UniClassDec))

		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))
	}

	@Test
	def void parseClassWithComment() {
		val actual = mapper.parse("/* AA */ public class A {}")

		val expected = new UniClassDec
		expected.className = "A"
		expected.interfaces = #[]
		expected.members = #[]
		expected.modifiers = #["public"]
		expected.superClass = #[]
		expected.beforeComment = "/* AA */"

		expected.evaluate(actual)

		println(JavaGenerator.generate(actual as UniClassDec))

		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))
	}

	@Test
	def void parseSimpleProgramWithComment() {
		val actual = mapper.parse("/* AA */ public class A { } // AA")

		val expected = new UniClassDec
		expected.className = "A"
		expected.interfaces = #[]
		expected.members = #[]
		expected.modifiers = #["public"]
		expected.superClass = #[]
		expected.beforeComment = "/* AA */"
		expected.afterComment = "// AA"

		expected.evaluate(actual)

		println(JavaGenerator.generate(actual as UniClassDec))

		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))
	}

	@Test
	def void parseClassWithExtendsAndImplements() {
		val expected = new UniClassDec
		expected.className = "A"
		expected.interfaces = #["Interface", "Interface1"]
		expected.members = #[]
		expected.modifiers = #["public", "static"]
		expected.superClass = #["SuperClass"]

		val actual = mapper.parse("public static class A extends SuperClass implements Interface,Interface1 {}")

		expected.evaluate(actual)

		println(JavaGenerator.generate(actual as UniClassDec))

		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))
	}

	@Test
	def void parseInterface() {

		//Empty InterfaceDeclaration
		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[]
		expected.modifiers = #["public"]
		expected.superClass = #["SuperInterface1"]

		val actual = mapper.parse("public interface A extends SuperInterface1 {}")

		expected.evaluate(actual)

		println(JavaGenerator.generate(actual as UniClassDec))

		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}

	@Test
	def void parseLiteral() {
		{
			val literal = mapper.castTo(mapper.parse("1", [p|p.literal]), UniIntLiteral)
			lit(1).evaluate(literal)
		}
		{
			val literal = mapper.castTo(mapper.parse("1.0", [p|p.literal]), UniDoubleLiteral)
			lit(1.0).evaluate(literal)
		}
		{
			val literal = mapper.castTo(mapper.parse("true", [p|p.literal]), UniBoolLiteral)
			lit(true).evaluate(literal)
		}
		{
			val literal = mapper.castTo(mapper.parse("\"Hello\"", [p|p.literal]), UniStringLiteral)
			lit("Hello").evaluate(literal)
		}
	}

	@Test
	def void testCastToList() {
		val map = new HashMap<String, Object>
		val list = Lists.newArrayList
		map.put("add", list)
		map.put("none", Lists.newArrayList)
		val map2 = new HashMap<String, Object>
		list.add(map2)
		val list2 = Lists.newArrayList
		list2.add("public")
		map2.put("none", list2)
		val map3 = new HashMap<String, Object>
		list.add(map3)
		val list3 = Lists.newArrayList
		list3.add("static")
		map3.put("none", list3)
		val result = mapper.castToList(map, String)
		println(result)
	}

}
