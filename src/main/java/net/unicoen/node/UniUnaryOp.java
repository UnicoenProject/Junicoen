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
}
