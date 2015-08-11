package net.unicoen.parser.blockeditor.blockmodel;

public class SocketInfo {

	private String connectorKind = "socket";
	private String positionType;
	private String label;
	private String connectorBlockID = "-1";
	private String connectorType;
	private String initType;

	public SocketInfo(String label, String positionType, String connectorType, String initType){
		this.label = label;
		this.positionType = positionType;
		this.connectorType = connectorType;
		this.initType = initType;
	}

	public void setConnectorBlockID(String id){
		this.connectorBlockID = id;
	}

	public String getConnectorKind(){
		return this.connectorKind;
	}

	public String getPositionType(){
		return this.positionType;
	}

	public String getConnectorType(){
		return this.connectorType;
	}

	public String getLabel(){
		return this.label;
	}

	public String getConnectorBlockID(){
		return this.connectorBlockID;
	}

	public String getInitType(){
		return this.initType;
	}


}
