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

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniBinOp)) return false;
		UniBinOp that = (UniBinOp)obj;
		return (this.operator == null ? that.operator == null : this.operator.equals(that.operator))
			&& (this.left == null ? that.left == null : this.left.equals(that.left))
			&& (this.right == null ? that.right == null : this.right.equals(that.right));
	}

	@Override
	public boolean isStatement() {
		return false;
	}
}
