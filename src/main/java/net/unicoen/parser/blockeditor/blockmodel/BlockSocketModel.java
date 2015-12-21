package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class BlockSocketModel extends BlockConnector{

	public static String CONNECTOR_TYPE = "socket";
	
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
		Element connector = document.createElement(BlockConnector.CONNECTOR_NODE);

		connector.setAttribute(BlockConnector.CONNECTOR_KIND_TAG, CONNECTOR_TYPE);
		connector.setAttribute(BlockConnector.CONNECTOR_POSITION_TYPE_TAG, getPositionType());
		connector.setAttribute(BlockConnector.CONNECTOR_LABEL_TAG, getLabel());
		
		connector.setAttribute(BlockConnector.CONNECTOR_TYPE_TAG, getConnectorType());
		connector.setAttribute(BlockConnector.CONNECTOR_INIT_TYPE_TAG, getInitType());
		if (!"-1".equals(getConnectorBlockID())) {
			connector.setAttribute(BlockConnector.CONNECTOR_BLOCK_ID_TAG, getConnectorBlockID());
		}
		return connector;
	}

}
