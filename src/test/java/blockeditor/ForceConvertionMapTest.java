package blockeditor;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;
import org.xml.sax.SAXException;

import net.unicoen.parser.blockeditor.BlockResolver;

public class ForceConvertionMapTest {

	@Test
	public void test() throws SAXException, IOException {
		BlockResolver resolver = new BlockResolver("blockeditor/blocks/", true);
		
		Map<String, String> map = resolver.getForceConvertionMap();
		
		assertEquals("cui-print[@int]", map.get("System.out.println[@int]"));
		assertEquals("cui-print[@string]", map.get("System.out.println[@string]"));
		assertEquals("cui-print[@object]", map.get("System.out.println[@object]"));
		assertEquals("Math-random[]", map.get("Math.random[]"));
		
		
	}

}
