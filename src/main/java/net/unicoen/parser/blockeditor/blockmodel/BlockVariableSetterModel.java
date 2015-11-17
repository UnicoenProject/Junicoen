package net.unicoen.parser.blockeditor.blockmodel;

import net.unicoen.parser.blockeditor.DOMUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockVariableSetterModel extends BlockCommandModel {

	public BlockVariableSetterModel(Element setterElement) {
		this.element = setterElement;
	}

	public void addBeforeBlockNode(Document document, String id) {
		Element element = document.createElement("BeforeBlockId");
		element.setTextContent(id);
		DOMUtil.getChildNode(getElement(), BlockElementModel.BLOCK_NODE_NAME).appendChild(element);
	}

	public void addAfterBlockNode(Document document, String id) {
		Element element = document.createElement("AfterBlockId");
		element.setTextContent(id);
		DOMUtil.getChildNode(getElement(), "Block").appendChild(element);
	}

	public Element getBlockElement(){
		return (Element)DOMUtil.getChildNode(this.getElement(), BlockElementModel.BLOCK_NODE_NAME);
	}
}
