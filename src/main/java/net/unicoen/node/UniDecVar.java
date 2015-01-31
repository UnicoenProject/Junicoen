package net.unicoen.node;

import java.util.List;

/** 変数宣言 */
public class UniDecVar extends UniExpr {
	public List<String> modifiers;
	public String type;
	public String name;

	public UniDecVar() {
	}

	public UniDecVar(List<String> modifiers, String type, String name) {
		this.modifiers = modifiers;
		this.type = type;
		this.name = name;
	}

	@Override
	public String toString() {
		return "DecVar(" + type + ", " + name + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniDecVar)) return false;
		UniDecVar that = (UniDecVar)obj;
		return (this.modifiers == null ? that.modifiers == null : this.modifiers.equals(that.modifiers))
			&& (this.type == null ? that.type == null : this.type.equals(that.type))
			&& (this.name == null ? that.name == null : this.name.equals(that.name));
	}

	@Override
	public boolean isStatement() {
		return false;
	}
}
