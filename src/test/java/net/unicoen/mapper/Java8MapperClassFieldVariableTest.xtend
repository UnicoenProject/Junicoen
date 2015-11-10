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
		assertThat(main,instanceOf(UniClassDec))
		val varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("a"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(2), equalTo("final"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("int"))
	}

	@Test
	def void parseMultiplePrimitiveVarAttDec(){
		val main = mapper.parse("public class A{public static final int temp, temp1, temp2;}")
		assertThat(main, instanceOf(UniClassDec))

		var varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("temp"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(2), equalTo("final"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("int"))
		
		varAttDec = (main as UniClassDec).members.get(1) as UniFieldDec
		assertThat((main as UniClassDec).members.get(1), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("temp1"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(2), equalTo("final"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("int"))
		
		varAttDec = (main as UniClassDec).members.get(2) as UniFieldDec
		assertThat((main as UniClassDec).members.get(2), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("temp2"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(2), equalTo("final"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("int"))
	}
	@Test
	def void parseSinglePrimitiveVarAttDecWithStringValue(){
		val main = mapper.parse("public class A{public static final String a=\"abc\";}");
		assertThat(main,instanceOf(UniClassDec))
		val varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("a"))
		
		val varAttDecVal = varAttDec.value
		assertThat(varAttDecVal, instanceOf(UniStringLiteral))
		assertThat((varAttDecVal as UniStringLiteral).value, equalTo("abc"))
		
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(2), equalTo("final"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("String"))
	}
	@Test
	def void parseSinglePrimitiveVarAttDecWithIntValue(){
		val main = mapper.parse("public class A{public static final int a=5;}");
		assertThat(main,instanceOf(UniClassDec))
		val varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("a"))
		
		val varAttDecVal = varAttDec.value
		assertThat(varAttDecVal, instanceOf(UniIntLiteral))
		assertThat((varAttDecVal as UniIntLiteral).value, equalTo(5))
		
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(2), equalTo("final"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("int"))
	}
	@Test
	def void parseSinglePrimitiveVarAttDecWithDoubleValue(){
		val main = mapper.parse("public class A{public static final double a=5.5;}");
		assertThat(main,instanceOf(UniClassDec))
		val varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("a"))
		
		val varAttDecVal = varAttDec.value
		assertThat(varAttDecVal, instanceOf(UniDoubleLiteral))
		assertThat((varAttDecVal as UniDoubleLiteral).value, equalTo(5.5))
		
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(2), equalTo("final"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("double"))
	}
	@Test
	def void parseSinglePrimitiveVarAttDecWithBooleanValue(){
		val main = mapper.parse("public class A{public static final boolean a=true;}");
		assertThat(main,instanceOf(UniClassDec))
		val varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("a"))
		
		val varAttDecVal = varAttDec.value
		assertThat(varAttDecVal, instanceOf(UniBoolLiteral))
		assertThat((varAttDecVal as UniBoolLiteral).value, equalTo(true))
		
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(2), equalTo("final"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("boolean"))
	}
	@Test
	def void ParseMultiplePrimitiveVarAttDecWithValue(){
		val main = mapper.parse("public class A{public static final int temp, temp1, temp2=5;}")
		assertThat(main, instanceOf(UniClassDec))

		var varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("temp"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(2), equalTo("final"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("int"))
		
		varAttDec = (main as UniClassDec).members.get(1) as UniFieldDec
		assertThat((main as UniClassDec).members.get(1), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("temp1"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(2), equalTo("final"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("int"))
		
		varAttDec = (main as UniClassDec).members.get(2) as UniFieldDec
		assertThat((main as UniClassDec).members.get(2), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("temp2"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(2), equalTo("final"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("int"))

		val varAttDecVal = varAttDec.value
		assertThat(varAttDecVal, instanceOf(UniIntLiteral))
		assertThat((varAttDecVal as UniIntLiteral).value, equalTo(5))
		
	}
	@Test
	def void ParseClassInstanceDec(){
		val main = mapper.parse("class A{public static Temp tt;}");
		assertThat(main, instanceOf(UniClassDec))

		var varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("tt"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("Temp"))
	}
	@Test
	def void ParseClassInstanceDecWithValue(){
		val main = mapper.parse("class A{public static Temp tt = new Temp();}");
		assertThat(main, instanceOf(UniClassDec))

		var varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("tt"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("Temp"))
	}
	@Test
	def void ParseArrayInstanceDec(){
		val main = mapper.parse("class A{ public static int[] arr = new int[3]; }")
		assertThat(main, instanceOf(UniClassDec))
		
		var varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
		assertThat((varAttDec as UniFieldDec).name, equalTo("arr"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
		assertThat((varAttDec as UniFieldDec).type, equalTo("int[]"))
	}
	@Test
	def void ParseArrayInstanceDecWithValue(){
		val main = mapper.parse("class A{ public static int[] arr = {1,2,3}; }")
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