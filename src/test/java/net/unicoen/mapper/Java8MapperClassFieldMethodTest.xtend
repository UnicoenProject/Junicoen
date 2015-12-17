package net.unicoen.mapper

import org.junit.Test
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.node.UniClassDec

class Java8MapperClassFieldMethodTest extends MapperTest {
	val mapper = new Java8Mapper(true)
	
	@Test
	def void parseEmptyMethod() {
		val main = mapper.parse("public class Main{ public static void main(String[] args){}}")
		assertThat(main, instanceOf(UniClassDec))
		val cls = main as UniClassDec
		cls.evaluateClass("Main", null, null)
		assertEquals(cls.members.size,1)
	}
	@Test
	def void parseEmptyConstructor(){

	}
	@Test
	def void parseMethodWithSingleLocalVar(){
		
	}
	@Test
	def void parseMethodWithMultipleLocalVar(){
		
	}
	@Test
	def void parseMethodWithSingleLocalVarWithValue(){
		
	}
	@Test
	def void parseMethodWithMultipleLocalVarWithValue(){
		
	}
	@Test
	def void parseMethodWithIfStatement(){
		
	}
	@Test
	def void parseMethodWithForStatement(){
		
	}
	@Test 
	def void parseMethodWithWhileStatement(){
		
	}
	@Test
	def void parseMethodWthSwitchStatement(){
		
	}
	@Test
	def void parseMethodWithDoStatement(){
		
	}
	@Test
	def void parseMethodWithBreakStatement(){
		
	}
	@Test
	def void parseMethodWithContinueStatement(){
		
	}
	@Test
	def void parseMethodWithReturnStatement(){
		
	}
	@Test
	def void parseMethodWithThrowStatement(){
		
	}
	@Test
	def void parseMethodWithTryStatement(){
		
	}
	@Test
	def void parseMethodWithStdlb(){
		
	}
	
}
