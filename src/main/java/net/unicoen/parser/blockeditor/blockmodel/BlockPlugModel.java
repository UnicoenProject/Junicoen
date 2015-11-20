package net.unicoen.parser.blockeditor.blockmodel;

import net.unicoen.parser.blockeditor.DOMUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockPlugModel extends BlockConnectorInfo{

	public static String NODE_NAME = "Plug";
	/**
	 *
	 * @param plugNode Plugを追加するブロックのオリジナルのPlugノード
	 * @param connectorID Plugの結合先のID
	 */
	public BlockPlugModel(Node plugNode, String connectorID) {
			this.label = DOMUtil.getAttribute(plugNode, CONNECTOR_LABEL_TAG);
			this.connectorType = DOMUtil.getAttribute(plugNode, CONNECTOR_TYPE_TAG);
			this.positionType = DOMUtil.getAttribute(plugNode, CONNECTOR_POSITION_TYPE_TAG);
			this.connectorBlockID = connectorID;
	}

	public BlockPlugModel(String label, String connectorType, String positionType, String connectorID){
		this.label = label;
		this.connectorBlockID = connectorID;
		this.positionType = positionType;
		this.connectorType = connectorType;
	}

	public Element createElemnet(Document document){
		Element plugNode = document.createElement("Plug");
		Element blockConnectorNode = document.createElement("BlockConnector");

		blockConnectorNode.setAttribute(CONNECTOR_BLOCK_ID_TAG, this.connectorBlockID);
		blockConnectorNode.setAttribute(CONNECTOR_KIND_TAG , "plug");
		blockConnectorNode.setAttribute(CONNECTOR_TYPE_TAG, this.connectorType);
		blockConnectorNode.setAttribute(CONNECTOR_INIT_TYPE_TAG, this.connectorType);
		blockConnectorNode.setAttribute(CONNECTOR_LABEL_TAG, label);
		blockConnectorNode.setAttribute(CONNECTOR_POSITION_TYPE_TAG, positionType);

		plugNode.appendChild(blockConnectorNode);

		return plugNode;
	}
}
