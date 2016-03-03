package net.unicoen.generator;

import com.google.common.collect.Lists
import java.util.HashMap
import net.unicoen.node.UniBoolLiteral
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniDoubleLiteral
import net.unicoen.node.UniIntLiteral
import net.unicoen.node.UniStringLiteral
import org.junit.Test

import static net.unicoen.node_helper.Builder.*
import net.unicoen.mapper.Java8Mapper
import static org.junit.Assert.*
import java.util.regex.Pattern

public class SwiftGeneratorClassFieldVariableTest{
	val mapper = new Java8Mapper(true)
	private val whitespace = Pattern.compile("\\s+");
	public def format(String str) {
		
		var replaced = whitespace.matcher(str).replaceAll(" ");
		if (replaced.charAt(replaced.length() - 1) == ' ') {
			replaced = replaced.substring(0, replaced.length() - 1);
		}
		return replaced;
	}
	@Test
	def void parseSinglePrimitiveVarAttDec() {
		val tree = mapper.parse("public class A{public static final int a;}")
		val target = SwiftGenerator.generate(tree)
		//public class A { public static final int a; } 
		println(format(target))
	}
	@Test
	def void parseMultiplePrimitiveVarAttDec() {
		val tree = mapper.parse("public class A{public static final int temp, temp1, temp2;}")
		val target = SwiftGenerator.generate(tree)
		//public class A { public static final int temp;public static final int temp1;public static final int temp2; } 
		println(format(target))
	}
	@Test
	def void parseSinglePrimitiveVarAttDecWithStringValue() {
		val tree = mapper.parse("public class A{public static final String a=\"abc\";}");
		val target = SwiftGenerator.generate(tree)
		//public class A { public static final String a = "abc"; } 
		println(format(target))
	}
	@Test
	def void parseSinglePrimitiveVarAttDecWithIntValue() {
		val tree = mapper.parse("public class A{public static final int a=5;}");
		val target = SwiftGenerator.generate(tree)
		//public class A { public static final int a = 5; } 
		println(format(target))
	}
	@Test
	def void parseSinglePrimitiveVarAttDecWithDoubleValue() {
		val tree = mapper.parse("public class A{public static final double a=5.5;}");
		val target = SwiftGenerator.generate(tree)
		//public class A { public static final double a = 5.5; } 
		println(format(target))
	}
	@Test
	def void parseSinglePrimitiveVarAttDecWithBooleanValue() {
		val tree = mapper.parse("public class A{public static final boolean a=true;}");
		val target = SwiftGenerator.generate(tree)
		//public class A { public static final boolean a = true; } 
		println(format(target))
	}
	@Test
	def void ParseMultiplePrimitiveVarAttDecWithValue() {
		val tree = mapper.parse("public class A{public static final int temp, temp1, temp2=5;}")
		val target = SwiftGenerator.generate(tree)
		//public class A { public static final int temp;public static final int temp1;public static final int temp2 = 5; } 
		println(format(target))
	}
	@Test
	def void ParseClassInstanceDec() {
		val tree = mapper.parse("class A{public static final Temp tt;}");
		val target = SwiftGenerator.generate(tree)
		// class A { public static final Temp tt; }
		println(format(target))
	}
	@Test
	def void ParseClassInstanceDecWithValue() {
		val tree = mapper.parse("class A{public static final Temp tt = new Temp(1,2);}");
		val target = SwiftGenerator.generate(tree)
		// class A { public static final Temp tt = new Temp(1, 2); } 
		println(format(target))
	}
	@Test
	def void ParseArrayInstanceDec() {
		val tree = mapper.parse("class A{ public static final int[] arr = new int[3]; }")
	}
	@Test
	def void ParseArrayInstanceDecWithValue() {
		val tree = mapper.parse("class A{ public static final int[] arr = {1,2,3}; }")
	}
	@Test
	def void ParseArrayInstanceDecWithValue2() {
		val tree = mapper.parse("class A{ public static int[] arr = new int[]{1,2,3}; }")
		//val target = SwiftGenerator.generate(tree)
	}	
}