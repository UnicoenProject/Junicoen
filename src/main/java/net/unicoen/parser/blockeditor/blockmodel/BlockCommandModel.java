package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockCommandModel extends BlockElementModel {

	public static String KIND = BlockElementModel.BLOCKKINDS.COMMAND.toString();

	
	public Element createBlockStubNode(Document document, String parentName, String parentGenusName) {
		Element blockStubElement = document.createElement(BlockElementModel.BLOCK_STUB_NODE);
		addElement(BlockElementModel.STUBPARENTNAME_NODE, document, parentName, blockStubElement);
		addElement(BlockElementModel.STUBPARENTGENUS_NODE, document, parentGenusName, blockStubElement);
		return blockStubElement;
	}
	
	public Element createVariableBlockNode(Document document, String genusName, String name, Long id) {
		Element blockElement = createBlockElement(document, genusName, id, KIND);
		addElement(BlockElementModel.LABEL_NODE, document, name, blockElement);
		addElement(BlockElementModel.NAME_NODE, document, name, blockElement);
		return blockElement;
	}
}

