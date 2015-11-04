package net.unicoen.parser.blockeditor.blockmodel;

import net.unicoen.node.UniIdent;
import net.unicoen.parser.blockeditor.DOMUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockVariableGetterModel extends BlockExprModel {

	public BlockVariableGetterModel(UniIdent ident, Node varDecNode, Document document, Long id) {
		String genusName = "getter";
		genusName += DOMUtil.getAttribute(varDecNode, "genus-name");
		// BlockStubノード作成
		Element stubElement = createBlockStubNode(document, ident.name, DOMUtil.getAttribute(varDecNode, "genus-name"));
		// Blockノード作成
		Element blockElement = createVariableBlockNode(document, genusName, ident.name, "data", DOMUtil.getChildNode(varDecNode, "Type").getTextContent(), id);
		stubElement.appendChild(blockElement);
		this.element = stubElement;
	}

	public void setPlugElement(Document document, PlugInfo plugInfo){
		DOMUtil.getChildNode(this.element, BlockElementModel.BLOCK_NODE_NAME).appendChild(plugInfo.createElemnet(document));
	}

	public String getBlockID() {
		return DOMUtil.getAttribute(DOMUtil.getChildNode(this.element, BlockElementModel.BLOCK_NODE_NAME), ID_ATTRIBUTE_TAG);
	}

	public String getGenusName() {
		return DOMUtil.getAttribute(DOMUtil.getChildNode(this.element, BlockElementModel.BLOCK_NODE_NAME),GENUS_NAME_ATTRIBUTE_TAG);
	}

	public String getKind() {
		return DOMUtil.getAttribute(DOMUtil.getChildNode(this.element, BlockElementModel.BLOCK_NODE_NAME), KIND_ATTRIBUTE_TAG);
	}

	public String getType(){
		Node blockElement = DOMUtil.getChildNode(this.element, BlockElementModel.BLOCK_NODE_NAME);
		return DOMUtil.getChildNode(blockElement, "Type").getTextContent();
	}

	public String getConnectorKind(){
		return convertTypeToBlockConnectorType(getType());
	}

	public Node getPlugNode(){
		return DOMUtil.getChildNode(DOMUtil.getChildNode(this.element, BlockElementModel.BLOCK_NODE_NAME), "Plug");
	}
}
