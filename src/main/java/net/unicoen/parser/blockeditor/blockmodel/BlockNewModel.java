package net.unicoen.parser.blockeditor.blockmodel;

import java.util.Map;

import net.unicoen.node.UniNew;
import net.unicoen.parser.blockeditor.BlockResolver;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockNewModel extends BlockExprModel{

	private static String KIND = "function";
	private static String GENUSNAME_HEADER = "new-object";

	public BlockNewModel(UniNew newModel, String parentBlockID, Document document, Long ID_COUNTER, BlockResolver resolver){
		element = createNewElement(newModel, document, parentBlockID, ID_COUNTER, resolver);
	}

	public Element createNewElement(UniNew newModel, Document document, String parentBlockID, Long ID_COUNTER, BlockResolver resolver){
		String genusName = calcGesnuName(newModel, resolver);
		Element blockElement = createBlockElement(document, genusName, ID_COUNTER, KIND);

		addElement("Label", document, newModel.type, blockElement);
		addElement("Type", document, newModel.type, blockElement);

		Node plugNode = resolver.getPlugElement(genusName);
		Map<String, String> plugInfo = calcPlugInfo(plugNode);

		addPlugElement(document, blockElement, parentBlockID, plugInfo.get("connector-type"), plugInfo.get("position-type"));
		return blockElement;
	}

	public String calcGesnuName(UniNew type, BlockResolver resolver){
		return GENUSNAME_HEADER + "-" + type.type + calcParameterFooter(type.args, resolver);
	}
}
