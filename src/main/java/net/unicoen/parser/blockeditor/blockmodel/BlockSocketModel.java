package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class BlockSocketModel extends BlockConnectorInfo{

	public BlockSocketModel(BlockExprModel param) {
		this.label = param.getLabel();
		this.positionType = "single";
		this.connectorType = convertTypeToBlockConnectorType(param.getType());
		this.initType = convertTypeToBlockConnectorType(param.getType());
		this.connectorBlockID = param.getBlockID();
	}

	public BlockSocketModel(String label, String positionType, String connectorType, String initType, String connectorBlockID) {
		this.label = label;
		this.positionType = positionType;
		this.connectorType = connectorType;
		this.initType = initType;
		this.connectorBlockID = connectorBlockID;
	}

	public void setConnectorBlockID(String id) {
		this.connectorBlockID = id;
	}

	public void setConnectorType(String type) {
		this.connectorType = type;
	}

	public String getConnectorKind() {
		return this.connectorKind;
	}

	public String getPositionType() {
		return this.positionType;
	}

	public String getConnectorType() {
		return this.connectorType;
	}

	public String getLabel() {
		return this.label;
	}

	public String getConnectorBlockID() {
		return this.connectorBlockID;
	}

	public String getInitType() {
		return this.initType;
	}

	public Element createBlockConnectorElement(Document document){
		Element connector = document.createElement("BlockConnector");

		connector.setAttribute("connector-kind", "socket");
		connector.setAttribute("position-type", getPositionType());
		connector.setAttribute("label", getLabel());

		if (!"-1".equals(getConnectorBlockID())) {
			connector.setAttribute("con-block-id", getConnectorBlockID());
			connector.setAttribute("connector-type", getConnectorType());
			connector.setAttribute("init-type", getInitType());
		} else {
			connector.setAttribute("connector-type", getConnectorType());
			connector.setAttribute("init-type", getInitType());
		}
		return connector;
	}

}
