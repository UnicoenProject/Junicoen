package net.unicoen.generator;

import org.junit.Test

import net.unicoen.mapper.Java8Mapper
import static org.junit.Assert.*
import java.util.regex.Pattern
import net.unicoen.node.UniIdent
import net.unicoen.node.UniFieldAccess
import net.unicoen.node.UniStringLiteral
import net.unicoen.node.UniExpr
import net.unicoen.node.UniMethodCall

public class SwiftGeneratorTest{
	
	val mapper = new Java8Mapper(true)
	private val whitespace = Pattern.compile("\\s+");
	public def format(String str) {
		
		var replaced = whitespace.matcher(str).replaceAll(" ");
		if (replaced.charAt(replaced.length() - 1) == ' ') {
			replaced = replaced.substring(0, replaced.length() - 1);
		}
		return replaced;
	}
//	@Test
//	def void temp() {
//		val tree = mapper.parse("public class temp{ public static void main(){System.out.println(\"Hello World\");}}")
//		val target = SwiftGenerator.generate(tree)
//		assertEquals("public class A { } ",format(target))
//	}
	
	@Test
	def void parseClass() {
		//val tree = mapper.parse("public class A {}")
		//val target = SwiftGenerator.generate(tree)
		//assertEquals("public class A { } ",format(target))
		val tree = mapper.parse("public class temp{ temp(){int a = 0;int b = a; int c; c = b;}"
			+"int ret(int a){final int max = 10;"
			+"String[] groceries = new Stirng[3];groceries[0] = \"Potato\";"
			+"String[] friends = {\"Bob\",\"Paul\",\"John\"};"
			+"for(int i=0;i<5;i++){j++;}"
			+"while(1){}"
			+"do{++i;}while(a>b);}"
			+"public static int sum(int num1, int num2){return num1 + num2;}"
			//+"double a = (int) max;}"
			+"public static void main(){System.out.println(\"Hello World\");"
			//+"int sum = sum(1,2);"
			+"final Year west = new Year(1992,02,22);"
			+"west.printYear();"
			+"if(rainP>50){System.out.println(\"Bring the umbrella\");}else{System.out.println(\"No need\");"
			+"int[] arr = new int[3];}"
			+"}}")
//		

//		val tree = mapper.parse("class Year{"
//			+"int year; int month; int day;"
//			+"Year(int year, int month, int day){"
////			+"this.year = year;this.month = month; this.day = day;"
//			+"}"
//			+"public void printYear(){"
//			+"System.out.println(\"aa\");"
//			+"System.out.println();"
//			+"}"
//		);

//		val tree = mapper.parse("class YearJP extends Year{"
//			+"String era;"
//			+"YearJP(int year, int month, int day){"
//			+"super(year, month, day);"
//			+"}"
//			+"public void printYear(){"
////			//+"checkOutEra(this.year);"
//			+"checkOutEra();"
//			+"}"
//			+"}"
//		);
//		val tree = mapper.parse("class YearJP extends Year{"
//			+"private void checkOutEra(int year){"
//			+"if(year>1895 && year<1912){"
//			+"era = \"Meiji\";"
//			+"year = year - 1895;"
////			+"else if(year>=1912 && year<1926){"
////			+"era = \"Taisho\";"
////			+"year = year - 1912;"
////			+"}"
//			+"}"
//			+"}"
//			+"}"
//		);

		val system = new UniIdent
		system.name = "System"
		
		val fieldAccess = new UniFieldAccess
		fieldAccess.receiver = system
		fieldAccess.fieldName = "out"
		
		val string = new UniStringLiteral
		string.value = "Hello World"
		
		val receiver = fieldAccess
		val methodName = "println"
		val args = #[string as UniExpr]
		
		val methodCall = new UniMethodCall
		methodCall.receiver = receiver
		methodCall.methodName = methodName
		methodCall.args = args
		
		//val replaced = JavaToSwiftTreeConverter.convert(tree)
		//val counter = JavaToSwiftTreeConverter.search(tree, methodCall)
		val modified = JavaToSwiftTreeConverter.convert(tree)
		//println(counter)
		val target = SwiftGenerator.generate(modified)
		println(target)
		println("YYYYYYYEEEEAAAAAHHHHH")
		
//		val counter = JavaToSwiftTreeConverter.search(tree, methodCall)
//		println(counter)
//		
//		val tree2 = mapper.parse("public class temp{ public static void main(String[] args){System.out.println(\"aaa\");System.out.println(\"bbb\");}}")
//
//		val counter2 = JavaToSwiftTreeConverter.search(tree2, methodCall)
//		println(counter2)
	}
	@Test
	def void parseClassWithExtendsAndImplements(){
		val tree = mapper.parse("public static class A extends SuperClass implements Interface,Interface1 {}")
		val target = SwiftGenerator.generate(tree)
		assertEquals("public static class A : SuperClass{ } ",format(target))
	}
	
}