package net.unicoen.interpreter;

import java.util.ArrayList;

public class Variable{
	public final String type;
	public final String name;
	private Object value;//配列などはArrayList<Variable>として持つ。
	public final int address;
	public final int depth;

	public Variable(String type, String name, Object value, int address, int depth) {
		this.type = type;
		this.name = name;
		this.address = address;
		this.depth = depth;
		setValue(value);
	}

	//構造体や配列の場合はvalueそのままでなくArrayList<Variable> valuesなど
	public final Object getValue() {
		return value;
	}
	public boolean hasValue(String name){
		if(this.name.equals(name))
			return true;

		if(this.value instanceof ArrayList){
			ArrayList<Variable> varArray = (ArrayList<Variable>) this.value;
			for(Variable var : varArray){
				if(var.hasValue(name))
					return true;
			}
		}
		return false;
	}

	public void setValue(Object value) {
		if(value instanceof ArrayList){
			ArrayList<?> varArray = (ArrayList)value;
			ArrayList<Variable> vars = new ArrayList<Variable>();
			for(int i=0;i<varArray.size();++i){
				int lastAddress = this.address;
				if(!vars.isEmpty())
				{
					Variable lastVar = vars.get(vars.size()-1);
					lastAddress = lastVar.address;
					lastAddress += lastVar.getByteSize();
				}
				Object element = varArray.get(i);
				if(element instanceof Variable){//構造体の場合
					Variable tempvar = (Variable)element;
					Variable var = new Variable(tempvar.type, name+"."+tempvar.name, tempvar.value,lastAddress,this.depth);
					vars.add(var);
				}
				else{//配列の場合
					String baseType = type.substring(0,type.lastIndexOf("["));
					Variable var = new Variable(baseType,name+"["+i+"]",element,lastAddress,this.depth);
					vars.add(var);
				}
			}
			this.value = vars;
		}
		else
			this.value = value;//char型は　value=65('a') のようにしたい
	}

	public void setValue(String name, Object value) {
		if(this.name.equals(name)){
			this.value = value;
		}
		else{
			if(this.value instanceof ArrayList){
				ArrayList<Variable> varArray = (ArrayList<Variable>)this.value;
				for(int i=0;i<varArray.size();++i){
					if(varArray.get(i).name.equals(name)){
						varArray.get(i).setValue(name,value);
						break;
					}
				}
			}
		}
	}

	public int getByteSize(){
		if(value instanceof ArrayList){
			ArrayList<Variable> vars = (ArrayList<Variable>) value;
			int size = vars.size();
			return vars.get(size-1).getByteSize() * size;
		}
		//処理系依存かもしれないが、リテラルのサイズ、構造体はメンバ変数のsize合計、配列の場合は型*size()などを考慮する必要がある。
		return CppEngine.sizeof(this.type);//CppEngine.sizeof(this.type);
	}

	@Override
	public String toString() {
		return "Variable [type=" + type + ", name=" + name + ", value=" + value + ", "
				+ "address=" + address + ", depth=" + depth + "]";
	}
}
