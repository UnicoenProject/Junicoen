package net.unicoen.mapper

import net.unicoen.node.UniClassDec
import org.junit.Ignore
import org.junit.Test

import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class Java8NewMapperTest {
	val mapper = new Java8NewMapper(true)

	@Test @Ignore
	def void parseMain() {
		val node = mapper.parse("int main(){ int a; int b=1; }")
		assertThat(node, instanceOf(typeof(UniClassDec)))
		assertThat((node as UniClassDec).className, equalTo("main"))
	}

	@Test
	def void parseClass() {
		val mapper = new Java8NewMapper(true)
		mapper.parse("public class A {}")
	}
}
