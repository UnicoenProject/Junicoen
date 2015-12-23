package blockeditor;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniMethodDec;

public class UniToBlockForTest {

	@Test
	public void test() {
		UniClassDec cDec = UniModelMaker.createEmptyTurtleClassModel("UniToBlockForTest");
		UniMethodDec mDec = UniModelMaker.createEmptyMethodDec("start");

		UniFor uniFor = UniModelMaker.createForTmplate();
		UniBlock block = new UniBlock(new ArrayList<UniExpr>(), "");
		block.body.add(UniModelMaker.createTurtleBasicMethodCall("fd", 50));
		uniFor.statement = block;

		mDec.block.body.add(uniFor);

		cDec.members.add(mDec);

		try {
			UniToBlockTestUtil.parseTest(cDec);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
