package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class SocketsInfo {

	private List<SocketInfo> sockets = new ArrayList<>();

	public SocketsInfo(List<SocketInfo> sockets){
		this.sockets = sockets;
	}

	public void addSocketInfo(SocketInfo socket) {
		sockets.add(socket);
	}

	public List<SocketInfo> getSockets() {
		return this.sockets;
	}

	public Element createSocketsElement(Document document){
		Element socketsElement = document.createElement("Sockets");
		socketsElement.setAttribute("num-sockets", String.valueOf(sockets.size()));
		for (SocketInfo socket : sockets) {
			socketsElement.appendChild(socket.createBlockConnectorElement(document));
		}

		return socketsElement;
	}

}
