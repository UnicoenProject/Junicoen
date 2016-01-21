package net.unicoen.node;

public class UniReturn extends UniExpr {
	public UniExpr value;

	public UniReturn() {
	}

	public UniReturn(UniExpr value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Return";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (value == null ? 0 : value.hashCode());
		result = result * 31 + (comment == null ? 0 : comment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniReturn)) return false;
		UniReturn that = (UniReturn)obj;
		return (this.value == null ? that.value == null : this.value.equals(that.value))
			&& (this.comment == null ? that.comment == null : this.comment.equals(that.comment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniReturn that) {
		if (that.value != null) {
			this.value = that.value;
		}
		if (that.comment != null) {
			this.comment = that.comment;
		}
	}
}
