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
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniDoubleLiteral)) return false;
		UniDoubleLiteral that = (UniDoubleLiteral)obj;
		return this.value == that.value;
	}

	@Override
	public boolean isStatement() {
		return false;
	}
}
