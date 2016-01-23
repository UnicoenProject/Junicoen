package blockeditor;

import static org.junit.Assert.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import difflib.Delta;
import difflib.DiffUtils;
import difflib.Patch;
import net.unicoen.generator.JavaGeneratorForTurtle;
import net.unicoen.mapper.JavaMapper;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniNode;
import net.unicoen.node.UniProgram;
import net.unicoen.parser.blockeditor.BlockGenerator;
import net.unicoen.parser.blockeditor.BlockMapper;

public class UniToBlockTestUtil {

	public static UniProgram createFileModel(String path){
		JavaMapper mapper = new JavaMapper();
		UniNode dec = mapper.parseFile(path);
		
		return (UniProgram)dec;
	}
	
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
	
	public static void parseTestToBG2(UniProgram fileDec) throws IOException, ParserConfigurationException, TransformerException{
		UniClassDec dec = fileDec.classes.get(0);
		BlockGenerator gen = UniModelMaker.createBlockGenerator2(dec.className);
		gen.parse(fileDec);
	}
	
	public static void outputDiff( List<String> origin, List<String> generated, String outputFilePath) throws IOException{
        Patch patch = DiffUtils.diff(origin, generated);
        FileWriter writer = new FileWriter(outputFilePath);
        for (Delta delta : patch.getDeltas()) {
            writer.write(String.format("[変更前(%d)行目]", delta.getOriginal().getPosition() + 1) + System.lineSeparator());
            for (Object line : delta.getOriginal().getLines()) {
            	writer.write(line.toString() + System.lineSeparator());
            }
            
            writer.write("　↓" + System.lineSeparator());
            
            writer.write(String.format("[変更後(%d)行目]", delta.getRevised().getPosition() + 1) + System.lineSeparator());
            for (Object line : delta.getRevised().getLines()) {
            	writer.write(line.toString() + System.lineSeparator());
            }
            writer.write(System.lineSeparator());
        }
        writer.close();
	}
	
	public static void output(UniProgram model, String className){
		//uni->block
		String blockSource = BlockGenerator.generateBlockSource(model);
		
		//block->uni
		String generatedCode;
		try {
			generatedCode = JavaGeneratorForTurtle.generate(BlockMapper.generate(blockSource));
			List<String> generateSource = Arrays.asList(generatedCode.split(System.lineSeparator()));
			UniToBlockTestUtil.outputDiff(Files.readAllLines(Paths.get("blockeditor/testcases/BlockConvertTest/" + className + ".java")), generateSource, "blockeditor/test/Result" + className + ".txt");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}
	
}
