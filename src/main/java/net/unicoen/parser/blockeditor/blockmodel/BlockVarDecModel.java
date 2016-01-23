package net.unicoen.parser.blockeditor.blockmodel;

import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockVarDecModel extends BlockCommandModel {
	public static String SPECIAL_VARIABLE_GENUS_NAME = "special-variable";

	public BlockVarDecModel(String type, String name, Document document, BlockResolver resolver, Long ID_COUNTER) {
		this.element = createElement(type, name, document, resolver, ID_COUNTER);
	}

	public Element createElement(String type, String name, Document document, BlockResolver resolver, Long ID_COUNTER) {
		String genusName = getGenusNameFromResolver(resolver, type);
		Element blockElement;
		if (genusName == null) {
			blockElement = createVariableBlockNode(document, SPECIAL_VARIABLE_GENUS_NAME, name, "local-variable",  ID_COUNTER++);
		} else {
			blockElement = createVariableBlockNode(document, genusName, name, MyDOMUtil.getAttribute(resolver.getBlockNode(genusName), BlockElementModel.KIND_ATTR), ID_COUNTER++);
		}
		blockElement.appendChild(MyDOMUtil.createElement(BlockElementModel.TYPE_NODE, type, document));
		return blockElement;
	}


	public String getGenusNameFromResolver(BlockResolver resolver, String type) {
		return resolver.getFieldVarDecBlockName(type);
	}

	@Override
	public void addSocketsAndNodes(List<BlockElementModel> socketBlocks, Document document, BlockSocketsModel sockets) {
		for (BlockElementModel socket : socketBlocks) {
			addSocketBlock(socket);
		}

		if (getGenusName().equals(SPECIAL_VARIABLE_GENUS_NAME)) {
			for (BlockElementModel socket : socketBlocks) {
				sockets.addSocketInfo(new BlockSocketModel((BlockExprModel) socket));
			}
		}

		addSocketsNode(document, sockets);
	}

}
