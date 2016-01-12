package blockeditor;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.Test;

import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniFile;
import net.unicoen.node.UniNamespace;

public class UniToBlock00_BasicTest {

	@Test
	public void test() throws IOException, ParserConfigurationException, TransformerException {

		UniFile file = new UniFile(new ArrayList<>(), new ArrayList<>(), new UniNamespace());
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_00BasicTest.java");
		file.classes.add(classModel);
		
		UniToBlockTestUtil.parseTestToBG2(file);
	}

}
