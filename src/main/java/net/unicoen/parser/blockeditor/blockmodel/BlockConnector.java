package net.unicoen.parser.blockeditor.blockmodel;

public class BlockConnector {

	public static String CONNECTOR_NODE = "BlockConnector";
	
	public static String CONNECTOR_BLOCK_ID_TAG = "con-block-id";
	public static String CONNECTOR_KIND_TAG = "connector-kind";
	public static String CONNECTOR_TYPE_TAG = "connector-type";
	public static String CONNECTOR_INIT_TYPE_TAG = "init-type";
	public static String CONNECTOR_LABEL_TAG = "label";
	public static String CONNECTOR_POSITION_TYPE_TAG = "position-type";

	protected String connectorKind;
	protected String positionType;
	protected String label = "";
	protected String connectorBlockID = "-1";
	protected String connectorType = "poly";
	protected String initType;

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

}
