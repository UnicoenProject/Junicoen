package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Element;

public class BlockProcParmModel extends BlockExprModel {

	public BlockProcParmModel(Element paramElement) {
		element = paramElement;
	}

	public Element getParmElement() {
		return element;
	}

}
