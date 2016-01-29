package net.unicoen.node;

public class UniIntLiteral extends UniExpr {
	public int value;

	public UniIntLiteral() {
	}

	public UniIntLiteral(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "IntLiteral(" + value + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + value;
		result = result * 31 + (beforeComment == null ? 0 : beforeComment.hashCode());
		result = result * 31 + (afterComment == null ? 0 : afterComment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniIntLiteral)) return false;
		UniIntLiteral that = (UniIntLiteral)obj;
		return this.value == that.value
			&& (this.beforeComment == null ? that.beforeComment == null : this.beforeComment.equals(that.beforeComment))
			&& (this.afterComment == null ? that.afterComment == null : this.afterComment.equals(that.afterComment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniIntLiteral that) {
		if (that.value != 0) {
			this.value = that.value;
		}
		if (that.beforeComment != null) {
			this.beforeComment = that.beforeComment;
		}
		if (that.afterComment != null) {
			this.afterComment = that.afterComment;
		}
	}
}
