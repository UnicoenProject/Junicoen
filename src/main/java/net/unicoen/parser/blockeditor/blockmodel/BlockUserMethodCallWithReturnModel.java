package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import net.unicoen.parser.blockeditor.BlockResolver;

public class BlockUserMethodCallWithReturnModel extends BlockExprModel {

	private static String KIND = "function";

	public BlockUserMethodCallWithReturnModel(String methodName, List<String> sockets, Document document, BlockResolver resolver, Long ID_COUNTER) {
		this.element = createPrototypeElement(methodName,sockets, document, resolver, ID_COUNTER);
	}

	public Element createPrototypeElement(String methodName, List<String> sockets, Document document, BlockResolver resolver, Long ID_COUNTER){
		String parentID =  resolver.getMehtodResolver().getFieldMethodInfo().getId(BlockMethodCallModel.calcMethodCallGenusName(methodName, sockets)).toString();
		Element root = createBlockStubNode(document, methodName, BlockProcedureModel.GENUS_NAME, parentID);
		Element element = createBlockElement(document, BlockUserMethodCallModel.GENUS_NAME, ID_COUNTER, KIND);
		addElement(BlockElementModel.NAME_NODE, document, methodName, element);
		addElement(BlockElementModel.LABEL_NODE, document, methodName, element);
		addElement(BlockElementModel.TYPE_NODE, document, resolver.getMehtodResolver().getFieldMethodInfo().getReturnType(BlockMethodCallModel.calcMethodCallGenusName(methodName, sockets)), element);

		root.appendChild(element);
		return root;
	}

	//TODO should fix Stubクラスを作ってまとめる?　
	public Element createBlockStubNode(Document document, String parentName, String parentGenusName, String parentID) {
		Element blockStubElement = document.createElement(BlockElementModel.BLOCK_STUB_NODE);
		addElement(BlockElementModel.STUBPARENTNAME_NODE, document, parentName, blockStubElement);
		addElement(BlockElementModel.STUBPARENTGENUS_NODE, document, parentGenusName, blockStubElement);
		addElement(BlockElementModel.STUBPARENTID_NODE, document, parentID, blockStubElement);
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
