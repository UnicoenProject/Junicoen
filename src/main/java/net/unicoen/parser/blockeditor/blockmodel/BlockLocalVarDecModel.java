package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class BlockLocalVarDecModel extends BlockCommandModel{

	private BlockExprModel initializer;

	public BlockLocalVarDecModel(Element localVarElement){
		element = localVarElement;
	}

	public void setInitializer(BlockExprModel initializer){
		this.initializer = initializer;
	}

	public List<Element> getCommandBlockElements(){
		List<Element> commandBlocks = new ArrayList<>();

		commandBlocks.add(getElement());
		if(initializer != null){
			commandBlocks.addAll(initializer.getExprElements());
		}

		return commandBlocks;
	}


}
