package net.unicoen.node;

public class UniBoolLiteral extends UniExpr implements UniNode {
	public boolean value;

	@Override
	public String toString() {
		return "Lit(" + value + ")";
	}
}
