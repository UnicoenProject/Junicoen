package net.unicoen.parser.blockeditor;

import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

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
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniLongLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNode;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;
import net.unicoen.parser.blockeditor.blockmodel.BlockAbstractBlockModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockClassModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockCommandModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockDoWhileModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockElementModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockExCallerModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockExprModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockIfModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockLocalVarDecModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockNotOperatorModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockPrePostModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockProcParmModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockProcedureModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockReturnModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockVariableGetterModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockVariableSetterModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockWhileModel;
import net.unicoen.parser.blockeditor.blockmodel.SocketInfo;
import net.unicoen.parser.blockeditor.blockmodel.SocketsInfo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockGenerator {

	/** Name space definition */
	private static String XML_CODEBLOCKS_NS = "http://education.mit.edu/openblocks/ns";

	/** Location of schema */
	private static String XML_CODEBLOCKS_SCHEMA_URI = "http://education.mit.edu/openblocks/codeblocks.xsd";

	private long ID_COUNTER = 1000;

	private BlockNameResolver resolver;
	private VariableNameResolver vnResolver = new VariableNameResolver();

	private Map<String, Element> addedModels = new HashMap<String, Element>();

	private PrintStream out;

	public BlockGenerator(PrintStream out) {
		this.out = out;
		resolver = new BlockNameResolver(true);
	}

	public BlockGenerator(PrintStream out, String langDefFilePath) {
		this.out = out;
		resolver = new BlockNameResolver(langDefFilePath);
	}

	/*
	 * Unicoenモデルを解析し、xmlファイルを作成し返す
	 */
	public void parse(UniClassDec classDec) throws IOException {
		// クラス名のxmlファイルを作成する
		addedModels.clear(); // cashクリア

		out.print(getSaveString(classDec));

		out.close();
	}

	public Map<String, Element> getAddedModels() {
		return addedModels;
	}

	/*
	 * クラスの解析
	 */
	public BlockClassModel parseClass(UniClassDec classDec, Document document) {
		BlockClassModel model = new BlockClassModel();

		for (UniMemberDec member : classDec.members) {
			// フィールドメソッドの解析
			model.addMethod(parseFunctionDec((UniMethodDec) member, document));
		}

		return model;
	}

	public List<BlockCommandModel> parseBody(Document document, Element parentElement, UniExpr statement) {
		if (statement == null || !(statement instanceof UniBlock)) {
			return new ArrayList<>(); // can be Collections.emptyList();
		}

		UniBlock statementBlock = (UniBlock) statement;

		// bodyを辿ってモデル作成
		List<BlockCommandModel> blocks = new ArrayList<>();
		String beforeId = parentElement.getAttribute("id");
		for (int i = 0; i < statementBlock.body.size(); i++) {
			UniExpr expr = statementBlock.body.get(i);
			BlockElementModel command = parseExpr(expr, document, null);

			System.out.println("parse" +  expr);

			// statement以外は弾く
			if (!(command instanceof BlockCommandModel)) {
				throw new RuntimeException("cant use the expression" + expr.toString());
			}
			addBeforeBlockNode(document, command.getElement(), beforeId);

			if (i + 1 < statementBlock.body.size()) {
				addAfterBlockNode(document, command.getElement(), String.valueOf(ID_COUNTER));
				beforeId = command.getElement().getAttribute("id");
			}
			blocks.add((BlockCommandModel) command);
		}
		return blocks;
	}

	/*
	 * 関数の解析
	 */
	public BlockProcedureModel parseFunctionDec(UniMethodDec funcDec, Document document) {
		BlockProcedureModel model = new BlockProcedureModel();

		Element procedureElement = createBlockElement(document, "procedure", ID_COUNTER++, "procedure");

		addElement("Label", document, funcDec.methodName, procedureElement);
		addElement("ReturnType", document, funcDec.returnType, procedureElement);
		addLocationElement(document, "50", "50", procedureElement);

		model.setProcedureElement(procedureElement);

		// //引数を解析して引数モデルを生成
		model.setParams(parseFunctionArgs(document, funcDec.args, procedureElement));

		addParameterSocketInfo(document, procedureElement, model.getParams());

		List<BlockCommandModel> bodyBlocks = new ArrayList<>();
		model.setBodyBlocks(bodyBlocks);
		// funcDec.body ボディのパース
		if (hasBody(funcDec)) {
			addAfterBlockNode(document, procedureElement, String.valueOf(ID_COUNTER));
			String beforeId = procedureElement.getAttribute("id");
			List<UniExpr> body = funcDec.block.body;
			for (int i = 0; i < body.size(); i++) {
				// expressionの解析 行き掛け順
				BlockElementModel commandBlock = parseExpr(body.get(i), document, null);// 木で返す．

				if (!(commandBlock instanceof BlockCommandModel)) {
					throw new RuntimeException("cant convert " + body.get(i));
				}

				if (i + 1 < body.size()) {
					addAfterBlockNode(document, commandBlock.getElement(), String.valueOf(ID_COUNTER));
				}

				// 左辺ブロックに直前のブロックのIDを追加する
				addBeforeBlockNode(document, commandBlock.getElement(), beforeId);

				bodyBlocks.add((BlockCommandModel) commandBlock);

				beforeId = getBlockAttibuteByElement(commandBlock.getElement(), "id");
			}
		}

		vnResolver.resetLocalVariables();

		return model;
	}

	public void addParameterSocketInfo(Document document, Element element, List<BlockProcParmModel> args) {
		List<Element> paramElements = new ArrayList<>();
		SocketsInfo socketsInfo = new SocketsInfo();

		for (BlockProcParmModel param : args) {
			paramElements.add(param.getElement());
		}

		for (int i = 0; i < paramElements.size(); i++) {
			String label = BlockMapper.getChildNode(paramElements.get(i), "Label").getTextContent();
			String connecctorType = convertTypeToBlockConnectorType(BlockMapper.getChildNode(paramElements.get(i), "Type").getTextContent());

			socketsInfo.addSocketInfo(new SocketInfo(label, "single", connecctorType, connecctorType));
		}

		socketsInfo.addSocketInfo(new SocketInfo("", "single", "poly", "poly"));

		paramElements.add(null);

		addSocketsNode(paramElements, document, element, socketsInfo);
	}

	public List<BlockProcParmModel> parseFunctionArgs(Document document, List<UniArg> args, Element parent) {
		List<BlockProcParmModel> argModels = new ArrayList<>();
		if (args != null) {
			for (UniArg arg : args) {
				argModels.add(parseFunctionArg(document, arg, parent));
			}
		}
		return argModels;
	}

	public BlockProcParmModel parseFunctionArg(Document document, UniArg arg, Element parent) {
		String genusName = this.resolver.getFunctionArgBlockName(arg.type);
		if (genusName == null) {
			throw new RuntimeException("the parameter type can't use at BlockEditor");
		}
		Element element = createBlockElement(document, genusName, ID_COUNTER++, "param");
		// label
		addElement("Label", document, arg.name, element);
		// name
		addElement("Name", document, arg.name, element);
		// type
		addElement("Type", document, arg.type, element);
		// plug
		addPlugElement(document, element, parent, convertTypeToBlockConnectorType(arg.type), "single");

		vnResolver.addLocalVariable(arg.name, element);

		return new BlockProcParmModel(element);
	}

	public boolean hasBody(UniMethodDec funcDec) {
		if (funcDec.block != null && funcDec.block.body != null && funcDec.block.body.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * ノードから属性値を取得する
	 */
	public String getBlockAttibuteByElement(Element element, String attributeName) {
		if (element.getNodeName().equals("BlockStub")) {
			Node blockNode = BlockMapper.getChildNode(element, "Block");
			return BlockMapper.getAttribute(blockNode, attributeName);
		} else {
			return element.getAttribute(attributeName);
		}
	}

	/*
	 * AfterBlockノードを追加する
	 */
	public static void addAfterBlockNode(Document document, Element blockNode, String id) {
		Element element = document.createElement("AfterBlockId");
		element.setTextContent(id);

		if (blockNode.getNodeName().equals("BlockStub")) {
			BlockMapper.getChildNode(blockNode, "Block").appendChild(element);
		} else {
			blockNode.appendChild(element);
		}
	}

	public static void addBeforeBlockNode(Document document, Element blockNode, String id) {
		Element element = document.createElement("BeforeBlockId");
		element.setTextContent(id);

		if (blockNode.getNodeName().equals("BlockStub")) {
			BlockMapper.getChildNode(blockNode, "Block").appendChild(element);
		} else {
			blockNode.appendChild(element);
		}
	}

	public BlockElementModel parseExpr(UniExpr expr, Document document, Element parent) {
		BlockElementModel model = null;
		if (expr instanceof UniMethodCall) {
			model = parseMethodCall((UniMethodCall) expr, document, parent);
		} else if (expr instanceof UniStringLiteral) {
			model = parseStringLiteral((UniStringLiteral) expr, document, parent);
		} else if (expr instanceof UniIntLiteral) {
			model = parseIntLiteral((UniIntLiteral) expr, document, parent);
		} else if (expr instanceof UniBoolLiteral) {
			model = parseBoolLiteral((UniBoolLiteral) expr, document, parent);
		} else if (expr instanceof UniDoubleLiteral) {
			model = parseDoubleLiteral((UniDoubleLiteral) expr, document, parent);
		} else if (expr instanceof UniIf) {
			model = parseIf((UniIf) expr, document, parent);
		} else if (expr instanceof UniWhile) {
			model = parseWhile((UniWhile) expr, document, parent);
		} else if (expr instanceof UniBinOp) {
			model = parseBinOp((UniBinOp) expr, document, parent);
		} else if (expr instanceof UniBreak) {
			model = parseContinueBreak("break", document, parent);
		} else if (expr instanceof UniContinue) {
			model = parseContinueBreak("continue", document, parent);
		} else if (expr instanceof UniUnaryOp) {
			model = parseUnaryOperator((UniUnaryOp) expr, document, parent);
		}
		// else if (expr instanceof UniVariableDec) {
		// return parseVarDec(((UniVariableDec) expr).type, ((UniVariableDec)
		// expr).name, document, parent);
		// }
		else if (expr instanceof UniVariableDec) {
			model = parseVarDec((UniVariableDec) expr, document, parent);
		} else if (expr instanceof UniIdent) {
			model = parseIdent((UniIdent) expr, document, parent);
		} else if (expr instanceof UniLongLiteral) {
			throw new RuntimeException("The expr has not been supported yet");
		} else if (expr instanceof UniReturn) {
			model = parseReturn((UniReturn) expr, document, parent);
		} else if (expr instanceof UniFieldAccess) {
			throw new RuntimeException("The expr has not been supported yet");
		} else if (expr instanceof UniBlock) {
			model = parseBlock((UniBlock) expr, document, parent);
		} else if (expr instanceof UniDoWhile) {
			model = parseDoWhile((UniDoWhile) expr, document, parent);
		} else if (expr instanceof UniFor) {
			model = parseFor((UniFor) expr, document, parent);
		}

		addParsedModel((UniNode) expr, model.getElement());

		return model;
	}

	public BlockElementModel parseIdent(UniIdent expr, Document document, Node parent) {
		Node varDecNode = vnResolver.getVariableNode(expr.name);
		if (varDecNode != null) {
			String genusName = "getter";
			genusName += BlockMapper.getAttribute(varDecNode, "genus-name");
			// BlockStubノード作成
			Element stubElement = createBlockStubNode(document, expr.name, BlockMapper.getAttribute(varDecNode, "genus-name"));
			// Blockノード作成
			Element blockElement = createVariableBlockNode(document, genusName, expr.name, "data");

			List<Node> socketNodes = resolver.getSocketNodes(genusName.substring("setter".length(), genusName.length()));
			addPlugElement(document, blockElement, parent, BlockMapper.getAttribute(socketNodes.get(0), "connector-type"), "mirror");

			stubElement.appendChild(blockElement);
			return new BlockVariableGetterModel(stubElement);
		} else {
			throw new RuntimeException("illegal variable:" + expr.name);
		}
	}

	public BlockElementModel parseFor(UniFor forExpr, Document document, Node parent) {
		// whileをもつ抽象化ブロックを作成して返す
		UniBlock forBlock = new UniBlock(new ArrayList<>());
		if (forExpr.init != null) {
			forBlock.body.add(forExpr.init);
		}

		if (forExpr.step != null) {
			UniBlock block = (UniBlock) forExpr.statement;
			block.body.add(forExpr.step);
		}

		UniWhile whileModel = new UniWhile(forExpr.cond, forExpr.statement);

		forBlock.body.add(whileModel);

		return parseExpr(forBlock, document, null);
	}

	public BlockElementModel parseDoWhile(UniDoWhile doWhileExpr, Document document, Node parent) {
		Element blockElement = createBlockElement(document, "dowhile", ID_COUNTER++, "command");
		BlockElementModel socket = parseExpr(doWhileExpr.cond, document, blockElement);
		List<BlockCommandModel> trueBlocks = parseBody(document, blockElement, doWhileExpr.statement);

		BlockDoWhileModel model = new BlockDoWhileModel(blockElement, (BlockExprModel) socket, trueBlocks);

		List<Element> blockSockets = new ArrayList<>();
		if (trueBlocks.size() > 0) {
			blockSockets.add(trueBlocks.get(0).getElement());
		} else {
			blockSockets.add(null);
		}

		blockSockets.add(socket.getElement());

		// genusnameからソケットのラベルとポジションタイプを作成
		List<Node> whileSocketNodes = resolver.getSocketNodes("dowhile");
		SocketsInfo socketsInfo = calcSocketsInfo(whileSocketNodes);

		// ソケットの出力
		addSocketsNode(blockSockets, document, blockElement, socketsInfo);

		return model;
	}

	public BlockAbstractBlockModel parseBlock(UniBlock blockExpr, Document document, Node parent) {
		Element blockElement = createBlockElement(document, "abstraction", ID_COUNTER++, "command");
		BlockAbstractBlockModel model = new BlockAbstractBlockModel(blockElement);
		List<BlockCommandModel> commands = parseBody(document, blockElement, blockExpr);
		SocketsInfo socketsInfo = calcSocketsInfo(resolver.getSocketNodes("abstraction"));

		List<Element> bodyTopElement = new ArrayList<>();
		bodyTopElement.add(commands.get(0).getElement());
		addSocketsNode(bodyTopElement, document, blockElement, socketsInfo);

		model.setSockets(commands);

		return model;
	}

	public BlockElementModel parseReturn(UniReturn returnExpr, Document document, Node parent) {
		Element blockElement = createBlockElement(document, "return", ID_COUNTER++, "command");

		BlockElementModel returnValue = parseExpr(returnExpr.value, document, blockElement);
		if (returnExpr.value != null) {
			List<Element> arg = new ArrayList<>();
			arg.add(returnValue.getElement());

			SocketsInfo sockets = new SocketsInfo();
			Node returnBlock = resolver.getBlockNode(BlockMapper.getAttribute(returnValue.getElement(), "genus-name"));
			sockets.addSocketInfo(new SocketInfo("", "single", convertTypeToBlockConnectorType(BlockMapper.getChildNode(returnBlock, "Type").getTextContent()), "poly"));

			// socketの追加
			addSocketsNode(arg, document, blockElement, sockets);

			return new BlockReturnModel(blockElement, (BlockExprModel) returnValue);
		} else {
			List<Element> arg = new ArrayList<>();
			SocketsInfo sockets = calcSocketsInfo(resolver.getSocketNodes("return"));
			arg.add(null);
			addSocketsNode(arg, document, blockElement, sockets);

			return new BlockReturnModel(blockElement, null);
		}

	}

	public BlockLocalVarDecModel parseVarDec(UniVariableDec varDec, Document document, Element parent) {
		BlockLocalVarDecModel model = parseVarDec(varDec.type, varDec.name, document, parent);
		BlockElementModel initializer = null;
		if (varDec.value != null) {
			initializer = parseExpr(varDec.value, document, model.getElement());
		}

		model.setInitializer((BlockExprModel) initializer);

		List<Node> socketNodes = resolver.getSocketNodes(model.getElement().getAttribute("genus-name"));

		SocketsInfo sockets = calcSocketsInfo(socketNodes);

		List<Element> args = new ArrayList<>();
		if (initializer != null) {
			args.add(initializer.getElement());
		} else {
			args.add(null);
		}

		addSocketsNode(args, document, model.getElement(), sockets);

		addParsedModel((UniNode) varDec, model.getElement());
		return model;
	}

	public SocketsInfo calcSocketsInfo(List<Node> socketNodes) {
		if (socketNodes == null || socketNodes.size() <= 0) {
			return null;
		} else {
			SocketsInfo sockets = new SocketsInfo();

			for (int i = 0; i < socketNodes.size(); i++) {
				String label = BlockMapper.getAttribute(socketNodes.get(i), "label");
				String positionType = BlockMapper.getAttribute(socketNodes.get(i), "position-type");
				String connectorType = BlockMapper.getAttribute(socketNodes.get(i), "connector-type");

				sockets.addSocketInfo(new SocketInfo(label, positionType, connectorType, connectorType));
			}
			return sockets;
		}
	}

	public Map<String, String[]> calcSocketsInfoByElement(List<Element> socketNodes) {
		if (socketNodes.size() <= 0) {
			return null;
		} else {
			Map<String, String[]> socketsInfo = new HashMap<>();
			String[] socketLabels = new String[socketNodes.size()];
			String[] socketTypes = new String[socketNodes.size()];
			String[] socketPositionTypes = new String[socketNodes.size()];

			for (int i = 0; i < socketNodes.size(); i++) {
				socketLabels[i] = BlockMapper.getAttribute(socketNodes.get(i), "label");
				socketTypes[i] = BlockMapper.getAttribute(socketNodes.get(i), "connector-type");
				socketPositionTypes[i] = BlockMapper.getAttribute(socketNodes.get(i), "position-type");
			}

			socketsInfo.put("label", socketLabels);
			socketsInfo.put("connector-type", socketTypes);
			socketsInfo.put("position-type", socketPositionTypes);

			return socketsInfo;
		}
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

	public BlockLocalVarDecModel parseVarDec(String type, String name, Document document, Element parent) {
		if (vnResolver.getVariableNode(name) == null) {
			Element blockElement = createBlockElement(document, "local-var-" + convertBlockTypeName(type), ID_COUNTER++, "local-variable");

			addElement("Label", document, name, blockElement);
			addElement("Name", document, name, blockElement);
			addElement("Type", document, type, blockElement);

			BlockLocalVarDecModel model = new BlockLocalVarDecModel(blockElement);
			vnResolver.addLocalVariable(name, blockElement);

			return model;
		} else {
			throw new RuntimeException(name + " is already defined");
		}
	}

	public String convertBlockTypeName(String type) {
		switch (type) {
		case "int":
			return "int-number";
		case "double":
			return "double-number";
		case "String":
			return type.toLowerCase();
		case "boolean":
			return type;
		default:
			return "object-" + type;
		}
	}

	public String convertTypeToBlockConnectorType(String type) {
		switch (type) {
		case "int":
			return "number";
		case "double":
			return "double-number";
		case "String":
			return type.toLowerCase();
		case "boolean":
			return type;
		default:
			return "object";
		}
	}

	public BlockElementModel parseUnaryOperator(UniUnaryOp uniOp, Document document, Node parent) {
		// !,++,--,+,-
		List<Element> elements = new ArrayList<Element>();
		if ("!".equals(uniOp.operator)) {
			Element blockElement = createBlockElement(document, "not", ID_COUNTER++, "function");
			addPlugElement(document, blockElement, parent, "boolean", "single");

			BlockElementModel value = parseExpr(uniOp.expr, document, blockElement);
			List<Element> args = new ArrayList<>();
			args.add(value.getElement());

			List<Node> socketNodes = resolver.getSocketNodes("not");
			SocketsInfo sockets = calcSocketsInfo(socketNodes);
			addSocketsNode(args, document, blockElement, sockets);

			return new BlockNotOperatorModel(blockElement, (BlockExprModel) value);
		} else if ("_++".equals(uniOp.operator) || "_--".equals(uniOp.operator) || "++_".equals(uniOp.operator) || "--_".equals(uniOp.operator)) {
			String genusName = "setter";
			UniIdent ident = (UniIdent) uniOp.expr;
			String operator = "+";
			if (uniOp.operator.contains("--")) {
				operator = "-";
			}

			Node varDecNode = vnResolver.getLocalVariableID(ident.name);
			if (varDecNode == null) {
				throw new RuntimeException(ident.name + " is not defined");
			}

			if (parent == null) {
				// i++;とか　i = i+1に変換
				genusName += BlockMapper.getAttribute(varDecNode, "genus-name");
				// BlockStubノード作成
				Element blockStubElement = createBlockStubNode(document, ident.name, BlockMapper.getAttribute(varDecNode, "genus-name"));
				// Blockノード作成
				Element blockElement = createVariableBlockNode(document, genusName, ident.name, "command");

				List<Node> socketNodes = resolver.getSocketNodes(genusName.substring("setter".length(), genusName.length()));
				SocketsInfo sockets = calcSocketsInfo(socketNodes);

				BlockElementModel right = parseExpr((UniExpr) (new UniBinOp(operator, new UniIdent(ident.name), new UniIntLiteral(1))), document, blockElement);

				List<Element> rightElement = new ArrayList<>();
				rightElement.add(right.getElement());

				addSocketsNode(rightElement, document, blockElement, sockets);

				// BlockStubノードにBlockノードを追加する
				blockStubElement.appendChild(blockElement);

				return new BlockVariableSetterModel(blockStubElement, (BlockExprModel) right);
			} else {
				// i = i++;
				if (uniOp.operator.equals("_++")) {
					genusName = "postinc";
				} else if (uniOp.operator.equals("_--")) {
					genusName = "postdec";
				} else if (uniOp.operator.equals("++_")) {
					genusName = "preinc";
				} else {
					genusName = "predec";
				}

				Element blockStubElement = createBlockStubNode(document, ident.name, BlockMapper.getAttribute(varDecNode, "genus-name"));
				// Blockノード作成
				Element blockElement = createVariableBlockNode(document, genusName + BlockMapper.getAttribute(varDecNode, "genus-name"), ident.name, "command");
				// BlockStubノードにBlockノードを追加する
				blockStubElement.appendChild(blockElement);
				elements.add(blockStubElement);

				return new BlockPrePostModel(blockStubElement);
			}
		} else {
			throw new RuntimeException("not supported unary operator");
		}
	}

	public Element createVariableBlockNode(Document document, String genusName, String name, String kind) {
		Element blockElement = createBlockElement(document, genusName, ID_COUNTER++, kind);
		addElement("Label", document, name, blockElement);
		addElement("Name", document, name, blockElement);
		return blockElement;
	}

	public Element createBlockStubNode(Document document, String parentName, String parentGenusName) {
		Element blockStubElement = document.createElement("BlockStub");
		addElement("StubParentName", document, parentName, blockStubElement);
		addElement("StubParentGenus", document, parentGenusName, blockStubElement);
		return blockStubElement;
	}

	public BlockCommandModel parseContinueBreak(String name, Document document, Node parent) {
		BlockCommandModel model = new BlockCommandModel(createBlockElement(document, name, ID_COUNTER++, "command"));
		return model;
	}

	public BlockElementModel parseBinOp(UniBinOp binopExpr, Document document, Node parent) {
		Element blockElement;
		String type = getExprType(binopExpr.left, binopExpr.right);// //
																	// 左右を先読みして，何型の演算か取得

		if (binopExpr.operator.equals("=")) {// 他の二項演算と扱いが別（ソケットが一つのみ）
			return createEqualOperatorModel(binopExpr, document);
		} else if (binopExpr.operator.equals("&&")) {
			blockElement = createBlockElement(document, "and", ID_COUNTER++, "function");
		} else if (binopExpr.operator.equals("||")) {
			blockElement = createBlockElement(document, "or", ID_COUNTER++, "function");
		} else if (binopExpr.operator.equals("==") || binopExpr.operator.equals("!=")) {
			blockElement = createBlockElement(document, calcEqualsOperatorGenusName(binopExpr, type), ID_COUNTER++, "function");
		} else if (binopExpr.operator.equals(">=") || binopExpr.operator.equals(">") || binopExpr.operator.equals("<=") || binopExpr.operator.equals("<")) {
			blockElement = createBlockElement(document, calcCompareOperatorGenusName(binopExpr, type), ID_COUNTER++, "function");
		} else if (binopExpr.operator.equals("+") || binopExpr.operator.equals("-") || binopExpr.operator.equals("*") || binopExpr.operator.equals("/") || binopExpr.operator.equals("%")) {
			// 左右の型に応じてブロックの名前を変える(number or double-number)
			blockElement = createBlockElement(document, calcCalcuratorOperationGenusName(binopExpr, type), ID_COUNTER++, "function");
		} else {
			throw new RuntimeException("unequipment operator");
		}

		Node plugNode = resolver.getPlugElement(blockElement.getAttribute("genus-name"));
		addPlugElement(document, blockElement, parent, BlockMapper.getAttribute(plugNode, "connector-type"), BlockMapper.getAttribute(plugNode, "position-type"));

		BlockElementModel leftBlock = parseExpr(binopExpr.left, document, blockElement);
		BlockElementModel rightBlock = parseExpr(binopExpr.right, document, blockElement);

		List<Element> args = new ArrayList<Element>();
		args.add(leftBlock.getElement());
		args.add(rightBlock.getElement());

		List<Node> socketNodes = resolver.getSocketNodes(blockElement.getAttribute("genus-name"));
		SocketsInfo sockets = calcSocketsInfo(socketNodes);
		addSocketsNode(args, document, blockElement, sockets);

		return new BlockBinaryOperatorModel(blockElement, (BlockExprModel) leftBlock, (BlockExprModel) rightBlock);
	}

	public void addParsedModel(UniNode model, Element element) {
		addedModels.put(Integer.toString(model.hashCode()), element);
	}

	public String calcCompareOperatorGenusName(UniBinOp binopExpr, String type) {
		String genusName;
		if (binopExpr.operator.equals(">=") || binopExpr.operator.equals(">")) {
			genusName = "greaterthan";
			if (binopExpr.operator.equals(">=")) {
				genusName = "greaterthanorequalto";
			}

			if ("int".equals(type)) {
			} else if ("double".equals(type)) {
				genusName += "-double";
			} else {
				throw new RuntimeException(type + "is not supported type yet at " + binopExpr.operator);
			}
			return genusName;
		} else {
			genusName = "lessthan";
			if (binopExpr.operator.equals("<=")) {
				genusName = "lessthanorequalto";
			}

			if ("int".equals(type)) {
			} else if ("double".equals(type)) {
				genusName += "-double";
			} else {
				throw new RuntimeException(type + "is not supported type yet at " + binopExpr.operator);
			}
			return genusName;
		}
	}

	public String calcEqualsOperatorGenusName(UniBinOp binopExpr, String type) {
		String genusName = "equals-";
		if (binopExpr.operator.equals("!=")) {
			genusName = "not-" + genusName;
		}
		// 左右の型に応じてブロックの名前を変える(String, boolean, number, double number)
		if ("int".equals(type)) {
			genusName += "number";
		} else if ("double".equals(type)) {
			genusName += "number-double";
		} else if ("String".equals(type)) {
			genusName += "string";
		} else if ("boolean".equals(type)) {
			genusName += "boolean";
		} else {
			throw new RuntimeException(type + "is not supported type yet at " + binopExpr.operator);
		}
		return genusName;
	}

	public String calcCalcuratorOperationGenusName(UniBinOp binopExpr, String type) {
		String genusName = "sum";
		if (binopExpr.operator.equals("-")) {
			genusName = "difference";
		} else if (binopExpr.operator.equals("*")) {
			genusName = "product";
		} else if (binopExpr.operator.equals("/")) {
			genusName = "quotient";
		} else if (binopExpr.operator.equals("%")) {
			genusName = "remainder";
		}

		if (genusName.equals("sum")) {
			if ("int".equals(type)) {
			} else if ("double".equals(type)) {
				genusName += "-double";
			} else if ("String".equals(type)) {
				genusName = "string-append";
			} else {
				throw new RuntimeException(type + " is not supported type yet at " + binopExpr.operator);
			}
		} else {
			if ("int".equals(type)) {
			} else if ("double".equals(type)) {
				genusName += "-double";
			} else {
				throw new RuntimeException(type + "is not supported type yet at " + binopExpr.operator);
			}
		}

		return genusName;
	}

	public BlockElementModel createEqualOperatorModel(UniBinOp binopExpr, Document document) {
		if (binopExpr.left instanceof UniIdent) {
			String genusName = "setter";
			UniIdent ident = (UniIdent) binopExpr.left;
			Node varDecNode = vnResolver.getLocalVariableID(ident.name);

			genusName += BlockMapper.getAttribute(varDecNode, "genus-name");
			// BlockStubノード作成
			Element blockStubElement = createBlockStubNode(document, ident.name, BlockMapper.getAttribute(varDecNode, "genus-name"));

			// Blockノード作成
			Element blockElement = createVariableBlockNode(document, genusName, ident.name, "command");

			// 右辺のモデルの生成
			BlockElementModel right = parseExpr(binopExpr.right, document, blockElement);
			List<Node> socketNodes = resolver.getSocketNodes(genusName.substring("setter".length(), genusName.length()));

			// ソケット情報を付与して返す
			if (socketNodes != null) {
				SocketsInfo sockets = calcSocketsInfo(socketNodes);
				List<Element> rightElement = new ArrayList<>();
				rightElement.add(right.getElement());

				addSocketsNode(rightElement, document, blockElement, sockets);

				// BlockStubノードにBlockノードを追加する
				blockStubElement.appendChild(blockElement);

				return new BlockVariableSetterModel(blockStubElement, (BlockExprModel) right);
			} else {
				throw new RuntimeException("illegal right element:" + binopExpr.right);
			}
		} else {
			throw new RuntimeException("illegal left op:" + binopExpr.left);
		}
	}

	public String getBlockTypeName(String type) {
		if ("int".equals(type)) {
			return "int-number";
		} else if ("String".equals(type)) {
			return "string";
		} else if ("double".equals(type)) {
			return "double-number";
		} else if ("boolean".equals(type)) {
			return "boolean";
		} else {
			return type;
		}
	}

	public String getExprType(UniExpr left, UniExpr right) {
		// exprの型を取得する
		String leftType = getExprType(left);
		String rightType = getExprType(right);
		if (leftType.equals(rightType)) {
			return leftType;
		} else if ((leftType.equals("int") && rightType.equals("double")) || (leftType.equals("double") && rightType.equals("int"))) {
			return "int";
		} else {
			return null;
		}
	}

	public String getExprType(UniExpr expr) {
		String type = null;
		if (expr instanceof UniIntLiteral) {
			type = "int";
		} else if (expr instanceof UniStringLiteral) {
			type = "String";
		} else if (expr instanceof UniBoolLiteral) {
			type = "boolean";
		} else if (expr instanceof UniDoubleLiteral) {
			type = "double";
		} else if (expr instanceof UniMethodCall) {
			throw new RuntimeException("not supported yet");
		} else if (expr instanceof UniIdent) {
			type = BlockMapper.getChildNode(vnResolver.getVariableNode(((UniIdent) expr).name), "Type").getTextContent();
		} else if (expr instanceof UniBinOp) {
			type = getExprType(((UniBinOp) expr).left, ((UniBinOp) expr).right);
		} else if (expr instanceof UniUnaryOp) {
			type = getExprType(((UniUnaryOp) expr).expr);
		}
		return type;
	}

	public static String[] createStringArray(String... labels) {
		String[] socketLabels = new String[labels.length];
		for (int i = 0; i < labels.length; i++) {
			socketLabels[i] = labels[i];
		}

		return socketLabels;
	}

	public BlockWhileModel parseWhile(UniWhile whileExpr, Document document, Node parent) {
		BlockWhileModel model = new BlockWhileModel();
		Element blockElement = createBlockElement(document, "while", ID_COUNTER++, "command");
		model.setElement(blockElement);

		BlockElementModel socket = parseExpr(whileExpr.cond, document, blockElement);
		model.addSocketBlock((BlockExprModel) socket);

		List<BlockCommandModel> trueBlock = parseBody(document, blockElement, whileExpr.statement);
		model.setTrueBlocks(trueBlock);

		List<Element> blockSockets = new ArrayList<>();
		blockSockets.add(socket.getElement());

		if (trueBlock.size() > 0) {
			blockSockets.add(trueBlock.get(0).getElement());
		} else {
			blockSockets.add(null);
		}
		// genusnameからソケットのラベルとポジションタイプを作成
		List<Node> whileSocketNodes = resolver.getSocketNodes("while");
		SocketsInfo socketsInfo = calcSocketsInfo(whileSocketNodes);

		// ソケットの出力
		addSocketsNode(blockSockets, document, blockElement, socketsInfo);

		return model;
	}

	public BlockLiteralModel parseBoolLiteral(UniBoolLiteral boolexpr, Document document, Node parent) {
		if (boolexpr.value) {
			return new BlockLiteralModel(createLiteralElement(document, parent, "true", BlockMapper.getAttribute(resolver.getBlockNode("true"), "initlabel"), boolexpr.hashCode()));
		} else {
			return new BlockLiteralModel(createLiteralElement(document, parent, "true", BlockMapper.getAttribute(resolver.getBlockNode("true"), "initlabel"), boolexpr.hashCode()));
		}
	}

	public Element createLiteralElement(Document document, Node parent, String genusName, String label, int hash) {
		Element blockElement = createBlockElement(document, genusName, ID_COUNTER++, BlockMapper.getAttribute(resolver.getBlockNode(genusName), "kind"));

		addElement("Label", document, label, blockElement);
		addElement("Type", document, BlockMapper.getChildNode(resolver.getBlockNode(genusName), "Type").getTextContent(), blockElement);

		Node plugNode = resolver.getPlugElement(genusName);
		Map<String, String> plugInfo = calcPlugInfo(plugNode);

		addPlugElement(document, blockElement, parent, plugInfo.get("connector-type"), plugInfo.get("position-type"));

		return blockElement;
	}

	public BlockIfModel parseIf(UniIf ifexpr, Document document, Node parent) {
		// //BlockModelのifモデルを作成する．（Xml Element）
		BlockIfModel ifBlockModel = new BlockIfModel();
		Element ifElement = createBlockElement(document, "ifelse", ID_COUNTER++, "command");
		ifBlockModel.setElement(ifElement);

		// Universal Modelの条件式，真ブロック式，偽ブロック式をそれぞれ解析し，BlockModel（xml
		// Element）を作成する
		BlockElementModel socket = parseExpr(ifexpr.cond, document, ifElement);
		List<BlockCommandModel> trueBlock = parseBody(document, ifElement, ifexpr.trueStatement);
		List<BlockCommandModel> falseBlock = parseBody(document, ifElement, ifexpr.falseStatement);

		// if式のソケット情報を付与
		addIfSocketInfo(document, ifElement, socket, trueBlock, falseBlock);

		ifBlockModel.addSocketBlock((BlockExprModel) socket);

		ifBlockModel.setTrueBlocks(trueBlock);
		ifBlockModel.setFalseBlocks(falseBlock);

		return ifBlockModel;
	}

	public void addIfSocketInfo(Document document, Element ifElement, BlockElementModel socket, List<BlockCommandModel> trueBlock, List<BlockCommandModel> falseBlock) {

		List<Element> blockSockets = new ArrayList<>();

		blockSockets.add(socket.getElement());
		//
		if (trueBlock.size() > 0) {
			blockSockets.add(trueBlock.get(0).getElement());
		} else {
			blockSockets.add(null);
		}
		// falseブロックのパース結果をソケットに追加する
		if (falseBlock.size() > 0) {
			blockSockets.add(falseBlock.get(0).getElement());
		} else {
			blockSockets.add(null);
		}

		List<Node> ifSocketNodes = resolver.getSocketNodes("ifelse");
		SocketsInfo socketsInfo = calcSocketsInfo(ifSocketNodes);

		// ソケットの出力
		addSocketsNode(blockSockets, document, ifElement, socketsInfo);
	}

	public BlockLiteralModel parseIntLiteral(UniIntLiteral num, Document document, Node parent) {
		BlockLiteralModel numberLiteral = new BlockLiteralModel(createLiteralElement(document, parent, "number", Integer.toString(num.value), num.hashCode()));
		return numberLiteral;
	}

	public BlockLiteralModel parseDoubleLiteral(UniDoubleLiteral num, Document document, Node parent) {
		return new BlockLiteralModel(createLiteralElement(document, parent, "double-number", Double.toString(num.value), num.hashCode()));
	}

	public BlockLiteralModel parseStringLiteral(UniStringLiteral str, Document document, Node parent) {
		return new BlockLiteralModel(createLiteralElement(document, parent, "string", str.value, ((UniNode) str).hashCode()));
	}

	public static void addPlugElement(Document document, Element target, Node parentBlockNode, String plugType, String positionType) {
		Element plugNode = document.createElement("Plug");
		Element blockConnectorNode = document.createElement("BlockConnector");

		blockConnectorNode.setAttribute("con-block-id", BlockMapper.getAttribute(parentBlockNode, "id"));
		blockConnectorNode.setAttribute("connector-kind", "plug");
		blockConnectorNode.setAttribute("connector-type", plugType);
		blockConnectorNode.setAttribute("init-type", plugType);
		blockConnectorNode.setAttribute("label", "");
		blockConnectorNode.setAttribute("position-type", positionType);

		plugNode.appendChild(blockConnectorNode);

		target.appendChild(plugNode);
	}

	public BlockElementModel parseMethodCall(UniMethodCall method, Document document, Node parent) {
		// ユーザメソッド、返り値ありはまだ
		UniIdent receiver = (UniIdent) method.receiver;
		if (method.receiver == null || "MyLib".equals(receiver.name)) {
			return createMethodCallModel(method, document, parent);
		} else {
			if (parent == null) {
				String genusName = "callActionMethod2";
				String kind = "command";
				BlockExCallerModel caller = new BlockExCallerModel();

				Element element = createBlockElement(document, genusName, ID_COUNTER++, kind);
				caller.setElement(element);

				BlockExprModel receiverModel = (BlockExprModel) parseExpr(method.receiver, document, element);
				BlockElementModel callMethodModel = createMethodCallModel(method, document, element);
				List<Element> sockets = new ArrayList<>();

				caller.addSocketBlock(receiverModel);
				caller.setCallMethod((BlockCommandModel)callMethodModel);

				sockets.add(receiverModel.getElement());
				sockets.add(callMethodModel.getElement());

				List<Node> socketNodes = resolver.getSocketNodes("callActionMethod2");
				SocketsInfo socketsInfo = calcSocketsInfo(socketNodes);

				// ソケットの出力
				addSocketsNode(sockets, document, element, socketsInfo);

				return caller;

			} else {
				throw new RuntimeException("method call not supported yet");
			}
		}
	}

	public BlockElementModel createMethodCallModel(UniMethodCall method, Document document, Node parent) {
		String genusName = calcMethodCallGenusName(method);
		List<Element> exprs = new ArrayList<Element>();
		List<BlockExprModel> argModels = new ArrayList<>();
		String kind = BlockMapper.getAttribute(resolver.getBlockNode(genusName), "kind");

		Element element = createBlockElement(document, genusName, ID_COUNTER++, kind);
		addElement("Name", document, method.methodName, element);

		if (method.args != null) {
			// 引数パース
			for (UniExpr expr : method.args) {
				BlockElementModel arg = parseExpr(expr, document, element);
				if (arg instanceof BlockExprModel) {
					argModels.add((BlockExprModel)arg);
					exprs.add(arg.getElement());
				} else {
					throw new RuntimeException("can not use the expression" + expr.toString());
				}
			}
		}

		List<Node> socketNodes = resolver.getSocketNodes(genusName);
		SocketsInfo socketsInfo = calcSocketsInfo(socketNodes);
		// socketの追加
		addSocketsNode(exprs, document, element, socketsInfo);

		if("function".equals(kind)){
			BlockExprModel caller = new BlockExprModel();
			Node plugNode = resolver.getPlugElement(genusName);
			Map<String, String> plugInfo = calcPlugInfo(plugNode);

			addPlugElement(document, element, parent, plugInfo.get("connector-type"), plugInfo.get("position-type"));

			caller.setElement(element);
			return caller;
		}else{
			BlockCommandModel caller = new BlockCommandModel();
			caller.setElement(element);

			for(BlockExprModel model : argModels){
				caller.addSocketBlock(model);
			}

			return caller;
		}
	}

	/*
	 * UniMethodCallの関数名からBlockの名前を計算する
	 */
	private String calcMethodCallGenusName(UniMethodCall method) {
		String genusName = method.methodName + "[";
		// 名前空間補完}
		for (UniExpr arg : method.args) {
			genusName += "@" + convertParamTypeName(calcParamType(arg));
		}

		genusName += "]";

		genusName = resolver.getNamespace(genusName) + genusName;

		return genusName;
	}

	public static String convertParamTypeName(String name) {
		if (name.equals("number") || name.equals("double-number")) {
			return "int";
		} else {
			return name;
		}
	}

	private String calcParamType(UniExpr param) {
		String type = "";
		if (param instanceof UniStringLiteral) {
			type = "string";
		} else if (param instanceof UniIntLiteral) {
			type = "number";
		} else if (param instanceof UniIdent) {
			type = BlockMapper.getChildNode(vnResolver.getVariableNode(((UniIdent) param).name), "Type").getTextContent();
		} else {
			throw new RuntimeException(param.toString() + "has not been supported yet.");
		}
		return type;
	}

	public static void addSocketsNode(List<Element> args, Document document, Element blockNode, SocketsInfo socketsInfo) {
		if (args.size() > 0) {
			Element sockets = document.createElement("Sockets");
			sockets.setAttribute("num-sockets", String.valueOf(args.size()));
			for (int i = 0; i < args.size(); i++) {
				SocketInfo socketInfo = socketsInfo.getSockets().get(i);
				socketInfo.setConnectorBlockID(getIdFromElement(args.get(i)));
				addSocketNode(document, sockets, socketsInfo.getSockets().get(i));
			}
			blockNode.appendChild(sockets);
		}
	}

	public static void addSocketNode(Document document, Node socketsNode, SocketInfo socketInfo) {
		Element connector = document.createElement("BlockConnector");

		connector.setAttribute("connector-kind", "socket");
		connector.setAttribute("position-type", socketInfo.getPositionType());
		connector.setAttribute("label", socketInfo.getLabel());

		if (!"-1".equals(socketInfo.getConnectorBlockID())) {
			connector.setAttribute("con-block-id", socketInfo.getConnectorBlockID());
			connector.setAttribute("connector-type", socketInfo.getConnectorType());
			connector.setAttribute("init-type", socketInfo.getInitType());
		} else {
			connector.setAttribute("connector-type", socketInfo.getConnectorType());
			connector.setAttribute("init-type", socketInfo.getInitType());
		}

		socketsNode.appendChild(connector);
	}

	public static String getIdFromElement(Element element) {
		if (element == null) {
			return "-1";
		}
		if ("BlockStub".equals(element.getNodeName())) {
			return BlockMapper.getAttribute(BlockMapper.getChildNode(element, "Block"), "id");
		} else {
			return BlockMapper.getAttribute(element, "id");
		}
	}

	public static String getSocketConnectorType(String kind) {
		if (kind == null) {
			return "cmd";
		} else {
			return kind;
		}
	}

	public static void addLocationElement(Document document, String x, String y, Element blockElement) {
		Element locationElement = document.createElement("Location");
		Element xElement = document.createElement("X");
		Element yElement = document.createElement("Y");

		xElement.setTextContent(x);
		yElement.setTextContent(y);

		locationElement.appendChild(xElement);
		locationElement.appendChild(yElement);

		blockElement.appendChild(locationElement);
	}

	public static void addElement(String elementName, Document document, String name, Element blockElement) {
		Element element = document.createElement(elementName);
		element.setTextContent(name);
		blockElement.appendChild(element);
	}

	public static Element createBlockElement(Document document, String genusName, long id, String kind) {
		Element element = document.createElement("Block");
		element.setAttribute("genus-name", genusName);
		element.setAttribute("id", String.valueOf(id));
		element.setAttribute("kind", kind);

		return element;
	}

	public String getSaveString(UniClassDec classDec) {
		try {
			Node node = getSaveNode(classDec);

			StringWriter writer = new StringWriter();
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(new DOMSource(node), new StreamResult(writer));
			return writer.toString();
		} catch (TransformerConfigurationException e) {
			throw new RuntimeException(e);
		} catch (TransformerException e) {
			throw new RuntimeException(e);
		}
	}

	public Node getSaveNode(UniClassDec classDec) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setNamespaceAware(true);

			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();

			Element documentElement = document.createElementNS(XML_CODEBLOCKS_NS, "cb:CODEBLOCKS");

			// schema reference
			documentElement.setAttributeNS(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI, "xsi:schemaLocation", XML_CODEBLOCKS_NS + " " + XML_CODEBLOCKS_SCHEMA_URI);

			// Pagesノードの作成
			Element pagesElement = document.createElement("Pages");
			pagesElement.setAttribute("collapsible-pages", "no");
			// Pageノードの作成
			Element pageElement = document.createElement("Page");
			pageElement.setAttribute("page-color", "40 40 40");
			pageElement.setAttribute("page-drawer", "");
			pageElement.setAttribute("page-infullview", "yes");
			pageElement.setAttribute("page-name", classDec.className);
			pageElement.setAttribute("page-width", "1366");

			BlockClassModel model = parseClass(classDec, document);

			pageElement.appendChild(model.createBlockNodes(document));

			pagesElement.appendChild(pageElement);
			documentElement.appendChild(pagesElement);
			document.appendChild(documentElement);

			return document;
		} catch (ParserConfigurationException e) {
			throw new RuntimeException(e);
		}
	}
}
