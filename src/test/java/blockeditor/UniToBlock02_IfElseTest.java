package blockeditor;

import java.io.IOException;

import org.junit.Test;

import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniMethodDec;

public class UniToBlock02_IfElseTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_02IfElseTest.java");
		
		UniMethodDec main = (UniMethodDec) classModel.members.get(0);

		UniToBlockTestUtil.parseTestToBG2(classModel);
		
	}

}
