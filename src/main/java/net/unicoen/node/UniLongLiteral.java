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
		return (int)(value^(value>>32));
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniLongLiteral)) return false;
		UniLongLiteral that = (UniLongLiteral)obj;
		return this.value == that.value;
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniLongLiteral that) {
	}
}
