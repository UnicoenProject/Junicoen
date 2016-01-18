package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;

import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.parser.blockeditor.BlockResolver;

public class BlockDoubleLiteralModel extends BlockLiteralModel{
	public static String GENUS_NAME = "double-number";

	public BlockDoubleLiteralModel(UniDoubleLiteral literalModel, Document document, String parent, Long ID_COUNTER, BlockResolver resolver) {
		super(GENUS_NAME, String.valueOf(literalModel.value), document, parent, ID_COUNTER, resolver);
	}

}
