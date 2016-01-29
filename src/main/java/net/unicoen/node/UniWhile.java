package net.unicoen.node;

public class UniWhile extends UniExpr {
	public UniExpr cond;
	public UniExpr statement;

	public UniWhile() {
	}

	public UniWhile(UniExpr cond, UniExpr statement) {
		this.cond = cond;
		this.statement = statement;
	}

	@Override
	public String toString() {
		return "While";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (cond == null ? 0 : cond.hashCode());
		result = result * 31 + (statement == null ? 0 : statement.hashCode());
		result = result * 31 + (beforeComment == null ? 0 : beforeComment.hashCode());
		result = result * 31 + (afterComment == null ? 0 : afterComment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniWhile)) return false;
		UniWhile that = (UniWhile)obj;
		return (this.cond == null ? that.cond == null : this.cond.equals(that.cond))
			&& (this.statement == null ? that.statement == null : this.statement.equals(that.statement))
			&& (this.beforeComment == null ? that.beforeComment == null : this.beforeComment.equals(that.beforeComment))
			&& (this.afterComment == null ? that.afterComment == null : this.afterComment.equals(that.afterComment));
	}

	@Override
	public boolean isStatement() {
		return true;
	}

	public void merge(UniWhile that) {
		if (that.cond != null) {
			this.cond = that.cond;
		}
		if (that.statement != null) {
			this.statement = that.statement;
		}
		if (that.beforeComment != null) {
			this.beforeComment = that.beforeComment;
		}
		if (that.afterComment != null) {
			this.afterComment = that.afterComment;
		}
	}
}
