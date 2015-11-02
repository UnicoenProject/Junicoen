package net.unicoen.parser.blockeditor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.unicoen.parser.blockeditor.blockmodel.BlockElementModel;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class BlockResolver {

	private String langdefRootPath = "not available";

	private Map<String, String> turtleMethods = new HashMap<String, String>();
	private Map<String, Node> allAvailableBlocks = new HashMap<String, Node>();
	private Map<String, String> availableLocalVariableDecralationTypes = new HashMap<>();//key:variable type , value: genusName
	private Map<String, String> availableFieldVariableDecralationTypes = new HashMap<>();
	private Map<String, String> availableFunctionArgsTypes = new HashMap<>();
	private VariableNameResolver vnResolver = new VariableNameResolver();
	private FieldMethodResolver fieldMethodResolver = new FieldMethodResolver();

	public BlockResolver(String langdefRootPath) {
		this.langdefRootPath = langdefRootPath;
		parseGnuses();
		parseTurtleXml();
	}

	public VariableNameResolver getVariableNameResolver(){
		return this.vnResolver;
	}

	public String getLocalVarDecBlockName(String type) {
		return availableLocalVariableDecralationTypes.get(type);
	}

	public String getFieldVarDecBlockName(String type) {
		return availableFieldVariableDecralationTypes.get(type);
	}

	public String getFunctionArgBlockName(String type) {
		return availableFunctionArgsTypes.get(type);
	}

	public Map<String, String> getTurtleMethodsName() {
		return turtleMethods;
	}

	public Node getBlockNode(String genusName) {
		return allAvailableBlocks.get(genusName);
	}

	public void addFieldMethodInfo(String methodNameWithParam, FieldMethodInfo info){
		this.fieldMethodResolver.addUserMethod(methodNameWithParam, info);
	}

	public FieldMethodResolver getFieldMethodInfo(){
		return this.fieldMethodResolver;
	}

	/*
	 * 全ブロックをハッシュマップに登録する キー：genus-name 値:ノード
	 */
	public void parseGnuses() {
		DOMParser parser = new DOMParser();
		// lang_def.xmlを読み込む
		try {
			parser.parse(langdefRootPath + "lang_def.xml");
			Document doc = parser.getDocument();
			Element root = doc.getDocumentElement();
			NodeList genusNodes = root.getElementsByTagName("BlockGenus");

			// 利用可能ブロックの登録
			for (int i = 0; i < genusNodes.getLength(); i++) {
				Node node = genusNodes.item(i);
				// 全ブロック情報のマップに登録
				allAvailableBlocks.put(DOMUtil.getAttribute(node, "name"), node);
				addAvaiableVariableTypeToMap(node);
			}
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addAvaiableVariableTypeToMap(Node node){
		// 利用可能な変数型リストに登録
		if ("param".equals(DOMUtil.getAttribute(node, "kind"))) {
			this.availableFunctionArgsTypes.put(DOMUtil.getChildNode(node, "Type").getTextContent(),DOMUtil.getAttribute(node, "name"));
		}else if("local-variable".equals(DOMUtil.getAttribute(node, "kind"))){
			// 利用可能な関数の引数の型マップに登録
			this.availableLocalVariableDecralationTypes.put(DOMUtil.getChildNode(node, "Type").getTextContent(), DOMUtil.getAttribute(node, "name"));
		}else if ("global-variable".equals(DOMUtil.getAttribute(node, "kind"))) {
			this.availableFieldVariableDecralationTypes.put(DOMUtil.getChildNode(node, "Type").getTextContent(), DOMUtil.getAttribute(node, "genus-name"));
		}
	}

	public void parseTurtleXml() {
		DOMParser parser = new DOMParser();
		// lang_def.xmlを読み込む
		try {
			parser.parse(langdefRootPath + "method_lang_def.xml");

			Document doc = parser.getDocument();
			Element root = doc.getDocumentElement();

			NodeList genusNodes = root.getElementsByTagName("BlockGenus");

			for (int i = 0; i < genusNodes.getLength(); i++) { // find them
				Node node = genusNodes.item(i);

				if (DOMUtil.getChildNode(node, "Name") != null) {
					turtleMethods.put(convertMethodName(DOMUtil.getAttribute(node, "name")), getNameSpaceString(node));
				}
			}
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getNameSpaceString(Node node) {
		String name = DOMUtil.getAttribute(node, "name");
		return name.substring(0, name.indexOf("-"));
	}

	private static String convertMethodName(String methodName) {
		int namespaceIndex = methodName.indexOf("-");
		if (namespaceIndex > -1) {
			return methodName.substring(namespaceIndex + 1);
		}
		return methodName;
	}

	public String getNamespace(String name) {
		String namespace = turtleMethods.get(name);
		if (namespace != null) {
			return namespace + "-";
		}
		return "";
	}

	public Node getPlugElement(String genusName) {
		Node genusNode = allAvailableBlocks.get(genusName);
		Node plugNode = null;

		if (genusNode == null) {
			return null;
		} else {
			Node socketConnectors = DOMUtil.getChildNode(genusNode,"BlockConnectors");
			for (int i = 0; i < socketConnectors.getChildNodes()
					.getLength(); i++) {
				Node connector = socketConnectors.getChildNodes().item(i);
				if (connector.getNodeName().equals("BlockConnector") && DOMUtil.getAttribute(connector, "connector-kind").equals("plug")) {
					plugNode = connector;
				}
			}
		}

		return plugNode;
	}

	public ArrayList<Node> getSocketNodes(String genusName) {
		Node genusNode = allAvailableBlocks.get(genusName);
		ArrayList<Node> socketsNode = new ArrayList<>();

		if (genusNode == null) {
			return null;
		} else {
			Node socketConnectors = DOMUtil.getChildNode(genusNode,"BlockConnectors");
			for (int i = 0; socketConnectors != null && i < socketConnectors.getChildNodes().getLength(); i++) {
				Node connector = socketConnectors.getChildNodes().item(i);
				if (connector.getNodeName().equals("BlockConnector")
						&& DOMUtil.getAttribute(connector, "connector-kind")
								.equals("socket")) {
					socketsNode.add(connector);
				}
			}
		}

		return socketsNode;
	}

	public String getType(String genusName){
		Node typeNode = DOMUtil.getChildNode(allAvailableBlocks.get(genusName), "Type");
		if(typeNode == null){
			return "void";
		}else{
			return typeNode.getTextContent();
		}
	}

	public boolean isTurtleMethod(String methodName, List<String> argTypes){
		String genusName = methodName + "[";
		// 名前空間補完}
		for (String arg : argTypes) {
			genusName += "@" + BlockElementModel.convertParamTypeName(arg);
		}

		genusName += "]";

		return turtleMethods.containsKey(genusName);
	}
}
