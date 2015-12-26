package net.unicoen.node;

public class UniIf extends UniExpr {
	public UniExpr cond;
	public UniExpr trueStatement;
	public UniExpr falseStatement;

	public UniIf() {
	}

	public UniIf(UniExpr cond, UniExpr trueStatement, UniExpr falseStatement) {
		this.cond = cond;
		this.trueStatement = trueStatement;
		this.falseStatement = falseStatement;
	}

	@Override
	public String toString() {
		return "If";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (cond == null ? 0 : cond.hashCode());
		result = result * 31 + (trueStatement == null ? 0 : trueStatement.hashCode());
		result = result * 31 + (falseStatement == null ? 0 : falseStatement.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniIf)) return false;
		UniIf that = (UniIf)obj;
		return (this.cond == null ? that.cond == null : this.cond.equals(that.cond))
			&& (this.trueStatement == null ? that.trueStatement == null : this.trueStatement.equals(that.trueStatement))
			&& (this.falseStatement == null ? that.falseStatement == null : this.falseStatement.equals(that.falseStatement));
	}

	@Override
	public boolean isStatement() {
		return true;
	}

	public void merge(UniIf that) {
		if (that.cond != null) {
			this.cond = that.cond;
		}
		if (that.trueStatement != null) {
			this.trueStatement = that.trueStatement;
		}
		if (that.falseStatement != null) {
			this.falseStatement = that.falseStatement;
		}
	}
}
