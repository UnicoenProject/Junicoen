package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

import net.unicoen.parser.blockeditor.AnnotationCommentGetter;
import net.unicoen.parser.blockeditor.DOMUtil;

public class BlockElementModel {

	protected Element element;
	public static String BLOCK_NODE = "Block";
	public static String GENUS_NAME_ATTR = "genus-name";//必須
	public static String ID_ATTR = "id";//必須
	public static String KIND_ATTR = "kind";//必須
	public static String TYPE_NODE = "Type";//任意（モデルによって必要）
	public static String LABEL_NODE = "Label";//任意（モデルによって必要）
	public static String NAME_NODE = "Name";//任意（モデルによって必要）
	public static String LOCATION_NODE = "Location";//任意
	
	public static String BLOCK_STUB_NODE = "BlockStub";
	public static String STUBPARENTNAME_NODE = "StubParentName";
	public static String STUBPARENTGENUS_NODE = "StubParentGenus";
	public static String STUBPARENTID_NODE = "StubParentID";
	
	public static String AFTERBLOCKID_NODE = "AfterBlockId";//任意（モデルによって必要）
	public static String BEFOREBLOCKID_NODE = "BeforeBlockId";//任意（モデルによって必要）
	public static String COMMENT_NODE = "Comment";//任意
	public static String INITLABEL_ATTR = "initlabel";
	
	
	public static enum BLOCKKINDS{
		FUNCTION("function"),COMMAND("command"),DATA("data"),LOCAL_VARDEC("local-variable"),
		GLOBAL_VARDEC("global-variable"),PROCEDURE("procedure"),PARAM("param"),RETURN("return"),SPECIAL("special"),SPECIAL_VARDEC("special-variable");
		private final String text;
		private BLOCKKINDS(String text){
			this.text = text;
		}
		
		@Override
		public String toString(){
			return this.text;
		}
	}
	
	
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
		return DOMUtil.getAttribute(this.element, ID_ATTR);
	}

	public String getGenusName() {
		return DOMUtil.getAttribute(this.element,GENUS_NAME_ATTR);
	}

	public String getKind() {
		return DOMUtil.getAttribute(this.element, KIND_ATTR);
	}

	public String getType(){
		Node typeNode = DOMUtil.getChildNode(getElement(), TYPE_NODE);
		if(typeNode == null){
			return "Object";
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
			return DOMUtil.getAttribute(DOMUtil.getChildNode(element, BLOCK_NODE), ID_ATTR);
		} else {
			return DOMUtil.getAttribute(element, ID_ATTR);
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
		Node label = DOMUtil.getChildNode(element, BlockElementModel.LABEL_NODE);
		if(label == null){
			return "";
		}else{
			return label.getTextContent();			
		}
	}

	public void addLocationElement(Document document, String x, String y, Element blockElement) {
		Element locationElement = document.createElement(BlockElementModel.LOCATION_NODE);
		Element xElement = document.createElement("X");
		Element yElement = document.createElement("Y");

		xElement.setTextContent(x);
		yElement.setTextContent(y);

		locationElement.appendChild(xElement);
		locationElement.appendChild(yElement);

		blockElement.appendChild(locationElement);
	}

	public void addElement(String elementName, Document document, String text, Element blockElement) {
		Element element = document.createElement(elementName);
		element.setTextContent(text);
		blockElement.appendChild(element);
	}

	public Element createBlockElement(Document document, String genusName, long id, String kind) {
		Element element = document.createElement(BLOCK_NODE);
		element.setAttribute(GENUS_NAME_ATTR, genusName);
		element.setAttribute(ID_ATTR, String.valueOf(id));
		element.setAttribute(KIND_ATTR, kind);

		return element;
	}

	public static String convertTypeToBlockConnectorType(String type) {
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
	public void addSocketsAndNodes(List<BlockElementModel> socketBlocks, Document document, BlockSocketsModel sockets){
		for(BlockElementModel socket : socketBlocks){
			addSocketBlock(socket);
		}
		addSocketsNode(document, sockets);
	}


	public void addSocketsNode(Document document, BlockSocketsModel sockets) {
		if (sockets.getSockets().size() > 0) {
			Element socketsElement = document.createElement("Sockets");
			socketsElement.setAttribute("num-sockets", String.valueOf(sockets.getSockets().size()));
			for (int i = 0;i<sockets.getSockets().size();i++) {
				if(getSocketBlocks().size() > i && getSocketBlocks().get(i)!= null){
					sockets.getSockets().get(i).setConnectorBlockID(getSocketBlocks().get(i).getBlockID());
				}
				addSocketNode(document, socketsElement, sockets.getSockets().get(i));
			}
			getBlockElement().appendChild(socketsElement);
		}
	}

	public void addSocketInfoToList(List<BlockSocketModel> sockets, BlockElementModel param) {
		if (param != null) {
			sockets.add(new BlockSocketModel("", "single", convertTypeToBlockConnectorType(param.getType()), "poly", param.getBlockID()));
		} else {
			sockets.add(new BlockSocketModel("", "single", "poly", "poly", "-1"));
		}
	}

	public void addSocketNode(Document document, Node socketsNode, BlockSocketModel socketInfo) {
		socketsNode.appendChild(socketInfo.createBlockConnectorElement(document));
	}

	public static String calcParamType(BlockElementModel param) {
		return convertParamTypeName(param.getType());
	}

	public static String convertParamTypeName(String name) {
		String s = new String(name);
		s = convertTypeToBlockConnectorType(name);
		if (s.equals("number") || s.equals("double-number")) {
			return "int";
		} else {
			return s;
		}
	}

	/**
	 * このブロックのノードにPlugノードを追加する
	 */
	public void setPlugElement(Document document, BlockPlugModel plugInfo) {
		this.element.appendChild(plugInfo.createElemnet(document));
	}

	public void addBeforeBlockNode(Document document, String id) {
		Element element = document.createElement(BEFOREBLOCKID_NODE);
		element.setTextContent(id);
		getBlockElement().appendChild(element);
	}

	public void addAfterBlockNode(Document document, String id) {
		Element element = document.createElement(AFTERBLOCKID_NODE);
		element.setTextContent(id);
		getBlockElement().appendChild(element);
	}

	public Node getPlugNode(){
		return DOMUtil.getChildNode(this.element, BlockPlugModel.NODE_NAME);
	}

	public String getPlugAttribute(String attribute){
		return DOMUtil.getAttribute(DOMUtil.getChildNode(getPlugNode(), BlockConnector.CONNECTOR_NODE), attribute);
	}

	public Element getBlockElement(){
		return this.getElement();
	}

	public List<String> transformToTypeStringList(List<BlockElementModel> args){
		return Lists.transform(args, new Function<BlockElementModel, String>() {
			@Override
			public String apply(BlockElementModel input) {
				return input.getType();
			}
		});
	}
	
	public void addCommentNode(String comment, Document document){
		Element commentElement = document.createElement(COMMENT_NODE);
		commentElement.setTextContent(AnnotationCommentGetter.getCommentText(comment));
		getBlockElement().appendChild(commentElement);
	}
	
}
