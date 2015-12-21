package blockeditor;

import java.io.IOException;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniClassDec;

public class UniToBlock08_CalctTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_08CalcTest.java");
		classModel.superClass = Lists.newArrayList("Turtle");
		UniToBlockTestUtil.parseTestToBG2(classModel);
	}

}
