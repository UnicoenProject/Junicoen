package blockeditor;

import java.io.IOException;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNew;
import net.unicoen.node.UniVariableDec;

public class UniToBlock20_CUITest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_20CUITest.java");
		UniMethodDec main = (UniMethodDec) classModel.members.get(0);
		main.args = Lists.newArrayList(new UniArg("String[]", "args"));
		
		UniMethodDec dec = (UniMethodDec) classModel.members.get(1);
		UniVariableDec c = (UniVariableDec) dec.block.body.get(5);
		c.value= new UniNew("Scanner", Lists.newArrayList(new UniFieldAccess(new UniIdent("System"), "in")));
		
		UniVariableDec scanner = (UniVariableDec) dec.block.body.get(8);
		scanner.value= new UniNew("Scanner", Lists.newArrayList(new UniFieldAccess(new UniIdent("System"), "in")));
		
		
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
