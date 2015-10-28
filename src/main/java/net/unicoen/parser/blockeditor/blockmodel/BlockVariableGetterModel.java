package net.unicoen.parser.blockeditor.blockmodel;

import net.unicoen.node.UniIdent;
import net.unicoen.parser.blockeditor.BlockMapper;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockVariableGetterModel extends BlockExprModel {

	public BlockVariableGetterModel(UniIdent ident, Node varDecNode, Document document, Long id) {
		String genusName = "getter";
		genusName += BlockMapper.getAttribute(varDecNode, "genus-name");
		// BlockStubノード作成
		Element stubElement = createBlockStubNode(document, ident.name, BlockMapper.getAttribute(varDecNode, "genus-name"));
		// Blockノード作成
		Element blockElement = createVariableBlockNode(document, genusName, ident.name, "data", BlockMapper.getChildNode(varDecNode, "Type").getTextContent(), id);
		stubElement.appendChild(blockElement);
		this.element = stubElement;
	}

	public void setPlugElement(Document document, PlugInfo plugInfo){
		BlockMapper.getChildNode(this.element, BlockElementModel.NODE_NAME).appendChild(plugInfo.createElemnet(document));
	}

	public String getBlockID() {
		return BlockMapper.getAttribute(BlockMapper.getChildNode(this.element, BlockElementModel.NODE_NAME), ID_ATTRIBUTE_TAG);
	}

	public String getGenusName() {
		return BlockMapper.getAttribute(BlockMapper.getChildNode(this.element, BlockElementModel.NODE_NAME),GENUS_NAME_ATTRIBUTE_TAG);
	}

	public String getKind() {
		return BlockMapper.getAttribute(BlockMapper.getChildNode(this.element, BlockElementModel.NODE_NAME), KIND_ATTRIBUTE_TAG);
	}

	public String getType(){
		Node blockElement = BlockMapper.getChildNode(this.element, BlockElementModel.NODE_NAME);
		return BlockMapper.getChildNode(blockElement, "Type").getTextContent();
	}

	public String getConnectorKind(){
		return convertTypeToBlockConnectorType(getType());
	}
}
