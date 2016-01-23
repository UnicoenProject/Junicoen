package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.common.collect.ImmutableMap;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockProcParmModel extends BlockExprModel {

	public static String KIND = "param";

	public BlockProcParmModel(String type, String name, Document document, BlockResolver resolver, Long ID_COUNTER) {
		this.element = createLocalVaribleElement(type, name, document, resolver, ID_COUNTER);
	}

	public Element createLocalVaribleElement(String type, String name, Document document, BlockResolver resolver, Long ID_COUNTER){
		Element blockElement = createBlockElement(document, resolver.getFunctionArgBlockName(type), ID_COUNTER++, KIND);
		MyDOMUtil.appendChilds(blockElement, MyDOMUtil.createElements(ImmutableMap.of(BlockElementModel.LABEL_NODE, name, BlockElementModel.NAME_NODE, name, BlockElementModel.TYPE_NODE, type), document));

		return blockElement;
	}

}
