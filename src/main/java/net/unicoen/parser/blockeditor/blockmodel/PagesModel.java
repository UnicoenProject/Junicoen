package net.unicoen.parser.blockeditor.blockmodel;

import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class PagesModel {

	private Element pagesElement;

	private static String COLLAPSIBLE_PAGES_TAGNAME = "collapsible-pages";
	private static String COLLAPSIBLE_PAGES = "no";

	public PagesModel( List<PageModel> pages, Document document){
		Element pageElement = document.createElement("Pages");
		pageElement.setAttribute(COLLAPSIBLE_PAGES_TAGNAME, COLLAPSIBLE_PAGES);

		for(PageModel page : pages){
			pageElement.appendChild(page.getPageElement());
		}

		this.pagesElement = pageElement;
	}

	public Element getPagesElement(){
		return this.pagesElement;
	}

}
