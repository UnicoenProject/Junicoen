package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.parser.blockeditor.DOMUtil;

public class BlockVariableSetterModel extends BlockCommandModel {

	public static String GENUS_HEADER = "setter";
	
	public BlockVariableSetterModel(Document document, Node parentNode, Long id) {
		String genusName = GENUS_HEADER + DOMUtil.getAttribute(parentNode, BlockElementModel.GENUS_NAME_ATTR);
		String variableName = DOMUtil.getChildTextFromBlockNode(parentNode, BlockElementModel.NAME_NODE);
		// BlockStubノード作成
		Element blockStubElement = createBlockStubNode(document, variableName, DOMUtil.getAttribute(parentNode, BlockElementModel.GENUS_NAME_ATTR));
		// Blockノード作成
		Element blockElement = createVariableBlockNode(document, genusName, variableName, id);
		blockStubElement.appendChild(blockElement);
		this.element = blockStubElement;
	}

	@Override
	public void addBeforeBlockNode(Document document, String id) {
		Element element = document.createElement(BlockElementModel.BEFOREBLOCKID_NODE);
		element.setTextContent(id);
		getBlockElement().appendChild(element);
	}

	@Override
	public void addAfterBlockNode(Document document, String id) {
		Element element = document.createElement(BlockElementModel.AFTERBLOCKID_NODE);
		element.setTextContent(id);
		getBlockElement().appendChild(element);
	}

	@Override
	public Element getBlockElement(){
		return (Element)DOMUtil.getChildNode(this.getElement(), BlockElementModel.BLOCK_NODE);
	}
	
}
