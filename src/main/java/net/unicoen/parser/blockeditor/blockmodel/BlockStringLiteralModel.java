package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;

import net.unicoen.parser.blockeditor.BlockResolver;

public class BlockStringLiteralModel extends BlockLiteralModel{
	public static String STRINGLITERAL_GENUS_NAME = "string";

	public BlockStringLiteralModel(String value, Document document, String parent, Long ID_COUNTER, BlockResolver resolver) {
		super(STRINGLITERAL_GENUS_NAME, value.toString(), document, parent, ID_COUNTER, resolver);
	}

}
