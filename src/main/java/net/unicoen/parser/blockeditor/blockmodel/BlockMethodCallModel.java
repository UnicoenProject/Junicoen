package net.unicoen.parser.blockeditor.blockmodel;

import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;

public class BlockMethodCallModel extends BlockCommandModel{

	/**
	 * ブロックメソッドコールモデルを生成する
	 * @param genusName：ブロック名　予め計算しておいてから渡す
	 * @param sockets
	 * @param document
	 * @param resolver
	 * @param ID_COUNTER
	 * @param parentId
	 */
	public BlockMethodCallModel(String genusName, List<BlockElementModel> sockets ,Document document, BlockResolver resolver, Long ID_COUNTER, String parentId){
		this.element = createPrototypeElement(genusName, sockets, document, resolver, ID_COUNTER, parentId);
	}

	public Element createPrototypeElement(String genusName, List<BlockElementModel> sockets,Document document, BlockResolver resolver, Long ID_COUNTER, String parentId){
		String kind = DOMUtil.getAttribute(resolver.getBlockNode(genusName), BlockElementModel.KIND_ATTRIBUTE_TAG);
		Element element = createBlockElement(document, genusName, ID_COUNTER, kind);
		addElement("Name", document, genusName, element);
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