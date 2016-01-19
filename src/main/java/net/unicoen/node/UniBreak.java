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
		return (comment == null ? 0 : comment.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniBreak)) return false;
		UniBreak that = (UniBreak)obj;
		return (this.comment == null ? that.comment == null : this.comment.equals(that.comment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniBreak that) {
		if (that.comment != null) {
			this.comment = that.comment;
		}
	}
}
