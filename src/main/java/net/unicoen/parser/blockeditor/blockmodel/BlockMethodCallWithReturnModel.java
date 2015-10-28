package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import net.unicoen.node.UniExpr;
import net.unicoen.node.UniMethodCall;
import net.unicoen.parser.blockeditor.BlockMapper;
import net.unicoen.parser.blockeditor.BlockResolver;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockMethodCallWithReturnModel extends BlockExprModel {

	private List<BlockExprModel> sockets = new ArrayList<>();

	public BlockMethodCallWithReturnModel(UniMethodCall method, Document document, BlockResolver resolver, Long ID_COUNTER, Node parent){
		this.element = createPrototypeElement(method, document, resolver, ID_COUNTER, parent);
	}

	public Element createPrototypeElement(UniMethodCall method, Document document, BlockResolver resolver, Long ID_COUNTER, Node parent){
		String genusName = calcMethodCallGenusName(method, resolver);
		String kind = BlockMapper.getAttribute(resolver.getBlockNode(genusName), "kind");
		Element element = createBlockElement(document, genusName, ID_COUNTER, kind);
		addElement("Name", document, method.methodName, element);

		if(!"void".equals(resolver.getType(genusName))){
			addElement("Tyoe", document, resolver.getType(genusName), element);
		}

		return element;
	}

	/*
	 * UniMethodCallの関数名からBlockの名前を計算する
	 */
	private String calcMethodCallGenusName(UniMethodCall method, BlockResolver resolver) {
		String genusName = method.methodName + "[";
		// 名前空間補完}
		for (UniExpr arg : method.args) {
			genusName += "@" + convertParamTypeName(calcParamType(arg, resolver));
		}

		genusName += "]";

		genusName = resolver.getNamespace(genusName) + genusName;

		return genusName;
	}

	public List<Element> getElements() {
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
