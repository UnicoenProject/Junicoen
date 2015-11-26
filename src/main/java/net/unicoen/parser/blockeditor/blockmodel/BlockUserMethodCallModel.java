package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;


public class BlockUserMethodCallModel extends BlockCommandModel{
	public static String GENUS_NAME = "callerprocedure";
	private static String KIND = "command";

	public BlockUserMethodCallModel(String methodName, List<String> socketsTypes, Document document, BlockResolver resolver, Long ID_COUNTER) {
		this.element = createPrototypeElement(methodName, socketsTypes, document, resolver, ID_COUNTER);
	}

	public Element createPrototypeElement(String methodName, List<String> socketsTypes, Document document, BlockResolver resolver, Long ID_COUNTER){
		String parentID =  resolver.getMehtodResolver().getFieldMethodInfo().getId(BlockMethodCallModel.calcMethodCallGenusName(methodName, socketsTypes)).toString();
		Element root = createBlockStubNode(document, methodName, BlockProcedureModel.GENUS_NAME, parentID);
		Element element = createBlockElement(document, GENUS_NAME, ID_COUNTER, KIND);
		addElement(BlockElementModel.NAME_NODE_NAME, document, methodName, element);
		addElement(BlockElementModel.LABEL_NODE_NAME, document, methodName, element);

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

	@Override
	public Element getBlockElement(){
		return (Element) DOMUtil.getChildNode(getElement(), BlockElementModel.BLOCK_NODE_NAME);
	}

	@Override
	public void addSocketsAndNodes(List<BlockElementModel> socketBlocks, Document document, BlockSocketsModel sockets){
		//SocketsInfoの作成
		List<BlockSocketModel> socketsInfo = new ArrayList<BlockSocketModel>();
		for (BlockElementModel param : socketBlocks) {
			addSocketInfoToList(socketsInfo, param);
		}

		super.addSocketsAndNodes(socketBlocks, document, new BlockSocketsModel(socketsInfo));
	}

}
