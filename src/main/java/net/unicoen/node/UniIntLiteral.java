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
		result = result * 31 + (comment == null ? 0 : comment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniIntLiteral)) return false;
		UniIntLiteral that = (UniIntLiteral)obj;
		return this.value == that.value
			&& (this.comment == null ? that.comment == null : this.comment.equals(that.comment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniIntLiteral that) {
		if (that.value != 0) {
			this.value = that.value;
		}
		if (that.comment != null) {
			this.comment = that.comment;
		}
	}
}
