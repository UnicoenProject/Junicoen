package net.unicoen.parser.blockeditor.blockmodel;

import net.unicoen.parser.blockeditor.BlockResolver;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockProcParmModel extends BlockExprModel {

	private static String KIND = "param";

	public BlockProcParmModel(String type, String name, Document document, BlockResolver resolver, Long ID_COUNTER) {
		this.element = createLocalVaribleElement(type, name, document, resolver, ID_COUNTER);
	}

	public Element createLocalVaribleElement(String type, String name, Document document, BlockResolver resolver, Long ID_COUNTER){
		Element blockElement = createBlockElement(document, resolver.getFunctionArgBlockName(type), ID_COUNTER++, KIND);

		addElement("Label", document, name, blockElement);
		addElement("Name", document, name, blockElement);
		addElement("Type", document, type, blockElement);

		return blockElement;
	}

}
