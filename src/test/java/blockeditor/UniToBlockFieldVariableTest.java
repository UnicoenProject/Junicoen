package blockeditor;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniFieldDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniStringLiteral;

public class UniToBlockFieldVariableTest {

	@Test
	public void test() throws IOException, ParserConfigurationException {
		UniClassDec dec = UniModelMaker.createEmptyClassModel("UniToBlockFieldVarDecTest", Lists.newArrayList("Turtle"));
		UniFieldDec stringdec = UniModelMaker.createFieldDec("String", "s");
		stringdec.value = new UniStringLiteral("hoge");
		dec.members.add(stringdec);
		dec.members.add(UniModelMaker.createFieldDec("int", "i"));
		dec.members.add(UniModelMaker.createFieldDec("double", "d"));
		dec.members.add(UniModelMaker.createFieldDec("boolean", "b"));
		
		UniMethodDec start = UniModelMaker.createStartMethod();
		
		start.block.body.add(new UniBinOp("=", new UniIdent("s"), new UniStringLiteral("hoge")));
		start.block.body.add(new UniBinOp("=", new UniIdent("s"), new UniIdent("s")));
		start.block.body.add(new UniBinOp("=", new UniIdent("i"), new UniIntLiteral(1)));
		start.block.body.add(new UniBinOp("=", new UniIdent("i"), new UniIdent("i")));
		start.block.body.add(new UniBinOp("=", new UniIdent("d"), new UniDoubleLiteral(1.0)));
		start.block.body.add(new UniBinOp("=", new UniIdent("d"), new UniIdent("d")));
		start.block.body.add(new UniBinOp("=", new UniIdent("b"), new UniBoolLiteral(true)));
		start.block.body.add(new UniBinOp("=", new UniIdent("b"), new UniIdent("b")));
		dec.members.add(start);
		
		UniToBlockTestUtil.parseTest(dec);
		
	}

}
