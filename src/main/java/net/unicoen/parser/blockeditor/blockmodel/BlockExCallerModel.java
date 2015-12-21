package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockExCallerModel extends BlockCommandModel {

	private BlockCommandModel methodBlock;
	private static String GENUS_NAME = "callActionMethod2";

	public BlockExCallerModel(Document document, Long id) {
		this.element = createBlockElement(document, GENUS_NAME, id, KIND);
	}

	public void setCallMethod(BlockCommandModel method) {
		this.methodBlock = method;
	}

	@Override
	public List<Element> getBlockElements() {
		List<Element> commandBlocks = new ArrayList<>();
		commandBlocks.add(getElement());
		for (BlockElementModel socket : getSocketBlocks()) {
			commandBlocks.addAll(socket.getBlockElements());
		}

		commandBlocks.addAll(methodBlock.getBlockElements());
		return commandBlocks;
	}

}
