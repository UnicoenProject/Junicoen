package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import net.unicoen.node.UniMethodDec;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockProcedureModel extends BlockElementModel {

	private List<BlockCommandModel> bodyBlocks = new ArrayList<>();
	public static String GENUS_NAME = "procedure";

	public BlockProcedureModel(UniMethodDec dec, Document document, Long ID_COUNTER) {
		initialize(dec, document, ID_COUNTER);
	}

	public void initialize(UniMethodDec funcDec, Document document, Long ID_COUNTER){
		Element procedureElement = createBlockElement(document, GENUS_NAME, ID_COUNTER, GENUS_NAME);

		addElement("Label", document, funcDec.methodName, procedureElement);
		addElement("ReturnType", document, funcDec.returnType, procedureElement);
		addLocationElement(document, "50", "50", procedureElement);

		this.element = procedureElement;
	}

	public void setBodyBlocks(List<BlockCommandModel> bodyBlocks) {
		this.bodyBlocks = bodyBlocks;
	}

	public List<BlockCommandModel> getBodyBlocks() {
		return this.bodyBlocks;
	}

	public void addBlockNodes(Node node) {

		node.appendChild(element);

		for (BlockElementModel param : getSocketBlocks()) {
			node.appendChild(param.getElement());
		}

		for (BlockCommandModel model : bodyBlocks) {
			for (Element element : model.getBlockElements()) {
				node.appendChild(element);
			}
		}
	}

	public void addSocketsAndNodes(List<BlockElementModel> socketBlocks, Document document, SocketsInfo sockets){
		//SocketsInfoの作成
		List<SocketInfo> socketsInfo = new ArrayList<SocketInfo>();
		for (BlockElementModel param : socketBlocks) {
			addSocketInfoToList(socketsInfo, (BlockElementModel)param);
		}
		//procedureは空のソケットを1つ持っていなければいけない
		addSocketInfoToList(socketsInfo, null);

		super.addSocketsAndNodes(socketBlocks, document, new SocketsInfo(socketsInfo));
	}
}
