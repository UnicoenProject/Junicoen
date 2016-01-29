package net.unicoen.node;

public class UniFieldAccess extends UniExpr {
	public UniExpr receiver;
	public String fieldName;

	public UniFieldAccess() {
	}

	public UniFieldAccess(UniExpr receiver, String fieldName) {
		this.receiver = receiver;
		this.fieldName = fieldName;
	}

	@Override
	public String toString() {
		return "FieldAccess(" + fieldName + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (receiver == null ? 0 : receiver.hashCode());
		result = result * 31 + (fieldName == null ? 0 : fieldName.hashCode());
		result = result * 31 + (beforeComment == null ? 0 : beforeComment.hashCode());
		result = result * 31 + (afterComment == null ? 0 : afterComment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniFieldAccess)) return false;
		UniFieldAccess that = (UniFieldAccess)obj;
		return (this.receiver == null ? that.receiver == null : this.receiver.equals(that.receiver))
			&& (this.fieldName == null ? that.fieldName == null : this.fieldName.equals(that.fieldName))
			&& (this.beforeComment == null ? that.beforeComment == null : this.beforeComment.equals(that.beforeComment))
			&& (this.afterComment == null ? that.afterComment == null : this.afterComment.equals(that.afterComment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniFieldAccess that) {
		if (that.receiver != null) {
			this.receiver = that.receiver;
		}
		if (that.fieldName != null) {
			this.fieldName = that.fieldName;
		}
		if (that.beforeComment != null) {
			this.beforeComment = that.beforeComment;
		}
		if (that.afterComment != null) {
			this.afterComment = that.afterComment;
		}
	}
}
