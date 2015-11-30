package blockeditor;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import com.google.common.collect.Lists;

import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniVariableDec;
import net.unicoen.parser.blockeditor.BlockGenerator;

public class UniToBlockLibraryMethodTest {

	@Test
	public void test() throws IOException {
		UniClassDec dec = UniToBlockTestUtil.createEmptyClassModel("LibMethodTest", Lists.newArrayList("Object"));
		
		UniMethodDec start = UniToBlockTestUtil.createEmptyMethodDec("start");
		dec.members.add(start);
		
		//Random random = new Random();
		start.block.body.add(UniToBlockTestUtil.createLocalObjectVariableBlockModel("random", "Random"));
		
		//int i;
		start.block.body.add(UniToBlockTestUtil.createLocalVariable("i", "int"));
		
		//i = random.nextInt(10);
		UniMethodCall call = new UniMethodCall(new UniIdent("random"), "nextInt", Lists.newArrayList(new UniIntLiteral(10)));
		start.block.body.add(UniToBlockTestUtil.createVariableSetterModel(new UniIdent("i"), call));
		
		//System.out.println("hogehoge");
		UniMethodCall sysout = new UniMethodCall(new UniFieldAccess(new UniIdent("System"), "out"),"println", Lists.newArrayList(new UniStringLiteral("hogehoge")));
		start.block.body.add(sysout);
		
		
		//d=Math.random();
		UniVariableDec doubleNum = UniToBlockTestUtil.createLocalVariable("d", "double");
		UniMethodCall mathrandom = new UniMethodCall(new UniIdent("Math"), "random", new ArrayList<>());
		doubleNum.value = mathrandom;
		start.block.body.add(doubleNum);		
		
		BlockGenerator gen = UniToBlockTestUtil.createBlockGenerator(dec.className);
		gen.parse(dec);
		
	}

}
