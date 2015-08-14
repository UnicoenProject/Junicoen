package net.unicoen.parser.blockeditor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniBreak;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniContinue;
import net.unicoen.node.UniDoWhile;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;

public class BlockMapper {

	private VariableNameResolver variableResolver = new VariableNameResolver();
	HashMap<String, Node> map = new HashMap<>();// Blockのidをキー該当ノードをvalueとして全てのBlockNodeを保持する変数
	BlockNameResolver resolver = new BlockNameResolver("ext"  + File.separator + "blocks" + File.separator);

	public UniClassDec parse(File xmlFile) {
		UniClassDec classDec = createProcotypeClassModel(xmlFile);
		// Blockノードの親ノードを取得する
		Node pageBlock = getPageBlocksNode(xmlFile);

		ArrayList<Node> procs = new ArrayList<>();// Blockのidをキー該当ノードをvalueとしてメソッド定義ブロックのBlockNodeを保持する変数
		Map<String, String> methodsReturnTypes = new HashMap<>();// 返り値の型を保持する

		// mapに全てのBlockNodeを,procsに全てのメソッド定義のBlockNodeを保存する
		putAllBlockNodes(pageBlock, procs, methodsReturnTypes);

		List<UniMemberDec> ret = new ArrayList<>();
		for (Node procNode : procs) {
			UniMethodDec d = new UniMethodDec(getChildText(procNode, "Label"), new ArrayList<>(), methodsReturnTypes.get(getAttribute(procNode, "id")), new ArrayList<>(), null);
			d.modifiers.add("public");
			d.args = new ArrayList<>();

			UniBlock body = new UniBlock();

			String nextNodeId = getChildText(procNode, "AfterBlockId");
			if (nextNodeId != null) {
				body = parseBody(map.get(nextNodeId), map);
			}

			d.block = body;
			ret.add(d);
			variableResolver.resetLocalVariables();
		}

		classDec.members = ret;

		return classDec;
	}


	public UniClassDec createProcotypeClassModel(File xmlFile) {
		UniClassDec classDec = new UniClassDec();
		classDec.className = getPageNameFromXML(xmlFile);
		classDec.modifiers = new ArrayList<String>();
		classDec.modifiers.add("");

		return classDec;
	}

	public UniMethodDec createPrototypeMethodDecModel(Node procNode) {
		UniMethodDec d = new UniMethodDec();
		d.methodName = getChildText(procNode, "Label");
		d.modifiers = new ArrayList<>();
		d.modifiers.add("");
		d.returnType = "void";

		return d;
	}

	public void putAllBlockNodes(Node pageBlock, ArrayList<Node> procs, Map<String, String> returnTypes) {
		// xmlのPageの子ノードから，メソッド定義のBlockノードのみを抽出する
		for (Node node : eachChild(pageBlock)) {
			String name = node.getNodeName();
			if (name.startsWith("#")) {
				continue;
			} else if (name.equals("BlockStub")) {
				node = getChildNode(node, "Block");
			}

			String nodeId = getAttribute(node, "id");
			String blockType = getAttribute(node, "genus-name");
			map.put(nodeId, node);
			if ("procedure".equals(blockType)) {
				procs.add(node);
				if (returnTypes.get(nodeId) == null) {
					returnTypes.put(nodeId, "void");
				}
			}

			if ("return".equals(blockType)) {
				Node socketNode = getChildNode(getChildNode(node, "Sockets"), "BlockConnector");
				returnTypes.put(getChildText(node, "ParentMethod"), getSocketType(socketNode));
			}

		}
	}

	public String getSocketType(Node node) {
		String type = "void";
		String id = getAttribute(node, "con-block-id");

		if (id != null) {
			type = getChildText(map.get(id), "Type");
		}

		return type;
	}

	public String getPageNameFromXML(File xmlFile) {
		Document d = toXmlDoc(xmlFile);

		NodeList list = d.getElementsByTagName("Page");
		if (list == null) {
			throw new RuntimeException("page load error!");
		}

		return getAttribute(list.item(0), "page-name");
	}

	private UniBlock parseBody(Node bodyNode, HashMap<String, Node> map) {
		List<UniExpr> body = new ArrayList<>();

		body.add(parseToExpr(bodyNode, map));

		String nextNodeId = getChildText(bodyNode, "AfterBlockId");
		while (true) {
			if (nextNodeId == null)
				break;
			Node next = map.get(nextNodeId);
			// add body
			UniExpr expr = parseToExpr(next, map);
			body.add(expr);
			nextNodeId = getChildText(next, "AfterBlockId");
		}

		UniBlock block = new UniBlock(body);

		return block;
	}

	private UniExpr parseToExpr(Node node, HashMap<String, Node> map) {
		if ("BlockStub".equals(node.getNodeName())) {
			node = BlockMapper.getChildNode(node, "Block");
		}

		String blockKind = getAttribute(node, "kind");
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
	
	private UniExpr parseAbstraction(Node node,HashMap<String, Node> map){
		Node argsNode = getChildNode(node, "Sockets");
		List<UniExpr> args = parseSocket(argsNode, map);

		UniBlock block = (UniBlock) args.get(0);
		block.blockLabel = getChildText(node, "Label");
		
		return block;
	}

	private UniExpr parseLiteral(Node node) {
		String blockGenusName = getAttribute(node, "genus-name");
		if ("number".equals(blockGenusName)) {
			// String num = getChildText(node, "Label");
			UniIntLiteral num = new UniIntLiteral(Integer.parseInt(getChildText(node, "Label")));
			return num;
		} else if ("string".equals(blockGenusName)) {
			UniStringLiteral lit = new UniStringLiteral(getChildText(node, "Label"));
			return lit;
		} else if ("double-number".equals(blockGenusName)) {
			UniDoubleLiteral value = new UniDoubleLiteral(Double.parseDouble(getChildText(node, "Label")));
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
			UniIdent ident = new UniIdent(getChildText(node, "Label"));
			return ident;
		} else if (blockGenusName.startsWith("preinc")) {
			UniUnaryOp op = new UniUnaryOp("++_", new UniIdent(getChildText(node, "Label")));
			return op;
		} else if (blockGenusName.startsWith("predec")) {
			UniUnaryOp op = new UniUnaryOp("--_", new UniIdent(getChildText(node, "Label")));
			return op;
		} else if (blockGenusName.startsWith("postinc")) {
			UniUnaryOp op = new UniUnaryOp("_++", new UniIdent(getChildText(node, "Label")));
			return op;
		} else if (blockGenusName.startsWith("postdec")) {
			UniUnaryOp op = new UniUnaryOp("_--", new UniIdent(getChildText(node, "Label")));
			return op;
		} else {
			throw new RuntimeException("not supported data type:" + blockGenusName);
		}
	}

	private UniExpr parseLocalVariable(Node node, HashMap<String, Node> map) {
		Node initValueNode = getChildNode(node, "Sockets");
		List<UniExpr> initValues = parseSocket(initValueNode, map);
		String blockGenusName = getAttribute(node, "genus-name");
		
		String type = getChildText(resolver.getBlockNode(blockGenusName),"Type");
		String name = getChildText(node, "Label");//TODO should fix later

		variableResolver.addLocalVariable(getChildText(node, "Label"), node);

		if (initValues.get(0) != null && initValues.size() > 0) {
			// 初期値あり
			return new UniVariableDec(null, type, name, initValues.get(0));
		} else {
			return new UniVariableDec(null, type, name, null);
		}
	}

	private UniExpr parseFunction(Node node, HashMap<String, Node> map) {
		Node functionArgsNode = getChildNode(node, "Sockets");
		List<UniExpr> functionArgs = parseSocket(functionArgsNode, map);
		String blockGenusName = getAttribute(node, "genus-name");

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
		} else if(isNewInstanceCreation(blockGenusName)){
			return null;
		} else {
			// MethodCallとする
			//TODO should fix
			UniMethodCall call = new UniMethodCall(null, getChildText(resolver.getBlockNode(blockGenusName), "Name"), functionArgs);
			return call;
		}
	}

	private boolean isNewInstanceCreation(String blockType){
		return blockType.startsWith("new-");
	}

	// private boolean isCast(String blockType) {
	// return true;
	// }

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

	private boolean isUnaryOp(String blockType) {
		if ("not".equals(blockType)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isBinOp(String blockType) {
		if (isEqualsOperator(blockType) || isNotEqualsOperator(blockType) || isLessThanOperator(blockType) || isLessThanOrEqualOperator(blockType) || isGreaterThanOperator(blockType) || isGreaterThanOrEqualOperator(blockType) || "and".equals(blockType) || "or".equals(blockType) || isAddOperator(blockType) || isDifferenceOperator(blockType) || isMulOperator(blockType) || isDivOperator(blockType) || isRemOperator(blockType)) {
			return true;
		} else {
			return false;
		}

	}

	private List<UniExpr> parseSocket(Node argsNode, HashMap<String, Node> map) {
		List<UniExpr> args = new ArrayList<>();
		if (argsNode != null) {
			for (Node argNode : eachChild(argsNode)) {
				assert argNode.getNodeName().equals("BlockConnector");
				String argElemId = getAttribute(argNode, "con-block-id");
				Node realArgNode = map.get(argElemId);
				System.out.println(getChildText(realArgNode, "BeforeBlockId"));
				if (realArgNode != null) {
					// beforeを持たないElementNodeは引数なので，引数の解析
					if (getChildText(realArgNode, "BeforeBlockId") == null) {
						args.add(parseToExpr(realArgNode, map));
					} else {
						args.add(parseBody(realArgNode, map));
					}
				} else {
					// con-block-id がnullの場合は，空
					args.add(null);
				}
			}
		} else {
			args.add(null);
		}
		return args;
	}

	private UniIf parseIfBlock(Node node, HashMap<String, Node> map) {
		Node argsNode = getChildNode(node, "Sockets");
		List<UniExpr> args = parseSocket(argsNode, map);
		UniBlock trueBlock = null;
		UniBlock falseBlock = null;

		if (args.get(1) != null && args.get(1) instanceof UniBlock) {
			trueBlock = (UniBlock) args.get(1);
		}
		if (args.get(2) != null && args.get(2) instanceof UniBlock) {
			falseBlock = (UniBlock) args.get(2);
		}

		return new UniIf(args.get(0), trueBlock, falseBlock);
	}

	private UniExpr parseCommand(Node node, HashMap<String, Node> map) {
		Node argsNode = getChildNode(node, "Sockets");
		List<UniExpr> args = parseSocket(argsNode, map);
		String blockGenusName = getAttribute(node, "genus-name");// ブロックの種類名を取得
		// BlockModelを解析して，UniversalModelを生成する
		String methodName = getChildText(resolver.getBlockNode(blockGenusName), "Name");

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
			if (variableResolver.getVariableNode(methodName) != null || args.size() == 1) {
				// 代入式
				UniBinOp op = new UniBinOp("=", new UniIdent(methodName), args.get(0));
				return op;
			} else {
				throw new RuntimeException("illegal setter");
			}
		} else if(blockGenusName.equals("callActionMethod2")){
			UniIdent ident = (UniIdent)args.get(0);
			UniBlock socketBlock = (UniBlock)args.get(1);
			UniMethodCall caller = (UniMethodCall)socketBlock.body.get(0);

			caller.receiver = ident;

			return caller;
		} else {
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
			UniMethodCall mcall = new UniMethodCall(null, methodName, null);
			return mcall;
		} else {
			throw new RuntimeException("method name is null:" + methodName);
		}
	}

	private static Node getPageBlocksNode(File xmlFile) {
		Document d = toXmlDoc(xmlFile);

		NodeList list = d.getElementsByTagName("PageBlocks");
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

	public static String getAttribute(Node node, String attributeName) {
		assert node != null;
		assert attributeName != null;

		Node attrNode = node.getAttributes().getNamedItem(attributeName);
		if (attrNode == null)
			return null;
		return attrNode.getNodeValue();
	}

	public static Node getChildNode(Node node, String... nodeName) {
		outer: for (int depth = 0; depth < nodeName.length; depth++) {
			for (Node item : eachChild(node)) {
				if (item.getNodeName().equals(nodeName[depth])) {
					node = item;
					continue outer;
				}
			}
			return null;
		}
		return node;
	}

	private static String getChildText(Node node, String... nodeName) {
		Node foundNode = getChildNode(node, nodeName);
		if (foundNode == null)
			return null;

		return foundNode.getTextContent();
	}

	private static Iterable<Node> eachChild(Node node) {
		final NodeList list = node.getChildNodes();
		final int length = list.getLength();
		return new Iterable<Node>() {

			@Override
			public Iterator<Node> iterator() {
				return new Iterator<Node>() {

					private int index = -1;

					@Override
					public Node next() {
						index = nextIndex();
						return list.item(index);
					}

					@Override
					public boolean hasNext() {
						return nextIndex() >= 0;
					}

					private int nextIndex() {
						for (int start = index + 1; start < length; start++) {
							Node node = list.item(start);
							if (node.getNodeName().startsWith("#"))
								continue;
							return start;
						}
						return -1;
					}

					@Override
					public void remove() {
					}
				};
			}
		};
	}
}
