package net.unicoen.parser.blockeditor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.w3c.dom.Node;

import net.unicoen.node.UniExpr;
import net.unicoen.node.UniMethodCall;

public class ForceConvertionMap {

	private Map<UniMethodCall, String> uniToBlockForceConvertionMap = new HashMap<>();//キー：.メソッド名[param]
//	private Map<String, Object> blockToUniForceConvertionMap = new HashMap<>();//キー：ident.メソッド名[param]
	
	public ForceConvertionMap(Node node){
		initForceConvertionList(node);
	}
	
	/**
	 * 複数の構文要素からなる式を1つのブロックに無理やり変換するもののリストを作成する
	 * @param node force_convertion_listのConvertListノード
	 */
	public void initForceConvertionList(Node node){
		Consumer<Node> addItemToForceConvertionMap = new Consumer<Node>() {
			@Override
			public void accept(Node t) {
				Node uniModelNode = DOMUtil.getChildNode(t, "UniModel");
				UniMethodCall uniModel = (UniMethodCall)getUniModel(uniModelNode);
				String blockGenusName = DOMUtil.getChildNode(t, "GenusName").getTextContent();	
				uniToBlockForceConvertionMap.put(uniModel, blockGenusName);
			}
			/**
			 * 
			 * @param node
			 * @return
			 */
			public Object getUniModel(Node node){
				List<Node> modelAttrNodes = DOMUtil.getChildNodes(node);
				
				UniModelInitializerMap map = new UniModelInitializerMap();
				//属性を取得する（mapを作成する）
				for(Node attrNode : modelAttrNodes){
					String attrName = attrNode.getNodeName();
					map.add(attrName, getAttrObject(attrNode));
				}
				
				//取得した属性を元に，Uniモデルを作成する
				return UniModelFactory.createUniModel(DOMUtil.getAttribute(node, "unimodel"), map);
			}
			
			/**
			 * 属性ノードをインプットし，InitalizeMapの値を返す（nameならstring文字列，receiverならunimodel）
			 * @param arrtNode force_convertion_listのUnimodel以下のノード
			 * @return
			 */
			public Object getAttrObject(Node attrNode){
				if(DOMUtil.getAttribute(attrNode, "unimodel") != null){
					return getUniModel(attrNode);
				}else{
					return attrNode.getTextContent();
				}
			}
		};
		DOMUtil.doAnythingToNodeList(node, "Item", addItemToForceConvertionMap);
	}
	/**
	 * 強制変換対象のメソッドかどうかを判定する 
	 * @param mathodCall 対象のUniMethodモデル
	 * @return 強制変換対象のメソッドかどうか
	 */
	public boolean isForceConvertionMethod(UniMethodCall methodCall){
		UniExpr expr = methodCall.receiver;
		for(UniMethodCall caller : uniToBlockForceConvertionMap.keySet()){
			if(expr.equals(caller.receiver) && methodCall.methodName.equals(caller.methodName)){
				return true;
			}
		}
		return false;
	}
	
	public String getBlockGenusName(UniMethodCall methodCall){
		UniExpr expr = methodCall.receiver;
		for(UniMethodCall caller : uniToBlockForceConvertionMap.keySet()){
			if(expr.equals(caller.receiver) && methodCall.methodName.equals(caller.methodName)){
				return uniToBlockForceConvertionMap.get(caller);
			}
		}
		return null;
	}
}
