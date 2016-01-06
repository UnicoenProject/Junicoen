package blockeditor;

import java.io.IOException;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;

public class UniToBlock02_IfElseTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_02IfElseTest.java");
		
		UniMethodDec main = (UniMethodDec) classModel.members.get(0);
		main.args = Lists.newArrayList(new UniArg("String[]", "args"));
		UniMethodCall startTurtle = (UniMethodCall)main.block.body.get(0);
		startTurtle.args.add(new UniIdent("args"));
		UniToBlockTestUtil.parseTestToBG2(classModel);
		
	}

}
