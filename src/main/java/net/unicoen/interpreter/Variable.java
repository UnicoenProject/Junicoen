package net.unicoen.interpreter;

import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniVariableDec;

public class Variable{
	public final String type;
	public final String name;
	private Object value;//数値などの組み込み型でなければUniArray,UniCrassDecが考えられる。
	public final int address;
	
	public Variable(String type, String name, Object value, int address) {
		this.type = type;
		this.name = name;
		setValue(value);
		this.address = address;
	}
	
	//構造体や配列の場合はvalueそのままでなくArrayList<Variable> valuesなど
	public final Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public int getByteSize(){
		//処理系依存かもしれないが、リテラルのサイズ、構造体はメンバ変数のsize合計、配列の場合は型*size()などを考慮する必要がある。
		return 4;
	}
}
