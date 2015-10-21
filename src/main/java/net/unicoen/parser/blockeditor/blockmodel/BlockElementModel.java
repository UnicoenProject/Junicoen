package net.unicoen.parser.blockeditor.blockmodel;

import java.util.List;

import net.unicoen.parser.blockeditor.BlockMapper;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockElementModel {

	protected Long id;
	protected Element element;

	public BlockElementModel() {
	}

	public Element getElement() {
		return this.element;
	}

	public void setElement(Element element) {
		this.element = element;
	}

	public String getBlockID(){
		return BlockMapper.getAttribute(BlockMapper.getChildNode(this.element, "Block"), "id");
	}

	public String getIdFromElement(Element element) {
		if (element == null) {
			return "-1";
		}
		if ("BlockStub".equals(element.getNodeName())) {
			return BlockMapper.getAttribute(BlockMapper.getChildNode(element, "Block"), "id");
		} else {
			return BlockMapper.getAttribute(element, "id");
		}
	}

	public String getSocketConnectorType(String kind) {
		if (kind == null) {
			return "cmd";
		} else {
			return kind;
		}
	}

	public String getLabel(){
		return BlockMapper.getChildNode(element, "Label").getTextContent();
	}

	public void addLocationElement(Document document, String x, String y, Element blockElement) {
		Element locationElement = document.createElement("Location");
		Element xElement = document.createElement("X");
		Element yElement = document.createElement("Y");

		xElement.setTextContent(x);
		yElement.setTextContent(y);

		locationElement.appendChild(xElement);
		locationElement.appendChild(yElement);

		blockElement.appendChild(locationElement);
	}

	public void addElement(String elementName, Document document, String name, Element blockElement) {
		Element element = document.createElement(elementName);
		element.setTextContent(name);
		blockElement.appendChild(element);
	}

	public Element createBlockElement(Document document, String genusName, long id, String kind) {
		Element element = document.createElement("Block");
		element.setAttribute("genus-name", genusName);
		element.setAttribute("id", String.valueOf(id));
		element.setAttribute("kind", kind);

		return element;
	}

	public String convertTypeToBlockConnectorType(String type) {
		switch (type) {
		case "int":
			return "number";
		case "double":
			return "double-number";
		case "String":
			return type.toLowerCase();
		case "boolean":
			return type;
		default:
			return "object";
		}
	}

	public void addSocketsNode(Document document, Element blockNode, List<SocketInfo> socketsInfo) {
		if (socketsInfo.size() > 0) {
			Element socketsElement = document.createElement("Sockets");
			socketsElement.setAttribute("num-sockets", String.valueOf(socketsInfo.size()));
			for (SocketInfo socket : socketsInfo) {
				addSocketNode(document, socketsElement, socket);
			}
			blockNode.appendChild(socketsElement);
		}
	}

	public void addSocketInfoToList(List<SocketInfo> sockets, BlockExprModel param){
		if(param != null){
			sockets.add(new SocketInfo("", "single", convertTypeToBlockConnectorType(param.getType()), "poly", param.getBlockID()));
		}else{
			sockets.add(new SocketInfo("", "single", "poly", "poly", "-1"));
		}
	}

	public void addSocketNode(Document document, Node socketsNode, SocketInfo socketInfo) {
		socketsNode.appendChild(socketInfo.createBlockConnectorElement(document));
	}

}
