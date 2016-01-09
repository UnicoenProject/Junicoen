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
import net.unicoen.node.UniArray
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniStringLiteral
import net.unicoen.node.UniBinOp
import net.unicoen.node.UniIdent
import net.unicoen.node.UniNewArray
import net.unicoen.node.UniTernaryOp
import net.unicoen.node.UniNew

class MapperTest {

	protected def void evaluate(Object expected, Object actual) {
		if (expected == null) {
			if (actual != null) {
				assertThat(actual, instanceOf(typeof(List)))
				assertThat((actual as List<?>).size, is(0))
			} else {
				assertNull(actual)
			}
			return
		}
		switch (expected) {
			UniClassDec:
				expected.evaluateClass(actual)
			UniIntLiteral:
				expected.evaluateIntLiteral(actual)
			UniDoubleLiteral:
				expected.evaluateDoubleLiteral(actual)
			UniBoolLiteral:
				expected.evaluateBoolLiteral(actual)
			UniStringLiteral:
				expected.evaluateStringLiteral(actual)
			UniMethodDec:
				expected.evaluateMethodDec(actual)
			UniArg:
				expected.evaluateArg(actual)
			UniBlock:
				expected.evaluateBlock(actual)
			UniIf:
				expected.evaluateIf(actual)
			UniBinOp:
				expected.evaluateBinOp(actual)
			UniIdent:
				expected.evaluateIdent(actual)
			UniFieldDec:
				expected.evaluateFieldDec(actual)
			UniNewArray:
				expected.evaluateNewArray(actual)
			UniArray:
				expected.evaluateArray(actual)
			UniVariableDec:
				expected.evaluateVariableDec(actual)
			UniTernaryOp:
				expected.evaluateTernaryOp(actual)
			UniNew:
				expected.evaluateNew(actual)
			List<?>:
				expected.evaluateList(actual)
			String,
			Integer,
			Double,
			Boolean:
				assertThat(expected, equalTo(actual))
			default:
				throw new RuntimeException("Unsuspected type: " + expected.class.typeName)
		}
	}

	private def evaluateNew(UniNew expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniNew)))
		val newstat = actual as UniNew
		expected.args.evaluate(newstat.args)
		expected.type.evaluate(newstat.type)
	}

	private def evaluateTernaryOp(UniTernaryOp expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniTernaryOp)))
		val ternaryOp = actual as UniTernaryOp
		expected.cond.evaluate(ternaryOp.cond)
		expected.trueExpr.evaluate(ternaryOp.trueExpr)
		expected.falseExpr.evaluate(ternaryOp.falseExpr)
	}

	private def evaluateVariableDec(UniVariableDec expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniVariableDec)))
		val variableDec = actual as UniVariableDec
		expected.modifiers.evaluate(variableDec.modifiers)
		expected.name.evaluate(variableDec.name)
		expected.type.evaluate(variableDec.type)
		expected.value.evaluate(variableDec.value)
	}

	private def evaluateArray(UniArray expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniArray)))
		val array = actual as UniArray
		expected.items.evaluate(array.items)
	}

	private def evaluateNewArray(UniNewArray expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniNewArray)))
		val newarray = actual as UniNewArray
		expected.elementsNum.evaluate(newarray.elementsNum)
		expected.type.evaluate(newarray.type)
		expected.value.evaluate(newarray.value)
	}

	private def evaluateFieldDec(UniFieldDec expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniFieldDec)))
		val field = actual as UniFieldDec
		expected.modifiers.evaluate(field.modifiers)
		expected.name.evaluate(field.name)
		expected.type.evaluate(field.type)
		expected.value.evaluate(field.value)
	}

	private def evaluateIdent(UniIdent expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniIdent)))
		val ident = expected as UniIdent
		expected.name.evaluate(ident.name)
	}

	private def evaluateBinOp(UniBinOp expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniBinOp)))
		val binop = actual as UniBinOp
		expected.left.evaluate(binop.left)
		expected.operator.evaluate((binop.operator))
		expected.right.evaluate(binop.right)
	}

	private def evaluateIf(UniIf expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniIf)))
		val ifstat = actual as UniIf
		expected.cond.evaluate(ifstat.cond)
		expected.trueStatement.evaluate(ifstat.trueStatement)
		expected.falseStatement.evaluate(ifstat.falseStatement)
	}

	private def evaluateBlock(UniBlock expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniBlock)))
		val block = actual as UniBlock
		expected.blockLabel.evaluate(block.blockLabel)
		expected.body.evaluate(block.body)
	}

	private def evaluateArg(UniArg expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniArg)))
		val arg = actual as UniArg
		expected.name.evaluate(arg.name)
		expected.type.evaluate(arg.type)
	}

	private def evaluateMethodDec(UniMethodDec expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniMethodDec)))
		val method = actual as UniMethodDec
		expected.args.evaluate(method.args)
		expected.block.evaluate(method.block)
		expected.methodName.evaluate(method.methodName)
		expected.modifiers.evaluate(method.modifiers)
		expected.returnType.evaluate(method.returnType)
	}

	private def evaluateIntLiteral(UniIntLiteral expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniIntLiteral)))
		val literal = actual as UniIntLiteral
		expected.value.evaluate(literal.value)
	}

	private def evaluateDoubleLiteral(UniDoubleLiteral expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniDoubleLiteral)))
		val literal = actual as UniDoubleLiteral
		expected.value.evaluate(literal.value)
	}

	private def evaluateBoolLiteral(UniBoolLiteral expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniBoolLiteral)))
		val literal = actual as UniBoolLiteral
		expected.value.evaluate(literal.value)
	}

	private def evaluateStringLiteral(UniStringLiteral expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniStringLiteral)))
		val literal = actual as UniStringLiteral
		expected.value.evaluate(literal.value)
	}

	private def evaluateClass(UniClassDec expected, Object actual) {
		assertThat(actual, instanceOf(typeof(UniClassDec)))
		val node = actual as UniClassDec
		expected.className.evaluate(node.className)
		expected.innerClasses.evaluate(node.innerClasses)
		expected.interfaces.evaluate(node.interfaces)
		expected.members.evaluate(node.members)
		expected.modifiers.evaluate(node.modifiers)
		expected.superClass.evaluate(node.superClass)
	}

	private def evaluateList(List<?> expected, Object actual) {
		assertThat(actual, instanceOf(typeof(List)))
		val list = actual as List<?>
		assertThat(expected.size, equalTo(list.size))
		for (var i = 0; i < list.size; i++) {
			expected.get(i).evaluate(list.get(i))
		}
	}

	/**
	 * 引数に与えられたUniClassDecを評価する.
	 * @author J.Kobayashi
	 * @param node 評価対象のノード({@link UniClassDec}であることを期待する.)
	 * @param className 期待するクラス名.
	 * @param superClass 期待するスーパークラス名の配列(ない場合はnull.)
	 * @param superInterfaces 期待する実装インタフェース名の配列(ない場合はnull.)
	 * @deprecated Use {@link #evaluate(Object, Object)}
	 */
	@Deprecated
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
			if (cls.interfaces != null) {
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
	def evaluateMethodDec(Object node, String methodName, String returnType, List<String> modifiers, int blockSize,
		List<UniArg> args) {

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
		} else {
			assertEquals(cls.args.size, args.length)
			cls.args.forEach [ arg |
				assertThat(arg, instanceOf(UniArg))
			]
			args.forEach [ arg |
				assertTrue(cls.args.contains(arg))
			]
		}

		//Check the block object type and size
		if (cls.block == null) {
			assertEquals(0, blockSize)
		} else {
			assertThat(cls.block, instanceOf(UniBlock))
			if (cls.block.body != null) {
				assertThat(cls.block.body.size, equalTo(blockSize))
			}
		}
	}

	@Deprecated
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

	@Deprecated
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
	@Deprecated
	def evaluateIf(Object node, UniExpr cond, UniBlock trueBlock, UniBlock falseBlock) {
		assertThat(node, instanceOf(typeof(UniIf)))
		val cls = node as UniIf
		assertEquals(cls.cond, cond)
		assertEquals(cls.trueStatement, trueBlock)
		assertEquals(cls.falseStatement, falseBlock)
	}

	@Deprecated
	def evaluateWhile(Object node, UniExpr cond, UniBlock block) {
		assertThat(node, instanceOf(typeof(UniWhile)))
		val cls = node as UniWhile
		assertEquals(cls.cond, cond)
		assertEquals(cls.statement, block)
	}

	@Deprecated
	def evaluateDoWhile(Object node, UniExpr cond, UniBlock block) {
		assertThat(node, instanceOf(typeof(UniDoWhile)))
		val cls = node as UniDoWhile
		assertEquals(cls.cond, cond)
		assertEquals(cls.statement, block)
	}

	@Deprecated
	def evaluateFor(Object node, UniExpr init, UniExpr cond, UniExpr step, UniBlock block) {
		assertThat(node, instanceOf(typeof(UniFor)))
		val cls = node as UniFor
		assertEquals(cls.init, init)
		assertEquals(cls.cond, cond)
		assertEquals(cls.step, step)
		assertEquals(cls.statement, block)
	}

	@Deprecated
	def evaluateBreak(Object node) {
		assertThat(node, instanceOf(typeof(UniBreak)))
	}

	/////
	// evaluate Array
	/////
	@Deprecated
	def evaluateIntArray(Object node, UniArray arr) {
		assertThat(node, instanceOf(UniArray))
		val cls = node as UniArray
		assertEquals(cls.items.size, arr.items.size)
		val size = cls.items.size
		var i = 0
		while (i < size) {
			assertThat(cls.items.get(i), instanceOf(UniIntLiteral))
			assertThat((cls.items.get(i) as UniIntLiteral).value, equalTo((arr.items.get(i) as UniIntLiteral).value))
			i = i + 1
		}

	//		arr.items.forEach [ item |
	//			assertTrue(cls.items.contains(item))
	//		]
	}
}
