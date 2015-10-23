package net.unicoen.mapper

import org.junit.Test
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.node.UniClassDec
import org.junit.Ignore
import net.unicoen.node.UniFieldDec

class Java8MapperTest extends MapperTest {
	val mapper = new Java8Mapper(true)

	@Test @Ignore
	def void parseClass() {
		//Empty Class Declaration
		val classDec = mapper.parse("public static class A extends SuperClass implements Interface {}")
		assertThat(classDec, instanceOf(UniClassDec))
		assertThat((classDec as UniClassDec).modifiers.get(0), equalTo("public"))
		assertThat((classDec as UniClassDec).modifiers.get(1), equalTo("static"))
		assertThat((classDec as UniClassDec).superClass.get(0), equalTo("SuperClass"))
		assertThat((classDec as UniClassDec).interfaces.get(0), equalTo("Interface"))
		assertThat((classDec as UniClassDec).className, equalTo("A"))
		
	}

	//@Test
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
