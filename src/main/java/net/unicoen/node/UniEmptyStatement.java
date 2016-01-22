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
		return (comment == null ? 0 : comment.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniEmptyStatement)) return false;
		UniEmptyStatement that = (UniEmptyStatement)obj;
		return (this.comment == null ? that.comment == null : this.comment.equals(that.comment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniEmptyStatement that) {
		if (that.comment != null) {
			this.comment = that.comment;
		}
	}
}
