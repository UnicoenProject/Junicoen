package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.parser.blockeditor.BlockMapper;
import net.unicoen.parser.blockeditor.BlockNameResolver;

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

	public String calcParameterFooter(List<UniExpr> args, BlockNameResolver resolver){
		String footer = "[";

		for(UniExpr arg : args){
			footer += ("@" + calcParamType(arg, resolver));
		}

		return footer += "]";
	}

	private String calcParamType(UniExpr param, BlockNameResolver resolver) {
		String type = "";
		if (param instanceof UniStringLiteral) {
			type = "string";
		} else if (param instanceof UniIntLiteral) {
			type = "number";
		} else if (param instanceof UniIdent) {
			type = BlockMapper.getChildNode(resolver.getVariableNameResolver().getVariableNode(((UniIdent) param).name), "Type").getTextContent();
		} else if(param instanceof UniDoubleLiteral){
			type = "double-number";
		} else {
			throw new RuntimeException(param.toString() + "has not been supported yet.");
		}
		return type;
	}

}
