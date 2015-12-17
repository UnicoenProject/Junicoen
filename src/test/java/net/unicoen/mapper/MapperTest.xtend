package net.unicoen.mapper

import java.util.List
import net.unicoen.node.UniArg
import net.unicoen.node.UniBlock
import net.unicoen.node.UniBreak
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniDoWhile
import net.unicoen.node.UniExpr
import net.unicoen.node.UniFieldDec
import net.unicoen.node.UniFor
import net.unicoen.node.UniIf
import net.unicoen.node.UniMethodDec
import net.unicoen.node.UniVariableDec
import net.unicoen.node.UniWhile

import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class MapperTest {

	/**
	 * 引数に与えられたUniClassDecを評価する.
	 * @author J.Kobayashi
	 * @param node 評価対象のノード({@link UniClassDec}であることを期待する.)
	 * @param className 期待するクラス名.
	 * @param superClass 期待するスーパークラス名の配列(ない場合はnull.)
	 * @param superInterfaces 期待する実装インタフェース名の配列(ない場合はnull.)
	 */
	def evaluateClass(Object node, String className, List<String> superClasses, List<String> superInterfaces) {
		assertThat(node, instanceOf(typeof(UniClassDec)))
		val cls = node as UniClassDec
		assertNotNull("Class name cannot be null", className)
		assertEquals(cls.className, className)
		if (superClasses == null) {
			if (cls.superClass != null) {
				assertThat(cls.superClass.size, is(0))
			} else {
				assertThat(cls.superClass, is(nullValue))
			}
		} else {
			assertEquals(cls.superClass.size, superClasses.size)
			superClasses.forEach [
				assertTrue(cls.superClass.contains(it))
			]
		}
		if (superInterfaces == null) {
			if(cls.interfaces != null){
			assertThat(cls.interfaces.size, is(0))
			} else {
				assertThat(cls.interfaces, is(nullValue))
			}
		} else {
			assertEquals(cls.interfaces.size, superInterfaces.size)
			superInterfaces.forEach [
				assertTrue(cls.interfaces.contains(it))
			]
		}
	}

	// add evaluate method/array/ etc.
	def evaluateMethodDec(Object node, String methodName, String returnType, List<String> modifiers, UniBlock block,
		UniArg... args) {
		assertThat(node, instanceOf(typeof(UniMethodDec)))
		val cls = node as UniMethodDec
		assertEquals(cls.methodName, methodName)
		assertEquals(cls.returnType, returnType)
		if (cls.modifiers == null) {
			assertEquals(0, modifiers.length)
			return
		}
		assertEquals(cls.modifiers.size, modifiers.length)
		modifiers.forEach [ modifier |
			assertTrue(cls.modifiers.contains(modifier))
		]

		if (cls.args == null) {
			assertEquals(0, args.length)
			return
		}
		assertEquals(cls.args.size, args.length)
		args.forEach [ arg |
			assertTrue(cls.args.contains(args))
		]
		assertEquals(cls.block, block)

	}

	def evaluateFieldDec(Object node, String type, String name, UniExpr value, String... modifiers) {
		assertThat(node, instanceOf(typeof(UniFieldDec)))
		val cls = node as UniFieldDec
		assertEquals(cls.type, type)
		assertEquals(cls.name, name)
		if (cls.modifiers == null) {
			assertEquals(0, modifiers.length)
			return
		}
		assertEquals(cls.modifiers.size, modifiers.length)
		modifiers.forEach [ modifier |
			assertTrue(cls.modifiers.contains(modifier))
		]
		assertEquals(cls.value, value)
	}

	def evaluateVariableDec(Object node, String type, String name, UniExpr value, String... modifiers) {
		assertThat(node, instanceOf(typeof(UniVariableDec)))
		val cls = node as UniVariableDec
		assertEquals(cls.type, type)
		assertEquals(cls.name, name)
		if (cls.modifiers == null) {
			assertEquals(0, modifiers.length)
			return
		}
		assertEquals(cls.modifiers.size, modifiers.length)
		modifiers.forEach [ modifier |
			assertTrue(cls.modifiers.contains(modifier))
		]
		assertEquals(cls.value, value)
	}

	// ///
	// statements
	// ///
	def evaluateIf(Object node, UniExpr cond, UniBlock trueBlock, UniBlock falseBlock) {
		assertThat(node, instanceOf(typeof(UniIf)))
		val cls = node as UniIf
		assertEquals(cls.cond, cond)
		assertEquals(cls.trueStatement, trueBlock)
		assertEquals(cls.falseStatement, falseBlock)
	}

	def evaluateWhile(Object node, UniExpr cond, UniBlock block) {
		assertThat(node, instanceOf(typeof(UniWhile)))
		val cls = node as UniWhile
		assertEquals(cls.cond, cond)
		assertEquals(cls.statement, block)
	}

	def evaluateDoWhile(Object node, UniExpr cond, UniBlock block) {
		assertThat(node, instanceOf(typeof(UniDoWhile)))
		val cls = node as UniDoWhile
		assertEquals(cls.cond, cond)
		assertEquals(cls.statement, block)
	}

	def evaluateFor(Object node, UniExpr init, UniExpr cond, UniExpr step, UniBlock block) {
		assertThat(node, instanceOf(typeof(UniFor)))
		val cls = node as UniFor
		assertEquals(cls.init, init)
		assertEquals(cls.cond, cond)
		assertEquals(cls.step, step)
		assertEquals(cls.statement, block)
	}

	def evaluateBreak(Object node) {
		assertThat(node, instanceOf(typeof(UniBreak)))
	}

}
