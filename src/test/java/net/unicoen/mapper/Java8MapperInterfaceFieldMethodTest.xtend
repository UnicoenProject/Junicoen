package net.unicoen.mapper

import org.junit.Test
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniMethodDec
import net.unicoen.node.UniBlock
import net.unicoen.node.UniArg
import net.unicoen.generator.JavaGenerator
import net.unicoen.node.UniMethodCall
import net.unicoen.node.UniFieldAccess
import net.unicoen.node.UniIdent
import net.unicoen.node.UniExpr
import net.unicoen.node.UniStringLiteral
import net.unicoen.node.UniCast
import net.unicoen.node.UniVariableDec
import net.unicoen.node.UniUnaryOp
import net.unicoen.node.UniBinOp
import org.junit.Ignore

class Java8MapperInterfaceFieldMethodTest extends MapperTest {
	val mapper = new Java8Mapper(true)
	
	@Test
	def void parseEmptyMethod() {
		val actual = mapper.parse("public interface Main{ public static void main(String[] args){double a = (double) max;}}")
		
//		val arg = new UniArg
//		arg.name = "args"
//		arg.type = "String[]"
//		
//		val castvalue = new UniIdent
//		castvalue.name = "max"
//		val cast = new UniCast
//		cast.type = "double"
//		cast.value = castvalue
//		
//		val value = new UniUnaryOp
//		value.expr = castvalue
//		
//		val variable = new UniVariableDec
//		variable.type = "double"
//		variable.name = "a"
//		variable.value = value
//		
//		val block = new UniBlock
//		block.body = #[variable as UniExpr]
//		
//		val method = new UniMethodDec
//		method.args = #[arg]
//		method.block = block
//		method.methodName = "main"
//		method.modifiers = #["public", "static"]
//		method.returnType = "void"
//
//		val expected = new UniClassDec
//		expected.className = "Main"
//		expected.members = #[method as UniMemberDec]
//		expected.modifiers = #["public"]
//		
//		expected.evaluate(actual)
//		
//		println(JavaGenerator.generate(actual as UniClassDec))
//		
//		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))
	}
	
	@Test @Ignore
	def void searchPrintln(){
//		val actual = mapper.parse("public class temp{ public static void main(){System.out.println(\"Hello World\");}}")

val actual = mapper.parse("class YearJP extends Year{"
			+"private void checkOutEra(int year){"
			+"if(year>1895 && year<1912){"
			+"era = \"Meiji\";"
			+"year = year - 1895;"
			+"}"
			+"else if(year>=1912 && year<1926){"
			+"era = \"Taisho\";"
			+"year = year - 1912;"
			+"}"
			+"}"
			+"}"
			+"}"
		);
		println(actual)

//		val actual = mapper.parse("public class temp{temp(){this.name = name;}}")
			
//		val system = new UniIdent
//		system.name = "System"
//		
//		val fieldAccess = new UniFieldAccess
//		fieldAccess.receiver = system
//		fieldAccess.fieldName = "out"
//		
//		val string = new UniStringLiteral
//		string.value = "Hello World"
		
//		val receiver = fieldAccess
//		val methodName = "println"
//		val args = #[string as UniExpr]
		
//		val methodCall = new UniMethodCall
//		methodCall.receiver = receiver
//		methodCall.methodName = methodName
//		methodCall.args = args
		
		val receiver = new UniIdent
		receiver.name = "this"
		
		val fieldAccess = new UniFieldAccess
		fieldAccess.receiver = receiver
		fieldAccess.fieldName = "name"
		
		val value = new UniIdent
		value.name = "name"
		
		val binop = new UniBinOp
		binop.left = fieldAccess
		binop.operator = "="
		binop.right = value
		
		
		val block = new UniBlock
		block.body = #[binop as UniExpr]
		
		val method = new UniMethodDec
		method.block = block
		method.methodName = "temp"
//		method.modifiers = #[]
//		method.returnType = ""

		val expected = new UniClassDec
		expected.className = "temp"
		expected.members = #[method as UniMemberDec]
		expected.modifiers = #["public"]
		
//		expected.evaluate(actual)
		
//		println(JavaGenerator.generate(code as UniClassDec))
//		val code2 = mapper.parse("public class temp{ temp(){System.out.println();}}")
//		val code3 = mapper.parse("public class temp{ public static void main(String[] args){
//						System.out.println(\"aaa\");System.out.println(\"bbb\");}}")
	}
}
