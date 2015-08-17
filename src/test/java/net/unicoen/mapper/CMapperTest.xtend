package net.unicoen.mapper

import net.unicoen.node.UniClassDec
import org.junit.Ignore
import org.junit.Test

import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class CMapperTest {
	val mapper = new CMapper(true)

	@Test @Ignore
	def CTest() {
		val node = mapper.parse("int main(){ int a; int b=1; }")
		assertThat(node, instanceOf(typeof(UniClassDec)))
	}
}
