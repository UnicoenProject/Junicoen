package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import net.unicoen.node.UniClassDec;

public class PageModel {
	private String pageName;
	private List<String> superClasses = new ArrayList<>();
	private List<String> interfaces = new ArrayList<>();
	private List<String> modifiers = new ArrayList<>();
	
	private Element pageNode;

	public static String PAGE_COLOR_ATTR = "page-color";
	public static String PAGE_DRAWER_ATTR = "page-drawer";
	public static String IN_FULLVIEW_ATTR = "page-infullview";
	public static String PAGE_NAME_ATTR = "page-name";
	public static String PAGE_WITDH_ATTR = "page-width";

	private static String PAGE_COLOR ="40 40 40";
	private static String PAGE_DRAWER ="";
	private static String IN_FULLVIEW_VALUE ="yew";
	private static String PAGE_WIDTH ="1366";
	
	public static String PAGE_BLOCKS = "PageBlocks";
	public static String NODE_NAME = "Page";
	public static String PAGE_INFO_NODE = "PageInfo";
	public static String SUPER_CLASSES_NODE = "SuperCasses";
	public static String SUPERCLASS_NAME_NODE = "ClassName";
	
	public static String INTERFASES_NODE = "Interfaces";
	public static String INTERFASE_NAME_NODE = "InterfaceName";

	public static String MODIFIERS_NODE = "Modifiers";
	public static String MODIFIER_NODE = "Modifier";
//	private String headerComment = "";

	public PageModel(UniClassDec classDec, Element blockNode, Document document){
		this.pageName = classDec.className;
		this.superClasses = classDec.superClass;
		this.interfaces = classDec.interfaces;
		this.modifiers = classDec.modifiers;
		
		initializePageNode(blockNode, document);
	}

	public void initializePageNode(Element blockNode, Document document){
		Element pageElement = document.createElement(NODE_NAME);
		pageElement.setAttribute(PAGE_COLOR_ATTR, PAGE_COLOR);
		pageElement.setAttribute(PAGE_DRAWER_ATTR, PAGE_DRAWER);
		pageElement.setAttribute(IN_FULLVIEW_ATTR, IN_FULLVIEW_VALUE);
		pageElement.setAttribute(PAGE_NAME_ATTR, pageName);
		pageElement.setAttribute(PAGE_WITDH_ATTR, PAGE_WIDTH);
		
		pageElement.appendChild(createPageInfoElement(document));
		
		pageElement.appendChild(blockNode);
		this.pageNode = pageElement;
	}
	
	public Element createPageInfoElement(Document document){
		Element pageInfo = document.createElement(PAGE_INFO_NODE);
		Element parentClasses = document.createElement(SUPER_CLASSES_NODE);

		if(superClasses != null){
			for(String superClass : superClasses){
				Element element = document.createElement(SUPERCLASS_NAME_NODE);
				element.setTextContent(superClass);
				parentClasses.appendChild(element);
			}			
		}
		
		Element interfaces =  document.createElement(INTERFASES_NODE);
		if(this.interfaces != null){
			for(String interfaceName : this.interfaces){
				Element element = document.createElement(INTERFASE_NAME_NODE);
				element.setTextContent(interfaceName);
				interfaces.appendChild(element);
			}			
		}
		
		Element modifiers =  document.createElement(MODIFIERS_NODE);
		if(this.modifiers != null){
			for(String modifier : this.modifiers){
				Element element = document.createElement(MODIFIER_NODE);
				element.setTextContent(modifier);
				modifiers.appendChild(element);
			}			
		}
		
		pageInfo.appendChild(parentClasses);
		pageInfo.appendChild(interfaces);
		pageInfo.appendChild(modifiers);
		
		return pageInfo;
	}

	public Element getPageElement(){
		return this.pageNode;
	}

}
