package net.unicoen.node;

import java.util.List;
import net.unicoen.node_helper.*;

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
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		result = result * 31 + (codeRange == null ? 0 : codeRange.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniNew)) return false;
		UniNew that = (UniNew)obj;
		return (this.type == null ? that.type == null : this.type.equals(that.type))
			&& (this.args == null ? that.args == null : this.args.equals(that.args))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments))
			&& (this.codeRange == null ? that.codeRange == null : this.codeRange.equals(that.codeRange));
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
