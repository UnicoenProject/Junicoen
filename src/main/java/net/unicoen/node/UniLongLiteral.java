package net.unicoen.node;

public class UniLongLiteral extends UniExpr {
	public long value;

	public UniLongLiteral() {
	}

	public UniLongLiteral(long value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "LongLiteral(" + value + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (int)(value^(value>>32));
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniLongLiteral)) return false;
		UniLongLiteral that = (UniLongLiteral)obj;
		return this.value == that.value
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniLongLiteral that) {
		if (that.value != 0) {
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
