package net.unicoen.parser.blockeditor.blockmodel;

import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.google.common.collect.ImmutableMap;

import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockExprModel extends BlockElementModel {

	public Map<String, String> calcPlugInfo(Node plugNode) {
		return plugNode == null? null : ImmutableMap.of(BlockSocketModel.CONNECTOR_LABEL_ATTR, "",
				BlockSocketModel.CONNECTOR_TYPE_ATTR,	MyDOMUtil.getAttribute(plugNode, BlockPlugModel.CONNECTOR_TYPE_ATTR),BlockSocketModel.CONNECTOR_POSITION_TYPE_ATTR,MyDOMUtil.getAttribute(plugNode, BlockPlugModel.CONNECTOR_POSITION_TYPE_ATTR));
	}

	public void addPlugElement(Document document, Element target, String parentBlockID, String plugType, String positionType) {
		Element plugNode = document.createElement(BlockPlugModel.NODE_NAME);
		Element blockConnectorNode = document.createElement(BlockConnector.CONNECTOR_NODE);
		MyDOMUtil.setAttributes(blockConnectorNode, ImmutableMap.of(BlockPlugModel.CONNECTOR_BLOCK_ID_ATTR, parentBlockID, BlockPlugModel.CONNECTOR_KIND_ATTR, "plug", BlockPlugModel.CONNECTOR_TYPE_ATTR, plugType, BlockPlugModel.CONNECTOR_INIT_TYPE_ATTR, plugType, BlockPlugModel.CONNECTOR_LABEL_ATTR, ""));
		blockConnectorNode.setAttribute(BlockPlugModel.CONNECTOR_POSITION_TYPE_ATTR, positionType);

		plugNode.appendChild(blockConnectorNode);
		target.appendChild(plugNode);
	}

	public Element createVariableBlockNode(Document document, String genusName, String name, String kind, String type, Long id) {
		Element blockElement = createBlockElement(document, genusName, id, kind);
		MyDOMUtil.appendChilds(blockElement, MyDOMUtil.createElements(ImmutableMap.of(BlockElementModel.LABEL_NODE, name, BlockElementModel.NAME_NODE, name, BlockElementModel.TYPE_NODE, type), document));
		return blockElement;
	}

}
