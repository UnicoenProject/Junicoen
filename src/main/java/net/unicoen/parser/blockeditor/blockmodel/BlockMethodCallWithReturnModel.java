package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import net.unicoen.node.UniMethodCall;
import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockMethodCallWithReturnModel extends BlockExprModel {

	private List<BlockExprModel> sockets = new ArrayList<>();

	public BlockMethodCallWithReturnModel(UniMethodCall method, Document document, BlockResolver resolver, Long ID_COUNTER, Node parent){
		this.element = createPrototypeElement(method, document, resolver, ID_COUNTER, parent);
	}

	public Element createPrototypeElement(UniMethodCall method, Document document, BlockResolver resolver, Long ID_COUNTER, Node parent){
		String genusName = "";
		String kind = DOMUtil.getAttribute(resolver.getBlockNode(genusName), "kind");
		Element element = createBlockElement(document, genusName, ID_COUNTER, kind);
		addElement("Name", document, method.methodName, element);

		if(!"void".equals(resolver.getType(genusName))){
			addElement("Type", document, resolver.getType(genusName), element);
		}

		return element;
	}

	public List<Element> getBlockElements() {
		List<Element> elements = new ArrayList<Element>();
		elements.add(getElement());
		for (BlockExprModel model : sockets) {
			elements.addAll(model.getBlockElements());
		}
		return elements;
	}

	public void addSocket(BlockExprModel socket) {
		sockets.add(socket);
	}

}
