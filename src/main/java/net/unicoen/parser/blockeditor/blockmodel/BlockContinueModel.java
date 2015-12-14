package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;

public class BlockContinueModel extends BlockCommandModel {

	public String GENUS_NAME = "continue";
	
	public BlockContinueModel(Document document, Long id) {
		this.element = createBlockElement(document, GENUS_NAME, id, KIND);
	}

}
