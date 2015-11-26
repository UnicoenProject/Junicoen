package net.unicoen.parser.blockeditor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassMethodMap {

	private Map<String, List<String>> classMethodMap = new HashMap<>();//キー：identifier, 値；genusName
	
	
	public void add(String identifier, List<String> methods){
		List<String> value = classMethodMap.get(identifier);
		if(value == null){
			classMethodMap.put(identifier, methods);
		}else{
			value.addAll(methods);
			classMethodMap.put(identifier, value);
		}
	}
	
	public String getGenusName(String methodName){
		for(String key : classMethodMap.keySet()){
			List<String> methods = classMethodMap.get(key);
			for(String genusName:methods){
				String[] text = genusName.split("-");
				if(text[text.length-1].equals(methodName)){
					return genusName;
				}
			}
		}
		return null;
	}
	
}
