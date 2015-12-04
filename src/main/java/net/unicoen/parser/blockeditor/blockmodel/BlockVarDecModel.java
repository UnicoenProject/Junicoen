package net.unicoen.parser.blockeditor.blockmodel;

import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.common.collect.Lists;

import net.unicoen.parser.blockeditor.BlockResolver;

public class BlockVarDecModel extends BlockCommandModel{

	public BlockVarDecModel(String type, String name, Document document, BlockResolver resolver, Long ID_COUNTER) {
		this.element = createElement(type, name, document, resolver, ID_COUNTER);
	}
	
	public Element createElement(String type, String name, Document document, BlockResolver resolver, Long ID_COUNTER){
		String genusName = getGenusNameFromResolver(resolver, type);
		Element blockElement;

		if(genusName == null){
			blockElement = createSpecialVariableDecModel(type, name, getKind(), document, resolver, ID_COUNTER);
			addElement(BlockElementModel.LABEL_NODE_NAME, document, type + "型の変数を作り、" + name + "と名付ける", blockElement);
		}else{
			blockElement = createBlockElement(document, genusName, ID_COUNTER++, getKind());
			addElement(BlockElementModel.LABEL_NODE_NAME, document, name, blockElement);
		}

		addElement(BlockElementModel.NAME_NODE_NAME, document, name, blockElement);
		addElement(BlockElementModel.TYPE_NODE_NAME, document, type, blockElement);

		return blockElement;
	}
	
	public Element createSpecialVariableDecModel(String type, String name, String kind, Document document, BlockResolver resolver, Long ID_COUNTER){
		Element blockElement = createBlockElement(document, "special", ID_COUNTER++, kind);
		return blockElement;
	}
	
	@Override
	public List<Element> getBlockElements() {
		List<Element> commandBlocks = Lists.newArrayList(getElement());
		if (getSocketBlocks().size()>0) {
			for(BlockElementModel model : getSocketBlocks()){
				if(model != null){
					commandBlocks.addAll(model.getBlockElements());
				}
			}
		}
		return commandBlocks;
	}
	
	public String getGenusNameFromResolver(BlockResolver resolver, String type){
		return null;
	}

}
