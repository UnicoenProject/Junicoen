package net.unicoen.parser.blockeditor.blockmodel;

import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;

public class BlockMethodCallModel extends BlockCommandModel{
	
	public BlockMethodCallModel(String genusName, List<BlockElementModel> sockets ,Document document, BlockResolver resolver, Long ID_COUNTER, String parentId){
		this.element = createPrototypeElement(genusName, sockets, document, resolver, ID_COUNTER, parentId);
	}

	public Element createPrototypeElement(String genusName, List<BlockElementModel> sockets,Document document, BlockResolver resolver, Long ID_COUNTER, String parentId){
		Node originNode = resolver.getBlockNode(genusName);
		String kind = DOMUtil.getAttribute(originNode, BlockElementModel.KIND_ATTR);
		Element element = createBlockElement(document, genusName, ID_COUNTER, kind);
		addElement(BlockElementModel.NAME_NODE, document, DOMUtil.getChildText(originNode, BlockElementModel.NAME_NODE), element);
		this.element = element;

		if (kind.equals("command") && parentId != null) {
			addBeforeBlockNode(document, parentId);
		}

		if(!"void".equals(resolver.getType(genusName))){
			addElement("Type", document, resolver.getType(genusName), element);
		}

		return element;
	}

	/**
	 * メソッド名，引数型リストからメソッド名[@param]の文字列を返す．
	 * @param methodName
	 * @param argTypes
	 * @return
	 */
	public static String calcMethodCallGenusName(String methodName, List<String> argTypes) {
		String genusName = methodName + "[";
		// 名前空間補完}
		for (String arg : argTypes) {
			genusName += "@" + convertParamTypeName(arg);
		}

		genusName += "]";
		return genusName;
	}

}
