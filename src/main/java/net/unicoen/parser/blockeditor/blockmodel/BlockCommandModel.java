package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockCommandModel extends BlockElementModel {

	public static String KIND = "command";
	
	public Element createBlockStubNode(Document document, String parentName, String parentGenusName) {
		Element blockStubElement = document.createElement("BlockStub");
		addElement("StubParentName", document, parentName, blockStubElement);
		addElement("StubParentGenus", document, parentGenusName, blockStubElement);
		return blockStubElement;
	}
	
	public Element createVariableBlockNode(Document document, String genusName, String name, Long id) {
		Element blockElement = createBlockElement(document, genusName, id, KIND);
		addElement(BlockElementModel.LABEL_NODE_NAME, document, name, blockElement);
		addElement(BlockElementModel.NAME_NODE_NAME, document, name, blockElement);
		return blockElement;
	}
}

