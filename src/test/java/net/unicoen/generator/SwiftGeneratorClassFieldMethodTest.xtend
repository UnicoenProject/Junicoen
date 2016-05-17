//package net.unicoen.generator;
//
//import com.google.common.collect.Lists
//import java.util.HashMap
//import net.unicoen.node.UniBoolLiteral
//import net.unicoen.node.UniClassDec
//import net.unicoen.node.UniDoubleLiteral
//import net.unicoen.node.UniIntLiteral
//import net.unicoen.node.UniStringLiteral
//import org.junit.Test
//
//import static net.unicoen.node_helper.Builder.*
//import net.unicoen.mapper.Java8Mapper
//import static org.junit.Assert.*
//import java.util.regex.Pattern
//
//public class SwiftGeneratorClassFieldMethodTest{
//	val mapper = new Java8Mapper(true)
//	private val whitespace = Pattern.compile("\\s+");
//	public def format(String str) {
//		
//		var replaced = whitespace.matcher(str).replaceAll(" ");
//		if (replaced.charAt(replaced.length() - 1) == ' ') {
//			replaced = replaced.substring(0, replaced.length() - 1);
//		}
//		return replaced;
//	}
//	@Test
//	def void parseEmptyMethod() {
//		val tree = mapper.parse("public class Main{ public static void main(String[] args){}}")
//		val target = SwiftGenerator.generate(tree)
//		assertEquals("public class Main { } ", format(target))
//	}
//	@Test
//	def void parseEmptyConstructor() {
//		val tree = mapper.parse("public class Main{ private Main(){} }")
//		val target = SwiftGenerator.generate(tree)
//		assertEquals("public class Main { init() { } } ", format(target))
//	}
//	@Test
//	def void parseMethodWithSingleLocalVar() {
//		val tree = mapper.parse("public class Main{ public static void main(){int a;}}")
//		val target = SwiftGenerator.generate(tree);
//		assertEquals("public class Main { } var a : Int ", format(target))
//	}
//
//	@Test
//	def void parseMethodWithIfStatement(){
//		val tree = mapper.parse("public class Main{ public static void main(){if(true){a=1;}}}")
//		val target = SwiftGenerator.generate(tree)
//		val expected = "public class Main { } if true { a = 1 } "
//		assertEquals(expected, format(target))
////		assertEquals(expected, target)
//	}
//	@Test
//	def void parseMethodWithIfElseStatement() {
//		val tree = mapper.parse("public class Main{ public static void main(){if(true){a=1;}else{b=1;}}}");
//		val target = SwiftGenerator.generate(tree)
//		val expected = "public class Main { } if true { a = 1 } else { b = 1 } "
//		assertEquals(expected, format(target))
//	}
//	@Test
//	def void parseMethodWithIfStatement1(){
//		val tree = mapper.parse("public class Main{ public static void test(){if(true){a=1;}}}")
//		val target = SwiftGenerator.generate(tree)
//		val expected = "public class Main { public func test () -> void { if true { a = 1 } } } "
//		assertEquals(expected, format(target))
//	}
//	@Test
//	def void parseMethodWithIfElseStatement1(){
//		val tree = mapper.parse("public class Main{ public static void test(){if(true){a=1;}else{b=1;}}}")
//		val target = SwiftGenerator.generate(tree)
//		val expected = "public class Main { public func test () -> void { if true { a = 1 } else { b = 1 } } } "
//		assertEquals(expected, format(target))
//	}
//	@Test
//	def void parseMethodWithWhileStatement(){
//		val tree = mapper.parse("public class Main{ public static void main(){while(1){++j;if(j==1) break;}}")
//		val target = SwiftGenerator.generate(tree)
//		val expected = "public class Main { } while 1 { ++j if j == 1 { break } } "
//		assertEquals(expected, format(target))
//	}
//	@Test
//	def void parseMethodWithWhileStatement1(){
//		val tree = mapper.parse("public class Main{ public static void test(){while(1){++j;if(j==1) break;}}")
//		val target = SwiftGenerator.generate(tree)
//		val expected = "public class Main { public func test () -> { while 1 { ++j if j == 1 { break } } } } "
//		//public class Main { ---------------------
//		println(format(target))
//	}
//	@Test
//	def void parseMethodWithDoWhileStatement(){
//		val tree = mapper.parse("public class Main{ public static void main(){do{++j;if(a==1) return;}while(1)}}")
//		val target = SwiftGenerator.generate(tree)
//		val expected = "public class Main { } repeat { ++j if a == 1 { return } } while 1 "
//		assertEquals(expected, format(target))
//	}
//	@Test
//	def void parseMethodWithDoWhileStatement1(){
//		val tree = mapper.parse("public class Main{ public static void test(){do{++j;if(a==1) return;}while(1)}}")
//		val target = SwiftGenerator.generate(tree)
//		val expected = "public class Main { public func test () -> void { repeat { ++ j if a == 1 { return } } while 1 } } "
//		assertEquals(expected, format(target))
//	}
//	//EMERGENCY
////	@Test
////	def void parseMethodWithForStatement(){
////		val tree = mapper.parse("public class Main{ public static void main(){for(int i=0;i<5;i++){if(a==1) continue;}}}")
////		val target = SwiftGenerator.generate(tree)
////		val expected = "";
////		//i++ & ++i => data less
////		assertEquals(expected, format(target)) 
////	}
////	@Test
////	def void parseMethodWithForStatement1(){
////		val tree = mapper.parse("public class Main{ public static void test(){for(int i=0;i<5;i++){if(a==1) continue;}}}")
////		val target = SwiftGenerator.generate(tree)
////		val expected = "";
////		assertEquals(expected, format(target))
////	}
//	
//	
//}