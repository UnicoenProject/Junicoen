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

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniDecVarWithValue)) return false;
		UniDecVarWithValue that = (UniDecVarWithValue)obj;
		return (this.modifiers == null ? that.modifiers == null : this.modifiers.equals(that.modifiers))
			&& (this.type == null ? that.type == null : this.type.equals(that.type))
			&& (this.name == null ? that.name == null : this.name.equals(that.name))
			&& (this.value == null ? that.value == null : this.value.equals(that.value));
	}

	@Override
	public boolean isStatement() {
		return false;
	}
}
