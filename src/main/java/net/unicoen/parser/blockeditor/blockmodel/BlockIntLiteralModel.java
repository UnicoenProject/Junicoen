package net.unicoen.parser.blockeditor.blockmodel;

import net.unicoen.parser.blockeditor.BlockNameResolver;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class BlockIntLiteralModel extends BlockLiteralModel {
	private static String INTLITERAL_GENUS_NAME = "number";

	public BlockIntLiteralModel(String label, Document document, Node parent, Long ID_COUNTER, BlockNameResolver resolver) {
		super(INTLITERAL_GENUS_NAME, label, document, parent, ID_COUNTER, resolver);
	}

}
