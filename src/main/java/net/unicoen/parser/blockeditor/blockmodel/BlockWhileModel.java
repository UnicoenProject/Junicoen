package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockWhileModel extends BlockCommandModel {

	private List<BlockCommandModel> trueBlocks = new ArrayList<>();

	public BlockWhileModel(Element element) {
		this.element = element;
	}

	public void setTrueBlocks(List<BlockCommandModel> trueBlocks) {
		this.trueBlocks = trueBlocks;
	}

	public List<Element> getBlockElements() {
		List<Element> commandBlocks = new ArrayList<>();

		commandBlocks.add(getElement());

		for (BlockElementModel socket : getSocketBlocks()) {
			commandBlocks.addAll(socket.getBlockElements());
		}

		for (BlockCommandModel model : trueBlocks) {
			commandBlocks.addAll(model.getBlockElements());
		}

		return commandBlocks;
	}


	public void addSocketsAndNodes(List<BlockElementModel> socketBlocks, List<BlockCommandModel> commands, Document document, SocketsInfo sockets){
		addSocketsAndNodes(socketBlocks, document, sockets);
		this.trueBlocks = commands;
	}

}
