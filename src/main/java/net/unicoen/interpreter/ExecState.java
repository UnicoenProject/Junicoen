package net.unicoen.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.unicoen.node.UniNode;
import net.unicoen.node.UniVariableDec;

public class ExecState {
	private UniNode currentExpr;
	private ArrayList<Stack> stacks;
	private final int stackOffset = 0x10000;
	private final Scope global;
	ExecState(){
		global = null;
		stacks = new ArrayList<Stack>();
	}

	public ExecState(Scope global) {
		this.global = global;
		stacks = new ArrayList<Stack>();
	}

	public ExecState make(){
		stacks.clear();
		return makeImple(global);
	}

	private ExecState makeImple(Scope scope){
		if(!hasStack(scope.name)){
			addStack(scope.name);
			if(scope.name.equals("GLOBAL")){
				for(int i=10000;i<20000;++i){
					if(scope.typeOnMemory.containsKey(i)){
						String type = scope.typeOnMemory.get(i);
						Object value = scope.objectOnMemory.get(i);
						Variable variable = new Variable(type, "Heap:"+i, value, i, scope.depth);
						addVariable(scope.name, variable);
					}
				}
			}
		}
		List<String> varList = new ArrayList<String>();
		for(Map.Entry<String, Integer> vars : scope.variableAddress.entrySet()) {
			varList.add(vars.getKey());
		}
		for(String varName : varList){
			if(scope.isFunc(varName))
				continue;
			Object value = scope.get(varName);
			if(value instanceof UniNode)
				continue;
			final String type = scope.variableTypes.get(varName);
			int address = scope.variableAddress.get(varName);
			if(type.contains("[") && type.contains("]")){
				int length = Integer.parseInt(type.substring(type.lastIndexOf("[")+1, type.length()-1));
				List<Object> list = new ArrayList<>();
				int typeSize = CppEngine.sizeofElement(type);
				for(int i=0;i<length;++i){
					Object arrValue = scope.getFromAddress((int)value + i*typeSize);
					list.add(arrValue);
				}
				address = (int) value;
				value = list;
			}
			Variable variable = new Variable(type, varName, value, address, scope.depth);
			addVariable(scope.name, variable);
		}
		if(!scope.children.isEmpty()){
			for(Scope child : scope.children){
				makeImple(child);
			}
		}
		return this;
	}

	//追加
	public void addVariable(String stackName, Variable variable){
		for(int i=stacks.size()-1; 0<=i; --i){
			Stack stack = stacks.get(i);
			if(stack.name.equals(stackName)){
				stack.addVariable(variable);
				break;
			}
		}
	}

	//引数(variables)あり版も必要
	public void addStack(String name){
		if(stacks.isEmpty()){
			Stack stack = new Stack(name,stackOffset);
			stacks.add(stack);
		}
		else{
			Stack lastStack = stacks.get(stacks.size()-1);
			int lastAddress = lastStack.address;
			lastAddress += lastStack.getByteSize();
			if(hasStack(name)){
				for(int i=2;	;++i){
					String indexName = name + "." + i;
					if(!hasStack(indexName)){
						name = indexName;
						break;
					}
				}
			}
			Stack stack = new Stack(name,lastAddress);
			stacks.add(stack);
		}
	}

	public void popStack(){
		stacks.remove(stacks.size()-1);
	}

	//追加
	public void addVariable(String stackName, UniVariableDec decVar, Object value, int depth){
		for(int i=stacks.size()-1; 0<=i; --i){
			Stack stack = stacks.get(i);
			if(stack.name.equals(stackName)){
				stack.addVariable(decVar.type, decVar.name, value, depth);
				break;
			}
		}
	}

	//更新
	public void updateVariable(String stackName, String varName, Object value){
		for(int i=stacks.size()-1; 0<=i; --i){
			Stack stack = stacks.get(i);
			if(stack.name.equals(stackName)){
				stack.updateVariable(varName, value);
				break;
			}
		}
	}

	public void removeVariables(String stackName, int depth){
		if(stackName.equals("main") && depth <2)
			return;
		for(int i=stacks.size()-1; 0<=i; --i){
			Stack stack = stacks.get(i);
			if(stack.name.equals(stackName)){
				stack.removeVariables(depth);
				break;
			}
		}
	}

	public final UniNode getCurrentExpr() {
		return currentExpr;
	}
	public void setCurrentExpr(UniNode expr) {
		this.currentExpr = expr;
	}
	public final ArrayList<Stack> getStacks(){
		return stacks;
	}

	public int getByteSize(){
		int sum = 0;
		for(Stack stack : stacks){
			sum += stack.getByteSize();
		}
		return sum;
	}

	private boolean hasStack(String name){
		for(Stack stack : stacks){
			if(stack.name.equals(name)){
				return true;
			}
		}
		return false;
	}
}