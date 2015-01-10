package net.unicoen.node;

public class UniFor extends UniExpr {
	public UniExpr init;
	public UniExpr cond;
	public UniExpr step;
	public UniBlock block;

	public UniFor() {
	}

	public UniFor(UniExpr init, UniExpr cond, UniExpr step, UniBlock block) {
		this.init = init;
		this.cond = cond;
		this.step = step;
		this.block = block;
	}

	@Override
	public String toString() {
		return "For";
	}
}
