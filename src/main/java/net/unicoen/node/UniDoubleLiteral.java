package net.unicoen.node;
import net.unicoen.node_helper.*;

public class UniDoubleLiteral extends UniExpr {
	public double value;

	public UniDoubleLiteral() {
	}

	public UniDoubleLiteral(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "DoubleLiteral(" + value + ")";
	}

	@Override
	public int hashCode() {
		long valueHashCode = Double.doubleToLongBits(value);
		int result = 17;
		result = result * 31 + (int)(valueHashCode^(valueHashCode>>32));
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		result = result * 31 + (codeRange == null ? 0 : codeRange.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniDoubleLiteral)) return false;
		UniDoubleLiteral that = (UniDoubleLiteral)obj;
		return this.value == that.value
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments))
			&& (this.codeRange == null ? that.codeRange == null : this.codeRange.equals(that.codeRange));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniDoubleLiteral that) {
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
