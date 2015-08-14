package net.unicoen.mapper

import net.unicoen.node.UniClassDec

import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class CMapperTest {
	val mapper = new CMapper(true)

//	@Test
	def CTest(){
		val node = mapper.parse("int main(){ int a; int b=1; }")
		assertThat(node, instanceOf(typeof(UniClassDec)))
	}

}
