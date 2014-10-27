package net.unicoen.node;

import java.util.List;

public class UniWhile extends UniExpr {
	public UniExpr cond;
	public List<UniExpr> body;

	public UniWhile() {
	}

	public UniWhile(UniExpr cond, List<UniExpr> body) {
		this.cond = cond;
		this.body = body;
	}

	@Override
	public String toString() {
		return "While";
	}
}
