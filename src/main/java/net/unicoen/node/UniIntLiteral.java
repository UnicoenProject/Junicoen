package net.unicoen.node;

public class UniIntLiteral extends UniExpr {
	public int value;

	@Override
	public String toString() {
		return "Lit(" + value + ")";
	}
}
