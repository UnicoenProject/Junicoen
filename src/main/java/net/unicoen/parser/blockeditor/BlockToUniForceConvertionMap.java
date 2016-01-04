package net.unicoen.parser.blockeditor;

import java.util.HashMap;
import java.util.Map;

import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniMethodCall;

public class BlockToUniForceConvertionMap {
	private Map<String, UniMethodCall> methodMap = new HashMap<>();
	private Map<String, UniFieldAccess> fieldAccessMap = new HashMap<>();

	public void put(String genusName, UniExpr node){
		if(node instanceof UniMethodCall){
			this.methodMap.put(genusName, (UniMethodCall)node);	
		}else if(node instanceof UniFieldAccess){
			this.fieldAccessMap.put(genusName, (UniFieldAccess)node);
		}
	}
	
	public UniExpr get(String genusName){
		UniExpr expr = methodMap.get(genusName);
		if(expr != null){
			return expr;
		}else{
			return fieldAccessMap.get(expr);
		}
	}
	
	public UniMethodCall getMethodCallModel(String genusName){
		return methodMap.get(genusName);
	}
	
	public UniFieldAccess getFieldAccessMdel(String genusName){
		return fieldAccessMap.get(genusName);
	}

}
