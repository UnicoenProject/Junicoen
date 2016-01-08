package blockeditor;

import java.io.IOException;

import org.junit.Test;

import net.unicoen.node.UniClassDec;

public class UniToBlock07_EmptyBlockTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_07EmptyBlockTest.java");
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
