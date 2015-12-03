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

class Java8MapperClassFieldMethodTest extends MapperTest {
	val mapper = new Java8Mapper(true)
	
	@Test
	def void parseEmptyMethod() {
		val main = mapper.parse("public class Main{ public static void main(String[] args){}}")
		main.evaluateClass("Main", null, null,1)
		
		val String[] modifiers = #["public","static"]
		val UniArg arg1 = new UniArg
		arg1.type = "String[]"
		arg1.name = "args"
		val UniArg[] args = #[arg1]
		(main as UniClassDec).members.get(0).evaluateMethodDec("main","void",modifiers,0,args)
	}
	@Test
	def void parseEmptyConstructor(){
		val main = mapper.parse("public class Main{ private Main(){} }")
		//Class
		main.evaluateClass("Main", null, null, 1)
		//Method
		val String[] modifiers = #["private"]
		val UniArg[] args = #[]
		(main as UniClassDec).members.get(0).evaluateMethodDec("Main",null,modifiers,0,args)
	}
	@Test
	def void parseMethodWithSingleLocalVar(){
		//Class
		val main = mapper.parse("public class Main{ public static void main(){int a;}}")
		main.evaluateClass("Main", null, null, 1)
		//Method
		assertThat((main as UniClassDec).members.get(0), instanceOf(UniMethodDec))
		val method = (main as UniClassDec).members.get(0) as UniMethodDec
		val String[] modifiers = #["public","static"]
		val UniArg[] args = #[]
		method.evaluateMethodDec("main","void",modifiers,1,args)
		//MethodBody
		val block = method.block as UniBlock
		val String[] modifiers2 = #[]
		evaluateVariableDec((block.body.get(0)), "int", "a", null, modifiers2)
	}
	@Test
	def void parseMethodWithMultipleLocalVar(){
		//Class
		val main = mapper.parse("public class Main{ public static void main(){int a,b,c;}}")
		main.evaluateClass("Main", null, null, 1)
		//Method
		val method = (main as UniClassDec).members.get(0) as UniMethodDec
		val String[] modifiers = #["public","static"]
		val UniArg[] args = #[]
		method.evaluateMethodDec("main","void",modifiers,1,args)
		//MethodBody
		val block = method.block as UniBlock
		val String[] modifiers2 = #[]
		evaluateVariableDec((block.body.get(0)), "int", "a", null, modifiers2)
		evaluateVariableDec((block.body.get(1)), "int", "b", null, modifiers2)
		evaluateVariableDec((block.body.get(2)), "int", "c", null, modifiers2)
	}
	@Test
	def void parseMethodWithSingleLocalVarWithValue(){
		//Class
		val main = mapper.parse("public class Main{ public static void main(){int a=1;}}")
		main.evaluateClass("Main", null, null, 1)
		//Method
		val method = (main as UniClassDec).members.get(0) as UniMethodDec
		val String[] modifiers = #["public","static"]
		val UniArg[] args = #[]
		method.evaluateMethodDec("main","void",modifiers,1,args)
		//MethodBody
		val block = method.block as UniBlock
		val String[] modifiers2 = #[]
		val UniIntLiteral literal = new UniIntLiteral
		literal.value = 1
		evaluateVariableDec((block.body.get(2)), "int", "a", literal, modifiers2)
	}
	@Test
	def void parseMethodWithMultipleLocalVarWithValue(){
		//Class
		val main = mapper.parse("public class Main{ public static void main(){int a,b,c=1}}")
		main.evaluateClass("Main", null, null, 1)
		//Method
		val method = (main as UniClassDec).members.get(0) as UniMethodDec
		val String[] modifiers = #["public","static"]
		val UniArg[] args = #[]
		method.evaluateMethodDec("main","void",modifiers,1,args)
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
	def void parseMethodWithIfStatement(){
		//Class
		val main = mapper.parse("public class Main{ public static void main(){if(true){a=1;}}}")
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
		val UniIdent variable = new UniIdent
		variable.name = "a"
		val UniIntLiteral literal = new UniIntLiteral
		literal.value = 1
		val UniBinOp binop = new UniBinOp
		binop.left = variable
		binop.right = literal
		binop.operator = "="
		val UniBoolLiteral cond = new UniBoolLiteral
		cond.value = true
		val UniBlock trueStatement = new UniBlock
		val UniBinOp[] statements = #[binop]
		trueStatement.body = statements
		evaluateIf(block.body.get(0), cond, trueStatement, null)
	}
	@Test
	def void parseMethodWithIfElseStatement(){
		//Class
		val main = mapper.parse("public class Main{ public static void main(){if(true){a=1;}else{b=1;}}}")
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
		val UniIdent variable = new UniIdent
		variable.name = "a"
		val UniIntLiteral literal = new UniIntLiteral
		literal.value = 1
		val UniBinOp binop = new UniBinOp
		binop.left = variable
		binop.right = literal
		binop.operator = "="
		val UniIdent variable2 = new UniIdent
		variable2.name = "b"
		val UniIntLiteral literal2 = new UniIntLiteral
		literal2.value = 1
		val UniBinOp binop2 = new UniBinOp
		binop2.left = variable
		binop2.right = literal
		binop2.operator = "="
		val UniBoolLiteral cond = new UniBoolLiteral
		cond.value = true
		val UniBlock trueStatement = new UniBlock
		val UniBinOp[] statements = #[binop]
		trueStatement.body = statements
		val UniBlock falseStatement = new UniBlock
		val UniBinOp[] statements2 = #[binop2]
		trueStatement.body = statements
		falseStatement.body = statements2
		evaluateIf(block.body.get(0), cond, trueStatement, falseStatement)
	}
	@Test
	def void parseMethodWithForStatement(){
		
	}
	@Test 
	def void parseMethodWithWhileStatement(){
		
	}
	@Test
	def void parseMethodWthSwitchStatement(){
		
	}
	@Test
	def void parseMethodWithDoStatement(){
		
	}
	@Test
	def void parseMethodWithBreakStatement(){
		
	}
	@Test
	def void parseMethodWithContinueStatement(){
		
	}
	@Test
	def void parseMethodWithReturnStatement(){
		
	}
	@Test
	def void parseMethodWithThrowStatement(){
		
	}
	@Test
	def void parseMethodWithTryStatement(){
		
	}
	@Test
	def void parseMethodWithStdlb(){
		
	}
	
}
