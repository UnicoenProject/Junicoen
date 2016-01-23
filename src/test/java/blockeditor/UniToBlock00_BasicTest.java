package blockeditor;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.Test;
import org.xml.sax.SAXException;

import net.unicoen.node.UniProgram;

public class UniToBlock00_BasicTest {

	@Test
	public void test() throws IOException, ParserConfigurationException, TransformerException, SAXException {

		UniProgram fileModel = UniToBlockTestUtil.createFileModel("blockeditor/testcases/BlockConvertTest/_00BasicTest.java");
		
		UniToBlockTestUtil.output(fileModel, "_00BasicTest");
	}

}
