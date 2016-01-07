package blockeditor;

import java.io.IOException;

import org.junit.Test;

import net.unicoen.node.UniClassDec;

public class UniToBlock11_LogicText {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_11LogicTest.java");
		
	
		UniToBlockTestUtil.parseTestToBG2(classModel);	
	}

}
