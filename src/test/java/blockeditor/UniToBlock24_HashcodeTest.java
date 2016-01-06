package blockeditor;

import java.io.IOException;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniVariableDec;

public class UniToBlock24_HashcodeTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_24HashcodeTest.java");
		
		UniMethodDec main = (UniMethodDec) classModel.members.get(0);
		main.args = Lists.newArrayList(new UniArg("String[]", "args"));
		
		UniMethodDec run = (UniMethodDec) classModel.members.get(1);
		UniVariableDec deca = (UniVariableDec) run.block.body.get(4);
		deca.value = new UniMethodCall(new UniStringLiteral("abc"), "hashCode", Lists.newArrayList());
		UniVariableDec decb = (UniVariableDec) run.block.body.get(5);
		decb.value = new UniMethodCall(new UniBinOp("+", new UniStringLiteral("abc"), new UniStringLiteral("def")), "hashCode", Lists.newArrayList());
		UniVariableDec decc = (UniVariableDec) run.block.body.get(6);
		decc.value = new UniMethodCall(new UniBinOp("+", new UniIdent("s"), new UniStringLiteral("def")), "hashCode", Lists.newArrayList());
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
