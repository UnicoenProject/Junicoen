package net.unicoen.mapper

import net.unicoen.node.UniArray
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniExpr
import net.unicoen.node.UniFieldDec
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniNew
import net.unicoen.node.UniNewArray
import net.unicoen.node.UniStringLiteral
import net.unicoen.node.UniTernaryOp
import org.junit.Ignore
import org.junit.Test

class Java8MapperInterfaceFieldVariableTest extends MapperTest {
	val mapper = new Java8Mapper(true)

	@Test
	def void parseSinglePrimitiveVarAttDec() {
		val actual = mapper.parse("public interface A{public static final int a;}")

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "a"
		constant.type = "int"

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
	}

	@Test
	def void parseTernaryOp() {
		val actual = mapper.parse("public interface A{public static final int a = true ? 1 : 2;}")

		val ternaryOp = new UniTernaryOp
		ternaryOp.cond = new UniBoolLiteral(true)
		ternaryOp.trueExpr = new UniIntLiteral(1)
		ternaryOp.falseExpr = new UniIntLiteral(2)

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "a"
		constant.type = "int"
		constant.value = ternaryOp

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
	}

	@Test
	def void parseMultiplePrimitiveVarAttDec() {
		val actual = mapper.parse("public interface A{public static final int temp, temp1, temp2;}")

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
	}

	@Test
	def void parseSinglePrimitiveVarAttDecWithStringValue() {
		val actual = mapper.parse("public interface A{public static final String a=\"abc\";}");

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "a"
		constant.type = "String"
		constant.value = new UniStringLiteral("abc")

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
	}

	@Test
	def void parseSinglePrimitiveVarAttDecWithIntValue() {
		val actual = mapper.parse("public interface A{public static final int a=5;}");

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "a"
		constant.type = "int"
		constant.value = new UniIntLiteral(5)

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
	}

	@Test
	def void parseSinglePrimitiveVarAttDecWithDoubleValue() {
		val actual = mapper.parse("public interface A{public static final double a=5.5;}");

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "a"
		constant.type = "double"
		constant.value = new UniDoubleLiteral(5.5)

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
	}

	@Test
	def void parseSinglePrimitiveVarAttDecWithBooleanValue() {
		val actual = mapper.parse("public interface A{public static final boolean a=true;}");

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "a"
		constant.type = "boolean"
		constant.value = new UniBoolLiteral(true)

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
	}

	@Test
	def void ParseMultiplePrimitiveVarAttDecWithValue() {
		val actual = mapper.parse("public interface A{public static final int temp, temp1, temp2=5;}")

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
	}

	@Test
	def void ParseClassInstanceDec() {
		val actual = mapper.parse("interface A{public static final Temp tt;}");

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "tt"
		constant.type = "Temp"

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]

		expected.evaluate(actual)
	}

	@Test
	@Ignore
	def void ParseClassInstanceDecWithValue() {
		val actual = mapper.parse("interface A{public static final Temp tt = new Temp();}");

		val newstat = new UniNew
		newstat.type = "Temp"

		val constant = new UniFieldDec
		constant.modifiers = #["public", "static", "final"]
		constant.name = "tt"
		constant.type = "Temp"
		constant.value = newstat

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]

		expected.evaluate(actual)
	}

	@Test
	def void ParseArrayInstanceDec() {
		val actual = mapper.parse("interface A{ public static final int[] arr = new int[3]; }")

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
	}

	@Test
	def void ParseArrayInstanceDecWithValue() {
		val actual = mapper.parse("interface A{ public static int[] arr = {1,2,3}; }")

		val array = new UniArray
		array.items = #[new UniIntLiteral(1) as UniExpr, new UniIntLiteral(2) as UniExpr, new UniIntLiteral(3) as UniExpr]
		
		val constant = new UniFieldDec
		constant.modifiers = #["public", "static"]
		constant.name = "arr"
		constant.type = "int[]"
		constant.value = array

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[constant as UniMemberDec]

		expected.evaluate(actual)
	}

	@Test
	def void ParseArrayInstanceDecWithValue2() {
		val actual = mapper.parse("interface A{ public static int[] arr = new int[]{1,2,3}; }")

		val array = new UniArray
		array.items = #[new UniIntLiteral(1) as UniExpr, new UniIntLiteral(2) as UniExpr, new UniIntLiteral(3) as UniExpr]
		
		val newarray = new UniNewArray
		newarray.type = "int"
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
	}

}
