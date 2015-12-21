package net.unicoen.parser.blockeditor.blockmodel;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.parser.blockeditor.DOMUtil;

public class BlockExprModel extends BlockElementModel {

	public Map<String, String> calcPlugInfo(Node plugNode) {
		if (plugNode == null) {
			return null;
		} else {
			Map<String, String> socketsInfo = new HashMap<>();
			socketsInfo.put(BlockSocketModel.CONNECTOR_LABEL_ATTR, DOMUtil.getAttribute(plugNode, BlockPlugModel.CONNECTOR_LABEL_ATTR));
			socketsInfo.put(BlockSocketModel.CONNECTOR_TYPE_ATTR, DOMUtil.getAttribute(plugNode, BlockPlugModel.CONNECTOR_TYPE_ATTR));
			socketsInfo.put(BlockSocketModel.CONNECTOR_POSITION_TYPE_ATTR, DOMUtil.getAttribute(plugNode, BlockPlugModel.CONNECTOR_POSITION_TYPE_ATTR));

			return socketsInfo;
		}
	}

	public void addPlugElement(Document document, Element target, String parentBlockID, String plugType, String positionType) {
		Element plugNode = document.createElement(BlockPlugModel.NODE_NAME);
		Element blockConnectorNode = document.createElement("BlockConnector");

		blockConnectorNode.setAttribute(BlockPlugModel.CONNECTOR_BLOCK_ID_ATTR, parentBlockID);
		blockConnectorNode.setAttribute(BlockPlugModel.CONNECTOR_KIND_ATTR, "plug");
		blockConnectorNode.setAttribute(BlockPlugModel.CONNECTOR_TYPE_ATTR, plugType);
		blockConnectorNode.setAttribute(BlockPlugModel.CONNECTOR_INIT_TYPE_ATTR, plugType);
		blockConnectorNode.setAttribute(BlockPlugModel.CONNECTOR_LABEL_ATTR, "");
		blockConnectorNode.setAttribute(BlockPlugModel.CONNECTOR_POSITION_TYPE_ATTR, positionType);

		plugNode.appendChild(blockConnectorNode);

		target.appendChild(plugNode);
	}

	public Element createBlockStubNode(Document document, String parentName, String parentGenusName) {
		Element blockStubElement = document.createElement(BlockElementModel.BLOCK_STUB_NODE);
		addElement(BlockElementModel.STUBPARENTNAME_NODE, document, parentName, blockStubElement);
		addElement(BlockElementModel.STUBPARENTGENUS_NODE, document, parentGenusName, blockStubElement);
		return blockStubElement;
	}

	public Element createVariableBlockNode(Document document, String genusName, String name, String kind, String type, Long id) {
		Element blockElement = createBlockElement(document, genusName, id, kind);
		addElement(BlockElementModel.LABEL_NODE, document, name, blockElement);
		addElement(BlockElementModel.NAME_NODE, document, name, blockElement);
		addElement(BlockElementModel.TYPE_NODE, document, type, blockElement);
		return blockElement;
	}

}
