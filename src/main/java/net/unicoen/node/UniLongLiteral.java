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
		result = result * 31 + (comment == null ? 0 : comment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniLongLiteral)) return false;
		UniLongLiteral that = (UniLongLiteral)obj;
		return this.value == that.value
			&& (this.comment == null ? that.comment == null : this.comment.equals(that.comment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniLongLiteral that) {
		if (that.value != 0) {
			this.value = that.value;
		}
		if (that.comment != null) {
			this.comment = that.comment;
		}
	}
}
