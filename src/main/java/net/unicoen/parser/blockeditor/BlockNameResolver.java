package net.unicoen.parser.blockeditor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class BlockNameResolver {

	private String path = "blockeditor/blocks/";

	private Map<String, String> turtleMethods = new HashMap<String, String>();
	private Map<String, Node> allAvailableBlocks = new HashMap<String, Node>();
	private Map<String, String> availableLocalVariableDecralationTypes = new HashMap<>();
	private Map<String, String> availableFieldVariableDecralationTypes = new HashMap<>();
	private Map<String, String> availableFunctionArgsTypes = new HashMap<>();

	public BlockNameResolver(String path){
		this.path = path;
		parseGnuses();
		parseTurtleXml();
	}

	public BlockNameResolver(boolean isUseAtUNICOEN){
		if(isUseAtUNICOEN){
			path = "blockeditor/blocks/";
		}
		parseGnuses();
		parseTurtleXml();
	}

	public String getLocalVarDecBlockName(String type){
		return availableLocalVariableDecralationTypes.get(type);
	}

	public String getFieldVarDecBlockName(String type){
		return availableFieldVariableDecralationTypes.get(type);
	}

	public String getFunctionArgBlockName(String type){
		return availableFunctionArgsTypes.get(type);
	}

	public Map<String, String> getTurtleMethodsName(){
		return turtleMethods;
	}

	public Node getBlockNode(String genusName){
		return allAvailableBlocks.get(genusName);
	}

	/*
	 *	全ブロックをハッシュマップに登録する キー：genus-name 値:ノード
	 */
	public void parseGnuses(){
		DOMParser parser = new DOMParser();
		// lang_def.xmlを読み込む
		try {
			parser.parse(path + "lang_def.xml");

			Document doc = parser.getDocument();
			Element root = doc.getDocumentElement();

			NodeList genusNodes = root.getElementsByTagName("BlockGenus");

			// 利用可能ブロックの登録
			for (int i = 0; i < genusNodes.getLength(); i++) {
				Node node = genusNodes.item(i);

				//全ブロック情報のマップに登録
				allAvailableBlocks.put(BlockMapper.getAttribute(node, "name"), node);

				//利用可能な変数型リストに登録
				if("param".equals(BlockMapper.getAttribute(node, "kind"))){

					this.availableFunctionArgsTypes.put(BlockMapper.getChildNode(node, "Type").getTextContent(), BlockMapper.getAttribute(node, "name"));
				}

				//利用可能な関数の引数の型リストに登録
				if("local-variable".equals(BlockMapper.getAttribute(node, "kind"))){
					this.availableLocalVariableDecralationTypes.put(BlockMapper.getChildNode(node, "Type").getTextContent(), BlockMapper.getAttribute(node, "name"));
				}

				//利用可能な関数の引数の型リストに登録
				if("global-variable".equals(BlockMapper.getAttribute(node, "kind"))){
					this.availableFieldVariableDecralationTypes.put(BlockMapper.getChildNode(node, "Type").getTextContent(), BlockMapper.getAttribute(node, "genus-name"));
				}
			}
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void parseTurtleXml() {
		DOMParser parser = new DOMParser();
		// lang_def.xmlを読み込む
		try {
			parser.parse(path + "method_lang_def.xml");

			Document doc = parser.getDocument();
			Element root = doc.getDocumentElement();

			NodeList genusNodes = root.getElementsByTagName("BlockGenus");

			for (int i = 0; i < genusNodes.getLength(); i++) { // find them
				Node node = genusNodes.item(i);

				if(BlockMapper.getChildNode(node, "Name") != null){
					turtleMethods.put(convertMethodName(BlockMapper.getAttribute(node, "name")), getNameSpaceString(node));
				}
			}
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getNameSpaceString(Node node){
		String name = BlockMapper.getAttribute(node, "name");
		return name.substring(0, name.indexOf("-"));
	}

	private static String convertMethodName(String methodName){
		int namespaceIndex = methodName.indexOf("-");
		if(namespaceIndex>-1){
			return methodName.substring(namespaceIndex+1);
		}
		return methodName;
	}

	public String getNamespace(String name) {
		String namespace = turtleMethods.get(name);
		if(namespace != null){
			return namespace + "-";
		}
		return "";
	}

	public Node getPlugElement(String genusName){
		Node genusNode = allAvailableBlocks.get(genusName);
		Node plugNode = null;

		if(genusNode == null){
			return null;
		} else{
			Node socketConnectors = BlockMapper.getChildNode(genusNode, "BlockConnectors");
			for(int i = 0; i < socketConnectors.getChildNodes().getLength();i++){
				Node connector = socketConnectors.getChildNodes().item(i);
				if(connector.getNodeName().equals("BlockConnector") && BlockMapper.getAttribute(connector, "connector-kind").equals("plug")){
					plugNode = connector;
				}
			}
		}

		return plugNode;
	}

	public ArrayList<Node> getSocketNodes(String genusName){
		Node genusNode = allAvailableBlocks.get(genusName);
		ArrayList<Node> socketsNode = new ArrayList<>();

		if(genusNode == null){
			return null;
		} else{
			Node socketConnectors = BlockMapper.getChildNode(genusNode, "BlockConnectors");
			for(int i = 0; i < socketConnectors.getChildNodes().getLength();i++){
				Node connector = socketConnectors.getChildNodes().item(i);
				if(connector.getNodeName().equals("BlockConnector") && BlockMapper.getAttribute(connector, "connector-kind").equals("socket")){
					socketsNode.add(connector);
				}
			}
		}

		return socketsNode;
	}

}
