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
		result = result * 31 + (comment == null ? 0 : comment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniBoolLiteral)) return false;
		UniBoolLiteral that = (UniBoolLiteral)obj;
		return this.value == that.value
			&& (this.comment == null ? that.comment == null : this.comment.equals(that.comment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniBoolLiteral that) {
		if (that.value) {
			this.value = true;
		}
		if (that.comment != null) {
			this.comment = that.comment;
		}
	}
}
