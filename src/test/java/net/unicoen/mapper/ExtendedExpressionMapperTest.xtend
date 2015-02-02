package net.unicoen.mapper

import org.junit.Test
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniBinOp
import net.unicoen.node.UniIf

class ExtendedExpressionMapperTest {
	val mapper = new ExtendedExpressionMapper()

	@Test
	def parseSimpleIfStatement(){
		val node = mapper.parse("if(3>2){}else{}")
		assertThat(node, instanceOf(typeof(UniIf)))
	}
	
	@Test
	def parseInteger() {
		val node = mapper.parse("123")
		assertThat(node, instanceOf(typeof(UniIntLiteral)))
		assertThat((node as UniIntLiteral).value, equalTo(123))
	}

	@Test
	def parseReal() {
		val node = mapper.parse("12.3")
		assertThat(node, instanceOf(typeof(UniDoubleLiteral)))
		assertThat((node as UniDoubleLiteral).value, equalTo(12.3))
	}
	
	@Test
	def parseSimpleInequalityExp() {
		val node = mapper.parse("3>2")
		assertThat(node, instanceOf(typeof(UniBinOp)))
		assertThat((node as UniBinOp).operator, equalTo(">"))
	}
	
	@Test
	def parseSimpleEqualitytiExp(){
		val node = mapper.parse("3==2")
		assertThat(node, instanceOf(typeof(UniBinOp)))
		assertThat((node as UniBinOp).operator, equalTo("=="))
	}
	
	@Test
	def parseInequalityExp(){
		val node = mapper.parse("3*12+24+(14*2-12)>=12.4+42*1.3")
		assertThat(node, instanceOf(typeof(UniBinOp)))
		assertThat((node as UniBinOp).operator, equalTo(">="))
		assertThat((node as UniBinOp).left,instanceOf(typeof(UniBinOp)))
		assertThat(((node as UniBinOp).left as UniBinOp).operator, equalTo("+"))
		assertThat((node as UniBinOp).right,instanceOf(typeof(UniBinOp)))
		assertThat(((node as UniBinOp).right as UniBinOp).operator, equalTo("+"))
	}

	@Test
	def parseExpressionWithParentheses() {
		val node = mapper.parse("(123+45*67)")
		assertThat(node, instanceOf(typeof(UniBinOp)))
		assertThat((node as UniBinOp).operator, equalTo("+"))
		assertThat((node as UniBinOp).right, instanceOf(typeof(UniBinOp)))
		assertThat(((node as UniBinOp).right as UniBinOp).operator, equalTo("*"))
	}

	@Test
	def parseExpression() {
		val node = mapper.parse("3*21+147-(5*12-32)")
		assertThat(node, instanceOf(typeof(UniBinOp)))
		assertThat((node as UniBinOp).operator, equalTo("-"))
		assertThat((node as UniBinOp).left, instanceOf(typeof(UniBinOp)))
		assertThat(((node as UniBinOp).left as UniBinOp).operator, equalTo("+"))
		assertThat((node as UniBinOp).right, instanceOf(typeof(UniBinOp)))
		assertThat(((node as UniBinOp).right as UniBinOp).operator, equalTo("-"))
		assertThat(((node as UniBinOp).left as UniBinOp).left, instanceOf(typeof(UniBinOp)))
		assertThat((((node as UniBinOp).left as UniBinOp).left as UniBinOp).operator, equalTo("*"))
		assertThat(((node as UniBinOp).left as UniBinOp).right, instanceOf(typeof(UniIntLiteral)))
		assertThat((((node as UniBinOp).left as UniBinOp).right as UniIntLiteral).value, equalTo(147))
		assertThat(((node as UniBinOp).right as UniBinOp).left, instanceOf(typeof(UniBinOp)))
		assertThat((((node as UniBinOp).right as UniBinOp).left as UniBinOp).operator, equalTo("*"))
		assertThat(((node as UniBinOp).right as UniBinOp).right, instanceOf(typeof(UniIntLiteral)))
		assertThat((((node as UniBinOp).right as UniBinOp).right as UniIntLiteral).value, equalTo(32))
		assertThat((((node as UniBinOp).left as UniBinOp).left as UniBinOp).left, instanceOf(typeof(UniIntLiteral)))
		assertThat(((((node as UniBinOp).left as UniBinOp).left as UniBinOp).left as UniIntLiteral).value, equalTo(3))
		assertThat((((node as UniBinOp).left as UniBinOp).left as UniBinOp).right, instanceOf(typeof(UniIntLiteral)))
		assertThat(((((node as UniBinOp).left as UniBinOp).left as UniBinOp).right as UniIntLiteral).value, equalTo(21))
		assertThat((((node as UniBinOp).right as UniBinOp).left as UniBinOp).left, instanceOf(typeof(UniIntLiteral)))
		assertThat(((((node as UniBinOp).right as UniBinOp).left as UniBinOp).left as UniIntLiteral).value, equalTo(5))
		assertThat((((node as UniBinOp).right as UniBinOp).left as UniBinOp).right, instanceOf(typeof(UniIntLiteral)))
		assertThat(((((node as UniBinOp).right as UniBinOp).left as UniBinOp).right as UniIntLiteral).value, equalTo(12))
	}

	@Test
	def parseIfProgram(){
		val node = mapper.parse("if(3>2){}else{}")
		assertThat(node, instanceOf(typeof(UniIf)))
	}
}
