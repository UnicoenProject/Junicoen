package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.parser.blockeditor.DOMUtil;

public class BlockVariableSetterModel extends BlockCommandModel {

	public BlockVariableSetterModel(Document document, Node parentNode, Long id) {
		String genusName = "setter" + DOMUtil.getAttribute(parentNode, BlockElementModel.GENUS_NAME_ATTRIBUTE_TAG);
		String variableName = DOMUtil.getChildTextFromBlockNode(parentNode, BlockElementModel.NAME_NODE_NAME);
		// BlockStubノード作成
		Element blockStubElement = createBlockStubNode(document, variableName, DOMUtil.getAttribute(parentNode, BlockElementModel.GENUS_NAME_ATTRIBUTE_TAG));
		// Blockノード作成
		Element blockElement = createVariableBlockNode(document, genusName, variableName, id);
		blockStubElement.appendChild(blockElement);
		this.element = blockStubElement;
	}

	@Override
	public void addBeforeBlockNode(Document document, String id) {
		Element element = document.createElement("BeforeBlockId");
		element.setTextContent(id);
		DOMUtil.getChildNode(getElement(), BlockElementModel.BLOCK_NODE_NAME).appendChild(element);
	}

	@Override
	public void addAfterBlockNode(Document document, String id) {
		Element element = document.createElement("AfterBlockId");
		element.setTextContent(id);
		DOMUtil.getChildNode(getElement(), "Block").appendChild(element);
	}

	@Override
	public Element getBlockElement(){
		return (Element)DOMUtil.getChildNode(this.getElement(), BlockElementModel.BLOCK_NODE_NAME);
	}
	
}
