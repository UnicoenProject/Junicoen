package blockeditor;

import java.io.IOException;

import org.junit.Test;

import net.unicoen.node.UniClassDec;

public class UniToBlock24_HashcodeTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_24HashcodeTest.java");
		
//		UniMethodDec main = (UniMethodDec) classModel.members.get(0);
//		main.args = Lists.newArrayList(new UniArg("String[]", "args"));
//		
//		UniMethodDec run = (UniMethodDec) classModel.members.get(1);
//		UniVariableDec deca = (UniVariableDec) run.block.body.get(4);
//		deca.value = new UniMethodCall(new UniStringLiteral("abc"), "hashCode", Lists.newArrayList());
//		UniVariableDec decb = (UniVariableDec) run.block.body.get(5);
//		decb.value = new UniMethodCall(new UniBinOp("+", new UniStringLiteral("abc"), new UniStringLiteral("def")), "hashCode", Lists.newArrayList());
//		UniVariableDec decc = (UniVariableDec) run.block.body.get(6);
//		decc.value = new UniMethodCall(new UniBinOp("+", new UniIdent("s"), new UniStringLiteral("def")), "hashCode", Lists.newArrayList());
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
