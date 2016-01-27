package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.common.collect.ImmutableMap;

import net.unicoen.parser.blockeditor.MyDOMUtil;


public class BlockUserMethodCallModel extends BlockCommandModel{
	public static String GENUS_NAME = "callerprocedure";
	private static String KIND = "command";

	public BlockUserMethodCallModel(String methodName, List<String> socketsTypes, Document document, String parentId, Long ID_COUNTER) {
		this.element = createPrototypeElement(methodName, socketsTypes, document, parentId, ID_COUNTER);
	}

	public Element createPrototypeElement(String methodName, List<String> socketsTypes, Document document, String parentId ,Long ID_COUNTER){
		Element root = createBlockStubNode(document, methodName, BlockProcedureModel.GENUS_NAME, parentId);
		Element element = createBlockElement(document, GENUS_NAME, ID_COUNTER, KIND);
		MyDOMUtil.appendChilds(element, MyDOMUtil.createElements(ImmutableMap.of(BlockElementModel.NAME_NODE, methodName, BlockElementModel.LABEL_NODE, methodName), document));
		
		root.appendChild(element);
		return root;
	}

	//TODO should fix Stubクラスを作ってまとめる?　
	public Element createBlockStubNode(Document document, String parentName, String parentGenusName, String parentID) {
		Element blockStubElement = document.createElement(BlockElementModel.BLOCK_STUB_NODE);
		MyDOMUtil.appendChilds(blockStubElement, MyDOMUtil.createElements(ImmutableMap.of(BlockElementModel.STUBPARENTNAME_NODE, parentName, BlockElementModel.STUBPARENTGENUS_NODE, parentGenusName, BlockElementModel.STUBPARENTID_NODE, parentID), document));
		return blockStubElement;
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
