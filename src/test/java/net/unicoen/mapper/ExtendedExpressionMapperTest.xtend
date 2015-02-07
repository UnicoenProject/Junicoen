package net.unicoen.mapper

import org.junit.Test
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniBinOp
import net.unicoen.node.UniIf
import net.unicoen.node.UniClassDec

class ExtendedExpressionMapperTest {
	val mapper = new ExtendedExpressionMapper()

	@Test
	def parseSimpleIfStatement() {
		val node = mapper.parse("class A{void f(){if(3>2){}else{}}}")
		assertThat(node, instanceOf(typeof(UniClassDec)))
		assertEquals((node as UniClassDec).className, "A");
	}

	@Test
	def parseInteger() {
		val node = mapper.parse("class Main{void func(){int a=123;}}")
		assertThat(node, instanceOf(typeof(UniClassDec)))
		assertThat((node as UniClassDec).className, equalTo("Main"))
	}

	@Test
	def parseReal() {
		val node = mapper.parse("class C{void a(){double d = 12.3}}")
		assertThat(node, instanceOf(typeof(UniClassDec)))
		assertThat((node as UniClassDec).className, equalTo("C"))
	}

	@Test
	def parseInequalityExp() {
		val node = mapper.parse("class CLS{void main(){if(3*12+24+(14*2-12)>=12.4+42*1.3){}}}")
		assertThat(node, instanceOf(typeof(UniClassDec)))
		assertEquals((node as UniClassDec).className, "CLS")
	}

}
