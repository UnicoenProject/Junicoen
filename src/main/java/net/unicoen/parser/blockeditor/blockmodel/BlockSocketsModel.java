package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockSocketsModel {

	public static String NODE_NAME = "Sockets";
	public static String NUMSOCKETS_ATTR = "num-sockets";
	
	private List<BlockSocketModel> sockets = new ArrayList<>();

	public BlockSocketsModel(List<BlockSocketModel> sockets){
		this.sockets = sockets;
	}

	public void addSocketInfo(BlockSocketModel socket) {
		sockets.add(socket);
	}

	public List<BlockSocketModel> getSockets() {
		return this.sockets;
	}

	public Element createSocketsElement(Document document){
		Element socketsElement = document.createElement(NODE_NAME);
		socketsElement.setAttribute(NUMSOCKETS_ATTR, String.valueOf(sockets.size()));
		for (BlockSocketModel socket : sockets) {
			socketsElement.appendChild(socket.createBlockConnectorElement(document));
		}

		return socketsElement;
	}

}
