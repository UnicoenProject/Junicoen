package net.unicoen.interpreter;

import java.util.ArrayList;

import net.unicoen.node.UniNode;
import net.unicoen.node.UniVariableDec;

public class ExecState {
	private UniNode currentExpr;
	private ArrayList<Stack> stacks;
	private final int stackOffset = 0x10000;
	ExecState(){
		stacks = new ArrayList<Stack>();
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