package net.unicoen.parser.blockeditor.blockmodel;

import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.node.UniBoolLiteral;
import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;

public class BlockBooleanLiteralModel extends BlockLiteralModel {
	private static String TRUELITERAL_GENUS_NAME = "true";
	private static String FALSELITERAL_GENUS_NAME = "false";

	public BlockBooleanLiteralModel(UniBoolLiteral model, Document document, String parent, Long ID_COUNTER, BlockResolver resolver) {
		super(String.valueOf(model.value), DOMUtil.getAttribute(resolver.getBlockNode(String.valueOf(model.value)), BlockElementModel.INITLABEL_ATTR), document, parent, ID_COUNTER, resolver);
	}

	@Override
	public Element createLiteralElement(String label, Document document, String parent, Long ID_COUNTER, BlockResolver resolver) {
		String genusName = TRUELITERAL_GENUS_NAME;
		if (!Boolean.valueOf(getGenusName())) {
			genusName = FALSELITERAL_GENUS_NAME;
			label = DOMUtil.getAttribute(resolver.getBlockNode(genusName), BlockElementModel.INITLABEL_ATTR);
		}

		Element blockElement = createBlockElement(document, genusName, ID_COUNTER, DOMUtil.getAttribute(resolver.getBlockNode(genusName), BlockElementModel.KIND_ATTR));

		addElement(BlockElementModel.LABEL_NODE, document, label, blockElement);
		addElement(BlockElementModel.TYPE_NODE, document, DOMUtil.getChildNode(resolver.getBlockNode(getGenusName()), BlockElementModel.TYPE_NODE).getTextContent(), blockElement);

		Node plugNode = resolver.getPlugElement(getGenusName());
		Map<String, String> plugInfo = calcPlugInfo(plugNode);

		addPlugElement(document, blockElement, parent, plugInfo.get(BlockConnector.CONNECTOR_TYPE_ATTR), plugInfo.get(BlockConnector.CONNECTOR_POSITION_TYPE_ATTR));

		return blockElement;
	}
}
