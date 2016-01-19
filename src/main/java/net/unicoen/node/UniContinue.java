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
		return (comment == null ? 0 : comment.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniContinue)) return false;
		UniContinue that = (UniContinue)obj;
		return (this.comment == null ? that.comment == null : this.comment.equals(that.comment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniContinue that) {
		if (that.comment != null) {
			this.comment = that.comment;
		}
	}
}
