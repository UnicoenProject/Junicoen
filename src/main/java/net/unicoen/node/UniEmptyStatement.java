package net.unicoen.node;

public class UniEmptyStatement extends UniExpr {

	public UniEmptyStatement() {
	}

	@Override
	public String toString() {
		return "EmptyStatement";
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && obj instanceof UniEmptyStatement;
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniEmptyStatement that) {
	}

}
