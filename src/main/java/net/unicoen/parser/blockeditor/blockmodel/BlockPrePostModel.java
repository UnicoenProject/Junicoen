package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.parser.blockeditor.DOMUtil;

public class BlockPrePostModel extends BlockCommandModel {

	public BlockPrePostModel(Document document, String genusName, Node parentNode, Long id) {
		String parentGenus = DOMUtil.getAttribute(parentNode, BlockElementModel.GENUS_NAME_ATTRIBUTE_TAG);
		String variableName = DOMUtil.getChildTextFromBlockNode(parentNode, BlockElementModel.NAME_NODE_NAME);
		Element blockStubElement = createBlockStubNode(document, variableName, parentGenus);
		// Blockノード作成
		Element blockElement = createVariableBlockNode(document, genusName + parentGenus, variableName, id);
		// BlockStubノードにBlockノードを追加する
		blockStubElement.appendChild(blockElement);
	}

	@Override
	public List<Element> getBlockElements() {
		List<Element> elements = new ArrayList<Element>();
		elements.add(this.element);

		return elements;
	}
}
