package blockeditor;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Calendar;
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
	
	public static File createUTFDummyFile(File srcfile){
		File tmpSrcFile = new File(srcfile.getParent() + "/" + ".tmp" + srcfile.getName());
		try {
			FileInputStream fs = new FileInputStream(srcfile);
			BufferedReader reader = new BufferedReader(new InputStreamReader(fs, "SJIS"));

			FileOutputStream fo = new FileOutputStream(tmpSrcFile);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fo, "UTF-8"));
			String convertedText = "";
			String line = reader.readLine();
			while(line != null){
				convertedText += new String(line.getBytes("UTF-8")) + System.lineSeparator();
				line = reader.readLine();
			}
			bw.write(convertedText);
			reader.close();
			bw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return tmpSrcFile;
	}
	
	
	public static void parseTestToBG2(UniProgram fileDec) throws IOException, ParserConfigurationException, TransformerException{
		UniClassDec dec = fileDec.classes.get(0);
		BlockGenerator gen = UniModelMaker.createBlockGenerator2(dec.className);
		gen.parse(fileDec);
	}
	
	public static void outputDiff( List<String> origin, List<String> generated, String outputFilePath) throws IOException{
        Patch patch = DiffUtils.diff(origin, generated);
        FileWriter writer = new FileWriter(outputFilePath);
        Calendar calender = Calendar.getInstance();
        writer.write(calender.get(Calendar.HOUR_OF_DAY) +"時"+ calender.get(Calendar.MINUTE) + "分"+  System.lineSeparator());
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
			System.out.println(generatedCode);
			List<String> generateSource = Arrays.asList(generatedCode.split(System.lineSeparator()));
			UniToBlockTestUtil.outputDiff(Files.readAllLines(Paths.get("blockeditor/testcases/BlockConvertTest/" + className + ".java")), generateSource, "blockeditor/test/Result" + className + ".txt");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}
	
	public static void output(UniProgram model, String className, String root, String originSourceRoot){
		//uni->block
		String blockSource = BlockGenerator.generateBlockSource(model);
		
		//block->uni
		String generatedCode;
		try {
			generatedCode = JavaGeneratorForTurtle.generate(BlockMapper.generate(blockSource));
			List<String> generateSource = Arrays.asList(generatedCode.split(System.lineSeparator()));
			UniToBlockTestUtil.outputDiff(Files.readAllLines(Paths.get(originSourceRoot + className + ".java")), generateSource, root + className + ".txt");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}
	
}
