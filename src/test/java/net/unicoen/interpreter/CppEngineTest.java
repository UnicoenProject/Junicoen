package net.unicoen.interpreter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import net.unicoen.mapper.CPP14Mapper;
import net.unicoen.node.UniNode;

public class CppEngineTest {
	@Test //@Ignore
	public void test1() {
		CppEngine engine = new CppEngine();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		engine.out = new PrintStream(baos);

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
		CPP14Mapper cppMapper = new CPP14Mapper(true);
		Object node = cppMapper.parse(text);
		ExecState  state;
		if(!(node instanceof ArrayList)){
			ArrayList<UniNode> nodes = new ArrayList<UniNode>();
			nodes.add((UniNode) node);
			engine.startStepExecution(nodes);
		}
		else{
			engine.startStepExecution((ArrayList<UniNode>)node);
		}
		//
		for(int i=0;engine.isStepExecutionRunning();++i)
		{
			state = engine.stepExecute();
		}

		try {
			String output = baos.toString("UTF8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test @Ignore
	public void test2() {
		CppEngine engine = new CppEngine();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		engine.out = new PrintStream(baos);
		String text =
				"int main()"+
				"{"+
					"int i=1;"+
					"{int i = 100;i+=20;}"+
					"i+=50;"+
				"}";
		CPP14Mapper cppMapper = new CPP14Mapper(true);
		Object node = cppMapper.parse(text);
		ExecState  state;
		if(!(node instanceof ArrayList)){
			ArrayList<UniNode> nodes = new ArrayList<UniNode>();
			nodes.add((UniNode) node);
			engine.startStepExecution(nodes);
		}
		else{
			engine.startStepExecution((ArrayList<UniNode>)node);
		}
		//
		for(int i=0;engine.isStepExecutionRunning();++i)
		{
			state = engine.stepExecute();
		}

		try {
			String output = baos.toString("UTF8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test @Ignore
	public void test3(){
		CppEngine engine = new CppEngine();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		engine.out = new PrintStream(baos);

		String text =
				"int main()"+
				"{"+
					"double x = 1.0;"
					+ "double e = 0.0000000005;"+
					"int i;"+
					"for(i=0;((x*x-2)<-e) || (e<(x*x-2));i+=1)"+
					"{"+
						"x -= ((x*x)-2) / (2*x);"+
						"int a = 10;"+
						"continue;"+
					"}"+
					"return x;"+
				"}";
		CPP14Mapper cppMapper = new CPP14Mapper(true);
		Object node = cppMapper.parse(text);
		ExecState  state;
		if(!(node instanceof ArrayList)){
			ArrayList<UniNode> nodes = new ArrayList<UniNode>();
			nodes.add((UniNode) node);
			engine.startStepExecution(nodes);
		}
		else{
			engine.startStepExecution((ArrayList<UniNode>)node);
		}
		//
		for(int i=0;engine.isStepExecutionRunning();++i)
		{
			state = engine.stepExecute();
		}

		try {
			String output = baos.toString("UTF8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test @Ignore
	public void test4(){
		CppEngine engine = new CppEngine();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		engine.out = new PrintStream(baos);

		String text =
				"struct Str"+
				"{"+
					"int i;"+
					"double d;"+
				"};"+
//				"int fibonacci(int n) {"+
//					"if(n<2)"+
//						"return n;"+
//					"else "+
//						"return fibonacci(n-1) + fibonacci(n-2);"+
//				"}"+
				"int main()"+
				"{"
					//"int *buf;"+
					//"buf = (int *)malloc( 100 );"+
					//"buf[2] = 2;"+
					//"int a = fibonacci(10);"
					+ "Str str1 = {123, 2.3};"
					+ "str1.i = str1.d;"
					+ "Str str2 = str1;"
					+ "str2.i = 321;"
					+ "Str str3;"
					+ "str3 = str2;"
					+ "return str3;"
				+"}";
		CPP14Mapper cppMapper = new CPP14Mapper(true);
		Object node = cppMapper.parse(text);
		ExecState  state;
		if(!(node instanceof ArrayList)){
			ArrayList<UniNode> nodes = new ArrayList<UniNode>();
			nodes.add((UniNode) node);
			state = engine.startStepExecution(nodes);
		}
		else{
			state = engine.startStepExecution((ArrayList<UniNode>)node);
		}
		//
		for(int i=0;engine.isStepExecutionRunning();++i)
		{
			state = engine.stepExecute();
		}
		state.toString();
		try {
			String output = baos.toString("UTF8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
