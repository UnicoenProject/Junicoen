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
		return (comments == null ? 0 : comments.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniBreak)) return false;
		UniBreak that = (UniBreak)obj;
		return (this.comments == null ? that.comments == null : this.comments.equals(that.comments));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniBreak that) {
		if (that.comments != null) {
			if (this.comments == null) {
				this.comments = that.comments;
			} else {
				this.comments.addAll(that.comments);
			}
		}
	}
}
