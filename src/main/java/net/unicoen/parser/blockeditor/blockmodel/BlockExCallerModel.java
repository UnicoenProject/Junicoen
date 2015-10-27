package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockExCallerModel extends BlockCommandModel {

	private BlockCommandModel methodBlock;

	public BlockExCallerModel(Element element) {
		this.element = element;
	}

	public void setCallMethod(BlockCommandModel method) {
		this.methodBlock = method;
	}

	public List<Element> getCommandBlockElements() {
		List<Element> commandBlocks = new ArrayList<>();

		commandBlocks.add(getElement());

		for (BlockExprModel socket : getSocketBlocks()) {
			commandBlocks.addAll(socket.getExprElements());
		}

		commandBlocks.addAll(methodBlock.getCommandBlockElements());

		return commandBlocks;
	}

	// @override
	public void addSocketsNode(Document document, SocketsInfo sockets) {
		Element socketsElement = document.createElement("Sockets");
		socketsElement.setAttribute("num-sockets", String.valueOf(sockets.getSockets().size()));
		for (int i = 0; i < getSocketBlocks().size(); i++) {
			sockets.getSockets().get(i).setConnectorBlockID(getSocketBlocks().get(i).getBlockID());
			addSocketNode(document, socketsElement, sockets.getSockets().get(i));
		}

		sockets.getSockets().get(sockets.getSockets().size()-1).setConnectorBlockID(methodBlock.getBlockID());
		addSocketNode(document, socketsElement, sockets.getSockets().get(sockets.getSockets().size()-1));

		this.element.appendChild(socketsElement);
	}

}
