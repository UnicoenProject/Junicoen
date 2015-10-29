package net.unicoen.parser.blockeditor.blockmodel;

import net.unicoen.node.UniExpr;
import net.unicoen.node.UniMethodCall;
import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockMethodCallModel extends BlockCommandModel{

	public BlockMethodCallModel(UniMethodCall method, Document document, BlockResolver resolver, Long ID_COUNTER, Node parent){
		this.element = createPrototypeElement(method, document, resolver, ID_COUNTER, parent);
	}

	public Element createPrototypeElement(UniMethodCall method, Document document, BlockResolver resolver, Long ID_COUNTER, Node parent){
		String genusName = calcMethodCallGenusName(method, resolver);
		String kind = DOMUtil.getAttribute(resolver.getBlockNode(genusName), "kind");
		Element element = createBlockElement(document, genusName, ID_COUNTER, kind);
		addElement("Name", document, method.methodName, element);
		this.element = element;

		if (kind.equals("command") && parent != null) {
			addBeforeBlockNode(document, DOMUtil.getAttribute(parent, "id"));
		}

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
}
