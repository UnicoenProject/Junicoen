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
import net.unicoen.node.UniNew;
import net.unicoen.node.UniNode;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;
import net.unicoen.parser.blockeditor.blockmodel.BlockAbstractBlockModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockBinaryOperatorModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockBooleanLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockClassModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockCommandModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockContinueModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockDoWhileModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockDoubleLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockElementModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockExCallGetterModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockExCallerModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockExprModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockIfModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockIntLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockLocalVarDecModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockMethodCallModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockNewModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockNotOperatorModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockPrePostModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockProcParmModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockProcedureModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockReturnModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockStringLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockVariableGetterModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockVariableSetterModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockWhileModel;
import net.unicoen.parser.blockeditor.blockmodel.PageModel;
import net.unicoen.parser.blockeditor.blockmodel.PagesModel;
import net.unicoen.parser.blockeditor.blockmodel.PlugInfo;
import net.unicoen.parser.blockeditor.blockmodel.SocketInfo;
import net.unicoen.parser.blockeditor.blockmodel.SocketsInfo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

public class BlockGenerator {

	/** Name space definition */
	private static String XML_CODEBLOCKS_NS = "http://education.mit.edu/openblocks/ns";

	/** Location of schema */
	private static String XML_CODEBLOCKS_SCHEMA_URI = "http://education.mit.edu/openblocks/codeblocks.xsd";

	private Long ID_COUNTER = (long) 1000;

	private BlockResolver resolver;

	private Map<String, Element> addedModels = new HashMap<String, Element>();

	private PrintStream out;

	public BlockGenerator(PrintStream out, String langdefRootPath) {
		this.out = out;
		resolver = new BlockResolver(langdefRootPath);
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

			BlockClassModel model = parseClass(classDec, document);

			PageModel pageModel = new PageModel(classDec.className, model.createBlockNodes(document), document);

			List<PageModel> pages = new ArrayList<PageModel>();
			pages.add(pageModel);

			PagesModel pagesModel = new PagesModel(pages, document);

			documentElement.appendChild(pagesModel.getPagesElement());
			document.appendChild(documentElement);

			return document;
		} catch (ParserConfigurationException e) {
			throw new RuntimeException(e);
		}
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
			UniMethodDec mDec = (UniMethodDec) member;
			if (!isMainMethod(mDec)) {
				model.addMethod(parseFunctionDec(mDec, document));
			}
		}

		return model;
	}

	public boolean isMainMethod(UniMethodDec dec) {
		if ("main".equals(dec.methodName) && dec.modifiers != null) {
			for (String mod : dec.modifiers) {
				if ("static".equals(mod)) {
					return true;
				}
			}
		}
		return false;
	}

	public List<BlockCommandModel> parseBody(Document document, Element parentElement, UniExpr statement) {
		if (statement == null || !(statement instanceof UniBlock)) {
			return new ArrayList<>(); // can be Collections.emptyList();
		}

		UniBlock statementBlock = (UniBlock) statement;

		// bodyを辿ってモデル作成
		List<BlockCommandModel> blocks = new ArrayList<>();
		String beforeId = parentElement.getAttribute(BlockElementModel.ID_ATTRIBUTE_TAG);
		if (statementBlock.body != null) {
			for (int i = 0; i < statementBlock.body.size(); i++) {
				UniExpr expr = statementBlock.body.get(i);
				BlockElementModel command = parseExpr(expr, document, null);

				// statement以外は弾く
				if (!(command instanceof BlockCommandModel)) {
					throw new RuntimeException("cant use the expression" + expr.toString());
				}

				command.addBeforeBlockNode(document, beforeId);

				if (i + 1 < statementBlock.body.size()) {
					command.addAfterBlockNode(document, String.valueOf(ID_COUNTER));
					beforeId = command.getElement().getAttribute(BlockElementModel.ID_ATTRIBUTE_TAG);
				}

				blocks.add((BlockCommandModel) command);
			}
		}
		return blocks;
	}

	/*
	 * 関数の解析
	 */
	public BlockProcedureModel parseFunctionDec(UniMethodDec funcDec, Document document) {
		BlockProcedureModel model = new BlockProcedureModel(funcDec, document, ID_COUNTER++);
		// //引数を解析して引数モデルを生成
		model.addSockets(document, parseFunctionArgs(document, funcDec.args, model.getElement()));

		List<BlockCommandModel> bodyBlocks = new ArrayList<>();
		model.setBodyBlocks(bodyBlocks);
		// funcDec.body ボディのパース
		if (hasBody(funcDec)) {
			model.addAfterBlockNode(document,  String.valueOf(ID_COUNTER));
			String beforeId = model.getElement().getAttribute(BlockElementModel.ID_ATTRIBUTE_TAG);
			List<UniExpr> body = funcDec.block.body;
			for (int i = 0; i < body.size(); i++) {
				try {
					// expressionの解析 行き掛け順
					BlockElementModel commandBlock = parseExpr(body.get(i), document, null);// 木で返す．

					if (i + 1 < body.size()) {
						commandBlock.addAfterBlockNode(document, String.valueOf(ID_COUNTER));
					}

					// 左辺ブロックに直前のブロックのIDを追加する
					commandBlock.addBeforeBlockNode(document, beforeId);

					bodyBlocks.add((BlockCommandModel) commandBlock);
					beforeId = commandBlock.getBlockID();
				} catch (Exception e) {
					throw new RuntimeException("cant convert " + body.get(i));
				}
			}
		}

		resolver.getVariableNameResolver().resetLocalVariables();

		return model;
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
		BlockProcParmModel model = new BlockProcParmModel(arg.type, arg.name, document, resolver, ID_COUNTER++);

		PlugInfo plugInfo = new PlugInfo(resolver.getPlugElement(model.getGenusName()), DOMUtil.getAttribute(parent, BlockElementModel.ID_ATTRIBUTE_TAG));
		model.setPlugElement(document, plugInfo);

		resolver.getVariableNameResolver().addLocalVariable(arg.name, model.getElement());

		return model;
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
			Node blockNode = DOMUtil.getChildNode(element, "Block");
			return DOMUtil.getAttribute(blockNode, attributeName);
		} else {
			return element.getAttribute(attributeName);
		}
	}

	public BlockElementModel parseExpr(UniExpr expr, Document document, Element parent) {
		BlockElementModel model = null;
		if (expr instanceof UniMethodCall) {
			model = parseMethodCall((UniMethodCall) expr, document, parent);
		} else if (expr instanceof UniIdent) {
			model = parseIdent((UniIdent) expr, document, parent);
		} else if (expr instanceof UniStringLiteral) {
			model = parseStringLiteral((UniStringLiteral) expr, document, DOMUtil.getAttribute(parent, BlockElementModel.ID_ATTRIBUTE_TAG));
		} else if (expr instanceof UniIntLiteral) {
			model = parseIntLiteral((UniIntLiteral) expr, document, DOMUtil.getAttribute(parent, BlockElementModel.ID_ATTRIBUTE_TAG));
		} else if (expr instanceof UniBoolLiteral) {
			model = parseBoolLiteral((UniBoolLiteral) expr, document, DOMUtil.getAttribute(parent, BlockElementModel.ID_ATTRIBUTE_TAG));
		} else if (expr instanceof UniDoubleLiteral) {
			model = parseDoubleLiteral((UniDoubleLiteral) expr, document, DOMUtil.getAttribute(parent, BlockElementModel.ID_ATTRIBUTE_TAG));
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
		} else if (expr instanceof UniVariableDec) {
			model = parseVarDec((UniVariableDec) expr, document, parent);
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
		} else if (expr instanceof UniNew) {
			model = parseNew((UniNew) expr, document, DOMUtil.getAttribute(parent, BlockElementModel.ID_ATTRIBUTE_TAG));
		}

		addParsedModel((UniNode) expr, model.getElement());

		return model;
	}

	public BlockElementModel parseNew(UniNew expr, Document document, String parent) {
		return new BlockNewModel(expr, parent, document, ID_COUNTER++, resolver);
	}

	public BlockElementModel parseIdent(UniIdent expr, Document document, Node parent) {
		Node varDecNode = resolver.getVariableNameResolver().getVariableNode(expr.name);
		if (varDecNode != null) {
			BlockVariableGetterModel getterModel = new BlockVariableGetterModel(expr, varDecNode, document, ID_COUNTER++);
			PlugInfo plugInfo = new PlugInfo("", getterModel.getConnectorKind(), "mirror", DOMUtil.getAttribute(parent, BlockElementModel.ID_ATTRIBUTE_TAG));
			getterModel.setPlugElement(document, plugInfo);

			return getterModel;
		} else {
			throw new RuntimeException("illegal variable:" + expr.name);
		}
	}

	public BlockElementModel parseFor(UniFor forExpr, Document document, Node parent) {
		// whileをもつ抽象化ブロックを作成して返す
		UniBlock forBlock = new UniBlock(new ArrayList<>(), null);
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

		List<BlockElementModel> blockSockets = new ArrayList<>();
		if (trueBlocks.size() > 0) {
			blockSockets.add(trueBlocks.get(0));
		} else {
			blockSockets.add(null);
		}
		blockSockets.add(socket);

		// genusnameからソケットのラベルとポジションタイプを作成
		List<Node> whileSocketNodes = resolver.getSocketNodes("dowhile");
		SocketsInfo socketsInfo = calcSocketsInfo(whileSocketNodes);

		// ソケットの出力
		model.addSocketsAndNodes(blockSockets, trueBlocks, document, socketsInfo);

		return model;
	}

	public BlockAbstractBlockModel parseBlock(UniBlock blockExpr, Document document, Node parent) {
		Element blockElement = createBlockElement(document, "abstraction", ID_COUNTER++, "command");
		BlockAbstractBlockModel model = new BlockAbstractBlockModel(blockElement);
		List<BlockCommandModel> commands = parseBody(document, blockElement, blockExpr);
		SocketsInfo socketsInfo = calcSocketsInfo(resolver.getSocketNodes("abstraction"));

		List<BlockElementModel> bodyTopElement = new ArrayList<>();
		if (commands.size() > 0) {
			bodyTopElement.add(commands.get(0));
		}

		// 抽象化コメントの追加
		if (blockExpr.blockLabel != null) {
			addElement("Label", document, blockExpr.blockLabel, blockElement);
		}

		model.addSocketsAndNodes(Lists.transform(commands, new Function<BlockCommandModel, BlockElementModel>() {
			@Override
			public BlockElementModel apply(BlockCommandModel input) {
				return (BlockElementModel) input;
			}
		}), document, socketsInfo);
		return model;
	}

	public BlockElementModel parseReturn(UniReturn returnExpr, Document document, Node parent) {
		Element blockElement = createBlockElement(document, "return", ID_COUNTER++, "command");

		BlockElementModel returnValue = parseExpr(returnExpr.value, document, blockElement);
		if (returnExpr.value != null) {
			return new BlockReturnModel(blockElement, (BlockExprModel) returnValue, document);
		} else {
			return new BlockReturnModel(blockElement, null, document);
		}
	}

	public BlockLocalVarDecModel parseVarDec(UniVariableDec varDec, Document document, Element parent) {
		BlockLocalVarDecModel model = parseVarDec(varDec.type, varDec.name, document, parent);
		BlockElementModel initializer = null;
		if (varDec.value != null) {
			initializer = parseExpr(varDec.value, document, model.getElement());
		}

		List<Node> socketNodes = resolver.getSocketNodes(model.getElement().getAttribute("genus-name"));

		SocketsInfo sockets = calcSocketsInfo(socketNodes);

		List<BlockElementModel> args = new ArrayList<>();
		if (initializer != null) {
			args.add(initializer);
		} else {
			args.add(null);
		}

		model.addSocketsAndNodes(args, document, sockets);

		addParsedModel((UniNode) varDec, model.getElement());

		return model;
	}

	/*
	 * ブロック定義ファイルのソケットノードから，ソケット情報を作成する
	 */
	public SocketsInfo calcSocketsInfo(List<Node> socketNodes) {
		if (socketNodes == null || socketNodes.size() <= 0) {
			return new SocketsInfo(new ArrayList<SocketInfo>());
		} else {
			List<SocketInfo> sockets = new ArrayList<SocketInfo>();
			for (int i = 0; i < socketNodes.size(); i++) {
				String label = DOMUtil.getAttribute(socketNodes.get(i), "label");
				String positionType = DOMUtil.getAttribute(socketNodes.get(i), "position-type");
				String connectorType = DOMUtil.getAttribute(socketNodes.get(i), "connector-type");
				String connectorID = DOMUtil.getAttribute(socketNodes.get(i), "con-block-id");

				sockets.add(new SocketInfo(label, positionType, connectorType, connectorType, connectorID));
			}

			return new SocketsInfo(sockets);
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
				socketLabels[i] = DOMUtil.getAttribute(socketNodes.get(i), "label");
				socketTypes[i] = DOMUtil.getAttribute(socketNodes.get(i), "connector-type");
				socketPositionTypes[i] = DOMUtil.getAttribute(socketNodes.get(i), "position-type");
			}

			socketsInfo.put("label", socketLabels);
			socketsInfo.put("connector-type", socketTypes);
			socketsInfo.put("position-type", socketPositionTypes);

			return socketsInfo;
		}
	}

	public BlockLocalVarDecModel parseVarDec(String type, String name, Document document, Element parent) {
		BlockLocalVarDecModel model = new BlockLocalVarDecModel(type, name, document, resolver, ID_COUNTER++);
		resolver.getVariableNameResolver().addLocalVariable(name, model.getElement());
		return model;
	}

	public BlockElementModel parseUnaryOperator(UniUnaryOp uniOp, Document document, Node parent) {
		// !,++,--,+,-
		List<Element> elements = new ArrayList<Element>();
		if ("!".equals(uniOp.operator)) {
			Element blockElement = createBlockElement(document, "not", ID_COUNTER++, "function");
			BlockElementModel value = parseExpr(uniOp.expr, document, blockElement);

			BlockNotOperatorModel model = new BlockNotOperatorModel(blockElement, (BlockExprModel) value);

			List<BlockElementModel> args = Lists.newArrayList(value);

			List<Node> socketNodes = resolver.getSocketNodes("not");
			SocketsInfo sockets = calcSocketsInfo(socketNodes);

			model.addSocketsAndNodes(args, document, sockets);

			// setPlug
			PlugInfo plugInfo = new PlugInfo(resolver.getPlugElement(model.getGenusName()), DOMUtil.getAttribute(parent, BlockElementModel.ID_ATTRIBUTE_TAG));
			model.setPlugElement(document, plugInfo);

			return model;
		} else if ("_++".equals(uniOp.operator) || "_--".equals(uniOp.operator) || "++_".equals(uniOp.operator) || "--_".equals(uniOp.operator)) {
			String genusName = "setter";
			UniIdent ident = (UniIdent) uniOp.expr;
			String operator = "+";
			if (uniOp.operator.contains("--")) {
				operator = "-";
			}

			Node varDecNode = resolver.getVariableNameResolver().getLocalVariableID(ident.name);
			if (varDecNode == null) {
				throw new RuntimeException(ident.name + " is not defined");
			}

			if (parent == null) {
				// i++;とか i = i+1に変換
				genusName += DOMUtil.getAttribute(varDecNode, "genus-name");
				// BlockStubノード作成
				Element blockStubElement = createBlockStubNode(document, ident.name, DOMUtil.getAttribute(varDecNode, "genus-name"));
				// Blockノード作成
				Element blockElement = createVariableBlockNode(document, genusName, ident.name, "command");

				List<Node> socketNodes = resolver.getSocketNodes(genusName.substring("setter".length(), genusName.length()));
				SocketsInfo sockets = calcSocketsInfo(socketNodes);

				BlockElementModel right = parseExpr((UniExpr) (new UniBinOp(operator, new UniIdent(ident.name), new UniIntLiteral(1))), document, blockElement);

				List<BlockElementModel> rightElement = new ArrayList<>();
				rightElement.add(right);

				BlockVariableSetterModel model = new BlockVariableSetterModel(blockStubElement, (BlockExprModel) right);

				model.addSocketsAndNodes(rightElement, document, sockets);

				// BlockStubノードにBlockノードを追加する
				blockStubElement.appendChild(blockElement);

				return model;
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

				Element blockStubElement = createBlockStubNode(document, ident.name, DOMUtil.getAttribute(varDecNode, "genus-name"));
				// Blockノード作成
				Element blockElement = createVariableBlockNode(document, genusName + DOMUtil.getAttribute(varDecNode, "genus-name"), ident.name, "command");
				// BlockStubノードにBlockノードを追加する
				blockStubElement.appendChild(blockElement);
				elements.add(blockStubElement);

				return new BlockPrePostModel(blockStubElement);
			}
		} else {
			throw new RuntimeException("not supported unary operator");
		}
	}

	// TODO should remove after refactoring
	public Element createVariableBlockNode(Document document, String genusName, String name, String kind) {
		Element blockElement = createBlockElement(document, genusName, ID_COUNTER++, kind);
		addElement("Label", document, name, blockElement);
		addElement("Name", document, name, blockElement);
		return blockElement;
	}

	// TODO should remove after refactoring
	public Element createBlockStubNode(Document document, String parentName, String parentGenusName) {
		Element blockStubElement = document.createElement("BlockStub");
		addElement("StubParentName", document, parentName, blockStubElement);
		addElement("StubParentGenus", document, parentGenusName, blockStubElement);
		return blockStubElement;
	}

	public BlockCommandModel parseContinueBreak(String name, Document document, Node parent) {
		BlockCommandModel model = new BlockContinueModel(createBlockElement(document, name, ID_COUNTER++, "command"));
		return model;
	}

	public BlockElementModel parseBinOp(UniBinOp binopExpr, Document document, Node parent) {
		Element blockElement;
		String type = getExprType(binopExpr.left, binopExpr.right);// 左右を先読みして，何型の演算か取得

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

		BlockElementModel leftBlock = parseExpr(binopExpr.left, document, blockElement);
		BlockElementModel rightBlock = parseExpr(binopExpr.right, document, blockElement);

		BlockBinaryOperatorModel binOpModel = new BlockBinaryOperatorModel(blockElement, (BlockExprModel) leftBlock, (BlockExprModel) rightBlock);

		// plugの追加
		PlugInfo plugInfo = new PlugInfo(resolver.getPlugElement(blockElement.getAttribute("genus-name")), DOMUtil.getAttribute(parent, BlockElementModel.ID_ATTRIBUTE_TAG));
		binOpModel.setPlugElement(document, plugInfo);

		// socketの追加
		List<Node> socketNodes = resolver.getSocketNodes(blockElement.getAttribute("genus-name"));
		SocketsInfo sockets = calcSocketsInfo(socketNodes);
		binOpModel.addSocketsAndNodes(Lists.newArrayList(leftBlock, rightBlock), document, sockets);

		return binOpModel;
	}

	/**
	 * パースしたモデルを保存しておく　デバッガで利用するため
	 */
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
			Node varDecNode = resolver.getVariableNameResolver().getLocalVariableID(ident.name);

			genusName += DOMUtil.getAttribute(varDecNode, "genus-name");
			// BlockStubノード作成
			Element blockStubElement = createBlockStubNode(document, ident.name, DOMUtil.getAttribute(varDecNode, "genus-name"));

			// Blockノード作成
			Element blockElement = createVariableBlockNode(document, genusName, ident.name, "command");

			// 右辺のモデルの生成
			BlockElementModel right = parseExpr(binopExpr.right, document, blockElement);
			List<Node> socketNodes = resolver.getSocketNodes(genusName.substring("setter".length(), genusName.length()));

			// ソケット情報を付与して返す
			if (socketNodes != null) {
				SocketsInfo sockets = calcSocketsInfo(socketNodes);
				List<BlockElementModel> rightElement = new ArrayList<>();
				rightElement.add(right);

				// BlockStubノードにBlockノードを追加する
				blockStubElement.appendChild(blockElement);

				BlockVariableSetterModel model = new BlockVariableSetterModel(blockStubElement, (BlockExprModel) right);
				model.addSocketsAndNodes(rightElement, document, sockets);

				return model;
			} else {
				throw new RuntimeException("illegal right element:" + binopExpr.right);
			}
		} else {
			throw new RuntimeException("illegal left op:" + binopExpr.left);
		}
	}

	public String getExprType(UniExpr left, UniExpr right) {
		// 二項演算の返り値の型を計算する
		String leftType = getExprType(left);
		String rightType = getExprType(right);
		String returnType = null;
		if (leftType.equals(rightType)) {
			returnType = leftType;
		} else if ((leftType.equals("int") && rightType.equals("double")) || (leftType.equals("double") && rightType.equals("int"))) {
			returnType = "int";
		} else {
			// 強制的にintに
			// TODO should fix
			returnType = "int";
		}
		return returnType;
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
			type = DOMUtil.getChildNode(resolver.getVariableNameResolver().getVariableNode(((UniIdent) expr).name), "Type").getTextContent();
		} else if (expr instanceof UniBinOp) {
			type = getExprType(((UniBinOp) expr).left, ((UniBinOp) expr).right);
		} else if (expr instanceof UniUnaryOp) {
			type = getExprType(((UniUnaryOp) expr).expr);
		}
		return type;
	}

	public BlockWhileModel parseWhile(UniWhile whileExpr, Document document, Node parent) {

		Element blockElement = createBlockElement(document, "while", ID_COUNTER++, "command");
		BlockWhileModel model = new BlockWhileModel(blockElement);

		BlockElementModel socket = parseExpr(whileExpr.cond, document, blockElement);

		List<BlockCommandModel> trueBlocks = parseBody(document, blockElement, whileExpr.statement);
		model.setTrueBlocks(trueBlocks);

		List<BlockElementModel> blockSockets = new ArrayList<>();
		blockSockets.add(socket);

		if (trueBlocks.size() > 0) {
			blockSockets.add(trueBlocks.get(0));
		} else {
			blockSockets.add(null);
		}
		// genusnameからソケットのラベルとポジションタイプを作成
		List<Node> whileSocketNodes = resolver.getSocketNodes("while");
		SocketsInfo socketsInfo = calcSocketsInfo(whileSocketNodes);

		model.addSocketsAndNodes(blockSockets, trueBlocks, document, socketsInfo);

		return model;
	}

	public BlockLiteralModel parseBoolLiteral(UniBoolLiteral boolexpr, Document document, String parent) {
		return new BlockBooleanLiteralModel(boolexpr, document, parent, ID_COUNTER++, resolver);
	}

	public BlockIfModel parseIf(UniIf ifexpr, Document document, Node parent) {
		// //BlockModelのifモデルを作成する．（Xml Element）
		Element ifElement = createBlockElement(document, "ifelse", ID_COUNTER++, "command");
		BlockIfModel ifBlockModel = new BlockIfModel(ifElement);
		ifBlockModel.setElement(ifElement);

		// Universal Modelの条件式，真ブロック式，偽ブロック式をそれぞれ解析し，BlockModel（xml
		// Element）を作成する
		BlockElementModel socket = parseExpr(ifexpr.cond, document, ifElement);
		List<BlockCommandModel> trueBlock = parseBody(document, ifElement, ifexpr.trueStatement);
		List<BlockCommandModel> falseBlock = parseBody(document, ifElement, ifexpr.falseStatement);

		// if式のソケット情報を付与
		addIfSocketInfo(document, ifBlockModel, socket, trueBlock, falseBlock);

		ifBlockModel.setTrueBlocks(trueBlock);
		ifBlockModel.setFalseBlocks(falseBlock);

		return ifBlockModel;
	}

	public void addIfSocketInfo(Document document, BlockIfModel model, BlockElementModel socket, List<BlockCommandModel> trueBlock, List<BlockCommandModel> falseBlock) {

		List<BlockElementModel> blockSockets = new ArrayList<>();

		blockSockets.add(socket);
		//
		if (trueBlock.size() > 0) {
			blockSockets.add(trueBlock.get(0));
		} else {
			blockSockets.add(null);
		}
		// falseブロックのパース結果をソケットに追加する
		if (falseBlock.size() > 0) {
			blockSockets.add(falseBlock.get(0));
		} else {
			blockSockets.add(null);
		}

		List<Node> ifSocketNodes = resolver.getSocketNodes("ifelse");
		SocketsInfo socketsInfo = calcSocketsInfo(ifSocketNodes);

		// ソケットの出力
		model.addSocketsAndNodes(blockSockets, document, socketsInfo);
	}

	public BlockLiteralModel parseIntLiteral(UniIntLiteral num, Document document, String parent) {
		return new BlockIntLiteralModel(String.valueOf(num.value), document, parent, ID_COUNTER++, resolver);
	}

	public BlockLiteralModel parseDoubleLiteral(UniDoubleLiteral num, Document document, String parent) {
		return new BlockDoubleLiteralModel(num, document, parent, ID_COUNTER++, resolver);
	}

	public BlockLiteralModel parseStringLiteral(UniStringLiteral str, Document document, String parent) {
		return new BlockStringLiteralModel(str.value, document, parent, ID_COUNTER++, resolver);
	}

	public BlockElementModel parseMethodCall(UniMethodCall method, Document document, Node parent) {
		// TODO ユーザメソッドへの対応
		UniIdent receiver = (UniIdent) method.receiver;
		if (method.receiver == null || "MyLib".equals(receiver.name)) {
			return createMethodCallModel(method, document, parent);
		} else {
			if (parent == null) {
				BlockExCallerModel caller = new BlockExCallerModel(document, ID_COUNTER++);

				BlockExprModel receiverModel = (BlockExprModel) parseExpr(method.receiver, document, caller.getElement());
				BlockElementModel callMethodModel = createMethodCallModel(method, document, caller.getElement());

				// モデルにソケットに結合されるモデルを追加
				caller.setCallMethod((BlockCommandModel) callMethodModel);

				// ソケットノードの作成
				List<Node> socketNodes = resolver.getSocketNodes("callActionMethod2");
				SocketsInfo socketsInfo = calcSocketsInfo(socketNodes);
				caller.addSocketsAndNodes(Lists.newArrayList((BlockElementModel) receiverModel, (BlockElementModel) callMethodModel), document, socketsInfo);

				return caller;
			} else {
				BlockExCallGetterModel caller = new BlockExCallGetterModel(document, ID_COUNTER++);

				BlockExprModel receiverModel = (BlockExprModel) parseExpr(method.receiver, document, caller.getElement());
				BlockElementModel callMethodModel = createMethodCallModel(method, document, caller.getElement());

				// socketノードの作成
				List<Node> socketNodes = resolver.getSocketNodes(caller.getGenusName());
				SocketsInfo socketsInfo = calcSocketsInfo(socketNodes);
				caller.addSocketsAndNodes(Lists.newArrayList((BlockElementModel) receiverModel, (BlockElementModel) callMethodModel), document, socketsInfo);

				// plugノードの追加
				PlugInfo plug = new PlugInfo(resolver.getPlugElement(caller.getGenusName()), DOMUtil.getAttribute(parent, BlockElementModel.ID_ATTRIBUTE_TAG));
				caller.setPlugElement(document, plug);
				return caller;
			}
		}
	}

	public BlockElementModel createMethodCallModel(UniMethodCall method, Document document, Node parent) {
		BlockMethodCallModel caller = new BlockMethodCallModel(method, document, resolver, ID_COUNTER++, parent);

		List<Element> exprs = new ArrayList<Element>();
		List<BlockExprModel> argModels = new ArrayList<>();

		// 引数パース
		if (method.args != null) {
			for (UniExpr expr : method.args) {
				BlockElementModel arg = parseExpr(expr, document, caller.getElement());
				if (arg instanceof BlockExprModel) {
					argModels.add((BlockExprModel) arg);
					exprs.add(arg.getElement());
				} else {
					throw new RuntimeException("can not use the expression" + expr.toString());
				}
			}
		}

		List<Node> socketNodes = resolver.getSocketNodes(caller.getGenusName());
		SocketsInfo socketsInfo = calcSocketsInfo(socketNodes);

		caller.addSocketsAndNodes(Lists.transform(argModels, new Function<BlockExprModel, BlockElementModel>() {
			@Override
			public BlockElementModel apply(BlockExprModel input) {
				return (BlockElementModel) input;
			}
		}), document, socketsInfo);

		return caller;
	}

	public static void addElement(String elementName, Document document, String name, Element blockElement) {
		Element element = document.createElement(elementName);
		element.setTextContent(name);
		blockElement.appendChild(element);
	}

	public static Element createBlockElement(Document document, String genusName, long id, String kind) {
		Element element = document.createElement("Block");
		element.setAttribute("genus-name", genusName);
		element.setAttribute(BlockElementModel.ID_ATTRIBUTE_TAG, String.valueOf(id));
		element.setAttribute("kind", kind);
		return element;
	}

}
