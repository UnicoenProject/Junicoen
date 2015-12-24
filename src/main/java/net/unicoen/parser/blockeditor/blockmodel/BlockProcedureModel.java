package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.node.UniMethodDec;
import net.unicoen.parser.blockeditor.AnnotationCommentGetter;

public class BlockProcedureModel extends BlockElementModel {

	private List<BlockElementModel> bodyBlocks = new ArrayList<>();
	public static String GENUS_NAME = "procedure";
	public static String KIND = "procedure";
	public static String RETURN_TYPE_NODE = "ReturnType";
	public static String INVISIBLE_NODE = "Invisible";
	
	public BlockProcedureModel(UniMethodDec dec, Document document, Long ID_COUNTER) {
		initialize(dec, document, ID_COUNTER);
	}
	
	public void initialize(UniMethodDec funcDec, Document document, Long ID_COUNTER){
		Element procedureElement = createBlockElement(document, GENUS_NAME, ID_COUNTER, KIND);

		addElement(BlockElementModel.LABEL_NODE, document, funcDec.methodName, procedureElement);
		addElement(RETURN_TYPE_NODE, document, funcDec.returnType, procedureElement);
		addLocationElement(document, "50", "50", procedureElement);
		
		this.element = procedureElement;
	}

	public void setBodyBlocks(List<BlockElementModel> bodyBlocks) {
		this.bodyBlocks = bodyBlocks;
	}

	public List<BlockElementModel> getBodyBlocks() {
		return this.bodyBlocks;
	}

	public void addBlockNodes(Node node) {

		node.appendChild(element);

		for (BlockElementModel param : getSocketBlocks()) {
			node.appendChild(param.getElement());
		}

		for (BlockElementModel model : bodyBlocks) {
			for (Element element : model.getBlockElements()) {
				node.appendChild(element);
			}
		}
	}

	@Override
	public void addSocketsAndNodes(List<BlockElementModel> socketBlocks, Document document, BlockSocketsModel sockets){
		//SocketsInfoの作成
		List<BlockSocketModel> socketsInfo = new ArrayList<BlockSocketModel>();
		for (BlockElementModel param : socketBlocks) {
			addSocketInfoToList(socketsInfo, param);
		}
		//procedureは空のソケットを1つ持っていなければいけない
		addSocketInfoToList(socketsInfo, null);

		super.addSocketsAndNodes(socketBlocks, document, new BlockSocketsModel(socketsInfo));
	}
	
	public void addInvisibleNode(Document document, String comment){
		String visible = AnnotationCommentGetter.getVisible(comment);
		if(!visible.equals(AnnotationCommentGetter.NOT_FOUND) && AnnotationCommentGetter.containsInvisible(visible)){
			this.getBlockElement().appendChild(document.createElement(INVISIBLE_NODE));
		}
	}
}
