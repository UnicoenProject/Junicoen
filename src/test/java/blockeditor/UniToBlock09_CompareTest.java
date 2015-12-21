package blockeditor;

import java.io.IOException;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniClassDec;

public class UniToBlock09_CompareTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_09CompareTest.java");
		classModel.superClass = Lists.newArrayList("Turtle");
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
