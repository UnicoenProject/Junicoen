package net.unicoen.node;

/** 二項式 */
public class UniBinOp extends UniExpr {
	public String operator;
	public UniExpr left;
	public UniExpr right;

	public UniBinOp() {
	}

	public UniBinOp(String operator, UniExpr left, UniExpr right) {
		this.operator = operator;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "BinOp(" + operator + ")";
	}
}
