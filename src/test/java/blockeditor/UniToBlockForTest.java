package blockeditor;

import java.io.IOException;
import java.util.ArrayList;

import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniMethodDec;

import org.junit.Test;

public class UniToBlockForTest {

	@Test
	public void test() {
		UniClassDec cDec = UniToBlockTestUtil.createEmptyClassModel("UniToBlockForTest");
		UniMethodDec mDec = UniToBlockTestUtil.createEmptyMethodDec("start");

		UniFor uniFor = UniToBlockTestUtil.createForTmplate();
		UniBlock block = new UniBlock(new ArrayList<UniExpr>(), "");
		block.body.add(UniToBlockTestUtil.createTurtleBasicMethodCall("fd", 50));
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
