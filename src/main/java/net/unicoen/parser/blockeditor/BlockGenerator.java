package net.unicoen.parser.blockeditor;

import java.awt.Point;
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

import net.unicoen.node.CodeGenerator;
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
import net.unicoen.node.UniEnhancedFor;
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

public class BlockGenerator extends CodeGenerator {


	/** Name space definition */
	private static String XML_CODEBLOCKS_NS = "http://education.mit.edu/openblocks/ns";

	/** Location of schema */
	private static String XML_CODEBLOCKS_SCHEMA_URI = "http://education.mit.edu/openblocks/codeblocks.xsd";
	private static long INIT_ID_NUM = 1000;
	private static Long MAX_AVAIABLE_ID = (long) 1000;

	private Long ID_COUNTER = INIT_ID_NUM;

	private BlockResolver resolver;

	public static String BLOCK_ENC = "UTF-8";

	private Document document;
	private Stack<String> idStack = new Stack<>();
	private Stack<Object> createdBlock = new Stack<>();

	public static String PARENT_ID_NULL = "-1";
	
	private MethodResolver methodResolver = new MethodResolver();
	private VariableNameResolver vnResolver = new VariableNameResolver();

	public BlockGenerator(PrintStream out, String langdefRootPath) throws SAXException, IOException {
		super(out);
		resolver = new BlockResolver(langdefRootPath, false);
	}

	public BlockGenerator(PrintStream out, String langdefRootPath, boolean isTest) throws SAXException, IOException {
		super(out);
		resolver = new BlockResolver(langdefRootPath, isTest);
	}
	
	public void generate(Object model) throws TransformerException, ParserConfigurationException{
		if(model instanceof UniProgram){
			generate((UniProgram) model);
		}else if(model instanceof UniClassDec){
			generate((UniClassDec) model);
		}else{
			throw new RuntimeException("should input UniProgram or UniClassDec!");
		}
	}

	public void generate(UniProgram file) throws TransformerException, ParserConfigurationException {
		out.print(createBlockXMLString(getSaveNode(file)));
		out.close();
	}
	
	public void generate(UniClassDec classDec) throws TransformerException, ParserConfigurationException {
		out.print(createBlockXMLString(getSaveNode(classDec)));
		out.close();
	}

	public Node getSaveNode(UniProgram file) throws ParserConfigurationException {
		Element documentElement = createRootNode();
		traverseProgram(file);
		PagesModel pagesModel = (PagesModel) createdBlock.pop();

		documentElement.appendChild(pagesModel.getPagesElement());
		document.appendChild(documentElement);

		return document;
	}
	
	public Node getSaveNode(UniClassDec classDec) throws ParserConfigurationException {
		Element documentElement = createRootNode();

		List<PageModel> pages = new ArrayList<>();
		List<String> importStatements = new ArrayList<>();
		
		traverseClassDec(classDec);
		BlockClassModel model = (BlockClassModel) createdBlock.pop();
		
		PageModel page = new PageModel(classDec, model.createBlockNodes(document), document);
		pages.add(page);
		
		PagesModel pagesModel = new PagesModel(pages, document, importStatements);
		documentElement.appendChild(pagesModel.getPagesElement());
		document.appendChild(documentElement);
		
		return document;
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

	public String getSaveString(Node node) throws TransformerException {
		StringWriter writer = new StringWriter();
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(OutputKeys.ENCODING, BLOCK_ENC);
		transformer.transform(new DOMSource(node), new StreamResult(writer));
		return writer.toString();
	}

	public List<BlockElementModel> parseArgs(List<UniExpr> args, String parentId) {
		List<BlockElementModel> sockets = new ArrayList<BlockElementModel>();
		for (UniExpr arg : args) {
			sockets.add(traverseExprForBlock(arg, parentId));
		}
		return sockets;
	}

	public boolean isParamNode(Node node) {
		return MyDOMUtil.getAttribute(node, BlockElementModel.GENUS_NAME_ATTR).startsWith("proc-param");
	}

	public BlockElementModel createEqualOperatorModel(UniBinOp binopExpr, Document document) {
		if (binopExpr.left instanceof UniIdent) {
			UniIdent ident = (UniIdent) binopExpr.left;
			Node varDecNode = vnResolver.getVariableBlockNode(ident.name);
			Long id = ID_COUNTER++;

			// 右辺のモデルの生成
			BlockElementModel right = traverseExprForBlock(binopExpr.right, String.valueOf(id));
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
				BlockElementModel command = traverseExprForBlock(expr);

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

	public BlockLocalVarDecModel parseVarDec(String type, String name) {
		BlockLocalVarDecModel model = new BlockLocalVarDecModel(type, name, document, resolver, ID_COUNTER++);
		vnResolver.addLocalVariable(name, model.getElement());
		return model;
	}

	public List<BlockProcParmModel> parseFunctionArgs(List<UniArg> args, String parent) {
		List<BlockProcParmModel> argModels = new ArrayList<>();
		if (args != null) {
			for (UniArg arg : args) {
				idStack.push(parent);
				traverseArg(arg);
				argModels.add((BlockProcParmModel) createdBlock.pop());
			}
		}
		return argModels;
	}

	public boolean hasBody(UniMethodDec funcDec) {
		if (funcDec.block != null && funcDec.block.body != null && funcDec.block.body.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void parseClassMethods(UniClassDec classDec, BlockClassModel model, Document document) throws RuntimeException {
		for (UniMemberDec member : classDec.members) {
			// フィールドメソッドの解析
			if (member instanceof UniMethodDec) {
				UniMethodDec mDec = (UniMethodDec) member;
				ID_COUNTER = methodResolver.getFieldMethodInfo().getId(BlockMethodCallModel.calcMethodCallGenusName(mDec.methodName, transformArgToString(mDec.args)));
				
				traverseMethodDec(mDec);
				BlockProcedureModel blockMethodDec = (BlockProcedureModel) createdBlock.pop();
				
				addCommentToMehtodDec(mDec, blockMethodDec, model.getMethods().size());

				model.addMethod(blockMethodDec);
			}
		}
	}
	
	public void addCommentToMehtodDec(UniMethodDec mDec, BlockProcedureModel blockMethodDec, int methodNum){
		if(mDec.comments != null){
			//locationの取得
			String comment = mDec.comments.get(mDec.comments.size()-1);//直近のコメントをメソッドに対するコメントとする
			
			if(AnnotationCommentGetter.getBlockLocationComment(comment) != "no comment" ){
				Point methodLocation = AnnotationCommentGetter.getLocation(AnnotationCommentGetter.getBlockLocationComment(comment));
				blockMethodDec.addLocationElement(document, Integer.toString(methodLocation.x), Integer.toString(methodLocation.y), blockMethodDec.getBlockElement());
			}else{
				addLocation(blockMethodDec, document, methodNum);	
			}
			
			//コメントの付与
			blockMethodDec.addCommentNode(comment, document);
			
			//method visible?
			String visible = AnnotationCommentGetter.getVisible(comment);
			if(!visible.equals(AnnotationCommentGetter.NOT_FOUND)){
				blockMethodDec.addInvisibleNode(document, visible);
				if(MyDOMUtil.getChildNode(blockMethodDec.getBlockElement(), BlockElementModel.COMMENT_NODE) != null){
					MyDOMUtil.getChildNode(blockMethodDec.getBlockElement(), BlockElementModel.COMMENT_NODE).appendChild(document.createElement("Collapsed"));	
				}
			}
			
			//collapsed?
			if(!AnnotationCommentGetter.getOpenClose(comment).equals(AnnotationCommentGetter.NOT_FOUND)){
				blockMethodDec.getBlockElement().appendChild(document.createElement("Collapsed"));	
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

	public void addUserDefineMethodToResolver(UniClassDec classDec) {
		for (UniMemberDec member : classDec.members) {
			if (member instanceof UniMethodDec) {
				UniMethodDec mDec = (UniMethodDec) member;
				methodResolver.addFieldMethodInfo(BlockMethodCallModel.calcMethodCallGenusName(mDec.methodName, transformArgToString(mDec.args)), new FieldMethodInfo(mDec.returnType, ID_COUNTER += MAX_AVAIABLE_ID));
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
		BlockElementModel initializer = varDec.value != null ? initializer = traverseExprForBlock(varDec.value, blockModel.getBlockID()) : null;

		List<BlockElementModel> args = Lists.newArrayList(initializer);
		blockModel.addSocketsAndNodes(args, document, calcSocketsInfo(resolver.getSocketNodes(blockModel.getElement().getAttribute(BlockElementModel.GENUS_NAME_ATTR))));

		vnResolver.addGlobalVariable(member.name, blockModel.getElement());

		//comment
		if(member.comments != null){
			String comment = member.comments.get(member.comments.size()-1);	
			blockModel.addCommentNode(AnnotationCommentGetter.getCommentText(comment), document);
			
			Point location = AnnotationCommentGetter.getLocation(AnnotationCommentGetter.getBlockLocationComment(comment));
			blockModel.addLocationElement(document, String.valueOf(location.x), String.valueOf(location.y), blockModel.getBlockElement());
		}
		
		
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
	public BlockElementModel createMethodCallModel(String methodName, List<BlockElementModel> sockets, Document document, Long callerId, String parent) {
		// メソッドコールモデルを作成する
		List<String> socketTypes = Lists.transform(sockets, new Function<BlockElementModel, String>() {
			@Override
			public String apply(BlockElementModel input) {
				return input.getType();
			}
		});
		String tmpGenusName = BlockMethodCallModel.calcMethodCallGenusName(methodName, socketTypes);
		try {
			if (methodResolver.getFieldMethodInfo().isFieldMethod(tmpGenusName)) {// フィールドメソッドコール
				return createDefinedMethodCallerModel(methodName, sockets, callerId, document, parent);
			} else {// 継承メソッドorライブラリメソッド
				return createMethodCallModel(tmpGenusName, callerId, sockets, document, parent);
			}
		} catch (Exception e) {
			System.out.println("method creation err!" + methodName);
			e.printStackTrace();
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
		String returnType = methodResolver.getFieldMethodInfo().getReturnType(genusName);
		String parentId = String.valueOf(methodResolver.getFieldMethodInfo().getId(genusName));
		if ("void".equals(returnType)) {
			// 返り値無しメソッド呼び出しモデルの作成
			BlockUserMethodCallModel model = new BlockUserMethodCallModel(methodName, transformToTypeList(sockets), document, parentId, id);

			model.addSocketsAndNodes(sockets, document, null);
			return model;
		} else {
			BlockUserMethodCallWithReturnModel model = new BlockUserMethodCallWithReturnModel(methodName, transformToTypeList(sockets), document, parentId, methodResolver.getFieldMethodInfo().getReturnType(genusName), id);
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

			BlockExprModel receiverModel = (BlockExprModel) traverseExprForBlock(method.receiver, caller.getBlockID());

			Long callerId = ID_COUNTER++;
			List<BlockElementModel> sockets = new ArrayList<BlockElementModel>();
			for (UniExpr arg : method.args) {
				sockets.add(traverseExprForBlock(arg, String.valueOf(callerId)));
			}

			// id, methodNameを使って，ライブラリメソッドor他のオブジェクトのフィールドメソッドモデルを生成
			BlockElementModel callMethodModel = createMethodCallModel(method.methodName, sockets, document, callerId, PARENT_ID_NULL);
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
				sockets.add(traverseExprForBlock(arg, String.valueOf(callerId)));
			}

			BlockElementModel receiverModel = traverseExprForBlock(method.receiver, String.valueOf(caller.getBlockID()));
			BlockElementModel callMethodModel = createMethodCallModel(method.methodName, sockets, document, callerId, caller.getBlockID());

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

	/**
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

	public void parse(UniProgram node) throws ParserConfigurationException, TransformerException {
		Element root = createRootNode();
		traverseProgram(node);
		PagesModel pages = (PagesModel) createdBlock.pop();

		root.appendChild(pages.getPagesElement());
		out.print(getSaveString(root));

		out.close();
	}

	public static String generateBlockSource(UniProgram node) {
		try {
			BlockGenerator gen = new BlockGenerator(null, "blockeditor/blocks/", true);
			Element root = gen.createRootNode();
			gen.traverseProgram(node);
			PagesModel pages = (PagesModel) gen.createdBlock.pop();
			root.appendChild(pages.getPagesElement());

			return gen.getSaveString(root);
		} catch (Exception e) {
			e.printStackTrace();
			return "ERR";
		}
	}

	public Element createRootNode() throws ParserConfigurationException {
		this.document = MyDOMUtil.createDocumentInstance();
		Element documentElement = document.createElementNS(XML_CODEBLOCKS_NS, "cb:CODEBLOCKS");
		documentElement.setAttributeNS(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI, "xsi:schemaLocation", XML_CODEBLOCKS_NS + " " + XML_CODEBLOCKS_SCHEMA_URI);

		return documentElement;
	}

	@Override
	public void dontCallTraverseBoolLiteral(UniBoolLiteral node) {
		createdBlock.push(new BlockBooleanLiteralModel(node, document, getParentId(), ID_COUNTER++, resolver));
	}

	@Override
	public void dontCallTraverseIntLiteral(UniIntLiteral node) {
		createdBlock.push(new BlockIntLiteralModel(String.valueOf(node.value), document, getParentId(), ID_COUNTER++, resolver));
	}

	@Override
	public void dontCallTraverseLongLiteral(UniLongLiteral node) {
		createdBlock.push(null);
	}

	@Override
	public void dontCallTraverseDoubleLiteral(UniDoubleLiteral node) {
		createdBlock.push(new BlockDoubleLiteralModel(node, document, getParentId(), ID_COUNTER++, resolver));
	}

	@Override
	public void dontCallTraverseStringLiteral(UniStringLiteral node) {
		createdBlock.push(new BlockStringLiteralModel(node.value, document, getParentId(), ID_COUNTER++, resolver));
	}


	@Override
	public void dontCallTraverseIdent(UniIdent node) {
		Node varDecNode = vnResolver.getVariableBlockNode(node.name);
		if (varDecNode != null) {
			BlockVariableGetterModel getterModel = new BlockVariableGetterModel(varDecNode, document, ID_COUNTER++);
			getterModel.addPlugElement(document, new BlockPlugModel("", getterModel.getConnectorKind(), "mirror", getParentId()));
			createdBlock.push(getterModel);
		} else {
			createdBlock.push(new BlockSpecialExpressionModel(BlockSpecialExpressionModel.SPECIAL_IDENT_GENUS_NAME, node.name, document, ID_COUNTER++, BlockElementModel.BLOCKKINDS.DATA.toString(), getParentId()));
		}
	}

	@Override
	public void dontCallTraverseArray(UniArray node) {
		createdBlock.push(null);
	}

	@Override
	public void dontCallTraverseFieldAccess(UniFieldAccess node) {
		String genusName = resolver.getForceConvertionMap().getBlockGenusName(node);
		if (genusName != null) {
			BlockExprModel expr = new BlockExprModel();
			expr.setElement(expr.createBlockElement(document, genusName, ID_COUNTER++, BlockElementModel.BLOCKKINDS.DATA.toString()));

			expr.addPlugElement(document, new BlockPlugModel(resolver.getPlugElement(expr.getGenusName()), getParentId()));
			createdBlock.push(expr);
		} else {
			BlockFieldAccessModel model = new BlockFieldAccessModel(document, ID_COUNTER++);

			BlockElementModel receiver = traverseExprForBlock(node.receiver, String.valueOf(model.getBlockID()));
			BlockElementModel fieldValue = new BlockSpecialExpressionModel(BlockSpecialExpressionModel.SPECIAL_IDENT_GENUS_NAME, node.fieldName, document, ID_COUNTER++, BlockElementModel.BLOCKKINDS.DATA.toString(), String.valueOf(model.getBlockID()));

			// socketノードの作成
			BlockSocketsModel socketsInfo = calcSocketsInfo(resolver.getSocketNodes(model.getGenusName()));
			model.addSocketsAndNodes(Lists.newArrayList(receiver, fieldValue), document, socketsInfo);

			// plugノードの追加
			model.addPlugElement(document, new BlockPlugModel(resolver.getPlugElement(model.getGenusName()), getParentId()));
			createdBlock.push(model);
		}
	}

	@Override
	public void dontCallTraverseMethodCall(UniMethodCall node) {
		String parentId = getParentId();
		if (node.receiver == null) {
			// フィールドメソッド呼び出し，または継承メソッド呼び出し
			Long callerId = ID_COUNTER++;
			List<BlockElementModel> sockets = parseArgs(node.args, String.valueOf(callerId));

			createdBlock.push(createMethodCallModel(node.methodName, sockets, document, callerId, parentId));
		} else {
			String genusName = resolver.getForceConvertionMap().getBlockGenusName(node);
			if (genusName != null) {
				// ライブラリメソッドの作成
				Long callerId = ID_COUNTER++;
				List<BlockElementModel> sockets = parseArgs(node.args, String.valueOf(callerId));
				createdBlock.push(createMethodCallModel(genusName, callerId, sockets, document, parentId));
			} else {
				// ident.nodeの作成
				createdBlock.push(createExMethodCallModel(node, document, parentId));
			}
		}
	}

	@Override
	public void dontCallTraverseNew(UniNew node) {
		Long id = ID_COUNTER++;
		List<BlockElementModel> socketModels = parseArgs(node.args, String.valueOf(id));

		BlockElementModel model = new BlockNewModel(node, socketModels, getParentId(), document, id, resolver);

		List<Node> socketNodes = resolver.getSocketNodes(model.getGenusName());
		BlockSocketsModel socketsInfo = calcSocketsInfo(socketNodes);
		model.addSocketsAndNodes(socketModels, document, socketsInfo);

		createdBlock.push(model);
	}

	@Override
	public void dontCallTraverseNewArray(UniNewArray node) {
		createdBlock.push(null);
	}

	@Override
	public void dontCallTraverseUnaryOp(UniUnaryOp node) {
		String parentId = getParentId();
		// !,++,--,+,-
		if ("!".equals(node.operator)) {
			Long notOpID = ID_COUNTER++;
			BlockElementModel value = traverseExprForBlock(node.expr, String.valueOf(notOpID));

			BlockNotOperatorModel model = new BlockNotOperatorModel(document, notOpID, (BlockExprModel) value);
			
			List<BlockElementModel> args = Lists.newArrayList(value);

			List<Node> socketNodes = resolver.getSocketNodes(BlockNotOperatorModel.GENUS_NAME);
			BlockSocketsModel sockets = calcSocketsInfo(socketNodes);

			model.addSocketsAndNodes(args, document, sockets);

			// setPlug
			BlockPlugModel plugInfo = new BlockPlugModel(resolver.getPlugElement(model.getGenusName()), parentId);
			model.addPlugElement(document, plugInfo);

			createdBlock.push(model);
		} else if ("_++".equals(node.operator) || "_--".equals(node.operator) || "++_".equals(node.operator) || "--_".equals(node.operator)) {
			UniIdent ident = (UniIdent) node.expr;
			String operator = "+";
			if (node.operator.contains("--")) {
				operator = "-";
			}

			Node varDecNode = vnResolver.getVariableBlockNode(ident.name);

			if (parentId.equals(PARENT_ID_NULL)) {
				Long id = ID_COUNTER++;
				// i = i+1に変換
				List<Node> socketNodes = resolver.getSocketNodes(MyDOMUtil.getAttribute(varDecNode, BlockElementModel.GENUS_NAME_ATTR));
				BlockSocketsModel sockets = calcSocketsInfo(socketNodes);

				BlockElementModel right = traverseExprForBlock(new UniBinOp(operator, new UniIdent(ident.name), new UniIntLiteral(1)), String.valueOf(id));
				List<BlockElementModel> rightElement = Lists.newArrayList(right);

				BlockVariableSetterModel model = new BlockVariableSetterModel(document, varDecNode, id);
				model.addSocketsAndNodes(rightElement, document, sockets);
				createdBlock.push(model);
			} else {
				throw new RuntimeException("not supported unary operator");
			}
		} else {
			throw new RuntimeException("not supported unary operator");
		}
	}

	@Override
	public void dontCallTraverseBinOp(UniBinOp node) {
		String parentId = getParentId();
		if (node.operator.equals("=")) {// 他の二項演算と扱いが別（ソケットが一つのみ）
			createdBlock.push(createEqualOperatorModel(node, document));
		} else {
			Long id = ID_COUNTER++;

			BlockElementModel leftBlock = traverseExprForBlock(node.left, String.valueOf(id));
			BlockElementModel rightBlock = traverseExprForBlock(node.right, String.valueOf(id));

			BlockBinaryOperatorModel binOpModel = new BlockBinaryOperatorModel(document, node.operator, id, leftBlock, rightBlock, resolver);

			// plugの追加
			BlockPlugModel plugInfo = new BlockPlugModel(resolver.getPlugElement(binOpModel.getGenusName()), parentId);
			binOpModel.addPlugElement(document, plugInfo);

			// socketの追加
			List<Node> socketNodes = resolver.getSocketNodes(binOpModel.getGenusName());
			BlockSocketsModel sockets = calcSocketsInfo(socketNodes);
			binOpModel.addSocketsAndNodes(Lists.newArrayList(leftBlock, rightBlock), document, sockets);

			createdBlock.push(binOpModel);
		}
	}

	@Override
	public void dontCallTraverseTernaryOp(UniTernaryOp node) {
		throw new RuntimeException("not supported");
	}

	@Override
	public void dontCallTraverseCast(UniCast node) {
		Long id = ID_COUNTER++;
		List<BlockElementModel> socketModels = parseArgs(Lists.newArrayList(node.value), String.valueOf(id));

		BlockCastModel model = new BlockCastModel(node, socketModels, getParentId(), document, id, resolver);

		List<Node> socketNodes = resolver.getSocketNodes(model.getGenusName());
		BlockSocketsModel socketsInfo = calcSocketsInfo(socketNodes);
		model.addSocketsAndNodes(socketModels, document, socketsInfo);
		createdBlock.push(model);
	}

	@Override
	public void dontCallTraverseReturn(UniReturn node) {
		if (node.value != null) {
			Long id = ID_COUNTER++;
			BlockElementModel returnValue = traverseExprForBlock(node.value, String.valueOf(id));
			createdBlock.push(new BlockReturnModel(document, id, (BlockExprModel) returnValue));
		} else {
			createdBlock.push(new BlockReturnModel(document, ID_COUNTER++, null));
		}
	}

	@Override
	public void dontCallTraverseBreak(UniBreak node) {
		createdBlock.push(new BlockBreakModel(document, ID_COUNTER++));
	}

	@Override
	public void dontCallTraverseContinue(UniContinue node) {
		createdBlock.push(new BlockContinueModel(document, ID_COUNTER++));
	}

	@Override
	public void dontCallTraverseBlock(UniBlock node) {
		Long abstractionBlockId = ID_COUNTER++;
		List<BlockCommandModel> commands = parseBody(document, String.valueOf(abstractionBlockId), node);
		BlockAbstractBlockModel model = new BlockAbstractBlockModel(document, abstractionBlockId);

		BlockSocketsModel socketsInfo = calcSocketsInfo(resolver.getSocketNodes(BlockAbstractBlockModel.GENUS_NAME));

		// 抽象化コメントの追加
		if (node.comments != null) {
			model.getBlockElement().appendChild(MyDOMUtil.createElement(BlockElementModel.LABEL_NODE, node.blockLabel, document));
			model.setCollapsed(node.blockLabel, document);
		}
		
		model.addSocketsAndNodes(Lists.transform(commands, new Function<BlockCommandModel, BlockElementModel>() {
			@Override
			public BlockElementModel apply(BlockCommandModel input) {
				return input;
			}
		}), document, socketsInfo);

		createdBlock.push(model);
	}

	@Override
	public void dontCallTraverseIf(UniIf node) {
		// //BlockModelのifモデルを作成する．（Xml Element）
		BlockIfModel ifBlockModel = new BlockIfModel(document, ID_COUNTER++);
		ifBlockModel.setElement(ifBlockModel.getElement());

		// Universal Modelの条件式，真ブロック式，偽ブロック式をそれぞれ解析し，BlockModel（xml
		// Element）を作成する
		BlockElementModel socket = traverseExprForBlock(node.cond, ifBlockModel.getBlockID());
		List<BlockCommandModel> trueBlock = parseBody(document, MyDOMUtil.getAttribute(ifBlockModel.getElement(), BlockElementModel.ID_ATTR), node.trueStatement);
		List<BlockCommandModel> falseBlock = parseBody(document, MyDOMUtil.getAttribute(ifBlockModel.getElement(), BlockElementModel.ID_ATTR), node.falseStatement);

		// if式のソケット情報を付与
		addIfSocketInfo(document, ifBlockModel, socket, trueBlock, falseBlock);

		ifBlockModel.setTrueBlocks(trueBlock);
		ifBlockModel.setFalseBlocks(falseBlock);

		createdBlock.push(ifBlockModel);
	}

	@Override
	public void dontCallTraverseFor(UniFor node) {
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

		createdBlock.push(traverseExprForBlock(forBlock));
	}

	@Override
	public void dontCallTraverseEnhancedFor(UniEnhancedFor node) {
		throw new RuntimeException("not impled yet");
	}

	@Override
	public void dontCallTraverseWhile(UniWhile node) {
		BlockWhileModel model = new BlockWhileModel(document, ID_COUNTER++);

		BlockElementModel socket = traverseExprForBlock(node.cond, model.getBlockID());
		List<BlockElementModel> blockSockets = Lists.newArrayList(socket);

		List<BlockCommandModel> trueBlocks = parseBody(document, model.getBlockID(), node.statement);
		model.setTrueBlocks(trueBlocks);

		if (trueBlocks.size() > 0) {
			blockSockets.add(trueBlocks.get(0));
		} else {
			blockSockets.add(null);
		}
		// genusnameからソケットのラベルとポジションタイプを作成
		List<Node> whileSocketNodes = resolver.getSocketNodes(BlockWhileModel.GENUS_NAME);
		BlockSocketsModel socketsInfo = calcSocketsInfo(whileSocketNodes);

		model.addSocketsAndNodes(blockSockets, document, socketsInfo);

		createdBlock.push(model);
	}

	@Override
	public void dontCallTraverseDoWhile(UniDoWhile node) {
		Long whileBlockId = ID_COUNTER++;
		BlockElementModel socket = traverseExprForBlock(node.cond, String.valueOf(whileBlockId));
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

		createdBlock.push(model);
	}

	@Override
	public void dontCallTraverseVariableDec(UniVariableDec node) {
		BlockLocalVarDecModel model = parseVarDec(node.type, node.name);
		BlockElementModel initializer = node.value != null ? traverseExprForBlock(node.value, model.getBlockID()) : null;
		List<BlockElementModel> args = initializer != null ? Lists.newArrayList(initializer) : Lists.newArrayList();

		List<Node> socketNodes = resolver.getSocketNodes(model.getBlockElement().getAttribute(BlockElementModel.GENUS_NAME_ATTR));
		BlockSocketsModel sockets = calcSocketsInfo(socketNodes);

		model.addSocketsAndNodes(args, document, sockets);

		createdBlock.push(model);
	}

	@Override
	public void dontCallTraverseEmptyStatement(UniEmptyStatement node) {
		createdBlock.push(new BlockEmptyModel(ID_COUNTER++, document));
	}

	@Override
	public void dontCallTraverseFieldDec(UniFieldDec node) {
		BlockFieldVarDecModel blockModel = new BlockFieldVarDecModel(node.type, node.name, document, resolver, ID_COUNTER++);

		BlockElementModel initializer = node.value != null ? traverseExprForBlock(node.value, blockModel.getBlockID()) : null;
		List<BlockElementModel> args = initializer != null ? Lists.newArrayList(initializer) : Lists.newArrayList();

		List<Node> socketNodes = resolver.getSocketNodes(blockModel.getElement().getAttribute(BlockElementModel.GENUS_NAME_ATTR));
		BlockSocketsModel sockets = calcSocketsInfo(socketNodes);
		blockModel.addSocketsAndNodes(args, document, sockets);

		vnResolver.addGlobalVariable(node.name, blockModel.getElement());

		createdBlock.push(blockModel);
	}

	@Override
	public void dontCallTraverseMethodDec(UniMethodDec node) {
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
				BlockElementModel commandBlock = traverseExprForBlock(body.get(i));// 木で返す．

				if (i + 1 < body.size()) {
					commandBlock.addAfterBlockNode(document, String.valueOf(ID_COUNTER));
				}

				// 左辺ブロックに直前のブロックのIDを追加する
				commandBlock.addBeforeBlockNode(document, beforeId);

				bodyBlocks.add(commandBlock);
				beforeId = commandBlock.getBlockID();
			}
		}

		vnResolver.resetLocalVariables();

		createdBlock.push(model);
	}

	@Override
	public void dontCallTraverseArg(UniArg node) {
		BlockProcParmModel model = new BlockProcParmModel(node.type, node.name, document, resolver, ID_COUNTER++);

		BlockPlugModel plugInfo = new BlockPlugModel(resolver.getPlugElement(model.getGenusName()), getParentId());
		model.addPlugElement(document, plugInfo);

		vnResolver.addLocalVariable(node.name, model.getElement());

		createdBlock.push(model);
	}

	@Override
	public void dontCallTraverseClassDec(UniClassDec node) {
		BlockClassModel model = new BlockClassModel();

		parseFieldVariable(node, model, document);

		// メソッド呼び出しがユーザ定義メソッドかどうかを識別するため、全メソッドをresolverに一度登録する
		addUserDefineMethodToResolver(node);

		parseClassMethods(node, model, document);

		createdBlock.push(model);
	}

	@Override
	public void dontCallTraverseProgram(UniProgram node) {
		try {
			List<PageModel> pages = new ArrayList<>();
			List<String> importStatements = new ArrayList<>();
			if(node.imports != null){
				for (UniImport importStatement : node.imports) {
					importStatements.add(importStatement.targetName);
				}				
			}
			
			if(node.classes != null){
				for (UniClassDec dec : node.classes) {
					traverseClassDec(dec);
					BlockClassModel model = (BlockClassModel) createdBlock.pop();
					PageModel page = new PageModel(dec, model.createBlockNodes(document), document);
					pages.add(page);
				}				
			}

			createdBlock.push(new PagesModel(pages, document, importStatements));
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void dontCallTraverseImport(UniImport node) {
	}

	@Override
	public void dontCallTraverseNamespace(UniNamespace node) {
	}

	public BlockElementModel traverseExprForBlock(UniExpr node, String parentId) {
		traverseExpr(node, parentId);
		return (BlockElementModel) createdBlock.pop();
	}

	public BlockElementModel traverseExprForBlock(UniExpr node) {
		traverseExpr(node);
//		if(node.comments != null){
//			BlockElementModel model = (BlockElementModel) createdBlock.pop();
//			model.addCommentNode(node.afterComment, document);
//			createdBlock.push(model);
//		}
		return (BlockElementModel) createdBlock.pop();
	}

	public void traverseExpr(UniExpr expr, String parentId) {
		idStack.push(parentId);
		traverseExpr(expr);
	}


}
