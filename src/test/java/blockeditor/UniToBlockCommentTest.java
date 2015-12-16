package blockeditor;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniMethodDec;

public class UniToBlockCommentTest {

	@Test
	public void test() throws IOException {
		UniClassDec dec = UniModelMaker.createEmptyClassModel("UniToBlockCommentTest", Lists.newArrayList("Turtle"));
		
		UniMethodDec main = new UniMethodDec("main", Lists.newArrayList("public"), "void", Lists.newArrayList(new UniArg("String[]", "args")), new UniBlock(new ArrayList<>(), null));
		dec.members.add(main);
		
		UniMethodDec start = UniModelMaker.createStartMethod();
		UniBlock block = new UniBlock(new ArrayList<>(), "ほげほげ");
		UniBlock block1 = new UniBlock(new ArrayList<>(), "ほげほげ[close]");
		start.block.body.add(block);
		start.block.body.add(block1);
		
		dec.members.add(start);
		
		UniToBlockTestUtil.parseTest(dec);
	}

}
