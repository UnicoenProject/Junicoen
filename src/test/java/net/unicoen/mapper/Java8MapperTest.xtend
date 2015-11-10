package net.unicoen.mapper

import net.unicoen.node.UniClassDec
import org.junit.Test

import static net.unicoen.node_helper.Builder.*
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.node.UniMethodCall
import org.junit.Ignore

class Java8MapperTest extends MapperTest {
	val mapper = new Java8Mapper(true)

	@Test
	def void parseClass() {
		//Empty Class Declaration
		val classDec = mapper.parse("public class A {}") as UniClassDec
		assertThat(classDec.className, equalTo("A"))
	}

	@Test
	def void parseClassWithExtendsAndImplements() {
		val classDec = mapper.parse("public static class A extends SuperClass implements Interface,Interface1 {}")
		assertThat(classDec, instanceOf(UniClassDec))
		assertThat((classDec as UniClassDec).modifiers.get(0), equalTo("public"))
		assertThat((classDec as UniClassDec).modifiers.get(1), equalTo("static"))
		assertThat((classDec as UniClassDec).superClass.get(0), equalTo("SuperClass"))
		assertThat((classDec as UniClassDec).interfaces.get(0), equalTo("Interface"))
		assertThat((classDec as UniClassDec).interfaces.get(1), equalTo("Interface1"))
		assertThat((classDec as UniClassDec).className, equalTo("A"))
	}
	@Test
	def void parseInterface() {
		//Empty InterfaceDeclaration
		val interfaceDec = mapper.parse("public interface A extends SuperInterface1,SuperInterface2{}")
		assertThat(interfaceDec, instanceOf(UniClassDec))
		assertThat((interfaceDec as UniClassDec).modifiers.get(0), equalTo("public"))
		assertThat((interfaceDec as UniClassDec).interfaces.get(0), equalTo("SuperInterface1"))
		assertThat((interfaceDec as UniClassDec).interfaces.get(1), equalTo("SuperInterface2"))
		assertThat((interfaceDec as UniClassDec).className, equalTo("A"))
	}
	@Test
	def void parseLiteral() {
		{
			val literal = mapper.parse("1", [p|p.literal])
			assertThat(literal, equalTo(lit(1)))
		}
		{
			val literal = mapper.parse("1.0", [p|p.literal])
			assertThat(literal, equalTo(lit(1.0)))
		}
		{
			val literal = mapper.parse("true", [p|p.literal])
			assertThat(literal, equalTo(lit(true)))
		}
		{
			val literal = mapper.parse("\"Hello\"", [p|p.literal])
			assertThat(literal, equalTo(lit("Hello")))
		}
	}

	@Test @Ignore
	def void parseFuncCall() {
		val literal = mapper.parse("f()", [p|p.methodInvocation])
		assertThat(literal, equalTo(new UniMethodCall(null, "f", list())))
	}
}
