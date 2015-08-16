package net.unicoen.mapper

import net.unicoen.node.UniClassDec
import org.junit.Test

import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import org.junit.Ignore

class ExtendedExpressionMapperTest extends MapperTest {
	val mapper = new ExtendedExpressionMapper(true)

	@Test @Ignore
	def parseSimpleIfStatement() {
		val node = mapper.parse("public class A{void f(int i){if(3>2){}else{}}}")
		evaluateClass(node, "A", "public")
//		val methods = (node as UniClassDec).members
	}

	@Test @Ignore
	def parseInteger() {
		val node = mapper.parse("class Main{void func(){int a=123;}}")
		assertThat(node, instanceOf(typeof(UniClassDec)))
		assertThat((node as UniClassDec).className, equalTo("Main"))
	}

	@Test @Ignore
	def parseAddExpression() {
//		val node = mapper.parse("class Main{public static void main(int args){int a = 1+2+3+4+5;}}")
	}

	@Test @Ignore
	def parseReal() {
		val node = mapper.parse("class C{void a(){double d = 12.3}}")
		assertThat(node, instanceOf(typeof(UniClassDec)))
		assertThat((node as UniClassDec).className, equalTo("C"))
	}

	@Test @Ignore
	def parseInequalityExp() {
		val node = mapper.parse("class CLS{void main(){if(3*12+24+(14*2-12)>=12.4+42*1.3){}}}")
		assertThat(node, instanceOf(typeof(UniClassDec)))
		assertEquals((node as UniClassDec).className, "CLS")
	}

}
