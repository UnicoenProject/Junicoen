package net.unicoen.node;

import java.util.List;

public class UniSwitchUnit extends UniExpr {
	public String label;
	public UniExpr cond;
	public List<UniExpr> statement;

	public UniSwitchUnit() {
	}

	public UniSwitchUnit(String label, UniExpr cond, List<UniExpr> statement) {
		this.label = label;
		this.cond = cond;
		this.statement = statement;
	}

	@Override
	public String toString() {
		return "SwitchUnit(" + label + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (label == null ? 0 : label.hashCode());
		result = result * 31 + (cond == null ? 0 : cond.hashCode());
		result = result * 31 + (statement == null ? 0 : statement.hashCode());
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniSwitchUnit)) return false;
		UniSwitchUnit that = (UniSwitchUnit)obj;
		return (this.label == null ? that.label == null : this.label.equals(that.label))
			&& (this.cond == null ? that.cond == null : this.cond.equals(that.cond))
			&& (this.statement == null ? that.statement == null : this.statement.equals(that.statement))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniSwitchUnit that) {
		if (that.label != null) {
			this.label = that.label;
		}
		if (that.cond != null) {
			this.cond = that.cond;
		}
		if (that.statement != null) {
			if (this.statement == null) {
				this.statement = that.statement;
			} else {
				this.statement.addAll(that.statement);
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
