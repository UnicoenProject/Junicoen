package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.google.common.collect.ImmutableMap;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockMethodCallWithReturnModel extends BlockExprModel {

	public BlockMethodCallWithReturnModel(String genusName, Document document, BlockResolver resolver, Long ID_COUNTER, String parentId) {
		this.element = createPrototypeElement(genusName, document, resolver, ID_COUNTER, parentId);
	}

	public Element createPrototypeElement(String genusName, Document document, BlockResolver resolver, Long ID_COUNTER, String parent) {
		Node originNode = resolver.getBlockNode(genusName);
		Element element = createBlockElement(document, genusName, ID_COUNTER, BlockElementModel.BLOCKKINDS.FUNCTION.toString());
		String type = resolver.getType(genusName);
		MyDOMUtil.appendChilds(element, MyDOMUtil.createElements(ImmutableMap.of(BlockElementModel.NAME_NODE, MyDOMUtil.getChildText(originNode, BlockElementModel.NAME_NODE), BlockElementModel.TYPE_NODE, resolver.getType(genusName)), document));

		addPlugElement(document, element, parent, convertTypeToBlockConnectorType(type), "single");
		
		return element;
	}
}
