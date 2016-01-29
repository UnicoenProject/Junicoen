package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockVariableSetterModel extends BlockCommandModel {

	public static String GENUS_HEADER = "setter";
	
	public BlockVariableSetterModel(Document document, Node parentNode, Long id) {
		String genusName = GENUS_HEADER + MyDOMUtil.getAttribute(parentNode, BlockElementModel.GENUS_NAME_ATTR);
		String variableName = MyDOMUtil.getChildTextFromBlockNode(parentNode, BlockElementModel.NAME_NODE);
		// BlockStubノード作成
		Element blockStubElement = createBlockStubNode(document, variableName, MyDOMUtil.getAttribute(parentNode, BlockElementModel.GENUS_NAME_ATTR));
		// Blockノード作成
		Element blockElement = createVariableBlockNode(document, genusName, variableName, BlockCommandModel.KIND, id);
		blockStubElement.appendChild(blockElement);
		this.element = blockStubElement;
	}

}
