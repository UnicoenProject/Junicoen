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
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniStringLiteral
import net.unicoen.node.UniArray

class MapperTest {

	/**
	 * 引数に与えられたUniClassDecを評価する.
	 * @author J.Kobayashi
	 * @param node 評価対象のノード({@link UniClassDec}であることを期待する.)
	 * @param className 期待するクラス名.
	 * @param superClass 期待するスーパークラス名(ない場合はnull.)
	 * @param superInterfaces 期待する実装インタフェース名の配列(ない場合はnull.)
	 */
	def evaluateClass(Object node, String className, String superClass, List<String> superInterfaces, int size) {
		assertThat(node, instanceOf(typeof(UniClassDec)))
		val cls = node as UniClassDec
		assertNotNull("Class name cannot be null",className)
		assertEquals(cls.className, className)
		assertEquals(cls.superClass, superClass)
		if(cls.interfaces == null){
			assertNull(superInterfaces)
			return
		}
		assertEquals(cls.interfaces.size, superInterfaces.size)
		superInterfaces.forEach[
			assertTrue(cls.interfaces.contains(it))
		]
		assertEquals(cls.members.size,size)
	}

	// add evaluate method/array/ etc.
	def evaluateMethodDec(Object node, String methodName, String returnType, List<String> modifiers, int blockSize, List<UniArg> args) {
		//Check the header from node type, name, return type to modifiers
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
		//Check the arguments from argument size, object type, type and names
		if (cls.args == null) {
			assertEquals(0, args.length)
		}else{
			assertEquals(cls.args.size, args.length)
			cls.args.forEach [ arg |
				assertThat(arg, instanceOf(UniArg))
			]
			args.forEach [ arg |
				assertTrue(cls.args.contains(arg))
			]
		}
		//Check the block object type and size
		if(cls.block == null){
			assertEquals(0, blockSize)
		}else{
			assertThat(cls.block, instanceOf(UniBlock))
			assertThat(cls.block.body.size, equalTo(blockSize))
		}
	}

	def evaluateFieldDec(Object node, String type, String name, UniExpr value, String... modifiers) {
		//For Primitive/ Reference field declarations
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
		//check object node
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
	/////
	// evaluate Array
	/////
	def evaluateArray(Object node, UniArray arr){
		assertThat(node, instanceOf(UniArray))
		val cls = node as UniArray
		assertEquals(cls.items.size, arr.items.size)
		arr.items.forEach [ item |
			assertTrue(cls.items.contains(item))
		]
		
	}
}
