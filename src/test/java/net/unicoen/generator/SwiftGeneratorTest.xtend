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
//		val tree = mapper.parse("
//			public class Puppy{int puppyAge;
//			public Puppy(String name){int a;System.out.println(\"Name chosen is: \"+name);}
//			public void setAge(int age){puppyAge = age;}
//			public int getAge(){System.out.println(puppyAge);}
//			public static void main(String[] args){
//				Puppy myPuppy = new Puppy(\"tommy\");
//				myPuppy.setage(2);
//				myPuppy.getAge();
//				System.out.println(\"Variable Value : \"+myPuppy.puppyAge);
//			}
//		}")
//		val tree = mapper.parse("
//		public class Employee{
//			String name;
//   			int age;
//   			String designation;
//   			double salary;
//   			public Employee(String name){"
////      		this.name = name;
//   			+"}
//   			public void empAge(int empAge){
//      			age =  empAge;
//   			}
//  	 		public void empDesignation(String empDesig){
//      			designation = empDesig;
//   			}
//   			public void empSalary(double empSalary){
//      			salary = empSalary;
//   			}
//   			public void printEmployee(){
//      			System.out.println(\"Name:\"+ name );
//      			System.out.println(\"Age:\" + age );
//      			System.out.println(\"Designation:\" + designation );
//      			System.out.println(\"Salary:\" + salary);
//   			}
//		}")

//		val tree = mapper.parse("
//		public class EmployeeTest{
//   			public static void main(String args[]){
//      		Employee empOne = new Employee(\"James Smith\");
//      		Employee empTwo = new Employee(\"Mary Anne\");
//
//      		empOne.empAge(26);
//      		empOne.empDesignation(\"Senior Software Engineer\");
//      		empOne.empSalary(1000);
//      		empOne.printEmployee();
//
//      		empTwo.empAge(21);
//      		empTwo.empDesignation(\"Software Engineer\");
//      		empTwo.empSalary(500);
//      		empTwo.printEmployee();
//   		}
//		}")
		/*7. Basic Data types and variable types in Java */
//		val tree = mapper.parse("
//			class BasicDataTypes{
//				int a, b, c;
//				int a = 10, b = 10;"
////				byte B = 22;
//				+"double pi = 3.14159;"
////				char a = 'a';
//		+"}")

//		val tree = mapper.parse("
//			public class Test{ 
//   			public void pupAge(){
//      			int age = 0;
//      			age = age + 7;
//      			System.out.println(\"Puppy age is : \" + age);
//   			}
//   			public static void main(String args[]){
//      			Test test = new Test();
//      			test.pupAge();
//   			}
//		}
//		")

//		val tree = mapper.parse("
//			public class Employee{
//   				public String name;
//   				private double salary;
//   
//   				public Employee (String empName){name = empName;}
//				public void setSalary(double empSal){
//      				salary = empSal;
//   				}
//   				public void printEmp(){
//      				System.out.println(\"name  : \" + name );
//      				System.out.println(\"salary :\" + salary);
//   				}
//  	 			public static void main(String args[]){
//      				Employee empOne = new Employee(\"Ransika\");
//      				empOne.setSalary(1000);
//      				empOne.printEmp();
//   				}
//			}
//		")
//		val tree = mapper.parse("
//			public class Employee{
//   				private static double salary;
//   				public static final String DEPARTMENT = \"Development \";
//   				public static void main(String args[]){
//      				salary = 1000;
//      				System.out.println(DEPARTMENT + \"average salary:\" + salary);
//   				}
//			}
//		")
		/*8. modifier types */
//		val tree = mapper.parse("
//			public class className {
//				private boolean myFlag;
//				static final double weeks = 9.5;
//				protected static final int BOXWIDTH = 42;
//				public static void main(String[] arguments) {
//				}
//			}
//		")

		/*9. Basic operators */
//		val tree = mapper.parse("
//		public class Test {
//			public static void main(String args[]){
//      			int a, b;
//      			a = 10;"
////      			b = (a == 1) ? 20: 30;
//     			+"System.out.println( \"Value of b is : \" +  b );"
////      			b = (a == 10) ? 20: 30;
//      			+"System.out.println( \"Value of b is : \" + b );
//   			}
//		}
//		")
		/*10. Loop control: for loop */
//		val tree = mapper.parse("
//		public class Test {
//			public static void main(String args[]){
//     			int [] numbers = {10, 20, 30, 40, 50};
//      			for(int x : numbers ){
//         			System.out.print( x );
//         			System.out.print(\",\");
//     	 		}
//      			String [] names ={\"James\", \"Larry\", \"Tom\", \"Lacy\"};
//      			for( String name : names ) {
//         			System.out.print( name );
//         			System.out.print(\",\");
//      			}
//   			}
//		}
//		")

		/*11. Loop control: while loop  */
//		val tree = mapper.parse("
//		public class Test {
//   			public static void main(String args[]) {
//      			int x = 10;
//      			while( x < 20 ) {
//         			System.out.print(\"value of x : \" + x );
//         			x++;
//      			}
//   			}
//		}
//		")
		/*12. Loop control: for loop */
//		val tree = mapper.parse("
//		public class Test {
//		public static void main(String args[]) {
//      	for(int x = 10; x < 20; x = x+1) {
//			System.out.print(\"value of x : \" + x );
//      	}
//   		}
//		}
//		")
		/*13. Loop control: dowhile loop */
		val tree = mapper.parse("
		public class Test {
   			public static void main(String args[]){
      			int x = 10;
      			do{
         			System.out.print(\"value of x : \" + x );
         			++x;
      			}while( x < 20 );
   			}
		}
		")
		
		
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
