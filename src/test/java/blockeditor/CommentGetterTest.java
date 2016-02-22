package blockeditor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import net.unicoen.parser.blockeditor.AnnotationCommentGetter;

public class CommentGetterTest {

	@Test
	public void test() {
		
		//location comment getter
		assertEquals("@(100,200)", AnnotationCommentGetter.getCommentLocationComment("hogehhho@(100,200)"));
		assertEquals("@(100,        200)", AnnotationCommentGetter.getCommentLocationComment("hogehhho@(100,        200)"));
		assertEquals("@(100, 200      )", AnnotationCommentGetter.getCommentLocationComment("hogehhho@(100, 200      )"));
		assertEquals("@(     100, 200)", AnnotationCommentGetter.getCommentLocationComment("hogehhho@(     100, 200)"));
		assertEquals("@(100    , 200)", AnnotationCommentGetter.getCommentLocationComment("hogehhho@(100    , 200)"));
		assertEquals("@(100    , 200)", AnnotationCommentGetter.getCommentLocationComment("hogehhho@(100    , 200) hodisafj"));
		assertEquals(AnnotationCommentGetter.NOT_FOUND, AnnotationCommentGetter.getCommentLocationComment("hogehhho(100    , 200) hodisafj"));
		assertEquals("@b(100    , 200)", AnnotationCommentGetter.getBlockLocationComment("hogehhho@b(100    , 200)"));
		
		//location getter
		assertEquals(100, AnnotationCommentGetter.getLocation("hogehhho@(100,        200)").x);
		assertEquals(100, AnnotationCommentGetter.getLocation("hogehhho@b(100,        200)").x);
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
		assertEquals(AnnotationCommentGetter.NOT_FOUND, AnnotationCommentGetter.getOpenClose("hogehhho[open]"));
		assertEquals("[close]", AnnotationCommentGetter.getOpenClose("hogehhho[close]"));
		assertEquals(AnnotationCommentGetter.NOT_FOUND, AnnotationCommentGetter.getCommentLocationComment("hogehhho[oen]"));
		
		//visible annotation
		assertEquals(AnnotationCommentGetter.NOT_FOUND, AnnotationCommentGetter.getVisible("hogehhho[open]@visible"));
		assertEquals(AnnotationCommentGetter.NOT_FOUND, AnnotationCommentGetter.getVisible("hogehhho[open]visible"));
		assertEquals("@invisible", AnnotationCommentGetter.getVisible("hogehhho[open]@invisible"));

		//comment text withoud annotations
		assertEquals("hogehhho[open]", AnnotationCommentGetter.getCommentText("hogehhho[open]@invisible"));
		assertEquals("hogehhho", AnnotationCommentGetter.getCommentText("hogehhho@(100,   200)[close]@invisible"));		
		assertEquals("hogehhho", AnnotationCommentGetter.getCommentText("hogehhho@(100,   200)[close]@invisible@invisible@invisible"));
		assertEquals("hogehhho", AnnotationCommentGetter.getCommentText("hogehhho@(100,   200)[close]@invisible@invisible@invisible"));
		assertEquals("hogehhho", AnnotationCommentGetter.getCommentText("@(100,   200)hogehhho[close]@invisible@invisible@invisible"));
	}

}
