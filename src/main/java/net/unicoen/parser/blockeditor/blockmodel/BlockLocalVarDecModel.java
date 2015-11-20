package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import net.unicoen.parser.blockeditor.BlockResolver;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockLocalVarDecModel extends BlockCommandModel {

	private static String KIND = "local-variable";

	public BlockLocalVarDecModel(String type, String name, Document document, BlockResolver resolver, Long ID_COUNTER) {
		element = createLocalVaribleElement(type, name, KIND, document, resolver, ID_COUNTER);
	}

	public Element createLocalVaribleElement(String type, String name, String kind, Document document, BlockResolver resolver, Long ID_COUNTER){
		String genusName = resolver.getLocalVarDecBlockName(type);
		Element blockElement;

		if(genusName == null){
			blockElement = createSpecialVariableDecModel(type, name, KIND, document, resolver, ID_COUNTER);
			addElement(BlockElementModel.LABEL_NODE_NAME, document, type + "型の変数を作り、" + name + "と名付ける", blockElement);
		}else{
			blockElement = createBlockElement(document, genusName, ID_COUNTER++, kind);
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

	public List<Element> getBlockElements() {
		List<Element> commandBlocks = new ArrayList<>();

		commandBlocks.add(getElement());
		if (getSocketBlocks().size()>0) {
			for(BlockElementModel model : getSocketBlocks()){
				if(model != null){
					commandBlocks.addAll(model.getBlockElements());
				}
			}
		}

		return commandBlocks;
	}

}
