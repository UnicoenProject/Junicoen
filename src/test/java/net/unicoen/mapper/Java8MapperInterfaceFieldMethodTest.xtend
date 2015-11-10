package net.unicoen.mapper

import org.junit.Test
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.node.UniClassDec
import org.junit.Ignore
import net.unicoen.node.UniFieldDec
import net.unicoen.node.UniArray

class Java8MapperInterfaceFieldMethodTest extends MapperTest {
	val mapper = new Java8Mapper(true)
	
	@Test
	def void parseEmptyMethod() {
		val main = mapper.parse("public interface Main{ public static void main(String[] args){}}")
		assertThat(main, instanceOf(UniClassDec))
		val cls = main as UniClassDec
		cls.evaluateClass("Main", null, null)
		assertEquals(cls.members.size,1)
	}
}
