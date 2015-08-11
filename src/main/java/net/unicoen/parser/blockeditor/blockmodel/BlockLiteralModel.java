package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Element;

public class BlockLiteralModel extends BlockExprModel{

	public BlockLiteralModel(Element literalElement){
		element = literalElement;
	}

}
