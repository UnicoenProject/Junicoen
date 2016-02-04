package net.unicoen.mapper

import net.unicoen.node.UniArg
import net.unicoen.node.UniBinOp
import net.unicoen.node.UniBlock
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniExpr
import net.unicoen.node.UniIdent
import net.unicoen.node.UniIf
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniMethodDec
import net.unicoen.node.UniVariableDec
import org.junit.Test

class Java8MapperClassFieldMethodTest extends MapperTest {
	val mapper = new Java8Mapper(true)

	@Test
	def void parseEmptyMethod() {
		val actual = mapper.parse("public class Main{ public static void main(String[] args){}}")

		val arg = new UniArg
		arg.name = "args"
		arg.type = "String[]"

		val method = new UniMethodDec
		method.args = #[arg]
		method.block = new UniBlock
		method.methodName = "main"
		method.modifiers = #["public", "static"]
		method.returnType = "void"

		val expected = new UniClassDec
		expected.className = "Main"
		expected.members = #[method as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
	}

	@Test
	def void parseEmptyConstructor() {
		val actual = mapper.parse("public class Main{ private Main(){} }")

		val constructor = new UniMethodDec
		constructor.methodName = "Main"
		constructor.block = new UniBlock
		constructor.modifiers = #["private"]

		val expected = new UniClassDec
		expected.className = "Main"
		expected.members = #[constructor as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
	}

	@Test
	def void parseMethodWithSingleLocalVar() {

		//Class
		val actual = mapper.parse("public class Main{ public static void main(){int a;}}")

		val variableDec = new UniVariableDec
		variableDec.name = "a"
		variableDec.type = "int"

		val block = new UniBlock
		block.body = #[variableDec as UniExpr]

		val method = new UniMethodDec
		method.block = block
		method.methodName = "main"
		method.modifiers = #["public", "static"]
		method.returnType = "void"

		val expected = new UniClassDec
		expected.className = "Main"
		expected.members = #[method as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
	}

	@Test
	def void parseMethodWithMultipleLocalVar() {
		val actual = mapper.parse("public class Main{ public static void main(){int a,b,c;}}")

		val variableA = new UniVariableDec
		variableA.name = "a"
		variableA.type = "int"

		val variableB = new UniVariableDec
		variableB.name = "b"
		variableB.type = "int"

		val variableC = new UniVariableDec
		variableC.name = "c"
		variableC.type = "int"

		val block = new UniBlock
		block.body = #[variableA as UniExpr, variableB as UniExpr, variableC as UniExpr]

		val method = new UniMethodDec
		method.block = block
		method.methodName = "main"
		method.modifiers = #["public", "static"]
		method.returnType = "void"

		val expected = new UniClassDec
		expected.className = "Main"
		expected.members = #[method as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
	}

	@Test
	def void parseMethodWithSingleLocalVarWithValue() {
		val actual = mapper.parse("public class Main{ public static void main(){int a=1;}}")

		val variableDec = new UniVariableDec
		variableDec.name = "a"
		variableDec.type = "int"
		variableDec.value = new UniIntLiteral(1)

		val block = new UniBlock
		block.body = #[variableDec as UniExpr]

		val method = new UniMethodDec
		method.block = block
		method.methodName = "main"
		method.modifiers = #["public", "static"]
		method.returnType = "void"

		val expected = new UniClassDec
		expected.className = "Main"
		expected.members = #[method as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
	}

	@Test
	def void parseMethodWithMultipleLocalVarWithValue() {
		val actual = mapper.parse("public class Main{ public static void main(){int a,b,c=1}}")

		val variableA = new UniVariableDec
		variableA.name = "a"
		variableA.type = "int"

		val variableB = new UniVariableDec
		variableB.name = "b"
		variableB.type = "int"

		val variableC = new UniVariableDec
		variableC.name = "c"
		variableC.type = "int"
		variableC.value = new UniIntLiteral(1)

		val block = new UniBlock
		block.body = #[variableA as UniExpr, variableB as UniExpr, variableC as UniExpr]

		val method = new UniMethodDec
		method.block = block
		method.modifiers = #["public", "static"]
		method.methodName = "main"
		method.returnType = "void"

		val expected = new UniClassDec
		expected.className = "Main"
		expected.members = #[method as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
	}

	@Test
	def void parseMethodWithIfStatement() {
		val actual = mapper.parse("public class Main{ public static void main(){if(true){a=1;}}}")

		val binop = new UniBinOp
		binop.operator = "="
		binop.left = new UniIdent("a")
		binop.right = new UniIntLiteral(1)

		val trueStatement = new UniBlock
		trueStatement.body = #[binop as UniExpr]

		val ifstat = new UniIf
		ifstat.cond = new UniBoolLiteral(true)
		ifstat.trueStatement = trueStatement

		val block = new UniBlock
		block.body = #[ifstat as UniExpr]

		val method = new UniMethodDec
		method.block = block
		method.methodName = "main"
		method.modifiers = #["public", "static"]
		method.returnType = "void"

		val expected = new UniClassDec
		expected.className = "Main"
		expected.members = #[method as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
	}

	@Test
	def void parseMethodWithIfElseStatement() {
		val actual = mapper.parse("public class Main{ public static void main(){if(true){a=1;}else{b=1;}}}")

		val binop0 = new UniBinOp
		binop0.operator = "="
		binop0.left = new UniIdent("a")
		binop0.right = new UniIntLiteral(1)

		val binop1 = new UniBinOp
		binop1.operator = "="
		binop1.left = new UniIdent("b")
		binop1.right = new UniIntLiteral(1)

		val falseStatement = new UniBlock
		falseStatement.body = #[binop1 as UniExpr]
		val trueStatement = new UniBlock
		trueStatement.body = #[binop0 as UniExpr]

		val ifstat = new UniIf
		ifstat.cond = new UniBoolLiteral(true)
		ifstat.trueStatement = trueStatement
		ifstat.falseStatement = falseStatement

		val block = new UniBlock
		block.body = #[ifstat as UniExpr]

		val method = new UniMethodDec
		method.block = block
		method.methodName = "main"
		method.modifiers = #["public", "static"]
		method.returnType = "void"

		val expected = new UniClassDec
		expected.className = "Main"
		expected.members = #[method as UniMemberDec]
		expected.modifiers = #["public"]

		expected.evaluate(actual)
	}

	@Test
	def void parseMethodWithForStatement(){
		val actual = mapper.parse("public class Main{ public static void main(){for(int i=0;i<5;i++)j++;}}")
		
	}

	@Test
	def void parseMethodWithForStatement2(){
/* 		val main = mapper.parse("public class Main{ public static void main(){for(i=0;i<5;i++)j++;}}")
		assertThat(main, instanceOf(UniClassDec))
		val cls = main as UniClassDec
		cls.evaluateClass("Main", null, null,1)
		//Method
		val method = cls.members.get(0) as UniMethodDec
		val String[] modifiers = #["public","static"]
		val UniArg[] args = #[]
		method.evaluateMethodDec("main","void",modifiers,1,args)
		//MethodBody
		val block = method.block as UniBlock
		//init->Binop
		val UniIdent variable = new UniIdent
		variable.name = "i"
		
		val UniIntLiteral literal = new UniIntLiteral
		literal.value = 0
		val UniUnaryOp value = new UniUnaryOp
		value.expr = literal
		val UniBinOp init = new UniBinOp
		init.left = variable
		init.right = value
		init.operator = "="
		//expression->Binop
		val UniIdent invariable2 = new UniIdent
		invariable2.name = "i"
		val UniUnaryOp variable2 = new UniUnaryOp
		variable2.expr = invariable2
		
		val UniIntLiteral literal2 = new UniIntLiteral
		literal2.value = 5
		val UniUnaryOp value2 = new UniUnaryOp
		value2.expr = literal2
		val UniBinOp cond = new UniBinOp
		cond.left = variable2
		cond.right = value2
		cond.operator = "<"
		//Update->UnaryOp
		val UniIdent variable3 = new UniIdent
		variable3.name = "i"
		val UniUnaryOp step = new UniUnaryOp
		step.expr = variable3
		step.operator = "++"
		//j++->UnaryOp
		val UniBlock body = new UniBlock
		val UniUnaryOp inbody = new UniUnaryOp
		val UniIdent variable4 = new UniIdent
		variable4.name = "j"
		inbody.expr = variable4
		inbody.operator = "++"
		val UniUnaryOp[] statements = #[inbody]
		body.body = statements
		evaluateFor(block.body.get(0),init,cond,step,body)
		*/
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
