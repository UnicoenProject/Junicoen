package net.unicoen.interpreter;

import java.util.ArrayList;
import java.util.HashMap;

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
			int lastAddress = stacks.get(stacks.size()-1).address;
			lastAddress += stackOffset;
			Stack stack = new Stack(name,lastAddress);
			stacks.add(stack);
		}
	}
	
	//追加
	public void addVariable(String stackName, UniVariableDec decVar,Object value){
		for(Stack stack : stacks){
			if(stack.name.equals(stackName)){
				stack.addVariable(decVar.type, decVar.name, value);
			}
		}
	}
	
	//更新
	public void updateVariable(String stackName, String varName, Object value){
		for(Stack stack : stacks){
			if(stack.name.equals(stackName)){
				stack.updateVariable(varName, value);
			}
		}
	}

	public synchronized UniNode getCurrentExpr() {
		return currentExpr;
	}
	public synchronized void setCurrentExpr(UniNode expr) {
		this.currentExpr = expr;
	}	
}
