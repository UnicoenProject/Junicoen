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
		return value ? 1 : 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniBoolLiteral)) return false;
		UniBoolLiteral that = (UniBoolLiteral)obj;
		return this.value == that.value;
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniBoolLiteral that) {
		if (that.value) {
			this.value = true;
		}
	}
}
