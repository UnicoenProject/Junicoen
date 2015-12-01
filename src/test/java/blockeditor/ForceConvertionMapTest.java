package blockeditor;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.google.common.collect.Lists;

import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.parser.blockeditor.DOMUtil;
import net.unicoen.parser.blockeditor.ForceConvertionMap;

public class ForceConvertionMapTest {

	@Test
	public void test() throws SAXException, IOException {
//		BlockResolver resolver = new BlockResolver("blockeditor/blocks/", true);
		
//		Map<String, String> map = resolver.getForceConvertionMap();
//		
//		assertEquals("cui-print[@int]", map.get("System.out.println[@int]"));
//		assertEquals("cui-print[@string]", map.get("System.out.println[@string]"));
//		assertEquals("cui-print[@object]", map.get("System.out.println[@object]"));
//		assertEquals("Math-random[]", map.get("Math.random[]"));
		
		Node node = DOMUtil.getNodeFromXMLFilePath("blockeditor/blocks/force_convertion_list.xml");
		
		ForceConvertionMap map = new ForceConvertionMap(node);
		assertEquals(true, map.isForceConvertionMethod(new UniMethodCall(new UniFieldAccess(new UniIdent("System"), "out"),"println", Lists.newArrayList(new UniStringLiteral("hogehoge")))));
		assertEquals(true, map.isForceConvertionMethod(new UniMethodCall(new UniIdent("Math"),"random", null)));
		
		
		
	}

}
