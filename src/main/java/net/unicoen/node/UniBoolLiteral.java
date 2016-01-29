package net.unicoen.node;

public class UniBoolLiteral extends UniExpr {
	public boolean value;

	public UniBoolLiteral() {
	}

	public UniBoolLiteral(boolean value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "BoolLiteral(" + value + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (value ? 1 : 0);
		result = result * 31 + (beforeComment == null ? 0 : beforeComment.hashCode());
		result = result * 31 + (afterComment == null ? 0 : afterComment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniBoolLiteral)) return false;
		UniBoolLiteral that = (UniBoolLiteral)obj;
		return this.value == that.value
			&& (this.beforeComment == null ? that.beforeComment == null : this.beforeComment.equals(that.beforeComment))
			&& (this.afterComment == null ? that.afterComment == null : this.afterComment.equals(that.afterComment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniBoolLiteral that) {
		if (that.value) {
			this.value = true;
		}
		if (that.beforeComment != null) {
			this.beforeComment = that.beforeComment;
		}
		if (that.afterComment != null) {
			this.afterComment = that.afterComment;
		}
	}
}
