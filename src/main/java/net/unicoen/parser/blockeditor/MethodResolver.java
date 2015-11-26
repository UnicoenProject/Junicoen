package net.unicoen.parser.blockeditor;

import java.util.HashMap;
import java.util.Map;

public class MethodResolver {

	private Map<String, ClassMethodMap> avaiableClassMethods = new HashMap<>();//キー：クラス名，値：利用可能メソッド（キー：クラス名，値：ブロックのメソッド名）
	private FieldMethodResolver fieldMethodResolver = new FieldMethodResolver();
	
	/**
	 * クラスが利用可能なメソッドを登録する（キー：クラス名，値：ClassMethodMap（キー：クラス名，値：利用可能メソッド
	 * 
	 * @param className
	 * @param map
	 */
	public void add(String className, ClassMethodMap map) {
		this.avaiableClassMethods.put(className, map);
	}

	/**
	 * クラス名とメソッド名（メソッド名[@param]）からブロックの名前を取得する
	 * @param className
	 * @param methodName
	 */
	public String getMethodGenusName(String className, String methodName) {
		ClassMethodMap map = avaiableClassMethods.get(className);
		if(map == null){
			throw new RuntimeException("Class not found");
		}
		
		return map.getGenusName(methodName);
	}


	public void addFieldMethodInfo(String methodNameWithParam, FieldMethodInfo info){
		this.fieldMethodResolver.addUserMethod(methodNameWithParam, info);
	}

	public FieldMethodResolver getFieldMethodInfo(){
		return this.fieldMethodResolver;
	}
	
}
