package net.unicoen.node;

public class UniStringLiteral extends UniExpr {
	public String value;

	public UniStringLiteral() {
	}

	public UniStringLiteral(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "StringLiteral(" + value + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (value == null ? 0 : value.hashCode());
		result = result * 31 + (beforeComment == null ? 0 : beforeComment.hashCode());
		result = result * 31 + (afterComment == null ? 0 : afterComment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniStringLiteral)) return false;
		UniStringLiteral that = (UniStringLiteral)obj;
		return (this.value == null ? that.value == null : this.value.equals(that.value))
			&& (this.beforeComment == null ? that.beforeComment == null : this.beforeComment.equals(that.beforeComment))
			&& (this.afterComment == null ? that.afterComment == null : this.afterComment.equals(that.afterComment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniStringLiteral that) {
		if (that.value != null) {
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
