package blockeditor;

import java.io.IOException;

import org.junit.Test;

import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniMethodDec;

public class UniToBlock20_CUITest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_20CUITest.java");
		UniMethodDec run = (UniMethodDec)classModel.members.get(1);
		UniToBlockTestUtil.parseTestToBG2(classModel);
		
	}

}
