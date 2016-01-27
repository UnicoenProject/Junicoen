package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;

import com.google.common.collect.ImmutableMap;

import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockSpecialExpressionModel extends BlockExprModel {

	public static String SPECIAL_IDENT_GENUS_NAME = "special-ident";

	public BlockSpecialExpressionModel(String genusName, String methodName, Document document, Long id, String kind, String parentId){
		this.element = createBlockElement(document, genusName, id, kind);
		MyDOMUtil.appendChilds(element, MyDOMUtil.createElements(ImmutableMap.of(BlockElementModel.NAME_NODE, methodName, BlockElementModel.LABEL_NODE, methodName), document));
		
		if(kind.equals(BlockElementModel.BLOCKKINDS.FUNCTION.toString())){
			element.appendChild(MyDOMUtil.createElement(BlockElementModel.TYPE_NODE, "Object", document));
		}
		
		addPlugElement(document, this.element, parentId, "object", "mirror");
	}
		
	
}
