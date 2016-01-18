package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockSpecialExpressionModel extends BlockExprModel {

	public static String SPECIAL_IDENT_GENUS_NAME = "special-ident";

	public BlockSpecialExpressionModel(String genusName, String methodName, Document document, Long id, String kind, String parentId){
		Element element = createBlockElement(document, genusName, id, kind);
		addElement(BlockElementModel.NAME_NODE, document, methodName, element);
		addElement(BlockElementModel.LABEL_NODE, document, methodName, element);
		this.element = element;

		if(kind.equals(BlockElementModel.BLOCKKINDS.FUNCTION.toString())){
			addElement(BlockElementModel.TYPE_NODE, document, "Object", element);
		}
		
		addPlugElement(document, this.element, parentId, "object", "mirror");
	}
		
	
}
