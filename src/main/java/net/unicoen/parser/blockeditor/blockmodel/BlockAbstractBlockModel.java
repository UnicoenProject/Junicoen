package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class BlockAbstractBlockModel extends BlockCommandModel{

	private List<BlockCommandModel> sockets = new ArrayList<>();

	public BlockAbstractBlockModel(Element element){
		this.element = element;
	}

	public List<Element> getCommandBlockElements(){
		List<Element> elements = new ArrayList<>();

		//Blockの中身を出力
		for(BlockCommandModel socket : sockets){
			elements.addAll(socket.getCommandBlockElements());
		}

		elements.add(getElement());
		return elements;
	}

	public void setSockets(List<BlockCommandModel> sockets){
		this.sockets = sockets;
	}


}
