package net.unicoen.mapper

import net.unicoen.node.*
import org.junit.Test
import org.junit.Ignore

class Java8MapperProgramTest extends MapperTest {
	val mapper = new Java8Mapper(true)
	
	@Test
	def void parseSampleProgram() {
		val actual = mapper.parse("public class ClassName<E> extends AnyClass implements InterfaceName<String> {
			enum Color { RED, GREEN, BLUE };
			/* This comment may span multiple lines. */
			static Object staticField;
			// This comment may span only this line
			private E field;
			private AbstractClassName field2;
			// TASK: refactor
			public int foo(Integer parameter) {
				abstractMethod(inheritedField);
				int local= 42*hashCode();
				staticMethod();
				return bar(local) + parameter;
			}
		}")
		
		val node1 = "public"
		
		val node2 = #[node1]
		
		val node3 = "ClassName"
		
		val node4 = "AnyClass"
		
		val node5 = #[node4]
		
		val node6 = "InterfaceName"
		
		val node7 = #[node6]
		
		val node8 = "static"
		
		val node9 = #[node8]
		
		val node10 = "Object"
		
		val node11 = "staticField"
		
		val node12 = new UniFieldDec
		node12.modifiers = node9
		node12.type = node10
		node12.name = node11
		
		val node13 = "private"
		
		val node14 = #[node13]
		
		val node15 = "E"
		
		val node16 = "field"
		
		val node17 = new UniFieldDec
		node17.modifiers = node14
		node17.type = node15
		node17.name = node16
		
		val node18 = "private"
		
		val node19 = #[node18]
		
		val node20 = "AbstractClassName"
		
		val node21 = "field2"
		
		val node22 = new UniFieldDec
		node22.modifiers = node19
		node22.type = node20
		node22.name = node21
		
		val node23 = "public"
		
		val node24 = #[node23]
		
		val node25 = "int"
		
		val node26 = "foo"
		
		val node27 = "Integer"
		
		val node28 = "parameter"
		
		val node29 = new UniArg
		node29.type = node27
		node29.name = node28
		
		val node30 = #[node29]
		
		val node31 = "abstractMethod"
		
		val node32 = "inheritedField"
		
		val node33 = new UniIdent
		node33.name = node32
		
		val node34 = #[node33 as UniExpr]
		
		val node35 = new UniMethodCall
		node35.methodName = node31
		node35.args = node34
		
		val node36 = "local"
		
		val node37 = "int"
		
		val node38 = 42
		
		val node39 = new UniIntLiteral
		node39.value = node38
		
		val node40 = "*"
		
		val node41 = "hashCode"
		
		val node42 = new UniMethodCall
		node42.methodName = node41
		
		val node43 = new UniBinOp
		node43.left = node39
		node43.operator = node40
		node43.right = node42
		
		val node44 = new UniVariableDec
		node44.name = node36
		node44.type = node37
		node44.value = node43
		
		val node45 = "staticMethod"
		
		val node46 = new UniMethodCall
		node46.methodName = node45
		
		val node47 = "local"
		
		val node48 = new UniIdent
		node48.name = node47
		
		val node49 = #[node48 as UniExpr]
		
		val node50 = "bar"
		
		val node51 = new UniMethodCall
		node51.args = node49
		node51.methodName = node50
		
		val node52 = "+"
		
		val node53 = "parameter"
		
		val node54 = new UniIdent
		node54.name = node53
		
		val node55 = new UniBinOp
		node55.left = node51
		node55.operator = node52
		node55.right = node54
		
		val node56 = new UniReturn
		node56.value = node55
		
		val node57 = #[node35 as UniExpr, node44 as UniExpr, node46 as UniExpr, node56 as UniExpr]
		
		val node58 = new UniBlock
		node58.body = node57
		
		val node59 = new UniMethodDec
		node59.modifiers = node24
		node59.returnType = node25
		node59.methodName = node26
		node59.args = node30
		node59.block = node58
		
		val node60 = #[node12 as UniMemberDec, node17 as UniMemberDec, node22 as UniMemberDec, node59 as UniMemberDec]
		
		val node61 = new UniClassDec
		node61.modifiers = node2
		node61.className = node3
		node61.superClass = node5
		node61.interfaces = node7
		node61.members = node60
		
		node61.evaluate(actual)
	}
	
	@Test
	@Ignore
	def void parseCPProgram() {
		val actual = mapper.parse("
		public class Main {
			public static void main(String[] args) throws Exception {
				Scanner sc = new Scanner(System.in);
				sc.nextInt();
				int m1 = sc.nextInt();
				Set<Integer> set1 = new HashSet<Integer>();
				for (int i = 0; i < m1; i++) {
					set1.add(sc.nextInt());
				}
				int m2 = sc.nextInt();
				Set<Integer> set2 = new HashSet<Integer>();
				for (int i = 0; i < m2; i++) {
					int j = sc.nextInt();
					if (!set1.contains(j))
						set2.add(j);
				}
				if (set2.isEmpty()) {
					System.out.print(\"None\");
				} else {
					for (int i : set2) {
						if (set2.iterator().next() != i) {
							System.out.print(' ');
						}
						System.out.print(i);
					}
				}
				System.out.println();
				sc.close();
			}
		}
		")
		
		val node1 = "Main"
		
		val node2 = "public"
		
		val node3 = #[node2]
		
		val node4 = "args"
		
		val node5 = "String[]"
		
		val node6 = new UniArg
		node6.name = node4
		node6.type = node5
		
		val node7 = #[node6]
		
		val node8 = "main"
		
		val node9 = "public"
		
		val node10 = "static"
		
		val node11 = #[node9, node10]
		
		val node12 = "void"
		
		val node13 = new UniVariableDec
		
		val node14 = #[node13 as UniExpr]
		
		val node15 = new UniBlock
		node15.body = node14
		
		val node16 = new UniMethodDec
		node16.args = node7
		node16.methodName = node8
		node16.modifiers = node11
		node16.returnType = node12
		node16.block = node15
		
		val node17 = #[node16 as UniMemberDec]
		
		val node18 = new UniClassDec
		node18.className = node1
		node18.modifiers = node3
		node18.members = node17
		
		node18.evaluate(actual)
	}
	
}
