package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockFieldAccessModel extends BlockExprModel{

	public static String GENUS_NAME = "fieldAccess";
	
	public BlockFieldAccessModel(Document document, Long id){
		this.element = createBlockElement(document, GENUS_NAME, id, BlockElementModel.BLOCKKINDS.FUNCTION.toString());
	}
	
	// @override
	@Override
	public List<Element> getBlockElements() {
		List<Element> elements = new ArrayList<Element>();
		elements.add(getElement());

		for(BlockElementModel element : getSocketBlocks()){
			elements.addAll(element.getBlockElements());
		}

		return elements;
	}

	@Override
	public String getType(){
		return getSocketBlocks().get(1).getType();
	}

	@Override
	/**
	 * このブロックのノードにPlugノードを追加する
	 */
	public void setPlugElement(Document document, BlockPlugModel plugInfo) {
		String socketBlockType = getType();
		if(socketBlockType != null){
			plugInfo.connectorType = convertTypeToBlockConnectorType(getType());	
		}else{
			plugInfo.connectorType = convertTypeToBlockConnectorType("poly");
		}
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