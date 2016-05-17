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
import net.unicoen.node.UniUnaryOp
import net.unicoen.node.UniStringLiteral
import net.unicoen.node.UniFor
import net.unicoen.node.UniContinue
import net.unicoen.node.UniBreak
import net.unicoen.node.UniWhile
import net.unicoen.node.UniReturn
import net.unicoen.node.UniDoWhile
import net.unicoen.node.UniFieldAccess

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
		val actual = mapper.parse("public class Main{ public static void main(){for(int i=0;i<5;i++){j++;}}}")
		
		val content = new UniUnaryOp
		content.expr = new UniIdent("j")
		content.operator = "++"
		
		val statement = new UniBlock
		statement.body = #[content as UniExpr]
		
		val init = new UniVariableDec
		init.type = "int"
		init.name = "i"
		init.value = new UniIntLiteral(0)
		
		val cond = new UniBinOp
		cond.left = new UniIdent("i")
		cond.right = new UniIntLiteral(5)
		cond.operator = "<"
		
		val step = new UniUnaryOp
		step.expr = new UniIdent("i")
		step.operator = "++"
		
		val forloop = new UniFor
		forloop.init = init
		forloop.cond = cond
		forloop.step = step
		forloop.statement = statement
		
		val block = new UniBlock
		block.body = #[forloop as UniExpr]

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
	def void parseMethodWithForStatement2(){
		val actual = mapper.parse("public class Main{ public static void main(){for(int i=0;i<5;i++){if(a==1) continue;}}}")
		val continue = new UniContinue
		
		val ifcond = new UniBinOp
		ifcond.left = new UniIdent("a")
		ifcond.right = new UniIntLiteral(1)
		ifcond.operator = "=="
		
		val ifstat = new UniIf
		ifstat.cond = ifcond
		ifstat.trueStatement = continue
		ifstat.falseStatement = null
		
		val forinit = new UniVariableDec
		forinit.type = "int"
		forinit.name = "i"
		forinit.value = new UniIntLiteral(0)
		
		val forcond = new UniBinOp
		forcond.left = new UniIdent("i")
		forcond.right = new UniIntLiteral(5)
		forcond.operator = "<"
		
		val forstep = new UniUnaryOp
		forstep.expr = new UniIdent("i")
		forstep.operator = "++"
		
		val statement = new UniBlock
		statement.body = #[ifstat as UniExpr]
		
		val forloop = new UniFor
		forloop.init = forinit
		forloop.cond = forcond
		forloop.step = forstep
		forloop.statement = statement
		
		val block = new UniBlock
		block.body = #[forloop as UniExpr]

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
	def void parseMethodWithWhileStatement() {
		val actual = mapper.parse("public class Main{ public static void main(){while(1){++j;if(j==1) break;}}")
		val break = new UniBreak
		
		val ifcond = new UniBinOp
		ifcond.left = new UniIdent("j")
		ifcond.right = new UniIntLiteral(1)
		ifcond.operator = "=="
		
		val ifstat = new UniIf
		ifstat.cond = ifcond
		ifstat.trueStatement = break
		ifstat.falseStatement = null
		
		val unary = new UniUnaryOp
		unary.expr = new UniIdent("j")
		unary.operator = "++"
		
		val statement = new UniBlock
		statement.body = #[unary as UniExpr, ifstat as UniExpr]
		
		val whileloop = new UniWhile
		whileloop.cond = new UniIntLiteral(1)
		whileloop.statement = statement
		
		val block = new UniBlock
		block.body = #[whileloop as UniExpr]

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
	def void parseMethodWthSwitchStatement() {
	}

	@Test
	def void parseMethodWithDoWhileStatement() {
		val actual = mapper.parse("public class Main{ public static void main(){do{++j;if(a==1) return;}while(1)}}")
		val ret = new UniReturn
		
		val ifcond = new UniBinOp
		ifcond.left = new UniIdent("a")
		ifcond.right = new UniIntLiteral(1)
		ifcond.operator = "=="
		
		val ifstat = new UniIf
		ifstat.cond = ifcond
		ifstat.trueStatement = ret
		ifstat.falseStatement = null
		
		val unary = new UniUnaryOp
		unary.expr = new UniIdent("j")
		unary.operator = "++"
		
		val statement = new UniBlock
		statement.body = #[unary as UniExpr, ifstat as UniExpr]
		
		val dowhile = new UniDoWhile
		dowhile.cond = new UniIntLiteral(1)
		dowhile.statement = statement
		
		val block = new UniBlock
		block.body = #[dowhile as UniExpr]

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
	def void parseMethodWithEnhancedFor() {
		//NOT IMPLEMENTED
	}
	
	@Test
	def void parseMethodWithFieldAccess() {
		//NOT IMPLEMENTED
	}
	
	@Test
	def void parseMethodWithMemberCall() {
		//NOT IMPLEMENTED
	}
	
	@Test
	def void parseMethodWithTernaryOp() {
		//NOT IMPLEMENTED
	}
	
	@Test
	def void parseMethodWithCastStatement() {
		//NOT IMPLEMENTED
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
