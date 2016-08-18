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
	def void FirstJavaProgram(){
		val tree = mapper.parse("
			public class MyFirstJavaProgram {
				int tt(int a, int b, int c, int d){
					System.out.println(\"Hello World\");
				}
			}"
		)
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void JavaEnums(){
		/*2. Java Enums in Java-Basic Syntax */
		val tree = mapper.parse("
			class FreshJuice {
				enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
				FreshJuiceSize size;
			}
			public class FreshJuiceTest {
				public static void main(String args[]){
  					FreshJuice juice =new FreshJuice();
 		 			juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
  					System.out.println(\"Size: \" + juice.size);
				}

			}"
			)
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void classDeclaration() {
		/*3.Sample of class declaration in Java-Object&Classes */
		val tree = mapper.parse("public class Dog{
		 String breed;
		 int ageC;
		 String color;
	     void barking(){
			this.age = 1;
	     }
	     void hungry(){
	     }
	     void sleeping(){
	     }
		 }")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void constructor() {
		/*4. Constructor in Java-Object&Classes */
		val tree = mapper.parse("
			public class Puppy{
				public Puppy(){}
				public Puppy(String name){Puppy temp =　new Puppy(name);
				}
		}")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void createObject() {
		/*5. Creating an object in Java-Object&Classes */
		val tree = mapper.parse("
			public class Puppy{
			public Puppy(String name){
				System.out.println(\"Passed Name is:\"+name);
		  	}
		 	public static void main(String[] args){
		  		Puppy myPuppy  = new Puppy(\"tommy\");
		  	}
		 }")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void accessInstance() {
		/*6. Access instance variables and methods of a class in Java-Object&classes*/
		val tree = mapper.parse("
			public class Puppy{int puppyAge;
			public Puppy(String name){int a;System.out.println(\"Name chosen is: \"+name);}
			public void setAge(int age){puppyAge = age;}
			public int getAge(){System.out.println(puppyAge);}
			public static void main(String[] args){
				Puppy myPuppy = new Puppy(\"tommy\");
				myPuppy.setAge(2);
				myPuppy.getAge();
				System.out.println(\"Variable Value : \"+myPuppy.puppyAge);
			}
		}")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void accessInstance2() {
		val tree = mapper.parse("
		public class Employee{
			String name;
   			int age;
   			String designation;
   			double salary;
   			public Employee(String name){" 
   			//      		this.name = name;
		+ "}
   			public void empAge(int empAge){
      			age =  empAge;
   			}
  	 		public void empDesignation(String empDesig){
      			designation = empDesig;
   			}
   			public void empSalary(double empSalary){
      			salary = empSalary;
   			}
   			public void printEmployee(){
      			System.out.println(\"Name:\"+ name );
      			System.out.println(\"Age:\" + age );
      			System.out.println(\"Designation:\" + designation );
      			System.out.println(\"Salary:\" + salary);
   			}
		}")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void accessInstance3() {
		val tree = mapper.parse("
		public class EmployeeTest{
   			public static void main(String args[]){
      		Employee empOne = new Employee(\"James Smith\");
      		Employee empTwo = new Employee(\"Mary Anne\");

      		empOne.empAge(26);
      		empOne.empDesignation(\"Senior Software Engineer\");
      		empOne.empSalary(1000);
      		empOne.printEmployee();

      		empTwo.empAge(21);
      		empTwo.empDesignation(\"Software Engineer\");
      		empTwo.empSalary(500);
      		empTwo.printEmployee();
   		}
		}")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void basicDataTypes() {
		/*7. Basic Data types and variable types in Java */
		val tree = mapper.parse("
			class BasicDataTypes{
				int a, b, c;
				int a = 10, b = 10;
				byte B = 22;
				double pi = 3.14159; 
				char a = 'a';
		}")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void basicDataTypes2() {
		val tree = mapper.parse("
			public class Test{ 
   			public void pupAge(){
      			int age = 0;
      			age = age + 7;
      			System.out.println(\"Puppy age is : \" + age);
   			}
   			public static void main(String args[]){
      			Test test = new Test();
      			test.pupAge();
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void basicVariableTypes() {

		val tree = mapper.parse("
			public class Employee{
   				public String name;
   				private double salary;
   
   				public Employee (String empName){name = empName;}
				public void setSalary(double empSal){
      				salary = empSal;
   				}
   				public void printEmp(){
      				System.out.println(\"name  : \" + name );
      				System.out.println(\"salary :\" + salary);
   				}
  	 			public static void main(String args[]){
      				Employee empOne = new Employee(\"Ransika\");
      				empOne.setSalary(1000);
      				empOne.printEmp();
   				}
			}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void basicVariableTypes2(){
		val tree = mapper.parse("
			public class Employee{
   				private static double salary;
   				public static final String DEPARTMENT = \"Development \";
   				public static void main(String args[]){
      				salary = 1000;
      				System.out.println(DEPARTMENT + \"average salary:\" + salary);
   				}
			}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void modifierTypes() {
		/*8. modifier types */
		val tree = mapper.parse("
			public class className {
				private boolean myFlag;
				static final double weeks = 9.5;
				protected static final int BOXWIDTH = 42;
				public static void main(String[] arguments) {
				}
			}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void basicOperators() {
		/*9. Basic operators */
		val tree = mapper.parse("
		public class Test {
			public static void main(String args[]){
      			int a, b;
      			a = 10;" 
//      		b = (a == 1) ? 20: 30;
		+ "System.out.println( \"Value of b is : \" +  b );" 
//      		b = (a == 10) ? 20: 30;
		+ "System.out.println( \"Value of b is : \" + b );
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void enhancedForLoop() {
		/*10. Loop control: for loop */
		val tree = mapper.parse("
		public class Test {
			public static void main(String args[]){
     			int [] numbers = {10, 20, 30, 40, 50};
      			for(int x : numbers ){
         			System.out.print( x );
         			System.out.print(\",\");
     	 		}
      			String [] names ={\"James\", \"Larry\", \"Tom\", \"Lacy\"};
      			for( String name : names ) {
         			System.out.print( name );
         			System.out.print(\",\");
      			}
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void whileLoop() {
		/*11. Loop control: while loop  */
		val tree = mapper.parse("
		public class Test {
   			public static void main(String args[]) {
      			int x = 10;
      			while( x < 20 ) {
         			System.out.print(\"value of x : \" + x );
         			x++;
      			}
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void forLoop() {
		/*12. Loop control: for loop */
		val tree = mapper.parse("
		public class Test {
		public static void main(String args[]) {
      	for(int x = 10; x < 20; x = x+1) {
			System.out.print(\"value of x : \" + x );
		for(int i=length-1;i>=0;i--){
		   result.append(operand.charAt(i));
		  }
      	}
   		}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void doWhileLoop() {
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
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void breakStatement(){
		/*14. Loop control: break statement */
		val tree = mapper.parse("
			public class Test {
   				public static void main(String args[]) {
     			int[] numbers = {10, 20, 30, 40, 50};
      			for(int x : numbers ) {
         			if( x == 30 ) {
	      				break;
         			}
         			System.out.print( x );
      			}
   				}
			}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void continueStatement(){
		/*15. Loop control: continue statement */
		val tree = mapper.parse("
		public class Test {
   			public static void main(String args[]) {
      		int [] numbers = {10, 20, 30, 40, 50};
      		for(int x : numbers ) {
         		if( x == 30 ) {
	      			continue;
         		}
         	System.out.print( x );
     		}
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void ifStatement(){
		/*16.if statement in Dimension Making*/
		val tree = mapper.parse("
		public class Test {
   			public static void main(String args[]){
      			int x = 10;
      			if( x < 20 ){
         			System.out.print(\"This is if statement\");
      			}
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void ifElseStatement(){
		/*17. if-else statement */
		val tree = mapper.parse("
		public class Test {
   		public static void main(String args[]){
      		int x = 30;
      		if( x < 20 ){
         		System.out.print(\"This is if statement\");
      		}else{
        		System.out.print(\"This is else statement\");
      		}
   		}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))

		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}

	@Test
	def void ifElseStatement2() {
		val tree = mapper.parse("
		public class Test {
   		public static void main(String args[]){
      		int x = 30;
      		if( x == 10 ){
        		System.out.print(\"Value of X is 10\");
      		}else if( x == 20 ){
         		System.out.print(\"Value of X is 20\");
      		}else if( x == 30 ){
         		System.out.print(\"Value of X is 30\");
      		}else{
         		System.out.print(\"This is else statement\");
      		}
   		}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	/*18. nestedIf */
	@Test
	def void nestedIf(){
		val tree = mapper.parse("
			public class Test {
   				public static void main(String args[]){
      				int x = 30;
      				int y = 10;

      				if( x == 30 ){
         				if( y == 10 ){
             				System.out.print(\"X = 30 and Y = 10\");
          				}
       				}
    			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	/*19. switchStatement */
	@Test
	def void switchStatement(){
		val tree = mapper.parse("
			public class Test {
   				public static void main(String args[]){
      			char grade = 'C';
				switch(grade)
      			{
         			case \"A\" :
            			System.out.println(\"Excellent!\"); 
            			break;
         			case \"B\" :
         			case \"C\" :
            			System.out.println(\"Well done\");
            			break;
         			case \"D\" :
            			System.out.println(\"You passed\");
         			case \"F\" :
            			System.out.println(\"Better try again\");
            			break;
         			default :
            			System.out.println(\"Invalid grade\");
      			}
      			System.out.println(\"Your grade is \" + grade);
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	/*20. numbers */
	@Test
	def void numbers() {
		val tree = mapper.parse("
			public class Test{
   				public static void main(String args[]){
      				Integer x = 5;
      				x =  x + 10;
      				System.out.println(x); 
   				}
		}")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	/*21. Strings*/
	@Test
	def void Strings() {
		val tree = mapper.parse("
			public class StringDemo{
   				public static void main(String args[]){"
//      			char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.'};
      			+"String helloString = new String(helloArray);
				String greeting = \"Hello world!\";
      			System.out.println( helloString );
				
				String palindrome = \"Dot saw I was Tod\";
      			int len = palindrome.length();
      			System.out.println( \"String Length is : \" + len );

				String string1 = \"saw I was \";
      			System.out.println(\"Dot \" + string1 + \"Tod\");

				System.out.printf(\"The value of the float variable is \" +
                  \"%f, while the value of the integer \" +
                  \"variable is %d, and the string \" +
                  \"is %s\", floatVar, intVar, stringVar);

				String fs;
				fs = String.format(\"The value of the float variable is \" +
                   \"%f, while the value of the integer \" +
                   \"variable is %d, and the string \" +
                   \"is %s\", floatVar, intVar, stringVar);
				System.out.println(fs);
   			}
		}")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	/*22. arrays */
	@Test
	def void arrays() {
		val tree = mapper.parse("
		public class TestArray {
   			public static void main(String[] args) {
      			double[] myList = {1.9, 2.9, 3.4, 3.5};

      		for (int i = 0; i < myList.length; i++) {
         		System.out.println(myList[i] + \" \");
      		}
      		
      		double total = 0;
      		for (int i = 0; i < myList.length; i++) {
         		total += myList[i];
      		}
      		System.out.println(\"Total is \" + total);
      		double max = myList[0];
      		for (int i = 1; i < myList.length; i++) {
         		if (myList[i] > max) max = myList[i];
      		}
      		System.out.println(\"Max is \" + max);

			double[] myList = new double[10];

			double[] myList = {1.9, 2.9, 3.4, 3.5};

      		for (double element: myList) {
         		System.out.println(element);
      		}

			for (int i = 0; i < array.length; i++) {
    			System.out.print(array[i] + \" \");
  			}

			printArray(new int[]{3, 1, 2, 6, 4, 2});
   		}

			public static int[] reverse(int[] list) {"
			//DECLARATION NEED TO IMPLEMENT
  			+"int[] result = new int[list.length];"
			//FOR LOOP ONLY FOR ONE STEPPER
//  			for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
//    			result[j] = list[i];
//  			}
  			+"return result;
		}
		}
	")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	/*23. methods */
	@Test
	def void methods(){
		val tree = mapper.parse("
		public class ExampleMinNumber{
				public static void main(String[] args) {
      				int a = 11;
      				int b = 6;
      				int c = minFunction(a, b);
      				System.out.println(\"Minimum Value = \" + c);
   			}
   			public static int minFunction(int n1, int n2) {
      			int min;
      			if (n1 > n2)
         			min = n2;
      			else
         			min = n1;
      			return min; 
   			}
			}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void methods2(){
		val tree = mapper.parse("
			public class ExampleVoid {
   				public static void main(String[] args) {
      				methodRankPoints(255.7);
   				}
   			public static void methodRankPoints(double points) {
      			if (points >= 202.5) {
         			System.out.println(\"Rank:A1\");
      			}
      			else if (points >= 122.4) {
         			System.out.println(\"Rank:A2\");
      			}
      			else {
         			System.out.println(\"Rank:A3\");
      			}
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void methods3(){
		val tree = mapper.parse("
			public class swappingExample {
   			public static void main(String[] args) {
      			int a = 30;
      			int b = 45;
      			System.out.println(\"Before swapping, a = \" +
                          a + \" and b = \" + b);
      			swapFunction(a, b);
      			System.out.println(\"**Now, Before and After swapping values will be same here**:\");
      			System.out.println(\"After swapping, a = \" +
                         a + \" and b is \" + b);
   			}
   			public static void swapFunction(int a, int b) {
      			System.out.println(\"Before swapping(Inside), a = \" + a
                           + \" b = \" + b);
      			int c = a;
     			a = b;
      			b = c;
      			System.out.println(\"After swapping(Inside), a = \" + a
                           + \" b = \" + b);
   			}
		}")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void method4(){
		val tree = mapper.parse("
			public class ExampleOverloading{
   				public static void main(String[] args) {
      				int a = 11;
      				int b = 6;
      				double c = 7.3;
      				double d = 9.4;
      				int result1 = minFunction(a, b);
      				double result2 = minFunction(c, d);
      				System.out.println(\"Minimum Value = \" + result1);
      				System.out.println(\"Minimum Value = \" + result2);
   				}
   				public static int minFunction(int n1, int n2) {
      				int min;
      				if (n1 > n2)
         				min = n2;
      				else
         				min = n1;
      				return min; 
   				}
   				public static double minFunction(double n1, double n2) {
     				double min;
      				if (n1 > n2)
         				min = n2;
      				else
         				min = n1;
      				return min; 
   				}
			}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void methods5(){
		val tree = mapper.parse("
		public class CommandLine {
   			public static void main(String args[]){ 
      			for(int i=0; i<args.length; i++){
         			System.out.println(\"args[\" + i + \"]: \" +
                                           args[i]);
      			}
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void method6(){
		val tree = mapper.parse("
		public class ConsDemo {
			MyClass(int i ) {
      				x = i;
   			}
   			public static void main(String args[]) {
      			MyClass t1 = new MyClass();
      			MyClass t2 = new MyClass();
				MyClass t1 = new MyClass( 10 );
      			MyClass t2 = new MyClass( 20 );
      			System.out.println(t1.x + \" \" + t2.x);
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void methods7(){
		val tree = mapper.parse("
		public class This_Example {
   			int num=10;
   			This_Example(){
      			System.out.println(\"This is an example program on keyword this \");	
   			}
  			This_Example(int num){"
//  			NOT IMPLEMENTED
//      			this();
      			+"this.num=num;	   
   			}
   			public void greet(){
      			System.out.println(\"Hi Welcome to Tutorialspoint\");
   			}
   			public void print(){
      			int num=20;
      			System.out.println(\"value of local variable num is : \"+num);
      			System.out.println(\"value of instance variable num is : \"+this.num);
      			this.greet();     
   			}
   			public static void main(String[] args){
      			This_Example obj1=new This_Example();
      			obj1.print();
      			This_Example obj2=new This_Example(30);
      			obj2.print(); 
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void methods8(){
		val tree = mapper.parse("
		public class VarargsDemo {
	   		public static void main(String args[]) {
	  			printMax(34, 3, 3, 2, 56.5);
      			printMax(new double[]{1, 2, 3});
   			}
   			public static void printMax( double[] numbers) {
   				if (numbers.length == 0) {
      			System.out.println(\"No argument passed\");
      			return;
   				}
   				double result = numbers[0];
   				for (int i = 1; i <  numbers.length; i++)
      				if (numbers[i] >  result)
      					result = numbers[i];
      			System.out.println(\"The max value is \" + result);
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	/*24. inner classes */
	@Test
	def void innerClasses() {
		val tree = mapper.parse("
		class Outer_Demo{
   			int num;
   			private class Inner_Demo{
      			public void print(){	   
         			System.out.println(\"This is an inner class\");
      			}
   			}
   			void display_Inner(){
      			Inner_Demo inner = new Inner_Demo();
      			inner.print();
   			}
			public static void main(String args[]){
      			Outer_Demo outer = new Outer_Demo();
      			outer.display_Inner();
   			}
		}
		")		
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void innerClasses2(){
		val tree = mapper.parse("
		class Outer_Demo {
   			private int num= 175;  
   			public class Inner_Demo{
      			public int getNum(){
         			System.out.println(\"This is the getnum method of the inner class\");
         			return num;
      			}
   			}
			public static void main(String args[]){
      			Outer_Demo outer=new Outer_Demo();"
//      			NOT IMPLEMENTED
//      			Outer_Demo.Inner_Demo inner=outer.new Inner_Demo();
      			+"System.out.println(inner.getNum());
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test@Ignore
	//NOT IMPLEMENTED-INNER CLASS INSIDE A METHOD
	def void methodLocalInnerClasses(){
		val tree = mapper.parse("
		public class Outerclass{
   			void my_Method(){
      			int num = 23;
      			class MethodInner_Demo{
         			public void print(){
            			System.out.println(\"This is method inner class \"+num);	   
         			}   
				}	   
      			MethodInner_Demo inner = new MethodInner_Demo();
      			inner.print();
   			}
   			public static void main(String args[]){
      			Outerclass outer = new Outerclass();
      			outer.my_Method();	   	   
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	//NOT IMPLEMENTED
	@Test
	def void anonymousInnerClasses(){
		val tree = mapper.parse("
		public class My_class {
   			public void displayMessage(Message m){
      			System.out.println(m.greet() +\", This is an example of anonymous inner class as an argument\");	   
   			}
   			public static void main(String args[]){
      			My_class obj = new My_class();
      			obj.displayMessage(new Message(){
         			public String greet(){
            			return \"Hello\";  		   
         			}
      			});
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void staticInnerClass(){
		val tree = mapper.parse("
		public class Outer{
   			static class Nested_Demo{
      			public void my_method(){
         			System.out.println(\"This is my nested class\");
      			}
   			}
   
   			public static void main(String args[]){
      			Outer.Nested_Demo nested = new Outer.Nested_Demo();	 
      			nested.my_method();
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	/*25. Inheritance */
	@Test
	def void inheritance(){
		val tree = mapper.parse("
		public class My_Calculation extends Calculation{    
   			public void multiplication(int x, int y){
      			z = x*y;
      			System.out.println(\"The product of the given numbers:\"+z);
   			}
   			public static void main(String args[]){"
   			//ADD NOT IMPLEMENTED
//      			int a = 20, b = 10;
      			+"My_Calculation demo = new My_Calculation();
      			demo.addition(a, b);
      			demo.Subtraction(a, b);
      			demo.multiplication(a, b);      
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	//with super keyword
	@Test
	def void inheritance2(){
		val tree = mapper.parse("
		public class Sub_class extends Super_class {
   			int num = 10;
   			public void display(){
      			System.out.println(\"This is the display method of subclass\");
   			}
   			public void my_method(){
      			Sub_class sub = new Sub_class();
      			sub.display();
      			super.display();
      			System.out.println(\"value of the variable named num in sub class:\"+ sub.num);
      			System.out.println(\"value of the variable named num in super class:\"+ super.num);     
   			}
   			public static void main(String args[]){
      			Sub_class obj = new Sub_class();
      			obj.my_method();
      
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void inheritance3(){
		val tree = mapper.parse("
		class Superclass{
   			int age;
   			Superclass(int age){
      			this.age = age; 		 
   			}
   			public void getAge(){
      			System.out.println(\"The value of the variable named age in super class is: \" +age);
   			}
		}
		public class Subclass extends Superclass {
   			Subclass(int age){
      			super(age);
   			}
   			public static void main(String argd[]){
      			Subclass s = new Subclass(24);
      			s.getAge();
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	/*25. override */
	@Test
	def void testOverride(){
		val tree = mapper.parse("
		class Animal{
   			public void move(){
      			System.out.println(\"Animals can move\");
   			}
		}
		class Dog extends Animal{
   			public void move(){
      			System.out.println(\"Dogs can walk and run\");
   			}
		}
		public class TestDog{
   			public static void main(String args[]){
      			Animal a = new Animal();
      			Animal b = new Dog();
      			a.move();
      			b.move();
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void testOverride2(){
		val tree = mapper.parse("
		class Animal{
   			public void move(){
      			System.out.println(\"Animals can move\");
   			}
		}
		class Dog extends Animal{
   			public void move(){
      			super.move();
      			System.out.println(\"Dogs can walk and run\");
   			}
		}
		public class TestDog{
   			public static void main(String args[]){
      			Animal b = new Dog(); //Runs the method in Dog class

   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
//		println("YYYYYYYEEEEAAAAAHHHHH")
//		val counter = JavaToSwiftTreeConverter.search(tree, methodCall)
//		println(counter)
//		val tree2 = mapper.parse("public class temp{ public static void main(String[] args){System.out.println(\"aaa\");System.out.println(\"bbb\");}}")
//		val counter2 = JavaToSwiftTreeConverter.search(tree2, methodCall)
//		println(counter2)
	/*26. polymorphism */
	@Test
	def void polymorphism(){
		val tree = mapper.parse("
		public class Employee{
   			private String name;
   			private String address;
   			private int number;
   			public Employee(String name, String address, int number){
      			System.out.println(\"Constructing an Employee\");
      			this.name = name;
      			this.address = address;
      			this.number = number;
   			}
   			public void mailCheck(){
      			System.out.println(\"Mailing a check to \" + this.name
       + \" \" + this.address);
   			}
   			public String toString(){
      			return name + \" \" + address + \" \" + number;
   			}
   			public String getName(){
      			return name;
   			}
   			public String getAddress(){
      			return address;
   			}
   			public void setAddress(String newAddress){
      			address = newAddress;
   			}
   			public int getNumber(){
     			return number;
   			}
		}
		public class Salary extends Employee{
   			private double salary;
   			public Salary(String name, String address, int number, double salary){
       			super(name, address, number);
       			setSalary(salary);
   			}
   			public void mailCheck(){
       			System.out.println(\"Within mailCheck of Salary class \");
       			System.out.println(\"Mailing check to \" + getName()
       + \" with salary \" + salary);
   			}
   			public double getSalary(){
       			return salary;
   			}
   			public void setSalary(double newSalary){
       			if(newSalary >= 0.0){
          			salary = newSalary;
       			}
   			}
   			public double computePay(){
      			System.out.println(\"Computing salary pay for \" + getName());
      			return salary/52;
   			}
		}
		public class VirtualDemo{
   			public static void main(String [] args){
      			Salary s = new Salary(\"Mohd Mohtashim\", \"Ambehta, UP\", 3, 3600.00);
      			Employee e = new Salary(\"John Adams\", \"Boston, MA\", 2, 2400.00);
      			System.out.println(\"Call mailCheck using Salary reference --\");
      			s.mailCheck();
      			System.out.println(\" Call mailCheck using Employee reference--\");
      			e.mailCheck();
    		}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	/*27. abstraction */
	@Test
	def void abstraction(){
		val tree = mapper.parse("
		public abstract class Employee{
   			private String name;
   			private String address;
   			private int number;
   			public Employee(String name, String address, int number){
      			System.out.println(\"Constructing an Employee\");
      			this.name = name;
      			this.address = address;
      			this.number = number;
   			}
   			public double computePay(){
     			System.out.println(\"Inside Employee computePay\");
     			return 0.0;
   			}
   			public void mailCheck(){
      			System.out.println(\"Mailing a check to \" + this.name
       + \" \" + this.address);
   			}
   			public String toString(){
      			return name + \" \" + address + \" \" + number;
   			}
   			public String getName(){
      			return name;
   			}
			public String getAddress(){
      			return address;
   			}
			public void setAddress(String newAddress){
      			address = newAddress;
   			}
   			public int getNumber(){
     			return number;
   			}
		}
		public class AbstractDemo{
   			public static void main(String [] args){
      			Employee e = new Employee(\"George W.\", \"Houston, TX\", 43);
      			System.out.println(\" Call mailCheck using Employee reference--\");
      			e.mailCheck();
    		}
		}
		public class Salary extends Employee{
   			private double salary; //Annual salary
   			public Salary(String name, String address, int number, double salary){
       			super(name, address, number);
       			setSalary(salary);
   			}
   			public void mailCheck(){
       			System.out.println(\"Within mailCheck of Salary class \");
       			System.out.println(\"Mailing check to \" + getName()
       + \" with salary \" + salary);
   			}
   			public double getSalary(){
       			return salary;
   			}
   			public void setSalary(double newSalary){
       			if(newSalary >= 0.0){
          			salary = newSalary;
       			}
   			}
   			public double computePay(){
      			System.out.println(\"Computing salary pay for \" + getName());
      			return salary/52;
   			}
		}
		public class AbstractDemo{
   			public static void main(String [] args){
      			Salary s = new Salary(\"Mohd Mohtashim\", \"Ambehta, UP\", 3, 3600.00);
      			Employee e = new Salary(\"John Adams\", \"Boston, MA\", 2, 2400.00);
      			System.out.println(\"Call mailCheck using Salary reference --\");
      			s.mailCheck();
      			System.out.println(\" Call mailCheck using Employee reference--\");
      			e.mailCheck();
    		}
		}
		public abstract class Employee{
   			private String name;
   			private String address;
   			private int number;
   
   			public abstract double computePay();
		}
		public class Salary extends Employee{
   			private double salary;
   			public double computePay(){
      			System.out.println(\"Computing salary pay for \" + getName());
      			return salary/52;
   			}
		}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	/*28. Encapsulation */
	@Test
	def void encapsulation(){
		val tree = mapper.parse("
public class EncapTest{

   private String name;
   private String idNum;
   private int age;

   public int getAge(){
      return age;
   }

   public String getName(){
      return name;
   }

   public String getIdNum(){
      return idNum;
   }

   public void setAge( int newAge){
      age = newAge;
   }

   public void setName(String newName){
      name = newName;
   }

   public void setIdNum( String newId){
      idNum = newId;
   }
}
public class RunEncap{

   public static void main(String args[]){
      EncapTest encap = new EncapTest();
      encap.setName(\"James\");
      encap.setAge(20);
      encap.setIdNum(\"12343ms\");

      System.out.print(\"Name : \" + encap.getName() + \" Age : \" + encap.getAge());
    }
}		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	/*29. interfaces */
	@Test
	def void interfaces(){
		val tree = mapper.parse("
public class MammalInt implements Animal{

   public void eat(){
      System.out.println(\"Mammal eats\");
   }

   public void travel(){
      System.out.println(\"Mammal travels\");
   } 

   public int noOfLegs(){
      return 0;
   }

   public static void main(String args[]){
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
   }
} 
public interface Sports
{
   public void setHomeTeam(String name);
   public void setVisitingTeam(String name);
}

//Filename: Football.java
public interface Football extends Sports
{
   public void homeTeamScored(int points);
   public void visitingTeamScored(int points);
   public void endOfQuarter(int quarter);
}

//Filename: Hockey.java
public interface Hockey extends Sports
{
   public void homeGoalScored();
   public void visitingGoalScored();
   public void endOfPeriod(int period);
   public void overtimePeriod(int ot);
}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test
	def void temp(){
		val tree = mapper.parse("
class temp{
    String isP(){
		if((length==1)&&(symbol != \"+\")&&(symbol != \"-\")){
			return \"YES\";
		}
        for(int i=0;i<(length+1)/2;i++){
            if(array[i]!=array[length-i-1]){
                return \"No\";
            }
        }return \"YES\";
		for(int i=0; i<src.size();++i){
			boolean isMatch = true;
			for(int j=0; j<subStr.size(); ++j){
				if(src[i] != subStr[j])
					isMatch = false;
			}
			if(isMatch)	return i;
		}
		if(src.length()==1)	return \"YES\";
		for(int i = 1; i<src.size(); ++i) {
			if(!isdigit(src[i]))	return \"NO\";
		}
		if(!check(src[0]))	return \"NO\";
		dst = reverse(src);
		if(src==dst)
			return \"YES\";
		else
			return \"NO\";
		for(int i = from; i<src.size();++i){
			dst[src.length()-i-1+from] = src[i];
		}return dst;
		for(int i=0;i<10;++i){
			if(c-'0'==i)	return true;
		}return false;

    }
	
}
		")
		assertThat(tree, instanceOf(UniProgram))
		val cl = (tree as UniProgram).classes.get(0)
		assertThat(cl, instanceOf(UniClassDec))
		val modified = JavaToSwiftTreeConverter.convert(tree)
		val target = SwiftCodeGenerator.generate(modified)
		println(target)
		println("---------------------------------------------")
	}
	@Test @Ignore
	def void parseClassWithExtendsAndImplements() {
		val tree = mapper.parse("public static class A extends SuperClass implements Interface,Interface1 {}")
		val target = SwiftCodeGenerator.generate(tree)
		assertEquals("public static class A : SuperClass{ } ", format(target))
	}

}
