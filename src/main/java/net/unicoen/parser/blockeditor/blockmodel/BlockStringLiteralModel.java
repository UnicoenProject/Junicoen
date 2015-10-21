package net.unicoen.parser.blockeditor.blockmodel;

import net.unicoen.parser.blockeditor.BlockNameResolver;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class BlockStringLiteralModel extends BlockLiteralModel{
	private static String STRINGLITERAL_GENUS_NAME = "string";

	public BlockStringLiteralModel(String value, Document document, Node parent, Long ID_COUNTER, BlockNameResolver resolver) {
		super(STRINGLITERAL_GENUS_NAME, value, document, parent, ID_COUNTER, resolver);
	}

}
