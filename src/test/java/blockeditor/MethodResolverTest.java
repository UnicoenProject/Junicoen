package blockeditor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.MethodResolver;

public class MethodResolverTest {

	@Test
	public void test() {
		BlockResolver resolver = new BlockResolver("blockeditor/blocks/", true);
		MethodResolver mResolver = resolver.getMehtodResolver();
		
		assertEquals("Turtle-fd[@int]", mResolver.getMethodGenusName("Turtle", "fd[@int]"));
		assertEquals("Turtle-fd[@int]", mResolver.getMethodGenusName("ImageTurtle", "fd[@int]"));
		
		assertEquals("ButtonTurtle-isClicked[]", mResolver.getMethodGenusName("ButtonTurtle", "isClicked[]"));
		
		
	}

}
