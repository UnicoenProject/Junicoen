package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.common.collect.ImmutableMap;

import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockCommandModel extends BlockElementModel {

	public static String KIND = BlockElementModel.BLOCKKINDS.COMMAND.toString();

	public Element createVariableBlockNode(Document document, String genusName, String name, String kind,Long id) {
		Element blockElement = createBlockElement(document, genusName, id, kind);
		MyDOMUtil.appendChilds(blockElement, MyDOMUtil.createElements(ImmutableMap.of(BlockElementModel.LABEL_NODE, name, BlockElementModel.NAME_NODE, name), document));
		return blockElement;
	}
}

