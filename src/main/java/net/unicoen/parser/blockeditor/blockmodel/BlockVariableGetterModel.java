package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.parser.blockeditor.DOMUtil;

public class BlockVariableGetterModel extends BlockExprModel {

	public BlockVariableGetterModel(Node varDecNode, Document document, Long id) {
		String genusName = "getter" + DOMUtil.getAttribute(varDecNode, BlockElementModel.GENUS_NAME_ATTR);
		String name = DOMUtil.getChildText(varDecNode, BlockElementModel.NAME_NODE);
		// BlockStubノード作成
		Element stubElement = createBlockStubNode(document, name, DOMUtil.getAttribute(varDecNode, BlockElementModel.GENUS_NAME_ATTR));
		// Blockノード作成
		Element blockElement = createVariableBlockNode(document, genusName, name, "data", DOMUtil.getChildNode(varDecNode, BlockElementModel.TYPE_NODE).getTextContent(), id);
		stubElement.appendChild(blockElement);
		this.element = stubElement;
	}

	@Override
	public void setPlugElement(Document document, BlockPlugModel plugInfo){
		DOMUtil.getChildNode(this.element, BlockElementModel.BLOCK_NODE).appendChild(plugInfo.createElemnet(document));
	}

	@Override
	public String getBlockID() {
		return DOMUtil.getAttribute(DOMUtil.getChildNode(this.element, BlockElementModel.BLOCK_NODE), ID_ATTR);
	}

	@Override
	public String getGenusName() {
		return DOMUtil.getAttribute(DOMUtil.getChildNode(this.element, BlockElementModel.BLOCK_NODE),GENUS_NAME_ATTR);
	}

	@Override
	public String getKind() {
		return DOMUtil.getAttribute(DOMUtil.getChildNode(this.element, BlockElementModel.BLOCK_NODE), KIND_ATTR);
	}

	@Override
	public String getType(){
		Node blockElement = DOMUtil.getChildNode(this.element, BlockElementModel.BLOCK_NODE);
		return DOMUtil.getChildNode(blockElement, BlockElementModel.TYPE_NODE).getTextContent();
	}

	public String getConnectorKind(){
		return convertTypeToBlockConnectorType(getType());
	}

	@Override
	public Node getPlugNode(){
		return DOMUtil.getChildNode(DOMUtil.getChildNode(this.element, BlockElementModel.BLOCK_NODE), BlockPlugModel.NODE_NAME);
	}

	@Override
	public Element getBlockElement(){
		return (Element)DOMUtil.getChildNode(this.getElement(), BlockElementModel.BLOCK_NODE);
	}
}
