package net.unicoen.node;

public class UniIntLiteral extends UniExpr {
	public int value;

	public UniIntLiteral() {
	}

	public UniIntLiteral(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "IntLiteral(" + value + ")";
	}
}
