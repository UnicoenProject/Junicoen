package net.unicoen.node;

public class UniContinue extends UniExpr {

	public UniContinue() {
	}

	@Override
	public String toString() {
		return "Continue";
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && obj instanceof UniContinue;
	}

	@Override
	public boolean isStatement() {
		return false;
	}
}
