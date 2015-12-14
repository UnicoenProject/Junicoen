package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockDoWhileModel extends BlockCommandModel {

	private List<BlockCommandModel> trueBlocks = new ArrayList<>();
	public static String GENUS_NAME = "dowhile";
	
	public BlockDoWhileModel(Document document, Long id, List<BlockCommandModel> trueBlocks) {
		this.element = createBlockElement(document, GENUS_NAME, id, KIND);
		this.trueBlocks = trueBlocks;
	}

	@Override
	public List<Element> getBlockElements() {
		List<Element> commandBlocks = new ArrayList<>();

		commandBlocks.add(getElement());

		for (BlockCommandModel model : trueBlocks) {
			commandBlocks.addAll(model.getBlockElements());
		}

		for (BlockElementModel socket : getSocketBlocks()) {
			commandBlocks.addAll(socket.getBlockElements());
		}

		return commandBlocks;
	}

	public void addSocketsAndNodes(List<BlockElementModel> socketBlocks, List<BlockCommandModel> commands, Document document, BlockSocketsModel sockets){
		addSocketsAndNodes(socketBlocks, document, sockets);
		this.trueBlocks = commands;
	}

}
