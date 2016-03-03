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

class Java8MapperTest extends MapperTest {
	val mapper = new Java8Mapper(true)

	@Test
	def void parseClass() {
		val actual = mapper.parse("public class A {}")

		val expected = new UniClassDec
		expected.className = "A"
		expected.interfaces = #[]
		expected.members = #[]
		expected.modifiers = #["public"]
		expected.superClass = #[]

		expected.evaluate(actual)

		println(JavaGenerator.generate(actual as UniClassDec))

		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))
	}

	@Test @Ignore
	def void parseClassWithComment() {
		val actual = mapper.parse("/*AA*/ public class A {} //BB")

		val expected = new UniClassDec
		expected.className = "A"
		expected.interfaces = #[]
		expected.members = #[]
		expected.modifiers = #["public"]
		expected.superClass = #[]
		expected.comments = #["/*AA*/", "//BB"]

		expected.evaluate(actual)

		println(JavaGenerator.generate(actual as UniClassDec))

		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))
	}

	@Test @Ignore
	def void parseMethodWithComment() {
		val actual = mapper.parse("public class A { /*AA*/ void m() {} //HH\n }")
		
		val block = new UniBlock
		block.comments = #["//HH"]

		val method = new UniMethodDec
		method.methodName = "m"
		method.returnType = "void"
		method.block = block
		method.comments = #["/*AA*/"]

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[method as UniMemberDec]
		expected.modifiers = #["public"]
		expected.evaluate(actual)

		println(actual)
		println(JavaGenerator.generate(actual as UniClassDec))

		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))
	}

	@Test @Ignore
	def void parseComplexComments() {
		val actual = mapper.parse("/*AA*/ public class A {
	/*BB*/
	int a;
	void m(/*CC*/) {
		/*DD*/ b(); //EE
		{ //FF
			/*11*/ c(); /*22*/
		} //GG
	}
} //HH")

		val fieldDec = new UniFieldDec
		fieldDec.type = "int";
		fieldDec.name = "a";
		fieldDec.comments = #["/*BB*/"]

		val methodCall2 = new UniMethodCall
		methodCall2.methodName = "c"
		methodCall2.comments = #["/*11*/", "/*22*/"]

		val block2 = new UniBlock
		block2.body = #[methodCall2 as UniExpr]
		block2.comments = #["//FF", "//GG"]

		val methodCall1 = new UniMethodCall
		methodCall1.methodName = "b"
		methodCall1.comments = #["/*DD*/", "//EE"]

		val block1 = new UniBlock
		block1.body = #[methodCall1 as UniExpr, block2 as UniExpr]

		val method = new UniMethodDec
		method.methodName = "m"
		method.returnType = "void"
		method.block = block1
		method.comments = #["/*CC*/"]

		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[fieldDec as UniMemberDec, method as UniMemberDec]
		expected.modifiers = #["public"]
		expected.comments = #["/*AA*/", "//HH"]
		expected.evaluate(actual)

		println(actual)
		println(JavaGenerator.generate(actual as UniClassDec))

		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))
	}

	@Test
	def void parseClassWithExtendsAndImplements() {
		val expected = new UniClassDec
		expected.className = "A"
		expected.interfaces = #["Interface", "Interface1"]
		expected.members = #[]
		expected.modifiers = #["public", "static"]
		expected.superClass = #["SuperClass"]

		val actual = mapper.parse("public static class A extends SuperClass implements Interface,Interface1 {}")

		expected.evaluate(actual)

		println(JavaGenerator.generate(actual as UniClassDec))

		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))
	}

	@Test
	def void parseInterface() {

		// Empty InterfaceDeclaration
		val expected = new UniClassDec
		expected.className = "A"
		expected.members = #[]
		expected.modifiers = #["public"]
		expected.superClass = #["SuperInterface1"]

		val actual = mapper.parse("public interface A extends SuperInterface1 {}")

		expected.evaluate(actual)

		println(JavaGenerator.generate(actual as UniClassDec))

		evaluate(expected, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}

	@Test
	def void parseLiteral() {
		{
			val literal = mapper.castTo(mapper.parse("1", [p|p.literal]), UniIntLiteral)
			lit(1).evaluate(literal)
		}
		{
			val literal = mapper.castTo(mapper.parse("1.0", [p|p.literal]), UniDoubleLiteral)
			lit(1.0).evaluate(literal)
		}
		{
			val literal = mapper.castTo(mapper.parse("true", [p|p.literal]), UniBoolLiteral)
			lit(true).evaluate(literal)
		}
		{
			val literal = mapper.castTo(mapper.parse("\"Hello\"", [p|p.literal]), UniStringLiteral)
			lit("Hello").evaluate(literal)
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

}
