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
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniIntLiteral)) return false;
		UniIntLiteral that = (UniIntLiteral)obj;
		return this.value == that.value;
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniIntLiteral that) {
	}
}
