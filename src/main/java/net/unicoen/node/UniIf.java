package net.unicoen.node;

public class UniIf extends UniExpr {
	public UniExpr cond;
	public UniBlock trueBlock;
	public UniBlock falseBlock;

	public UniIf() {
	}

	public UniIf(UniExpr cond, UniBlock trueBlock, UniBlock falseBlock) {
		this.cond = cond;
		this.trueBlock = trueBlock;
		this.falseBlock = falseBlock;
	}

	@Override
	public String toString() {
		return "If";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (cond == null ? 0 : cond.hashCode());
		result = result * 31 + (trueBlock == null ? 0 : trueBlock.hashCode());
		result = result * 31 + (falseBlock == null ? 0 : falseBlock.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniIf)) return false;
		UniIf that = (UniIf)obj;
		return (this.cond == null ? that.cond == null : this.cond.equals(that.cond))
			&& (this.trueBlock == null ? that.trueBlock == null : this.trueBlock.equals(that.trueBlock))
			&& (this.falseBlock == null ? that.falseBlock == null : this.falseBlock.equals(that.falseBlock));
	}

	@Override
	public boolean isStatement() {
		return true;
	}

	public void merge(UniIf that) {
		if (that.cond != null) {
			this.cond = that.cond;
		}
		if (that.trueBlock != null) {
			this.trueBlock = that.trueBlock;
		}
		if (that.falseBlock != null) {
			this.falseBlock = that.falseBlock;
		}
	}
}
