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
		return (comments == null ? 0 : comments.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniEmptyStatement)) return false;
		UniEmptyStatement that = (UniEmptyStatement)obj;
		return (this.comments == null ? that.comments == null : this.comments.equals(that.comments));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniEmptyStatement that) {
		if (that.comments != null) {
			if (this.comments == null) {
				this.comments = that.comments;
			} else {
				this.comments.addAll(that.comments);
			}
		}
	}
}
