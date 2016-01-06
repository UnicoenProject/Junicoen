package net.unicoen.mapper

import org.junit.Test
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.node.UniClassDec
import org.junit.Ignore
import net.unicoen.node.UniFieldDec
import net.unicoen.node.UniArray
import net.unicoen.node.UniStringLiteral
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniUnaryOp
import net.unicoen.node.UniNew
import net.unicoen.node.UniNewArray
import net.unicoen.node.UniTernaryOp

class Java8MapperInterfaceFieldVariableTest extends MapperTest {
	val mapper = new Java8Mapper(true)

	@Test
	def void parseSinglePrimitiveVarAttDec() {

		//Single Primitive Variable Attribute Declaration
		val main = mapper.parse("public interface A{public static final int a;}")
		val String[] modifiers = #["public", "static", "final"]
		evaluateFieldDec((main as UniClassDec).members.get(0), "int", "a", null, modifiers)

	}

	@Test
	def void parseTernaryOp() {
		//Single Primitive Variable Attribute Declaration
		val main = mapper.parse("public interface A{public static final int a = true ? 1 : 2;}")
		val String[] modifiers = #["public", "static", "final"]
		val value = new UniTernaryOp
		value.cond = new UniBoolLiteral(true)
		value.trueExpr = new UniIntLiteral(1)
		value.falseExpr = new UniIntLiteral(2)
		evaluateFieldDec((main as UniClassDec).members.get(0), "int", "a", value, modifiers)

	}

	@Test
	def void parseMultiplePrimitiveVarAttDec() {
		val main = mapper.parse("public interface A{public static final int temp, temp1, temp2;}")
		main.evaluateClass("A", null, null)

		val String[] modifiers = #["public", "static", "final"]
		evaluateFieldDec((main as UniClassDec).members.get(0), "int", "temp", null, modifiers)
		evaluateFieldDec((main as UniClassDec).members.get(1), "int", "temp1", null, modifiers)
		evaluateFieldDec((main as UniClassDec).members.get(2), "int", "temp2", null, modifiers)
	}

	@Test
	@Ignore
	def void parseSinglePrimitiveVarAttDecWithStringValue() {
		val main = mapper.parse("public interface A{public static final String a=\"abc\";}");
		main.evaluateClass("A", null, null)

		val String[] modifiers = #["public", "static", "final"]
		val UniStringLiteral literal = new UniStringLiteral
		literal.value = "abc"
		val UniUnaryOp value = new UniUnaryOp
		value.expr = literal
		evaluateFieldDec((main as UniClassDec).members.get(0), "String", "a", value, modifiers)
	}

	@Test
	@Ignore
	def void parseSinglePrimitiveVarAttDecWithIntValue() {
		val main = mapper.parse("public interface A{public static final int a=5;}");
		main.evaluateClass("A", null, null)

		val String[] modifiers = #["public", "static", "final"]
		val UniIntLiteral literal = new UniIntLiteral
		literal.value = 5
		val UniUnaryOp value = new UniUnaryOp
		value.expr = literal
		evaluateFieldDec((main as UniClassDec).members.get(0), "int", "a", value, modifiers)
	}

	@Test
	@Ignore
	def void parseSinglePrimitiveVarAttDecWithDoubleValue() {
		val main = mapper.parse("public interface A{public static final double a=5.5;}");
		main.evaluateClass("A", null, null)

		val String[] modifiers = #["public", "static", "final"]
		val UniDoubleLiteral literal = new UniDoubleLiteral
		literal.value = 5.5
		val UniUnaryOp value = new UniUnaryOp
		value.expr = literal
		evaluateFieldDec((main as UniClassDec).members.get(0), "double", "a", value, modifiers)
	}

	@Test
	@Ignore
	def void parseSinglePrimitiveVarAttDecWithBooleanValue() {
		val main = mapper.parse("public interface A{public static final boolean a=true;}");
		main.evaluateClass("A", null, null)

		val String[] modifiers = #["public", "static", "final"]
		val UniBoolLiteral literal = new UniBoolLiteral
		literal.value = true
		val UniUnaryOp value = new UniUnaryOp
		value.expr = literal
		evaluateFieldDec((main as UniClassDec).members.get(0), "boolean", "a", value, modifiers)
	}

	@Test
	@Ignore
	def void ParseMultiplePrimitiveVarAttDecWithValue() {
		val main = mapper.parse("public interface A{public static final int temp, temp1, temp2=5;}")
		main.evaluateClass("A", null, null)

		val String[] modifiers = #["public", "static", "final"]
		evaluateFieldDec((main as UniClassDec).members.get(0), "int", "temp", null, modifiers)
		evaluateFieldDec((main as UniClassDec).members.get(1), "int", "temp1", null, modifiers)
		val UniIntLiteral literal = new UniIntLiteral
		literal.value = 5
		val UniUnaryOp value = new UniUnaryOp
		value.expr = literal
		evaluateFieldDec((main as UniClassDec).members.get(2), "int", "temp2", value, modifiers)
	}

	@Test
	def void ParseClassInstanceDec() {
		val main = mapper.parse("interface A{public static final Temp tt;}");
		main.evaluateClass("A", null, null)
		val String[] modifiers = #["public", "static", "final"]
		evaluateFieldDec((main as UniClassDec).members.get(0), "Temp", "tt", null, modifiers)

	}

	@Test
	@Ignore
	def void ParseClassInstanceDecWithValue() {
		val main = mapper.parse("interface A{public static final Temp tt = new Temp();}");
		main.evaluateClass("A", null, null)
		val String[] modifiers = #["public", "static", "final"]

		//"new" statements
		val UniNew literal = new UniNew
		literal.type = "Temp"
		literal.args = null
		val UniUnaryOp value = new UniUnaryOp
		value.expr = literal
		evaluateFieldDec((main as UniClassDec).members.get(0), "Temp", "tt", value, modifiers)

	}

	@Test
	@Ignore
	def void ParseArrayInstanceDec() {
		val main = mapper.parse("interface A{ public static final int[] arr = new int[3]; }")
		main.evaluateClass("A", null, null)

		val String[] modifiers = #["public", "static", "final"]

		//"new" statements
		val UniNewArray literal = new UniNewArray
		literal.type = "int"
		val UniIntLiteral intnum = new UniIntLiteral
		intnum.value = 3
		val UniUnaryOp num = new UniUnaryOp
		num.expr = intnum
		val UniUnaryOp[] elementsNum = #[num]
		literal.elementsNum = elementsNum
		literal.value = null
		val UniUnaryOp value = new UniUnaryOp
		value.expr = literal
		evaluateFieldDec((main as UniClassDec).members.get(0), "int[]", "arr", value, modifiers)
	}

	@Test
	@Ignore
	def void ParseArrayInstanceDecWithValue() {
		val main = mapper.parse("interface A{ public static int[] arr = {1,2,3}; }")
		main.evaluateClass("A", null, null)
		var varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("arr"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("int[]"))
		assertThat((varAttDec.value), instanceOf(UniArray))
		var varArrValue = varAttDec.value as UniArray

		val varAttDecVal = varArrValue.items
		assertThat(varAttDecVal.get(0), instanceOf(UniUnaryOp))
		assertThat((varAttDecVal.get(0) as UniUnaryOp).expr, instanceOf(UniIntLiteral))
		assertThat(((varAttDecVal.get(0) as UniUnaryOp).expr as UniIntLiteral).value, equalTo(1))
		assertThat(varAttDecVal.get(1), instanceOf(UniUnaryOp))
		assertThat((varAttDecVal.get(1) as UniUnaryOp).expr, instanceOf(UniIntLiteral))
		assertThat(((varAttDecVal.get(1) as UniUnaryOp).expr as UniIntLiteral).value, equalTo(2))
		assertThat(varAttDecVal.get(2), instanceOf(UniUnaryOp))
		assertThat((varAttDecVal.get(2) as UniUnaryOp).expr, instanceOf(UniIntLiteral))
		assertThat(((varAttDecVal.get(2) as UniUnaryOp).expr as UniIntLiteral).value, equalTo(3))

	}

	@Test
	@Ignore
	def void ParseArrayInstanceDecWithValue2() {
		val main = mapper.parse("interface A{ public static int[] arr = new int[]{1,2,3}; }")
		main.evaluateClass("A", null, null)
		var varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("arr"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("int[]"))
		assertThat(varAttDec.value, instanceOf(UniUnaryOp))
		assertThat((varAttDec.value as UniUnaryOp).expr, instanceOf(UniNewArray))
		var varArrValue = (varAttDec.value as UniUnaryOp).expr as UniNewArray
		assertThat((varArrValue as UniNewArray).type, equalTo("int"))
		assertThat((varArrValue.value), instanceOf(UniArray))
		var arrliteral = varArrValue.value as UniArray

		val eachliteral = arrliteral.items
		assertThat(eachliteral.get(0), instanceOf(UniUnaryOp))
		assertThat((eachliteral.get(0) as UniUnaryOp).expr, instanceOf(UniIntLiteral))
		assertThat(((eachliteral.get(0) as UniUnaryOp).expr as UniIntLiteral).value, equalTo(1))
		assertThat(eachliteral.get(1), instanceOf(UniUnaryOp))
		assertThat((eachliteral.get(1) as UniUnaryOp).expr, instanceOf(UniIntLiteral))
		assertThat(((eachliteral.get(1) as UniUnaryOp).expr as UniIntLiteral).value, equalTo(2))
		assertThat(eachliteral.get(2), instanceOf(UniUnaryOp))
		assertThat((eachliteral.get(2) as UniUnaryOp).expr, instanceOf(UniIntLiteral))
		assertThat(((eachliteral.get(2) as UniUnaryOp).expr as UniIntLiteral).value, equalTo(3))

	}

}
