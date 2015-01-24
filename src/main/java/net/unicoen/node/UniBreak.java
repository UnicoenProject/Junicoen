package net.unicoen.node;

public class UniBreak extends UniExpr {

	public UniBreak() {
	}

	@Override
	public String toString() {
		return "Break";
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && obj instanceof UniBreak;
	}

	@Override
	public boolean isStatement() {
		return false;
	}
}
