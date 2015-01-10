package net.unicoen.node;

import java.util.List;

public class UniBlock extends UniExpr {
	public List<UniExpr> body;

	public UniBlock() {
	}

	public UniBlock(List<UniExpr> body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Block";
	}
}
