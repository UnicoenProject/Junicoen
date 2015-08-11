package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class BlockPrePostModel extends BlockCommandModel{

	public BlockPrePostModel(Element element){
		this.element = element;
	}

	public List<Element> getCommandBlockElements(){
		List<Element> elements = new ArrayList<Element>();
		elements.add(this.element);

		return elements;
	}
}
