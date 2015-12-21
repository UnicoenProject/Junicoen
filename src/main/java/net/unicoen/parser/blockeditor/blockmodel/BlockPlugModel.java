package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.parser.blockeditor.DOMUtil;

public class BlockPlugModel extends BlockConnector{

	public static String NODE_NAME = "Plug";
	/**
	 *
	 * @param plugNode Plugを追加するブロックのオリジナルのPlugノード
	 * @param connectorID Plugの結合先のID
	 */
	public BlockPlugModel(Node plugNode, String connectorID) {
			this.label = DOMUtil.getAttribute(plugNode, CONNECTOR_LABEL_ATTR);
			this.connectorType = DOMUtil.getAttribute(plugNode, CONNECTOR_TYPE_ATTR);
			this.positionType = DOMUtil.getAttribute(plugNode, CONNECTOR_POSITION_TYPE_ATTR);
			this.connectorBlockID = connectorID;
	}

	public BlockPlugModel(String label, String connectorType, String positionType, String connectorID){
		this.label = label;
		this.connectorBlockID = connectorID;
		this.positionType = positionType;
		this.connectorType = connectorType;
	}

	public Element createElemnet(Document document){
		Element plugNode = document.createElement(NODE_NAME);
		Element blockConnectorNode = document.createElement(BlockConnector.CONNECTOR_NODE);

		if (this.connectorBlockID == null) {
			throw new RuntimeException("parent id is null");
		}
		
		blockConnectorNode.setAttribute(CONNECTOR_BLOCK_ID_ATTR, this.connectorBlockID);
		blockConnectorNode.setAttribute(CONNECTOR_KIND_ATTR , "plug");
		blockConnectorNode.setAttribute(CONNECTOR_TYPE_ATTR, this.connectorType);
		blockConnectorNode.setAttribute(CONNECTOR_INIT_TYPE_ATTR, this.connectorType);
		blockConnectorNode.setAttribute(CONNECTOR_LABEL_ATTR, label);
		blockConnectorNode.setAttribute(CONNECTOR_POSITION_TYPE_ATTR, positionType);

		plugNode.appendChild(blockConnectorNode);

		return plugNode;
	}
}
