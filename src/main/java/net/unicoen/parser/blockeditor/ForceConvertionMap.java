package net.unicoen.parser.blockeditor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.w3c.dom.Node;

import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniMethodCall;

public class ForceConvertionMap {

	private Map<UniExpr, String> uniToBlockForceConvertionMap = new HashMap<>();// キー：.メソッド名[param]
	private Map<String, UniExpr> blockToUniForceConvertionMap = new HashMap<>();// キー：ident.メソッド名[param]

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
	 * @param node force_convertion_listのConvertListノード
	 */
	public void initForceConvertionList(Node node) {
		Consumer<Node> addItemToForceConvertionMap = new Consumer<Node>() {
			@Override
			public void accept(Node t) {
				Node uniModelNode = DOMUtil.getChildNode(t, UNIMODEL_NODE);
				UniMethodCall uniModel = (UniMethodCall) getUniModel(uniModelNode);
				String blockGenusName = DOMUtil.getChildNode(t, GENUSNAME_NODE).getTextContent();
				uniToBlockForceConvertionMap.put(uniModel, blockGenusName);
				blockToUniForceConvertionMap.put(blockGenusName, uniModel);
			}

			/**
			 * xmlノードに記述した構造化データからUniModelを生成して取得する
			 * @param node Itemノード
			 * @return Uniモデル
			 */
			public Object getUniModel(Node node) {
				List<Node> modelAttrNodes = DOMUtil.getChildNodes(node);

				UniModelInitializerMap map = new UniModelInitializerMap();
				// 属性を取得する（mapを作成する）
				for (Node attrNode : modelAttrNodes) {
					String attrName = attrNode.getNodeName();
					map.add(attrName, getAttrObject(attrNode));
				}

				// 取得した属性を元に，Uniモデルを作成する
				return UniModelFactory.createUniModel(DOMUtil.getAttribute(node, UNIMODEL_ATTR), map);
			}

			/**
			 * 属性ノードをインプットし，InitalizeMapの値を返す（nameならstring文字列，
			 * receiverならunimodel）
			 * 
			 * @param arrtNode
			 *            force_convertion_listのUnimodel以下のノード
			 * @return
			 */
			public Object getAttrObject(Node attrNode) {
				if (DOMUtil.getAttribute(attrNode, UNIMODEL_ATTR) != null) {
					return getUniModel(attrNode);
				} else {
					return attrNode.getTextContent();
				}
			}
		};
		DOMUtil.doAnythingToNodeList(node, ITEM_NODE, addItemToForceConvertionMap);
	}
	
	/**
	 * 強制変換マップに登録されているモデルとcallerが同一モデルかどうかを調べる 
	 * 同一モデルかどうかは，モデルのreceiverとメソッド名が一致するかどうかで判断する．
	 * @param forceConvertExpression 強制変換マップに登録されているUniExprモデル
	 * @param caller 判定対象のUniMethodCallモデル
	 * @return
	 */
	public boolean isSameModel(UniExpr forceConvertExpression, UniMethodCall caller) {
		UniExpr receiver = caller.receiver;
		if (forceConvertExpression instanceof UniMethodCall) {
			if (receiver.equals(((UniMethodCall) forceConvertExpression).receiver) && caller.methodName.equals(((UniMethodCall) forceConvertExpression).methodName)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isSameModel(UniExpr forceConvertExpression, UniFieldAccess accesser) {
		UniExpr receiver = accesser.receiver;
		if (forceConvertExpression instanceof UniFieldAccess) {
			if (receiver.equals(((UniMethodCall) forceConvertExpression).receiver) && accesser.fieldName.equals(((UniFieldAccess) forceConvertExpression).fieldName)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 強制変換対象メソッドのブロック名を取得する
	 * 
	 * @param mathodCall 対象のUniMethodモデル
	 * @return methodCallに対応するブロック名
	 */
	public String getBlockGenusName(UniMethodCall methodCall) {
		for (UniExpr caller : uniToBlockForceConvertionMap.keySet()) {
			if (isSameModel(caller, methodCall)) {
				return uniToBlockForceConvertionMap.get(caller);
			}
		}
		
		return null;
	}
	
	public String getBlockGenusName(UniFieldAccess fieldAccess){
		for(UniExpr expr : uniToBlockForceConvertionMap.keySet()){
			if(isSameModel(expr, fieldAccess)){
				return uniToBlockForceConvertionMap.get(expr);
			}
		}
		
		return null;
	}

	public UniExpr getUniMethodCallModel(String genusName) {
		return blockToUniForceConvertionMap.get(genusName);
	}
}
