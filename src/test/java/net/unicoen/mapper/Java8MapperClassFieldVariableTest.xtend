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

class Java8MapperClassFieldVariableTest extends MapperTest {
	val mapper = new Java8Mapper(true)
	
	@Test
	def void parseSinglePrimitiveVarAttDec(){
		//Single Primitive Variable Attribute Declaration
		val main = mapper.parse("public class A{public static final int a;}")
		main.evaluateClass("A",null,null,1)
		
		val String[] modifiers = #["public","static","final"]
		evaluateFieldDec((main as UniClassDec).members.get(0), "int", "a", null, modifiers)
	}

	@Test
	def void parseMultiplePrimitiveVarAttDec(){
		val main = mapper.parse("public class A{public static final int temp, temp1, temp2;}")
		main.evaluateClass("A", null, null,3)		
		
		val String[] modifiers = #["public","static","final"]
		evaluateFieldDec((main as UniClassDec).members.get(0), "int", "temp", null, modifiers)
		evaluateFieldDec((main as UniClassDec).members.get(1), "int", "temp1", null, modifiers)
		evaluateFieldDec((main as UniClassDec).members.get(2), "int", "temp2", null, modifiers)
	}
	@Test
	def void parseSinglePrimitiveVarAttDecWithStringValue(){
		val main = mapper.parse("public class A{public static final String a=\"abc\";}");
		main.evaluateClass("A", null, null, 1)
		
		val String[] modifiers = #["public", "static", "final"]
		val UniStringLiteral literal = new UniStringLiteral
		literal.value = "abc"
		evaluateFieldDec((main as UniClassDec).members.get(0), "String", "a", literal, modifiers)
	}
	@Test
	def void parseSinglePrimitiveVarAttDecWithIntValue(){
		val main = mapper.parse("public class A{public static final int a=5;}");
		main.evaluateClass("A", null, null, 1)
		
		val String[] modifiers = #["public", "static", "final"]
		val UniIntLiteral literal = new UniIntLiteral
		literal.value = 5
		evaluateFieldDec((main as UniClassDec).members.get(0), "int", "a", literal, modifiers)
	}
	@Test
	def void parseSinglePrimitiveVarAttDecWithDoubleValue(){
		val main = mapper.parse("public class A{public static final double a=5.5;}");
		main.evaluateClass("A", null, null, 1)
		
		val String[] modifiers = #["public", "static", "final"]
		val UniDoubleLiteral literal = new UniDoubleLiteral
		literal.value = 5.5
		evaluateFieldDec((main as UniClassDec).members.get(0), "double", "a", literal, modifiers)
	}
	@Test
	def void parseSinglePrimitiveVarAttDecWithBooleanValue(){
		val main = mapper.parse("public class A{public static final boolean a=true;}");
		main.evaluateClass("A", null, null, 1)
		
		val String[] modifiers = #["public", "static", "final"]
		val UniBoolLiteral literal = new UniBoolLiteral
		literal.value = true
		evaluateFieldDec((main as UniClassDec).members.get(0), "boolean", "a", literal, modifiers)
	}
	@Test
	def void ParseMultiplePrimitiveVarAttDecWithValue(){
		val main = mapper.parse("public class A{public static final int temp, temp1, temp2=5;}")
		main.evaluateClass("A", null, null, 3)		
		
		val String[] modifiers = #["public","static","final"]
		evaluateFieldDec((main as UniClassDec).members.get(0), "int", "temp", null, modifiers)
		evaluateFieldDec((main as UniClassDec).members.get(1), "int", "temp1", null, modifiers)
		val UniIntLiteral literal = new UniIntLiteral
		literal.value = 5
		evaluateFieldDec((main as UniClassDec).members.get(2), "int", "temp2", literal, modifiers)
	}
	@Test
	def void ParseClassInstanceDec(){
		val main = mapper.parse("class A{public static final Temp tt;}");
		main.evaluateClass("A",null,null,1)
		val String[] modifiers = #["public","static","final"]
		evaluateFieldDec((main as UniClassDec).members.get(0), "Temp", "tt", null, modifiers)
	}
	@Test
	def void ParseClassInstanceDecWithValue(){
		val main = mapper.parse("class A{public static final Temp tt = new Temp();}");
		main.evaluateClass("A",null,null,1)
		val String[] modifiers = #["public","static","final"]
		//"new" statements
		evaluateFieldDec((main as UniClassDec).members.get(0), "Temp", "tt", null, modifiers)
		
	}
	@Test
	def void ParseArrayInstanceDec(){
		val main = mapper.parse("class A{ public static fincl int[] arr = new int[3]; }")
		main.evaluateClass("A",null,null,1)
		val String[] modifiers = #["public","static","final"]
		//"new" statements
		evaluateFieldDec((main as UniClassDec).members.get(0), "int[]", "arr", null, modifiers)
	}
	@Test
	def void ParseArrayInstanceDecWithValue(){
		val main = mapper.parse("class A{ public static final int[] arr = {1,2,3}; }")
		main.evaluateClass("A",null,null,1)
		val String[] modifiers = #["public","static","final"]
		val UniArray arr = new UniArray
		val UniIntLiteral int1 = new UniIntLiteral
		int1.value = 1
		val UniIntLiteral int2 = new UniIntLiteral
		int1.value = 2
		val UniIntLiteral int3 = new UniIntLiteral
		int1.value = 3
		val UniIntLiteral[] values = #[int1,int2,int3]
		arr.items = values
		//evaluateFieldDec((main as UniClassDec).members.get(0), "int[]", "arr", arr, modifiers)
		var varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("arr"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("int[]"))
		var varArrValue = varAttDec.value as UniArray
		
		val varAttDecVal = varArrValue.items
		assertThat(varAttDecVal.get(0), instanceOf(UniIntLiteral))
		assertThat((varAttDecVal.get(0) as UniIntLiteral).value, equalTo(1))
		assertThat(varAttDecVal.get(1), instanceOf(UniIntLiteral))
		assertThat((varAttDecVal.get(1) as UniIntLiteral).value, equalTo(2))
		assertThat(varAttDecVal.get(2), instanceOf(UniIntLiteral))
		assertThat((varAttDecVal.get(2) as UniIntLiteral).value, equalTo(3))
	}
	@Test
	def void ParseArrayInstanceDecWithValue2(){
		val main = mapper.parse("class A{ public static int[] arr = new int[]{1,2,3}; }")
		assertThat(main, instanceOf(UniClassDec))
		
		var varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("arr"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("int[]"))
		var varArrValue = varAttDec.value as UniArray
		val varAttDecVal = varArrValue.items
		assertThat(varAttDecVal.get(0), instanceOf(UniIntLiteral))
		assertThat((varAttDecVal.get(0) as UniIntLiteral).value, equalTo(1))
		
		assertThat(varAttDecVal.get(1), instanceOf(UniIntLiteral))
		assertThat((varAttDecVal.get(1) as UniIntLiteral).value, equalTo(2))
		
		assertThat(varAttDecVal.get(2), instanceOf(UniIntLiteral))
		assertThat((varAttDecVal.get(2) as UniIntLiteral).value, equalTo(3))
	}
}