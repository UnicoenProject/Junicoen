package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class BlockBinaryOperatorModel extends BlockExprModel {

	private BlockExprModel left;
	private BlockExprModel right;

	public BlockBinaryOperatorModel(Element binOpElement, BlockExprModel left,
			BlockExprModel right) {
		this.element = binOpElement;
		this.left = left;
		this.right = right;
	}

	public List<Element> getElements() {
		List<Element> elements = new ArrayList<Element>();
		elements.add(getElement());
		elements.addAll(left.getBlockElements());
		elements.addAll(right.getBlockElements());

		return elements;
	}

}
