package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;

public class BlockBreakModel extends BlockCommandModel {

	public String GENUS_NAME = "break";
	
	public BlockBreakModel(Document document, Long id) {
		this.element = createBlockElement(document, GENUS_NAME, id, KIND);
	}

}
