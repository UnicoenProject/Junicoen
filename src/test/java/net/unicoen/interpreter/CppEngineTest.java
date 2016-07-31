package net.unicoen.interpreter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

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
				"int main()"
				+ "{"
				+ "	int var = 10;"
				+ "	printf(\"値1=%d 値2=%d\\n\", 123, var);"
				+ "	printf(\"値1=%d 値2=%d\\n\", 123, var);"
				+ "	printf(\"値1=%d 値2=%d\\n\", 123, var);"
				+"}";
		exec(text);
	}

	private ExecState exec(String text){
		CppEngine engine = new CppEngine();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		engine.out = new PrintStream(baos);
		CPP14Mapper cppMapper = new CPP14Mapper(true);
		Object node = cppMapper.parse(text);
		ExecState  state = null;
		if(!(node instanceof ArrayList)){
			ArrayList<UniNode> nodes = new ArrayList<UniNode>();
			nodes.add((UniNode) node);
			engine.startStepExecution(nodes);
		}
		else{
			engine.startStepExecution((ArrayList<UniNode>)node);
		}

		for(int i=0;engine.isStepExecutionRunning();++i)
		{
			state = engine.stepExecute();
			String output = baos.toString();
		}
		return state;
	}
}
