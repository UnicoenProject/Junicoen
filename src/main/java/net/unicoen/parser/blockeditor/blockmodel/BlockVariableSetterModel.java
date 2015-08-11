package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Element;

public class BlockVariableSetterModel extends BlockCommandModel{

	public BlockVariableSetterModel(Element setterElement, BlockExprModel value){
		this.element = setterElement;
		addSocketBlock(value);
	}

}
