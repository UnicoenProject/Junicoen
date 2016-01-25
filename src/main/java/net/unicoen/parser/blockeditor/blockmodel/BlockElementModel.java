package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockElementModel {

	protected Element element;
	public static String BLOCK_NODE = "Block";
	public static String GENUS_NAME_ATTR = "genus-name";// 必須
	public static String ID_ATTR = "id";// 必須
	public static String KIND_ATTR = "kind";// 必須
	public static String TYPE_NODE = "Type";// 任意（モデルによって必要）
	public static String LABEL_NODE = "Label";// 任意（モデルによって必要）
	public static String NAME_NODE = "Name";// 任意（モデルによって必要）
	public static String LOCATION_NODE = "Location";// 任意
	

	public static String BLOCK_STUB_NODE = "BlockStub";
	public static String STUBPARENTNAME_NODE = "StubParentName";
	public static String STUBPARENTGENUS_NODE = "StubParentGenus";
	public static String STUBPARENTID_NODE = "StubParentID";

	public static String AFTERBLOCKID_NODE = "AfterBlockId";// 任意（モデルによって必要）
	public static String BEFOREBLOCKID_NODE = "BeforeBlockId";// 任意（モデルによって必要）
	public static String COMMENT_NODE = "Comment";// 任意
	public static String INITLABEL_ATTR = "initlabel";

	private List<BlockElementModel> socketBlocksElements = new ArrayList<>();

	public static enum BLOCKKINDS {
		FUNCTION("function"), COMMAND("command"), DATA("data"), LOCAL_VARDEC("local-variable"), GLOBAL_VARDEC("global-variable"), PROCEDURE("procedure"), PARAM("param"), RETURN("return"), SPECIAL("special"), SPECIAL_VARDEC("special-variable"), ABSTRACTION("abstraction"), CAST("cast");

		private final String text;

		private BLOCKKINDS(String text) {
			this.text = text;
		}

		@Override
		public String toString() {
			return this.text;
		}
	}
	

	public Element getElement() {
		return this.element;
	}

	public void setElement(Element element) {
		this.element = element;
	}

	public String getBlockID() {
		return MyDOMUtil.getAttribute(getBlockElement(), ID_ATTR);
	}

	public String getGenusName() {
		return MyDOMUtil.getAttribute(getBlockElement(), GENUS_NAME_ATTR);
	}

	public String getKind() {
		return MyDOMUtil.getAttribute(getBlockElement(), KIND_ATTR);
	}

	public String getType() {
		Node typeNode = MyDOMUtil.getChildNode(getBlockElement(), TYPE_NODE);
		return typeNode == null ? "Object" :  typeNode.getTextContent();
	}
	
	public Element createBlockStubNode(Document document, String parentName, String parentGenusName) {
		Element blockStubElement = document.createElement(BlockElementModel.BLOCK_STUB_NODE);
		MyDOMUtil.appendChilds(blockStubElement, MyDOMUtil.createElements(ImmutableMap.of(BlockElementModel.STUBPARENTNAME_NODE, parentName, BlockElementModel.STUBPARENTGENUS_NODE, parentGenusName), document));
		return blockStubElement;
	}

	public List<Element> getBlockElements() {
		List<Element> commandBlocks = new ArrayList<>();

		commandBlocks.add(getElement());
		for (BlockElementModel socket : socketBlocksElements) {
			if(socket != null){
				commandBlocks.addAll(socket.getBlockElements());	
			}
		}

		return commandBlocks;
	}

	public List<BlockElementModel> getSocketBlocks() {
		return this.socketBlocksElements;
	}

	public String getSocketConnectorType(String kind) {
		if (kind == null) {
			return "cmd";
		} else {
			return kind;
		}
	}

	public Node getPlugNode() {
		return MyDOMUtil.getChildNode(getBlockElement(), BlockPlugModel.NODE_NAME);
	}

	public String getPlugAttribute(String attribute) {
		return MyDOMUtil.getAttribute(MyDOMUtil.getChildNode(getPlugNode(), BlockConnector.CONNECTOR_NODE), attribute);
	}

	public Element getBlockElement() {
		if (getElement().getNodeName().equals(BlockElementModel.BLOCK_NODE)) {
			return getElement();
		} else {
			return (Element) MyDOMUtil.getChildNode(getElement(), BlockElementModel.BLOCK_NODE);
		}
	}

	protected void addSocketBlock(BlockElementModel socket) {
		this.socketBlocksElements.add(socket);
	}

	/*
	 * 以下BlockNode生成に関連するメソッド
	 * 
	 */

	public void addLocationElement(Document document, String x, String y, Element blockElement) {
		Element locationElement = document.createElement(BlockElementModel.LOCATION_NODE);

		MyDOMUtil.appendChilds(locationElement, MyDOMUtil.createElements(ImmutableMap.of("X", x, "Y", y), document));
		
		blockElement.appendChild(locationElement);
	}


	public Element createBlockElement(Document document, String genusName, long id, String kind) {
		Element element = document.createElement(BLOCK_NODE);
		MyDOMUtil.setAttributes(element, ImmutableMap.of(BlockElementModel.GENUS_NAME_ATTR, genusName, BlockElementModel.ID_ATTR, String.valueOf(id), BlockElementModel.KIND_ATTR, kind));
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
	 * 
	 * @param socketBlocks
	 * @param document
	 * @param sockets
	 */
	public void addSocketsAndNodes(List<BlockElementModel> socketBlocks, Document document, BlockSocketsModel sockets) {
		for (BlockElementModel socket : socketBlocks) {
			addSocketBlock(socket);
		}
		addSocketsNode(document, sockets);
	}

	public void addSocketsNode(Document document, BlockSocketsModel sockets) {
		if (getSocketBlocks().size() == sockets.getSockets().size()) {
			// 言語定義ファイルのモデルと引数の数が一緒
			Element socketsElement = document.createElement(BlockSocketsModel.NODE_NAME);
			socketsElement.setAttribute(BlockSocketsModel.NUMSOCKETS_ATTR, String.valueOf(sockets.getSockets().size()));
			for (int i = 0; i < sockets.getSockets().size(); i++) {
				// ソケット情報の更新
				if (getSocketBlocks().size() > i && getSocketBlocks().get(i) != null) {
					sockets.getSockets().get(i).setConnectorBlockID(getSocketBlocks().get(i).getBlockID());
					if (sockets.getSockets().get(i).getConnectorKind() != null && sockets.getSockets().get(i).getConnectorKind().equals("poly")) {
						sockets.getSockets().get(i).updateSocketConnectorType(getSocketBlocks().get(i));
					}
				}
				// ソケットノードの追加
				addSocketNode(document, socketsElement, sockets.getSockets().get(i));
			}
			getBlockElement().appendChild(socketsElement);
		} else {
			Element socketsElement = document.createElement(BlockSocketsModel.NODE_NAME);
			socketsElement.setAttribute(BlockSocketsModel.NUMSOCKETS_ATTR, String.valueOf(getSocketBlocks().size()));
			for (int i = 0; i < getSocketBlocks().size(); i++) {
				// ソケットノードの追加
				addSocketNode(document, socketsElement, new BlockSocketModel(getSocketBlocks().get(i)));
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
		return s.equals("number") || s.equals("double-number") ? "int" : s; 
	}

	/**
	 * このブロックのノードにPlugノードを追加する
	 */
	public void addPlugElement(Document document, BlockPlugModel plugInfo) {
		getBlockElement().appendChild(plugInfo.createElemnet(document));
	}

	public void addBeforeBlockNode(Document document, String id) {
		getBlockElement().appendChild(MyDOMUtil.createElement(BEFOREBLOCKID_NODE, id, document));
	}

	public void addAfterBlockNode(Document document, String id) {		
		getBlockElement().appendChild(MyDOMUtil.createElement(AFTERBLOCKID_NODE, id, document));
	}

	public List<String> transformToTypeStringList(List<BlockElementModel> args) {
		return Lists.transform(args, new Function<BlockElementModel, String>() {
			@Override
			public String apply(BlockElementModel input) {
				return input.getType();
			}
		});
	}

	public void addCommentNode(String comment, Document document) {
		getBlockElement().appendChild(MyDOMUtil.createElement(COMMENT_NODE, comment, document));
	}

}
