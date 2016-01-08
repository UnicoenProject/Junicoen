package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockSpecialModel extends BlockElementModel{

	public static String GENUS_NAME = "special";
	public static String VARIABLE_GENUS_NAME = "special-variable";
	public static String SPECIAL_IDENT_GENUS_NAME = "special-ident";
	
	public BlockSpecialModel(String genusName, String methodName, Document document, Long id, String kind, String parentId){
		Element element = createBlockElement(document, genusName, id, kind);
		addElement(BlockElementModel.NAME_NODE, document, methodName, element);
		addElement(BlockElementModel.LABEL_NODE, document, methodName, element);
		this.element = element;

		if (kind.equals(BlockElementModel.BLOCKKINDS.COMMAND.toString()) && parentId != null) {
			addBeforeBlockNode(document, parentId);
		}

		if(kind.equals(BlockElementModel.BLOCKKINDS.FUNCTION.toString())){
			//TODO should fix 返り値をどうにかして取得するように修正するように
			addElement(BlockElementModel.TYPE_NODE, document, "Object", element);
		}
	}
		
}
