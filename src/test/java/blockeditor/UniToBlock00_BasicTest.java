package blockeditor;

import java.io.IOException;

import org.junit.Test;

import net.unicoen.node.UniClassDec;

public class UniToBlock00_BasicTest {

	@Test
	public void test() throws IOException {

		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_00BasicTest.java");
		
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
