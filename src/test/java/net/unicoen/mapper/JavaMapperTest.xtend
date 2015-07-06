package net.unicoen.mapper

import net.unicoen.node.*

import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import org.junit.Test
import static net.unicoen.node_helper.Builder.*
import net.unicoen.generator.JavaGeneratorTest
import net.unicoen.generator.JavaGenerator

class JavaMapperTest {
	@Test
	def parseClass() {
		val mapper = new JavaMapper()
		val classDec = mapper.parse("public class A {}") as UniClassDec
		assertThat(classDec.className, equalTo("A"))
	}

	//@Test
	def parseMainMethod() {
		val mapper = new JavaMapper()
		val sb = new StringBuilder()

		sb.append("class A {")
		sb.append("    public static void main(String[] args) {")
		sb.append("    }")
		sb.append("}");

		val classDec = mapper.parse(sb.toString()) as UniClassDec
		val mainMethodDec = classDec.members.get(0) as UniMethodDec
		assertThat(mainMethodDec.methodName, equalTo("main"))
	}

	@Test
	def parseLiteral() {
		val mapper = new JavaMapper();
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

	@Test
	def parseFuncCall() {
		val mapper = new JavaMapper();
		val literal = mapper.parse("f()", [p|p.methodInvocation])
		assertThat(literal, equalTo(new UniMethodCall(null, "f", list())))
	}

	@Test
	def parseIfStatement() {
		val mapper = new JavaMapper();
		val literal = mapper.parse("if(false) { f(); }", [p|p.ifThenStatement])

		val body = block(new UniMethodCall(null, "f", list()))
		val ifStmt = new UniIf(lit(false), body, null)

		assertThat(literal, equalTo(ifStmt))
	}

	//@Test
	def parseMainIf() {
		val mapper = new JavaMapper()
		val sb = new StringBuilder()

		sb.append("class A {")
		sb.append("  public static void main(String[] args) {")
		sb.append("    if (true) {")
		sb.append("      System.out.println(true)")
		sb.append("    }")
		sb.append("  }")
		sb.append("}");

		val classDec = mapper.parse(sb.toString()) as UniClassDec
		val mainMethodDec = classDec.members.get(0) as UniMethodDec
		val ifExpr = mainMethodDec.block.body.get(0) as UniIf

		assertThat(ifExpr.cond, equalTo(lit(true)))
		val thenLine = ifExpr.trueStatement.asBlock.body.get(0) as UniMethodCall
		val expect = new UniMethodCall(
			field(ident("System"), "out"),
			"println",
			list(lit(true))
		)
		assertThat(thenLine, equalTo(expect))
	}

	//@Test
	def testReadWriteHelloWorld() {
		val sb = new StringBuilder()
		sb.append("public class A {")
		sb.append("  public static void main(String[] args) {")
		sb.append("    if (true) {")
		sb.append("      System.out.println(\"Hello, world\")")
		sb.append("    }")
		sb.append("  }")
		sb.append("}")
		val code = JavaGeneratorTest.normalize(sb.toString())

		val mapper = new JavaMapper()
		val classDec = mapper.parse(sb.toString()) as UniClassDec
		val generatedCode = JavaGenerator.generate(classDec);
		assertThat(generatedCode, equalTo(code))
	}
	
	def asBlock(UniExpr expr) {
		expr as UniBlock
	}
}
