package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class BlockDoWhileModel extends BlockCommandModel{

	private List<BlockCommandModel> trueBlocks = new ArrayList<>();

	public BlockDoWhileModel(Element whileElement, BlockExprModel initializer, List<BlockCommandModel> trueBlocks){
		this.element = whileElement;
		addSocketBlock(initializer);
		this.trueBlocks = trueBlocks;
	}

	public List<Element> getCommandBlockElements(){
		List<Element> commandBlocks = new ArrayList<>();

		commandBlocks.add(getElement());

		for(BlockCommandModel model : trueBlocks){
			commandBlocks.addAll(model.getCommandBlockElements());
		}

		for(BlockExprModel socket : getSocketBlocks()){
			commandBlocks.addAll(socket.getExprElements());
		}

		return commandBlocks;
	}

}
