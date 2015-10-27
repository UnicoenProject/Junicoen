package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class BlockWhileModel extends BlockCommandModel {

	public BlockWhileModel(Element element) {
		this.element = element;
	}

	private List<BlockCommandModel> trueBlocks = new ArrayList<>();

	public void setTrueBlocks(List<BlockCommandModel> trueBlocks) {
		this.trueBlocks = trueBlocks;
	}

	public List<Element> getCommandBlockElements() {
		List<Element> commandBlocks = new ArrayList<>();

		commandBlocks.add(getElement());

		for (BlockExprModel socket : getSocketBlocks()) {
			commandBlocks.addAll(socket.getExprElements());
		}

		for (BlockCommandModel model : trueBlocks) {
			commandBlocks.addAll(model.getCommandBlockElements());
		}

		return commandBlocks;
	}

}
