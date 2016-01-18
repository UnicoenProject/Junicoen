package net.unicoen.parser.blockeditor.blockmodel;

public class BlockConnector {

	public static String CONNECTOR_NODE = "BlockConnector";
	
	public static String CONNECTOR_BLOCK_ID_ATTR = "con-block-id";
	public static String CONNECTOR_KIND_ATTR = "connector-kind";
	public static String CONNECTOR_TYPE_ATTR = "connector-type";
	public static String CONNECTOR_INIT_TYPE_ATTR = "init-type";
	public static String CONNECTOR_LABEL_ATTR = "label";
	public static String CONNECTOR_POSITION_TYPE_ATTR = "position-type";

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
