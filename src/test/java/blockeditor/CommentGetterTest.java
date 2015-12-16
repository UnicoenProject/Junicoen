package blockeditor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import net.unicoen.parser.blockeditor.AnnotationCommentGetter;

public class CommentGetterTest {

	@Test
	public void test() {
		
		//location comment getter
		assertEquals("@(100,200)", AnnotationCommentGetter.getLocationComment("hogehhho@(100,200)"));
		assertEquals("@(100,        200)", AnnotationCommentGetter.getLocationComment("hogehhho@(100,        200)"));
		assertEquals("@(100, 200      )", AnnotationCommentGetter.getLocationComment("hogehhho@(100, 200      )"));
		assertEquals("@(     100, 200)", AnnotationCommentGetter.getLocationComment("hogehhho@(     100, 200)"));
		assertEquals("@(100    , 200)", AnnotationCommentGetter.getLocationComment("hogehhho@(100    , 200)"));
		assertEquals("@(100    , 200)", AnnotationCommentGetter.getLocationComment("hogehhho@(100    , 200) hodisafj"));
		assertEquals(AnnotationCommentGetter.NOT_FOUND, AnnotationCommentGetter.getLocationComment("hogehhho(100    , 200) hodisafj"));

		//location getter
		assertEquals(100, AnnotationCommentGetter.getLocation("hogehhho@(100,        200)").x);
		assertEquals(200, AnnotationCommentGetter.getLocation("hogehhho@(100,        200)").y);
		assertEquals(100, AnnotationCommentGetter.getLocation("hogehhho@(100, 200      )").x);
		assertEquals(200, AnnotationCommentGetter.getLocation("hogehhho@(100, 200      )").y);
		assertEquals(100, AnnotationCommentGetter.getLocation("hogehhho@(     100, 200)").x);
		assertEquals(200, AnnotationCommentGetter.getLocation("hogehhho@(     100, 200)").y);
		assertEquals(100, AnnotationCommentGetter.getLocation("hogehhho@(100    , 200)").x);
		assertEquals(200, AnnotationCommentGetter.getLocation("hogehhho@(100    , 200)").y);
		assertEquals(100, AnnotationCommentGetter.getLocation("hogehhho@(100    , 200)doifauidsf").x);
		assertEquals(200, AnnotationCommentGetter.getLocation("hogehhho@(100    , 200)fasdkfpjsadk").y);

		//add escapeseaquence test
		assertEquals("これは&lt;ｄｓふぃいあｗｄ&gt;です", AnnotationCommentGetter.addEscapeSeaquence("これは<ｄｓふぃいあｗｄ>です"));
		assertEquals("a &amp; b です", AnnotationCommentGetter.addEscapeSeaquence("a & b です"));
		assertEquals("&apos;注意&apos;", AnnotationCommentGetter.addEscapeSeaquence("'注意'"));
		assertEquals("&quot;テスト&quot;", AnnotationCommentGetter.addEscapeSeaquence("\"テスト\""));

		//openclose annotation
		assertEquals("[open]", AnnotationCommentGetter.getOpenClose("hogehhho[open]"));
		assertEquals(AnnotationCommentGetter.NOT_FOUND, AnnotationCommentGetter.getLocationComment("hogehhho[oen]"));
		
		//visible annotation
		assertEquals("@visible", AnnotationCommentGetter.getVisible("hogehhho[open]@visible"));
		assertEquals(AnnotationCommentGetter.NOT_FOUND, AnnotationCommentGetter.getVisible("hogehhho[open]visible"));

		//comment text withoud annotations
		assertEquals("hogehhho", AnnotationCommentGetter.getCommentText("hogehhho[open]@visible"));
		assertEquals("hogehhho", AnnotationCommentGetter.getCommentText("hogehhho@(100,   200)[close]@visible"));		
		assertEquals("hogehhho", AnnotationCommentGetter.getCommentText("hogehhho@(100,   200)[close]@visible@visible@visible"));
		assertEquals("hogehhho", AnnotationCommentGetter.getCommentText("hogehhho@(100,   200)[close]@visible@visible@visible"));
		assertEquals("hogehhho", AnnotationCommentGetter.getCommentText("@(100,   200)hogehhho[close]@visible@visible@visible"));
	}

}
