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
		return (value == null ? 0 : value.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniStringLiteral)) return false;
		UniStringLiteral that = (UniStringLiteral)obj;
		return (this.value == null ? that.value == null : this.value.equals(that.value));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniStringLiteral that) {
		if (that.value != null) {
			this.value = that.value;
		}
	}
}
