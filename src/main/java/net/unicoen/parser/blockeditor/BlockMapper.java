package net.unicoen.parser.blockeditor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.google.common.collect.Lists;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniBreak;
import net.unicoen.node.UniCast;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniContinue;
import net.unicoen.node.UniDoWhile;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniEmptyStatement;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldDec;
import net.unicoen.node.UniFile;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniImport;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNamespace;
import net.unicoen.node.UniNew;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;
import net.unicoen.parser.blockeditor.blockmodel.BlockBinaryOperatorModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockBooleanLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockConnector;
import net.unicoen.parser.blockeditor.blockmodel.BlockDoWhileModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockDoubleLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockElementModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockEmptyModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockExCallGetterModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockExCallerModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockFieldVarDecModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockIfModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockIntLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockPrePostModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockProcedureModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockReturnModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockSocketsModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockSpecialExpressionModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockSpecialModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockStringLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockVariableGetterModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockWhileModel;
import net.unicoen.parser.blockeditor.blockmodel.PageModel;
import net.unicoen.parser.blockeditor.blockmodel.PagesModel;

public class BlockMapper {

	private HashMap<String, Node> map = new HashMap<>();// Blockのidをキー該当ノードをvalueとして全てのBlockNodeを保持する変数
	private BlockResolver resolver;

	public BlockMapper(String langdefRootPath) throws SAXException, IOException {
		resolver = new BlockResolver(langdefRootPath, false);
	}

	public UniClassDec parse(File xmlFile) {
		// Blockノードの親ノードを取得する
		Node pageBlock = getNode(xmlFile, PageModel.PAGE_BLOCKS);
		UniClassDec classDec = createProcotypeClassModel(xmlFile.getName().substring(0, xmlFile.getName().indexOf(".xml")), getNode(xmlFile, PageModel.PAGE_INFO_NODE));

		List<Node> procs = new ArrayList<>();// Blockのidをキー該当ノードをvalueとしてメソッド定義ブロックのBlockNodeを保持する変数
		Map<String, String> methodsReturnTypes = new HashMap<>();// 返り値の型を保持する
		List<Node> fieldVariables = new ArrayList<>();

		// mapに全てのBlockNodeを,procsに全てのメソッド定義のBlockNodeを保存する
		putAllBlockNodes(pageBlock);
		
		preparseNodes(pageBlock, procs, methodsReturnTypes, fieldVariables);

		classDec.members = parseFieldVariableNodes(fieldVariables);

		classDec.members.addAll(parseMethodNodes(procs, methodsReturnTypes));

		map.clear();
		
		return classDec;
	}
	
	public UniClassDec parse(Node pageBlock) {
		String className = DOMUtil.getAttribute(pageBlock, PageModel.PAGE_NAME_ATTR);
		Node pageBlocksNode = DOMUtil.getChildNode(pageBlock, PageModel.PAGE_BLOCKS);
		// Blockノードの親ノードを取得する
		UniClassDec classDec = createProcotypeClassModel(className, DOMUtil.getChildNode(pageBlock, PageModel.PAGE_INFO_NODE));
		List<Node> procs = new ArrayList<>();// Blockのidをキー該当ノードをvalueとしてメソッド定義ブロックのBlockNodeを保持する変数
		Map<String, String> methodsReturnTypes = new HashMap<>();// 返り値の型を保持する
		List<Node> fieldVariables = new ArrayList<>();

		// mapに全てのBlockNodeを,procsに全てのメソッド定義のBlockNodeを保存する
		putAllBlockNodes(pageBlocksNode);
		preparseNodes(pageBlocksNode, procs, methodsReturnTypes, fieldVariables);

		classDec.members = parseFieldVariableNodes(fieldVariables);
		classDec.members.addAll(parseMethodNodes(procs, methodsReturnTypes));

		map.clear();
		
		return classDec;
	}
	
	public UniFile parseToUniFile(File xmlFile){
		Node pagesNode = getNode(xmlFile, PagesModel.PAGES_NODE);
		List<Node> pagesChildNodes = DOMUtil.getChildNodes(pagesNode);
		UniFile fileModel = new UniFile(new ArrayList<>(), new ArrayList<>(), new UniNamespace(""));
		for(Node node : pagesChildNodes){
			if(node.getNodeName().equals(PagesModel.IMPORT_STATEMENTS_NODE)){
				//import statements の追加
				List<Node> importStatements = DOMUtil.getChildNodes(node);
				for(Node importStatement : importStatements){
					if(PagesModel.IMPORT_STATEMENT_NODE.equals(importStatement.getNodeName())){
						fileModel.imports.add(new UniImport(importStatement.getTextContent(), false));
					}
				}
			}else if(node.getNodeName().equals(PageModel.NODE_NAME)){
				fileModel.classes.add(parse(node));
			}
		}

		return fileModel;
	}

	public List<UniMemberDec> parseFieldVariableNodes(List<Node> procs) {
		List<UniMemberDec> fieldVariables = new ArrayList<>();
		for (Node node : procs) {
			UniFieldDec dec = new UniFieldDec();
			dec.name = DOMUtil.getChildText(node, BlockElementModel.NAME_NODE);
			dec.type = DOMUtil.getChildText(node, BlockElementModel.TYPE_NODE);
			dec.modifiers = Lists.newArrayList("private");

			List<UniExpr> initValues = parseSocket(DOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME), map, DOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR));

			if (!initValues.isEmpty()) {
				dec.value = initValues.get(0);
			}
			fieldVariables.add(dec);
		}
		return fieldVariables;
	}

	public List<UniMemberDec> parseMethodNodes(List<Node> procs, Map<String, String> methodsReturnTypes) {
		List<UniMemberDec> ret = new ArrayList<>();
		for (Node procNode : procs) {
			UniMethodDec d = new UniMethodDec(DOMUtil.getChildText(procNode, BlockElementModel.LABEL_NODE), new ArrayList<>(), methodsReturnTypes.get(DOMUtil.getAttribute(procNode, BlockElementModel.ID_ATTR)), new ArrayList<>(), null);
			d.modifiers = getModifiers(procNode);
			d.args = createArgumentsModel(procNode);

			UniBlock body = new UniBlock(new ArrayList<>(), null);

			String nextNodeId = DOMUtil.getChildText(procNode, BlockElementModel.AFTERBLOCKID_NODE);
			if (nextNodeId != null) {
				body = parseBody(map.get(nextNodeId), map);
			}

			d.block = body;
			d.returnType = methodsReturnTypes.get(DOMUtil.getAttribute(procNode, BlockElementModel.ID_ATTR));
			ret.add(d);
			resolver.getVariableNameResolver().resetLocalVariables();
		}
		return ret;
	}

	public List<String> getModifiers(Node node) {
		List<String> modifiers = new ArrayList<>();

		Node modifiersNode = DOMUtil.getChildNode(node, BlockProcedureModel.MODIFIERS_NODE);
		if (modifiersNode == null) {
			modifiers.add("public");
			return modifiers;
		} else {
			NodeList modifierNodes = modifiersNode.getChildNodes();
			for (int i = 0; i < modifierNodes.getLength(); i++) {
				Node item = modifierNodes.item(i);
				if (BlockProcedureModel.MODIFIER_NODE.equals(item.getNodeName())) {
					modifiers.add(item.getTextContent());
				}
			}
		}

		return modifiers;
	}

	/**
	 * 一度pageblocksノードを全て解析し，インスタンス変数ノード，メソッドノード，メソッド名と返り値を取得する
	 * 
	 * @param pageBlock
	 *            pageblocksノード
	 * @param procs
	 *            メソッド定義ノードを格納するリスト
	 * @param returnTypes
	 *            メソッド名とその返り値を登録するマップ
	 */
	public void preparseNodes(Node pageBlock, List<Node> procs, Map<String, String> returnTypes, List<Node> fieldVariables) {
		// xmlのPageの子ノードから，メソッド定義のBlockノードのみを抽出する
		for (Node node : DOMUtil.eachChild(pageBlock)) {
			String name = node.getNodeName();
			if (name.startsWith("#")) {
				continue;
			} else if (name.equals(BlockElementModel.BLOCK_STUB_NODE)) {
				node = DOMUtil.getChildNode(node, BlockElementModel.BLOCK_NODE);
			}

			String nodeId = DOMUtil.getAttribute(node, BlockElementModel.ID_ATTR);
			String kind = DOMUtil.getAttribute(node, BlockElementModel.KIND_ATTR);
			String genusName = DOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR);
			if (BlockProcedureModel.KIND.equals(kind)) {
				procs.add(node);
				if (returnTypes.get(nodeId) == null) {
					returnTypes.put(nodeId, "void");
				}
			}
			if (BlockFieldVarDecModel.KIND.equals(kind)) {
				fieldVariables.add(node);
			}
			if (BlockReturnModel.GENUS_NAME.equals(genusName)) {
				Node socketNode = DOMUtil.getChildNode(getSocketsNode(node), BlockConnector.CONNECTOR_NODE);
				returnTypes.put(DOMUtil.getAttribute(getTopBlockNode(node), BlockElementModel.ID_ATTR), getSocketBlockType(socketNode));
			}
		}
	}

	public List<UniArg> createArgumentsModel(Node procedureNode) {
		Node socketNode = DOMUtil.getChildNode(procedureNode, BlockSocketsModel.NODE_NAME);
		List<Node> connectors = DOMUtil.getChildNodes(socketNode);
		List<UniArg> args = new ArrayList<>();
		for (Node connector : connectors) {
			if (connector.getNodeName().equals(BlockConnector.CONNECTOR_NODE)) {
				Node connectorBlock = map.get(DOMUtil.getAttribute(connector, BlockConnector.CONNECTOR_BLOCK_ID_ATTR));
				if (connectorBlock != null) {
					String name = DOMUtil.getChildText(connectorBlock, BlockElementModel.NAME_NODE);
					String type = DOMUtil.getChildText(connectorBlock, BlockElementModel.TYPE_NODE);
					args.add(new UniArg(type, name));
				}
			}
		}
		return args;
	}

	public UniClassDec createProcotypeClassModel(String className, Node pageInfoNode) {
		UniClassDec classDec = new UniClassDec();
		classDec.className = className;
		classDec.interfaces = DOMUtil.getListFromNode(DOMUtil.getChildNode(pageInfoNode, PageModel.INTERFASES_NODE), PageModel.INTERFASE_NAME_NODE);
		classDec.superClass = DOMUtil.getListFromNode(DOMUtil.getChildNode(pageInfoNode, PageModel.SUPER_CLASSES_NODE), PageModel.SUPERCLASS_NAME_NODE);
		classDec.modifiers = DOMUtil.getListFromNode(DOMUtil.getChildNode(pageInfoNode, PageModel.MODIFIERS_NODE), PageModel.MODIFIER_NODE);
		classDec.members = new ArrayList<>();

		return classDec;
	}

	public void putAllBlockNodes(Node pageBlock) {
		// xmlのPageの子ノードから，メソッド定義のBlockノードのみを抽出する
		for (Node node : DOMUtil.eachChild(pageBlock)) {
			String name = node.getNodeName();
			if (name.startsWith("#")) {
				continue;
			} else if (name.equals(BlockElementModel.BLOCK_STUB_NODE)) {
				node = DOMUtil.getChildNode(node, BlockElementModel.BLOCK_NODE);
			}

			String nodeId = DOMUtil.getAttribute(node, BlockElementModel.ID_ATTR);
			map.put(nodeId, node);
		}
	}

	public Node getTopBlockNode(Node node) {
		if (BlockProcedureModel.GENUS_NAME.equals(DOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR))) {
			return node;
		}
		Node tmpNode = node;

		while (tmpNode != null) {
			if (DOMUtil.getChildNode(tmpNode, BlockElementModel.BEFOREBLOCKID_NODE) == null) {
				return tmpNode;
			}
			String beforeBlockID = DOMUtil.getChildText(tmpNode, BlockElementModel.BEFOREBLOCKID_NODE);
			tmpNode = map.get(beforeBlockID);
		}

		return tmpNode;
	}

	public String getSocketBlockType(Node node) {
		String type = "void";
		String id = DOMUtil.getAttribute(node, BlockConnector.CONNECTOR_BLOCK_ID_ATTR);

		if (id != null) {
			Node socketBlockNode = map.get(id);
			type = DOMUtil.getChildText(socketBlockNode, BlockElementModel.TYPE_NODE);
		}

		return type;
	}

	public String getPageNameFromXML(File xmlFile) {
		Document d = toXmlDoc(xmlFile);

		NodeList list = d.getElementsByTagName(PageModel.NODE_NAME);
		if (list == null) {
			throw new RuntimeException("page load error!");
		}

		return DOMUtil.getAttribute(list.item(0), PageModel.NODE_NAME);
	}

	private UniBlock parseBody(Node bodyNode, HashMap<String, Node> map) {
		List<UniExpr> body = new ArrayList<>();

		body.add(parseToExpr(bodyNode, map));

		String nextNodeId = DOMUtil.getChildText(bodyNode, BlockElementModel.AFTERBLOCKID_NODE);
		while (true) {
			if (nextNodeId == null)
				break;
			Node next = map.get(nextNodeId);
			// add body
			UniExpr expr = parseToExpr(next, map);
			body.add(expr);
			nextNodeId = DOMUtil.getChildText(next, BlockElementModel.AFTERBLOCKID_NODE);
		}

		UniBlock block = new UniBlock(body, null);

		return block;
	}

	private UniExpr parseToExpr(Node node, HashMap<String, Node> map) {
		if (BlockElementModel.BLOCK_STUB_NODE.equals(node.getNodeName())) {
			node = DOMUtil.getChildNode(node, BlockElementModel.BLOCK_NODE);
		}

		String blockKind = DOMUtil.getAttribute(node, BlockElementModel.KIND_ATTR);
		// ブロックモデルに応じてJUNICOENの式モデルを生成する
		if (BlockElementModel.BLOCKKINDS.DATA.toString().equals(blockKind)) {
			return parseLiteral(node);// リテラルを解析して式モデルを返す
		} else if (BlockElementModel.BLOCKKINDS.COMMAND.toString().equals(blockKind)) {
			return parseCommand(node, map);// if，while，メソッドなどを解析して式モデルを返す
		} else if (BlockElementModel.BLOCKKINDS.FUNCTION.toString().equals(blockKind)) {
			return parseFunction(node, map);// 二項演算，または単項演算を解析して式モデルを返す
		} else if (BlockElementModel.BLOCKKINDS.LOCAL_VARDEC.toString().equals(blockKind)) {
			return parseLocalVariable(node, map);// ローカル変数を解析して，式モデルを返す
		} else if (BlockElementModel.BLOCKKINDS.ABSTRACTION.toString().equals(blockKind)) {
			return parseAbstraction(node, map);
		} else if (BlockElementModel.BLOCKKINDS.CAST.toString().equals(blockKind)) {
			return parseCast(node, map);
		} else {
			throw new RuntimeException("Unsupported node: " + blockKind);
		}
	}

	private UniExpr parseAbstraction(Node node, HashMap<String, Node> map) {
		Node argsNode = DOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
		List<UniExpr> args = parseSocket(argsNode, map, DOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR));
		UniBlock block = new UniBlock(new ArrayList<>(), "");
		if (!args.isEmpty()) {
			block = (UniBlock) args.get(0);
		}
		block.blockLabel = DOMUtil.getChildText(node, BlockElementModel.LABEL_NODE);

		return block;
	}

	private UniExpr parseCast(Node node, HashMap<String, Node> map) {
		Node argsNode = DOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
		List<UniExpr> args = parseSocket(argsNode, map, DOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR));

		return new UniCast(DOMUtil.getChildText(node, BlockElementModel.TYPE_NODE), args.get(0));
	}

	private UniExpr parseLiteral(Node node) {
		String blockGenusName = DOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR);
		if (BlockIntLiteralModel.INTLITERAL_GENUS_NAME.equals(blockGenusName)) {
			// String num = getChildText(node, BlockElementModel.LABEL_NODE);
			UniIntLiteral num = new UniIntLiteral(Integer.parseInt(DOMUtil.getChildText(node, BlockElementModel.LABEL_NODE)));
			return num;
		} else if (BlockStringLiteralModel.STRINGLITERAL_GENUS_NAME.equals(blockGenusName)) {
			UniStringLiteral lit = new UniStringLiteral(DOMUtil.getChildText(node, BlockElementModel.LABEL_NODE));
			return lit;
		} else if (BlockDoubleLiteralModel.GENUS_NAME.equals(blockGenusName)) {
			UniDoubleLiteral value = new UniDoubleLiteral(Double.parseDouble(DOMUtil.getChildText(node, BlockElementModel.LABEL_NODE)));
			return value;
		} else if (BlockBooleanLiteralModel.TRUELITERAL_GENUS_NAME.equals(blockGenusName)) {
			UniBoolLiteral trueValue = new UniBoolLiteral();
			trueValue.value = true;
			return trueValue;
		} else if (BlockBooleanLiteralModel.FALSELITERAL_GENUS_NAME.equals(blockGenusName)) {
			UniBoolLiteral falseValue = new UniBoolLiteral();
			falseValue.value = false;
			return falseValue;
		} else if (blockGenusName.startsWith(BlockVariableGetterModel.GENUS_HEADER)) {
			UniIdent ident = new UniIdent(DOMUtil.getChildText(node, BlockElementModel.LABEL_NODE));
			return ident;
		} else if (blockGenusName.startsWith(BlockPrePostModel.PRE_POST_GENUSHEADER.PRE_INC.toString())) {
			UniUnaryOp op = new UniUnaryOp("++_", new UniIdent(DOMUtil.getChildText(node, BlockElementModel.LABEL_NODE)));
			return op;
		} else if (blockGenusName.startsWith(BlockPrePostModel.PRE_POST_GENUSHEADER.PRE_DEC.toString())) {
			UniUnaryOp op = new UniUnaryOp("--_", new UniIdent(DOMUtil.getChildText(node, BlockElementModel.LABEL_NODE)));
			return op;
		} else if (blockGenusName.startsWith(BlockPrePostModel.PRE_POST_GENUSHEADER.POST_INC.toString())) {
			UniUnaryOp op = new UniUnaryOp("_++", new UniIdent(DOMUtil.getChildText(node, BlockElementModel.LABEL_NODE)));
			return op;
		} else if (blockGenusName.startsWith(BlockPrePostModel.PRE_POST_GENUSHEADER.POST_DEC.toString())) {
			UniUnaryOp op = new UniUnaryOp("_--", new UniIdent(DOMUtil.getChildText(node, BlockElementModel.LABEL_NODE)));
			return op;
		} else if (resolver.getForceConvertionMap().getUniFieldAccessModel(blockGenusName) != null) {
			return resolver.getForceConvertionMap().getUniFieldAccessModel(blockGenusName);
		} else if (blockGenusName.endsWith(BlockSpecialExpressionModel.SPECIAL_IDENT_GENUS_NAME)) {
			return new UniIdent(DOMUtil.getChildText(node, BlockElementModel.LABEL_NODE));
		} else {
			throw new RuntimeException("not supported data type:" + blockGenusName);
		}
	}

	private UniExpr parseLocalVariable(Node node, HashMap<String, Node> map) {
		Node initValueNode = DOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
		List<UniExpr> initValues = parseSocket(initValueNode, map, DOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR));
		String blockGenusName = DOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR);

		String type = DOMUtil.getChildText(resolver.getBlockNode(blockGenusName), BlockElementModel.TYPE_NODE);
		String name = DOMUtil.getChildText(node, BlockElementModel.LABEL_NODE);

		resolver.getVariableNameResolver().addLocalVariable(DOMUtil.getChildText(node, BlockElementModel.LABEL_NODE), node);

		if (!initValues.isEmpty() && initValues.get(0) != null && initValues.size() > 0) {
			// 初期値あり
			return new UniVariableDec(null, type, name, initValues.get(0));
		} else {
			return new UniVariableDec(null, type, name, null);
		}
	}

	private boolean isBinOp(String op, Node node) {
		Node operator = DOMUtil.getChildNode(node, BlockBinaryOperatorModel.OPERATOR_NODE);
		if (!isUnaryOp(op) && operator != null) {
			return true;
		}
		return false;
	}

	private UniExpr parseFunction(Node node, HashMap<String, Node> map) {
		Node functionArgsNode = DOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
		List<UniExpr> functionArgs = parseSocket(functionArgsNode, map, DOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR));
		String blockGenusName = DOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR);

		if (isUnaryOp(blockGenusName)) {
			UniUnaryOp unaryOp = new UniUnaryOp();
			unaryOp.operator = DOMUtil.getChildText(resolver.getBlockNode(blockGenusName), BlockBinaryOperatorModel.OPERATOR_NODE);
			unaryOp.expr = functionArgs.get(0);
			return unaryOp;
		} else if (isBinOp(blockGenusName, resolver.getBlockNode(blockGenusName))) {
			UniBinOp binOp = new UniBinOp();
			binOp.operator = DOMUtil.getChildText(resolver.getBlockNode(blockGenusName), BlockBinaryOperatorModel.OPERATOR_NODE);
			binOp.left = functionArgs.get(0);
			binOp.right = functionArgs.get(1);

			return binOp;
		} else if (isNewInstanceCreation(blockGenusName)) {
			UniNew uniNewModel = new UniNew(DOMUtil.getChildText(node, BlockElementModel.TYPE_NODE), new ArrayList<UniExpr>());
			List<UniExpr> sockets = parseSocket(getSocketsNode(node), map, blockGenusName);
			uniNewModel.args = sockets;
			return uniNewModel;
		} else if (resolver.getForceConvertionMap().getUniMethodCallModel(blockGenusName) != null) {
			UniMethodCall model = new UniMethodCall();
			model.merge(resolver.getForceConvertionMap().getUniMethodCallModel(blockGenusName));
			model.args = functionArgs;
			return model;
		} else if (isExCallerGetterModel(blockGenusName)) {
			UniMethodCall method = new UniMethodCall();
			method = (UniMethodCall) functionArgs.get(1);
			method.receiver = functionArgs.get(0);
			return method;
		} else {
			// MethodCallとする
			UniMethodCall call = new UniMethodCall(null, DOMUtil.getChildText(resolver.getBlockNode(blockGenusName), BlockElementModel.NAME_NODE), functionArgs);
			return call;
		}
	}

	public boolean isExCallerGetterModel(String genusName) {
		return genusName.equals(BlockExCallGetterModel.GENUS_NAME);
	}

	public boolean isNewInstanceCreation(String blockType) {
		return blockType.startsWith("new-");
	}

	public boolean isUnaryOp(String blockType) {
		if ("not".equals(blockType)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Socketsノードを解析し，UniModelを作成する．
	 * 
	 * @param argsNode
	 *            Socketsノード
	 * @param map
	 *            id,Blockノードのマップ
	 * @return ソケットのUniModel
	 */
	private List<UniExpr> parseSocket(Node argsNode, HashMap<String, Node> map, String plugBlockGenusName) {
		List<UniExpr> args = new ArrayList<>();
		if (argsNode != null) {
			for (Node argNode : DOMUtil.eachChild(argsNode)) {
				assert argNode.getNodeName().equals(BlockConnector.CONNECTOR_NODE);
				String argElemId = DOMUtil.getAttribute(argNode, BlockConnector.CONNECTOR_BLOCK_ID_ATTR);
				Node realArgNode = map.get(argElemId);
				if (realArgNode != null) {
					// beforeを持たないElementNodeは引数なので，引数の解析
					if (DOMUtil.getChildText(realArgNode, BlockElementModel.BEFOREBLOCKID_NODE) == null || plugBlockGenusName.equals(BlockExCallerModel.GENUS_NAME)) {
						args.add(parseToExpr(realArgNode, map));
					} else {
						args.add(parseBody(realArgNode, map));
					}
				} else {
					return args;
				}
			}
		}
		return args;
	}

	private UniWhile parseWhile(Node node, HashMap<String, Node> map) {
		Node argsNode = DOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
		List<UniExpr> args = new ArrayList<UniExpr>();

		int i = 0;
		// ifブロックのソケットのノードからUniExprを作成
		for (Node argNode : DOMUtil.eachChild(argsNode)) {
			String argElemId = DOMUtil.getAttribute(argNode, BlockConnector.CONNECTOR_BLOCK_ID_ATTR);
			Node realArgNode = map.get(argElemId);
			if (realArgNode != null) {
				if (i == 0) {
					args.add(parseToExpr(realArgNode, map));
				} else {
					args.add(parseBody(realArgNode, map));
				}
			} else {
				args.add(null);
			}
			i++;
		}
		return new UniWhile(args.get(0), args.get(1));
	}

	private UniDoWhile parseDoWhile(Node node, HashMap<String, Node> map) {
		Node argsNode = DOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
		List<UniExpr> args = new ArrayList<UniExpr>();

		int i = 0;
		// ifブロックのソケットのノードからUniExprを作成
		for (Node argNode : DOMUtil.eachChild(argsNode)) {
			String argElemId = DOMUtil.getAttribute(argNode, BlockConnector.CONNECTOR_BLOCK_ID_ATTR);
			Node realArgNode = map.get(argElemId);
			if (realArgNode != null) {
				if (i == 0) {
					args.add(parseBody(realArgNode, map));
				} else {
					args.add(parseToExpr(realArgNode, map));
				}
			} else {
				args.add(null);
			}
			i++;
		}
		return new UniDoWhile(args.get(0), args.get(1));
	}
	
	private UniIf parseIfBlock(Node node, HashMap<String, Node> map) {
		Node argsNode = DOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
		List<UniExpr> args = new ArrayList<UniExpr>();
		int i = 0;
		// ifブロックのソケットのノードからUniExprを作成
		for (Node argNode : DOMUtil.eachChild(argsNode)) {
			String argElemId = DOMUtil.getAttribute(argNode, BlockConnector.CONNECTOR_BLOCK_ID_ATTR);
			Node realArgNode = map.get(argElemId);
			if (realArgNode != null) {
				if (i == 0) {
					args.add(parseToExpr(realArgNode, map));
				} else {
					args.add(parseBody(realArgNode, map));
				}
			} else {
				args.add(null);
			}
			i++;
		}

		return new UniIf(args.get(0), args.get(1), args.get(2));
	}

	private UniExpr parseCommand(Node node, HashMap<String, Node> map) {
		String blockGenusName = DOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR);// ブロックの種類名を取得

		if (isConditionStatement(blockGenusName)) {
			if ("ifelse".equals(blockGenusName)) {
				return parseIfBlock(node, map);
			} else if ("while".equals(blockGenusName)) {
				return parseWhile(node, map);
			} else {
				return parseDoWhile(node, map);
			}
		} else {
			Node argsNode = DOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
			List<UniExpr> args = parseSocket(argsNode, map, DOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR));
			if ("special-variable".equals(blockGenusName)) {
				args.add(null);
				return new UniVariableDec(new ArrayList<>(), DOMUtil.getChildText(node, BlockElementModel.TYPE_NODE), DOMUtil.getChildText(node, BlockElementModel.NAME_NODE), args.get(0));
			} else if ("continue".equals(blockGenusName)) {
				return new UniContinue();
			} else if ("break".equals(blockGenusName)) {
				return new UniBreak();
			} else if ("return".equals(blockGenusName)) {
				UniReturn uniReturn = new UniReturn();
				if (args.size() == 1) {
					uniReturn.value = args.get(0);
				}
				return uniReturn;
			} else if (blockGenusName.startsWith("setter")) {
				// BlockModelを解析して，UniversalModelを生成する
				String variableName = DOMUtil.getChildText(node, BlockElementModel.LABEL_NODE);
				if (resolver.getVariableNameResolver().getVariableBlockNode(variableName) != null || args.size() == 1) {
					// 代入式
					UniBinOp op = new UniBinOp("=", new UniIdent(variableName), args.get(0));
					return op;
				} else {
					throw new RuntimeException("illegal setter");
				}
			} else if (blockGenusName.startsWith("inc")) {// increment
				String variableName = DOMUtil.getChildText(node, BlockElementModel.LABEL_NODE);
				if (resolver.getVariableNameResolver().getVariableBlockNode(variableName) != null || args.size() == 1) {
					// 代入式
					UniUnaryOp op = new UniUnaryOp("_++", new UniIdent(variableName));
					return op;
				} else {
					throw new RuntimeException("illegal setter");
				}
			} else if (blockGenusName.equals("callActionMethod2")) {
				UniIdent ident = (UniIdent) args.get(0);
				UniMethodCall caller = (UniMethodCall) args.get(1);
				caller.receiver = ident;
				return caller;
			} else if (blockGenusName.equals("callerprocedure")) {
				String methodName = DOMUtil.getChildTextFromBlockNode(node, BlockElementModel.NAME_NODE);
				UniMethodCall call = new UniMethodCall(null, methodName, args);
				return call;
			} else if (resolver.getForceConvertionMap().getUniMethodCallModel(blockGenusName) != null) {
				UniMethodCall model = resolver.getForceConvertionMap().getUniMethodCallModel(blockGenusName);
				Node sockets = getSocketsNode(node);
				model.args = parseSocket(sockets, map, blockGenusName);
				return model;
			} else if (blockGenusName.equals(BlockSpecialModel.GENUS_NAME)) {
				String methodName = DOMUtil.getChildTextFromBlockNode(node, BlockElementModel.NAME_NODE);
				return new UniMethodCall(null, methodName, args);
			} else if (blockGenusName.equals(BlockEmptyModel.GENUS_NAME)) {
				return new UniEmptyStatement();
			} else {
				String methodName = DOMUtil.getChildTextFromBlockNode(resolver.getBlockNode(blockGenusName), BlockElementModel.NAME_NODE);

				UniMethodCall mcall = getProtoType(methodName);
				if (mcall != null) {
					mcall.args = args;
					return mcall;
				} else {
					throw new RuntimeException("Unknown method type: " + blockGenusName);
				}
			}
		}
	}

	private boolean isConditionStatement(String genusName) {
		return genusName.equals(BlockIfModel.GENUS_NAME) || genusName.equals(BlockWhileModel.GENUS_NAME) || genusName.equals(BlockDoWhileModel.GENUS_NAME);
	}

	private static UniMethodCall getProtoType(String methodName) {
		/*
		 * 最初にテーブルを作って、呼ばれるたびに、nodeのクローンを作って返す。
		 */
		if (methodName != null) {
			UniMethodCall mcall = new UniMethodCall(null, methodName, new ArrayList<UniExpr>());
			return mcall;
		} else {
			throw new RuntimeException("method name is null:" + methodName);
		}
	}

	private static Node getNode(File xmlFile, String nodeName) {
		Document d = toXmlDoc(xmlFile);

		NodeList list = d.getElementsByTagName(nodeName);
		if (list.getLength() != 1)
			throw new RuntimeException("Root node must be one.");
		Node pageBlock = list.item(0);
		return pageBlock;
	}

	private static Document toXmlDoc(File xmlFile) {
		DOMParser dParser = new DOMParser();
		InputSource src = new InputSource();
		try (InputStream in = new FileInputStream(xmlFile)) {
			src.setByteStream(in);
			dParser.parse(src);
			return dParser.getDocument();
		} catch (SAXException | IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Fail to parse", e);
		}
	}

	public Node getSocketsNode(Node node) {
		return DOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
	}

}
