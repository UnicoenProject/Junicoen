package net.unicoen.parser.blockeditor;

import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniContinue;
import net.unicoen.node.UniDoWhile;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniFieldDec;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniLongLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNew;
import net.unicoen.node.UniNewArray;
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
import net.unicoen.parser.blockeditor.blockmodel.BlockFieldVarDecModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockIfModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockIntLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockLocalVarDecModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockMethodCallModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockNewModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockNotOperatorModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockPlugModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockPrePostModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockProcParmModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockProcedureModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockReturnModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockSocketModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockSocketsModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockSpecialModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockStringLiteralModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockUserMethodCallModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockUserMethodCallWithReturnModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockVariableGetterModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockVariableSetterModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockWhileModel;
import net.unicoen.parser.blockeditor.blockmodel.PageModel;
import net.unicoen.parser.blockeditor.blockmodel.PagesModel;

public class BlockGenerator {

	/** Name space definition */
	private static String XML_CODEBLOCKS_NS = "http://education.mit.edu/openblocks/ns";

	/** Location of schema */
	private static String XML_CODEBLOCKS_SCHEMA_URI = "http://education.mit.edu/openblocks/codeblocks.xsd";
	private static long INIT_ID_NUM = 1000;
	private static Long MAX_AVAIABLE_ID = (long) 1000;

	private Long ID_COUNTER = INIT_ID_NUM;

	private BlockResolver resolver;

	private Map<String, Element> addedModels = new HashMap<String, Element>();

	private PrintStream out;
	public static String BLOCK_ENC = "UTF-8";

	private String superClass = "";

	public BlockGenerator(PrintStream out, String langdefRootPath) throws SAXException, IOException {
		this.out = out;
		resolver = new BlockResolver(langdefRootPath, false);
	}

	public BlockGenerator(PrintStream out, String langdefRootPath, boolean isTest) throws SAXException, IOException {
		this.out = out;
		resolver = new BlockResolver(langdefRootPath, isTest);
	}

	/*
	 * Unicoenモデルを解析し、xmlファイルを作成し返す
	 */
	public void parse(UniClassDec classDec) throws IOException, RuntimeException {
		// クラス名のxmlファイルを作成する
		addedModels.clear(); // cashクリア

		out.print(getSaveString(classDec));

		out.close();
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

			StringWriter writer = new StringWriter();
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.ENCODING, BLOCK_ENC);
			transformer.transform(new DOMSource(node), new StreamResult(writer));

			return writer.toString();
		} catch (TransformerConfigurationException e) {
			throw new RuntimeException(e);
		} catch (TransformerException e) {
			throw new RuntimeException(e);
		}
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
			Document document = DOMUtil.createDocumentInstance();

			Element documentElement = document.createElementNS(XML_CODEBLOCKS_NS, "cb:CODEBLOCKS");
			documentElement.setAttributeNS(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI, "xsi:schemaLocation", XML_CODEBLOCKS_NS + " " + XML_CODEBLOCKS_SCHEMA_URI);

			BlockClassModel model = parseClass(classDec, document);
			PageModel pageModel = new PageModel(classDec, model.createBlockNodes(document), document);

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

	public BlockClassModel parseClass(UniClassDec classDec, Document document) throws RuntimeException {
		if (classDec.superClass != null && classDec.superClass.size() > 0) {
			superClass = classDec.superClass.get(classDec.superClass.size() - 1);
		}

		BlockClassModel model = new BlockClassModel();

		parseFieldVariable(classDec, model, document);

		// メソッド呼び出しがユーザ定義メソッドかどうかを識別するため、全メソッドをresolverに一度登録する
		addUserDefineMethodToResolver(classDec);

		parseClassMethods(classDec, model, document);

		superClass = "";
		return model;
	}

	public void parseClassMethods(UniClassDec classDec, BlockClassModel model, Document document) throws RuntimeException {
		for (UniMemberDec member : classDec.members) {
			// フィールドメソッドの解析
			if (member instanceof UniMethodDec) {
				UniMethodDec mDec = (UniMethodDec) member;
				ID_COUNTER = resolver.getMehtodResolver().getFieldMethodInfo().getId(BlockMethodCallModel.calcMethodCallGenusName(mDec.methodName, transformArgToString(mDec.args)));
				BlockProcedureModel blockMethodCall = parseFunctionDec(mDec, document);
				addLocation(blockMethodCall, document, model.getMethods().size());
				model.addMethod(blockMethodCall);
			}
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

	public BlockFieldVarDecModel createBlockFieldVariableDecModel(UniFieldDec member, Document document) {
		UniFieldDec varDec = member;
		BlockFieldVarDecModel blockModel = new BlockFieldVarDecModel(member.type, member.name, document, resolver, ID_COUNTER++);
		BlockElementModel initializer = null;
		if (varDec.value != null) {
			initializer = parseExpr(varDec.value, document, blockModel.getBlockID());
		}

		List<Node> socketNodes = resolver.getSocketNodes(blockModel.getElement().getAttribute(BlockElementModel.GENUS_NAME_ATTR));

		BlockSocketsModel sockets = calcSocketsInfo(socketNodes);

		List<BlockElementModel> args = new ArrayList<>();
		if (initializer != null) {
			args.add(initializer);
		} else {
			args.add(null);
		}
		blockModel.addSocketsAndNodes(args, document, sockets);

		resolver.getVariableNameResolver().addGlobalVariable(member.name, blockModel.getElement());
		return blockModel;
	}

	public void parseFieldVariable(UniClassDec classDec, BlockClassModel model, Document document) {
		for (UniMemberDec member : classDec.members) {
			if (member instanceof UniFieldDec) {
				model.addFieldVariable(createBlockFieldVariableDecModel((UniFieldDec) member, document));
			}
		}
	}

	public void addUserDefineMethodToResolver(UniClassDec classDec) {
		for (UniMemberDec member : classDec.members) {
			if (member instanceof UniMethodDec) {
				UniMethodDec mDec = (UniMethodDec) member;
				resolver.getMehtodResolver().addFieldMethodInfo(BlockMethodCallModel.calcMethodCallGenusName(mDec.methodName, transformArgToString(mDec.args)), new FieldMethodInfo(mDec.returnType, ID_COUNTER += MAX_AVAIABLE_ID));
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
					return BlockExprModel.convertParamTypeName(input.type);
				}
			});
		}
	}

	public List<BlockCommandModel> parseBody(Document document, String parentId, UniExpr statement) throws RuntimeException {
		if (statement == null) {
			return new ArrayList<>(); // can be Collections.emptyList();
		}

		if (!(statement instanceof UniBlock)) {
			return Lists.newArrayList((BlockCommandModel) parseExpr(statement, document, parentId));
		}

		UniBlock statementBlock = (UniBlock) statement;

		// bodyを辿ってモデル作成
		List<BlockCommandModel> blocks = new ArrayList<>();
		String beforeId = parentId;
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
					beforeId = command.getBlockElement().getAttribute(BlockElementModel.ID_ATTR);
				}

				blocks.add((BlockCommandModel) command);
			}
		}
		return blocks;
	}

	/*
	 * 関数の解析
	 */
	public BlockProcedureModel parseFunctionDec(UniMethodDec funcDec, Document document) throws RuntimeException {
		BlockProcedureModel model  = new BlockProcedureModel(funcDec, document, ID_COUNTER++);

		// //引数を解析して引数モデルを生成
		List<BlockProcParmModel> args = parseFunctionArgs(document, funcDec.args, model.getBlockID());
		
		//メソッドモデルに引数ノードを追加
		model.addSocketsAndNodes(Lists.transform(args, new Function<BlockProcParmModel, BlockElementModel>() {
			@Override
			public BlockElementModel apply(BlockProcParmModel input) {
				return input;
			}
		}), document, null);
		
		//Locationの追加
		
		//TODO 可視状態の追加 コメントが追加されたら即修正すること
		if(funcDec.methodName.equals("main")){
			model.addInvisibleNode(document, "@invisible");
		}
		
		List<BlockCommandModel> bodyBlocks = new ArrayList<>();
		model.setBodyBlocks(bodyBlocks);
		// funcDec.body ボディのパース
		if (hasBody(funcDec)) {
			model.addAfterBlockNode(document, String.valueOf(ID_COUNTER));
			String beforeId = model.getElement().getAttribute(BlockElementModel.ID_ATTR);
			List<UniExpr> body = funcDec.block.body;
			for (int i = 0; i < body.size(); i++) {
				// expressionの解析 行き掛け順
				BlockElementModel commandBlock = parseExpr(body.get(i), document, null);// 木で返す．

				if (i + 1 < body.size()) {
					commandBlock.addAfterBlockNode(document, String.valueOf(ID_COUNTER));
				}

				// 左辺ブロックに直前のブロックのIDを追加する
				commandBlock.addBeforeBlockNode(document, beforeId);

				bodyBlocks.add((BlockCommandModel) commandBlock);
				beforeId = commandBlock.getBlockID();
			}
		}

		resolver.getVariableNameResolver().resetLocalVariables();

		return model;
	}

	public List<BlockProcParmModel> parseFunctionArgs(Document document, List<UniArg> args, String parent) {
		List<BlockProcParmModel> argModels = new ArrayList<>();
		if (args != null) {
			for (UniArg arg : args) {
				argModels.add(parseFunctionArg(document, arg, parent));
			}
		}
		return argModels;
	}

	public BlockProcParmModel parseFunctionArg(Document document, UniArg arg, String parent) {
		BlockProcParmModel model = new BlockProcParmModel(arg.type, arg.name, document, resolver, ID_COUNTER++);

		BlockPlugModel plugInfo = new BlockPlugModel(resolver.getPlugElement(model.getGenusName()), parent);
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

	public BlockElementModel parseExpr(UniExpr expr, Document document, String parentId) throws RuntimeException {
		BlockElementModel model = null;
		if (expr instanceof UniMethodCall) {
			model = parseMethodCall((UniMethodCall) expr, document, parentId);
		} else if (expr instanceof UniIdent) {
			model = parseIdent((UniIdent) expr, document, parentId);
		} else if (expr instanceof UniStringLiteral) {
			model = parseStringLiteral((UniStringLiteral) expr, document, parentId);
		} else if (expr instanceof UniIntLiteral) {
			model = parseIntLiteral((UniIntLiteral) expr, document, parentId);
		} else if (expr instanceof UniBoolLiteral) {
			model = parseBoolLiteral((UniBoolLiteral) expr, document, parentId);
		} else if (expr instanceof UniDoubleLiteral) {
			model = parseDoubleLiteral((UniDoubleLiteral) expr, document, parentId);
		} else if (expr instanceof UniIf) {
			model = parseIf((UniIf) expr, document, parentId);
		} else if (expr instanceof UniWhile) {
			model = parseWhile((UniWhile) expr, document, parentId);
		} else if (expr instanceof UniBinOp) {
			model = parseBinOp((UniBinOp) expr, document, parentId);
		} else if (expr instanceof UniBreak) {
			model = parseContinueBreak("break", document, parentId);
		} else if (expr instanceof UniContinue) {
			model = parseContinueBreak("continue", document, parentId);
		} else if (expr instanceof UniUnaryOp) {
			model = parseUnaryOperator((UniUnaryOp) expr, document, parentId);
		} else if (expr instanceof UniVariableDec) {
			model = parseVarDec((UniVariableDec) expr, document, parentId);
		} else if (expr instanceof UniArray) {
			throw new RuntimeException("The expr has not been supported yet");
		} else if (expr instanceof UniNewArray) {
			throw new RuntimeException("The expr has not been supported yet");
		} else if (expr instanceof UniLongLiteral) {
			throw new RuntimeException("The expr has not been supported yet");
		} else if (expr instanceof UniReturn) {
			model = parseReturn((UniReturn) expr, document, parentId);
		} else if (expr instanceof UniFieldAccess) {
			throw new RuntimeException("The expr has not been supported yet");
		} else if (expr instanceof UniBlock) {
			model = parseBlock((UniBlock) expr, document, parentId);
		} else if (expr instanceof UniDoWhile) {
			model = parseDoWhile((UniDoWhile) expr, document, parentId);
		} else if (expr instanceof UniFor) {
			model = parseFor((UniFor) expr, document, parentId);
		} else if (expr instanceof UniNew) {
			model = parseNew((UniNew) expr, document, parentId);
		}

		return model;
	}

	public BlockElementModel parseNew(UniNew expr, Document document, String parentID) {
		Long id = ID_COUNTER++;

		List<BlockElementModel> socketModels = new ArrayList<BlockElementModel>();
		for (UniExpr arg : expr.args) {
			socketModels.add(parseExpr(arg, document, String.valueOf(id)));
		}

		BlockElementModel model = new BlockNewModel(expr, socketModels, parentID, document, id, resolver);

		List<Node> socketNodes = resolver.getSocketNodes(model.getGenusName());
		BlockSocketsModel socketsInfo = calcSocketsInfo(socketNodes);
		model.addSocketsAndNodes(socketModels, document, socketsInfo);

		return model;
	}

	public BlockElementModel parseIdent(UniIdent expr, Document document, String parent) {
		Node varDecNode = resolver.getVariableNameResolver().getVariableBlockNode(expr.name);
		if (varDecNode != null) {
			BlockVariableGetterModel getterModel = new BlockVariableGetterModel(varDecNode, document, ID_COUNTER++);
			BlockPlugModel plugInfo = new BlockPlugModel("", getterModel.getConnectorKind(), "mirror", parent);
			getterModel.setPlugElement(document, plugInfo);

			return getterModel;
		} else {
			BlockSpecialModel model = new BlockSpecialModel(expr.name, document, ID_COUNTER++, "data", parent);
			BlockPlugModel plugInfo = new BlockPlugModel("", "object", "mirror", parent);
			model.setPlugElement(document, plugInfo);
			return model;
		}
	}

	public BlockElementModel parseFor(UniFor forExpr, Document document, String parent) {
		// whileをもつ抽象化ブロックを作成して返す
		UniBlock forBlock = new UniBlock(new ArrayList<>(), "for");
		if (forExpr.init != null) {
			forBlock.body.add(forExpr.init);
		}
		UniBlock block = (UniBlock) forExpr.statement;
		if (forExpr.step != null) {
			block.body.add(forExpr.step);
		}

		UniWhile whileModel = new UniWhile(forExpr.cond, forExpr.statement);

		forBlock.body.add(whileModel);

		return parseExpr(forBlock, document, null);
	}

	public BlockElementModel parseDoWhile(UniDoWhile doWhileExpr, Document document, String parentId) {
		Long whileBlockId = ID_COUNTER++;
		BlockElementModel socket = parseExpr(doWhileExpr.cond, document, String.valueOf(whileBlockId));
		List<BlockCommandModel> trueBlocks = parseBody(document, String.valueOf(whileBlockId), doWhileExpr.statement);

		BlockDoWhileModel model = new BlockDoWhileModel(document, whileBlockId, trueBlocks);

		List<BlockElementModel> blockSockets = new ArrayList<>();
		if (trueBlocks.size() > 0) {
			blockSockets.add(trueBlocks.get(0));
		} else {
			blockSockets.add(null);
		}
		blockSockets.add(socket);

		// genusnameからソケットのラベルとポジションタイプを作成
		List<Node> whileSocketNodes = resolver.getSocketNodes("dowhile");
		BlockSocketsModel socketsInfo = calcSocketsInfo(whileSocketNodes);

		// ソケットの出力
		model.addSocketsAndNodes(blockSockets, trueBlocks, document, socketsInfo);

		return model;
	}

	public BlockAbstractBlockModel parseBlock(UniBlock blockExpr, Document document, String parent) throws RuntimeException {
		Long abstractionBlockId = ID_COUNTER++;
		List<BlockCommandModel> commands = parseBody(document, String.valueOf(abstractionBlockId), blockExpr);
		BlockAbstractBlockModel model = new BlockAbstractBlockModel(document, abstractionBlockId);

		BlockSocketsModel socketsInfo = calcSocketsInfo(resolver.getSocketNodes("abstraction"));

		// 抽象化コメントの追加
		if (blockExpr.blockLabel != null) {
			model.setLabel(blockExpr.blockLabel, document);
			model.setCollapsed(blockExpr.blockLabel, document);
		}

		model.addSocketsAndNodes(Lists.transform(commands, new Function<BlockCommandModel, BlockElementModel>() {
			@Override
			public BlockElementModel apply(BlockCommandModel input) {
				return input;
			}
		}), document, socketsInfo);

		return model;
	}

	public BlockElementModel parseReturn(UniReturn returnExpr, Document document, String parent) {
		Long id = ID_COUNTER++;

		BlockElementModel returnValue = parseExpr(returnExpr.value, document, String.valueOf(id));
		if (returnExpr.value != null) {
			return new BlockReturnModel(document, id, (BlockExprModel) returnValue);
		} else {
			return new BlockReturnModel(document, id, null);
		}
	}

	public BlockLocalVarDecModel parseVarDec(UniVariableDec varDec, Document document, String parent) {
		BlockLocalVarDecModel model = parseVarDec(varDec.type, varDec.name, document, parent);
		BlockElementModel initializer = null;
		if (varDec.value != null) {
			initializer = parseExpr(varDec.value, document, model.getBlockID());
		}

		List<Node> socketNodes = resolver.getSocketNodes(model.getElement().getAttribute(BlockElementModel.GENUS_NAME_ATTR));

		BlockSocketsModel sockets = calcSocketsInfo(socketNodes);

		List<BlockElementModel> args = new ArrayList<>();
		if (initializer != null) {
			args.add(initializer);
		} else {
			args.add(null);
		}

		model.addSocketsAndNodes(args, document, sockets);

		return model;
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
				String label = DOMUtil.getAttribute(socketNodes.get(i), "label");
				String positionType = DOMUtil.getAttribute(socketNodes.get(i), "position-type");
				String connectorType = DOMUtil.getAttribute(socketNodes.get(i), "connector-type");
				String connectorID = "-1";

				sockets.add(new BlockSocketModel(label, positionType, connectorType, connectorType, connectorID));
			}

			return new BlockSocketsModel(sockets);
		}
	}

	public BlockLocalVarDecModel parseVarDec(String type, String name, Document document, String parent) {
		BlockLocalVarDecModel model = new BlockLocalVarDecModel(type, name, document, resolver, ID_COUNTER++);
		resolver.getVariableNameResolver().addLocalVariable(name, model.getElement());
		return model;
	}

	public BlockElementModel parseUnaryOperator(UniUnaryOp uniOp, Document document, String parent) {
		// !,++,--,+,-
		if ("!".equals(uniOp.operator)) {
			Long notOpID = ID_COUNTER++;
			BlockElementModel value = parseExpr(uniOp.expr, document, String.valueOf(notOpID));

			BlockNotOperatorModel model = new BlockNotOperatorModel(document, notOpID, (BlockExprModel) value);

			List<BlockElementModel> args = Lists.newArrayList(value);

			List<Node> socketNodes = resolver.getSocketNodes("not");
			BlockSocketsModel sockets = calcSocketsInfo(socketNodes);

			model.addSocketsAndNodes(args, document, sockets);

			// setPlug
			BlockPlugModel plugInfo = new BlockPlugModel(resolver.getPlugElement(model.getGenusName()), parent);
			model.setPlugElement(document, plugInfo);

			return model;
		} else if ("_++".equals(uniOp.operator) || "_--".equals(uniOp.operator) || "++_".equals(uniOp.operator) || "--_".equals(uniOp.operator)) {
			String genusName = "setter";
			UniIdent ident = (UniIdent) uniOp.expr;
			String operator = "+";
			if (uniOp.operator.contains("--")) {
				operator = "-";
			}

			Node varDecNode = resolver.getVariableNameResolver().getLocalVariableBlockNode(ident.name);
			if (varDecNode == null) {
				throw new RuntimeException(ident.name + " is not defined");
			}

			if (parent == null) {
				Long id = ID_COUNTER++;
				// i = i+1に変換
				List<Node> socketNodes = resolver.getSocketNodes(genusName.substring("setter".length(), genusName.length()));
				BlockSocketsModel sockets = calcSocketsInfo(socketNodes);

				BlockElementModel right = parseExpr((new UniBinOp(operator, new UniIdent(ident.name), new UniIntLiteral(1))), document, String.valueOf(id));
				List<BlockElementModel> rightElement = new ArrayList<>();
				rightElement.add(right);

				BlockVariableSetterModel model = new BlockVariableSetterModel(document, varDecNode, id);
				model.addSocketsAndNodes(rightElement, document, sockets);

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
				return new BlockPrePostModel(document, genusName, varDecNode, ID_COUNTER++);
			}
		} else {
			throw new RuntimeException("not supported unary operator");
		}
	}

	public BlockCommandModel parseContinueBreak(String name, Document document, String parent) {
		BlockCommandModel model = new BlockContinueModel(document, ID_COUNTER++);
		return model;
	}

	public BlockElementModel parseBinOp(UniBinOp binopExpr, Document document, String parent) {
		if (binopExpr.operator.equals("=")) {// 他の二項演算と扱いが別（ソケットが一つのみ）
			return createEqualOperatorModel(binopExpr, document);
		} else {
			Long id = ID_COUNTER++;

			BlockElementModel leftBlock = parseExpr(binopExpr.left, document, String.valueOf(id));
			BlockElementModel rightBlock = parseExpr(binopExpr.right, document, String.valueOf(id));

			BlockBinaryOperatorModel binOpModel = new BlockBinaryOperatorModel(document, binopExpr.operator, id, leftBlock, rightBlock, resolver);
			binOpModel.addElement(BlockElementModel.TYPE_NODE, document, resolver.getType(binOpModel.getGenusName()), binOpModel.getBlockElement());

			// plugの追加
			BlockPlugModel plugInfo = new BlockPlugModel(resolver.getPlugElement(binOpModel.getGenusName()), parent);
			binOpModel.setPlugElement(document, plugInfo);

			// socketの追加
			List<Node> socketNodes = resolver.getSocketNodes(binOpModel.getGenusName());
			BlockSocketsModel sockets = calcSocketsInfo(socketNodes);
			binOpModel.addSocketsAndNodes(Lists.newArrayList(leftBlock, rightBlock), document, sockets);

			return binOpModel;
		}
	}

	public BlockElementModel createEqualOperatorModel(UniBinOp binopExpr, Document document) {
		if (binopExpr.left instanceof UniIdent) {
			UniIdent ident = (UniIdent) binopExpr.left;
			Node varDecNode = resolver.getVariableNameResolver().getVariableBlockNode(ident.name);
			Long id = ID_COUNTER++;

			// 右辺のモデルの生成
			BlockElementModel right = parseExpr(binopExpr.right, document, String.valueOf(id));
			List<Node> socketNodes = resolver.getSocketNodes(DOMUtil.getAttribute(varDecNode, BlockElementModel.GENUS_NAME_ATTR));

			// paramにはソケット情報が無いため，plub情報からソケットモデルを生成する
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

	public boolean isParamNode(Node node) {
		return DOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR).startsWith("proc-param");
	}

	public BlockWhileModel parseWhile(UniWhile whileExpr, Document document, String parent) {

		BlockWhileModel model = new BlockWhileModel(document, ID_COUNTER++);

		BlockElementModel socket = parseExpr(whileExpr.cond, document, model.getBlockID());

		List<BlockCommandModel> trueBlocks = parseBody(document, model.getBlockID(), whileExpr.statement);
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

		model.addSocketsAndNodes(blockSockets, trueBlocks, document, socketsInfo);

		return model;
	}

	public BlockLiteralModel parseBoolLiteral(UniBoolLiteral boolexpr, Document document, String parent) {
		return new BlockBooleanLiteralModel(boolexpr, document, parent, ID_COUNTER++, resolver);
	}

	public BlockIfModel parseIf(UniIf ifexpr, Document document, String parent) {
		// //BlockModelのifモデルを作成する．（Xml Element）
		BlockIfModel ifBlockModel = new BlockIfModel(document, ID_COUNTER++);
		ifBlockModel.setElement(ifBlockModel.getElement());

		// Universal Modelの条件式，真ブロック式，偽ブロック式をそれぞれ解析し，BlockModel（xml
		// Element）を作成する
		BlockElementModel socket = parseExpr(ifexpr.cond, document, DOMUtil.getAttribute(ifBlockModel.getElement(), BlockElementModel.ID_ATTR));
		List<BlockCommandModel> trueBlock = parseBody(document, DOMUtil.getAttribute(ifBlockModel.getElement(), BlockElementModel.ID_ATTR), ifexpr.trueStatement);
		List<BlockCommandModel> falseBlock = parseBody(document, DOMUtil.getAttribute(ifBlockModel.getElement(), BlockElementModel.ID_ATTR), ifexpr.falseStatement);

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

		List<Node> ifSocketNodes = resolver.getSocketNodes("ifelse");
		BlockSocketsModel socketsInfo = calcSocketsInfo(ifSocketNodes);

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

	public BlockElementModel parseMethodCall(UniMethodCall method, Document document, String parent) {
		if (method.receiver == null) {
			// フィールドメソッド呼び出し，または継承メソッド呼び出し
			Long callerId = ID_COUNTER++;
			List<BlockElementModel> sockets = new ArrayList<BlockElementModel>();
			for (UniExpr arg : method.args) {
				sockets.add(parseExpr(arg, document, Long.toString(callerId)));
			}

			return createMethodCallModel(superClass, method.methodName, sockets, document, callerId, parent);
		} else {
			String genusName = resolver.getForceConvertionMap().getBlockGenusName(method);
			if (genusName != null) {
				// ライブラリメソッドの作成
				Long callerId = ID_COUNTER++;
				List<BlockElementModel> sockets = parseArgs(method.args, document, Long.toString(callerId));
				return createMethodCallModel(genusName, callerId, sockets, document, parent);
			} else {
				// ident.methodの作成
				return createExMethodCallModel(method, document, parent);
			}
		}
	}

	public List<BlockElementModel> parseArgs(List<UniExpr> args, Document document, String parentId) {
		List<BlockElementModel> sockets = new ArrayList<BlockElementModel>();
		for (UniExpr arg : args) {
			sockets.add(parseExpr(arg, document, parentId));
		}
		return sockets;
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
		System.out.println("create special block : " + methodName);
		String kind = "";

		BlockSocketsModel socketsModel = new BlockSocketsModel(Lists.newArrayList());
		for (BlockElementModel socket : sockets) {
			socketsModel.addSocketInfo(new BlockSocketModel((BlockExprModel) socket));
		}

		if (parentId != null) {
			kind = "function";
			BlockSpecialModel model = new BlockSpecialModel(methodName, document, ID_COUNTER++, kind, parentId);
			model.addSocketsAndNodes(sockets, document, socketsModel);

			BlockPlugModel plug = new BlockPlugModel("", "poly", "single", parentId);
			model.setPlugElement(document, plug);

			return model;
		} else {
			kind = "command";
			BlockSpecialModel model = new BlockSpecialModel(methodName, document, ID_COUNTER++, kind, parentId);

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
			model.setPlugElement(document, plug);

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
		if (parent == null) {
			// 返り値無しのメソッド呼び出しモデルの作成
			BlockExCallerModel caller = new BlockExCallerModel(document, ID_COUNTER++);

			BlockExprModel receiverModel = (BlockExprModel) parseExpr(method.receiver, document, caller.getBlockID());

			Long callerId = ID_COUNTER++;
			List<BlockElementModel> sockets = new ArrayList<BlockElementModel>();
			for (UniExpr arg : method.args) {
				sockets.add(parseExpr(arg, document, Long.toString(callerId)));
			}

			// id, methodNameを使って，ライブラリメソッドor他のオブジェクトのフィールドメソッドモデルを生成
			BlockElementModel callMethodModel = createMethodCallModel(receiverModel.getType(), method.methodName, sockets, document, callerId, caller.getBlockID());

			// モデルにソケットに結合されるモデルを追加
			caller.setCallMethod((BlockCommandModel) callMethodModel);

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
				sockets.add(parseExpr(arg, document, Long.toString(callerId)));
			}

			BlockExprModel receiverModel = (BlockExprModel) parseExpr(method.receiver, document, caller.getBlockID());
			BlockElementModel callMethodModel = createMethodCallModel(receiverModel.getType(), method.methodName, sockets, document, callerId, caller.getBlockID());
			caller.setCalleMethod(callMethodModel);

			// socketノードの作成
			List<Node> socketNodes = resolver.getSocketNodes(caller.getGenusName());
			BlockSocketsModel socketsInfo = calcSocketsInfo(socketNodes);
			caller.addSocketsAndNodes(Lists.newArrayList((BlockElementModel) receiverModel, callMethodModel), document, socketsInfo);

			// plugノードの追加
			BlockPlugModel plug = new BlockPlugModel(resolver.getPlugElement(caller.getGenusName()), parent);
			caller.setPlugElement(document, plug);
			return caller;
		}
	}

	/**
	 * 標準ライブラリのidentifierかどうかを判定する
	 * 
	 * @param UniExpression
	 *            null可
	 * @return identifierかどうかの真偽値
	 */
	public boolean isIdentifier(UniExpr expr) {
		if (expr instanceof UniIdent) {
			UniIdent ident = (UniIdent) expr;
			Node node = resolver.getVariableNameResolver().getVariableBlockNode(ident.name);

			if (node != null) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
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
		BlockMethodCallModel caller = new BlockMethodCallModel(genusName, argModels, document, resolver, id, parentId);

		List<Node> socketNodes = resolver.getSocketNodes(caller.getGenusName());
		BlockSocketsModel socketsInfo = calcSocketsInfo(socketNodes);

		caller.addSocketsAndNodes(argModels, document, socketsInfo);

		Node plugElement = resolver.getPlugElement(caller.getGenusName());
		if (plugElement != null) {
			caller.setPlugElement(document, new BlockPlugModel(plugElement, parentId));
		}

		return caller;
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

}
