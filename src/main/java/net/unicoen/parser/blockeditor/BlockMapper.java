package net.unicoen.parser.blockeditor;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.xerces.parsers.DOMParser;
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
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniFieldDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniImport;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNamespace;
import net.unicoen.node.UniNew;
import net.unicoen.node.UniProgram;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;
import net.unicoen.parser.blockeditor.blockmodel.BlockBinaryOperatorModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockBooleanLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockConnector;
import net.unicoen.parser.blockeditor.blockmodel.BlockDoubleLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockElementModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockEmptyModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockExCallGetterModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockExCallerModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockFieldAccessModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockFieldVarDecModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockIntLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockNewModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockPrePostModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockProcedureModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockReturnModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockSocketsModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockSpecialExpressionModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockSpecialModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockStringLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockUserMethodCallModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockVariableGetterModel;
import net.unicoen.parser.blockeditor.blockmodel.PageModel;
import net.unicoen.parser.blockeditor.blockmodel.PagesModel;

public class BlockMapper {

	private HashMap<String, Node> map = new HashMap<>();// Blockのidをキー該当ノードをvalueとして全てのBlockNodeを保持する変数
	private BlockResolver resolver;

	public BlockMapper(String langdefRootPath) throws SAXException, IOException {
		resolver = new BlockResolver(langdefRootPath, false);
	}

	public BlockMapper(String langdefRootPath, boolean isTest) throws SAXException, IOException {
		resolver = new BlockResolver(langdefRootPath, isTest);
	}

	public static UniProgram generate(String sourceText) throws SAXException, IOException {
		BlockMapper mapper = new BlockMapper("blockeditor/blocks/", true);
		return mapper.parseBlockSourceText(sourceText);
	}

	public UniClassDec parse(Node pageBlock) {
		String className = MyDOMUtil.getAttribute(pageBlock, PageModel.PAGE_NAME_ATTR);
		Node pageBlocksNode = MyDOMUtil.getChildNode(pageBlock, PageModel.PAGE_BLOCKS);

		// Blockノードの親ノードを取得する
		UniClassDec classDec = createProcotypeClassModel(className, MyDOMUtil.getChildNode(pageBlock, PageModel.PAGE_INFO_NODE));
		List<Node> procs = new ArrayList<>();// Blockのidをキー該当ノードをvalueとしてメソッド定義ブロックのBlockNodeを保持する変数
		Map<String, String> methodsReturnTypes = new HashMap<>();// 返り値の型を保持する
		List<Node> fieldVariables = new ArrayList<>();

		// mapに全てのBlockNodeを,procsに全てのメソッド定義のBlockNodeを保存する
		putAllBlockNodes(pageBlocksNode);
		preparseNodes(pageBlocksNode, procs, methodsReturnTypes, fieldVariables);

		// classモデルにメンバを追加する
		classDec.members = parseFieldVariableNodes(fieldVariables);
		classDec.members.addAll(parseMethodNodes(procs, methodsReturnTypes));

		// キャッシュクリア
		map.clear();

		return classDec;
	}

	public UniProgram parseBlockSourceText(String text) throws SAXException, IOException {
		DOMParser parser = new DOMParser();
		Reader reader = new StringReader(text);
		InputSource is = new InputSource(reader);
		parser.parse(is);
		Node pagesNode = MyDOMUtil.getChildNode(parser.getDocument().getFirstChild(), PagesModel.PAGES_NODE);
		return parsePagesNode(pagesNode);
	}

	public UniProgram parseBlockSouceFile(String filePath) {
		Node pagesNode = MyDOMUtil.getChildNode(MyDOMUtil.getNodeFromXMLFilePath(filePath), PagesModel.PAGES_NODE);
		return parsePagesNode(pagesNode);
	}

	private UniProgram parsePagesNode(Node pagesNode) {
		List<Node> pagesChildNodes = MyDOMUtil.getChildNodes(pagesNode);
		UniProgram fileModel = new UniProgram(new ArrayList<>(), new ArrayList<>(), new UniNamespace(""));
		for (Node node : pagesChildNodes) {
			if (node.getNodeName().equals(PagesModel.IMPORT_STATEMENTS_NODE)) {
				// import statements の追加
				List<Node> importStatements = MyDOMUtil.getChildNodes(node);
				for (Node importStatement : importStatements) {
					if (PagesModel.IMPORT_STATEMENT_NODE.equals(importStatement.getNodeName())) {
						fileModel.imports.add(new UniImport(importStatement.getTextContent(), false));
					}
				}
			} else if (node.getNodeName().equals(PageModel.NODE_NAME)) {
				fileModel.classes.add(parse(node));
			}
		}

		return fileModel;
	}

	public List<UniMemberDec> parseFieldVariableNodes(List<Node> procs) {
		List<UniMemberDec> fieldVariables = new ArrayList<>();
		for (Node node : procs) {
			UniFieldDec dec = new UniFieldDec(Lists.newArrayList("private"), MyDOMUtil.getChildText(node, BlockElementModel.TYPE_NODE), MyDOMUtil.getChildText(node, BlockElementModel.NAME_NODE), null);

			List<UniExpr> initValues = parseSocket(MyDOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME), map, MyDOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR));
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
			String nextNodeId = MyDOMUtil.getChildText(procNode, BlockElementModel.AFTERBLOCKID_NODE);
			UniBlock body = new UniBlock(new ArrayList<>(), null);
			if (nextNodeId != null) {
				body = parseBody(map.get(nextNodeId), map);
			}
			ret.add(new UniMethodDec(MyDOMUtil.getChildText(procNode, BlockElementModel.LABEL_NODE), getModifiers(procNode), methodsReturnTypes.get(MyDOMUtil.getAttribute(procNode, BlockElementModel.ID_ATTR)), createArgumentsModel(procNode), body));
		}
		return ret;
	}

	public List<String> getModifiers(Node node) {
		List<String> modifiers = new ArrayList<>();

		Node modifiersNode = MyDOMUtil.getChildNode(node, BlockProcedureModel.MODIFIERS_NODE);
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
		for (Node node : MyDOMUtil.eachChild(pageBlock)) {
			String name = node.getNodeName();
			if (name.startsWith("#")) {
				continue;
			} else if (name.equals(BlockElementModel.BLOCK_STUB_NODE)) {
				node = MyDOMUtil.getChildNode(node, BlockElementModel.BLOCK_NODE);
			}

			String nodeId = MyDOMUtil.getAttribute(node, BlockElementModel.ID_ATTR);
			String kind = MyDOMUtil.getAttribute(node, BlockElementModel.KIND_ATTR);
			String genusName = MyDOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR);
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
				Node socketsNode = MyDOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
				returnTypes.put(MyDOMUtil.getAttribute(getTopProcedure(node), BlockElementModel.ID_ATTR), getSocketBlockType(MyDOMUtil.getChildNode(socketsNode, BlockConnector.CONNECTOR_NODE)));
			}
		}
	}

	public List<UniArg> createArgumentsModel(Node procedureNode) {
		Node socketNode = MyDOMUtil.getChildNode(procedureNode, BlockSocketsModel.NODE_NAME);
		List<Node> connectors = MyDOMUtil.getChildNodes(socketNode);
		List<UniArg> args = new ArrayList<>();
		for (Node connector : connectors) {
			if (connector.getNodeName().equals(BlockConnector.CONNECTOR_NODE)) {
				Node connectorBlock = map.get(MyDOMUtil.getAttribute(connector, BlockConnector.CONNECTOR_BLOCK_ID_ATTR));
				if (connectorBlock != null) {
					String name = MyDOMUtil.getChildText(connectorBlock, BlockElementModel.NAME_NODE);
					String type = MyDOMUtil.getChildText(connectorBlock, BlockElementModel.TYPE_NODE);
					args.add(new UniArg(type, name));
				}
			}
		}
		return args;
	}

	public UniClassDec createProcotypeClassModel(String className, Node pageInfoNode) {
		UniClassDec classDec = new UniClassDec();
		classDec.className = className;
		classDec.interfaces = MyDOMUtil.getListFromNode(MyDOMUtil.getChildNode(pageInfoNode, PageModel.INTERFASES_NODE), PageModel.INTERFASE_NAME_NODE);
		classDec.superClass = MyDOMUtil.getListFromNode(MyDOMUtil.getChildNode(pageInfoNode, PageModel.SUPER_CLASSES_NODE), PageModel.SUPERCLASS_NAME_NODE);
		classDec.modifiers = MyDOMUtil.getListFromNode(MyDOMUtil.getChildNode(pageInfoNode, PageModel.MODIFIERS_NODE), PageModel.MODIFIER_NODE);
		classDec.members = new ArrayList<>();

		return classDec;
	}

	public void putAllBlockNodes(Node pageBlock) {
		// xmlのPageの子ノードから，メソッド定義のBlockノードのみを抽出する
		for (Node node : MyDOMUtil.eachChild(pageBlock)) {
			String name = node.getNodeName();
			if (name.startsWith("#")) {
				continue;
			} else if (name.equals(BlockElementModel.BLOCK_STUB_NODE)) {
				node = MyDOMUtil.getChildNode(node, BlockElementModel.BLOCK_NODE);
			}

			map.put(MyDOMUtil.getAttribute(node, BlockElementModel.ID_ATTR), node);
		}
	}

	public Node getTopProcedure(Node node) {
		Node tmpNode = node;
		while (tmpNode != null) {
			if (MyDOMUtil.getAttribute(tmpNode, BlockElementModel.GENUS_NAME_ATTR).equals(BlockProcedureModel.GENUS_NAME)) {
				return tmpNode;
			}
			tmpNode = map.get(MyDOMUtil.getChildText(tmpNode, BlockElementModel.BEFOREBLOCKID_NODE));
		}

		return tmpNode;
	}

	public String getSocketBlockType(Node node) {
		String type = "void";
		String id = MyDOMUtil.getAttribute(node, BlockConnector.CONNECTOR_BLOCK_ID_ATTR);

		if (id != null) {
			type = MyDOMUtil.getChildText(map.get(id), BlockElementModel.TYPE_NODE);
		}

		return type;
	}

	private UniBlock parseBody(Node bodyNode, HashMap<String, Node> map) {
		List<UniExpr> body = new ArrayList<>();
		body.add(parseToExpr(bodyNode, map));

		String nextNodeId = MyDOMUtil.getChildText(bodyNode, BlockElementModel.AFTERBLOCKID_NODE);
		while (true) {
			if (nextNodeId == null)
				break;
			Node next = map.get(nextNodeId);
			// add body
			body.add(parseToExpr(next, map));
			nextNodeId = MyDOMUtil.getChildText(next, BlockElementModel.AFTERBLOCKID_NODE);
		}

		return new UniBlock(body, null);
	}

	private UniExpr parseToExpr(Node node, HashMap<String, Node> map) {
		if (BlockElementModel.BLOCK_STUB_NODE.equals(node.getNodeName())) {
			node = MyDOMUtil.getChildNode(node, BlockElementModel.BLOCK_NODE);
		}

		String blockKind = MyDOMUtil.getAttribute(node, BlockElementModel.KIND_ATTR);
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
		Node argsNode = MyDOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
		List<UniExpr> args = parseSocket(argsNode, map, MyDOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR));
		UniBlock block = new UniBlock(new ArrayList<>(), "");
		if (!args.isEmpty()) {
			block = (UniBlock) args.get(0);
		}
		block.blockLabel = MyDOMUtil.getChildText(node, BlockElementModel.LABEL_NODE);

		return block;
	}

	private UniExpr parseCast(Node node, HashMap<String, Node> map) {
		return new UniCast(MyDOMUtil.getChildText(node, BlockElementModel.TYPE_NODE), parseSocket(MyDOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME), map, MyDOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR)).get(0));
	}

	private UniExpr parseLiteral(Node node) {
		String blockGenusName = MyDOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR);
		if (BlockIntLiteralModel.INTLITERAL_GENUS_NAME.equals(blockGenusName)) {
			return new UniIntLiteral(Integer.parseInt(MyDOMUtil.getChildText(node, BlockElementModel.LABEL_NODE)));
		} else if (BlockStringLiteralModel.STRINGLITERAL_GENUS_NAME.equals(blockGenusName)) {
			return new UniStringLiteral(MyDOMUtil.getChildText(node, BlockElementModel.LABEL_NODE));
		} else if (BlockDoubleLiteralModel.GENUS_NAME.equals(blockGenusName)) {
			return new UniDoubleLiteral(Double.parseDouble(MyDOMUtil.getChildText(node, BlockElementModel.LABEL_NODE)));
		} else if (BlockBooleanLiteralModel.TRUELITERAL_GENUS_NAME.equals(blockGenusName)) {
			return new UniBoolLiteral(true);
		} else if (BlockBooleanLiteralModel.FALSELITERAL_GENUS_NAME.equals(blockGenusName)) {
			return new UniBoolLiteral(false);
		} else if (blockGenusName.startsWith(BlockVariableGetterModel.GENUS_HEADER)) {
			return new UniIdent(MyDOMUtil.getChildText(node, BlockElementModel.LABEL_NODE));
		} else if (blockGenusName.startsWith(BlockPrePostModel.PRE_POST_GENUSHEADER.PRE_INC.toString())) {
			return new UniUnaryOp("++_", new UniIdent(MyDOMUtil.getChildText(node, BlockElementModel.LABEL_NODE)));
		} else if (blockGenusName.startsWith(BlockPrePostModel.PRE_POST_GENUSHEADER.PRE_DEC.toString())) {
			return new UniUnaryOp("--_", new UniIdent(MyDOMUtil.getChildText(node, BlockElementModel.LABEL_NODE)));
		} else if (blockGenusName.startsWith(BlockPrePostModel.PRE_POST_GENUSHEADER.POST_INC.toString())) {
			return new UniUnaryOp("_++", new UniIdent(MyDOMUtil.getChildText(node, BlockElementModel.LABEL_NODE)));
		} else if (blockGenusName.startsWith(BlockPrePostModel.PRE_POST_GENUSHEADER.POST_DEC.toString())) {
			return new UniUnaryOp("_--", new UniIdent(MyDOMUtil.getChildText(node, BlockElementModel.LABEL_NODE)));
		} else if (resolver.getForceConvertionMap().getUniFieldAccessModel(blockGenusName) != null) {
			return resolver.getForceConvertionMap().getUniFieldAccessModel(blockGenusName);
		} else if (blockGenusName.endsWith(BlockSpecialExpressionModel.SPECIAL_IDENT_GENUS_NAME)) {
			return new UniIdent(MyDOMUtil.getChildText(node, BlockElementModel.LABEL_NODE));
		} else {
			throw new RuntimeException("not supported data type:" + blockGenusName);
		}
	}

	private UniExpr parseLocalVariable(Node node, HashMap<String, Node> map) {
		Node initValueNode = MyDOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
		List<UniExpr> initValues = parseSocket(initValueNode, map, MyDOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR));

		String type = MyDOMUtil.getChildText(node, BlockElementModel.TYPE_NODE);
		String name = MyDOMUtil.getChildText(node, BlockElementModel.LABEL_NODE);

		if (!initValues.isEmpty() && initValues.get(0) != null && initValues.size() > 0) {
			// 初期値あり
			return new UniVariableDec(null, type, name, initValues.get(0));
		} else {
			return new UniVariableDec(null, type, name, null);
		}
	}

	private boolean isBinOp(String op, Node node) {
		if (node == null) {
			return false;
		}
		Node operator = MyDOMUtil.getChildNode(node, BlockBinaryOperatorModel.OPERATOR_NODE);
		if (!isUnaryOp(op) && operator != null) {
			return true;
		}
		return false;
	}

	private UniExpr parseFunction(Node node, HashMap<String, Node> map) {
		Node functionArgsNode = MyDOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
		List<UniExpr> functionArgs = parseSocket(functionArgsNode, map, MyDOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR));
		String blockGenusName = MyDOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR);

		if (isUnaryOp(blockGenusName)) {
			return new UniUnaryOp(MyDOMUtil.getChildText(resolver.getBlockNode(blockGenusName), BlockBinaryOperatorModel.OPERATOR_NODE), functionArgs.get(0));
		} else if (isBinOp(blockGenusName, resolver.getBlockNode(blockGenusName))) {
			return new UniBinOp(MyDOMUtil.getChildText(resolver.getBlockNode(blockGenusName), BlockBinaryOperatorModel.OPERATOR_NODE), functionArgs.get(0), functionArgs.get(1));
		} else if (blockGenusName.startsWith(BlockNewModel.GENUS_HEADER)) {
			return new UniNew(MyDOMUtil.getChildText(node, BlockElementModel.TYPE_NODE), parseSocket(MyDOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME), map, blockGenusName));
		} else if (resolver.getForceConvertionMap().getUniMethodCallModel(blockGenusName) != null) {
			UniMethodCall model = new UniMethodCall();
			model.merge(resolver.getForceConvertionMap().getUniMethodCallModel(blockGenusName));
			model.args = functionArgs;
			return model;
		} else if (blockGenusName.equals(BlockExCallGetterModel.GENUS_NAME)) {
			UniMethodCall method = (UniMethodCall) functionArgs.get(1);
			method.receiver = functionArgs.get(0);
			return method;
		} else if (blockGenusName.equals(BlockFieldAccessModel.GENUS_NAME)) {
			return new UniFieldAccess(functionArgs.get(0), ((UniIdent) (functionArgs.get(1))).name);
		} else {
			// MethodCallとする
			UniMethodCall call = new UniMethodCall(null, MyDOMUtil.getChildText(node, BlockElementModel.NAME_NODE), functionArgs);
			return call;
		}
	}

	public boolean isFieldAccessModel(String genusName) {
		return genusName.equals(BlockFieldAccessModel.GENUS_NAME);
	}


	public boolean isUnaryOp(String blockType) {
		return "not".equals(blockType);
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
			for (Node argNode : MyDOMUtil.eachChild(argsNode)) {
				String argElemId = MyDOMUtil.getAttribute(argNode, BlockConnector.CONNECTOR_BLOCK_ID_ATTR);
				Node realArgNode = map.get(argElemId);
				if (realArgNode != null) {
					// beforeを持たないElementNodeは引数なので，引数の解析
					if (MyDOMUtil.getChildText(realArgNode, BlockElementModel.BEFOREBLOCKID_NODE) == null || plugBlockGenusName.equals(BlockExCallerModel.GENUS_NAME)) {
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
		Node argsNode = MyDOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
		List<UniExpr> args = parseControlBlockSockets(argsNode);

		return new UniWhile(args.get(0), args.get(1));
	}
	
	private List<UniExpr> parseControlBlockSockets(Node node){
		List<UniExpr> args = new ArrayList<UniExpr>();
		// ifブロックのソケットのノードからUniExprを作成
		for (Node argNode : MyDOMUtil.eachChild(node)) {
			String argElemId = MyDOMUtil.getAttribute(argNode, BlockConnector.CONNECTOR_BLOCK_ID_ATTR);
			Node realArgNode = map.get(argElemId);
			if (realArgNode != null) {
				if (args.isEmpty()) {
					args.add(parseToExpr(realArgNode, map));
				} else {
					args.add(parseBody(realArgNode, map));
				}
			} else {
				args.add(null);
			}
		}
		
		return args;
	}

	private UniDoWhile parseDoWhile(Node node, HashMap<String, Node> map) {
		Node argsNode = MyDOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
		List<UniExpr> args = new ArrayList<UniExpr>();

		// ifブロックのソケットのノードからUniExprを作成
		for (Node argNode : MyDOMUtil.eachChild(argsNode)) {
			Node realArgNode = map.get(MyDOMUtil.getAttribute(argNode, BlockConnector.CONNECTOR_BLOCK_ID_ATTR));
			if (realArgNode != null) {
				if (args.isEmpty()) {
					args.add(parseBody(realArgNode, map));
				} else {
					args.add(parseToExpr(realArgNode, map));
				}
			} else {
				args.add(null);
			}
		}
		return new UniDoWhile(args.get(0), args.get(1));
	}

	private UniIf parseIfBlock(Node node, HashMap<String, Node> map) {
		Node argsNode = MyDOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
		List<UniExpr> args = parseControlBlockSockets(argsNode);

		return new UniIf(args.get(0), args.get(1), args.get(2));
	}

	private UniExpr parseCommand(Node node, HashMap<String, Node> map) {
		String blockGenusName = MyDOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR);// ブロックの種類名を取得
		Node argsNode = MyDOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
		List<UniExpr> args = parseSocket(argsNode, map, MyDOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR));
		
		if ("ifelse".equals(blockGenusName)) {
			return parseIfBlock(node, map);
		} else if ("while".equals(blockGenusName)) {
			return parseWhile(node, map);
		} else if ("dowhile".equals(blockGenusName)) {
			return parseDoWhile(node, map);
		} else if ("special-variable".equals(blockGenusName)) {
			args.add(null);
			return new UniVariableDec(new ArrayList<>(), MyDOMUtil.getChildText(node, BlockElementModel.TYPE_NODE), MyDOMUtil.getChildText(node, BlockElementModel.NAME_NODE), args.get(0));
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
			UniBinOp op = new UniBinOp("=", new UniIdent(MyDOMUtil.getChildText(node, BlockElementModel.LABEL_NODE)), args.get(0));
			return op;
		} else if (blockGenusName.startsWith("inc")) {// increment
			UniUnaryOp op = new UniUnaryOp("_++", new UniIdent(MyDOMUtil.getChildText(node, BlockElementModel.LABEL_NODE)));
			return op;
		} else if (blockGenusName.equals("callActionMethod2")) {
			UniMethodCall caller = (UniMethodCall) args.get(1);
			caller.receiver = args.get(0);
			return caller;
		} else if (blockGenusName.equals(BlockUserMethodCallModel.GENUS_NAME)) {
			return new UniMethodCall(null, MyDOMUtil.getChildTextFromBlockNode(node, BlockElementModel.NAME_NODE), args);
		} else if (resolver.getForceConvertionMap().getUniMethodCallModel(blockGenusName) != null) {
			UniMethodCall model = resolver.getForceConvertionMap().getUniMethodCallModel(blockGenusName);
			Node sockets = MyDOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME);
			model.args = parseSocket(sockets, map, blockGenusName);
			return model;
		} else if (blockGenusName.equals(BlockSpecialModel.GENUS_NAME)) {
			return new UniMethodCall(null, MyDOMUtil.getChildTextFromBlockNode(node, BlockElementModel.NAME_NODE), args);
		} else if (blockGenusName.equals(BlockEmptyModel.GENUS_NAME)) {
			return new UniEmptyStatement();
		} else {
			return new UniMethodCall(null, MyDOMUtil.getChildTextFromBlockNode(resolver.getBlockNode(blockGenusName), BlockElementModel.NAME_NODE), args);
		}
	}

}
