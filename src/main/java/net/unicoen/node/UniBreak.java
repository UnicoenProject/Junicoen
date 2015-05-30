package net.unicoen.node;

public class UniBreak extends UniExpr {

	public UniBreak() {
	}

	@Override
	public String toString() {
		return "Break";
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && obj instanceof UniBreak;
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniBreak that) {
	}
}
