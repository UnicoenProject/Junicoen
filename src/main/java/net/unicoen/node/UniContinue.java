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
		return (comments == null ? 0 : comments.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniContinue)) return false;
		UniContinue that = (UniContinue)obj;
		return (this.comments == null ? that.comments == null : this.comments.equals(that.comments));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniContinue that) {
		if (that.comments != null) {
			if (this.comments == null) {
				this.comments = that.comments;
			} else {
				this.comments.addAll(that.comments);
			}
		}
	}
}
