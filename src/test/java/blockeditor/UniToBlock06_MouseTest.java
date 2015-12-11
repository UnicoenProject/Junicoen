package blockeditor;

import java.io.IOException;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniClassDec;

public class UniToBlock06_MouseTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_06MouseTest.java");
		classModel.superClass = Lists.newArrayList("Turtle");
		UniToBlockTestUtil.parseTest(classModel);
	}

}
