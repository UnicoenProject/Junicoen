package net.unicoen.parser.blockeditor.blockmodel;

import java.util.HashMap;
import java.util.Map;

import net.unicoen.parser.blockeditor.DOMUtil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockExprModel extends BlockElementModel {

	public Map<String, String> calcPlugInfo(Node plugNode) {
		if (plugNode == null) {
			return null;
		} else {
			Map<String, String> socketsInfo = new HashMap<>();

			String plugLabel;
			String socketTypes;
			String socketPositionTypes;

			plugLabel = DOMUtil.getAttribute(plugNode, "label");
			socketTypes = DOMUtil.getAttribute(plugNode, "connector-type");
			socketPositionTypes = DOMUtil.getAttribute(plugNode, "position-type");

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

//	public String calcParameterFooter(List<UniExpr> args, BlockResolver resolver){
//		String footer = "[";
//
//		for(UniExpr arg : args){
//			footer += ("@" + calcParamType(arg, resolver));
//		}
//
//		return footer += "]";
//	}


	//以下　Stubクラスにまとめた方が良いかも
	public Element createBlockStubNode(Document document, String parentName, String parentGenusName) {
		Element blockStubElement = document.createElement("BlockStub");
		addElement("StubParentName", document, parentName, blockStubElement);
		addElement("StubParentGenus", document, parentGenusName, blockStubElement);
		return blockStubElement;
	}

	public Element createVariableBlockNode(Document document, String genusName, String name, String kind, String type, Long id) {
		Element blockElement = createBlockElement(document, genusName, id, kind);
		addElement("Label", document, name, blockElement);
		addElement("Name", document, name, blockElement);
		addElement("Type", document, type, blockElement);
		return blockElement;
	}

}
