package blockeditor;

import java.io.IOException;

import org.junit.Test;

import net.unicoen.node.UniClassDec;

public class UniToBlock02_TurtleTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_02TurtleTest.java");
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
