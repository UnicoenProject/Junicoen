package net.unicoen.mapper

import org.junit.Test
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.node.UniClassDec
import org.junit.Ignore
import net.unicoen.node.UniFieldDec
import net.unicoen.node.UniArray
import net.unicoen.node.UniMethodDec
import net.unicoen.node.UniArg
import net.unicoen.node.UniIf
import net.unicoen.node.UniBlock
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniBinOp
import net.unicoen.node.UniIdent
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniVariableDec
import net.unicoen.node.UniUnaryOp
import com.google.common.collect.Lists

class Java8MapperClassFieldMethodTest extends MapperTest {
	val mapper = new Java8Mapper(true)

	@Test
	def void parseEmptyMethod() {
		val main = mapper.parse("public class Main{ public static void main(String[] args){}}")
		main.evaluateClass("Main", null, null)

		val String[] modifiers = #["public", "static"]
		val UniArg arg1 = new UniArg
		arg1.type = "String[]"
		arg1.name = "args"
		val UniArg[] args = #[arg1]
		(main as UniClassDec).members.get(0).evaluateMethodDec("main", "void", modifiers, 0, args)
	}

	@Test
	def void parseEmptyConstructor() {
		val main = mapper.parse("public class Main{ private Main(){} }")

		//Class
		main.evaluateClass("Main", null, null)

		//Method
		val String[] modifiers = #["private"]
		val UniArg[] args = #[]
		(main as UniClassDec).members.get(0).evaluateMethodDec("Main", null, modifiers, 0, args)
	}

	@Test
	def void parseMethodWithSingleLocalVar() {

		//Class
		val main = mapper.parse("public class Main{ public static void main(){int a;}}")
		main.evaluateClass("Main", null, null)

		//Method
		assertThat((main as UniClassDec).members.get(0), instanceOf(UniMethodDec))
		val method = (main as UniClassDec).members.get(0) as UniMethodDec
		val String[] modifiers = #["public", "static"]
		val UniArg[] args = #[]
		method.evaluateMethodDec("main", "void", modifiers, 1, args)

		//MethodBody
		val block = method.block as UniBlock
		val String[] modifiers2 = #[]
		evaluateVariableDec((block.body.get(0)), "int", "a", null, modifiers2)
	}

	@Test
	def void parseMethodWithMultipleLocalVar() {

		//Class
		val main = mapper.parse("public class Main{ public static void main(){int a,b,c;}}")
		main.evaluateClass("Main", null, null)

		//Method
		val method = (main as UniClassDec).members.get(0) as UniMethodDec
		val String[] modifiers = #["public", "static"]
		val UniArg[] args = #[]
		method.evaluateMethodDec("main", "void", modifiers, 3, args)

		//MethodBody
		val block = method.block as UniBlock
		val String[] modifiers2 = #[]
		evaluateVariableDec((block.body.get(0)), "int", "a", null, modifiers2)
		evaluateVariableDec((block.body.get(1)), "int", "b", null, modifiers2)
		evaluateVariableDec((block.body.get(2)), "int", "c", null, modifiers2)
	}

	@Test
	def void parseMethodWithSingleLocalVarWithValue() {

		//Class
		val main = mapper.parse("public class Main{ public static void main(){int a=1;}}")
		main.evaluateClass("Main", null, null)

		//Method
		val method = (main as UniClassDec).members.get(0) as UniMethodDec
		val String[] modifiers = #["public", "static"]
		val UniArg[] args = #[]
		method.evaluateMethodDec("main", "void", modifiers, 1, args)

		//MethodBody
		val block = method.block as UniBlock
		val String[] modifiers2 = #[]
		val UniIntLiteral literal = new UniIntLiteral
		literal.value = 1
		evaluateVariableDec((block.body.get(0)), "int", "a", literal, modifiers2)
	}

	@Test
	def void parseMethodWithMultipleLocalVarWithValue() {

		//Class
		val main = mapper.parse("public class Main{ public static void main(){int a,b,c=1}}")
		main.evaluateClass("Main", null, null)

		//Method
		val method = (main as UniClassDec).members.get(0) as UniMethodDec
		val String[] modifiers = #["public", "static"]
		val UniArg[] args = #[]
		method.evaluateMethodDec("main", "void", modifiers, 3, args)

		//MethodBody
		val block = method.block as UniBlock
		val String[] modifiers2 = #[]
		evaluateVariableDec((block.body.get(0)), "int", "a", null, modifiers2)
		evaluateVariableDec((block.body.get(1)), "int", "b", null, modifiers2)
		val UniIntLiteral literal = new UniIntLiteral
		literal.value = 1
		evaluateVariableDec((block.body.get(2)), "int", "c", literal, modifiers2)
	}

	@Test
	def void parseMethodWithIfStatement() {
		val expected = new UniClassDec
		expected.className = "Main"
		expected.members = Lists.newArrayList
		expected.modifiers = #["public"]
		expected.interfaces = #[]
		expected.superClass = #[]

		val method = new UniMethodDec
		expected.members += method
		method.args = Lists.newArrayList
		method.methodName = "main"
		method.modifiers = #["public", "static"]
		method.returnType = "void"

		val block = new UniBlock
		method.block = block
		block.body = Lists.newArrayList

		val ifstat = new UniIf
		block.body += ifstat
		ifstat.cond = new UniBoolLiteral(true)

		val trueStatement = new UniBlock
		ifstat.trueStatement = trueStatement
		trueStatement.body = Lists.newArrayList

		val binop = new UniBinOp
		trueStatement.body += binop
		binop.operator = "="
		binop.left = new UniIdent("a")
		binop.right = new UniIntLiteral(1)

		//Class
		val actual = mapper.parse("public class Main{ public static void main(){if(true){a=1;}}}")
		assertThat(actual, instanceOf(UniClassDec))
		val cls = actual as UniClassDec
		cls.evaluateClass("Main", null, null)

		//Method
		val oldmethod = cls.members.get(0) as UniMethodDec
		val String[] modifiers = #["public", "static"]
		val UniArg[] args = #[]
		oldmethod.evaluateMethodDec("main", "void", modifiers, 1, args)

		//MethodBody
		val oldblock = oldmethod.block as UniBlock

		//cond
		val UniBoolLiteral condliteral = new UniBoolLiteral
		condliteral.value = true

		//statement
		val UniIdent variable = new UniIdent
		variable.name = "a"

		val UniIntLiteral literal = new UniIntLiteral
		literal.value = 1
		val UniBinOp oldbinop = new UniBinOp
		oldbinop.left = variable
		oldbinop.right = literal
		oldbinop.operator = "="
		val UniBlock oldtrueStatement = new UniBlock
		val UniBinOp[] statements = #[oldbinop]
		oldtrueStatement.body = statements
		evaluateIf(oldblock.body.get(0), condliteral, oldtrueStatement, null)
		
		expected.evaluate(actual)
	}

	@Test
	@Ignore
	def void parseMethodWithIfElseStatement() {

		//Class
		val main = mapper.parse("public class Main{ public static void main(){if(true){a=1;}else{b=1;}}}")
		assertThat(main, instanceOf(UniClassDec))
		val cls = main as UniClassDec
		cls.evaluateClass("Main", null, null)

		//Method
		val method = cls.members.get(0) as UniMethodDec
		val String[] modifiers = #["public", "static"]
		val UniArg[] args = #[]
		method.evaluateMethodDec("main", "void", modifiers, 1, args)

		//MethodBody
		val block = method.block as UniBlock
		val UniIdent variable = new UniIdent
		variable.name = "a"
		val UniIntLiteral literal = new UniIntLiteral
		literal.value = 1
		val UniUnaryOp value = new UniUnaryOp
		value.expr = literal
		val UniBinOp binop = new UniBinOp
		binop.left = variable
		binop.right = value
		binop.operator = "="

		val UniIdent variable2 = new UniIdent
		variable2.name = "b"
		val UniIntLiteral literal2 = new UniIntLiteral
		literal2.value = 1
		val UniUnaryOp value2 = new UniUnaryOp
		value2.expr = literal2
		val UniBinOp binop2 = new UniBinOp
		binop2.left = variable2
		binop2.right = value2
		binop2.operator = "="

		val UniBoolLiteral condliteral = new UniBoolLiteral
		condliteral.value = true
		val UniUnaryOp cond = new UniUnaryOp
		cond.expr = condliteral
		val UniBlock trueStatement = new UniBlock
		val UniBinOp[] statements = #[binop]
		val UniBlock falseStatement = new UniBlock
		val UniBinOp[] statements2 = #[binop2]
		trueStatement.body = statements
		falseStatement.body = statements2
		evaluateIf(block.body.get(0), cond, trueStatement, falseStatement)
	}

	@Test
	def void parseMethodWithForStatement() {
	}

	@Test
	def void parseMethodWithForStatement2() {
	}

	@Test
	def void parseMethodWithWhileStatement() {
	}

	@Test
	def void parseMethodWthSwitchStatement() {
	}

	@Test
	def void parseMethodWithDoWhileStatement() {
	}

	@Test
	def void parseMethodWithBreakStatement() {
	}

	@Test
	def void parseMethodWithContinueStatement() {
	}

	@Test
	def void parseMethodWithReturnStatement() {
	}

	@Test
	def void parseMethodWithThrowStatement() {
	}

	@Test
	def void parseMethodWithTryStatement() {
	}

	@Test
	def void parseMethodWithStdlb() {
	}

}
