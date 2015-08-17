package net.unicoen.mapper

import net.unicoen.generator.JavaGenerator
import net.unicoen.generator.JavaScriptGenerator
import net.unicoen.node.UniBlock
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniExpr
import org.junit.Ignore
import org.junit.Test

import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class ConversionTest {
	val javaMapper = new JavaMapper()
	val javaScriptMapper = new JavaScriptMapper()

	@Test
	def void convertTurtleDemo() {
		val java = new StringBuilder()
		java.append("class Test {")
		java.append("  void start () {")
		java.append("    int i = 0;")
		java.append("    while (i < 4) {")
		java.append("      fd(100);")
		java.append("      rt(90);")
		java.append("      if (i == 1) {")
		java.append("        rt(30);")
		java.append("      }")
		java.append("      i = i + 1;")
		java.append("    }")
		java.append("  }")
		java.append("}")
		val js = new StringBuilder()
		js.append("function start() {")
		js.append("  var i = 0;")
		js.append("  while (i < 4) {")
		js.append("    fd(100);")
		js.append("    rt(90);")
		js.append("    if (i == 1) {")
		js.append("      rt(30);")
		js.append("    }")
		js.append("    i = i + 1;")
		js.append("  }")
		js.append("}")

		convert(java, js)
	}

	@Test @Ignore
	def void convertTurtleDemoWithTurtleObject() {
		val java = new StringBuilder()
		java.append("class Test {")
		java.append("  void start () {")
		java.append("    Turtle t = createTurtle();")
		java.append("    int i = 0;")
		java.append("    while (i < 4) {")
		java.append("      t.fd(100);")
		java.append("      t.rt(90);")
		java.append("      if (i == 1) {")
		java.append("        t.rt(30);")
		java.append("      }")
		java.append("      i = i + 1;")
		java.append("    }")
		java.append("  }")
		java.append("}")
		val js = new StringBuilder()
		js.append("function start() {")
		js.append("  var t = createTurtle();")
		js.append("  var i = 0;")
		js.append("  while (i < 4) {")
		js.append("    t.fd(100);")
		js.append("    t.rt(90);")
		js.append("    if (i == 1) {")
		js.append("      t.rt(30);")
		js.append("    }")
		js.append("    i = i + 1;")
		js.append("  }")
		js.append("}")
		convert(java, js)
	}

	def convert(StringBuilder java, StringBuilder javaScript) {
		val javaCode = java.toString
		val javaScriptCode = javaScript.toString
		val javaClassDec = javaMapper.parse(javaCode) as UniClassDec
		val javaScriptClassDec = javaScriptMapper.parse(javaScriptCode) as UniClassDec
		assertThat(MapperTestUtil.normalize(JavaGenerator.generate(javaClassDec)),
			equalTo(MapperTestUtil.normalize(javaCode)))
		assertThat(MapperTestUtil.normalize(JavaScriptGenerator.generate(javaClassDec)),
			equalTo(MapperTestUtil.normalize(javaScriptCode)))
		assertThat(MapperTestUtil.normalize(JavaGenerator.generate(javaScriptClassDec)),
			equalTo(MapperTestUtil.normalize(javaCode)))
		assertThat(MapperTestUtil.normalize(JavaScriptGenerator.generate(javaScriptClassDec)),
			equalTo(MapperTestUtil.normalize(javaScriptCode)))
	}

	def asBlock(UniExpr expr) {
		expr as UniBlock
	}
}
