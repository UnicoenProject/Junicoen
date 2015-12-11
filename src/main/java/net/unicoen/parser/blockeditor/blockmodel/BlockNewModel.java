package net.unicoen.parser.blockeditor.blockmodel;

import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.node.UniNew;
import net.unicoen.parser.blockeditor.BlockResolver;

public class BlockNewModel extends BlockExprModel{

	private static String KIND = "function";
	private static String GENUSNAME_HEADER = "new-object";

	public BlockNewModel(UniNew newModel, List<BlockElementModel> sockets, String parentBlockID, Document document, Long ID_COUNTER, BlockResolver resolver){
		element = createNewElement(newModel, sockets, document, parentBlockID, ID_COUNTER, resolver);
	}

	public Element createNewElement(UniNew newModel, List<BlockElementModel> sockets, Document document, String parentBlockID, Long ID_COUNTER, BlockResolver resolver){

		String genusName = calcGesnuName(newModel, transformToTypeStringList(sockets), resolver);
		if(genusName == null){
			genusName = "new-object";
		}
		
		Element blockElement = createBlockElement(document, genusName, ID_COUNTER, KIND);

		addElement("Label", document, newModel.type, blockElement);
		addElement("Type", document, newModel.type, blockElement);

		//Plug?
		Node plugNode = resolver.getPlugElement(genusName);
		Map<String, String> plugInfo = calcPlugInfo(plugNode);
		addPlugElement(document, blockElement, parentBlockID, plugInfo.get("connector-type"), plugInfo.get("position-type"));

		return blockElement;
	}

	public String calcGesnuName(UniNew type,List<String> params, BlockResolver resolver){
		String tmpGenus = GENUSNAME_HEADER + "-" + type.type + resolver.calcParamNameSpace(params);
		if(resolver.getBlockNode(tmpGenus) != null){
			return tmpGenus;
		}else{
			return "new-object";	
		} 
	}
}
