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

	public void merge(UniEmptyStatement that) {
	}

	@Override
	public boolean isStatement() {
		// TODO Auto-generated method stub
		return false;
	}
}
