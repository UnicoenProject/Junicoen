package net.unicoen.node;

public class UniDoubleLiteral extends UniExpr {
	public double value;

	public UniDoubleLiteral() {
	}

	public UniDoubleLiteral(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "DoubleLiteral(" + value + ")";
	}

	@Override
	public int hashCode() {
		long valueHashCode = Double.doubleToLongBits(value);
		int result = 17;
		result = result * 31 + (int)(valueHashCode^(valueHashCode>>32));
		result = result * 31 + (comment == null ? 0 : comment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniDoubleLiteral)) return false;
		UniDoubleLiteral that = (UniDoubleLiteral)obj;
		return this.value == that.value
			&& (this.comment == null ? that.comment == null : this.comment.equals(that.comment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniDoubleLiteral that) {
		if (that.value != 0) {
			this.value = that.value;
		}
		if (that.comment != null) {
			this.comment = that.comment;
		}
	}
}
