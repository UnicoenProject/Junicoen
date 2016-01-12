package blockeditor;

import java.io.IOException;

import org.junit.Test;

import net.unicoen.node.UniClassDec;

public class UniToBlock15_ListTurtleTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_15ListTurtleTest.java");
		
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
