package net.unicoen.parser.blockeditor.blockmodel;

import java.util.List;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

public class BlockMethodCallModel extends BlockCommandModel{

	public BlockMethodCallModel(String methodName, List<BlockElementModel> sockets ,Document document, BlockResolver resolver, Long ID_COUNTER, String parentId){
		this.element = createPrototypeElement(methodName, sockets, document, resolver, ID_COUNTER, parentId);
	}

	public Element createPrototypeElement(String methodName, List<BlockElementModel> sockets,Document document, BlockResolver resolver, Long ID_COUNTER, String parentId){
		List<String> socketTypes = Lists.transform(sockets, new Function<BlockElementModel, String>() {
			public String apply(BlockElementModel input) {
				return input.getType();
			}
		});
		String genusName = calcMethodCallGenusName(methodName, socketTypes, resolver);

		String kind = DOMUtil.getAttribute(resolver.getBlockNode(genusName), BlockElementModel.KIND_ATTRIBUTE_TAG);
		Element element = createBlockElement(document, genusName, ID_COUNTER, kind);
		addElement("Name", document, methodName, element);
		this.element = element;

		if (kind.equals("command") && parentId != null) {
			addBeforeBlockNode(document, parentId);
		}

		if(!"void".equals(resolver.getType(genusName))){
			addElement("Type", document, resolver.getType(genusName), element);
		}

		return element;
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
