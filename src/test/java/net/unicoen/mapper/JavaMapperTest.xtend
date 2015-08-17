package net.unicoen.mapper

import net.unicoen.generator.JavaGenerator
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
	val mapper = new JavaMapper()

	@Test
	def void parseClass() {
		val classDec = mapper.parse("public class A {}") as UniClassDec
		assertThat(classDec.className, equalTo("A"))
	}

	@Test
	def void parseMainMethod() {
		val sb = new StringBuilder()

		sb.append("class A {")
		sb.append("  public static void main(String[] args) {")
		sb.append("  }")
		sb.append("}");

		val classDec = mapper.parse(sb.toString()) as UniClassDec
		val mainMethodDec = classDec.members.get(0) as UniMethodDec
		assertThat(mainMethodDec.methodName, equalTo("main"))
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

	@Test
	def void parseFuncCall() {
		val literal = mapper.parse("f()", [p|p.methodInvocation])
		assertThat(literal, equalTo(new UniMethodCall(null, "f", list())))
	}

	@Test
	def void parseIfStatement() {
		val literal = mapper.parse("if(false) { f(); }", [p|p.ifThenStatement])

		val body = block(new UniMethodCall(null, "f", list()))
		val ifStmt = new UniIf(lit(false), body, null)

		assertThat(literal, equalTo(ifStmt))
	}

	@Test
	def void regeneratePrintln() {
		val sb = new StringBuilder()
		sb.append("public class A {")
		sb.append("  public static void main () {")
		sb.append("    if (true) {")
		sb.append("      System.out.println(true);")
		sb.append("    }")
		sb.append("  }")
		sb.append("}")
		regenerate(sb)
	}

	@Test
	def void regenerateNew() {
		val sb = new StringBuilder()
		sb.append("public class A {")
		sb.append("  public static void main () {")
		sb.append("    Turtle t = new Turtle();")
		sb.append("  }")
		sb.append("}")
		regenerate(sb)
	}

	@Test
	def void regenerateTurtleDemo() {
		val sb = new StringBuilder()
		sb.append("public class A {")
		sb.append("  public static void main () {")
		sb.append("    int i = 0;")
		sb.append("    while (i < 4) {")
		sb.append("      fd(100);")
		sb.append("      rt(90);")
		sb.append("      if (i == 1) {")
		sb.append("        rt(30);")
		sb.append("      }")
		sb.append("      i = i + 1;")
		sb.append("    }")
		sb.append("  }")
		sb.append("}")
		regenerate(sb)
	}

	@Test
	def void regenerateTurtleDemoWithTurtleObject() {
		val sb = new StringBuilder()
		sb.append("public class A {")
		sb.append("  public static void main () {")
		sb.append("    Turtle t = createTurtle();")
		sb.append("    int i = 0;")
		sb.append("    while (i < 4) {")
		sb.append("      t.fd(100);")
		sb.append("      t.rt(90);")
		sb.append("      if (i == 1) {")
		sb.append("        t.rt(30);")
		sb.append("      }")
		sb.append("      i = i + 1;")
		sb.append("    }")
		sb.append("  }")
		sb.append("}")
		regenerate(sb)
	}

	def regenerate(StringBuilder sb) {
		val code = sb.toString()
		val classDec = mapper.parse(code) as UniClassDec
		val generatedCode = JavaGenerator.generate(classDec);
		assertThat(MapperTestUtil.normalize(generatedCode), equalTo(MapperTestUtil.normalize(code)))
		assertThat(MapperTestUtil.normalize(JavaGenerator.generate(mapper.parse(generatedCode) as UniClassDec)),
			equalTo(MapperTestUtil.normalize(code)))
	}

	def asBlock(UniExpr expr) {
		expr as UniBlock
	}
}
