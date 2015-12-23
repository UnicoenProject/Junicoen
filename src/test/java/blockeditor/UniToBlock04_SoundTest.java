package blockeditor;

import java.io.IOException;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniClassDec;

public class UniToBlock04_SoundTest {

	@Test
	public void test() throws IOException {
		UniClassDec classModel = UniToBlockTestUtil.createClassDec("blockeditor/testcases/BlockConvertTest/_04SoundTest.java");
		classModel.superClass = Lists.newArrayList("Turtle");
		UniToBlockTestUtil.parseTest(classModel);
	}

}
