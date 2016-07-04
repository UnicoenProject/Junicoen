package net.unicoen.mapper

import com.google.common.collect.Lists
import java.util.HashMap
import net.unicoen.generator.JavaGenerator
import net.unicoen.node.UniBlock
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniMethodDec
import net.unicoen.node.UniStringLiteral
import org.junit.Test

import static net.unicoen.node_helper.Builder.*
import net.unicoen.node.UniMethodCall
import net.unicoen.node.UniFieldDec
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniExpr
import org.junit.Ignore
import net.unicoen.node.UniExpr
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class SwiftMapperTest extends MapperTest {
	val mapper = new SwiftMapper(true)
	
	@Test
	def void parseSwift() {
		val actual = mapper.parse("class name{}")
		val expected = new UniClassDec
		expected.className = "name"
		expected.interfaces = #[]
		
		expected.members = #[]
		expected.modifiers = #[]
		expected.superClass = #[]
		assertThat(actual, instanceOf(UniClassDec))
		
		val className = (actual as UniClassDec).className
		assertEquals(className, "name")
		

		//expected.evaluate(actual)
//		val actual = mapper.parse("func name(){}")
//		val expected = new UniMethodDec
//		expected.methodName = "name"
//		expected.modifiers = #[]
//		expected.args = #[]
//		expected.returnType = null
//		expected.block = null
//
//		expected.evaluate(actual)
		

//		println(JavaGenerator.generate(actual as UniClassDec))
//
//		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))
	}


}