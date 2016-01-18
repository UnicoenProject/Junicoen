package blockeditor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNew;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniVariableDec;

public class UniToBlockReturnTest {

	@Test
	public void test() throws IOException {
		UniClassDec dec = UniModelMaker.createEmptyTurtleClassModel("UniToBlockReturnTest");
		List<UniExpr> body = new ArrayList<>();
		body.add(new UniVariableDec(Lists.newArrayList(), "Turtle", "t", new UniNew("Turtle", Lists.newArrayList())));
		body.add(new UniReturn(new UniMethodCall(new UniIdent("t"), "getX", Lists.newArrayList())));
		UniMethodDec getX = new UniMethodDec("hoge", Lists.newArrayList("public"), "int", Lists.newArrayList(), new UniBlock(body, ""));
		
		dec.members.add(getX);
		
		UniToBlockTestUtil.parseTest(dec);
		
		
	}

}
