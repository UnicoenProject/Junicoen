package blockeditor;

import java.io.IOException;

import org.junit.Test;

import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniWhile;

public class UniToBlock00_BasicTest {

	@Test
	public void test() throws IOException {

		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_00BasicTest.java");
		
		UniMethodDec main = (UniMethodDec) classModel.members.get(0);

		
		UniMethodDec run = (UniMethodDec)classModel.members.get(1);
		UniWhile model = (UniWhile)run.block.body.get(1);
		UniBlock stmt = (UniBlock)model.statement;
		stmt.body.set(2, new UniUnaryOp("_++", new UniIdent("i")));
		
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
