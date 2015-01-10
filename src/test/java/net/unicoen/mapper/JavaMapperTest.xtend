package net.unicoen.mapper

import net.unicoen.node.UniClassDec
import org.junit.Test

import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class JavaMapperTest {
	//@Test
	def parseClass() {
		val mapper = new JavaMapper()
		val node = mapper.parse("class A {}")
		assertThat(node, instanceOf(typeof(UniClassDec)))
		assertThat((node as UniClassDec).className, equalTo("A"))
	}
}
