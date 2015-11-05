package net.unicoen.parser.blockeditor.blockmodel;

import java.util.Map;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockLiteralModel extends BlockExprModel {
	private String genusName;

	public BlockLiteralModel(String genusName, String label, Document document, String parentBlockID, Long ID_COUNTER, BlockResolver resolver) {
		this.genusName = genusName;
		element = createLiteralElement(label,document, parentBlockID, ID_COUNTER, resolver);
	}

	public String getGenusName(){
		return this.genusName;
	}

	public Element createLiteralElement(String label, Document document, String parentBlockID, Long ID_COUNTER, BlockResolver resolver) {
		Element blockElement = createBlockElement(document, getGenusName(), ID_COUNTER, DOMUtil.getAttribute(resolver.getBlockNode(getGenusName()), "kind"));

		addElement("Label", document, label, blockElement);
		addElement("Type", document, DOMUtil.getChildNode(resolver.getBlockNode(getGenusName()), "Type").getTextContent(), blockElement);
		addElement("ParentBlock", document, parentBlockID, blockElement);

		Node plugNode = resolver.getPlugElement(getGenusName());
		Map<String, String> plugInfo = calcPlugInfo(plugNode);

		addPlugElement(document, blockElement, parentBlockID, plugInfo.get("connector-type"), plugInfo.get("position-type"));

		return blockElement;
	}
}
