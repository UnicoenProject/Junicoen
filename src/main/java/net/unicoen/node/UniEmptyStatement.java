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
		int result = 17;
		result = result * 31 + (beforeComment == null ? 0 : beforeComment.hashCode());
		result = result * 31 + (afterComment == null ? 0 : afterComment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniEmptyStatement)) return false;
		UniEmptyStatement that = (UniEmptyStatement)obj;
		return (this.beforeComment == null ? that.beforeComment == null : this.beforeComment.equals(that.beforeComment))
			&& (this.afterComment == null ? that.afterComment == null : this.afterComment.equals(that.afterComment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniEmptyStatement that) {
		if (that.beforeComment != null) {
			this.beforeComment = that.beforeComment;
		}
		if (that.afterComment != null) {
			this.afterComment = that.afterComment;
		}
	}
}
