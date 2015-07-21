package net.unicoen.mapper

import net.unicoen.node.UniClassDec
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*;

class MapperTest {

	/**
	 * 引数に与えられたUniClassDecを評価する.
	 * @author J.Kobayashi
	 * @param node 評価対象のノード({@link UniClassDec}であることを期待する.)
	 * @param className 期待するクラス名.
	 * @param modifiers 期待する修飾子.
	 */
	def evaluateClass(Object node, String className, String... modifiers) {
		assertThat(node, instanceOf(typeof(UniClassDec)))
		val cls = node as UniClassDec
		assertEquals(cls.className, className)
		if (cls.modifiers == null) {
			assertEquals(0, modifiers.length)
			return
		}
		assertEquals(cls.modifiers.size, modifiers.length)
		modifiers.forEach [ modifier |
			assertTrue(cls.modifiers.contains(modifier))
		]
	}
	//add evaluate method/array/ etc.

}
