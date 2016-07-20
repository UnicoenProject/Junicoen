package net.unicoen.interpreter;

import static net.unicoen.node_helper.Builder.bin;
import static net.unicoen.node_helper.Builder.block;
import static net.unicoen.node_helper.Builder.ident;
import static net.unicoen.node_helper.Builder.list;
import static net.unicoen.node_helper.Builder.lit;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.IntUnaryOperator;

import org.junit.Test;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniLongLiteral;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNode;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;
import net.unicoen.mapper.*;

public class CppEngineTest {
	@Test
	public void test1() {
		CppEngine engine = new CppEngine();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		engine.out = new PrintStream(baos);

		String text = 
				"int main()"+
				"{"+
					"char ca = 'a';"+
					"int a=1,b=2;"+
					"int y=a, *pa = &b;"+
					"*pa = *pa;"+
					"a = b;"+
					"int arr[5] = {1,2,3};"+
					"int a = arr[2];"+
					"a=arr[0];"+
					"arr[4]=6;"+
					"a = 5;"+
					"int c=a+b;"+
				"}";
		CPP14Mapper cppMapper = new CPP14Mapper(true);
		UniMethodDec node = (UniMethodDec) cppMapper.parse(text);
		ExecState state = engine.startStepExecution(node);
		int i = 0;
		for (; engine.isStepExecutionRunning(); ++i) {
			state = engine.stepExecute();
		}

		try {
			String output = baos.toString("UTF8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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
		UniMethodDec node = (UniMethodDec) cppMapper.parse(text);
		ExecState state = engine.startStepExecution(node);
		int i = 0;
		for (; engine.isStepExecutionRunning(); ++i) {
			state = engine.stepExecute();
		}

		try {
			String output = baos.toString("UTF8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void test3(){		
			CppEngine engine = new CppEngine();
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			engine.out = new PrintStream(baos);

			String text = 
					"int main()"+
					"{"+
						"double x = 1.0, e = 0.0000000005;"+
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
			UniMethodDec node 	= (UniMethodDec) cppMapper.parse(text);
			ExecState state = engine.startStepExecution(node);
			int i=0;
			for(;engine.isStepExecutionRunning();++i)
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
}
