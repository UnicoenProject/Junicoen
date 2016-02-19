package net.unicoen.mapper

import net.unicoen.generator.JavaScriptGenerator


import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.node.UniProgram
import org.junit.Ignore
import org.junit.Test

class JavaScriptMapperTest {
	val mapper = new JavaScriptMapper()

	@Test
	def void regenerateEmptyFunction() {
		val sb = new StringBuilder()
		sb.append("function f() {}")
		regenerate(sb)
	}

	@Test
	def void regenerateDemoFunction() {
		val sb = new StringBuilder()
		sb.append("function f() {")
		sb.append("  var i = 0;")
		sb.append("  while (i < 4) {")
		sb.append("    fd(100);")
		sb.append("    rt(90);")
		sb.append("    if (i == 1) {")
		sb.append("      rt(30);")
		sb.append("    }")
		sb.append("    i = i + 1;")
		sb.append("  }")
		sb.append("}")
		regenerate(sb)
	}

	@Test
	def void regenerateDemoFunctionWithTurtleObject() {
		val sb = new StringBuilder()
		sb.append("function f() {")
		sb.append("  var t = createTurtle();")
		sb.append("  var i = 0;")
		sb.append("  while (i < 4) {")
		sb.append("    t.fd(100);")
		sb.append("    t.rt(90);")
		sb.append("    if (i == 1) {")
		sb.append("      t.rt(30);")
		sb.append("    }")
		sb.append("    i = i + 1;")
		sb.append("  }")
		sb.append("}")
		regenerate(sb)
	}

	def regenerate(StringBuilder sb) {
		val code = sb.toString()
		val classDec = mapper.parse(code) as UniProgram
		val generatedCode = JavaScriptGenerator.generate(classDec);
		assertThat(MapperTestUtil.normalize(generatedCode), equalTo(MapperTestUtil.normalize(code)))
		assertThat(MapperTestUtil.normalize(JavaScriptGenerator.generate(mapper.parse(generatedCode) as UniProgram)),
			equalTo(MapperTestUtil.normalize(code)))
	}
}
