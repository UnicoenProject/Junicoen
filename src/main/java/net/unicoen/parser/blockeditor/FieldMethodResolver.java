package net.unicoen.parser.blockeditor;

import java.util.HashMap;
import java.util.Map;

public class FieldMethodResolver {
	private Map<String, FieldMethodInfo> fieldMethodMap = new HashMap<String, FieldMethodInfo>();//key:methodname[@param], returnType

	public void addUserMethod(String methodNameWithParam, FieldMethodInfo info){
		this.fieldMethodMap.put(methodNameWithParam, info);
	}

	public String getReturnType(String methodNameWithParam){
		return fieldMethodMap.get(methodNameWithParam).getReturnType();
	}

	public Long getId(String methodNameWithParam){
		return fieldMethodMap.get(methodNameWithParam).getId();
	}
}
