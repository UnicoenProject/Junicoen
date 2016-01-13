package blockeditor;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.Test;

import net.unicoen.node.UniFile;

public class UniToBlock11_LogicText {

	@Test
	public void test() throws IOException, ParserConfigurationException, TransformerException {
		UniFile fileModel = UniToBlockTestUtil.createFileModel("blockeditor/testcases/BlockConvertTest/_11LogicTest.java");
		UniToBlockTestUtil.parseTestToBG2(fileModel);
	}

}
