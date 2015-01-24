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
}
