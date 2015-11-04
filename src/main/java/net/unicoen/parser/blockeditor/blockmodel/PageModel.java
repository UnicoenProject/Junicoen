package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class PageModel {
	private String pageName;
	private Element pageNode;

	public static String PAGE_COLOR_TAGNAME = "page-color";
	public static String PAGE_DRAWER_TAGNAME = "page-drawer";
	public static String IN_FULLVIEW_TAGNAME = "page-infullview";
	public static String PAGE_NAME_TAGNAME = "page-name";
	public static String PAGE_WITDH_TAGNAME = "page-width";

	private static String PAGE_COLOR ="40 40 40";
	private static String PAGE_DRAWER ="";
	private static String IN_FULLVIEW_VALUE ="yew";
	private static String PAGE_WIDTH ="1366";

	public static String NODE_NAME = "Page";

	public PageModel(String className, Element blockNode, Document document){
		this.pageName = className;
		initializePageNode(blockNode, document);
	}

	public void initializePageNode(Element blockNode, Document document){
		Element pageElement = document.createElement(NODE_NAME);
		pageElement.setAttribute(PAGE_COLOR_TAGNAME, PAGE_COLOR);
		pageElement.setAttribute(PAGE_DRAWER_TAGNAME, PAGE_DRAWER);
		pageElement.setAttribute(IN_FULLVIEW_TAGNAME, IN_FULLVIEW_VALUE);
		pageElement.setAttribute(PAGE_NAME_TAGNAME, pageName);
		pageElement.setAttribute(PAGE_WITDH_TAGNAME, PAGE_WIDTH);

		pageElement.appendChild(blockNode);
		this.pageNode = pageElement;
	}

	public Element getPageElement(){
		return this.pageNode;
	}

}
