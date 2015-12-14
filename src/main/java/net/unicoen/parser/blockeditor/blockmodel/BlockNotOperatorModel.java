package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockNotOperatorModel extends BlockExprModel {

	private BlockExprModel value;
	public static String GENUS_NAME = "not";
	public static String KIND = "function";

	public BlockNotOperatorModel(Document document, Long id, BlockExprModel value) {
		this.element = createBlockElement(document, GENUS_NAME, id, KIND);
		this.value = value;
	}

	@Override
	public List<Element> getBlockElements() {
		List<Element> elements = new ArrayList<Element>();
		elements.add(getElement());
		elements.addAll(value.getBlockElements());

		return elements;
	}

}
