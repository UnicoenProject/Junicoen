package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class BlockCommandModel extends BlockElementModel{

	private List<BlockExprModel> socketBlocksElements = new ArrayList<>();

	public BlockCommandModel(Element element){
		this.element = element;
	}

	public BlockCommandModel(){

	}

	public List<Element> getCommandBlockElements(){
		List<Element> commandBlocks = new ArrayList<>();

		commandBlocks.add(getElement());
		for(BlockExprModel socket : socketBlocksElements){
			commandBlocks.addAll(socket.getExprElements());
		}

		return commandBlocks;
	}

	public void addSocketBlock(BlockExprModel socket){
		this.socketBlocksElements.add(socket);
	}

	public List<BlockExprModel> getSocketBlocks(){
		return this.socketBlocksElements;
	}

}
