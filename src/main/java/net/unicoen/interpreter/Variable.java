package net.unicoen.interpreter;

import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniVariableDec;

public class Variable{
	String type;
	String name;
	Object value;//数値などの組み込み型でなければUniArray,UniCrassDecが考えられる。
	int address;
	public Variable(String type, String name, Object value, int address) {
		super();
		this.type = type;
		this.name = name;
		updateValue(value);
		this.address = address;
	}
	
	//構造体や配列の場合はvalueそのままでなくArrayList<Variable> valuesなど
	public void updateValue(Object value){
		this.value = value;
	}
	public int getByteSize(){
		//処理系依存かもしれないが、リテラルのサイズ、構造体はメンバ変数のsize合計、配列の場合は型*size()などを考慮する必要がある。
		return 4;
	}
}
