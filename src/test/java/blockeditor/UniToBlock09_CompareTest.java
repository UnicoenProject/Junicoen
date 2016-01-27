package blockeditor;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.Test;

import net.unicoen.node.UniProgram;

public class UniToBlock09_CompareTest {

	@Test
	public void test() throws IOException, ParserConfigurationException, TransformerException {
		UniProgram fileModel = UniToBlockTestUtil.createFileModel("blockeditor/testcases/BlockConvertTest/_09CompareTest.java");
//		UniToBlockTestUtil.parseTestToBG2(fileModel);
		UniToBlockTestUtil.output(fileModel, "_09CompareTest");
	}

}
