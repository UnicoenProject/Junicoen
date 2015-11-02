package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import net.unicoen.node.UniExpr;
import net.unicoen.node.UniMethodCall;
import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

public class BlockMethodCallModel extends BlockCommandModel{

	public BlockMethodCallModel(UniMethodCall method, Document document, BlockResolver resolver, Long ID_COUNTER, Node parent){
		this.element = createPrototypeElement(method, document, resolver, ID_COUNTER, parent);
	}

	public Element createPrototypeElement(UniMethodCall method, Document document, BlockResolver resolver, Long ID_COUNTER, Node parent){
		String genusName = calcMethodCallGenusName(method.methodName, transformArgToString(method.args, resolver), resolver);
		String kind = DOMUtil.getAttribute(resolver.getBlockNode(genusName), "kind");
		Element element = createBlockElement(document, genusName, ID_COUNTER, kind);
		addElement("Name", document, method.methodName, element);
		this.element = element;

		if (kind.equals("command") && parent != null) {
			addBeforeBlockNode(document, DOMUtil.getAttribute(parent, "id"));
		}

		if(!"void".equals(resolver.getType(genusName))){
			addElement("Type", document, resolver.getType(genusName), element);
		}

		return element;
	}

	public static List<String> transformArgToString(List<UniExpr> args, BlockResolver resolver) {
		if (args == null) {
			return new ArrayList<String>();
		} else {
			return Lists.transform(args, new Function<UniExpr, String>() {
				public String apply(UniExpr input) {
					return BlockExprModel.convertParamTypeName(calcParamType(input, resolver));
				}
			});
		}
	}

	/*
	 * UniMethodCallの関数名からBlockの名前を計算する
	 */
	public static String calcMethodCallGenusName(String methodName, List<String> argTypes, BlockResolver resolver) {
		String genusName = methodName + "[";
		// 名前空間補完}
		for (String arg : argTypes) {
			genusName += "@" + convertParamTypeName(arg);
		}

		genusName += "]";

		genusName = resolver.getNamespace(genusName) + genusName;

		return genusName;
	}

}
