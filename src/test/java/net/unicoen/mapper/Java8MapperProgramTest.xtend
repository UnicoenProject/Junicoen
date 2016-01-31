package net.unicoen.mapper

import net.unicoen.node.*
import org.junit.Test
import net.unicoen.generator.JavaGenerator

class Java8MapperProgramTest extends MapperTest {
	val mapper = new Java8Mapper(true)

	@Test
	def void parseSampleProgram() {
		val actual = mapper.parse(
			"public class ClassName<E> extends AnyClass implements InterfaceName<String> {
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
		node12.comments = #["/* This comment may span multiple lines. */"]

		val node13 = "private"

		val node14 = #[node13]

		val node15 = "E"

		val node16 = "field"

		val node17 = new UniFieldDec
		node17.modifiers = node14
		node17.type = node15
		node17.name = node16
		node17.comments = #["// This comment may span only this line"]

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
		node59.comments = #["// TASK: refactor"]

		val node60 = #[node12 as UniMemberDec, node17 as UniMemberDec, node22 as UniMemberDec, node59 as UniMemberDec]

		val node61 = new UniClassDec
		node61.modifiers = node2
		node61.className = node3
		node61.superClass = node5
		node61.interfaces = node7
		node61.members = node60

		node61.evaluate(actual)

		println(JavaGenerator.generate(actual as UniClassDec))

		evaluate(node61, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))
	}

	@Test
	def void parseCPProgram() {
		val actual = mapper.parse(
			"
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
							System.out.print(\" \");
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

		val node13 = "sc"

		val node14 = "Scanner"

		val node15 = "in"

		val node16 = "System"

		val node17 = new UniIdent
		node17.name = node16

		val node18 = new UniFieldAccess
		node18.fieldName = node15
		node18.receiver = node17

		val node19 = #[node18 as UniExpr]

		val node20 = "Scanner"

		val node21 = new UniNew
		node21.args = node19
		node21.type = node20

		val node22 = new UniVariableDec
		node22.name = node13
		node22.type = node14
		node22.value = node21

		val node23 = "nextInt"

		val node24 = "sc"

		val node25 = new UniIdent
		node25.name = node24

		val node26 = new UniMethodCall
		node26.methodName = node23
		node26.receiver = node25

		val node27 = "m1"

		val node28 = "int"

		val node29 = "nextInt"

		val node30 = "sc"

		val node31 = new UniIdent
		node31.name = node30

		val node32 = new UniMethodCall
		node32.methodName = node29
		node32.receiver = node31

		val node33 = new UniVariableDec
		node33.name = node27
		node33.type = node28
		node33.value = node32

		val node34 = "set1"

		val node35 = "Set<Integer>"

		val node36 = "HashSet<Integer>"

		val node37 = new UniNew
		node37.type = node36

		val node38 = new UniVariableDec
		node38.name = node34
		node38.type = node35
		node38.value = node37

		val node39 = 0

		val node40 = new UniIntLiteral
		node40.value = node39

		val node41 = "int"

		val node42 = "i"

		val node43 = new UniVariableDec
		node43.value = node40
		node43.type = node41
		node43.name = node42

		val node44 = "i"

		val node45 = new UniIdent
		node45.name = node44

		val node46 = "<"

		val node47 = "m1"

		val node48 = new UniIdent
		node48.name = node47

		val node49 = new UniBinOp
		node49.left = node45
		node49.operator = node46
		node49.right = node48

		val node50 = "++"

		val node51 = "i"

		val node52 = new UniIdent
		node52.name = node51

		val node53 = new UniUnaryOp
		node53.operator = node50
		node53.expr = node52

		val node54 = "add"

		val node55 = "nextInt"

		val node56 = "sc"

		val node57 = new UniIdent
		node57.name = node56

		val node58 = new UniMethodCall
		node58.methodName = node55
		node58.receiver = node57

		val node59 = #[node58 as UniExpr]

		val node60 = "set1"

		val node61 = new UniIdent
		node61.name = node60

		val node62 = new UniMethodCall
		node62.methodName = node54
		node62.args = node59
		node62.receiver = node61

		val node63 = #[node62 as UniExpr]

		val node64 = new UniBlock
		node64.body = node63

		val node65 = new UniFor
		node65.init = node43
		node65.cond = node49
		node65.step = node53
		node65.statement = node64

		val node66 = "m2"

		val node67 = "int"

		val node68 = "nextInt"

		val node69 = "sc"

		val node70 = new UniIdent
		node70.name = node69

		val node71 = new UniMethodCall
		node71.methodName = node68
		node71.receiver = node70

		val node72 = new UniVariableDec
		node72.name = node66
		node72.type = node67
		node72.value = node71

		val node73 = "set2"

		val node74 = "Set<Integer>"

		val node75 = "HashSet<Integer>"

		val node76 = new UniNew
		node76.type = node75

		val node77 = new UniVariableDec
		node77.name = node73
		node77.type = node74
		node77.value = node76

		val node78 = 0

		val node79 = new UniIntLiteral
		node79.value = node78

		val node80 = "int"

		val node81 = "i"

		val node82 = new UniVariableDec
		node82.value = node79
		node82.type = node80
		node82.name = node81

		val node83 = "i"

		val node84 = new UniIdent
		node84.name = node83

		val node85 = "<"

		val node86 = "m2"

		val node87 = new UniIdent
		node87.name = node86

		val node88 = new UniBinOp
		node88.left = node84
		node88.operator = node85
		node88.right = node87

		val node89 = "++"

		val node90 = "i"

		val node91 = new UniIdent
		node91.name = node90

		val node92 = new UniUnaryOp
		node92.operator = node89
		node92.expr = node91

		val node93 = "int"

		val node94 = "j"

		val node95 = "nextInt"

		val node96 = "sc"

		val node97 = new UniIdent
		node97.name = node96

		val node98 = new UniMethodCall
		node98.methodName = node95
		node98.receiver = node97

		val node99 = new UniVariableDec
		node99.type = node93
		node99.name = node94
		node99.value = node98

		val node100 = "!"

		val node101 = "set1"

		val node102 = new UniIdent
		node102.name = node101

		val node103 = "contains"

		val node104 = "j"

		val node105 = new UniIdent
		node105.name = node104

		val node106 = #[node105 as UniExpr]

		val node107 = new UniMethodCall
		node107.receiver = node102
		node107.methodName = node103
		node107.args = node106

		val node108 = new UniUnaryOp
		node108.operator = node100
		node108.expr = node107

		val node109 = "set2"

		val node110 = new UniIdent
		node110.name = node109

		val node111 = "add"

		val node112 = "j"

		val node113 = new UniIdent
		node113.name = node112

		val node114 = #[node113 as UniExpr]

		val node115 = new UniMethodCall
		node115.receiver = node110
		node115.methodName = node111
		node115.args = node114

		val node116 = new UniIf
		node116.cond = node108
		node116.trueStatement = node115

		val node117 = #[node99 as UniExpr, node116 as UniExpr]

		val node118 = new UniBlock
		node118.body = node117

		val node119 = new UniFor
		node119.init = node82
		node119.cond = node88
		node119.step = node92
		node119.statement = node118

		val node120 = "isEmpty"

		val node121 = "set2"

		val node122 = new UniIdent
		node122.name = node121

		val node123 = new UniMethodCall
		node123.methodName = node120
		node123.receiver = node122

		val node124 = "None"

		val node125 = new UniStringLiteral
		node125.value = node124

		val node126 = #[node125 as UniExpr]

		val node127 = "print"

		val node128 = "System"

		val node129 = new UniIdent
		node129.name = node128

		val node130 = "out"

		val node131 = new UniFieldAccess
		node131.receiver = node129
		node131.fieldName = node130

		val node132 = new UniMethodCall
		node132.args = node126
		node132.methodName = node127
		node132.receiver = node131

		val node133 = #[node132 as UniExpr]

		val node134 = new UniBlock
		node134.body = node133

		val node135 = "set2"

		val node136 = new UniIdent
		node136.name = node135

		val node137 = "int"

		val node138 = "i"

		val node139 = "!="

		val node140 = "i"

		val node141 = new UniIdent
		node141.name = node140

		val node142 = "next"

		val node143 = "iterator"

		val node144 = "set2"

		val node145 = new UniIdent
		node145.name = node144

		val node146 = new UniMethodCall
		node146.methodName = node143
		node146.receiver = node145

		val node147 = new UniMethodCall
		node147.methodName = node142
		node147.receiver = node146

		val node148 = new UniBinOp
		node148.operator = node139
		node148.right = node141
		node148.left = node147

		val node149 = " "

		val node150 = new UniStringLiteral
		node150.value = node149

		val node151 = #[node150 as UniExpr]

		val node152 = "print"

		val node153 = "out"

		val node154 = "System"

		val node155 = new UniIdent
		node155.name = node154

		val node156 = new UniFieldAccess
		node156.fieldName = node153
		node156.receiver = node155

		val node157 = new UniMethodCall
		node157.args = node151
		node157.methodName = node152
		node157.receiver = node156

		val node158 = #[node157 as UniExpr]

		val node159 = new UniBlock
		node159.body = node158

		val node160 = new UniIf
		node160.cond = node148
		node160.trueStatement = node159

		val node161 = "i"

		val node162 = new UniIdent
		node162.name = node161

		val node163 = #[node162 as UniExpr]

		val node164 = "print"

		val node165 = "out"

		val node166 = "System"

		val node167 = new UniIdent
		node167.name = node166

		val node168 = new UniFieldAccess
		node168.fieldName = node165
		node168.receiver = node167

		val node169 = new UniMethodCall
		node169.args = node163
		node169.methodName = node164
		node169.receiver = node168

		val node170 = #[node160 as UniExpr, node169 as UniExpr]

		val node171 = new UniBlock
		node171.body = node170

		val node172 = new UniEnhancedFor
		node172.container = node136
		node172.type = node137
		node172.name = node138
		node172.statement = node171

		val node173 = #[node172 as UniExpr]

		val node174 = new UniBlock
		node174.body = node173

		val node175 = new UniIf
		node175.cond = node123
		node175.trueStatement = node134
		node175.falseStatement = node174

		val node176 = "println"

		val node177 = "out"

		val node178 = "System"

		val node179 = new UniIdent
		node179.name = node178

		val node180 = new UniFieldAccess
		node180.fieldName = node177
		node180.receiver = node179

		val node181 = new UniMethodCall
		node181.methodName = node176
		node181.receiver = node180

		val node182 = "close"

		val node183 = "sc"

		val node184 = new UniIdent
		node184.name = node183

		val node185 = new UniMethodCall
		node185.methodName = node182
		node185.receiver = node184

		val node186 = #[node22 as UniExpr, node26 as UniExpr, node33 as UniExpr, node38 as UniExpr, node65 as UniExpr,
			node72 as UniExpr, node77 as UniExpr, node119 as UniExpr, node175 as UniExpr, node181 as UniExpr,
			node185 as UniExpr]

		val node187 = new UniBlock
		node187.body = node186

		val node188 = new UniMethodDec
		node188.args = node7
		node188.methodName = node8
		node188.modifiers = node11
		node188.returnType = node12
		node188.block = node187

		val node189 = #[node188 as UniMemberDec]

		val node190 = new UniClassDec
		node190.className = node1
		node190.modifiers = node3
		node190.members = node189

		node190.evaluate(actual)

		System.err.println(JavaGenerator.generate(actual as UniClassDec))

		evaluate(node190, mapper.parse(JavaGenerator.generate(actual as UniClassDec)))

	}

}
