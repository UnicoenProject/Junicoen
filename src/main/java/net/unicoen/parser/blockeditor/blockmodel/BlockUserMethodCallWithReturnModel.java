package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockUserMethodCallWithReturnModel extends BlockExprModel {

	private static String KIND = "function";

	public BlockUserMethodCallWithReturnModel(String methodName, List<String> sockets, Document document, BlockResolver resolver, Long ID_COUNTER) {
		this.element = createPrototypeElement(methodName,sockets, document, resolver, ID_COUNTER);
	}

	public Element createPrototypeElement(String methodName, List<String> sockets, Document document, BlockResolver resolver, Long ID_COUNTER){
		String parentID =  resolver.getMehtodResolver().getFieldMethodInfo().getId(BlockMethodCallModel.calcMethodCallGenusName(methodName, sockets)).toString();
		Element root = createBlockStubNode(document, methodName, BlockProcedureModel.GENUS_NAME, parentID);
		Element element = createBlockElement(document, BlockUserMethodCallModel.GENUS_NAME, ID_COUNTER, KIND);
		
		MyDOMUtil.appendChilds(element, Lists.newArrayList(MyDOMUtil.createElement(BlockElementModel.NAME_NODE, methodName, document), MyDOMUtil.createElement(BlockElementModel.LABEL_NODE, methodName, document),MyDOMUtil.createElement(BlockElementModel.TYPE_NODE, resolver.getMehtodResolver().getFieldMethodInfo().getReturnType(BlockMethodCallModel.calcMethodCallGenusName(methodName, sockets)), document)));

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
