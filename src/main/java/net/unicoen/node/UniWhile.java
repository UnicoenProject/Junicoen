package net.unicoen.node;

import java.util.List;

public class UniWhile extends UniExpr {
	public UniExpr cond;
	public List<UniExpr> body;

	@Override
	public String toString() {
		return "While";
	}
}
