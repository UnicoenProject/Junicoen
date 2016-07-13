package net.unicoen.node;
import net.unicoen.node_helper.*;

public class UniFieldAccess extends UniExpr {
	public UniExpr receiver;
	public String fieldName;
	public UniExpr index;

	public UniFieldAccess() {
	}

	public UniFieldAccess(UniExpr receiver, String fieldName, UniExpr index) {
		this.receiver = receiver;
		this.fieldName = fieldName;
		this.index = index;
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
		result = result * 31 + (index == null ? 0 : index.hashCode());
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		result = result * 31 + (codeRange == null ? 0 : codeRange.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniFieldAccess)) return false;
		UniFieldAccess that = (UniFieldAccess)obj;
		return (this.receiver == null ? that.receiver == null : this.receiver.equals(that.receiver))
			&& (this.fieldName == null ? that.fieldName == null : this.fieldName.equals(that.fieldName))
			&& (this.index == null ? that.index == null : this.index.equals(that.index))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments))
			&& (this.codeRange == null ? that.codeRange == null : this.codeRange.equals(that.codeRange));
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
		if (that.index != null) {
			this.index = that.index;
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
