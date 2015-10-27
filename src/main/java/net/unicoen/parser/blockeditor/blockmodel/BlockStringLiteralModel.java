package net.unicoen.parser.blockeditor.blockmodel;

import net.unicoen.parser.blockeditor.BlockResolver;

import org.w3c.dom.Document;

public class BlockStringLiteralModel extends BlockLiteralModel{
	private static String STRINGLITERAL_GENUS_NAME = "string";

	public BlockStringLiteralModel(String value, Document document, String parent, Long ID_COUNTER, BlockResolver resolver) {
		super(STRINGLITERAL_GENUS_NAME, value, document, parent, ID_COUNTER, resolver);
	}

}
