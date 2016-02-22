package blockeditor;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.Test;
import org.xml.sax.SAXException;

import com.google.common.collect.Lists;

import net.unicoen.mapper.Java8Mapper;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniProgram;
import net.unicoen.parser.blockeditor.BlockGenerator;

public class CommentTest {

	@Test
	public void test() throws IOException, ParserConfigurationException, TransformerException, SAXException {
		UniProgram programModel = new UniProgram(Lists.newArrayList(), Lists.newArrayList(), null);
		UniClassDec classDec = new UniClassDec("CommentTest", Lists.newArrayList(), Lists.newArrayList(), Lists.newArrayList("Turtle"), Lists.newArrayList(), null);
		UniMethodDec start = UniModelMaker.createEmptyMethodDec("start");
		UniMethodCall fdCall  =new UniMethodCall(null, "fd", Lists.newArrayList(new UniIntLiteral(50)));
		Java8Mapper mapper = new Java8Mapper(false);
//		Object model = mapper.parse("/** * プログラム名：円を描くメソッドを作ろう*/ "
//				+ "public class Circle2 extends Turtle{	"
//				+ "public static void main(  String[] args){"
//				+ "Turtle.startTurtle(new Circle2(),args);"
//				+ "}"
//				+"// @(50, 50) [open]"
//				+ "public void start() {"
//				+ "}"
//				+"// @(50, 50) [open]"
//				+ "}"
//				);
		Object model = mapper.parseFile("blockeditor/testcases/BlockConvertTest/_91CommentTest.java");
		BlockGenerator gen = new BlockGenerator(new PrintStream(new File("blockeditor/test/CommentTest.xml")), "blockeditor/blocks/", true);
		gen.generate(model);
		
//		fdCall.afterComment="タートルを動かす";
		UniBlock block = new UniBlock();
		block.body = Lists.newArrayList(fdCall);
//		block.beforeComment = "カメを動かす[close]";
			
		start.block.body.add(block);
		classDec.members.add(start);
		programModel.classes.add(classDec);
		
//		UniProgram model = BlockMapper.generate(BlockGenerator.generateBlockSource(programModel));
		
//		UniClassDec convertedClass = model.classes.get(0);
//		UniMethodDec convertedStart = (UniMethodDec) convertedClass.members.get(0);
//		UniBlock convertedBlock = (UniBlock) convertedStart.block.body.get(0);
//		assertEquals(fdCall.afterComment, convertedBlock.body.get(0).afterComment);
		
	}

}
