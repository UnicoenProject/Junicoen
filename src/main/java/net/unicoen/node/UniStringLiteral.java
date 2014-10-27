package net.unicoen.node;

public class UniStringLiteral extends UniExpr {
	public String value;

	public UniStringLiteral() {
	}

	public UniStringLiteral(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "StringLiteral(" + value + ")";
	}
}
