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
}
