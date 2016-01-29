package net.unicoen.node;

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
		result = result * 31 + (beforeComment == null ? 0 : beforeComment.hashCode());
		result = result * 31 + (afterComment == null ? 0 : afterComment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniCast)) return false;
		UniCast that = (UniCast)obj;
		return (this.type == null ? that.type == null : this.type.equals(that.type))
			&& (this.value == null ? that.value == null : this.value.equals(that.value))
			&& (this.beforeComment == null ? that.beforeComment == null : this.beforeComment.equals(that.beforeComment))
			&& (this.afterComment == null ? that.afterComment == null : this.afterComment.equals(that.afterComment));
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
		if (that.beforeComment != null) {
			this.beforeComment = that.beforeComment;
		}
		if (that.afterComment != null) {
			this.afterComment = that.afterComment;
		}
	}
}
