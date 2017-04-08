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
	public void fgetc() {
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main()"
				+ "{"
                + " FILE* fp;"
                + " char c;"
                + " fp = fopen(\"sample.txt\", \"r\");"//配列変数の例"
                + " while( (c = fgetc( fp )) != -1 )"
                + "        printf( \"%c\", c );"
				+ "}";
		exec(text);
	}

	@Test @Ignore
	public void fgets() {
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main()"
				+ "{"
                + " FILE* fp;"
                + " char buf[256]={0};"
                + " fp = fopen(\"sample.txt\", \"r\");"//配列変数の例"
                + " while( fgets(buf,256,fp) != NULL )"
                + "        printf(\"%s\",buf);"
				+ "}";
		exec(text);
	}

	@Test @Ignore
	public void fputc() {
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main()"
				+ "{"
                + " FILE* fp;"
                + " fp = fopen(\"fputctest.txt\", \"w\");"//配列変数の例"
                + " fputc('w',fp);"
				+ "}";
		exec(text);
	}

	@Test
	public void fput1() {
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main()"
				+ "{"
                + " FILE* fp;"
                + " char* str = \"efghi\";"
                + " fp = fopen(\"fputstest1.txt\", \"w\");"//配列変数の例"
                + " fputs(str,fp);"
				+ "}";
		exec(text);
	}

	@Test
	public void fput2() {
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main()"
				+ "{"
                + " FILE* fp;"
                + " fp = fopen(\"fputstest2.txt\", \"w\");"//配列変数の例"
                + " fputs(\"vwxyz\",fp);"
				+ "}";
		exec(text);
	}

	@Test
	public void scanf() {
		String text = ""
				//+ "#include <stdio.h>"
				+ "int main()"
				+ "{"
                + " char moji[1000];"
                + " printf(\"文字列を入力してください。\\n\");"//配列変数の例"
                + " scanf(\"%s\", moji);"
                + "	printf(\"%s\\n\", moji);"
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
