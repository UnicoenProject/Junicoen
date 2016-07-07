package net.unicoen.node;
import net.unicoen.node_helper.*;

public class UniCast extends UniExpr {
	public String type;
	public UniExpr value;

	public UniCast() {
	}

	public UniCast(String type, UniExpr value) {
		this.type = type;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Cast(" + type + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (type == null ? 0 : type.hashCode());
		result = result * 31 + (value == null ? 0 : value.hashCode());
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		result = result * 31 + (codeRange == null ? 0 : codeRange.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniCast)) return false;
		UniCast that = (UniCast)obj;
		return (this.type == null ? that.type == null : this.type.equals(that.type))
			&& (this.value == null ? that.value == null : this.value.equals(that.value))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments))
			&& (this.codeRange == null ? that.codeRange == null : this.codeRange.equals(that.codeRange));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniCast that) {
		if (that.type != null) {
			this.type = that.type;
		}
		if (that.value != null) {
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
