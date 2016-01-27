package net.unicoen.parser.blockeditor;

import java.util.HashMap;
import java.util.Map;

public class UniModelData {
	private Map<String, Object> map = new HashMap<>();
	
	public static enum UniModelParameters{
		RECEIVER("receiver"),NAME("name"),TYPE("type"),VALUE("value"),MODIFIERS("modifiers");
		
		private final String text;
		private UniModelParameters(String text){
			this.text = text;
		}
		
		@Override
		public String toString(){
			return this.text;
		}
	}
	
	/**
	 * マップにUniモデルの属性に対する初期化値を追加する
	 * @param key UniModelParametersの列挙キーのいずれか
	 * @param value モデルの初期化値　Object型でputし，利用時にキャストする（キャストエラーに注意）
	 */
	public void add(String key, Object value){
		map.put(key, value);
	}
	
	public Object get(String key){
		return map.get(key);
	}

	
}
