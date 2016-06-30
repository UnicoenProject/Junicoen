package net.unicoen.node;
import net.unicoen.node_helper.*;

public class UniIntLiteral extends UniExpr {
	public int value;

	public UniIntLiteral() {
	}

	public UniIntLiteral(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "IntLiteral(" + value + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + value;
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		result = result * 31 + (codeRange == null ? 0 : codeRange.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniIntLiteral)) return false;
		UniIntLiteral that = (UniIntLiteral)obj;
		return this.value == that.value
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments))
			&& (this.codeRange == null ? that.codeRange == null : this.codeRange.equals(that.codeRange));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniIntLiteral that) {
		if (that.value != 0) {
			this.value = that.value;
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
