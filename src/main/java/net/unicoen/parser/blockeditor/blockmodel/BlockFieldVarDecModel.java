package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.common.collect.ImmutableMap;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockFieldVarDecModel extends BlockVarDecModel{
	
	public static String KIND = BlockElementModel.BLOCKKINDS.GLOBAL_VARDEC.toString();
	public static String SPECIAL_GENUS_NAME="special-private-variable";
	
	public BlockFieldVarDecModel(String type, String name, Document document, BlockResolver resolver, Long ID_COUNTER) {
		super(type, name, document, resolver, ID_COUNTER);
	}
	
	@Override
	public String getGenusNameFromResolver(BlockResolver resolver, String type){
		return resolver.getFieldVarDecBlockName(type);
	}
	
	@Override
	public Element createVariableBlockNode(Document document, String genusName, String name, String kind,Long id) {
		Element blockElement = createBlockElement(document, SPECIAL_GENUS_NAME, id, KIND);
		MyDOMUtil.appendChilds(blockElement, MyDOMUtil.createElements(ImmutableMap.of(BlockElementModel.LABEL_NODE, name, BlockElementModel.NAME_NODE, name), document));
		return blockElement;
	}

}
