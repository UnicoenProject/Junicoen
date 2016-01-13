package blockeditor;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.Test;

import net.unicoen.node.UniFile;

public class UniToBlock00_BasicTest {

	@Test
	public void test() throws IOException, ParserConfigurationException, TransformerException {

		UniFile fileModel = UniToBlockTestUtil.createFileModel("blockeditor/testcases/BlockConvertTest/_00BasicTest.java");
		UniToBlockTestUtil.parseTestToBG2(fileModel);
	}

}
