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
	public int hashCode() {
		int result = 17;
		result = result * 31 + (operator == null ? 0 : operator.hashCode());
		result = result * 31 + (left == null ? 0 : left.hashCode());
		result = result * 31 + (right == null ? 0 : right.hashCode());
		return result;
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

	public void merge(UniBinOp that) {
		if (that.operator != null) {
			this.operator = that.operator;
		}
		if (that.left != null) {
			this.left = that.left;
		}
		if (that.right != null) {
			this.right = that.right;
		}
	}
}
