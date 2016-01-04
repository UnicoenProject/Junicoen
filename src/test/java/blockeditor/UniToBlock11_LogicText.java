package blockeditor;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;

public class UniToBlock11_LogicText {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_11LogicTest.java");
		classModel.superClass = Lists.newArrayList("Turtle");
		
		UniMethodDec main = (UniMethodDec) classModel.members.get(0);
		main.args = Lists.newArrayList(new UniArg("String[]", "args"));
		
		UniMethodDec run = (UniMethodDec)classModel.members.get(1);
		UniBlock block = (UniBlock)run.block.body.get(0);
		block.body.set(4, new UniVariableDec(new ArrayList<>(), "boolean", "b5", new UniUnaryOp("!", new UniIdent("b1"))));
		block.body.set(5, new UniVariableDec(new ArrayList<>(), "boolean", "b6", new UniBinOp("&&", new UniUnaryOp("!", new UniIdent("b1")), new UniIdent("b2"))));
		block.body.set(6, new UniVariableDec(new ArrayList<>(), "boolean", "b7", new UniUnaryOp("!", new UniBinOp("&&", new UniIdent("b1"), new UniIdent("b2")))));
		block.body.set(7, new UniVariableDec(new ArrayList<>(), "boolean", "b8", new UniUnaryOp("!", new UniUnaryOp("!", new UniIdent("b1")))));
		block.body.set(8, new UniVariableDec(new ArrayList<>(), "boolean", "b9", new UniUnaryOp("!", new UniUnaryOp("!", new UniBinOp("&&", new UniIdent("b1"), new UniIdent("b2"))))));
		block.body.set(9, new UniIf(new UniUnaryOp("!", new UniUnaryOp("!", new UniBinOp("&&", new UniUnaryOp("!", new UniIdent("b1")), new UniIdent("b2")))), null, null));
		UniToBlockTestUtil.parseTestToBG2(classModel);	
	}

}
