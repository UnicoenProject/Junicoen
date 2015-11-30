package blockeditor;

import java.io.IOException;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMethodDec;
import net.unicoen.parser.blockeditor.BlockGenerator;

import org.junit.Test;

public class UniToBlockArgTest {

	@Test
	public void test() throws IOException {
		UniClassDec dec = UniToBlockTestUtil.createEmptyTurtleClassModel("UniToBlockArgTest");

		UniMethodDec start = UniToBlockTestUtil.createEmptyMethodDec("start");
		dec.members.add(start);

		UniMethodDec hoge = UniToBlockTestUtil.createEmptyMethodDec("hoge");
		hoge.args.add(new UniArg("int", "length"));
		dec.members.add(hoge);

		hoge.block.body.add(new UniBinOp("=", new UniIdent("length"), new UniIntLiteral(5)));


		BlockGenerator gen = UniToBlockTestUtil.createBlockGenerator(dec.className);
		gen.parse(dec);

	}

}
