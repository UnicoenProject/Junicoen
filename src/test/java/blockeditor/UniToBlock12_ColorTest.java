package blockeditor;

import java.io.IOException;

import org.junit.Test;

import net.unicoen.node.UniClassDec;

public class UniToBlock12_ColorTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_12ColorTest.java");
		
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
