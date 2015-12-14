package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;

import com.google.common.collect.Lists;

public class BlockReturnModel extends BlockCommandModel {

	public static String KIND = "return";
	public static String GENUS_NAME = "return";
	
	public BlockReturnModel(Document document, Long id, BlockExprModel socket) {
		this.element = createBlockElement(document, GENUS_NAME, id, KIND);
		
		List<BlockSocketModel> sockets = new ArrayList<BlockSocketModel>();
		//returnのソケットブロックを，resolverからコピーしてtype取得したほうが良いかも
		addSocketInfoToList(sockets, socket);
		addSocketsAndNodes(Lists.newArrayList((BlockElementModel)socket), document, new BlockSocketsModel(sockets));
	}
}
