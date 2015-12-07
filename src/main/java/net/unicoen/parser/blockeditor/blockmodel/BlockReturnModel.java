package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.common.collect.Lists;

public class BlockReturnModel extends BlockCommandModel {

	public static String KIND = "return";
	
	public BlockReturnModel(Element element, BlockExprModel socket, Document document) {
		this.element = element;
		List<BlockSocketModel> sockets = new ArrayList<BlockSocketModel>();
		//returnのソケットブロックを，resolverからコピーしてtype取得したほうが良いかも
		addSocketInfoToList(sockets, socket);
		addSocketsAndNodes(Lists.newArrayList((BlockElementModel)socket), document, new BlockSocketsModel(sockets));;
	}
}
