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
}
