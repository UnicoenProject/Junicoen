package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;

public class BlockEmptyModel extends BlockCommandModel {

	public static String GENUS_NAME = "empty";
	
	public BlockEmptyModel(Long id, Document document){
		this.element = createBlockElement(document, GENUS_NAME, id, BlockElementModel.BLOCKKINDS.COMMAND.toString());
	}
	
}
