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
		return (items == null ? 0 : items.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniArray)) return false;
		UniArray that = (UniArray)obj;
		return (this.items == null ? that.items == null : this.items.equals(that.items));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniArray that) {
		if (that.items != null) {
			if (this.items != null) {
				this.items = that.items;
			} else {
				this.items.addAll(that.items);
			}
		}
	}
}
