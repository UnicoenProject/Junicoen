package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import net.unicoen.parser.blockeditor.AnnotationCommentGetter;
import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockAbstractBlockModel extends BlockCommandModel {
	
	private List<BlockElementModel> commandBlocks = new ArrayList<>();
	public static String GENUS_NAME = "abstraction";
	public static String COLLAPSED_NODE = "Collapsed";
	
	public BlockAbstractBlockModel(Document document, Long id) {
		this.element = createBlockElement(document, GENUS_NAME, id, BlockElementModel.BLOCKKINDS.ABSTRACTION.toString());
	}
	
	public void setCollapsed(String comment, Document document){
		String openClose = AnnotationCommentGetter.getOpenClose(comment);
		if(!AnnotationCommentGetter.containsOpen(openClose)){
			Element element = document.createElement(COLLAPSED_NODE);
			getBlockElement().appendChild(element);			
		}
	}
	
	@Override
	public void addCommentNode(String comment, Document document) {
		setCollapsed(comment, document);
		String commentText = AnnotationCommentGetter.getCommentText(comment);
		if(!AnnotationCommentGetter.isEmptyText(commentText)){
			getBlockElement().appendChild(MyDOMUtil.createElement(BlockElementModel.LABEL_NODE, commentText, document));	
		}
	}
	
	@Override
	public List<Element> getBlockElements() {
		List<Element> elements = new ArrayList<>();

		// Blockの中身を出力
		for (BlockElementModel socket : commandBlocks) {
			elements.addAll(socket.getBlockElements());
		}

		elements.add(getElement());
		return elements;
	}

	@Override
	public void addSocketsAndNodes(List<BlockElementModel> socketBlocks, Document document, BlockSocketsModel sockets) {
		this.commandBlocks = socketBlocks;
		if(!socketBlocks.isEmpty()){
			addSocketBlock(socketBlocks.get(0));
		}
		addSocketsNode(document, sockets);
	}

	@Override
	public void addSocketsNode(Document document, BlockSocketsModel sockets) {
		if (!sockets.getSockets().isEmpty()) {
			Element socketsElement = document.createElement(BlockSocketsModel.NODE_NAME);
			socketsElement.setAttribute(BlockSocketsModel.NUMSOCKETS_ATTR, String.valueOf(sockets.getSockets().size()));
			for (int i = 0; i < getSocketBlocks().size(); i++) {
				sockets.getSockets().get(i).setConnectorBlockID(getSocketBlocks().get(i).getBlockID());
				addSocketNode(document, socketsElement, sockets.getSockets().get(i));
			}
			this.element.appendChild(socketsElement);
		}
	}

}
