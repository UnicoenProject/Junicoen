package net.unicoen.node;

/** 条件式/条件演算子 */
public class UniCondOp extends UniExpr {
	public UniExpr cond;
	public UniExpr trueExpr;
	public UniExpr falseExpr;

	public UniCondOp() {
	}

	public UniCondOp(UniExpr cond, UniExpr trueExpr, UniExpr falseExpr) {
		this.cond = cond;
		this.trueExpr = trueExpr;
		this.falseExpr = falseExpr;
	}

	@Override
	public String toString() {
		return "CondOp";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniCondOp)) return false;
		UniCondOp that = (UniCondOp)obj;
		return (this.cond == null ? that.cond == null : this.cond.equals(that.cond))
			&& (this.trueExpr == null ? that.trueExpr == null : this.trueExpr.equals(that.trueExpr))
			&& (this.falseExpr == null ? that.falseExpr == null : this.falseExpr.equals(that.falseExpr));
	}

	@Override
	public boolean isStatement() {
		return false;
	}
}
