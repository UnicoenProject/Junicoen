package blockeditor;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniProgram;

public class CommentTest {

	@Test
	public void test() throws IOException, ParserConfigurationException, TransformerException {
		UniProgram programModel = new UniProgram(Lists.newArrayList(), Lists.newArrayList(), null);
		UniClassDec classDec = new UniClassDec("CommentTest", Lists.newArrayList(), Lists.newArrayList(), Lists.newArrayList("Turtle"), Lists.newArrayList(), null);
		UniMethodDec start = UniModelMaker.createEmptyMethodDec("start");
		UniMethodCall fdCall  =new UniMethodCall(null, "fd", Lists.newArrayList(new UniIntLiteral(50)));
		fdCall.comment="タートルを動かす";
		UniBlock block = new UniBlock();
		block.body = Lists.newArrayList(fdCall);
		block.comment = "カメを動かす[close]";
			
		start.block.body.add(block);
		classDec.members.add(start);
		programModel.classes.add(classDec);
		
		UniToBlockTestUtil.parseTestToBG2(programModel);
		
	}

}
