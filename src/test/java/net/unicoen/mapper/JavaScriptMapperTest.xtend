package net.unicoen.mapper

import net.unicoen.generator.JavaScriptGenerator
import net.unicoen.node.UniClassDec
import org.junit.Test

import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class JavaScriptMapperTest {
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
		val code = normalize(sb.toString())
		val mapper = new JavaScriptMapper()
		val classDec = mapper.parse(sb.toString()) as UniClassDec
		val generatedCode = JavaScriptGenerator.generate(classDec);
		assertThat(normalize(generatedCode), equalTo(normalize(code)))
	}

	def normalize(String code) {
		val firstCode = code.replace("\r", " ").replace("\n", " ").replace("\t", " ").trim
		var lastCode = firstCode
		while (true) {
			var newCode = lastCode.replace("  ", " ")
			if (newCode.equals(lastCode)) {
				return lastCode.replace(" (", "(").replace(" {", "{").replace(" }", "}")
			}
			lastCode = newCode
		}
	}
}
