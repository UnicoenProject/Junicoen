package net.unicoen.mapper

import net.unicoen.node.UniClassDec
import org.junit.Test

import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.node.UniMethodDec

class Java8MapperTest extends MapperTest {
	val mapper = new Java8Mapper(true)

	@Test
	def void parseClass() {
		val classDec = mapper.parse("public class A {}") as UniClassDec
		assertThat(classDec.className, equalTo("A"))
	}

	@Test
	def void parseClassWithExtendsAndImplements() {
		val classDec = mapper.parse("public static class A extends SuperClass implements Interface {}")
		assertThat(classDec, instanceOf(UniClassDec))
		assertThat((classDec as UniClassDec).modifiers.get(0), equalTo("public"))
		assertThat((classDec as UniClassDec).modifiers.get(1), equalTo("static"))
		assertThat((classDec as UniClassDec).superClass.get(0), equalTo("SuperClass"))
		assertThat((classDec as UniClassDec).interfaces.get(0), equalTo("Interface"))
		assertThat((classDec as UniClassDec).className, equalTo("A"))
	}

	@Test
	def void parseMainMethod() {
		val sb = new StringBuilder()

		sb.append("class A {")
		sb.append("  public static void main(String[] args) {")
		sb.append("  }")
		sb.append("}");

		val classDec = mapper.parse(sb.toString()) as UniClassDec
		val mainMethodDec = classDec.members.get(0) as UniMethodDec
		assertThat(mainMethodDec.methodName, equalTo("main"))
	}

// @Test
//	def void parseVariableAttriDec(){
//		val main = mapper.parse("public class A{public static final int temp = 5;}")
//		assertThat(main, instanceOf(UniClassDec))
//
//		var varAttDec = (main as UniClassDec).members.get(0) as UniFieldDec
//		assertThat((main as UniClassDec).members.get(0), equalTo(varAttDec))
//		assertThat((varAttDec as UniFieldDec).modifiers.get(0), equalTo("public"))
//		assertThat((varAttDec as UniFieldDec).modifiers.get(1), equalTo("static"))
//		assertThat((varAttDec as UniFieldDec).modifiers.get(2), equalTo("final"))
//		assertThat((varAttDec as UniFieldDec).type, equalTo("int"))
//		assertThat((varAttDec as UniFieldDec).name, equalTo("temp"))
//		assertThat((varAttDec as UniFieldDec).value, equalTo("5"))
//		 
//	}
//	@Test @Ignore
//	def void parseMainMethod() {
//		val main = mapper.parse("public class Main{ public static void main(String[] args){}}")
//		assertThat(main, instanceOf(UniClassDec))
//		val cls = main as UniClassDec
//		cls.evaluateClass("Main", null, null)
//		assertEquals(cls.members.size,1)
//	}
}
