package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockVariableGetterModel extends BlockExprModel {
	
	public static String GENUS_HEADER = "getter";

	public BlockVariableGetterModel(Node varDecNode, Document document, Long id) {
		String genusName = GENUS_HEADER + MyDOMUtil.getAttribute(varDecNode, BlockElementModel.GENUS_NAME_ATTR);
		String name = MyDOMUtil.getChildText(varDecNode, BlockElementModel.NAME_NODE);
		
		// BlockStubノード作成
		Element stubElement = createBlockStubNode(document, name, MyDOMUtil.getAttribute(varDecNode, BlockElementModel.GENUS_NAME_ATTR));

		// Blockノード作成
		Element blockElement = createVariableBlockNode(document, genusName, name, BlockElementModel.BLOCKKINDS.DATA.toString(), MyDOMUtil.getChildNode(varDecNode, BlockElementModel.TYPE_NODE).getTextContent(), id);
		stubElement.appendChild(blockElement);
		this.element = stubElement;
	}
	
	public String getConnectorKind(){
		return convertTypeToBlockConnectorType(getType());
	}

}
