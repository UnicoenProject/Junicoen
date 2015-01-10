package net.unicoen.node;

public class UniDoWhile extends UniExpr {
	public UniBlock block;
	public UniExpr cond;

	public UniDoWhile() {
	}

	public UniDoWhile(UniBlock block, UniExpr cond) {
		this.block = block;
		this.cond = cond;
	}

	@Override
	public String toString() {
		return "DoWhile";
	}
}
