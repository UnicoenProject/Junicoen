package blockeditor;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNew;

public class UniToBlockParamTest {

	@Test
	public void test() throws IOException {
		UniClassDec dec = UniModelMaker.createEmptyTurtleClassModel("UniToBlockParam");
		UniMethodDec start = UniModelMaker.createStartMethod();
		start.modifiers = Lists.newArrayList("public", "static", "void");
		start.args = Lists.newArrayList(new UniArg("String[]", "args"));
		
		start.block.body.add(new UniMethodCall(new UniIdent("Turtle"), "startTurtle", Lists.newArrayList(new UniNew("Turtle", new ArrayList<>()), new UniIdent("args"))));
		
		dec.members.add(start);
		
		UniModelMaker.createBlockGenerator(dec.className).parse(dec);
		
		
		
		
	}

}
