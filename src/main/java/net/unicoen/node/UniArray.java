package net.unicoen.node;

import java.util.List;
import net.unicoen.node_helper.*;

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
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		result = result * 31 + (codeRange == null ? 0 : codeRange.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniArray)) return false;
		UniArray that = (UniArray)obj;
		return (this.items == null ? that.items == null : this.items.equals(that.items))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments))
			&& (this.codeRange == null ? that.codeRange == null : this.codeRange.equals(that.codeRange));
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
		if (that.comments != null) {
			if (this.comments == null) {
				this.comments = that.comments;
			} else {
				this.comments.addAll(that.comments);
			}
		}
		if (that.codeRange != null) {
			this.codeRange = that.codeRange;
		}
	}
}
