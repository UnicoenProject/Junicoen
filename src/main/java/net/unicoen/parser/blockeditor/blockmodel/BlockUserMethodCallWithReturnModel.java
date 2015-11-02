package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import net.unicoen.node.UniMethodCall;
import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockUserMethodCallWithReturnModel extends BlockExprModel {

	private static String KIND = "function";

	public BlockUserMethodCallWithReturnModel(UniMethodCall method, Document document, BlockResolver resolver, Long ID_COUNTER, Node parent) {
		this.element = createPrototypeElement(method, document, resolver, ID_COUNTER, parent);
	}

	public Element createPrototypeElement(UniMethodCall method, Document document, BlockResolver resolver, Long ID_COUNTER, Node parent){
		String parentID =  resolver.getFieldMethodInfo().getId(BlockMethodCallModel.calcMethodCallGenusName(method.methodName, BlockUserMethodCallModel.transformListToString(method.args, resolver), resolver)).toString();
		Element root = createBlockStubNode(document, method.methodName, BlockProcedureModel.GENUS_NAME, parentID);
		Element element = createBlockElement(document, BlockUserMethodCallModel.GENUS_NAME, ID_COUNTER, KIND);
		addElement(BlockElementModel.NAME_NODE_NAME, document, method.methodName, element);
		addElement(BlockElementModel.LABEL_NODE_NAME, document, method.methodName, element);
		addElement(BlockElementModel.TYPE_NODE_NAME, document, resolver.getFieldMethodInfo().getReturnType(BlockMethodCallModel.calcMethodCallGenusName(method.methodName, BlockMethodCallModel.transformArgToString(method.args, resolver), resolver)), element);

		root.appendChild(element);
		return root;
	}

	//TODO should fix Stubクラスを作ってまとめる?　
	public Element createBlockStubNode(Document document, String parentName, String parentGenusName, String parentID) {
		Element blockStubElement = document.createElement(BlockElementModel.BLOCK_STUB_NODE_NAME);
		addElement("StubParentName", document, parentName, blockStubElement);
		addElement("StubParentGenus", document, parentGenusName, blockStubElement);
		addElement("StubParentID", document, parentID, blockStubElement);
		return blockStubElement;
	}

	public Element getBlockElement(){
		return (Element) DOMUtil.getChildNode(getElement(), BlockElementModel.BLOCK_NODE_NAME);
	}
	
	public void addSocketsAndNodes(List<BlockElementModel> socketBlocks, Document document, SocketsInfo sockets){
		//SocketsInfoの作成
		List<SocketInfo> socketsInfo = new ArrayList<SocketInfo>();
		for (BlockElementModel param : socketBlocks) {
			addSocketInfoToList(socketsInfo, (BlockElementModel)param);
		}

		super.addSocketsAndNodes(socketBlocks, document, new SocketsInfo(socketsInfo));
	}
}
