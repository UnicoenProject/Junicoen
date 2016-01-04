package blockeditor;

import java.io.IOException;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;

public class UniToBlock09_CompareTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_09CompareTest.java");
		classModel.superClass = Lists.newArrayList("Turtle");
		
		UniMethodDec dec = (UniMethodDec) classModel.members.get(1);
		UniBlock block3 = (UniBlock) dec.block.body.get(3);
		UniVariableDec var1 = (UniVariableDec) block3.body.get(3);
		var1.value = new UniUnaryOp("!", new UniMethodCall(new UniIdent("a"), "equals", Lists.newArrayList(new UniIdent("b"))));
		
		UniBlock block4 = (UniBlock) dec.block.body.get(4);
		UniVariableDec var2 = (UniVariableDec) block4.body.get(3);
		var2.value = new UniUnaryOp("!", new UniMethodCall(new UniIdent("a"), "equals", Lists.newArrayList(new UniIdent("b"))));
		
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
