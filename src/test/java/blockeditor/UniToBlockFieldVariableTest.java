package blockeditor;

import static org.junit.Assert.assertEquals;

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
import net.unicoen.parser.blockeditor.blockmodel.BlockClassModel;

public class UniToBlockFieldVariableTest {

	@Test
	public void test() throws IOException, ParserConfigurationException {
		UniClassDec dec = UniToBlockTestUtil.createEmptyClassModel("UniToBlockFieldVarDecTest", Lists.newArrayList("Turtle"));
		UniFieldDec stringdec = UniToBlockTestUtil.createFieldDec("String", "s");
		stringdec.value = new UniStringLiteral("hoge");
		dec.members.add(stringdec);
		dec.members.add(UniToBlockTestUtil.createFieldDec("int", "i"));
		dec.members.add(UniToBlockTestUtil.createFieldDec("double", "d"));
		dec.members.add(UniToBlockTestUtil.createFieldDec("boolean", "b"));
		
		UniMethodDec start = UniToBlockTestUtil.createStartMethod();
		
		start.block.body.add(new UniBinOp("=", new UniIdent("s"), new UniStringLiteral("hoge")));
		start.block.body.add(new UniBinOp("=", new UniIdent("s"), new UniIdent("s")));
		start.block.body.add(new UniBinOp("=", new UniIdent("i"), new UniIntLiteral(1)));
		start.block.body.add(new UniBinOp("=", new UniIdent("i"), new UniIdent("i")));
		start.block.body.add(new UniBinOp("=", new UniIdent("d"), new UniDoubleLiteral(1.0)));
		start.block.body.add(new UniBinOp("=", new UniIdent("d"), new UniIdent("d")));
		start.block.body.add(new UniBinOp("=", new UniIdent("b"), new UniBoolLiteral(true)));
		start.block.body.add(new UniBinOp("=", new UniIdent("b"), new UniIdent("b")));
		dec.members.add(start);
		BlockClassModel blockModel = UniToBlockTestUtil.createBlockClassModel(dec);
		
		assertEquals(blockModel.getFieldVariables().size() + blockModel.getMethods().size(), dec.members.size());
		
		UniToBlockTestUtil.parseTest(dec);
		
	}

}