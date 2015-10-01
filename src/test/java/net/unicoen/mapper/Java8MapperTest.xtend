package net.unicoen.mapper

import org.junit.Test
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.node.UniClassDec
import org.junit.Ignore

class Java8MapperTest extends MapperTest {
	val mapper = new Java8Mapper(true)

	@Test
	def void parseClass() {
		val classDec = mapper.parse("public class A {}")
		assertThat(classDec, instanceOf(UniClassDec))
		assertThat((classDec as UniClassDec).className, equalTo("A"))
	}

	@Test @Ignore
	def void parseMainMethod() {
		val main = mapper.parse("public class Main{ public static void main(String[] args){}}")
		assertThat(main, instanceOf(UniClassDec))
		val cls = main as UniClassDec
		cls.evaluateClass("Main", null, null)
		assertEquals(cls.members.size,1)
	}

}
