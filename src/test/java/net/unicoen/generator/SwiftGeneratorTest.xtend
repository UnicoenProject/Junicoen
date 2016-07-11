package net.unicoen.generator;


import com.google.common.collect.Lists
import java.util.HashMap
import net.unicoen.generator.JavaGenerator
import net.unicoen.node.UniBlock
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniMethodDec
import net.unicoen.node.UniStringLiteral
import org.junit.Test

import static net.unicoen.node_helper.Builder.*
import net.unicoen.node.UniMethodCall
import net.unicoen.node.UniFieldDec
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniExpr
import org.junit.Ignore
import net.unicoen.node.UniExpr
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*
import net.unicoen.mapper.Java8Mapper
import java.util.regex.Pattern
import net.unicoen.node.UniProgram

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
//		var tree = mapper.parse("public class abcde{ "
//			+"public final int temp = 5;"
//			+"temp(){int a = 0;int b = a; int c; c = b;}"
//			+"int ret(int a){"
//			+"final int max = 10;"
//			+"String[] groceries = new Stirng[3];"
//			+"a.age=1;"
//			+"i--;"
//			+"++j;"
//			+"}"
//			+"this.age=1;"
//			+"i=(String)j;"
//			+"groceries[0] = \"Potato\";"
//			+"String[] friends = {\"Bob\",\"Paul\",\"John\"};"
//			+"return a.ret();"
//			+"for(int i=0;i<5;i++){j++;}"
//			+"while(1){}"
//			+"do{++i;}while(a>b);"
//			+"switch (a) { case 1: int a=1; default: a =b;}"
//			+"}"
//			+"private static int sum(int num1, int num2){return num1 + num2;}"
			//+"double a = (int) max;}"
//			+"public static void main(){System.out.println(\"Hello World\"+hello);"
			
//			+"int sum = sum(1,2);"
//			+"final Year west = new Year(1992,02,22);"
//			+"west.printYear();"
//			+"if(rainP>50){System.out.println(\"Bring the umbrella\");}else if(rainP<70){System.out.println(\"No need\");"
//			+"int[] arr = new int[3];"
//			+"hm.put(\"potato\", 1);}"
//		
//			+"}")
//			val tree = mapper.parse("enum planets{"
//				+"SUNDAY(1), MONDAY(true), TUESDAY;"
//				+"private final double mass;"
//				+"private final double radius;"
//				+"Planet(double mass, double radius) {}"
//				+"private double mass() { return mass; }"
//				+"private double radius() { return radius; }"
//				+"}"
//			)
			/*1.First Java Program in Java-Basic Syntax 
			val tree = mapper.parse("public class MyFirstJavaProgram {"
				+"public static void main(String []args) {"
				+"System.out.println(\"Hello World\");"
				+"}"
				+"}"
			)
			*/
			
			/*2. Java Enums in Java-Basic Syntax 
			val tree = mapper.parse("class FreshJuice {"
				+"enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }"
				+"FreshJuiceSize size;"
				+"}"
				+"public class FreshJuiceTest {

   public static void main(String args[]){
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
      System.out.println(\"Size: \" + juice.size);
   }
}"
			)
			*/
			/*3.Sample of class declaration in Java-Object&Classes 
			val tree = mapper.parse("public class Dog{
   String breed;
   int ageC;
   String color;

   void barking(){
   }
   
   void hungry(){
   }
   
   void sleeping(){
   }
}")*/
			/*4. Constructor in Java-Object&Classes */
//			val tree = mapper.parse("public class Puppy{public Puppy(){}"
//				+"public Puppy(String name){}"
//				+"}")

			/*5. Creating an object in Java-Object&Classes 
			val tree= mapper.parse("public class Puppy{
public Puppy(String name){
System.out.println(\"Passed Name is:\"+name);
}
public static void main(String[] args){
Puppy myPuppy  =new Puppy(\"tommy\");
}
}")*/
			/*6. Access instance variables and methods of a class in Java-Object&classes*/
//			val tree = mapper.parse("public class Puppy{int puppyAge;"
//				+"public Puppy(String name){System.out.println(\"Name chosen is :\" + name );}"
//				+"public temp(String temp){System.out.println(temp);}"
//				+"}")

			val tree = mapper.parse("class a{int temp(int a, int b, int c, int d){}}")
			assertThat(tree, instanceOf(UniProgram))
			val cl = (tree as UniProgram).classes.get(0)
			assertThat(cl, instanceOf(UniClassDec))
//			val mem = (cl as UniClassDec).members.get(0)
//			assertThat(mem, instanceOf(UniFieldDec))
			
//		val tree = mapper.parse("class Year{"
//			+"int year; int month; int day;"
//			+"Year(int year, int month, int day){"
//			//+"this.year = year;this.month = month; this.day = day;"
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
//			+"private void checkOutEra(int year){"
//			+"if(year>1895 && year<1926){era = \"Meiji\";year=year-1895;} "
//			+"else if(year>=1912 && year<1926){era = \"Taisho\";year=year-1912;} "
//			+"}"
//			+"}"
//		)
		
//		val test = "class YearJP extends Year{"
//			+"String era;"
//			+"YearJP(int year, int month, int day){"
//			+"super(year, month, day);"
//			+"}"
//			+"public void printYear(){"
////			//+"checkOutEra(this.year);"
//			+"checkOutEra();"
//			+"}"
//			+"private void checkOutEra(int year){"
//			+"if(year>1895 && year<1926){era = \"Meiji\";year=year-1895;} "
//			+"else if(year>=1912 && year<1926){era = \"Taisho\";year=year-1912;} "
//			+"}"
//			+"}"
//			val temp = new temp()
//			val result = temp.translate(format(test))
//			println(result)
			
		
//		val tree = mapper.parse("class YearJP extends Year{"
//			+"private void checkOutEra(int year){"
//			+"if(year>1895 && year<1912){"
//			+"era = \"Meiji\";"
//			+"year = year - 1895;"
//			+"}"
//			+"else if(year>=1912 && year<1926){"
//			+"era = \"Taisho\";"
//			+"year = year - 1912;"
//			+"}"
//			+"}"
//			+"}"
//		)
//		val tree = mapper.parse("public interface A{public static final int a;}")

//		val system = new UniIdent
//		system.name = "System"
//		
//		val fieldAccess = new UniFieldAccess
//		fieldAccess.receiver = system
//		fieldAccess.fieldName = "out"
//		
//		val string = new UniStringLiteral
//		string.value = "Hello World"
//		
//		val receiver = fieldAccess
//		val methodName = "println"
//		val args = #[string as UniExpr]
//		
//		val methodCall = new UniMethodCall
//		methodCall.receiver = receiver
//		methodCall.methodName = methodName
//		methodCall.args = args
		
//		val tree = mapper.parse("public class a{"
//			+"int temp(){"
//			+"System.out.println(\"Hello world\");"
//			+"}"
//			+"}"
//			)
			
//		val replaced = JavaToSwiftTreeConverter.convert(tree)
//		val counter = JavaToSwiftTreeConverter.search(tree, methodCall)
		val modified = JavaToSwiftTreeConverter.convert(tree)
		//println(counter)
		val target = SwiftCodeGenerator.generate(modified)
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
	@Test @Ignore
	def void parseClassWithExtendsAndImplements(){
		val tree = mapper.parse("public static class A extends SuperClass implements Interface,Interface1 {}")
		val target = SwiftCodeGenerator.generate(tree)
		assertEquals("public static class A : SuperClass{ } ",format(target))
	}
	
}