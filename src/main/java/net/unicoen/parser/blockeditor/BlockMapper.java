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
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniContinue;
import net.unicoen.node.UniDoWhile;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNew;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;
import net.unicoen.parser.blockeditor.blockmodel.BlockConnectorInfo;
import net.unicoen.parser.blockeditor.blockmodel.BlockElementModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockExCallGetterModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockExCallerModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockFieldVarDecModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockProcedureModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockReturnModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockSocketsModel;
import net.unicoen.parser.blockeditor.blockmodel.PageModel;

public class BlockMapper {

	private VariableNameResolver variableResolver = new VariableNameResolver();
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
		List<Node>  fieldVariables = new ArrayList<>();
		
		// mapに全てのBlockNodeを,procsに全てのメソッド定義のBlockNodeを保存する
		putAllBlockNodes(pageBlock);
		preparseNodes(pageBlock, procs, methodsReturnTypes, fieldVariables);
		
		classDec.members = parseFieldVariableNodes(fieldVariables);

		classDec.members.addAll(parseMethodNodes(procs, methodsReturnTypes));

		return classDec;
	}
	
	public List<UniMemberDec> parseFieldVariableNodes(List<Node> procs){
		List<UniMemberDec> fieldVariables = new ArrayList<>();
		for(Node node : procs){
			UniFieldDec dec = new UniFieldDec();
			dec.name = DOMUtil.getChildText(node, BlockElementModel.NAME_NODE_NAME);
			dec.type = DOMUtil.getChildText(node, BlockElementModel.TYPE_NODE_NAME);
			dec.modifiers = Lists.newArrayList("private");
			
			List<UniExpr> initValues = parseSocket(DOMUtil.getChildNode(node, BlockSocketsModel.NODE_NAME), map);
			
			if (!initValues.isEmpty()) {
				dec.value=initValues.get(0);
			}
			fieldVariables.add(dec);
		}
		return fieldVariables;
	}

	public List<UniMemberDec> parseMethodNodes(List<Node> procs, Map<String, String> methodsReturnTypes){
		List<UniMemberDec> ret = new ArrayList<>();
		for (Node procNode : procs) {
			UniMethodDec d = new UniMethodDec(DOMUtil.getChildText(procNode, BlockElementModel.LABEL_NODE_NAME), new ArrayList<>(), methodsReturnTypes.get(DOMUtil.getAttribute(procNode, BlockElementModel.ID_ATTRIBUTE_TAG)), new ArrayList<>(), null);
			d.modifiers.add("public");
			if(DOMUtil.getChildNode(procNode, BlockProcedureModel.MAIN_NODE) != null){
				d.modifiers.add("static");
			}
			
			d.args = createArgumentsModel(procNode);

			UniBlock body = new UniBlock(new ArrayList<>(), null);

			String nextNodeId = DOMUtil.getChildText(procNode, BlockElementModel.AFTERBLOCKID_NODE_NAME);
			if (nextNodeId != null) {
				body = parseBody(map.get(nextNodeId), map);
			}

			d.block = body;
			d.returnType = methodsReturnTypes.get(DOMUtil.getAttribute(procNode, BlockElementModel.ID_ATTRIBUTE_TAG));
			ret.add(d);
			variableResolver.resetLocalVariables();
		}
		return ret;
	}
	
	/**
	 * 一度pageblocksノードを全て解析し，インスタンス変数ノード，メソッドノード，メソッド名と返り値を取得する
	 * @param pageBlock pageblocksノード
	 * @param procs メソッド定義ノードを格納するリスト
	 * @param returnTypes メソッド名とその返り値を登録するマップ
	 */
	public void preparseNodes(Node pageBlock, List<Node> procs, Map<String, String> returnTypes, List<Node> fieldVariables) {
		// xmlのPageの子ノードから，メソッド定義のBlockノードのみを抽出する
		for (Node node : DOMUtil.eachChild(pageBlock)) {
			String name = node.getNodeName();
			if (name.startsWith("#")) {
				continue;
			} else if (name.equals(BlockElementModel.BLOCK_STUB_NODE_NAME)) {
				node = DOMUtil.getChildNode(node, BlockElementModel.BLOCK_NODE_NAME);
			}
			
			String nodeId = DOMUtil.getAttribute(node, BlockElementModel.ID_ATTRIBUTE_TAG);
			String kind = DOMUtil.getAttribute(node, BlockElementModel.KIND_ATTRIBUTE_TAG);
			if (BlockProcedureModel.KIND.equals(kind)) {
				procs.add(node);
				if (returnTypes.get(nodeId) == null) {
					returnTypes.put(nodeId, "void");
				}
			} else if(BlockFieldVarDecModel.KIND.equals(kind)){
				fieldVariables.add(node);
			} else if (BlockReturnModel.KIND.equals(kind)) {
				Node socketNode = DOMUtil.getChildNode(getSocketsNode(node), "BlockConnector");
				returnTypes.put(DOMUtil.getAttribute(getTopBlockNode(node), BlockElementModel.ID_ATTRIBUTE_TAG), getSocketType(socketNode));
			}
		}
	}
	
	public List<UniArg> createArgumentsModel(Node procedureNode){
		Node socketNode = DOMUtil.getChildNode(procedureNode, BlockSocketsModel.NODE_NAME);
		List<Node> connectors = DOMUtil.getChildNodes(socketNode);
		List<UniArg> args = new ArrayList<>();
		for(Node connector : connectors){
			if(connector.getNodeName().equals(BlockConnectorInfo.CONNECTOR_NODE)){
				Node connectorBlock = map.get(DOMUtil.getAttribute(connector, BlockConnectorInfo.CONNECTOR_BLOCK_ID_TAG));
				if(connectorBlock != null){
					String name = DOMUtil.getChildText(connectorBlock, BlockElementModel.NAME_NODE_NAME);
					String type = DOMUtil.getChildText(connectorBlock, BlockElementModel.TYPE_NODE_NAME);
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

	public UniMethodDec createPrototypeMethodDecModel(Node procNode) {
		UniMethodDec d = new UniMethodDec();
		d.methodName = DOMUtil.getChildText(procNode, "Label");
		d.modifiers = new ArrayList<>();
		d.modifiers.add("");
		d.returnType = "void";
		return d;
	}

	public void putAllBlockNodes(Node pageBlock) {
		// xmlのPageの子ノードから，メソッド定義のBlockノードのみを抽出する
		for (Node node : DOMUtil.eachChild(pageBlock)) {
			String name = node.getNodeName();
			if (name.startsWith("#")) {
				continue;
			} else if (name.equals(BlockElementModel.BLOCK_STUB_NODE_NAME)) {
				node = DOMUtil.getChildNode(node, BlockElementModel.BLOCK_NODE_NAME);
			}

			String nodeId = DOMUtil.getAttribute(node, BlockElementModel.ID_ATTRIBUTE_TAG);
			map.put(nodeId, node);
		}
	}

	public Node getTopBlockNode(Node node) {
		if (BlockProcedureModel.GENUS_NAME.equals(DOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTRIBUTE_TAG))) {
			return node;
		}
		Node tmpNode = node;

		while (tmpNode != null) {
			if (DOMUtil.getChildNode(tmpNode, BlockElementModel.BEFOREBLOCKID_NODE_NAME) == null) {
				return tmpNode;
			}
			String beforeBlockID = DOMUtil.getChildText(node, BlockElementModel.BEFOREBLOCKID_NODE_NAME);
			tmpNode = map.get(beforeBlockID);
		}

		return tmpNode;
	}

	public String getSocketType(Node node) {
		String type = "void";
		String id = DOMUtil.getAttribute(node, "con-block-id");

		if (id != null) {
			type = DOMUtil.getChildText(map.get(id), BlockElementModel.TYPE_NODE_NAME);
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

		String nextNodeId = DOMUtil.getChildText(bodyNode, BlockElementModel.AFTERBLOCKID_NODE_NAME);
		while (true) {
			if (nextNodeId == null)
				break;
			Node next = map.get(nextNodeId);
			// add body
			UniExpr expr = parseToExpr(next, map);
			body.add(expr);
			nextNodeId = DOMUtil.getChildText(next, BlockElementModel.AFTERBLOCKID_NODE_NAME);
		}

		UniBlock block = new UniBlock(body, null);

		return block;
	}

	private UniExpr parseToExpr(Node node, HashMap<String, Node> map) {
		if ("BlockStub".equals(node.getNodeName())) {
			node = DOMUtil.getChildNode(node, "Block");
		}

		String blockKind = DOMUtil.getAttribute(node, "kind");
		// ブロックモデルに応じてJUNICOENの式モデルを生成する
		switch (blockKind) {
		case "data":
			return parseLiteral(node);// リテラルを解析して式モデルを返す
		case "command":
			return parseCommand(node, map);// if，while，メソッドなどを解析して式モデルを返す
		case "function":
			return parseFunction(node, map);// 二項演算，または単項演算を解析して式モデルを返す
		case "local-variable":
			return parseLocalVariable(node, map);// ローカル変数を解析して，式モデルを返す
		case "abstraction":
			return parseAbstraction(node, map);
		default:
			throw new RuntimeException("Unsupported node: " + blockKind);
		}
	}

	private UniExpr parseAbstraction(Node node, HashMap<String, Node> map) {
		Node argsNode = DOMUtil.getChildNode(node, "Sockets");
		List<UniExpr> args = parseSocket(argsNode, map);

		UniBlock block = (UniBlock) args.get(0);
		block.blockLabel = DOMUtil.getChildText(node, "Label");

		return block;
	}

	private UniExpr parseLiteral(Node node) {
		String blockGenusName = DOMUtil.getAttribute(node, "genus-name");
		if ("number".equals(blockGenusName)) {
			// String num = getChildText(node, "Label");
			UniIntLiteral num = new UniIntLiteral(Integer.parseInt(DOMUtil.getChildText(node, "Label")));
			return num;
		} else if ("string".equals(blockGenusName)) {
			UniStringLiteral lit = new UniStringLiteral(DOMUtil.getChildText(node, "Label"));
			return lit;
		} else if ("double-number".equals(blockGenusName)) {
			UniDoubleLiteral value = new UniDoubleLiteral(Double.parseDouble(DOMUtil.getChildText(node, "Label")));
			return value;
		} else if ("true".endsWith(blockGenusName)) {
			UniBoolLiteral trueValue = new UniBoolLiteral();
			trueValue.value = true;
			return trueValue;
		} else if ("false".equals(blockGenusName)) {
			UniBoolLiteral falseValue = new UniBoolLiteral();
			falseValue.value = false;
			return falseValue;
		} else if (blockGenusName.startsWith("getter")) {
			UniIdent ident = new UniIdent(DOMUtil.getChildText(node, "Label"));
			return ident;
		} else if (blockGenusName.startsWith("preinc")) {
			UniUnaryOp op = new UniUnaryOp("++_", new UniIdent(DOMUtil.getChildText(node, "Label")));
			return op;
		} else if (blockGenusName.startsWith("predec")) {
			UniUnaryOp op = new UniUnaryOp("--_", new UniIdent(DOMUtil.getChildText(node, "Label")));
			return op;
		} else if (blockGenusName.startsWith("postinc")) {
			UniUnaryOp op = new UniUnaryOp("_++", new UniIdent(DOMUtil.getChildText(node, "Label")));
			return op;
		} else if (blockGenusName.startsWith("postdec")) {
			UniUnaryOp op = new UniUnaryOp("_--", new UniIdent(DOMUtil.getChildText(node, "Label")));
			return op;
		} else {
			throw new RuntimeException("not supported data type:" + blockGenusName);
		}
	}

	private UniExpr parseLocalVariable(Node node, HashMap<String, Node> map) {
		Node initValueNode = DOMUtil.getChildNode(node, "Sockets");
		List<UniExpr> initValues = parseSocket(initValueNode, map);
		String blockGenusName = DOMUtil.getAttribute(node, "genus-name");

		String type = DOMUtil.getChildText(resolver.getBlockNode(blockGenusName), "Type");
		String name = DOMUtil.getChildText(node, "Label");

		variableResolver.addLocalVariable(DOMUtil.getChildText(node, "Label"), node);

		if (!initValues.isEmpty() && initValues.get(0) != null && initValues.size() > 0) {
			// 初期値あり
			return new UniVariableDec(null, type, name, initValues.get(0));
		} else {
			return new UniVariableDec(null, type, name, null);
		}
	}

	private UniExpr parseFunction(Node node, HashMap<String, Node> map) {
		Node functionArgsNode = DOMUtil.getChildNode(node, "Sockets");
		List<UniExpr> functionArgs = parseSocket(functionArgsNode, map);
		String blockGenusName = DOMUtil.getAttribute(node, "genus-name");

		if (isUnaryOp(blockGenusName)) {
			UniUnaryOp unaryOp = new UniUnaryOp();
			unaryOp.operator = "!";
			unaryOp.expr = functionArgs.get(0);
			return unaryOp;
		} else if (isBinOp(blockGenusName)) {
			UniBinOp binOp = new UniBinOp();

			binOp.left = functionArgs.get(0);
			binOp.right = functionArgs.get(1);

			if (isEqualsOperator(blockGenusName)) {
				binOp.operator = "==";
			} else if (isNotEqualsOperator(blockGenusName)) {
				binOp.operator = "!=";
			} else if (isLessThanOperator(blockGenusName)) {
				binOp.operator = "<";
			} else if (isLessThanOrEqualOperator(blockGenusName)) {
				binOp.operator = "<=";
			} else if (isGreaterThanOperator(blockGenusName)) {
				binOp.operator = ">";
			} else if (isGreaterThanOrEqualOperator(blockGenusName)) {
				binOp.operator = ">=";
			} else if ("and".equals(blockGenusName)) {
				binOp.operator = "&&";
			} else if ("or".equals(blockGenusName)) {
				binOp.operator = "||";
			} else if (isAddOperator(blockGenusName)) {
				binOp.operator = "+";
			} else if (isDifferenceOperator(blockGenusName)) {
				binOp.operator = "-";
			} else if (isMulOperator(blockGenusName)) {
				binOp.operator = "*";
			} else if (isDivOperator(blockGenusName)) {
				binOp.operator = "/";
			} else if (isRemOperator(blockGenusName)) {
				binOp.operator = "%";
			} else {
				throw new RuntimeException("Unknown operator type: " + blockGenusName);
			}
			return binOp;
		} else if (isNewInstanceCreation(blockGenusName)) {
			UniNew uniNewModel = new UniNew(DOMUtil.getChildText(node, "Type"), new ArrayList<UniExpr>());
			List<UniExpr> sockets = parseSocket(getSocketsNode(node), map);
			uniNewModel.args = sockets;
			return uniNewModel;
		} else if (resolver.getForceConvertionMap().getUniMethodCallModel(blockGenusName) != null) {
			UniMethodCall model = (UniMethodCall)resolver.getForceConvertionMap().getUniMethodCallModel(blockGenusName);
			Node sockets = getSocketsNode(node);
			model.args = parseSocket(sockets, map);
			return model;
		} else if (isExCallerGetterModel(blockGenusName)) {
			Node sockets = getSocketsNode(node);
			List<UniExpr> args = parseSocket(sockets, map);
			UniMethodCall method = (UniMethodCall) args.get(1);
			method.receiver = args.get(0);
			return method;
		} else {
			// MethodCallとする
			// TODO should fix
			UniMethodCall call = new UniMethodCall(null, DOMUtil.getChildText(resolver.getBlockNode(blockGenusName), BlockElementModel.NAME_NODE_NAME), functionArgs);
			return call;
		}
	}

	public boolean isExCallerGetterModel(String genusName) {
		return genusName.equals(BlockExCallGetterModel.GENUS_NAME);
	}

	public boolean isNewInstanceCreation(String blockType) {
		return blockType.startsWith("new-");
	}

	private boolean isLessThanOperator(String blockType) {
		return "lessthan".equals(blockType) || "lessthan-double".equals(blockType);
	}

	private boolean isLessThanOrEqualOperator(String blockType) {
		return "lessthanorequalto".equals(blockType) || "lessthanorequalto-double".equals(blockType);
	}

	private boolean isGreaterThanOperator(String blockType) {
		return "greaterthan".equals(blockType) || "greaterthan-double".equals(blockType);
	}

	private boolean isGreaterThanOrEqualOperator(String blockType) {
		return "greaterthanorequalto".equals(blockType) || "greaterthanorequalto-double".equals(blockType);
	}

	private boolean isEqualsOperator(String blockType) {
		return "equals-number".equals(blockType) || "equals-string".equals(blockType) || "equals-number-double".equals(blockType) || "equals-boolean".equals(blockType);
	}

	private boolean isNotEqualsOperator(String blockType) {
		return "not-equals-number".equals(blockType) || "not-equals-string".equals(blockType) || "not-equals-number-double".equals(blockType) || "not-equals-boolean".equals(blockType);
	}

	private boolean isAddOperator(String blockType) {
		return "sum".equals(blockType) || "sum-double".equals(blockType) || "string-append".equals(blockType);
	}

	private boolean isDifferenceOperator(String blockType) {
		return "difference".equals(blockType) || "difference-double".endsWith(blockType);
	}

	private boolean isMulOperator(String blockType) {
		return "product".equals(blockType) || "product-double".endsWith(blockType);
	}

	private boolean isDivOperator(String blockType) {
		return "quotient".equals(blockType) || "quotient-double".endsWith(blockType);
	}

	private boolean isRemOperator(String blockType) {
		return "remainder".equals(blockType) || "remainder-double".endsWith(blockType);
	}

	public boolean isUnaryOp(String blockType) {
		if ("not".equals(blockType)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isBinOp(String blockType) {
		if (isEqualsOperator(blockType) || isNotEqualsOperator(blockType) || isLessThanOperator(blockType) || isLessThanOrEqualOperator(blockType) || isGreaterThanOperator(blockType) || isGreaterThanOrEqualOperator(blockType) || "and".equals(blockType) || "or".equals(blockType) || isAddOperator(blockType) || isDifferenceOperator(blockType) || isMulOperator(blockType) || isDivOperator(blockType) || isRemOperator(blockType)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Socketsノードを解析し，UniModelを作成する．
	 * @param argsNode Socketsノード
	 * @param map id,Blockノードのマップ
	 * @return ソケットのUniModel
	 */
	private List<UniExpr> parseSocket(Node argsNode, HashMap<String, Node> map) {
		List<UniExpr> args = new ArrayList<>();
		if (argsNode != null) {
			for (Node argNode : DOMUtil.eachChild(argsNode)) {
				assert argNode.getNodeName().equals(BlockConnectorInfo.CONNECTOR_NODE);
				String argElemId = DOMUtil.getAttribute(argNode, BlockConnectorInfo.CONNECTOR_BLOCK_ID_TAG);
				Node realArgNode = map.get(argElemId);
				if (realArgNode != null) {
					// beforeを持たないElementNodeは引数なので，引数の解析
					Node beforeBlock = map.get(DOMUtil.getChildText(realArgNode, BlockElementModel.BEFOREBLOCKID_NODE_NAME));
					if (DOMUtil.getChildText(realArgNode, BlockElementModel.BEFOREBLOCKID_NODE_NAME) == null || DOMUtil.getAttribute(beforeBlock, BlockElementModel.GENUS_NAME_ATTRIBUTE_TAG).equals(BlockExCallerModel.GENUS_NAME_ATTRIBUTE_TAG)) {
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

	private UniIf parseIfBlock(Node node, HashMap<String, Node> map) {
		Node argsNode = DOMUtil.getChildNode(node, "Sockets");
		List<UniExpr> args = new ArrayList<UniExpr>();
		int i = 0;
		// ifブロックのソケットのノードからUniExprを作成
		for (Node argNode : DOMUtil.eachChild(argsNode)) {
			String argElemId = DOMUtil.getAttribute(argNode, "con-block-id");
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
		Node argsNode = DOMUtil.getChildNode(node, "Sockets");
		List<UniExpr> args = parseSocket(argsNode, map);
		String blockGenusName = DOMUtil.getAttribute(node, "genus-name");// ブロックの種類名を取得

		if ("ifelse".equals(blockGenusName)) {
			return parseIfBlock(node, map);
		} else if ("while".equals(blockGenusName)) {
			UniWhile uniWhile = new UniWhile();
			uniWhile.cond = args.get(0);
			if (args.get(1) != null) {
				uniWhile.statement = args.get(1);
			}
			return uniWhile;
		} else if ("dowhile".equals(blockGenusName)) {
			UniDoWhile uniDoWhile = new UniDoWhile();
			uniDoWhile.statement = args.get(0);
			uniDoWhile.cond = args.get(1);
			return uniDoWhile;
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
			String variableName = DOMUtil.getChildText(node, "Label");
			if (variableResolver.getVariableBlockNode(variableName) != null || args.size() == 1) {
				// 代入式
				UniBinOp op = new UniBinOp("=", new UniIdent(variableName), args.get(0));
				return op;
			} else {
				throw new RuntimeException("illegal setter");
			}
		} else if (blockGenusName.startsWith("inc")) {// increment
			String variableName = DOMUtil.getChildText(node, "Label");
			if (variableResolver.getVariableBlockNode(variableName) != null || args.size() == 1) {
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
			String methodName = DOMUtil.getChildTextFromBlockNode(node, "Name");
			UniMethodCall call = new UniMethodCall(null, methodName, args);
			return call;
		} else if (resolver.getForceConvertionMap().getUniMethodCallModel(blockGenusName) != null) {
			UniMethodCall model = (UniMethodCall)resolver.getForceConvertionMap().getUniMethodCallModel(blockGenusName);
			Node sockets = getSocketsNode(node);
			model.args = parseSocket(sockets, map);
			return model;
		} else {
			String methodName = DOMUtil.getChildTextFromBlockNode(resolver.getBlockNode(blockGenusName), "Name");
			UniMethodCall mcall = getProtoType(methodName);
			if (mcall != null) {
				mcall.args = args;
				return mcall;
			} else {
				throw new RuntimeException("Unknown method type: " + blockGenusName);
			}
		}
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
