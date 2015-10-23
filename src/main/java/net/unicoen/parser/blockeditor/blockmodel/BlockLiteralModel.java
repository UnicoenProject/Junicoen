package net.unicoen.parser.blockeditor.blockmodel;

import java.util.Map;

import net.unicoen.parser.blockeditor.BlockMapper;
import net.unicoen.parser.blockeditor.BlockNameResolver;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockLiteralModel extends BlockExprModel {
	private String genusName;

	public BlockLiteralModel(String genusName, String label, Document document, String parentBlockID, Long ID_COUNTER, BlockNameResolver resolver) {
		this.genusName = genusName;
		element = createLiteralElement(label,document, parentBlockID, ID_COUNTER, resolver);
	}

	public String getGenusName(){
		return this.genusName;
	}

	public Element createLiteralElement(String label, Document document, String parentBlockID, Long ID_COUNTER, BlockNameResolver resolver) {
		Element blockElement = createBlockElement(document, getGenusName(), ID_COUNTER, BlockMapper.getAttribute(resolver.getBlockNode(getGenusName()), "kind"));

		addElement("Label", document, label, blockElement);
		addElement("Type", document, BlockMapper.getChildNode(resolver.getBlockNode(getGenusName()), "Type").getTextContent(), blockElement);

		Node plugNode = resolver.getPlugElement(getGenusName());
		Map<String, String> plugInfo = calcPlugInfo(plugNode);

		addPlugElement(document, blockElement, parentBlockID, plugInfo.get("connector-type"), plugInfo.get("position-type"));

		return blockElement;
	}
}
