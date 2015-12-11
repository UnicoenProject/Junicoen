package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockAbstractBlockModel extends BlockCommandModel {

	private List<BlockElementModel> commandBlocks = new ArrayList<>();

	public BlockAbstractBlockModel(Element element) {
		this.element = element;
	}

	@Override
	public List<Element> getBlockElements() {
		List<Element> elements = new ArrayList<>();

		// Blockの中身を出力
		for (BlockElementModel socket : commandBlocks) {
			elements.addAll(socket.getBlockElements());
		}

		elements.add(getElement());
		return elements;
	}

	@Override
	public void addSocketsAndNodes(List<BlockElementModel> socketBlocks, Document document, BlockSocketsModel sockets) {
		this.commandBlocks = socketBlocks;
		if(socketBlocks.size()>0){
			addSocketBlock(socketBlocks.get(0));
		}
		addSocketsNode(document, sockets);
	}

	@Override
	public void addSocketsNode(Document document, BlockSocketsModel sockets) {
		if (sockets.getSockets().size() > 0) {
			Element socketsElement = document.createElement("Sockets");
			socketsElement.setAttribute("num-sockets", String.valueOf(sockets.getSockets().size()));
			for (int i = 0; i < getSocketBlocks().size(); i++) {
				sockets.getSockets().get(i).setConnectorBlockID(getSocketBlocks().get(i).getBlockID());
				addSocketNode(document, socketsElement, sockets.getSockets().get(i));
			}
			this.element.appendChild(socketsElement);
		}
	}

}
