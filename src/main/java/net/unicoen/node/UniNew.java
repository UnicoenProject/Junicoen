package net.unicoen.node;

import java.util.List;

public class UniNew extends UniExpr {
	public String type;
	public List<UniExpr> args;

	public UniNew() {
	}

	public UniNew(String type, List<UniExpr> args) {
		this.type = type;
		this.args = args;
	}

	@Override
	public String toString() {
		return "New(" + type + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (type == null ? 0 : type.hashCode());
		result = result * 31 + (args == null ? 0 : args.hashCode());
		result = result * 31 + (beforeComment == null ? 0 : beforeComment.hashCode());
		result = result * 31 + (afterComment == null ? 0 : afterComment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniNew)) return false;
		UniNew that = (UniNew)obj;
		return (this.type == null ? that.type == null : this.type.equals(that.type))
			&& (this.args == null ? that.args == null : this.args.equals(that.args))
			&& (this.beforeComment == null ? that.beforeComment == null : this.beforeComment.equals(that.beforeComment))
			&& (this.afterComment == null ? that.afterComment == null : this.afterComment.equals(that.afterComment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniNew that) {
		if (that.type != null) {
			this.type = that.type;
		}
		if (that.args != null) {
			if (this.args == null) {
				this.args = that.args;
			} else {
				this.args.addAll(that.args);
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
