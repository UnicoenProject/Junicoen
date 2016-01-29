package net.unicoen.parser.blockeditor.blockmodel;

import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.google.common.collect.ImmutableMap;

import net.unicoen.node.UniNew;
import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockNewModel extends BlockExprModel{

	private static String KIND = "function";
	private static String GENUSNAME_HEADER = "new-object";
	public static String GENUS_HEADER = "new-";
	public static String DEFAULT_GENUS_NAME = "new-object";

	public BlockNewModel(UniNew newModel, List<BlockElementModel> sockets, String parentBlockID, Document document, Long ID_COUNTER, BlockResolver resolver){
		element = createNewElement(newModel, sockets, document, parentBlockID, ID_COUNTER, resolver);
	}

	public Element createNewElement(UniNew newModel, List<BlockElementModel> sockets, Document document, String parentBlockID, Long ID_COUNTER, BlockResolver resolver){
		String genusName = calcGesnuName(newModel, transformToTypeStringList(sockets), resolver);
		
		Element blockElement = createBlockElement(document, genusName, ID_COUNTER, KIND);
		MyDOMUtil.appendChilds(blockElement, MyDOMUtil.createElements(ImmutableMap.of(BlockElementModel.LABEL_NODE, newModel.type,BlockElementModel.TYPE_NODE,newModel.type), document));

		//Plug?
		Node plugNode = resolver.getPlugElement(genusName);
		Map<String, String> plugInfo = calcPlugInfo(plugNode);
		addPlugElement(document, blockElement, parentBlockID, plugInfo.get(BlockPlugModel.CONNECTOR_TYPE_ATTR), plugInfo.get(BlockPlugModel.CONNECTOR_POSITION_TYPE_ATTR));

		return blockElement;
	}

	public String calcGesnuName(UniNew type,List<String> params, BlockResolver resolver){
		String tmpGenus = GENUSNAME_HEADER + "-" + type.type + resolver.calcParamNameSpace(params);
		if(resolver.getBlockNode(tmpGenus) != null){
			return tmpGenus;
		}else{
			return DEFAULT_GENUS_NAME;	
		} 
	}
}
