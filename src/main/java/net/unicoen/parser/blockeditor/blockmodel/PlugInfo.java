package net.unicoen.parser.blockeditor.blockmodel;

import net.unicoen.parser.blockeditor.DOMUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class PlugInfo {

	private String label = "";
	private String connectorType = "object";
	private String positionType = "single";
	private String connectorBlockID = "-1";

	/**
	 *
	 * @param plugNode Plugを追加するブロックのオリジナルのPlugノード
	 * @param connectorID Plugの結合先のID
	 */
	public PlugInfo(Node plugNode, String connectorID) {
			this.label = DOMUtil.getAttribute(plugNode, "label");
			this.connectorType = DOMUtil.getAttribute(plugNode, "connector-type");
			this.positionType = DOMUtil.getAttribute(plugNode, "position-type");
			this.connectorBlockID = connectorID;
	}

	public PlugInfo(String label, String connectorType, String positionType, String connectorID){
		this.label = label;
		this.connectorBlockID = connectorID;
		this.positionType = positionType;
		this.connectorType = connectorType;
	}

	public Element createElemnet(Document document){
		Element plugNode = document.createElement("Plug");
		Element blockConnectorNode = document.createElement("BlockConnector");

		blockConnectorNode.setAttribute("con-block-id", this.connectorBlockID);
		blockConnectorNode.setAttribute("connector-kind", "plug");
		blockConnectorNode.setAttribute("connector-type", this.connectorType);
		blockConnectorNode.setAttribute("init-type", this.connectorType);
		blockConnectorNode.setAttribute("label", label);
		blockConnectorNode.setAttribute("position-type", positionType);

		plugNode.appendChild(blockConnectorNode);

		return plugNode;
	}


}
