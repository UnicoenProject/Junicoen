package net.unicoen.parser.blockeditor;

import java.util.List;
import java.util.function.Consumer;

import org.w3c.dom.Node;

import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniMethodCall;

public class ForceConvertionMap {

	private UniToBlockForceConvertionMap u2bFCMap = new UniToBlockForceConvertionMap();
	private BlockToUniForceConvertionMap b2uFCMap = new BlockToUniForceConvertionMap();

	private static String ITEM_NODE = "Item";
	private static String UNIMODEL_NODE = "UniModel";
	private static String GENUSNAME_NODE = "GenusName";
	private static String UNIMODEL_ATTR = "unimodel";

	public ForceConvertionMap(Node node) {
		initForceConvertionList(node);
	}

	/**
	 * 複数の構文要素からなる式を1つのブロックに無理やり変換するもののリストを作成する
	 * 
	 * @param node
	 *            force_convertion_listのConvertListノード
	 */
	public void initForceConvertionList(Node node) {
		Consumer<Node> addItemToForceConvertionMap = new Consumer<Node>() {
			@Override
			public void accept(Node t) {
				Node uniModelNode = MyDOMUtil.getChildNode(t, UNIMODEL_NODE);
				UniExpr uniModel = (UniExpr) getUniModel(uniModelNode);
				String blockGenusName = MyDOMUtil.getChildNode(t, GENUSNAME_NODE).getTextContent();
				u2bFCMap.put(uniModel, blockGenusName);
				b2uFCMap.put(blockGenusName, uniModel);
			}

			/**
			 * xmlノードに記述した構造化データからUniModelを生成して取得する
			 * 
			 * @param node
			 *            Itemノード
			 * @return Uniモデル
			 */
			public Object getUniModel(Node node) {
				List<Node> modelAttrNodes = MyDOMUtil.getChildNodes(node);

				UniModelData map = new UniModelData();
				// 属性を取得する（mapを作成する）
				for (Node attrNode : modelAttrNodes) {
					String attrName = attrNode.getNodeName();
					map.add(attrName, getAttrObject(attrNode));
				}

				// 取得した属性を元に，Uniモデルを作成する
				return UniModelFactory.createUniExprModel(MyDOMUtil.getAttribute(node, UNIMODEL_ATTR), map);
			}

			/**
			 * 属性ノードをインプットし，InitalizeMapの値を返す（nameならstring文字列，
			 * receiverならunimodel）
			 * 
			 * @param arrtNode
			 *            force_convertion_listのUnimodel以下のノード
			 * @return mapの値
			 */
			public Object getAttrObject(Node attrNode) {
				if (MyDOMUtil.getAttribute(attrNode, UNIMODEL_ATTR) != null) {
					return getUniModel(attrNode);
				} else {
					return attrNode.getTextContent();
				}
			}
		};
		MyDOMUtil.doAnythingToNodeList(node, ITEM_NODE, addItemToForceConvertionMap);
	}

	/**
	 * 強制変換マップに登録されているモデルとcallerが同一モデルかどうかを調べる
	 * 同一モデルかどうかは，モデルのreceiverとメソッド名が一致するかどうかで判断する．
	 * 
	 * @param forceConvertExpression
	 *            強制変換マップに登録されているUniExprモデル
	 * @param caller
	 *            判定対象のUniMethodCallモデル
	 * @return
	 */
	public boolean isSameModel(UniMethodCall forceConvertExpression, UniMethodCall caller) {
		UniExpr receiver = caller.receiver;
		if (receiver.equals(forceConvertExpression.receiver) && caller.methodName.equals(forceConvertExpression.methodName)) {
			return true;
		}
		return false;
	}

	public boolean isSameModel(UniFieldAccess forceConvertExpression, UniFieldAccess accesser) {
		UniExpr receiver = accesser.receiver;
		if (receiver.equals(forceConvertExpression.receiver) && accesser.fieldName.equals(forceConvertExpression.fieldName)) {
			return true;
		}
		return false;
	}

	/**
	 * 強制変換対象メソッドのブロック名を取得する
	 * 
	 * @param methodCall 対象のUniMethodモデル
	 * @return methodCallに対応するブロック名
	 */
	public String getBlockGenusName(UniMethodCall methodCall) {
		for (UniMethodCall caller : u2bFCMap.getMethodMapKey()) {
			if (isSameModel(caller, methodCall)) {
				return u2bFCMap.get(caller);
			}
		}

		return null;
	}

	public String getBlockGenusName(UniFieldAccess fieldAccess) {
		for (UniFieldAccess expr : u2bFCMap.getFieldAccessMapKey()) {
			if (isSameModel(expr, fieldAccess)) {
				return u2bFCMap.get(expr);
			}
		}

		return null;
	}

	public UniMethodCall getUniMethodCallModel(String genusName) {
		UniMethodCall origin = b2uFCMap.getMethodCallModel(genusName);
		if(origin == null){
			return null;
		}
		UniMethodCall model = new UniMethodCall();
		model.args = origin.args;
		model.methodName = origin.methodName;
		model.receiver = origin.receiver;
		return model;
	}
	
	public UniFieldAccess getUniFieldAccessModel(String genusName){
		UniFieldAccess origin = b2uFCMap.getFieldAccessMdel(genusName);
		if(origin == null){
			return null;
		}
		UniFieldAccess model = new UniFieldAccess();
		model.fieldName = origin.fieldName;
		model.receiver = origin.receiver;
		return model;
	}

}
