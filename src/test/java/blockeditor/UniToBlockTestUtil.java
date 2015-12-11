package blockeditor;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import net.unicoen.mapper.JavaMapper;
import net.unicoen.node.UniClassDec;
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
		BlockGenerator gen = UniModelMaker.createBlockGenerator(cDec.className + "Test");
		gen.parse(cDec);
	}
	
}
