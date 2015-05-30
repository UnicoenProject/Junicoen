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

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (block == null ? 0 : block.hashCode());
		result = result * 31 + (cond == null ? 0 : cond.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniDoWhile)) return false;
		UniDoWhile that = (UniDoWhile)obj;
		return (this.block == null ? that.block == null : this.block.equals(that.block))
			&& (this.cond == null ? that.cond == null : this.cond.equals(that.cond));
	}

	@Override
	public boolean isStatement() {
		return true;
	}

	public void merge(UniDoWhile that) {
		if (that.block != null) {
			this.block = that.block;
		}
		if (that.cond != null) {
			this.cond = that.cond;
		}
	}
}
