package net.unicoen.mapper

import net.unicoen.node.*
import org.junit.Test

class ExtendedCalculatorTest extends MapperTest {
	val mapper = new ExtendedCalculatorMapper(true)
	
	@Test
	def void sampleTest() {
		val actual = mapper.parse("class Sample; x=3+2;")
		
		val node1 = "Sample"
		
		val node2 = "x"
		
		val node3 = "+"
		
		val node4 = 3
		
		val node5 = new UniIntLiteral
		node5.value = node4
		
		val node6 = 2
		
		val node7 = new UniIntLiteral
		node7.value = node6
		
		val node8 = new UniBinOp
		node8.operator = node3
		node8.left = node5
		node8.right = node7
		
		val node9 = new UniFieldDec
		node9.name = node2
		node9.value = node8
		
		val node10 = #[node9 as UniMemberDec]
		
		val node11 = new UniClassDec
		node11.className = node1
		node11.members = node10
		
		node11.evaluate(actual)
	}
	
	@Test
	def void programTest() {
		val actual = mapper.parse("class Sample;
		
		x = 3 + 2 * 4;
		function (x, y) {
			sin(x) + cos(y)
		}")
		
		val node1 = "Sample"
		
		val node2 = "x"
		
		val node3 = "+"
		
		val node4 = 3
		
		val node5 = new UniIntLiteral
		node5.value = node4
		
		val node6 = "*"
		
		val node7 = 2
		
		val node8 = new UniIntLiteral
		node8.value = node7
		
		val node9 = 4
		
		val node10 = new UniIntLiteral
		node10.value = node9
		
		val node11 = new UniBinOp
		node11.operator = node6
		node11.left = node8
		node11.right = node10
		
		val node12 = new UniBinOp
		node12.operator = node3
		node12.left = node5
		node12.right = node11
		
		val node13 = new UniFieldDec
		node13.name = node2
		node13.value = node12
		
		val node14 = "function"
		
		val node15 = "x"
		
		val node16 = new UniArg
		node16.name = node15
		
		val node17 = "y"
		
		val node18 = new UniArg
		node18.name = node17
		
		val node19 = #[node16, node18]
		
		val node20 = "+"
		
		val node21 = "sin"
		
		val node22 = "x"
		
		val node23 = new UniFieldAccess
		node23.fieldName = node22
		
		val node24 = #[node23 as UniExpr]
		
		val node25 = new UniMethodCall
		node25.methodName = node21
		node25.args = node24
		
		val node26 = "cos"
		
		val node27 = "y"
		
		val node28 = new UniFieldAccess
		node28.fieldName = node27
		
		val node29 = #[node28 as UniExpr]
		
		val node30 = new UniMethodCall
		node30.methodName = node26
		node30.args = node29
		
		val node31 = new UniBinOp
		node31.operator = node20
		node31.left = node25
		node31.right = node30
		
		val node32 = #[node31 as UniExpr]
		
		val node33 = new UniBlock
		node33.body = node32
		
		val node34 = new UniMethodDec
		node34.methodName = node14
		node34.args = node19
		node34.block = node33
		
		val node35 = #[node13 as UniMemberDec, node34 as UniMemberDec]
		
		val node36 = new UniClassDec
		node36.className = node1
		node36.members = node35
		
		node36.evaluate(actual)
	}
	
}
