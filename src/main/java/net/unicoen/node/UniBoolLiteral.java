package net.unicoen.node;

public class UniBoolLiteral extends UniExpr {
	public boolean value;

	@Override
	public String toString() {
		return "Lit(" + value + ")";
	}
}
