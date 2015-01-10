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
}
