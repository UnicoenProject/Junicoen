package net.unicoen.parser.blockeditor;

import java.awt.Point;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnnotationCommentGetter {

	public static String NOT_FOUND = "no comment";
	
	public enum REGEXES{
		LOCATION_REGEX("@\\(\\s*[0-9]{1,4}\\s*,\\s*[0-9]{1,4}\\s*\\)"),
		BLOCK_LOCATION_REGEX("@b\\(\\s*[0-9]{1,4}\\s*,\\s*[0-9]{1,4}\\s*\\)"),
		VISIBLE_REGEX("@invisible"),
		OPENCLOSE_REGEX("\\[close\\]"),
		SINGLECOMMENT_REGEX("//"),
		MULTILINE_COMMENT_START_REGEX("/\\*"),
		MULTILINE_COMMENT_END_REGEX("\\*/"),
		;
		private final String text;
		
		private REGEXES(final String text){
			this.text = text;
		}
		
		public String getString(){
			return this.text;
		}
		
	}
	
	public static String getBlockLocationComment(String comment) {
		return getPatternComment(comment, REGEXES.BLOCK_LOCATION_REGEX.text);
	}
	
	public static String getCommentLocationComment(String comment) {
		return getPatternComment(comment, REGEXES.LOCATION_REGEX.text);
	}

	public static String getPatternComment(String comment, String pattern) {
		Pattern pt = Pattern.compile(pattern);
		Matcher m = pt.matcher(comment);

		if (m.find()) {
			return m.group();
		} else {
			return NOT_FOUND;
		}
	}

	public static String getOpenClose(String comment) {
		return getPatternComment(comment, REGEXES.OPENCLOSE_REGEX.text);
	}

	public static String getVisible(String comment) {
		return getPatternComment(comment, REGEXES.VISIBLE_REGEX.text);
	}

	public static Point getLocation(String locationComment) {
		String regex = "[0-9]{1,4}";
		String x = "0";
		String y = "0";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(locationComment);
		if (m.find()) {
			x = m.group();
		}
		if (m.find()) {
			y = m.group();
		}
		return new Point(Integer.valueOf(x), Integer.valueOf(y));
	}

	public static boolean containsOpen(String openCloseComment) {
		String comment = getOpenClose(openCloseComment);
		if (comment.contains("open")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean containsInvisible(String comment) {
		String visibleAnnotation = getVisible(comment);
		if (visibleAnnotation.equals("@invisible")) {
			return true;
		} else {
			return false;
		}
	}

	public static String addEscapeSeaquence(String comment) {
		String result = comment;
		result = result.replaceAll("&", "&amp;");
		result = result.replaceAll("<", "&lt;");
		result = result.replaceAll(">", "&gt;");
		result = result.replaceAll("'", "&apos;");
		result = result.replaceAll("\"", "&quot;");
		return result;
	}

	/**
	 * Block用のコメントテキストを取得する
	 * 
	 * @param text
	 *            コメント文
	 * @return コメント文からBlock用のアノテーションを除いた文字列
	 */
	public static String getCommentText(String text) {
		String result = text;
		for(REGEXES regex: REGEXES.values()){
			result = result.replaceAll(regex.text, "");
		}
		return addEscapeSeaquence(result);
	}

}
