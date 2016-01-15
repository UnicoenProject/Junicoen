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

	@Override
	public int hashCode() {
		return (value == null ? 0 : value.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniReturn)) return false;
		UniReturn that = (UniReturn)obj;
		return (this.value == null ? that.value == null : this.value.equals(that.value));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniReturn that) {
		if (that.value != null) {
			this.value = that.value;
		}
	}
}
