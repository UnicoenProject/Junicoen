package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockSpecialModel extends BlockElementModel{

	public static String GENUS_NAME = "special";

	public BlockSpecialModel(String methodName, Document document, Long id, String kind, String parentId){
		Element element = createBlockElement(document, GENUS_NAME, id, kind);
		addElement("Name", document, methodName, element);
		this.element = element;

		if (kind.equals("command") && parentId != null) {
			addBeforeBlockNode(document, parentId);
		}

		if(kind.equals("function")){

			//TODO should fix 返り値をどうにかして取得するように修正するように
			addElement("Type", document, "Object", element);
		}
	}
		
}
