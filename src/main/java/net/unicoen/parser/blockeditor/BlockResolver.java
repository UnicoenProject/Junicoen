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
		//強制変換リストを作成（System.out.println -> cui-printという1個のブロックに変換）というリスト
		createForceConvertionMap(isTest);
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
				allAvailableBlocks.put(MyDOMUtil.getAttribute(node, "name"), node);
				addAvaiableVariableTypeToMap(node);
			}
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addAvaiableVariableTypeToMap(Node node) {
		// 利用可能な変数型リストに登録
		if (BlockProcParmModel.KIND.equals(MyDOMUtil.getAttribute(node, BlockElementModel.KIND_ATTR))) {
			this.variableResolver.addAvaiableFunctionVariable(MyDOMUtil.getChildNode(node, BlockElementModel.TYPE_NODE).getTextContent(), MyDOMUtil.getAttribute(node, "name"));
		} else if (BlockLocalVarDecModel.KIND.equals(MyDOMUtil.getAttribute(node, BlockElementModel.KIND_ATTR))) {
			this.variableResolver.addAvaiableLocalVariable(MyDOMUtil.getChildNode(node, BlockElementModel.TYPE_NODE).getTextContent(), MyDOMUtil.getAttribute(node, "name"));
		} else if (BlockFieldVarDecModel.KIND.equals(MyDOMUtil.getAttribute(node, BlockElementModel.KIND_ATTR))) {
			this.variableResolver.addAvaiableFieldVariable(MyDOMUtil.getChildNode(node, BlockElementModel.TYPE_NODE).getTextContent(), MyDOMUtil.getAttribute(node, "name"));
		}
	}

	public static String getNameSpaceString(Node node) {
		String name = MyDOMUtil.getAttribute(node, "name");
		return name.contains("-") ? name.substring(0, name.indexOf("-")) : null;
	}

	public Node getPlugElement(String genusName) {
		Node genusNode = allAvailableBlocks.get(genusName);
		Node plugNode = null;

		if (genusNode == null) {
			return null;
		} else {
			Node socketConnectors = MyDOMUtil.getChildNode(genusNode, "BlockConnectors");
			if (socketConnectors == null) {
				return null;
			}
			for (int i = 0; i < socketConnectors.getChildNodes().getLength(); i++) {
				Node connector = socketConnectors.getChildNodes().item(i);
				if (connector.getNodeName().equals("BlockConnector") && MyDOMUtil.getAttribute(connector, "connector-kind").equals("plug")) {
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
			Node socketConnectors = MyDOMUtil.getChildNode(genusNode, "BlockConnectors");
			for (int i = 0; socketConnectors != null && i < socketConnectors.getChildNodes().getLength(); i++) {
				Node connector = socketConnectors.getChildNodes().item(i);
				if (connector.getNodeName().equals(BlockConnector.CONNECTOR_NODE) && MyDOMUtil.getAttribute(connector, BlockConnector.CONNECTOR_KIND_ATTR).equals("socket")) {
					socketsNode.add(connector);
				}
			}
		}

		return socketsNode;
	}

	public String getType(String genusName) {
		Node typeNode = MyDOMUtil.getChildNode(allAvailableBlocks.get(genusName), BlockElementModel.TYPE_NODE);
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

	public ForceConvertionMap getForceConvertionMap(){
		return this.forceConvertionMap;
	}
	
	public Map<String, Node> getAllBlockNodes(){
		return allAvailableBlocks;
	}
	
}
