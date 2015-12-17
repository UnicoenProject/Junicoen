package net.unicoen.parser.blockeditor.blockmodel;

import java.util.Map;

import net.unicoen.node.UniBoolLiteral;
import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockBooleanLiteralModel extends BlockLiteralModel {
	private static String TRUELITERAL_GENUS_NAME = "true";
	private static String FALSELITERAL_GENUS_NAME = "false";

	public BlockBooleanLiteralModel(UniBoolLiteral model, Document document, String parent, Long ID_COUNTER, BlockResolver resolver) {
		super(String.valueOf(model.value), DOMUtil.getAttribute(resolver.getBlockNode(String.valueOf(model.value)), "initlabel"), document, parent, ID_COUNTER, resolver);
	}

	public Element createLiteralElement(String label, Document document, String parent, Long ID_COUNTER, BlockResolver resolver) {
		String genusName = TRUELITERAL_GENUS_NAME;
		if (!Boolean.valueOf(getGenusName())) {
			genusName = FALSELITERAL_GENUS_NAME;
			label = DOMUtil.getAttribute(resolver.getBlockNode(genusName), "initlabel");
		}

		Element blockElement = createBlockElement(document, genusName, ID_COUNTER, DOMUtil.getAttribute(resolver.getBlockNode(genusName), "kind"));

		addElement("Label", document, label, blockElement);
		addElement("Type", document, DOMUtil.getChildNode(resolver.getBlockNode(getGenusName()), "Type").getTextContent(), blockElement);

		Node plugNode = resolver.getPlugElement(getGenusName());
		Map<String, String> plugInfo = calcPlugInfo(plugNode);

		addPlugElement(document, blockElement, parent, plugInfo.get("connector-type"), plugInfo.get("position-type"));

		return blockElement;
	}
}