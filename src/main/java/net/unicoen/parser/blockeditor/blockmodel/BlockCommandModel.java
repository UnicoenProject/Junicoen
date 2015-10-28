package net.unicoen.parser.blockeditor.blockmodel;

import net.unicoen.parser.blockeditor.BlockMapper;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockCommandModel extends BlockElementModel {
	public static void addBeforeBlockNode(Document document, Element blockNode, String id) {
		Element element = document.createElement("BeforeBlockId");
		element.setTextContent(id);

		if (blockNode.getNodeName().equals("BlockStub")) {
			BlockMapper.getChildNode(blockNode, "Block").appendChild(element);
		} else {
			blockNode.appendChild(element);
		}
	}

}
