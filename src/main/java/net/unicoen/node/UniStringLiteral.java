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
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniStringLiteral)) return false;
		UniStringLiteral that = (UniStringLiteral)obj;
		return (this.value == null ? that.value == null : this.value.equals(that.value))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniStringLiteral that) {
		if (that.value != null) {
			this.value = that.value;
		}
		if (that.comments != null) {
			if (this.comments == null) {
				this.comments = that.comments;
			} else {
				this.comments.addAll(that.comments);
			}
		}
	}
}
