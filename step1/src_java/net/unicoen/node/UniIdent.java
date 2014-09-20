package net.unicoen.node;

public class UniIdent extends UniExpr {
	public String name;

	@Override
	public String toString() {
		return "Ident(" + name + ")";
	}
}
