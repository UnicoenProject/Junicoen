package net.unicoen.interpreter;

import java.util.ArrayList;

public class Stack {
	public final String name;
	private ArrayList<Variable> variables;//Variableは基本型用,ArrayはvalueがVariableの配列,StructはvalueがVariableのハッシュマップ
	public final int address;
	
	//引数(variables)あり版も必要
	public Stack(String name, int address) {
		super();
		this.name = name;
		this.variables = new ArrayList<Variable>();
		this.address = address;
	}

	void addVariable(String type, String name, Object value){
		int lastAddress = this.address;
		if(!variables.isEmpty())
		{
			Variable lastVar = variables.get(variables.size()-1);
			lastAddress = lastVar.address;
			lastAddress += lastVar.getByteSize();
		}
		Variable var = new Variable(type,name,value,lastAddress);
		variables.add(var);		
	}
	
	void updateVariable(String name, Object value){
		for(Variable variable : variables){
			if(variable.hasValue(name)){
				variable.setValue(name,value);
			}
		}
	}
	
	void updateVariable(String name, int index, Object value){
		for(Variable variable : variables){
			if(variable.name.equals(name)){
				variable.setValue(index, value);
			}
		}
	}
	
	public final ArrayList<Variable> getVariables() {
		return variables;
	}
}
