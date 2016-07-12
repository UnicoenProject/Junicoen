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

public class SwiftGeneratorTest {

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

//		1.First Java Program in Java-Basic Syntax 
//		val tree = mapper.parse("
//			public class MyFirstJavaProgram {
//				int tt(int a, int b, int c, int d){
//					\"System.out.println(\"Hello World\");
//				}
//			}"
//		)

		/*2. Java Enums in Java-Basic Syntax */
//		val tree = mapper.parse("
//			class FreshJuice {
//				enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
//				FreshJuiceSize size;
//			}
//			public class FreshJuiceTest {
//				int temp(int a, int b, int c, int d){}
//				public static void main(String args[]){
//  					FreshJuice juice =new FreshJuice();
// 		 			juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
//  					System.out.println(\"Size: \" + juice.size);
//				}
//
//			}"
//		)
		/*3.Sample of class declaration in Java-Object&Classes */
//		 val tree = mapper.parse("public class Dog{
//		 String breed;
//		 int ageC;
//		 String color;
//	     void barking(){
//	     }
//	     void hungry(){
//	     }
//	     void sleeping(){
//	     }
//		 }")
		/*4. Constructor in Java-Object&Classes */
//		val tree = mapper.parse("
//			public class Puppy{
//				public Puppy(){}
//				public Puppy(String name){Puppy temp =　new Puppy();
//				}
//		}")
		/*5. Creating an object in Java-Object&Classes */
//		val tree= mapper.parse("
//			public class Puppy{
//			public Puppy(String name){
//				System.out.println(\"Passed Name is:\"+name);
//		  	}
//		 	public static void main(String[] args){
//		  		Puppy myPuppy  = new Puppy(\"tommy\");
//		  	}
//		 }")
		/*6. Access instance variables and methods of a class in Java-Object&classes*/
		val tree = mapper.parse("
			public class Puppy{int puppyAge;
			public Puppy(String name){int a;System.out.println(\"Name chosen is: \"+name);}
			public void setAge(int age){puppyAge = age;}
			public int getAge(){System.out.println(puppyAge);}
			public static void main(String[] args){
				Puppy myPuppy = new Puppy(\"tommy\");
				myPuppy.setage(2);
				myPuppy.getAge();
				System.out.println(\"Variable Value : \"+myPuppy.puppyAge);
			}
		}")
//			val tree = mapper.parse("class a{int temp(int a, int b, int c, int d){}}")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		// println(counter)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("YYYYYYYEEEEAAAAAHHHHH")
//		val counter = JavaToSwiftTreeConverter.search(tree, methodCall)
//		println(counter)
//		val tree2 = mapper.parse("public class temp{ public static void main(String[] args){System.out.println(\"aaa\");System.out.println(\"bbb\");}}")
//		val counter2 = JavaToSwiftTreeConverter.search(tree2, methodCall)
//		println(counter2)
	}

	@Test @Ignore
	def void parseClassWithExtendsAndImplements() {
		val tree = mapper.parse("public static class A extends SuperClass implements Interface,Interface1 {}")
		val target = SwiftCodeGenerator.generate(tree)
		assertEquals("public static class A : SuperClass{ } ", format(target))
	}

}
