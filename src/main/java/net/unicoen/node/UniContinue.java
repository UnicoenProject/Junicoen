package net.unicoen.node;

public class UniContinue extends UniExpr {

	public UniContinue() {
	}

	@Override
	public String toString() {
		return "Continue";
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && obj instanceof UniContinue;
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniContinue that) {
	}
}
