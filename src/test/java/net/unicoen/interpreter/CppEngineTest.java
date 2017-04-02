package net.unicoen.interpreter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import net.unicoen.mapper.CPP14Mapper;
import net.unicoen.node.UniNode;

public class CppEngineTest {
	@Test @Ignore
	public void test() {
		String text =""
//+		"#include<stdio.h>"
+"		int recursiveToThree(int n){"
+"		    printf(\"%d回目\\n\", n + 1);"
+"		    if(n < 3){"
+"		        int r = recursiveToThree(n + 1);"
		+"		        n = r;"
		+"   }"
		+"    return n;"
		+"}"
		+"int main(){"
+"		    int arr[5] = {1, 2, 3};"//配列変数の例

+"		    int* ptr = &arr[2];"//ポインタ変数の例
+"		    *ptr = 5;"

//+"		    //メモリの動的確保の例"
+"		    int* d_arry = malloc(sizeof(int) * 3);"

//+"		    //動的な2次元配列の例"
+"		    int* pd_arr[2];"
+"		    pd_arr[0] = malloc(sizeof(int) * 2);"
+"		    pd_arr[1] = malloc(sizeof(int) * 2);"

+"		    printf(\"Hello,world!\\n\");"
//標準出力の例"
//メモリリークの例
+"		    free(pd_arr[0]);"
+"		    return 0;"
+"		}";
		exec(text);
		String path = System.getProperty("user.dir");
        System.out.println(path);
	}
	@Test @Ignore
	public void test1() {
		String text =
				"int main()"+
				"{"+
					"char ca = 'a';"+
					"int a=1;"
					+ "int b=2;"+
					"int *pa = &b;"+
					"*pa = *pa;"+
					"a = b;"+
					"int arr[5] = {1,2,3};"+
					"a = 2[arr];"+
					"a=arr[0];"+
					"arr[4]=6;"+
					"a = 5;"+
					"int c=a+b;"+
				"}";
		exec(text);
	}

	@Test @Ignore
	public void test2() {
		String text =
				"int main()"+
				"{"+
					"int i=1;"+
					"{int i = 100;i+=20;}"+
					"i+=50;"+
				"}";
		exec(text);
	}

	@Test @Ignore
	public void test3(){
		String text =
				"int main()"+
				"{"+
					"double x = 1.0;"
					+ "double e = 0.0000000005;"+
					"int i;"+
					"for(i=0;e<fabs(x*x-2);i+=1)"+
					"{"+
						"x -= ((x*x)-2) / (2*x);"+
					"}"
					+ "printf(\"sqrt(2)=%f\\n\", x);"+

					"return x;"+
				"}";
		exec(text);
	}

	@Test @Ignore
	public void test4(){
		String text =
//				"struct Str"+
//				"{"+
//					"int i;"+
//					"double d;"+
//				"};"+
				"int fibonacci(int n) {"+
					"if(n<2)"+
						"return n;"+
					"else "+
						"return fibonacci(n-1) + fibonacci(n-2);"+
				"}"+
				"int main()"+
				"{"
					//"int *buf;"+
					//"buf = (int *)malloc( 100 );"+
					//"buf[2] = 2;"+
					+"int a = fibonacci(10);"
					+ "return a;"
//					+ "Str str1 = {123, 2.3};"
//					+ "str1.i = str1.d;"
//					+ "Str str2 = str1;"
//					+ "str2.i = 321;"
//					+ "Str str3;"
//					+ "str3 = str2;"
//					+ "return str3;"
				+"}";
		exec(text);
	}

	@Test @Ignore
	public void test5() {
		String text =
				"int f1(){}"
				+ "int f2(){}"
				+ "int f3(){}"
				+ "int a = 3,b=5;"
				+ "int main()"
				+ "{"
				+ " int i;"
				+ "	int* p;"
				+ "	p = malloc(sizeof(int)*10);"
				+ "	for(i=a;i<10;i+=1){"
				+ "		p[i]=i*i;"
				+ "		printf(\"p[i]=%d\\n\", p[i]);"
				+ " }"
				+ "	return a;"
				+"}";
		exec(text);
	}

	@Test @Ignore
	public void test6() {
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main()"
				+ "{"
				+ "	int* p=malloc(sizeof(int)*3);"
				+ "	p=malloc(sizeof(int)*3);"
				+ "	int i;"
				+ "	int* arr[3];"
				+ "	for(i=0;i<3;i++){"
				+ "		arr[i]=malloc(sizeof(int)*3);"
				+ "	}"
				+ "}";
		exec(text);
	}
	@Test @Ignore
	public void test7() {
		String text = ""
				//+ "#include <stdio.h>"
				+ "void Hanoi(int n,char from,char work,char dest)"
				+ "{"
				+ "	if(n>=2) Hanoi(n-1,from,dest,work);"
				+ "	printf(\"%d を %c から %c へ\\n\",n,from,dest);"
				+ "	if(n>=2) Hanoi(n-1,work,from,dest);"
				+ "}"
				+ "int main()"
				+ "{"
				+ "	Hanoi(4,'A','B','C');"
				+ "}";
		exec(text);
	}

	@Test @Ignore
	public void test8() {
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main()"
				+ "{"
				+ "	char moji;"
				+ "	moji = 'B';"
				+ "	printf(\"%c\\n\", moji);"
				+ "	return 0;"
				+ "}";
		exec(text);
	}

	@Test @Ignore
	public void test9() {
		String text = ""
				+ "int main()"
				+ "{"
//				+ " char c1 = 300;"
//				+ " char c2 = 150;"
//				+ " char c3 = 120;"
//				+ " char c4 = -120;"
//				+ " char c5 = -150;"
//				+ " char c6 = -300;"
//				+ "	unsigned char uc1 = 300;"
//				+ "	unsigned char uc1 = 150;"
//				+ "	unsigned char uc2 = 120;"
//				+ "	unsigned char uc3 = -120;"
//				+ "	unsigned char uc4 = -150;"
				+ "	unsigned char uc1 = -300;"
				+ "	short s = 20000;"
				+ "	int i = s;"
				+ "	float f = 1.5;"
				+ "	double d=2;"
				+ "	double fd = f + d;"
				+ "	return 1;"
				+ "}";
		exec(text);
	}

	@Test @Ignore
	public void test10(){
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main() {"
				+ "int a = 8;"
				+ "int b = 7;"
				+ "int c = a + b;"
				+ "printf(\"a + b = %d\\n\", c);"
				+ "c=a*b;"
				+ "printf(\"a * b = %d\\n\", c);"
				+ "float x, y, z;"
				+ "x = 7.1;"
				+ "y = 3.6;"
				+ "z = x * y;"
				+ "printf(\"x * y = %f\\n\", z);"
				+ "z = x / y;"
				+ "printf(\"x / y = %f\\n\", z);"
				+ "return 0;"
				+ "}";
		/*
		 *  a + b = 15
		 *  a * b = 56
		 *  x * y = 25.560000
		 *  x / y = 1.972222
		 */
		exec(text);
	}

	@Test @Ignore
	public void test11(){
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main() {"
				+ "int a, b;"
				+ "a = 1;"
				+ "b = 2;"
				+ "a += b;"
				+ "printf(\"a = %d\\n\", a);"
				+ "a -= b;"
				+ "printf(\"a = %d\\n\", a);"
				+ "float x, y;"
				+ "x = 3.3;"
				+ "y = 5.4;"
				+ "x *= y;"
				+ "printf(\"x = %f\\n\", x);"
				+ "x /= y;"
				+ "printf(\"x = %f\\n\", x);"
				+ "return 0;"
				+ "}";
		/*
		 *  a  = 3
		 *  a  = 1
		 *  x = 17.82
		 *  x = 3.3
		 */
		exec(text);
	}

	@Test @Ignore
	public void test112() {
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main()"
				+ "{"
				+ "	char moji;"
				+ "	moji = 'B';"
				+ "	printf(\"%c\\n\", moji);"
				+ "	return 0;"
				+ "}";
		exec(text);
	}

	@Test @Ignore
	public void test12(){
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main() {"
				+ "	char mojiretu[5] = {'A','B','C','0'};"
				+ "	printf(\"%s\\n\", mojiretu);"
				+ "	return 0;"
				+ "}";
		exec(text);
	}

	@Test @Ignore
	public void test13(){
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main() {"
				+ "	char mojiretu[] = \"ABCD\";"
				+ "	printf(\"%s\\n\", mojiretu);"
				+ "	return 0;"
				+ "}";
		exec(text);
	}

	@Test @Ignore
	public void test14(){
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main() {"
				+ "	char mojiretu[5] = \"ABCD\";"//UniVariableDecにArrayLengthが実装されないと不可能
				+ "	printf(\"%s\\n\", mojiretu);"
				+ "	return 0;"
				+ "}";
		exec(text);
	}

	@Test @Ignore
	public void test15(){
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main() {"
				+ "	char mojiretu[] = \"日本語のテストだよ\";"//UniVariableDecにArrayLengthが実装されないと不可能
				+ "	printf(\"%s\\n\", mojiretu);"
				+ "	return 0;"
				+ "}";
		exec(text);
	}

	@Test// @Ignore
	public void test16(){
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main() {"
				+ " FILE* fp;"
				+ " fp = fopen(\"sample.txt\", \"r\");"//配列変数の例"
				+ " while( (c = fgetc( fp )) != -1 )"
				+ "		printf( \"%c\", c );"
				+ "	return 0;"
				+ "}";
		exec(text);
	}
	@Test @Ignore
	public void test17(){
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main() {"
				+ "	int i=1;"
				+ " char c = 48;"
				+ " short s = 1000;"
				+ " long l = 10000;"
				+ " float f = 1.5;"
				+ " double d = 3.6;"
				+ "	return 0;"
				+ "}";
		exec(text);
	}
	@Test @Ignore
	public void test18(){
		String text = "int main(){"
			+"int arr3[] = {19, 20, 21};"
			+"int* ptr = &arr3[1];"
			+ "*ptr = 5;"
			+"int data[10];"
			+"int arr5[5] = {1};"
			+"char str6[6] = \"aiueo\";"
			+"int data104[10][4];"
			+"	int arr53[5][3] = {{1},{3}};"
			+"	int array35[3][5] = {"
	   		+" {  1,  2,  3,  4,  5, },"
	    	+ "{  2,  4,  6,  8, 10, },"
	   		+" {  3,  6,  9, 12, 15, },"
			+"};"
//	+"int array[][] = {"//駄目
//	  +"  {  1,  2,  3,  4,  5, },"
//	    +"{  2,  4,  6,  8, 10, },"
//+"		    {  3,  6,  9, 12, 15, },"
//+"	};"
+"int a[][2][3] ={{{ 0, 1 },{ 2, 3 }},{{ 4, 5 },{ 6, 7 }}};"
+"	int arrayn5[][5] = {"
+"    {  1,  2,  3,  4,  5, },"
+"  {  2,  4,  6,  8, 10, },"
+"{  3,  6,  9, 12, 15, },"
+"		};"
+"		int arraynn5[][5] = {"
+"	    {  1,  2,  3,  4,  5, },"
+"    {  2,  4,  6,  8, 10, },"
+"  {  3,  6,  9, 12, 15, },"
+"{  4,  8, 12, 16, 20, },"
+"		};"
		    + "return 0;"
		    + "}";
		exec(text);
	}

	private List<UniNode> flatten(List<Object> list){
		List<UniNode> nodes = new ArrayList<UniNode>();
		for(Object element : list){
			if(element instanceof UniNode){
				nodes.add((UniNode)element);
			}
			else{
				List<UniNode> l = flatten((List<Object>) element);
				for(UniNode node : l){
					nodes.add(node);
				}
			}
		}
		return nodes;
	}
	private ExecState exec(String text){
		CppEngine engine = new CppEngine();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		engine.out = new PrintStream(baos);
		CPP14Mapper cppMapper = new CPP14Mapper(true);
		Object node = cppMapper.parse(text);
		ExecState  state = null;
		List<UniNode> nodes = null;
		if(node instanceof List){
			nodes = flatten((List<Object>) node);
		}
		else{
			nodes = new ArrayList<UniNode>();
			nodes.add((UniNode) node);
		}
		engine.startStepExecution((ArrayList<UniNode>) nodes);
		for(int i=0;engine.isStepExecutionRunning();++i)
		{
			state = engine.stepExecute();
		}
		String output = baos.toString();
		if(!output.isEmpty())
			System.out.println(output);
		return state;
	}
}
