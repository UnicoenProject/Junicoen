package net.unicoen.node;

import java.util.List;

public class UniArray extends UniExpr {
	public List<UniExpr> items;

	public UniArray() {
	}

	public UniArray(List<UniExpr> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Array";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (items == null ? 0 : items.hashCode());
		result = result * 31 + (beforeComment == null ? 0 : beforeComment.hashCode());
		result = result * 31 + (afterComment == null ? 0 : afterComment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniArray)) return false;
		UniArray that = (UniArray)obj;
		return (this.items == null ? that.items == null : this.items.equals(that.items))
			&& (this.beforeComment == null ? that.beforeComment == null : this.beforeComment.equals(that.beforeComment))
			&& (this.afterComment == null ? that.afterComment == null : this.afterComment.equals(that.afterComment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniArray that) {
		if (that.items != null) {
			if (this.items == null) {
				this.items = that.items;
			} else {
				this.items.addAll(that.items);
			}
		}
		if (that.beforeComment != null) {
			this.beforeComment = that.beforeComment;
		}
		if (that.afterComment != null) {
			this.afterComment = that.afterComment;
		}
	}
}
