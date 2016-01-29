package net.unicoen.parser.blockeditor.blockmodel;

import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.node.UniCast;
import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockCastModel extends BlockExprModel {
	
	public static String KIND = "cast";
	public static String DEFAULT_GENUS_NAME = "cast";
	
	public BlockCastModel(UniCast model, List<BlockElementModel> sockets, String parentBlockID, Document document, Long ID_COUNTER, BlockResolver resolver){
		this.element = createElement(model, sockets, parentBlockID, document, ID_COUNTER, resolver);
	}
	
	public Element createElement(UniCast model,List<BlockElementModel> sockets, String parentBlockID, Document document, Long ID_COUNTER, BlockResolver resolver ){
		String genusName = "to" + convertType(model.type);
		Element blockElement;
		if(resolver.getBlockNode(genusName) == null){
			blockElement = createBlockElement(document, DEFAULT_GENUS_NAME, ID_COUNTER, KIND);
			blockElement.appendChild(MyDOMUtil.createElement(BlockElementModel.LABEL_NODE, model.type, document));
		}else{
			blockElement = createBlockElement(document, genusName, ID_COUNTER, KIND);	
		}
		blockElement.appendChild(MyDOMUtil.createElement(BlockElementModel.TYPE_NODE, model.type, document));
		
		//Plug?
		Node plugNode = resolver.getPlugElement(genusName);
		Map<String, String> plugInfo = calcPlugInfo(plugNode);
		addPlugElement(document, blockElement, parentBlockID, plugInfo.get(BlockPlugModel.CONNECTOR_TYPE_ATTR), plugInfo.get(BlockPlugModel.CONNECTOR_POSITION_TYPE_ATTR));
		
		return blockElement;
	}
	
	public String convertType(String type){
		return type.substring(0,1).toUpperCase() + type.substring(1);
	}
	
}
