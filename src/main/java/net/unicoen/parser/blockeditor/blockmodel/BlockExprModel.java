package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class BlockExprModel extends BlockElementModel{

	public List<Element> getExprElements(){
		List<Element> elements = new ArrayList<Element>();
		elements.add(getElement());
		return elements;
	}

}
