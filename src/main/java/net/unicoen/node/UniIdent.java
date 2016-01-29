package net.unicoen.node;

public class UniIdent extends UniExpr {
	public String name;

	public UniIdent() {
	}

	public UniIdent(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ident(" + name + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (name == null ? 0 : name.hashCode());
		result = result * 31 + (beforeComment == null ? 0 : beforeComment.hashCode());
		result = result * 31 + (afterComment == null ? 0 : afterComment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniIdent)) return false;
		UniIdent that = (UniIdent)obj;
		return (this.name == null ? that.name == null : this.name.equals(that.name))
			&& (this.beforeComment == null ? that.beforeComment == null : this.beforeComment.equals(that.beforeComment))
			&& (this.afterComment == null ? that.afterComment == null : this.afterComment.equals(that.afterComment));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniIdent that) {
		if (that.name != null) {
			this.name = that.name;
		}
		if (that.beforeComment != null) {
			this.beforeComment = that.beforeComment;
		}
		if (that.afterComment != null) {
			this.afterComment = that.afterComment;
		}
	}
}
