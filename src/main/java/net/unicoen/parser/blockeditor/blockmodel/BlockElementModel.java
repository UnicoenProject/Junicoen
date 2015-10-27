package net.unicoen.parser.blockeditor.blockmodel;

import java.util.List;

import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.parser.blockeditor.BlockMapper;
import net.unicoen.parser.blockeditor.BlockResolver;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockElementModel {

	protected Long id;
	protected Element element;
	private static String NODE_NAME = "Block";
	private static String GENUS_NAME_ATTRIBUTE_TAG = "genus-name";
	private static String ID_ATTRIBUTE_TAG = "id";
	private static String KIND_ATTRIBUTE_TAG = "kind";

	public BlockElementModel() {
	}

	public Element getElement() {
		return this.element;
	}

	public void setElement(Element element) {
		this.element = element;
	}

	public String getBlockID() {
		return BlockMapper.getAttribute(this.element, ID_ATTRIBUTE_TAG);
	}

	public String getGenusName() {
		return BlockMapper.getAttribute(this.element,GENUS_NAME_ATTRIBUTE_TAG);
	}

	public String getKind() {
		return BlockMapper.getAttribute(this.element, KIND_ATTRIBUTE_TAG);
	}

	public String getIdFromElement(Element element) {
		if (element == null) {
			return "-1";
		}
		if ("BlockStub".equals(element.getNodeName())) {
			return BlockMapper.getAttribute(BlockMapper.getChildNode(element, NODE_NAME), ID_ATTRIBUTE_TAG);
		} else {
			return BlockMapper.getAttribute(element, ID_ATTRIBUTE_TAG);
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

	public void addSocketsNode(Document document, SocketsInfo sockets) {
		if (sockets.getSockets().size() > 0) {
			Element socketsElement = document.createElement("Sockets");
			socketsElement.setAttribute("num-sockets", String.valueOf(sockets.getSockets().size()));
			for (SocketInfo socket : sockets.getSockets()) {
				addSocketNode(document, socketsElement, socket);
			}
			this.element.appendChild(socketsElement);
		}
	}

	public void addSocketInfoToList(List<SocketInfo> sockets, BlockExprModel param) {
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
			type = BlockMapper.getChildNode(resolver.getVariableNameResolver().getVariableNode(((UniIdent) param).name), "Type").getTextContent();
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

	public void setPlugElement(Document document, PlugInfo plugInfo) {
		this.element.appendChild(plugInfo.createElemnet(document));
	}
}
