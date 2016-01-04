package net.unicoen.parser.blockeditor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniMethodCall;

public class UniToBlockForceConvertionMap {

	private Map<UniMethodCall, String> methodMap = new HashMap<>();
	private Map<UniFieldAccess, String> fieldAccessMap = new HashMap<>();
	
	public void put(UniExpr expr, String genusName){
		if(expr instanceof UniMethodCall){
			this.methodMap.put((UniMethodCall) expr, genusName);
		}else if(expr instanceof UniFieldAccess){
			this.fieldAccessMap.put((UniFieldAccess) expr, genusName);
		}else{
			throw new RuntimeException("illegal expr model");
		}
	}
	
	public String get(UniMethodCall node){
		return methodMap.get(node);
	}
	
	public String get(UniFieldAccess node){
		return fieldAccessMap.get(node);
	}
	
	public Set<UniMethodCall> getMethodMapKey(){
		return this.methodMap.keySet();
	}
	
	public Set<UniFieldAccess> getFieldAccessMapKey(){
		return this.fieldAccessMap.keySet();
	}

	
}
