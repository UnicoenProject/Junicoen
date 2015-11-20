package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockUserMethodCallWithReturnModel extends BlockExprModel {

	private static String KIND = "function";

	public BlockUserMethodCallWithReturnModel(String methodName, List<String> sockets, Document document, BlockResolver resolver, Long ID_COUNTER) {
		this.element = createPrototypeElement(methodName,sockets, document, resolver, ID_COUNTER);
	}

	public Element createPrototypeElement(String methodName, List<String> sockets, Document document, BlockResolver resolver, Long ID_COUNTER){
		String parentID =  resolver.getFieldMethodInfo().getId(BlockMethodCallModel.calcMethodCallGenusName(methodName, sockets, resolver)).toString();
		Element root = createBlockStubNode(document, methodName, BlockProcedureModel.GENUS_NAME, parentID);
		Element element = createBlockElement(document, BlockUserMethodCallModel.GENUS_NAME, ID_COUNTER, KIND);
		addElement(BlockElementModel.NAME_NODE_NAME, document, methodName, element);
		addElement(BlockElementModel.LABEL_NODE_NAME, document, methodName, element);
		addElement(BlockElementModel.TYPE_NODE_NAME, document, resolver.getFieldMethodInfo().getReturnType(BlockMethodCallModel.calcMethodCallGenusName(methodName, sockets, resolver)), element);

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

	public void addSocketsAndNodes(List<BlockElementModel> socketBlocks, Document document, BlockSocketsModel sockets){
		//SocketsInfoの作成
		List<BlockSocketModel> socketsInfo = new ArrayList<BlockSocketModel>();
		for (BlockElementModel param : socketBlocks) {
			addSocketInfoToList(socketsInfo, (BlockElementModel)param);
		}

		super.addSocketsAndNodes(socketBlocks, document, new BlockSocketsModel(socketsInfo));
	}
}
