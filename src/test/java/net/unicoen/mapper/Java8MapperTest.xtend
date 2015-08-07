package net.unicoen.mapper

import org.junit.Test
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.node.UniClassDec

class Java8MapperTest {
	val mapper = new Java8Mapper(true)

	@Test
	def Java8Test(){
		val node = mapper.parse("int main(){ int a; int b=1; }")
		assertThat(node, instanceOf(typeof(UniClassDec)))
		assertThat((node as UniClassDec).className, equalTo("main"))
	}

}
