package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockReturnModel extends BlockCommandModel {

	public BlockReturnModel(Element element, BlockExprModel socket, Document document) {
		this.element = element;
		List<SocketInfo> sockets = new ArrayList<SocketInfo>();
		//returnのソケットブロックを，resolverからコピーしてtype取得したほうが良いかも
		addSocketInfoToList(sockets, socket);

		addSocketsNode(document, new SocketsInfo(sockets));
		addSocketBlock(socket);
	}
}
