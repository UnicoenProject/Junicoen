package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class BlockNotOperatorModel extends BlockExprModel{

	private BlockExprModel value;

	public BlockNotOperatorModel(Element element, BlockExprModel value){
		this.element = element;
		this.value = value;
	}

	public List<Element> getExprElements(){
		List<Element> elements = new ArrayList<Element>();
		elements.add(getElement());
		elements.addAll(value.getExprElements());

		return elements;
	}

}
