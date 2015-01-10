package net.unicoen.node;

public class UniReturn extends UniExpr {
	public UniExpr value;

	public UniReturn() {
	}

	public UniReturn(UniExpr value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Return";
	}
}
