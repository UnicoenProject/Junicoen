package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;

public class BlockExCallerModel extends BlockCommandModel {

	public static String GENUS_NAME = "callActionMethod2";

	public BlockExCallerModel(Document document, Long id) {
		this.element = createBlockElement(document, GENUS_NAME, id, KIND);
	}

}
