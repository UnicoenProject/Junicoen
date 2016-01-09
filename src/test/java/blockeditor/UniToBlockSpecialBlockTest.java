package blockeditor;

import java.io.IOException;

import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniMethodDec;
import net.unicoen.parser.blockeditor.BlockGenerator;

import org.junit.Test;

public class UniToBlockSpecialBlockTest {

	@Test
	public void test() throws IOException {

		UniClassDec spClass = UniModelMaker.createEmptyTurtleClassModel("Special");
		UniMethodDec start = UniModelMaker.createEmptyMethodDec("start");

		start.block.body.add(UniModelMaker.createLocalVariable("l", "Long"));
		start.block.body.add(UniModelMaker.createLocalVariable("i", "int"));

		spClass.members.add(start);



		BlockGenerator gen = UniModelMaker.createBlockGenerator("UniToBlockSpetial");
		gen.parse(spClass);


	}

}
