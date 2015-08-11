package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class BlockIfModel extends BlockCommandModel{

	private List<BlockCommandModel> trueBlocks = new ArrayList<>();
	private List<BlockCommandModel> falseBlocks = new ArrayList<>();

	public List<Element> getCommandBlockElements(){
		List<Element> elements = new ArrayList<>();

		elements.add(getElement());

		//条件式
		for(BlockExprModel socket : getSocketBlocks()){
			elements.addAll(socket.getExprElements());
		}

		//真ブロック
		for(BlockCommandModel model : trueBlocks){
			elements.addAll(model.getCommandBlockElements());
		}

		//偽ブロック
		for(BlockCommandModel model : falseBlocks){
			elements.addAll(model.getCommandBlockElements());
		}

		return elements;
	}

	public void setTrueBlocks(List<BlockCommandModel> blocks){
		this.trueBlocks = blocks;
	}

	public void setFalseBlocks(List<BlockCommandModel> blocks){
		this.falseBlocks = blocks;
	}

}
