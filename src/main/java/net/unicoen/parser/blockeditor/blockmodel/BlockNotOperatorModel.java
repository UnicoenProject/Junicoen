package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;

import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockNotOperatorModel extends BlockExprModel {

	public static String GENUS_NAME = "not";
	public static String KIND = "function";

	public BlockNotOperatorModel(Document document, Long id, BlockExprModel value) {
		this.element = createBlockElement(document, GENUS_NAME, id, KIND);
		element.appendChild(MyDOMUtil.createElement(BlockElementModel.TYPE_NODE, "boolean", document));
		this.getSocketBlocks().add(value);
	}

}
