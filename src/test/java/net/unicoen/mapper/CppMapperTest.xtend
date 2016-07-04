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

class CppMapperTest extends MapperTest {
	val mapper = new CPP14Mapper(true)
	
	@Test
	def void parseEmptyMethod() {
		val actual = mapper.parse("class a{}")
		
	}
}
