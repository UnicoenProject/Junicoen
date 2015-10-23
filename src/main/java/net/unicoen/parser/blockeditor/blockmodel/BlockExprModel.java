package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.unicoen.parser.blockeditor.BlockMapper;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockExprModel extends BlockElementModel {

	public List<Element> getExprElements() {
		List<Element> elements = new ArrayList<Element>();
		elements.add(getElement());
		return elements;
	}

	public String getType(){
		return BlockMapper.getChildNode(getElement(), "Type").getTextContent();
	}

	public Map<String, String> calcPlugInfo(Node plugNode) {
		if (plugNode == null) {
			return null;
		} else {
			Map<String, String> socketsInfo = new HashMap<>();

			String plugLabel;
			String socketTypes;
			String socketPositionTypes;

			plugLabel = BlockMapper.getAttribute(plugNode, "label");
			socketTypes = BlockMapper.getAttribute(plugNode, "connector-type");
			socketPositionTypes = BlockMapper.getAttribute(plugNode, "position-type");

			socketsInfo.put("label", plugLabel);
			socketsInfo.put("connector-type", socketTypes);
			socketsInfo.put("position-type", socketPositionTypes);

			return socketsInfo;
		}
	}

	public void addPlugElement(Document document, Element target, String parentBlockID, String plugType, String positionType) {
		Element plugNode = document.createElement("Plug");
		Element blockConnectorNode = document.createElement("BlockConnector");

		blockConnectorNode.setAttribute("con-block-id", parentBlockID);
		blockConnectorNode.setAttribute("connector-kind", "plug");
		blockConnectorNode.setAttribute("connector-type", plugType);
		blockConnectorNode.setAttribute("init-type", plugType);
		blockConnectorNode.setAttribute("label", "");
		blockConnectorNode.setAttribute("position-type", positionType);

		plugNode.appendChild(blockConnectorNode);

		target.appendChild(plugNode);
	}

}
