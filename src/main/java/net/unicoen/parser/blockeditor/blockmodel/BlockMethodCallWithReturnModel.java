package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class BlockMethodCallWithReturnModel extends BlockExprModel{

	private List<BlockExprModel> sockets = new ArrayList<>();
	public List<Element> getExprElements(){
		List<Element> elements = new ArrayList<Element>();
		elements.add(getElement());
		for(BlockExprModel model : sockets){
			elements.addAll(model.getExprElements());
		}
		return elements;
	}

	public void addSocket(BlockExprModel socket){
		sockets.add(socket);
	}

}
