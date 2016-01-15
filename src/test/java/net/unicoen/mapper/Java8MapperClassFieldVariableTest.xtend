package net.unicoen.mapper

import org.junit.Test
import net.unicoen.node.UniClassDec
import org.junit.Ignore
import net.unicoen.node.UniFieldDec
import net.unicoen.node.UniArray
import net.unicoen.node.UniStringLiteral
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniNewArray
import net.unicoen.node.UniNew
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniExpr
import net.unicoen.generator.JavaGenerator

class Java8MapperClassFieldVariableTest extends MapperTest {
	val mapper = new Java8Mapper(true)

	/**
	 * Test a single primitive variable attribute declaration.
	 */
	@Test
	def void parseSinglePrimitiveVarAttDec() {
		val actual = mapper.parse("public class A{public static final int a;}")

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "a"
		constant.type = "int"

		val expected = new UniClassDec
		expected.className = "A"
		expected.modifiers = #["public"]
		expected.members = #[constant as UniMemberDec]

		expected.evaluate(actual)
		
		println(JavaGenerator.generate(actual as UniClassDec))
		
		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}

	@Test
	def void parseMultiplePrimitiveVarAttDec() {
		val actual = mapper.parse("public class A{public static final int temp, temp1, temp2;}")

		val constant0 = new UniFieldDec
		constant0.modifiers = #["public", "static", "final"]
		constant0.name = "temp"
		constant0.type = "int"

		val constant1 = new UniFieldDec
		constant1.modifiers = #["public", "static", "final"]
		constant1.name = "temp1"
		constant1.type = "int"

		val constant2 = new UniFieldDec
		constant2.modifiers = #["public", "static", "final"]
		constant2.name = "temp2"
		constant2.type = "int"

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant0 as UniMemberDec, constant1 as UniMemberDec, constant2 as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
		
		println(JavaGenerator.generate(actual as UniClassDec))
		
		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}

	@Test
	def void parseSinglePrimitiveVarAttDecWithStringValue() {
		val actual = mapper.parse("public class A{public static final String a=\"abc\";}");

		val UniStringLiteral literal = new UniStringLiteral
		literal.value = "abc"

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "a"
		constant.type = "String"
		constant.value = literal

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]
		expected.modifiers = #["public"]
		expected.evaluate(actual)
		
		println(JavaGenerator.generate(actual as UniClassDec))
		
		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}

	@Test
	def void parseSinglePrimitiveVarAttDecWithIntValue() {
		val actual = mapper.parse("public class A{public static final int a=5;}");

		val UniIntLiteral literal = new UniIntLiteral
		literal.value = 5

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "a"
		constant.type = "int"
		constant.value = literal

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]
		expected.modifiers = #["public"]
		expected.evaluate(actual)
		
		println(JavaGenerator.generate(actual as UniClassDec))
		
		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}

	@Test
	def void parseSinglePrimitiveVarAttDecWithDoubleValue() {
		val actual = mapper.parse("public class A{public static final double a=5.5;}");

		val UniDoubleLiteral literal = new UniDoubleLiteral
		literal.value = 5.5

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "a"
		constant.type = "double"
		constant.value = literal

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]
		expected.modifiers = #["public"]
		expected.evaluate(actual)
		
		println(JavaGenerator.generate(actual as UniClassDec))
		
		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}

	@Test
	def void parseSinglePrimitiveVarAttDecWithBooleanValue() {
		val actual = mapper.parse("public class A{public static final boolean a=true;}");

		val UniBoolLiteral literal = new UniBoolLiteral
		literal.value = true

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "a"
		constant.type = "boolean"
		constant.value = literal

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]
		expected.modifiers = #["public"]
		expected.evaluate(actual)
		
		println(JavaGenerator.generate(actual as UniClassDec))
		
		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}

	@Test
	def void ParseMultiplePrimitiveVarAttDecWithValue() {
		val actual = mapper.parse("public class A{public static final int temp, temp1, temp2=5;}")

		val constant0 = new UniFieldDec
		constant0.modifiers = #["public", "static", "final"]
		constant0.name = "temp"
		constant0.type = "int"

		val constant1 = new UniFieldDec
		constant1.modifiers = #["public", "static", "final"]
		constant1.name = "temp1"
		constant1.type = "int"

		val constant2 = new UniFieldDec
		constant2.modifiers = #["public", "static", "final"]
		constant2.name = "temp2"
		constant2.type = "int"
		constant2.value = new UniIntLiteral(5)

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant0 as UniMemberDec, constant1 as UniMemberDec, constant2 as UniMemberDec]
		expected.modifiers = #["public"]
		expected.evaluate(actual)
		
		println(JavaGenerator.generate(actual as UniClassDec))
		
		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}

	@Test
	def void ParseClassInstanceDec() {
		val actual = mapper.parse("class A{public static final Temp tt;}");

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "tt"
		constant.type = "Temp"

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]
		expected.evaluate(actual)
		
		println(JavaGenerator.generate(actual as UniClassDec))
		
		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}

	@Test
	def void ParseClassInstanceDecWithValue() {
		val actual = mapper.parse("class A{public static final Temp tt = new Temp(1,2);}");

		val newInstance = new UniNew
		newInstance.args = #[new UniIntLiteral(1) as UniExpr, new UniIntLiteral(2) as UniExpr]
		newInstance.type = "Temp"

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "tt"
		constant.type = "Temp"
		constant.value = newInstance

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]

		expected.evaluate(actual)
		
		println(JavaGenerator.generate(actual as UniClassDec))
		
		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}

	@Test
	def void ParseArrayInstanceDec() {
		val actual = mapper.parse("class A{ public static final int[] arr = new int[3]; }")

		val newarray = new UniNewArray
		newarray.elementsNum = #[new UniIntLiteral(3) as UniExpr]
		newarray.type = "int"
		newarray.value = new UniArray

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "arr"
		constant.type = "int[]"
		constant.value = newarray

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]

		expected.evaluate(actual)
		
		println(JavaGenerator.generate(actual as UniClassDec))
		
		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}

	@Test
	def void ParseArrayInstanceDecWithValue() {
		val actual = mapper.parse("class A{ public static final int[] arr = {1,2,3}; }")

		val array = new UniArray
		array.items = #[new UniIntLiteral(1) as UniExpr, new UniIntLiteral(2) as UniExpr, new UniIntLiteral(3) as UniExpr]

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "arr"
		constant.type = "int[]"
		constant.value = array

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]

		expected.evaluate(actual)
		
		println(JavaGenerator.generate(actual as UniClassDec))
		
		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}

	@Test
	def void ParseArrayInstanceDecWithValue2() {
		val actual = mapper.parse("class A{ public static int[] arr = new int[]{1,2,3}; }")

		val array = new UniArray
		array.items = #[new UniIntLiteral(1) as UniExpr, new UniIntLiteral(2) as UniExpr, new UniIntLiteral(3) as UniExpr]

		val newarray = new UniNewArray
		newarray.type = "int[]"
		newarray.value = array

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static"]
		constant.name = "arr"
		constant.type = "int[]"
		constant.value = newarray

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]

		expected.evaluate(actual)
		
		println(JavaGenerator.generate(actual as UniClassDec))
		
		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}
}
