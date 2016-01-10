package net.unicoen.parser.blockeditor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import net.unicoen.parser.blockeditor.blockmodel.BlockConnector;
import net.unicoen.parser.blockeditor.blockmodel.BlockElementModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockFieldVarDecModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockLocalVarDecModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockProcParmModel;

public class BlockResolver {

	public String langdefRootPath = "not available";
	public static final String ORIGIN_LANG_DEF_ROOT_PATH = "ext/block2/";
	public static final String ORIGIN_LANG_DEF_ROOT_PATH_FOR_UNI = "blockeditor/blocks/";
	public static final String LIBRARYMETHODLIST_FILENAME="library_list.xml";
	public static final String FORCECONVERION_FILENAME="force_convertion_list.xml";

	private Map<String, Node> allAvailableBlocks = new HashMap<String, Node>();// key:genusname, value:node

	private VariableNameResolver vnResolver = new VariableNameResolver();
	private MethodResolver methodResolver = new MethodResolver();
	private VariableBlockNameResolver variableResolver = new VariableBlockNameResolver();
	protected ForceConvertionMap forceConvertionMap;

	/**
	 * ブロック変換の諸リゾルバクラス
	 * @param langdefRootPath 言語定義ファイルのルートフォルダのパス /で終える
	 * @param isTest UNICOENからテスト起動するかどうか
	 */
	public BlockResolver(String langdefRootPath, boolean isTest) throws SAXException, IOException {
		this.langdefRootPath = langdefRootPath;
		initializeResolvers();
		initMethodResolver(isTest);
	}

	public void initMethodResolver(boolean isTest) throws SAXException, IOException {
		createLibratyMethodsMap(isTest);
		
		//強制変換リストを作成（System.out.println -> cui-printという1個のブロックに変換）というリスト
		createForceConvertionMap(isTest);
	}
	
	public void createLibratyMethodsMap(boolean isTest) throws SAXException, IOException{
		//ライブラリクラスとその利用可能メソッドのマップを初期化
		DOMParser parser = new DOMParser();
		if(isTest){
			parser.parse(langdefRootPath + LIBRARYMETHODLIST_FILENAME);			
		}else{
			parser.parse(ORIGIN_LANG_DEF_ROOT_PATH + LIBRARYMETHODLIST_FILENAME);
		}
		createLibraryMethodsMap(parser.getDocument().getFirstChild());
	}
	
	public void createForceConvertionMap(boolean isTest) throws SAXException, IOException{
		DOMParser parser = new DOMParser();
		if(isTest){
			parser.parse(langdefRootPath + FORCECONVERION_FILENAME);			
		}else{
			parser.parse(ORIGIN_LANG_DEF_ROOT_PATH + FORCECONVERION_FILENAME);
		}
		
		forceConvertionMap = new ForceConvertionMap(parser.getDocument().getFirstChild());
	}

	public void createLibraryMethodsMap(Node node) {
		// LibClassノードで行う処理の定義
		Consumer<Node> parseLibNode = new Consumer<Node>() {
			@Override
			public void accept(Node node) {
				String className = DOMUtil.getAttribute(node, "name");
				methodResolver.add(className, new ClassMethodMap());
				// CategoryNameタグの全ノードで行う処理の定義
				Consumer<Node> parseCategory = new Consumer<Node>() {
					@Override
					public void accept(Node t) {
						Consumer<Node> c = new Consumer<Node>() {
							@Override
							public void accept(Node t) {
								if (methodResolver.getAvaiableClassMethods().get(className).getClassMethodList(className) == null) {
									methodResolver.getAvaiableClassMethods().get(className).add(className, new ArrayList<String>());
								}
								methodResolver.getAvaiableClassMethods().get(className).getClassMethodList(className).add(t.getTextContent());
							}
						};

						if ("add".equals(DOMUtil.getAttribute(t, "command"))) {
							DOMUtil.doAnythingToNodeList(t, "MethodName", c);
						} else if ("copy".equals(DOMUtil.getAttribute(t, "command"))) {
							String copyClass = DOMUtil.getAttribute(t, "name");
							List<String> methods = methodResolver.getAvaiableClassMethods().get(copyClass).getClassMethodList(copyClass);
							if (methodResolver.getAvaiableClassMethods().get(className).getClassMethodList(copyClass) == null) {
								methodResolver.getAvaiableClassMethods().get(className).add(copyClass, new ArrayList<>());
							}

							methodResolver.getAvaiableClassMethods().get(className).getClassMethodList(copyClass).addAll(methods);
						}
					}
				};

				DOMUtil.doAnythingToNodeList(node, "CategoryName", parseCategory);
			}
		};
		DOMUtil.doAnythingToNodeList(node, "LibraryClass", parseLibNode);
	}

	public MethodResolver getMethodResolver() {
		return this.methodResolver;
	}

	public VariableNameResolver getVariableNameResolver() {
		return this.vnResolver;
	}

	public String getLocalVarDecBlockName(String type) {
		return variableResolver.getLocalVariableBlockName(type);
	}

	public String getFieldVarDecBlockName(String type) {
		return variableResolver.getFieldVariableBlockName(type);
	}

	public String getFunctionArgBlockName(String type) {
		return variableResolver.getFunctionVariableBlockName(type);
	}

	public Node getBlockNode(String genusName) {
		return allAvailableBlocks.get(genusName);
	}

	/*
	 * 全ブロックをハッシュマップに登録する キー：genus-name 値:ノード
	 */
	public void initializeResolvers() {
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
				addAvaiableMethodToResolver(node);
			}
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addAvaiableMethodToResolver(Node node) {
		String kind = DOMUtil.getAttribute(node, "kind");
		if (BlockLocalVarDecModel.KIND.equals(kind)) {
			Node methodsNode = DOMUtil.getChildNode(node, "ClassMethods");
			if (methodsNode != null) {
				addClassMethodsToResolver(DOMUtil.getChildTextFromBlockNode(node, "Type"), methodsNode);
			}
		}
	}

	private void addClassMethodsToResolver(String type, Node node) {
		NodeList nodes = node.getChildNodes();
		ClassMethodMap map = new ClassMethodMap();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node child = nodes.item(i);
			if ("CategoryName".equals(child.getNodeName())) {
				String className = DOMUtil.getAttribute(child, "classname");
				map.add(className, getMethodsFromCategoryNode(child));
			}
		}
		methodResolver.add(type, map);
	}

	private List<String> getMethodsFromCategoryNode(Node node) {
		List<String> methods = new ArrayList<>();
		NodeList nodes = node.getChildNodes();

		for (int i = 0; i < nodes.getLength(); i++) {
			Node child = nodes.item(i);
			if ("MethodName".equals(child.getNodeName())) {
				methods.add(child.getTextContent());
			}
		}

		return methods;
	}

	public void addAvaiableVariableTypeToMap(Node node) {
		
		// 利用可能な変数型リストに登録
		if (BlockProcParmModel.KIND.equals(DOMUtil.getAttribute(node, BlockElementModel.KIND_ATTR))) {
			this.variableResolver.addAvaiableFunctionVariable(DOMUtil.getChildNode(node, BlockElementModel.TYPE_NODE).getTextContent(), DOMUtil.getAttribute(node, "name"));
		} else if (BlockLocalVarDecModel.KIND.equals(DOMUtil.getAttribute(node, BlockElementModel.KIND_ATTR))) {
			this.variableResolver.addAvaiableLocalVariable(DOMUtil.getChildNode(node, BlockElementModel.TYPE_NODE).getTextContent(), DOMUtil.getAttribute(node, "name"));
		} else if (BlockFieldVarDecModel.KIND.equals(DOMUtil.getAttribute(node, BlockElementModel.KIND_ATTR))) {
			this.variableResolver.addAvaiableFieldVariable(DOMUtil.getChildNode(node, BlockElementModel.TYPE_NODE).getTextContent(), DOMUtil.getAttribute(node, "name"));
		}
	}

	public static String getNameSpaceString(Node node) {
		String name = DOMUtil.getAttribute(node, "name");
		try {
			return name.substring(0, name.indexOf("-"));
		} catch (Exception e) {
			return null;
		}
	}

	public Node getPlugElement(String genusName) {
		Node genusNode = allAvailableBlocks.get(genusName);
		Node plugNode = null;

		if (genusNode == null) {
			return null;
		} else {
			Node socketConnectors = DOMUtil.getChildNode(genusNode, "BlockConnectors");
			if (socketConnectors == null) {
				return null;
			}
			for (int i = 0; i < socketConnectors.getChildNodes().getLength(); i++) {
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
			Node socketConnectors = DOMUtil.getChildNode(genusNode, "BlockConnectors");
			for (int i = 0; socketConnectors != null && i < socketConnectors.getChildNodes().getLength(); i++) {
				Node connector = socketConnectors.getChildNodes().item(i);
				if (connector.getNodeName().equals(BlockConnector.CONNECTOR_NODE) && DOMUtil.getAttribute(connector, BlockConnector.CONNECTOR_KIND_ATTR).equals("socket")) {
					socketsNode.add(connector);
				}
			}
		}

		return socketsNode;
	}

	public String getType(String genusName) {
		System.out.println(genusName);
		Node typeNode = DOMUtil.getChildNode(allAvailableBlocks.get(genusName), BlockElementModel.TYPE_NODE);
		if (typeNode == null) {
			return "void";
		} else {
			return typeNode.getTextContent();
		}
	}


	public String calcParamNameSpace(List<String> params) {
		String paramNameSpace = "[";
		// 名前空間補完}
		for (String arg : params) {
			paramNameSpace += "@" + BlockElementModel.convertParamTypeName(arg);
		}

		paramNameSpace += "]";
		return paramNameSpace;
	}

	public MethodResolver getMehtodResolver() {
		return this.methodResolver;
	}

	public ForceConvertionMap getForceConvertionMap(){
		return this.forceConvertionMap;
	}
	
}
