package net.unicoen.parser.blockeditor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import net.unicoen.parser.blockeditor.blockmodel.BlockElementModel;

public class BlockResolver {

	private String langdefRootPath = "not available";
	public static final String ORIGIN_LANG_DEF_ROOT_PATH = "ext/block2/";
	public static final String ORIGIN_LANG_DEF_ROOT_PATH_FOR_UNI = "blockeditor/blocks/";

	private Map<String, String> turtleMethods = new HashMap<String, String>();//key:methodname, value:genusname この方法だと特定のメソッド名が利用できなくなる
	private Map<String, Node> allAvailableBlocks = new HashMap<String, Node>();//key:genusname, value:node
	private Map<String, String> availableLocalVariableDecralationTypes = new HashMap<>();//key:variable type , value: genusName
	private Map<String, String> availableFieldVariableDecralationTypes = new HashMap<>();
	private Map<String, String> availableFunctionArgsTypes = new HashMap<>();
	private VariableNameResolver vnResolver = new VariableNameResolver();
	private MethodResolver methodResolver = new MethodResolver();

	public BlockResolver(String langdefRootPath, boolean isTest) {
		this.langdefRootPath = langdefRootPath;
		parseGnuses();
		if(!isTest){
			parseTurtleXml(ORIGIN_LANG_DEF_ROOT_PATH + "method_lang_def.xml");
		}else{
			parseTurtleXml(ORIGIN_LANG_DEF_ROOT_PATH_FOR_UNI + "method_lang_def.xml");
		}
	}
	
	public MethodResolver getMethodResolver(){
		return this.methodResolver;
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
				addAvaiableMethodBlocks(node);
				addAvaiableMethodToResolver(node);
			}
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addAvaiableMethodToResolver(Node node){
		String kind = DOMUtil.getAttribute(node, "kind");
		if("local-variable".equals(kind) || "global-variable".equals(kind)){
			Node methodsNode = DOMUtil.getChildNode(node, "ClassMethods");
			if(methodsNode != null){
				addClassMethodsToResolver(DOMUtil.getChildTextFromBlockNode(node, "Type"),methodsNode);
			}
		}
	}
	
	private void addClassMethodsToResolver(String type, Node node){
		NodeList nodes = node.getChildNodes();
		ClassMethodMap map = new ClassMethodMap();
		for(int i = 0 ; i < nodes.getLength();i++){
			Node child = nodes.item(i);
			if("CategoryName".equals(child.getNodeName())){
				String className = DOMUtil.getAttribute(child, "classname");
				map.add(className, getMethodsFromCategoryNode(child));
			}
		}
		
		methodResolver.add(type, map);
		
	}
	
	private List<String> getMethodsFromCategoryNode(Node node){
		List<String> methods = new ArrayList<>();
		NodeList nodes = node.getChildNodes();
		
		for(int i = 0;i<nodes.getLength();i++){
			Node child = nodes.item(i);
			if("MethodName".equals(child.getNodeName())){
				methods.add(child.getTextContent());
			}
		}
		
		return methods;
	}

	public void addAvaiableMethodBlocks(Node node){
		String namespace = getNameSpaceString(node);
		if (isCommandOrFunction(node) && DOMUtil.getChildNode(node, "Name") != null && namespace!=null) {
				turtleMethods.put(convertMethodName(DOMUtil.getAttribute(node, "name")), namespace);
		}
	}

	private boolean isCommandOrFunction(Node node){
		String kind = DOMUtil.getAttribute(node, BlockElementModel.KIND_ATTRIBUTE_TAG);
		if("function".equals(kind) || "command".equals(kind)){
			return true;
		}
		return false;

	}

	public void addAvaiableVariableTypeToMap(Node node){
		// 利用可能な変数型リストに登録
		if ("param".equals(DOMUtil.getAttribute(node, "kind"))) {
			this.availableFunctionArgsTypes.put(DOMUtil.getChildNode(node, "Type").getTextContent(),DOMUtil.getAttribute(node, "name"));
		}else if("local-variable".equals(DOMUtil.getAttribute(node, "kind"))){
			// 利用可能な関数の引数の型マップに登録
			this.availableLocalVariableDecralationTypes.put(DOMUtil.getChildNode(node, "Type").getTextContent(), DOMUtil.getAttribute(node, "name"));
		}else if ("global-variable".equals(DOMUtil.getAttribute(node, "kind"))) {
			this.availableFieldVariableDecralationTypes.put(DOMUtil.getChildNode(node, "Type").getTextContent(), DOMUtil.getAttribute(node, "name"));
		}
	}

	public void parseTurtleXml(String methodLangDefPath) {
		DOMParser parser = new DOMParser();
		// lang_def.xmlを読み込む
		try {
			parser.parse(methodLangDefPath);

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
		try{
			return name.substring(0, name.indexOf("-"));
		}catch(Exception e){
			return null;
		}
	}

	private static String convertMethodName(String methodName) {
		int namespaceIndex = methodName.indexOf("-");
		if (namespaceIndex > -1) {
			return methodName.substring(namespaceIndex + 1);
		}
		return methodName;
	}


	public Node getPlugElement(String genusName) {
		Node genusNode = allAvailableBlocks.get(genusName);
		Node plugNode = null;

		if (genusNode == null) {
			return null;
		} else {
			Node socketConnectors = DOMUtil.getChildNode(genusNode,"BlockConnectors");
			if(socketConnectors == null){
				return null;
			}
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
		String genusName = methodName + calcParamNameSpace(argTypes);

		return turtleMethods.containsKey(genusName);
	}

	public String calcParamNameSpace(List<String> params){
		String paramNameSpace = "[";
		// 名前空間補完}
		for (String arg : params) {
			paramNameSpace += "@" + BlockElementModel.convertParamTypeName(arg);
		}

		paramNameSpace += "]";
		return paramNameSpace;
	}
	
	public MethodResolver getMehtodResolver(){
		return this.methodResolver;
	}
	
}
