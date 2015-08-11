package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Element;


public class BlockReturnModel extends BlockCommandModel{

	public BlockReturnModel(Element element, BlockExprModel socket){
		this.element = element;
		addSocketBlock(socket);
	}

}
