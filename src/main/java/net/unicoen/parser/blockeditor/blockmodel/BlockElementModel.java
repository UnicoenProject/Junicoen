package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockElementModel {

	protected Long id;
	protected Element element;
	public static String NODE_NAME = "Block";
	public static String GENUS_NAME_ATTRIBUTE_TAG = "genus-name";
	public static String ID_ATTRIBUTE_TAG = "id";
	public static String KIND_ATTRIBUTE_TAG = "kind";

	private List<BlockElementModel> socketBlocksElements = new ArrayList<>();

	public BlockElementModel() {
	}

	public Element getElement() {
		return this.element;
	}

	public void setElement(Element element) {
		this.element = element;
	}

	public String getBlockID() {
		return DOMUtil.getAttribute(this.element, ID_ATTRIBUTE_TAG);
	}

	public String getGenusName() {
		return DOMUtil.getAttribute(this.element,GENUS_NAME_ATTRIBUTE_TAG);
	}

	public String getKind() {
		return DOMUtil.getAttribute(this.element, KIND_ATTRIBUTE_TAG);
	}

	public String getType(){
		Node typeNode = DOMUtil.getChildNode(getElement(), "Type");
		if(typeNode == null){
			return null;
		}else{
			return typeNode.getTextContent();
		}
	}

	public List<Element> getBlockElements() {
		List<Element> commandBlocks = new ArrayList<>();

		commandBlocks.add(getElement());
		for (BlockElementModel socket : socketBlocksElements) {
			commandBlocks.addAll(socket.getBlockElements());
		}

		return commandBlocks;
	}

	protected void addSocketBlock(BlockElementModel socket) {
		this.socketBlocksElements.add(socket);
	}

	public List<BlockElementModel> getSocketBlocks() {
		return this.socketBlocksElements;
	}

	public String getIdFromElement(Element element) {
		if (element == null) {
			return "-1";
		}
		if ("BlockStub".equals(element.getNodeName())) {
			return DOMUtil.getAttribute(DOMUtil.getChildNode(element, NODE_NAME), ID_ATTRIBUTE_TAG);
		} else {
			return DOMUtil.getAttribute(element, ID_ATTRIBUTE_TAG);
		}
	}

	public String getSocketConnectorType(String kind) {
		if (kind == null) {
			return "cmd";
		} else {
			return kind;
		}
	}

	public String getLabel() {
		return DOMUtil.getChildNode(element, "Label").getTextContent();
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
		Element element = document.createElement(NODE_NAME);
		element.setAttribute(GENUS_NAME_ATTRIBUTE_TAG, genusName);
		element.setAttribute(ID_ATTRIBUTE_TAG, String.valueOf(id));
		element.setAttribute(KIND_ATTRIBUTE_TAG, kind);

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

	/**
	 * ブロックモデルにソケットに結合されるBlockモデルを追加し，ブロックモデルにソケットノードを追加する
	 * @param socketBlocks
	 * @param document
	 * @param sockets
	 */
	public void addSocketsAndNodes(List<BlockElementModel> socketBlocks, Document document, SocketsInfo sockets){
		for(BlockElementModel socket : socketBlocks){
			addSocketBlock(socket);
		}
		addSocketsNode(document, sockets);
	}

	public void addSocketsNode(Document document, SocketsInfo sockets) {
		if (sockets.getSockets().size() > 0) {
			Element socketsElement = document.createElement("Sockets");
			socketsElement.setAttribute("num-sockets", String.valueOf(sockets.getSockets().size()));
			for (int i = 0;i<sockets.getSockets().size();i++) {
				if(getSocketBlocks().size() > i && getSocketBlocks().get(i)!= null){
					sockets.getSockets().get(i).setConnectorBlockID(getSocketBlocks().get(i).getBlockID());
				}
				addSocketNode(document, socketsElement, sockets.getSockets().get(i));
			}
			this.element.appendChild(socketsElement);
		}
	}

	public void addSocketInfoToList(List<SocketInfo> sockets, BlockElementModel param) {
		if (param != null) {
			sockets.add(new SocketInfo("", "single", convertTypeToBlockConnectorType(param.getType()), "poly", param.getBlockID()));
		} else {
			sockets.add(new SocketInfo("", "single", "poly", "poly", "-1"));
		}
	}

	public void addSocketNode(Document document, Node socketsNode, SocketInfo socketInfo) {
		socketsNode.appendChild(socketInfo.createBlockConnectorElement(document));
	}

	public String calcParamType(UniExpr param, BlockResolver resolver) {
		String type = "";
		if (param instanceof UniStringLiteral) {
			type = "string";
		} else if (param instanceof UniIntLiteral) {
			type = "number";
		} else if (param instanceof UniIdent) {
			type = DOMUtil.getChildNode(resolver.getVariableNameResolver().getVariableNode(((UniIdent) param).name), "Type").getTextContent();
		} else if (param instanceof UniDoubleLiteral) {
			type = "double-number";
		} else {
			throw new RuntimeException(param.toString() + "has not been supported yet.");
		}
		return type;
	}

	public static String convertParamTypeName(String name) {
		if (name.equals("number") || name.equals("double-number")) {
			return "int";
		} else {
			return name;
		}
	}

	/**
	 * このブロックのノードにPlugノードを追加する
	 */
	public void setPlugElement(Document document, PlugInfo plugInfo) {
		this.element.appendChild(plugInfo.createElemnet(document));
	}

	public void addBeforeBlockNode(Document document, String id) {
		Element element = document.createElement("BeforeBlockId");
		element.setTextContent(id);
		getElement().appendChild(element);
	}

	/*
	 * AfterBlockノードを追加する
	 */
	public void addAfterBlockNode(Document document, String id) {
		Element element = document.createElement("AfterBlockId");
		element.setTextContent(id);
		getElement().appendChild(element);
	}

}
