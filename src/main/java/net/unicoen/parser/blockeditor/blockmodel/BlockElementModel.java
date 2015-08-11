package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Element;

public class BlockElementModel {

	protected Long id;
	protected Element element;

	public BlockElementModel(){
	}

	public Element getElement(){
		return this.element;
	}

	public void setElement(Element element){
		this.element = element;
	}


}
