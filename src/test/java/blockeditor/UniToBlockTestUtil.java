package blockeditor;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import net.unicoen.mapper.JavaMapper;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniFile;
import net.unicoen.node.UniNode;
import net.unicoen.parser.blockeditor.BlockGenerator;

public class UniToBlockTestUtil {

	public static UniClassDec createClassDec(String path){
		JavaMapper mapper = new JavaMapper();
		UniNode dec = mapper.parseFile(path);
		
		assertEquals(true, dec instanceof UniClassDec);
		
		return (UniClassDec)dec;
	}
	
	public static void parseTest(UniClassDec cDec) throws IOException{
		BlockGenerator gen = UniModelMaker.createBlockGenerator(cDec.className);
		gen.parse(cDec);
	}
	
	public static void parseTestToBG2(UniClassDec cDec) throws IOException{
		BlockGenerator gen = UniModelMaker.createBlockGenerator2(cDec.className);
		gen.parse(cDec);
	}
	
	public static void parseTestToBG2(UniFile fileDec) throws IOException, ParserConfigurationException, TransformerException{
		UniClassDec dec = fileDec.classes.get(0);
		BlockGenerator gen = UniModelMaker.createBlockGenerator2(dec.className);
		gen.parse(fileDec);
	}
	
}
