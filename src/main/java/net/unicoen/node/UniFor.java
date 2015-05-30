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
	public int hashCode() {
		int result = 17;
		result = result * 31 + (init == null ? 0 : init.hashCode());
		result = result * 31 + (cond == null ? 0 : cond.hashCode());
		result = result * 31 + (step == null ? 0 : step.hashCode());
		result = result * 31 + (block == null ? 0 : block.hashCode());
		return result;
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

	public void merge(UniFor that) {
		if (that.init != null) {
			this.init = that.init;
		}
		if (that.cond != null) {
			this.cond = that.cond;
		}
		if (that.step != null) {
			this.step = that.step;
		}
		if (that.block != null) {
			this.block = that.block;
		}
	}
}
