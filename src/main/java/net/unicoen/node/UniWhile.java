package net.unicoen.node;

public class UniWhile extends UniExpr {
	public UniExpr cond;
	public UniBlock block;

	public UniWhile() {
	}

	public UniWhile(UniExpr cond, UniBlock block) {
		this.cond = cond;
		this.block = block;
	}

	@Override
	public String toString() {
		return "While";
	}
}
