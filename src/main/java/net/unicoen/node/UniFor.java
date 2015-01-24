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

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniFor)) return false;
		UniFor that = (UniFor)obj;
		return (this.init == null ? that.init == null : this.init.equals(that.init))
			&& (this.cond == null ? that.cond == null : this.cond.equals(that.cond))
			&& (this.step == null ? that.step == null : this.step.equals(that.step))
			&& (this.block == null ? that.block == null : this.block.equals(that.block));
	}

	@Override
	public boolean isStatement() {
		return true;
	}
}
