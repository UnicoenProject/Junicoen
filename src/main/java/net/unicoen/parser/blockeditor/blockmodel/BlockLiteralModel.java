package net.unicoen.parser.blockeditor.blockmodel;

import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;

public class BlockLiteralModel extends BlockExprModel {
	private String genusName;

	public BlockLiteralModel(String genusName, String label, Document document, String parentBlockID, Long ID_COUNTER, BlockResolver resolver) {
		this.genusName = genusName;
		element = createLiteralElement(label,document, parentBlockID, ID_COUNTER, resolver);
	}

	@Override
	public String getGenusName(){
		return this.genusName;
	}

	public Element createLiteralElement(String label, Document document, String parentBlockID, Long ID_COUNTER, BlockResolver resolver) {
		Element blockElement = createBlockElement(document, getGenusName(), ID_COUNTER, DOMUtil.getAttribute(resolver.getBlockNode(getGenusName()), BlockElementModel.KIND_ATTR));

		addElement(BlockElementModel.LABEL_NODE, document, label, blockElement);
		addElement(BlockElementModel.TYPE_NODE, document, DOMUtil.getChildNode(resolver.getBlockNode(getGenusName()), BlockElementModel.TYPE_NODE).getTextContent(), blockElement);

		Node plugNode = resolver.getPlugElement(getGenusName());
		Map<String, String> plugInfo = calcPlugInfo(plugNode);

		addPlugElement(document, blockElement, parentBlockID, plugInfo.get(BlockConnector.CONNECTOR_TYPE_ATTR), plugInfo.get(BlockConnector.CONNECTOR_POSITION_TYPE_ATTR));

		return blockElement;
	}
}
