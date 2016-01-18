package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import net.unicoen.parser.blockeditor.BlockResolver;

public class BlockProcParmModel extends BlockExprModel {

	public static String KIND = "param";

	public BlockProcParmModel(String type, String name, Document document, BlockResolver resolver, Long ID_COUNTER) {
		this.element = createLocalVaribleElement(type, name, document, resolver, ID_COUNTER);
	}

	public Element createLocalVaribleElement(String type, String name, Document document, BlockResolver resolver, Long ID_COUNTER){
		Element blockElement = createBlockElement(document, resolver.getFunctionArgBlockName(type), ID_COUNTER++, KIND);

		addElement(BlockElementModel.LABEL_NODE, document, name, blockElement);
		addElement(BlockElementModel.NAME_NODE, document, name, blockElement);
		addElement(BlockElementModel.TYPE_NODE, document, type, blockElement);

		return blockElement;
	}

}
