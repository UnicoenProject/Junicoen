package blockeditor;



import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniVariableDec;
import net.unicoen.parser.blockeditor.BlockGenerator;

import org.junit.Test;

public class UniToBlockBlockTest {

	@Test
	public void test() throws IOException {

		String fileName = "UniToBlockTest";
		String filePath = "blockeditor/test/" + fileName + ".xml";

		UniClassDec dec = new UniClassDec();
		dec.members = new ArrayList<>();

		UniBlock abstractionblock = new UniBlock();
		abstractionblock.body = new ArrayList<>();
		UniVariableDec vdec = new UniVariableDec();
		vdec.name = "i";
		vdec.type = "int";
		abstractionblock.body.add(vdec);

		List<UniExpr> blocks = new ArrayList<>();
		blocks.add(abstractionblock);
		UniBlock block = new UniBlock(blocks,"");
		UniMethodDec method = new UniMethodDec("start", new ArrayList<>(), "void", new ArrayList<>(), block);

		dec.members.add(method);

		dec.className = fileName;

		File file = new File(filePath);
		file.createNewFile();
		PrintStream out = new PrintStream(file);

		BlockGenerator parser = new BlockGenerator(out,"blockeditor/blocks/", true);

		parser.parse(dec);
	}

}
