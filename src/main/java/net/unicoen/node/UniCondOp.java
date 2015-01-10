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
}
