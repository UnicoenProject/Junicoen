package blockeditor;

import java.io.IOException;

import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniMethodDec;
import net.unicoen.parser.blockeditor.BlockGenerator;

import org.junit.Test;

public class UniToBlockSpecialBlockTest {

	@Test
	public void test() throws IOException {

		UniClassDec spClass = UniToBlockTestUtil.createEmptyClassModel("Special");
		UniMethodDec start = UniToBlockTestUtil.createEmptyMethodDec("start");

		start.block.body.add(UniToBlockTestUtil.createLocalVariable("l", "Long"));
		start.block.body.add(UniToBlockTestUtil.createLocalVariable("i", "int"));

		spClass.members.add(start);



		BlockGenerator gen = UniToBlockTestUtil.createBlockGenerator("UniToBlockSpetial");
		gen.parse(spClass);


	}

}
