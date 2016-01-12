package blockeditor;

import java.io.IOException;

import org.junit.Test;

import net.unicoen.node.UniClassDec;

public class UniToBlock14_ForTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_14ForTest.java");
		
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
