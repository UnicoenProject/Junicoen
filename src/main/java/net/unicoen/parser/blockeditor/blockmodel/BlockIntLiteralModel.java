package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;

import net.unicoen.parser.blockeditor.BlockResolver;

public class BlockIntLiteralModel extends BlockLiteralModel {
	public static String INTLITERAL_GENUS_NAME = "number";

	public BlockIntLiteralModel(String label, Document document, String parent, Long ID_COUNTER, BlockResolver resolver) {
		super(INTLITERAL_GENUS_NAME, label, document, parent, ID_COUNTER, resolver);
	}

}
