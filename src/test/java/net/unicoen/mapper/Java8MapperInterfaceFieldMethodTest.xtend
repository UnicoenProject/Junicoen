package net.unicoen.mapper

import org.junit.Test
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniMethodDec
import net.unicoen.node.UniBlock
import net.unicoen.node.UniArg

class Java8MapperInterfaceFieldMethodTest extends MapperTest {
	val mapper = new Java8Mapper(true)
	
	@Test
	def void parseEmptyMethod() {
		val actual = mapper.parse("public interface Main{ public static void main(String[] args){}}")
		
		val arg = new UniArg
		arg.name = "args"
		arg.type = "String[]"
		
		val method = new UniMethodDec
		method.args = #[arg]
		method.block = new UniBlock
		method.methodName = "main"
		method.modifiers = #["public", "static"]
		method.returnType = "void"
		
		val expected = new UniClassDec
		expected.className = "Main"
		expected.members = #[method as UniMemberDec]
		expected.modifiers = #["public"]
		
		expected.evaluate(actual)
	}
}
