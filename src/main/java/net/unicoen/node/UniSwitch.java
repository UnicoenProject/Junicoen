package net.unicoen.node;

import java.util.List;
import net.unicoen.node_helper.*;

public class UniSwitch extends UniExpr {
	public UniExpr cond;
	public List<UniSwitchUnit> cases;

	public UniSwitch() {
	}

	public UniSwitch(UniExpr cond, List<UniSwitchUnit> cases) {
		this.cond = cond;
		this.cases = cases;
	}

	@Override
	public String toString() {
		return "Switch";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (cond == null ? 0 : cond.hashCode());
		result = result * 31 + (cases == null ? 0 : cases.hashCode());
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		result = result * 31 + (codeRange == null ? 0 : codeRange.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniSwitch)) return false;
		UniSwitch that = (UniSwitch)obj;
		return (this.cond == null ? that.cond == null : this.cond.equals(that.cond))
			&& (this.cases == null ? that.cases == null : this.cases.equals(that.cases))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments))
			&& (this.codeRange == null ? that.codeRange == null : this.codeRange.equals(that.codeRange));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniSwitch that) {
		if (that.cond != null) {
			this.cond = that.cond;
		}
		if (that.cases != null) {
			if (this.cases == null) {
				this.cases = that.cases;
			} else {
				this.cases.addAll(that.cases);
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
