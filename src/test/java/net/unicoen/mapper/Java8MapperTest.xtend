package net.unicoen.mapper

import org.junit.Test
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.node.UniClassDec

class Java8MapperTest {
	val mapper = new Java8Mapper(true)

	@Test
	def void parseClass() {
		val classDec = mapper.parse("public class A {}")
		assertThat(classDec, instanceOf(UniClassDec))
		assertThat((classDec as UniClassDec).className, equalTo("A"))
	}

}
