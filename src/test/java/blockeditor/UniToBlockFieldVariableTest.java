package blockeditor;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniClassDec;
import net.unicoen.parser.blockeditor.blockmodel.BlockClassModel;

public class UniToBlockFieldVariableTest {

	@Test
	public void test() throws IOException, ParserConfigurationException {
		UniClassDec dec = UniToBlockTestUtil.createEmptyClassModel("UniToBlockFieldVarDecTest", Lists.newArrayList("Turtle"));
		dec.members.add(UniToBlockTestUtil.createFieldDec("String", "s"));
		dec.members.add(UniToBlockTestUtil.createFieldDec("int", "i"));
		dec.members.add(UniToBlockTestUtil.createFieldDec("double", "d"));
		dec.members.add(UniToBlockTestUtil.createFieldDec("boolean", "b"));
		
		dec.members.add(UniToBlockTestUtil.createStartMethod());
		
		BlockClassModel blockModel = UniToBlockTestUtil.createBlockClassModel(dec);
		
		assertEquals(blockModel.getFieldVariables().size() + blockModel.getMethods().size(), dec.members.size());
		
		UniToBlockTestUtil.parseTest(dec);
		
	}

}
