package blockeditor;

import java.io.IOException;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniReturn;

public class UniToBlock30_MethodTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_30MethodTest.java");
		classModel.superClass = Lists.newArrayList("Turtle");
		
		UniMethodDec main = (UniMethodDec) classModel.members.get(0);
		main.args = Lists.newArrayList(new UniArg("String[]", "args"));
		
		UniMethodDec m1 = (UniMethodDec)classModel.members.get(3);
		m1.args = Lists.newArrayList(new UniArg("int", "x"));
		
		UniMethodDec m2 = (UniMethodDec)classModel.members.get(4);
		m2.args = Lists.newArrayList(new UniArg("int", "a"), new UniArg("boolean", "b"), new UniArg("String", "c"), new UniArg("double", "d"));
		
		UniMethodDec m5 = (UniMethodDec)classModel.members.get(7);
		m5.args = Lists.newArrayList(new UniArg("double", "d"));
		
		UniMethodDec m3 = (UniMethodDec)classModel.members.get(5);
		m3.block.body.set(0, new UniReturn(new UniIntLiteral(3)));
		
		UniMethodDec m4 = (UniMethodDec)classModel.members.get(6);
		m4.block.body.set(2, new UniReturn(new UniIdent("d")));		
		
		
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
