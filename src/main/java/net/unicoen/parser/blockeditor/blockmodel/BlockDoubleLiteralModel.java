package net.unicoen.parser.blockeditor.blockmodel;

import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.parser.blockeditor.BlockNameResolver;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class BlockDoubleLiteralModel extends BlockLiteralModel{
	private static String genusName = "double";

	public BlockDoubleLiteralModel(UniDoubleLiteral literalModel, Document document, Node parent, Long ID_COUNTER, BlockNameResolver resolver) {
		super(genusName, String.valueOf(literalModel.value), document, parent, ID_COUNTER, resolver);
	}

}
