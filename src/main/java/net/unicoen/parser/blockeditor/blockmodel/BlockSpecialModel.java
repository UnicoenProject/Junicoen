package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;

import com.google.common.collect.ImmutableMap;

import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockSpecialModel extends BlockCommandModel{

	public static String GENUS_NAME = "special";
	
	public BlockSpecialModel(String genusName, String methodName, Document document, Long id, String kind, String parentId){
		this.element = createBlockElement(document, genusName, id, kind);
		MyDOMUtil.appendChilds(element, MyDOMUtil.createElements(ImmutableMap.of(BlockElementModel.NAME_NODE, methodName, BlockElementModel.LABEL_NODE, methodName), document));
	}
		
}
