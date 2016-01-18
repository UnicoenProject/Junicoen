package blockeditor;

import java.io.IOException;

import org.junit.Test;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMethodDec;
import net.unicoen.parser.blockeditor.BlockGenerator;

public class UniToBlockArgTest {

	@Test
	public void test() throws IOException {
		UniClassDec dec = UniModelMaker.createEmptyTurtleClassModel("UniToBlockArgTest");
		
		UniMethodDec start = UniModelMaker.createEmptyMethodDec("start");
		dec.members.add(start);

		UniMethodDec hoge = UniModelMaker.createEmptyMethodDec("hoge");
		hoge.args.add(new UniArg("int", "length"));
		dec.members.add(hoge);

		hoge.block.body.add(new UniBinOp("=", new UniIdent("length"), new UniIntLiteral(5)));


		BlockGenerator gen = UniModelMaker.createBlockGenerator(dec.className);
		gen.parse(dec);

	}

}
