package blockeditor;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.xml.sax.SAXException;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.MethodResolver;

public class MethodResolverTest {

	@Test
	public void test() {
		BlockResolver resolver;
		try {
			resolver = new BlockResolver("blockeditor/blocks/", true);
			MethodResolver mResolver = resolver.getMehtodResolver();
			
			assertEquals("Turtle-fd[@int]", mResolver.getMethodGenusName("Turtle", "fd[@int]"));
			assertEquals("Turtle-fd[@int]", mResolver.getMethodGenusName("ImageTurtle", "fd[@int]"));
			
			assertEquals("ButtonTurtle-isClicked[]", mResolver.getMethodGenusName("ButtonTurtle", "isClicked[]"));
			
			assertEquals("Turtle-looks[@object]", mResolver.getMethodGenusName("Turtle", "looks[@object]"));
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}

}
