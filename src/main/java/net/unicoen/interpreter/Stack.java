package net.unicoen.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

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

	void addVariable(String type, String name, Object value, int depth){
		int lastAddress = this.address;
		if(!variables.isEmpty())
		{
			Variable lastVar = variables.get(variables.size()-1);
			lastAddress = lastVar.address;
			lastAddress += lastVar.getByteSize();
		}
		Variable var = new Variable(type,name,value,lastAddress,depth);
		variables.add(var);		
	}
	
	void updateVariable(String name, Object value){
		for(ListIterator<Variable> it=variables.listIterator(variables.size()); it.hasPrevious();){
			Variable var = it.previous();//内側のスコープから探すため逆順に探索
			if(var.hasValue(name)){
				var.setValue(name,value);
				break;
			}
		}
	}
		
	public void removeVariables(int depth){
		variables.removeIf(var->{ return depth<=var.depth;});
	}
	
	public final ArrayList<Variable> getVariables() {
		return variables;
	}
}
