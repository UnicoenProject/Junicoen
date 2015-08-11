package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class BlockExCallerModel extends BlockCommandModel{

	private BlockCommandModel methodBlock;

	public void setCallMethod(BlockCommandModel method){
		this.methodBlock = method;
	}

	public List<Element> getCommandBlockElements(){
		List<Element> commandBlocks = new ArrayList<>();

		commandBlocks.add(getElement());

		for(BlockExprModel socket : getSocketBlocks()){
			commandBlocks.addAll(socket.getExprElements());
		}

		commandBlocks.addAll(methodBlock.getCommandBlockElements());

		return commandBlocks;
	}

}
