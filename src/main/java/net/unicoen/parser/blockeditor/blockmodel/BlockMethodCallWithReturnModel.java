package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;

public class BlockMethodCallWithReturnModel extends BlockExprModel {

	public BlockMethodCallWithReturnModel(String genusName, Document document, BlockResolver resolver, Long ID_COUNTER, String parentId) {
		this.element = createPrototypeElement(genusName, document, resolver, ID_COUNTER, parentId);
	}

	public Element createPrototypeElement(String genusName, Document document, BlockResolver resolver, Long ID_COUNTER, String parent) {
		String kind = BlockElementModel.BLOCKKINDS.FUNCTION.toString();
		Node originNode = resolver.getBlockNode(genusName);
		Element element = createBlockElement(document, genusName, ID_COUNTER, kind);
		String type = resolver.getType(genusName);
		addElement(BlockElementModel.NAME_NODE, document, DOMUtil.getChildText(originNode, BlockElementModel.NAME_NODE), element);
		addElement(BlockElementModel.TYPE_NODE, document, resolver.getType(genusName), element);

		addPlugElement(document, element, parent, convertTypeToBlockConnectorType(type), "single");
		
		return element;
	}


}
