package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockExCallGetterModel extends BlockExprModel {

	public static String GENUS_NAME = "callGetterMethod2";

	private BlockElementModel methodBlock;

	public BlockExCallGetterModel(Document document, Long id){
		this.element = createBlockElement(document, GENUS_NAME, id, BlockElementModel.BLOCKKINDS.FUNCTION.toString());
	}

	public void setCalleMethod(BlockElementModel callMethodModel){
		this.methodBlock = callMethodModel;
		addSocketBlock(callMethodModel);
	}

	@Override
	public String getType(){
		return methodBlock.getType();
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

	@Override
	public void addSocketsNode(Document document, BlockSocketsModel sockets) {
		if (sockets.getSockets().size() > 0) {
			Element socketsElement = document.createElement(BlockSocketsModel.NODE_NAME);
			socketsElement.setAttribute(BlockSocketsModel.NUMSOCKETS_ATTR, String.valueOf(sockets.getSockets().size()));
			for (int i = 0;i<sockets.getSockets().size();i++) {
				if(getSocketBlocks().size() > i && getSocketBlocks().get(i)!= null){
					sockets.getSockets().get(i).setConnectorBlockID(getSocketBlocks().get(i).getBlockID());
					sockets.getSockets().get(i).connectorType = convertTypeToBlockConnectorType(getSocketBlocks().get(i).getType());
				}
				addSocketNode(document, socketsElement, sockets.getSockets().get(i));
			}
			getBlockElement().appendChild(socketsElement);
		}
	}
}
