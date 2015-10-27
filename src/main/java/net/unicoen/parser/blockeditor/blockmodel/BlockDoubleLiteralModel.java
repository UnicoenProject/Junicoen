package net.unicoen.parser.blockeditor.blockmodel;

import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.parser.blockeditor.BlockResolver;

import org.w3c.dom.Document;

public class BlockDoubleLiteralModel extends BlockLiteralModel{
	private static String genusName = "double-number";

	public BlockDoubleLiteralModel(UniDoubleLiteral literalModel, Document document, String parent, Long ID_COUNTER, BlockResolver resolver) {
		super(genusName, String.valueOf(literalModel.value), document, parent, ID_COUNTER, resolver);
	}

}
