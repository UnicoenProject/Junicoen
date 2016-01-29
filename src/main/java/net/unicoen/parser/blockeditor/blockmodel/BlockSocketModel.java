package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.common.collect.ImmutableMap;

import net.unicoen.parser.blockeditor.MyDOMUtil;


public class BlockSocketModel extends BlockConnector{

	public static String CONNECTOR_TYPE = "socket";
	
	public BlockSocketModel(BlockElementModel param) {
		this.label = "";
		this.positionType = "single";
		this.connectorBlockID = param.getBlockID();
		if(param instanceof BlockExprModel){
			this.connectorType = convertTypeToBlockConnectorType(param.getType());
			this.initType = convertTypeToBlockConnectorType(param.getType());			
		}else{
			this.connectorType = "cmd";
			this.initType = "cmd";
		}
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

		MyDOMUtil.setAttributes(connector, ImmutableMap.of(BlockConnector.CONNECTOR_KIND_ATTR, CONNECTOR_TYPE, BlockConnector.CONNECTOR_POSITION_TYPE_ATTR, getPositionType(), BlockConnector.CONNECTOR_LABEL_ATTR, getLabel(), BlockConnector.CONNECTOR_TYPE_ATTR, getConnectorType(), BlockConnector.CONNECTOR_INIT_TYPE_ATTR, getInitType()));
		
		if (!"-1".equals(getConnectorBlockID())) {
			connector.setAttribute(BlockConnector.CONNECTOR_BLOCK_ID_ATTR, getConnectorBlockID());
		}
		return connector;
	}
	
	public void updateSocketConnectorType(BlockElementModel realArgBlock){
		if(realArgBlock == null){
			return;
		}
		this.connectorType = BlockElementModel.calcParamType(realArgBlock);
	}

}
