package net.unicoen.parser.blockeditor;

import java.util.HashMap;
import java.util.Map;

public class VariableBlockNameResolver {

	private Map<String, String> availableLocalVariableDecralationTypes = new HashMap<>();// key:variabletype,value: genusName
	private Map<String, String> availableFieldVariableDecralationTypes = new HashMap<>();
	private Map<String, String> availableFunctionArgsTypes = new HashMap<>();
	
	public void addAvaiableLocalVariable(String type, String genusName){
		this.availableLocalVariableDecralationTypes.put(type, genusName);
	}
	
	public void addAvaiableFieldVariable(String type, String genusName){
		this.availableFieldVariableDecralationTypes.put(type, genusName);
	}
	
	public void addAvaiableFunctionVariable(String type, String genusName){
		this.availableFunctionArgsTypes.put(type, genusName);
	}
	
	public String getLocalVariableBlockName(String type){
		return availableLocalVariableDecralationTypes.get(type);
	}
	
	public String getFieldVariableBlockName(String type){
		return availableFieldVariableDecralationTypes.get(type);
	}
	
	public String getFunctionVariableBlockName(String type){
		return availableFunctionArgsTypes.get(type);
	}
	
}
