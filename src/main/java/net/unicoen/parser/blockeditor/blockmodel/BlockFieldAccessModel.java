package net.unicoen.parser.blockeditor.blockmodel;


import org.w3c.dom.Document;

public class BlockFieldAccessModel extends BlockExprModel{

	public static String GENUS_NAME = "fieldAccess";
	
	public BlockFieldAccessModel(Document document, Long id){
		this.element = createBlockElement(document, GENUS_NAME, id, BlockElementModel.BLOCKKINDS.FUNCTION.toString());
	}

	@Override
	public String getType(){
		return getSocketBlocks().get(1).getType();
	}

	@Override
	/**
	 * このブロックのノードにPlugノードを追加する
	 */
	public void addPlugElement(Document document, BlockPlugModel plugInfo) {
		String socketBlockType = getType();
		plugInfo.connectorType = socketBlockType != null ?convertTypeToBlockConnectorType(getType()) :  convertTypeToBlockConnectorType("poly");
		this.element.appendChild(plugInfo.createElemnet(document));
	}
}
