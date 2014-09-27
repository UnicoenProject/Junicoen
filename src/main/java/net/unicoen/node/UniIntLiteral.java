package net.unicoen.node;

public class UniIntLiteral extends UniExpr implements UniNode {
	public int value;

	@Override
	public String toString() {
		return "Lit(" + value + ")";
	}
}
