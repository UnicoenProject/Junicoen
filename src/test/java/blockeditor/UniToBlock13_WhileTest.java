package blockeditor;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.Test;

import net.unicoen.node.UniFile;

public class UniToBlock13_WhileTest {

	@Test
	public void test() throws IOException, ParserConfigurationException, TransformerException {
		UniFile fileModel = UniToBlockTestUtil.createFileModel("blockeditor/testcases/BlockConvertTest/_13WhileTest.java");
		UniToBlockTestUtil.parseTestToBG2(fileModel);
	}

}