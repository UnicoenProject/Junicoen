package net.unicoen.parser.blockeditor;

import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniArray;
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
import net.unicoen.node.UniFor;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniImport;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniLongLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNamespace;
import net.unicoen.node.UniNew;
import net.unicoen.node.UniNewArray;
import net.unicoen.node.UniProgram;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniTernaryOp;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;
import net.unicoen.parser.blockeditor.blockmodel.BlockAbstractBlockModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockBinaryOperatorModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockBooleanLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockBreakModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockCastModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockClassModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockCommandModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockContinueModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockDoWhileModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockDoubleLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockElementModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockEmptyModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockExCallGetterModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockExCallerModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockExprModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockFieldAccessModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockFieldVarDecModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockIfModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockIntLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockLocalVarDecModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockMethodCallModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockMethodCallWithReturnModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockNewModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockNotOperatorModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockPlugModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockPrePostModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockProcParmModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockProcedureModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockReturnModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockSocketModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockSocketsModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockSpecialExpressionModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockSpecialModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockStringLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockUserMethodCallModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockUserMethodCallWithReturnModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockVariableGetterModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockVariableSetterModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockWhileModel;
import net.unicoen.parser.blockeditor.blockmodel.PageModel;
import net.unicoen.parser.blockeditor.blockmodel.PagesModel;

public class BlockGenerator extends UniModelVisitor {

	/** Name space definition */
	private static String XML_CODEBLOCKS_NS = "http://education.mit.edu/openblocks/ns";

	/** Location of schema */
	private static String XML_CODEBLOCKS_SCHEMA_URI = "http://education.mit.edu/openblocks/codeblocks.xsd";
	private static long INIT_ID_NUM = 1000;
	private static Long MAX_AVAIABLE_ID = (long) 1000;

	private Long ID_COUNTER = INIT_ID_NUM;

	private BlockResolver resolver;

	private PrintStream out;
	public static String BLOCK_ENC = "UTF-8";

	private String superClass = "";

	private Document document;
	private Stack<String> idStack = new Stack<>();

	public static String PARENT_ID_NULL = "-1";

	public BlockGenerator(PrintStream out, String langdefRootPath) throws SAXException, IOException {
		this.out = out;
		resolver = new BlockResolver(langdefRootPath, false);
	}

	public BlockGenerator(PrintStream out, String langdefRootPath, boolean isTest) throws SAXException, IOException {
		this.out = out;
		resolver = new BlockResolver(langdefRootPath, isTest);
	}

	public void parse(UniClassDec dec) {
		out.print(getSaveString(dec));

		out.close();
	}

	public void parseUniFile(UniProgram file) throws TransformerException, ParserConfigurationException {
		out.print(createBlockXMLString(getSaveNode(file)));
		out.close();
	}

	public Node getSaveNode(UniProgram file) throws ParserConfigurationException {
		Element documentElement = createRootNode();

		PagesModel pagesModel = (PagesModel) visitFile(file);

		documentElement.appendChild(pagesModel.getPagesElement());
		document.appendChild(documentElement);

		return document;
	}

	/**
	 * UniClassModelを解析して，BockEditorのソースコード形式のxmlNodeを文字列として取得する
	 * 
	 * @param classDec
	 * @return
	 */
	public String getSaveString(UniClassDec classDec) throws RuntimeException {
		try {
			Node node = getSaveNode(classDec);

			return createBlockXMLString(node);
		} catch (TransformerConfigurationException e) {
			throw new RuntimeException(e);
		} catch (TransformerException e) {
			throw new RuntimeException(e);
		}
	}

	private String createBlockXMLString(Node node) throws TransformerException {
		StringWriter writer = new StringWriter();
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(OutputKeys.ENCODING, BLOCK_ENC);
		transformer.transform(new DOMSource(node), new StreamResult(writer));
		return writer.toString();
	}

	/**
	 * UniClassModelを解析して，BockEditorのソースコード形式のxmlNodeを生成する
	 * 
	 * @param classDec
	 *            UniClassModel
	 * @return
	 */
	public Node getSaveNode(UniClassDec classDec) throws RuntimeException {
		try {
			this.document = MyDOMUtil.createDocumentInstance();

			Element documentElement = document.createElementNS(XML_CODEBLOCKS_NS, "cb:CODEBLOCKS");
			documentElement.setAttributeNS(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI, "xsi:schemaLocation", XML_CODEBLOCKS_NS + " " + XML_CODEBLOCKS_SCHEMA_URI);

			BlockClassModel model = (BlockClassModel) visitClassDec(classDec);
			PageModel pageModel = new PageModel(classDec, model.createBlockNodes(document), document);

			List<PageModel> pages = new ArrayList<PageModel>();
			pages.add(pageModel);

			PagesModel pagesModel = new PagesModel(pages, document, new ArrayList<>());

			documentElement.appendChild(pagesModel.getPagesElement());
			document.appendChild(documentElement);

			return document;
		} catch (ParserConfigurationException e) {
			throw new RuntimeException(e);
		}
	}

	public String getSaveString(Node node) throws TransformerException {
		StringWriter writer = new StringWriter();
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(OutputKeys.ENCODING, BLOCK_ENC);
		transformer.transform(new DOMSource(node), new StreamResult(writer));
		return writer.toString();
	}

	/**
	 * UniClassModelを解析して，PageNodeを作成する
	 * 
	 * @param classDec
	 *            UniClassModel
	 * @return
	 */
	public PageModel getPageNode(UniClassDec classDec) throws RuntimeException {
		BlockClassModel model = (BlockClassModel) visitClassDec(classDec);
		PageModel pageModel = new PageModel(classDec, model.createBlockNodes(document), document);

		return pageModel;
	}

	@Override
	public Object visitBoolLiteral(UniBoolLiteral node) {
		String parentId = getParentId();
		return new BlockBooleanLiteralModel(node, document, parentId, ID_COUNTER++, resolver);
	}

	@Override
	public Object visitIntLiteral(UniIntLiteral node) {
		String parentId = getParentId();
		return new BlockIntLiteralModel(String.valueOf(node.value), document, parentId, ID_COUNTER++, resolver);
	}

	@Override
	public Object visitLongLiteral(UniLongLiteral node) {
		return null;
	}

	@Override
	public Object visitDoubleLiteral(UniDoubleLiteral node) {
		String parentId = getParentId();
		return new BlockDoubleLiteralModel(node, document, parentId, ID_COUNTER++, resolver);
	}

	@Override
	public Object visitStringLiteral(UniStringLiteral node) {
		String parentId = getParentId();
		return new BlockStringLiteralModel(node.value, document, parentId, ID_COUNTER++, resolver);
	}

	@Override
	public Object visitIdent(UniIdent node) {
		String parentId = getParentId();
		Node varDecNode = resolver.getVariableNameResolver().getVariableBlockNode(node.name);
		if (varDecNode != null) {
			BlockVariableGetterModel getterModel = new BlockVariableGetterModel(varDecNode, document, ID_COUNTER++);
			BlockPlugModel plugInfo = new BlockPlugModel("", getterModel.getConnectorKind(), "mirror", parentId);
			getterModel.addPlugElement(document, plugInfo);

			return getterModel;
		} else {
			BlockSpecialExpressionModel model = new BlockSpecialExpressionModel(BlockSpecialExpressionModel.SPECIAL_IDENT_GENUS_NAME, node.name, document, ID_COUNTER++, BlockElementModel.BLOCKKINDS.DATA.toString(), parentId);
			return model;
		}
	}

	@Override
	public Object visitArray(UniArray node) {
		return null;
	}

	@Override
	public Object visitFieldAccess(UniFieldAccess node) {
		String genusName = resolver.getForceConvertionMap().getBlockGenusName(node);
		if (genusName != null) {
			BlockExprModel expr = new BlockExprModel();
			expr.setElement(expr.createBlockElement(document, genusName, ID_COUNTER++, BlockElementModel.BLOCKKINDS.DATA.toString()));

			BlockPlugModel plugInfo = new BlockPlugModel(resolver.getPlugElement(expr.getGenusName()), getParentId());
			expr.addPlugElement(document, plugInfo);
			return expr;
		} else {
			BlockFieldAccessModel model = new BlockFieldAccessModel(document, ID_COUNTER++);

			BlockElementModel receiver = visitExpr(node.receiver, String.valueOf(model.getBlockID()));
			BlockElementModel fieldValue = new BlockSpecialExpressionModel(BlockSpecialExpressionModel.SPECIAL_IDENT_GENUS_NAME, node.fieldName, document, ID_COUNTER++, BlockElementModel.BLOCKKINDS.DATA.toString(), String.valueOf(model.getBlockID()));

			// socketノードの作成
			List<Node> socketNodes = resolver.getSocketNodes(model.getGenusName());
			BlockSocketsModel socketsInfo = calcSocketsInfo(socketNodes);
			model.addSocketsAndNodes(Lists.newArrayList(receiver, fieldValue), document, socketsInfo);

			// plugノードの追加
			BlockPlugModel plug = new BlockPlugModel(resolver.getPlugElement(model.getGenusName()), getParentId());
			model.addPlugElement(document, plug);
			return model;
		}
	}

	@Override
	public Object visitMethodCall(UniMethodCall node) {
		String parentId = getParentId();
		if (node.receiver == null) {
			// フィールドメソッド呼び出し，または継承メソッド呼び出し
			Long callerId = ID_COUNTER++;
			List<BlockElementModel> sockets = new ArrayList<BlockElementModel>();
			for (UniExpr arg : node.args) {
				sockets.add(visitExpr(arg, String.valueOf(callerId)));
			}
			return createMethodCallModel(superClass, node.methodName, sockets, document, callerId, parentId);
		} else {
			String genusName = resolver.getForceConvertionMap().getBlockGenusName(node);
			if (genusName != null) {
				// ライブラリメソッドの作成
				Long callerId = ID_COUNTER++;
				List<BlockElementModel> sockets = parseArgs(node.args, String.valueOf(callerId));
				return createMethodCallModel(genusName, callerId, sockets, document, parentId);
			} else {
				// ident.nodeの作成
				return createExMethodCallModel(node, document, parentId);
			}
		}
	}

	public BlockElementModel visitExpr(UniExpr expr, String parentId) {
		idStack.push(parentId);
		return (BlockElementModel) visitExpr(expr);
	}

	public List<BlockElementModel> parseArgs(List<UniExpr> args, String parentId) {
		List<BlockElementModel> sockets = new ArrayList<BlockElementModel>();
		for (UniExpr arg : args) {
			sockets.add(visitExpr(arg, parentId));
		}
		return sockets;
	}

	@Override
	public Object visitNew(UniNew node) {
		Long id = ID_COUNTER++;
		String parentId = getParentId();
		List<BlockElementModel> socketModels = parseArgs(node.args, String.valueOf(id));

		BlockElementModel model = new BlockNewModel(node, socketModels, parentId, document, id, resolver);

		List<Node> socketNodes = resolver.getSocketNodes(model.getGenusName());
		BlockSocketsModel socketsInfo = calcSocketsInfo(socketNodes);
		model.addSocketsAndNodes(socketModels, document, socketsInfo);

		return model;
	}

	@Override
	public Object visitNewArray(UniNewArray node) {
		return null;
	}

	@Override
	public Object visitUnaryOp(UniUnaryOp node) {
		String parentId = getParentId();
		// !,++,--,+,-
		if ("!".equals(node.operator)) {
			Long notOpID = ID_COUNTER++;
			BlockElementModel value = visitExpr(node.expr, String.valueOf(notOpID));

			BlockNotOperatorModel model = new BlockNotOperatorModel(document, notOpID, (BlockExprModel) value);

			List<BlockElementModel> args = Lists.newArrayList(value);

			List<Node> socketNodes = resolver.getSocketNodes(BlockNotOperatorModel.GENUS_NAME);
			BlockSocketsModel sockets = calcSocketsInfo(socketNodes);

			model.addSocketsAndNodes(args, document, sockets);

			// setPlug
			BlockPlugModel plugInfo = new BlockPlugModel(resolver.getPlugElement(model.getGenusName()), parentId);
			model.addPlugElement(document, plugInfo);

			return model;
		} else if ("_++".equals(node.operator) || "_--".equals(node.operator) || "++_".equals(node.operator) || "--_".equals(node.operator)) {
			String genusName = "setter";
			UniIdent ident = (UniIdent) node.expr;
			String operator = "+";
			if (node.operator.contains("--")) {
				operator = "-";
			}

			Node varDecNode = resolver.getVariableNameResolver().getVariableBlockNode(ident.name);

			if (parentId.equals(PARENT_ID_NULL)) {
				Long id = ID_COUNTER++;
				// i = i+1に変換
				List<Node> socketNodes = resolver.getSocketNodes(MyDOMUtil.getAttribute(varDecNode, BlockElementModel.GENUS_NAME_ATTR));
				BlockSocketsModel sockets = calcSocketsInfo(socketNodes);

				BlockElementModel right = visitExpr(new UniBinOp(operator, new UniIdent(ident.name), new UniIntLiteral(1)), String.valueOf(id));
				List<BlockElementModel> rightElement = new ArrayList<>();
				rightElement.add(right);

				BlockVariableSetterModel model = new BlockVariableSetterModel(document, varDecNode, id);
				model.addSocketsAndNodes(rightElement, document, sockets);

				return model;
			} else {
				// i = i++;
				if (node.operator.equals("_++")) {
					genusName = "postinc";
				} else if (node.operator.equals("_--")) {
					genusName = "postdec";
				} else if (node.operator.equals("++_")) {
					genusName = "preinc";
				} else {
					genusName = "predec";
				}
				return new BlockPrePostModel(document, genusName, varDecNode, ID_COUNTER++);
			}
		} else {
			throw new RuntimeException("not supported unary operator");
		}
	}

	@Override
	public Object visitBinOp(UniBinOp node) {
		String parentId = getParentId();
		if (node.operator.equals("=")) {// 他の二項演算と扱いが別（ソケットが一つのみ）
			return createEqualOperatorModel(node, document);
		} else {
			Long id = ID_COUNTER++;

			BlockElementModel leftBlock = visitExpr(node.left, String.valueOf(id));
			BlockElementModel rightBlock = visitExpr(node.right, String.valueOf(id));

			BlockBinaryOperatorModel binOpModel = new BlockBinaryOperatorModel(document, node.operator, id, leftBlock, rightBlock, resolver);

			// plugの追加
			BlockPlugModel plugInfo = new BlockPlugModel(resolver.getPlugElement(binOpModel.getGenusName()), parentId);
			binOpModel.addPlugElement(document, plugInfo);

			// socketの追加
			List<Node> socketNodes = resolver.getSocketNodes(binOpModel.getGenusName());
			BlockSocketsModel sockets = calcSocketsInfo(socketNodes);
			binOpModel.addSocketsAndNodes(Lists.newArrayList(leftBlock, rightBlock), document, sockets);

			return binOpModel;
		}
	}

	public boolean isParamNode(Node node) {
		return MyDOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR).startsWith("proc-param");
	}

	public BlockElementModel createEqualOperatorModel(UniBinOp binopExpr, Document document) {
		if (binopExpr.left instanceof UniIdent) {
			UniIdent ident = (UniIdent) binopExpr.left;
			Node varDecNode = resolver.getVariableNameResolver().getVariableBlockNode(ident.name);
			Long id = ID_COUNTER++;

			// 右辺のモデルの生成
			BlockElementModel right = visitExpr(binopExpr.right, String.valueOf(id));
			List<Node> socketNodes = resolver.getSocketNodes(MyDOMUtil.getAttribute(varDecNode, BlockElementModel.GENUS_NAME_ATTR));

			// paramにはソケット情報が無いため，plug情報からソケットモデルを生成する
			if (isParamNode(varDecNode)) {
				String connectorType = BlockElementModel.convertTypeToBlockConnectorType(right.getType());
				BlockSocketModel socket = new BlockSocketModel("", "single", connectorType, connectorType, right.getBlockID());
				socketNodes.add(socket.createBlockConnectorElement(document));
			}

			// ソケット情報を付与して返す
			if (socketNodes != null) {
				BlockSocketsModel sockets = calcSocketsInfo(socketNodes);
				List<BlockElementModel> rightElement = new ArrayList<>();
				rightElement.add(right);

				BlockVariableSetterModel model = new BlockVariableSetterModel(document, varDecNode, id);
				model.addSocketsAndNodes(rightElement, document, sockets);

				return model;
			} else {
				throw new RuntimeException("illegal right element:" + binopExpr.right);
			}
		} else {
			throw new RuntimeException("illegal left op:" + binopExpr.left);
		}
	}

	@Override
	public Object visitTernaryOp(UniTernaryOp node) {
		throw new RuntimeException("not impl at blockeditor");
	}

	@Override
	public Object visitReturn(UniReturn node) {
		Long id = ID_COUNTER++;
		if (node.value != null) {
			BlockElementModel returnValue = visitExpr(node.value, String.valueOf(id));
			return new BlockReturnModel(document, id, (BlockExprModel) returnValue);
		} else {
			return new BlockReturnModel(document, id, null);
		}
	}

	@Override
	public Object visitBreak(UniBreak node) {
		return new BlockBreakModel(document, ID_COUNTER++);
	}

	@Override
	public Object visitContinue(UniContinue node) {
		return new BlockContinueModel(document, ID_COUNTER++);
	}

	@Override
	public Object visitBlock(UniBlock node) {
		Long abstractionBlockId = ID_COUNTER++;
		List<BlockCommandModel> commands = parseBody(document, String.valueOf(abstractionBlockId), node);
		BlockAbstractBlockModel model = new BlockAbstractBlockModel(document, abstractionBlockId);

		BlockSocketsModel socketsInfo = calcSocketsInfo(resolver.getSocketNodes("abstraction"));

		// 抽象化コメントの追加
		if (node.blockLabel != null) {
			model.getBlockElement().appendChild(MyDOMUtil.createElement(BlockElementModel.LABEL_NODE, node.blockLabel, document));
			model.setCollapsed(node.blockLabel, document);
		}

		model.addSocketsAndNodes(Lists.transform(commands, new Function<BlockCommandModel, BlockElementModel>() {
			@Override
			public BlockElementModel apply(BlockCommandModel input) {
				return input;
			}
		}), document, socketsInfo);

		return model;

	}

	public List<BlockCommandModel> parseBody(UniExpr statement) throws RuntimeException {
		String parentId = getParentId();
		if (statement == null) {
			return new ArrayList<>(); // can be Collections.emptyList();
		}

		if (!(statement instanceof UniBlock)) {
			return Lists.newArrayList((BlockCommandModel) visitExpr(statement));
		}

		UniBlock statementBlock = (UniBlock) statement;

		// bodyを辿ってモデル作成
		List<BlockCommandModel> blocks = new ArrayList<>();
		String beforeId = parentId;
		if (statementBlock.body != null) {
			for (int i = 0; i < statementBlock.body.size(); i++) {
				UniExpr expr = statementBlock.body.get(i);
				BlockElementModel command = (BlockElementModel) visitExpr(expr);

				// statement以外は弾く
				if (!(command instanceof BlockCommandModel)) {
					throw new RuntimeException("cant use the expression" + expr.toString());
				}

				command.addBeforeBlockNode(document, beforeId);

				if (i + 1 < statementBlock.body.size()) {
					command.addAfterBlockNode(document, String.valueOf(ID_COUNTER));
					beforeId = command.getBlockElement().getAttribute(BlockElementModel.ID_ATTR);
				}

				blocks.add((BlockCommandModel) command);
			}
		}
		return blocks;
	}

	@Override
	public Object visitIf(UniIf node) {
		// //BlockModelのifモデルを作成する．（Xml Element）
		BlockIfModel ifBlockModel = new BlockIfModel(document, ID_COUNTER++);
		ifBlockModel.setElement(ifBlockModel.getElement());

		// Universal Modelの条件式，真ブロック式，偽ブロック式をそれぞれ解析し，BlockModel（xml
		// Element）を作成する
		BlockElementModel socket = visitExpr(node.cond, ifBlockModel.getBlockID());
		List<BlockCommandModel> trueBlock = parseBody(document, MyDOMUtil.getAttribute(ifBlockModel.getElement(), BlockElementModel.ID_ATTR), node.trueStatement);
		List<BlockCommandModel> falseBlock = parseBody(document, MyDOMUtil.getAttribute(ifBlockModel.getElement(), BlockElementModel.ID_ATTR), node.falseStatement);

		// if式のソケット情報を付与
		addIfSocketInfo(document, ifBlockModel, socket, trueBlock, falseBlock);

		ifBlockModel.setTrueBlocks(trueBlock);
		ifBlockModel.setFalseBlocks(falseBlock);

		return ifBlockModel;
	}

	public void addIfSocketInfo(Document document, BlockIfModel model, BlockElementModel socket, List<BlockCommandModel> trueBlock, List<BlockCommandModel> falseBlock) {

		List<BlockElementModel> blockSockets = new ArrayList<>();

		blockSockets.add(socket);

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

		List<Node> ifSocketNodes = resolver.getSocketNodes(BlockIfModel.GENUS_NAME);
		BlockSocketsModel socketsInfo = calcSocketsInfo(ifSocketNodes);

		// ソケットの出力
		model.addSocketsAndNodes(blockSockets, document, socketsInfo);
	}

	@Override
	public Object visitFor(UniFor node) {
		UniBlock forBlock = new UniBlock(new ArrayList<>(), "for");
		if (node.init != null) {
			forBlock.body.add(node.init);
		}

		UniBlock block = (UniBlock) node.statement;

		if (block == null || block.body == null) {
			block = new UniBlock(new ArrayList<>(), null);
		}

		if (node.step != null) {
			block.body.add(node.step);
		}

		UniWhile whileModel = new UniWhile(node.cond, block);

		forBlock.body.add(whileModel);

		return visitExpr(forBlock);
	}

	@Override
	public Object visitWhile(UniWhile node) {
		BlockWhileModel model = new BlockWhileModel(document, ID_COUNTER++);

		BlockElementModel socket = visitExpr(node.cond, model.getBlockID());

		List<BlockCommandModel> trueBlocks = parseBody(document, model.getBlockID(), node.statement);
		model.setTrueBlocks(trueBlocks);

		List<BlockElementModel> blockSockets = new ArrayList<>();
		blockSockets.add(socket);

		if (trueBlocks.size() > 0) {
			blockSockets.add(trueBlocks.get(0));
		} else {
			blockSockets.add(null);
		}
		// genusnameからソケットのラベルとポジションタイプを作成
		List<Node> whileSocketNodes = resolver.getSocketNodes(BlockWhileModel.GENUS_NAME);
		BlockSocketsModel socketsInfo = calcSocketsInfo(whileSocketNodes);

		model.addSocketsAndNodes(blockSockets, document, socketsInfo);

		return model;
	}

	public List<BlockCommandModel> parseBody(Document document, String parentId, UniExpr statement) throws RuntimeException {
		if (statement == null) {
			return new ArrayList<>(); // can be Collections.emptyList();
		}

		if (!(statement instanceof UniBlock)) {
			statement = new UniBlock(Lists.newArrayList(statement), "");
		}

		UniBlock statementBlock = (UniBlock) statement;

		// bodyを辿ってモデル作成
		List<BlockCommandModel> blocks = new ArrayList<>();
		String beforeId = parentId;
		if (statementBlock.body != null) {
			for (int i = 0; i < statementBlock.body.size(); i++) {
				UniExpr expr = statementBlock.body.get(i);
				BlockElementModel command = (BlockElementModel) visitExpr(expr);

				command.addBeforeBlockNode(document, beforeId);

				if (i + 1 < statementBlock.body.size()) {
					command.addAfterBlockNode(document, String.valueOf(ID_COUNTER));
					beforeId = command.getBlockElement().getAttribute(BlockElementModel.ID_ATTR);
				}

				blocks.add((BlockCommandModel) command);
			}
		}
		return blocks;
	}

	@Override
	public Object visitDoWhile(UniDoWhile node) {
		Long whileBlockId = ID_COUNTER++;
		BlockElementModel socket = visitExpr(node.cond, String.valueOf(whileBlockId));
		List<BlockCommandModel> trueBlocks = parseBody(document, String.valueOf(whileBlockId), node.statement);

		BlockDoWhileModel model = new BlockDoWhileModel(document, whileBlockId, trueBlocks);

		List<BlockElementModel> blockSockets = new ArrayList<>();
		if (trueBlocks.size() > 0) {
			blockSockets.add(trueBlocks.get(0));
		} else {
			blockSockets.add(null);
		}
		blockSockets.add(socket);

		// genusnameからソケットのラベルとポジションタイプを作成
		List<Node> whileSocketNodes = resolver.getSocketNodes(BlockDoWhileModel.GENUS_NAME);
		BlockSocketsModel socketsInfo = calcSocketsInfo(whileSocketNodes);

		// ソケットの出力
		model.addSocketsAndNodes(blockSockets, document, socketsInfo);

		return model;
	}

	public BlockLocalVarDecModel parseVarDec(String type, String name) {
		BlockLocalVarDecModel model = new BlockLocalVarDecModel(type, name, document, resolver, ID_COUNTER++);
		resolver.getVariableNameResolver().addLocalVariable(name, model.getElement());
		return model;
	}

	public List<BlockProcParmModel> parseFunctionArgs(List<UniArg> args, String parent) {
		List<BlockProcParmModel> argModels = new ArrayList<>();
		if (args != null) {
			for (UniArg arg : args) {
				idStack.push(parent);
				argModels.add((BlockProcParmModel) visitArg(arg));
			}
		}
		return argModels;
	}

	@Override
	public Object visitVariableDec(UniVariableDec node) {
		BlockLocalVarDecModel model = parseVarDec(node.type, node.name);
		BlockElementModel initializer = null;
		if (node.value != null) {
			initializer = visitExpr(node.value, model.getBlockID());
		}

		List<Node> socketNodes = resolver.getSocketNodes(model.getBlockElement().getAttribute(BlockElementModel.GENUS_NAME_ATTR));

		BlockSocketsModel sockets = calcSocketsInfo(socketNodes);

		List<BlockElementModel> args = new ArrayList<>();
		if (initializer != null) {
			args.add(initializer);
		}

		model.addSocketsAndNodes(args, document, sockets);

		return model;
	}

	@Override
	public Object visitFieldDec(UniFieldDec node) {
		BlockFieldVarDecModel blockModel = new BlockFieldVarDecModel(node.type, node.name, document, resolver, ID_COUNTER++);
		BlockElementModel initializer = null;
		if (node.value != null) {
			initializer = visitExpr(node.value, blockModel.getBlockID());
		}

		List<Node> socketNodes = resolver.getSocketNodes(blockModel.getElement().getAttribute(BlockElementModel.GENUS_NAME_ATTR));

		BlockSocketsModel sockets = calcSocketsInfo(socketNodes);

		List<BlockElementModel> args = new ArrayList<>();
		if (initializer != null) {
			args.add(initializer);
		}
		blockModel.addSocketsAndNodes(args, document, sockets);

		resolver.getVariableNameResolver().addGlobalVariable(node.name, blockModel.getElement());
		return blockModel;
	}

	@Override
	public Object visitMethodDec(UniMethodDec node) {
		BlockProcedureModel model = new BlockProcedureModel(node, document, ID_COUNTER++);

		// //引数を解析して引数モデルを生成
		List<BlockProcParmModel> args = parseFunctionArgs(node.args, model.getBlockID());

		// メソッドモデルに引数ノードを追加
		model.addSocketsAndNodes(Lists.transform(args, new Function<BlockProcParmModel, BlockElementModel>() {
			@Override
			public BlockElementModel apply(BlockProcParmModel input) {
				return input;
			}
		}), document, null);

		// modifier情報を付与
		model.addModifierNode(document, node.modifiers);

		// TODO 可視状態の追加 コメントが追加されたら即修正すること
		if (node.methodName.equals("main")) {
			model.addInvisibleNode(document, "@invisible");
		}

		List<BlockElementModel> bodyBlocks = new ArrayList<>();
		model.setBodyBlocks(bodyBlocks);
		// funcDec.body ボディのパース
		if (hasBody(node)) {
			model.addAfterBlockNode(document, String.valueOf(ID_COUNTER));
			String beforeId = model.getBlockElement().getAttribute(BlockElementModel.ID_ATTR);
			List<UniExpr> body = node.block.body;
			for (int i = 0; i < body.size(); i++) {
				// expressionの解析 行き掛け順
				BlockElementModel commandBlock = (BlockElementModel) visitExpr(body.get(i));// 木で返す．

				if (i + 1 < body.size()) {
					commandBlock.addAfterBlockNode(document, String.valueOf(ID_COUNTER));
				}

				// 左辺ブロックに直前のブロックのIDを追加する
				commandBlock.addBeforeBlockNode(document, beforeId);

				bodyBlocks.add(commandBlock);
				beforeId = commandBlock.getBlockID();
			}
		}

		resolver.getVariableNameResolver().resetLocalVariables();

		return model;
	}

	public boolean hasBody(UniMethodDec funcDec) {
		if (funcDec.block != null && funcDec.block.body != null && funcDec.block.body.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object visitArg(UniArg node) {
		BlockProcParmModel model = new BlockProcParmModel(node.type, node.name, document, resolver, ID_COUNTER++);

		BlockPlugModel plugInfo = new BlockPlugModel(resolver.getPlugElement(model.getGenusName()), getParentId());
		model.addPlugElement(document, plugInfo);

		resolver.getVariableNameResolver().addLocalVariable(node.name, model.getElement());

		return model;
	}

	public void parseClassMethods(UniClassDec classDec, BlockClassModel model, Document document) throws RuntimeException {
		for (UniMemberDec member : classDec.members) {
			// フィールドメソッドの解析
			if (member instanceof UniMethodDec) {
				UniMethodDec mDec = (UniMethodDec) member;
				ID_COUNTER = resolver.getMehtodResolver().getFieldMethodInfo().getId(BlockMethodCallModel.calcMethodCallGenusName(mDec.methodName, transformArgToString(mDec.args)));
				BlockProcedureModel blockMethodCall = (BlockProcedureModel) visitMethodDec(mDec);
				addLocation(blockMethodCall, document, model.getMethods().size());
				model.addMethod(blockMethodCall);
			}
		}
	}

	public List<String> transformArgToString(List<UniArg> args) {
		if (args == null) {
			return new ArrayList<String>();
		} else {
			return Lists.transform(args, new Function<UniArg, String>() {
				@Override
				public String apply(UniArg input) {
					return input.type;
				}
			});
		}
	}

	public void addLocation(BlockElementModel mDec, Document document, int size) {
		int x = 50 + 200 * size;
		int y = 50;
		if (size % 6 == 0 && size != 0) {
			y = 100 + 200 * (size / 6);
		}

		mDec.addLocationElement(document, Integer.toString(x), Integer.toString(y), mDec.getBlockElement());
	}

	@Override
	public Object visitClassDec(UniClassDec node) {
		if (node.superClass != null && node.superClass.size() > 0) {
			superClass = node.superClass.get(node.superClass.size() - 1);
		}

		BlockClassModel model = new BlockClassModel();

		parseFieldVariable(node, model, document);

		// メソッド呼び出しがユーザ定義メソッドかどうかを識別するため、全メソッドをresolverに一度登録する
		addUserDefineMethodToResolver(node);

		parseClassMethods(node, model, document);

		superClass = "";
		return model;
	}

	public void addUserDefineMethodToResolver(UniClassDec classDec) {
		for (UniMemberDec member : classDec.members) {
			if (member instanceof UniMethodDec) {
				UniMethodDec mDec = (UniMethodDec) member;
				resolver.getMehtodResolver().addFieldMethodInfo(BlockMethodCallModel.calcMethodCallGenusName(mDec.methodName, transformArgToString(mDec.args)), new FieldMethodInfo(mDec.returnType, ID_COUNTER += MAX_AVAIABLE_ID));
			}
		}
	}

	public void parseFieldVariable(UniClassDec classDec, BlockClassModel model, Document document) {
		for (UniMemberDec member : classDec.members) {
			if (member instanceof UniFieldDec) {
				model.addFieldVariable(createBlockFieldVariableDecModel((UniFieldDec) member, document));
			}
		}
	}

	public BlockFieldVarDecModel createBlockFieldVariableDecModel(UniFieldDec member, Document document) {
		UniFieldDec varDec = member;
		BlockFieldVarDecModel blockModel = new BlockFieldVarDecModel(member.type, member.name, document, resolver, ID_COUNTER++);
		BlockElementModel initializer = null;
		if (varDec.value != null) {
			initializer = visitExpr(varDec.value, blockModel.getBlockID());
		}

		List<BlockElementModel> args = Lists.newArrayList(initializer);
		blockModel.addSocketsAndNodes(args, document, calcSocketsInfo(resolver.getSocketNodes(blockModel.getElement().getAttribute(BlockElementModel.GENUS_NAME_ATTR))));

		resolver.getVariableNameResolver().addGlobalVariable(member.name, blockModel.getElement());
		return blockModel;
	}

	public static String calcIdentName(UniExpr expr) {
		if (expr instanceof UniIdent) {
			return ((UniIdent) (expr)).name + ".";
		} else if (expr instanceof UniFieldAccess) {
			return calcIdentName(((UniFieldAccess) (expr)).receiver) + ((UniFieldAccess) (expr)).fieldName + ".";
		} else {
			return "ERR";
		}
	}

	/**
	 * 継承メソッド，ライブラリメソッドコールモデルを作成する
	 * 
	 * @param identifier
	 *            呼び出し元のクラスまたはライブラリの識別子
	 * @param methodName
	 * @param sockets
	 * @param document
	 * @param callerId
	 * @param parent
	 * @return
	 */
	public BlockElementModel createMethodCallModel(String identifier, String methodName, List<BlockElementModel> sockets, Document document, Long callerId, String parent) {
		// メソッドコールモデルを作成する
		List<String> socketTypes = Lists.transform(sockets, new Function<BlockElementModel, String>() {
			@Override
			public String apply(BlockElementModel input) {
				return input.getType();
			}
		});
		String tmpGenusName = BlockMethodCallModel.calcMethodCallGenusName(methodName, socketTypes);
		try {
			if (resolver.getMehtodResolver().getFieldMethodInfo().isFieldMethod(tmpGenusName)) {// フィールドメソッドコール
				return createDefinedMethodCallerModel(methodName, sockets, callerId, document, parent);
			} else {// 継承メソッドorライブラリメソッド
				String genusName = resolver.getMehtodResolver().getMethodGenusName(identifier, tmpGenusName);
				return createMethodCallModel(genusName, callerId, sockets, document, parent);
			}
		} catch (Exception e) {
			// create special
			return createSpecialMethodCallModel(methodName, sockets, document, callerId, parent);
		}
	}

	public BlockElementModel createSpecialMethodCallModel(String methodName, List<BlockElementModel> sockets, Document document, Long callerId, String parentId) {
		String kind = "";

		BlockSocketsModel socketsModel = new BlockSocketsModel(Lists.newArrayList());
		for (BlockElementModel socket : sockets) {
			socketsModel.addSocketInfo(new BlockSocketModel(socket));
		}

		if (parentId != PARENT_ID_NULL) {
			kind = BlockElementModel.BLOCKKINDS.FUNCTION.toString();
			BlockSpecialModel model = new BlockSpecialModel(BlockSpecialModel.GENUS_NAME, methodName, document, callerId, kind, parentId);
			model.addSocketsAndNodes(sockets, document, socketsModel);

			BlockPlugModel plug = new BlockPlugModel("", "poly", "single", parentId);
			model.addPlugElement(document, plug);

			return model;
		} else {
			kind = BlockElementModel.BLOCKKINDS.COMMAND.toString();
			BlockSpecialModel model = new BlockSpecialModel(BlockSpecialModel.GENUS_NAME, methodName, document, callerId, kind, parentId);

			model.addSocketsAndNodes(sockets, document, socketsModel);
			return model;
		}
	}

	public BlockElementModel createDefinedMethodCallerModel(String methodName, List<BlockElementModel> sockets, Long id, Document document, String parent) {
		String genusName = BlockMethodCallModel.calcMethodCallGenusName(methodName, transformToTypeList(sockets));
		String returnType = resolver.getMehtodResolver().getFieldMethodInfo().getReturnType(genusName);
		if ("void".equals(returnType)) {
			// 返り値無しメソッド呼び出しモデルの作成
			BlockUserMethodCallModel model = new BlockUserMethodCallModel(methodName, transformToTypeList(sockets), document, resolver, id);

			model.addSocketsAndNodes(sockets, document, null);
			return model;
		} else {
			BlockUserMethodCallWithReturnModel model = new BlockUserMethodCallWithReturnModel(methodName, transformToTypeList(sockets), document, resolver, id);
			model.addSocketsAndNodes(sockets, document, null);
			BlockPlugModel plug = new BlockPlugModel("", BlockElementModel.convertTypeToBlockConnectorType(model.getType()), "single", parent);
			model.addPlugElement(document, plug);

			return model;
		}
	}

	public List<String> transformToTypeList(List<BlockElementModel> args) {
		return Lists.transform(args, new Function<BlockElementModel, String>() {
			@Override
			public String apply(BlockElementModel input) {
				return input.getType();
			}
		});
	}

	/**
	 * オブジェクトのメソッドコールモデルを作成する
	 * 
	 * @param method
	 *            UniMethodModel（null不可）
	 * @param document
	 *            null不可
	 * @param parent
	 *            null可
	 * @return ExMethodCallModel
	 */
	public BlockElementModel createExMethodCallModel(UniMethodCall method, Document document, String parent) {
		if (parent.equals(PARENT_ID_NULL)) {
			// 返り値無しのメソッド呼び出しモデルの作成
			BlockExCallerModel caller = new BlockExCallerModel(document, ID_COUNTER++);

			BlockExprModel receiverModel = (BlockExprModel) visitExpr(method.receiver, caller.getBlockID());

			Long callerId = ID_COUNTER++;
			List<BlockElementModel> sockets = new ArrayList<BlockElementModel>();
			for (UniExpr arg : method.args) {
				sockets.add(visitExpr(arg, String.valueOf(callerId)));
			}

			// id, methodNameを使って，ライブラリメソッドor他のオブジェクトのフィールドメソッドモデルを生成
			BlockElementModel callMethodModel = createMethodCallModel(receiverModel.getType(), method.methodName, sockets, document, callerId, PARENT_ID_NULL);
			callMethodModel.addBeforeBlockNode(document, caller.getBlockID());

			// ソケットノードの作成
			List<Node> socketNodes = resolver.getSocketNodes(caller.getGenusName());
			BlockSocketsModel socketsInfo = calcSocketsInfo(socketNodes);
			caller.addSocketsAndNodes(Lists.newArrayList((BlockElementModel) receiverModel, callMethodModel), document, socketsInfo);

			return caller;
		} else {
			// 返り値ありのメソッド呼び出しモデルの作成
			BlockExCallGetterModel caller = new BlockExCallGetterModel(document, ID_COUNTER++);
			Long callerId = ID_COUNTER++;

			List<BlockElementModel> sockets = new ArrayList<BlockElementModel>();
			for (UniExpr arg : method.args) {
				sockets.add(visitExpr(arg, String.valueOf(callerId)));
			}

			BlockElementModel receiverModel = visitExpr(method.receiver, String.valueOf(caller.getBlockID()));
			BlockElementModel callMethodModel = createMethodCallModel(receiverModel.getType(), method.methodName, sockets, document, callerId, caller.getBlockID());

			// socketノードの作成
			List<Node> socketNodes = resolver.getSocketNodes(caller.getGenusName());
			BlockSocketsModel socketsInfo = calcSocketsInfo(socketNodes);
			caller.addSocketsAndNodes(Lists.newArrayList(receiverModel, callMethodModel), document, socketsInfo);
			caller.setCalleMethod(callMethodModel);

			// plugノードの追加
			BlockPlugModel plug = new BlockPlugModel(resolver.getPlugElement(caller.getGenusName()), parent);
			caller.addPlugElement(document, plug);
			return caller;
		}
	}

	/*
	 * ブロック定義ファイルのソケットノードから，ソケット情報を作成する
	 */
	public BlockSocketsModel calcSocketsInfo(List<Node> socketNodes) {
		if (socketNodes == null || socketNodes.size() <= 0) {
			return new BlockSocketsModel(new ArrayList<BlockSocketModel>());
		} else {
			List<BlockSocketModel> sockets = new ArrayList<BlockSocketModel>();
			for (int i = 0; i < socketNodes.size(); i++) {
				String label = MyDOMUtil.getAttributeOrEmpty(socketNodes.get(i), "label");
				String positionType = MyDOMUtil.getAttribute(socketNodes.get(i), "position-type");
				String connectorType = MyDOMUtil.getAttribute(socketNodes.get(i), "connector-type");
				String connectorID = "-1";

				sockets.add(new BlockSocketModel(label, positionType, connectorType, connectorType, connectorID));
			}

			return new BlockSocketsModel(sockets);
		}
	}

	/**
	 * 継承メソッド、またはライブラリメソッドモデルを生成する．
	 * 
	 * @param genusName
	 *            Block名（null不可，予め算出する）
	 * @param id
	 *            Blockのid（null不可）
	 * @param argModels
	 *            null不可
	 * @param document
	 *            null不可
	 * @param parentId
	 *            null可 nullの場合，statementとして判断される
	 * @return BlockMethodCallModelをBlockElementModelとして返す
	 */
	public BlockElementModel createMethodCallModel(String genusName, Long id, List<BlockElementModel> argModels, Document document, String parentId) {
		if (parentId.equals(PARENT_ID_NULL)) {
			// command
			BlockMethodCallModel caller = new BlockMethodCallModel(genusName, document, resolver, id, parentId);

			List<Node> socketNodes = resolver.getSocketNodes(caller.getGenusName());
			BlockSocketsModel socketsInfo = calcSocketsInfo(socketNodes);

			caller.addSocketsAndNodes(argModels, document, socketsInfo);
			return caller;
		} else {
			BlockMethodCallWithReturnModel caller = new BlockMethodCallWithReturnModel(genusName, document, resolver, id, parentId);

			List<Node> socketNodes = resolver.getSocketNodes(caller.getGenusName());
			BlockSocketsModel socketsInfo = calcSocketsInfo(socketNodes);

			caller.addSocketsAndNodes(argModels, document, socketsInfo);

			return caller;
		}

	}

	public List<BlockElementModel> transformToBlockElementModel(List<BlockExprModel> argModels) {
		if (argModels == null) {
			return new ArrayList<BlockElementModel>();
		} else {
			return Lists.transform(argModels, new Function<BlockExprModel, BlockElementModel>() {
				@Override
				public BlockElementModel apply(BlockExprModel input) {
					return input;
				}
			});
		}
	}

	public String getParentId() {
		if (!idStack.isEmpty()) {
			return idStack.pop();
		}
		return PARENT_ID_NULL;
	}

	@Override
	public Object visitCast(UniCast node) {
		Long id = ID_COUNTER++;
		String parentId = getParentId();
		List<BlockElementModel> socketModels = parseArgs(Lists.newArrayList(node.value), String.valueOf(id));

		BlockCastModel model = new BlockCastModel(node, socketModels, parentId, document, id, resolver);

		List<Node> socketNodes = resolver.getSocketNodes(model.getGenusName());
		BlockSocketsModel socketsInfo = calcSocketsInfo(socketNodes);
		model.addSocketsAndNodes(socketModels, document, socketsInfo);
		return model;
	}

	@Override
	public Object visitNamesapce(UniNamespace node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitEmpty(UniEmptyStatement node) {
		BlockElementModel model = new BlockEmptyModel(ID_COUNTER++, document);
		return model;
	}

	public void parse(UniProgram node) throws ParserConfigurationException, TransformerException {
		Element root = createRootNode();
		PagesModel pages = (PagesModel) visitFile(node);

		root.appendChild(pages.getPagesElement());
		out.print(getSaveString(root));

		out.close();
	}

	public static String generateBlockSource(UniProgram node){
		try{
		BlockGenerator gen = new BlockGenerator(null, "blockeditor/blocks/");
		Element root = gen.createRootNode();
		PagesModel pages = (PagesModel) gen.visitFile(node);
		root.appendChild(pages.getPagesElement());

		return gen.getSaveString(root);
		}catch(Exception e){
			e.printStackTrace();
			return "ERR";
		}
	}

	@Override
	public Object visitFile(UniProgram node) {
		try {
			List<PageModel> pages = new ArrayList<>();
			List<String> importStatements = new ArrayList<>();
			for (UniImport importStatement : node.imports) {
				importStatements.add(importStatement.targetName);
			}

			for (UniClassDec dec : node.classes) {
				BlockClassModel model = (BlockClassModel) visitClassDec(dec);
				PageModel page = new PageModel(dec, model.createBlockNodes(document), document);
				pages.add(page);
			}
			return new PagesModel(pages, document, importStatements);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Element createRootNode() throws ParserConfigurationException {
		this.document = MyDOMUtil.createDocumentInstance();
		Element documentElement = document.createElementNS(XML_CODEBLOCKS_NS, "cb:CODEBLOCKS");
		documentElement.setAttributeNS(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI, "xsi:schemaLocation", XML_CODEBLOCKS_NS + " " + XML_CODEBLOCKS_SCHEMA_URI);

		return documentElement;
	}

	@Override
	public Object visitImport(UniImport nodec) {
		return null;
	}

}
