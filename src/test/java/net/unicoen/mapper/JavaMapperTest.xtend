package net.unicoen.mapper

import net.unicoen.generator.JavaGenerator
import net.unicoen.generator.JavaGeneratorTest
import net.unicoen.node.UniBlock
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniExpr
import net.unicoen.node.UniIf
import net.unicoen.node.UniMethodCall
import net.unicoen.node.UniMethodDec
import org.junit.Test

import static net.unicoen.node_helper.Builder.*
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class JavaMapperTest {
	@Test
	def parseClass() {
		val mapper = new JavaMapper()
		val classDec = mapper.parse("public class A {}") as UniClassDec
		assertThat(classDec.className, equalTo("A"))
	}

	@Test
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

	@Test
	def testReadWritePrintln() {
		val sb = new StringBuilder()
		sb.append("public class A {")
		sb.append("  public static void main () {")
		sb.append("    if (true) {")
		sb.append("      System.out.println(true);")
		sb.append("    }")
		sb.append("  }")
		sb.append(" }")
		val code = JavaGeneratorTest.normalize(sb.toString())

		val mapper = new JavaMapper()
		val classDec = mapper.parse(sb.toString()) as UniClassDec
		val generatedCode = JavaGenerator.generate(classDec);
		assertThat(normalize(generatedCode), equalTo(normalize(code)))
	}

	def normalize(String code) {
		val firstCode = code.replace("\r", " ").replace("\n", " ").replace("\t", " ").trim
		var lastCode = firstCode
		while (true) {
			var newCode = lastCode.replace("  ", " ")
			if (newCode.equals(lastCode)) {
				return lastCode
			}
			lastCode = newCode
		}
	}

	def asBlock(UniExpr expr) {
		expr as UniBlock
	}
}
