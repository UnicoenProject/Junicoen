package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockExCallGetterModel extends BlockExprModel {

	public static String GENUS_NAME = "callGetterMethod2";
	private static String KIND = "function";

	private BlockElementModel methodBlock;

	public BlockExCallGetterModel(Document document, Long id){
		this.element = createBlockElement(document, GENUS_NAME, id, KIND);
	}

	public void setCalleMethod(BlockElementModel callMethodModel){
		this.methodBlock = callMethodModel;
	}

	// @override
	public List<Element> getBlockElements() {
		List<Element> elements = new ArrayList<Element>();
		elements.add(getElement());

		for(BlockElementModel element : getSocketBlocks()){
			elements.addAll(element.getBlockElements());
		}

		elements.addAll(methodBlock.getBlockElements());

		return elements;
	}

	@Override
	public String getType(){
		return methodBlock.getType();
	}

	@Override
	/**
	 * このブロックのノードにPlugノードを追加する
	 */
	public void setPlugElement(Document document, PlugInfo plugInfo) {
		plugInfo.connectorType = convertTypeToBlockConnectorType(getType());
		this.element.appendChild(plugInfo.createElemnet(document));
	}
}
