package net.unicoen.node;

/** 単項式 */
public class UniUnaryOp extends UniExpr {
	public String operator;
	public UniExpr expr;

	public UniUnaryOp() {
	}

	public UniUnaryOp(String operator, UniExpr expr) {
		this.operator = operator;
		this.expr = expr;
	}

	@Override
	public String toString() {
		return "UnaryOp(" + operator + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (operator == null ? 0 : operator.hashCode());
		result = result * 31 + (expr == null ? 0 : expr.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniUnaryOp)) return false;
		UniUnaryOp that = (UniUnaryOp)obj;
		return (this.operator == null ? that.operator == null : this.operator.equals(that.operator))
			&& (this.expr == null ? that.expr == null : this.expr.equals(that.expr));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniUnaryOp that) {
		if (that.operator != null) {
			this.operator = that.operator;
		}
		if (that.expr != null) {
			this.expr = that.expr;
		}
	}
}
