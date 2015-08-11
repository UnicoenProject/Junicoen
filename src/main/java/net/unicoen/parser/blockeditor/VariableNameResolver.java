package net.unicoen.parser.blockeditor;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Node;

public class VariableNameResolver {

	private Map<String, Node> globalVariables = new HashMap<String, Node>();
	private Map<String, Node> localVariables = new HashMap<String, Node>();

	public void addGlobalVariable(String name, Node node){
		globalVariables.put(name, node);
	}

	public void addLocalVariable(String name, Node node){
		if(globalVariables.get(name) == null){
			localVariables.put(name, node);
		}else{
			throw new RuntimeException("duplicate variabel name :" + name);
		}
	}

	public Node getLocalVariableID(String name){
		return localVariables.get(name);
	}

	public Node getGlobalVariableID(String name){
		return globalVariables.get(name);
	}

	public void resetLocalVariables(){
		localVariables.clear();
	}

	public Node getVariableNode(String name){
		Node node = localVariables.get(name);
		if(node != null){
			return node;
		}else{
			return globalVariables.get(name);
		}
	}

}
