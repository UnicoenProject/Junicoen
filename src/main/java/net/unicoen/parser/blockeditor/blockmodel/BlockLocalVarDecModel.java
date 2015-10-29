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
		Element blockElement = createBlockElement(document, resolver.getLocalVarDecBlockName(type), ID_COUNTER++, kind);

		addElement("Label", document, name, blockElement);
		addElement("Name", document, name, blockElement);
		addElement("Type", document, type, blockElement);

		return blockElement;
	}

	public List<Element> getBlockElements() {
		List<Element> commandBlocks = new ArrayList<>();

		commandBlocks.add(getElement());
		if (getSocketBlocks().size()>0) {
			for(BlockElementModel model : getSocketBlocks()){
				commandBlocks.addAll(model.getBlockElements());
			}
		}

		return commandBlocks;
	}

}
