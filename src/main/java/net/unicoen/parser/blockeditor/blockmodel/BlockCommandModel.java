package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import net.unicoen.parser.blockeditor.BlockMapper;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockCommandModel extends BlockElementModel {

	private List<BlockExprModel> socketBlocksElements = new ArrayList<>();

	public List<Element> getCommandBlockElements() {
		List<Element> commandBlocks = new ArrayList<>();

		commandBlocks.add(getElement());
		for (BlockExprModel socket : socketBlocksElements) {
			commandBlocks.addAll(socket.getExprElements());
		}

		return commandBlocks;
	}

	public void addSocketBlock(BlockExprModel socket) {
		this.socketBlocksElements.add(socket);
	}

	public List<BlockExprModel> getSocketBlocks() {
		return this.socketBlocksElements;
	}

	// @override
	public void addSocketsNode(Document document, SocketsInfo sockets) {
		if (sockets.getSockets().size() > 0) {
			Element socketsElement = document.createElement("Sockets");
			socketsElement.setAttribute("num-sockets", String.valueOf(sockets.getSockets().size()));
			for (int i = 0;i<sockets.getSockets().size();i++) {
				sockets.getSockets().get(i).setConnectorBlockID(getSocketBlocks().get(i).getBlockID());
				addSocketNode(document, socketsElement, sockets.getSockets().get(i));
			}
			this.element.appendChild(socketsElement);
		}
	}

	public static void addBeforeBlockNode(Document document, Element blockNode, String id) {
		Element element = document.createElement("BeforeBlockId");
		element.setTextContent(id);

		if (blockNode.getNodeName().equals("BlockStub")) {
			BlockMapper.getChildNode(blockNode, "Block").appendChild(element);
		} else {
			blockNode.appendChild(element);
		}
	}

}
