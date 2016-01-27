package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockWhileModel extends BlockCommandModel {

	private List<BlockCommandModel> trueBlocks = new ArrayList<>();
	public static String GENUS_NAME = "while";
	public static String KIND = "command";
	
	public BlockWhileModel(Document document, Long id) {
		this.element = createBlockElement(document, GENUS_NAME, id, KIND);
	}

	public void setTrueBlocks(List<BlockCommandModel> trueBlocks) {
		this.trueBlocks = trueBlocks;
	}

	@Override
	public List<Element> getBlockElements() {
		List<Element> commandBlocks = new ArrayList<>();

		commandBlocks.add(getElement());

		for (BlockElementModel socket : getSocketBlocks()) {
			if (socket != null) {
				commandBlocks.addAll(socket.getBlockElements());
			}
		}

		for (BlockCommandModel model : trueBlocks) {
			if (model != null) {
				commandBlocks.addAll(model.getBlockElements());
			}
		}

		return commandBlocks;
	}


}
