package net.unicoen.parser.blockeditor.blockmodel;

import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.google.common.collect.ImmutableMap;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockLiteralModel extends BlockExprModel {

	public BlockLiteralModel(String genusName, String label, Document document, String parentBlockID, Long ID_COUNTER, BlockResolver resolver) {
		element = createLiteralElement(label,document, parentBlockID, ID_COUNTER, resolver, genusName);
	}

	public Element createLiteralElement(String label, Document document, String parentBlockID, Long ID_COUNTER, BlockResolver resolver, String genusName) {
		Element blockElement = createBlockElement(document, genusName, ID_COUNTER, MyDOMUtil.getAttribute(resolver.getBlockNode(genusName), BlockElementModel.KIND_ATTR));
		MyDOMUtil.appendChilds(blockElement, MyDOMUtil.createElements(ImmutableMap.of(BlockElementModel.LABEL_NODE, label, BlockElementModel.TYPE_NODE, MyDOMUtil.getChildNode(resolver.getBlockNode(genusName), BlockElementModel.TYPE_NODE).getTextContent()), document));

		Node plugNode = resolver.getPlugElement(genusName);
		Map<String, String> plugInfo = calcPlugInfo(plugNode);

		addPlugElement(document, blockElement, parentBlockID, plugInfo.get(BlockConnector.CONNECTOR_TYPE_ATTR), plugInfo.get(BlockConnector.CONNECTOR_POSITION_TYPE_ATTR));

		return blockElement;
	}
}
