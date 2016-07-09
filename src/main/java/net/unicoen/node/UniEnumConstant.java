package net.unicoen.node;

import java.util.List;

public class UniEnumConstant extends UniMemberDec {
	public String name;
	public List<UniExpr> args;

	public UniEnumConstant() {
	}

	public UniEnumConstant(String name, List<UniExpr> args) {
		this.name = name;
		this.args = args;
	}

	@Override
	public String toString() {
		return "EnumConstant(" + name + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (name == null ? 0 : name.hashCode());
		result = result * 31 + (args == null ? 0 : args.hashCode());
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniEnumConstant)) return false;
		UniEnumConstant that = (UniEnumConstant)obj;
		return (this.name == null ? that.name == null : this.name.equals(that.name))
			&& (this.args == null ? that.args == null : this.args.equals(that.args))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments));
	}

	public void merge(UniEnumConstant that) {
		if (that.name != null) {
			this.name = that.name;
		}
		if (that.args != null) {
			if (this.args == null) {
				this.args = that.args;
			} else {
				this.args.addAll(that.args);
			}
		}
		if (that.comments != null) {
			if (this.comments == null) {
				this.comments = that.comments;
			} else {
				this.comments.addAll(that.comments);
			}
		}
	}
}
