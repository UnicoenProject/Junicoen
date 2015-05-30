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

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (cond == null ? 0 : cond.hashCode());
		result = result * 31 + (block == null ? 0 : block.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniWhile)) return false;
		UniWhile that = (UniWhile)obj;
		return (this.cond == null ? that.cond == null : this.cond.equals(that.cond))
			&& (this.block == null ? that.block == null : this.block.equals(that.block));
	}

	@Override
	public boolean isStatement() {
		return true;
	}

	public void merge(UniWhile that) {
		if (that.cond != null) {
			this.cond = that.cond;
		}
		if (that.block != null) {
			this.block = that.block;
		}
	}
}
