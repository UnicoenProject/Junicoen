package blockeditor;

import java.io.IOException;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniUnaryOp;

public class UniToBlock10_VariableTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_10VariableTest.java");
		classModel.superClass = Lists.newArrayList("Turtle");
		UniMethodDec run = (UniMethodDec)classModel.members.get(1);
		
		run.block.body.set(2, new UniUnaryOp("_++", new UniIdent("i")));
		UniBlock block = (UniBlock)run.block.body.get(5);
		block.body.set(0, new UniUnaryOp("_++", new UniIdent("d")));
		block.body.set(1, new UniUnaryOp("_++", new UniIdent("d")));
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
