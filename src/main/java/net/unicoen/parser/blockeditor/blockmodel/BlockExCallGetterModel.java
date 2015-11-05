package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockExCallGetterModel extends BlockExprModel {

	private static String GENUS_NAME = "callGetterMethod2";
	private static String KIND = "function";

	private BlockElementModel methodBlock;

	public BlockExCallGetterModel(Document document, Long id){
		this.element = createBlockElement(document, GENUS_NAME, id, KIND);
	}

	public void setCalleMethod(BlockElementModel callMethodModel){
		this.methodBlock = callMethodModel;
	}

	// @override
	public List<Element> getBlockElements() {
		List<Element> elements = new ArrayList<Element>();
		elements.add(getElement());

		for(BlockElementModel element : getSocketBlocks()){
			elements.addAll(element.getBlockElements());
		}

		elements.addAll(methodBlock.getBlockElements());

		return elements;
	}

	@Override
	public void addSocketsAndNodes(List<BlockElementModel> socketBlocks, Document document, SocketsInfo sockets){
		for(BlockElementModel socket : socketBlocks){
			addSocketBlock(socket);
		}
		addSocketsNode(document, sockets);
	}

	@Override
	public void addSocketsNode(Document document, SocketsInfo sockets) {
		Element socketsElement = document.createElement("Sockets");
		socketsElement.setAttribute("num-sockets", String.valueOf(sockets.getSockets().size()));
		for (int i = 0; i < getSocketBlocks().size(); i++) {
			sockets.getSockets().get(i).setConnectorBlockID(getSocketBlocks().get(i).getBlockID());
			sockets.getSockets().get(i).setConnectorType(convertTypeToBlockConnectorType(getSocketBlocks().get(i).getType()));
			addSocketNode(document, socketsElement, sockets.getSockets().get(i));
		}

		sockets.getSockets().get(sockets.getSockets().size()-1).setConnectorBlockID(methodBlock.getBlockID());
		addSocketNode(document, socketsElement, sockets.getSockets().get(sockets.getSockets().size()-1));

		this.element.appendChild(socketsElement);
	}

}
