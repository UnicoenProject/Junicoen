package blockeditor;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.Test;

import net.unicoen.node.UniProgram;

public class UniToBlock10_VariableTest {

	@Test
	public void test() throws IOException, ParserConfigurationException, TransformerException {
		UniProgram fileModel = UniToBlockTestUtil.createFileModel("blockeditor/testcases/BlockConvertTest/_10VariableTest.java");
//		UniToBlockTestUtil.parseTestToBG2(fileModel);
		UniToBlockTestUtil.output(fileModel, "_10VariableTest");
	}

}
