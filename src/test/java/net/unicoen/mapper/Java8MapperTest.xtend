package net.unicoen.mapper

import com.google.common.collect.Lists
import java.util.HashMap
import net.unicoen.node.UniClassDec
import org.junit.Test

import static net.unicoen.node_helper.Builder.*
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniStringLiteral
import java.util.List

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
		val interfaceDec = mapper.parse("public interface A extends SuperInterface1 {}")
		assertThat(interfaceDec, instanceOf(UniClassDec))
		assertThat((interfaceDec as UniClassDec).modifiers.get(0), equalTo("public"))
		assertThat((interfaceDec as UniClassDec).superClass.get(0), equalTo("SuperInterface1"))
		assertThat((interfaceDec as UniClassDec).className, equalTo("A"))
	}

	@Test
	def void parseLiteral() {
		{
			val literal = mapper.castTo(mapper.parse("1", [p|p.literal]), UniIntLiteral)
			assertThat(literal, equalTo(lit(1)))
		}
		{
			val literal = mapper.castTo(mapper.parse("1.0", [p|p.literal]), UniDoubleLiteral)
			assertThat(literal, equalTo(lit(1.0)))
		}
		{
			val literal = mapper.castTo(mapper.parse("true", [p|p.literal]), UniBoolLiteral)
			assertThat(literal, equalTo(lit(true)))
		}
		{
			val literal = mapper.castTo(mapper.parse("\"Hello\"", [p|p.literal]), UniStringLiteral)
			assertThat(literal, equalTo(lit("Hello")))
		}
	}

	@Test
	def void testCastToList() {
		val map = new HashMap<String, Object>
		val list = Lists.newArrayList
		map.put("add", list)
		map.put("none", Lists.newArrayList)
		val map2 = new HashMap<String, Object>
		list.add(map2)
		val list2 = Lists.newArrayList
		list2.add("public")
		map2.put("none", list2)
		val map3 = new HashMap<String, Object>
		list.add(map3)
		val list3 = Lists.newArrayList
		list3.add("static")
		map3.put("none", list3)
		val result = mapper.castToList(map, String)
		println(result)
	}

	@Test
	def void testIsAssignableFrom() {
		val clazz = UniClassDec
		val fields = clazz.fields
		val fieldsName = Lists.newArrayList
		fields.forEach[fieldsName.add(it.name)]
		val field = fields.get(fieldsName.indexOf("interfaces"))
		assertTrue(List.isAssignableFrom(field.type))
	}
}
