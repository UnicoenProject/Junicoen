package net.unicoen.node;

import java.util.List;

/** 変数宣言＋代入 */
public class UniDecVarWithValue extends UniExpr {
	public List<String> modifiers;
	public String type;
	public String name;
	public UniExpr value;

	public UniDecVarWithValue() {
	}

	public UniDecVarWithValue(List<String> modifiers, String type, String name, UniExpr value) {
		this.modifiers = modifiers;
		this.type = type;
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return "DecVarWithValue(" + type + ", " + name + ")";
	}
}
