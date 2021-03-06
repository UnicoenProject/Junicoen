package net.unicoen.node;
import net.unicoen.node_helper.*;

public class UniFor extends UniExpr {
	public UniExpr init;
	public UniExpr cond;
	public UniExpr step;
	public UniExpr statement;

	public UniFor() {
	}

	public UniFor(UniExpr init, UniExpr cond, UniExpr step, UniExpr statement) {
		this.init = init;
		this.cond = cond;
		this.step = step;
		this.statement = statement;
	}

	@Override
	public String toString() {
		return "For";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (init == null ? 0 : init.hashCode());
		result = result * 31 + (cond == null ? 0 : cond.hashCode());
		result = result * 31 + (step == null ? 0 : step.hashCode());
		result = result * 31 + (statement == null ? 0 : statement.hashCode());
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		result = result * 31 + (codeRange == null ? 0 : codeRange.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniFor)) return false;
		UniFor that = (UniFor)obj;
		return (this.init == null ? that.init == null : this.init.equals(that.init))
			&& (this.cond == null ? that.cond == null : this.cond.equals(that.cond))
			&& (this.step == null ? that.step == null : this.step.equals(that.step))
			&& (this.statement == null ? that.statement == null : this.statement.equals(that.statement))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments))
			&& (this.codeRange == null ? that.codeRange == null : this.codeRange.equals(that.codeRange));
	}

	@Override
	public boolean isStatement() {
		return true;
	}

	public void merge(UniFor that) {
		if (that.init != null) {
			this.init = that.init;
		}
		if (that.cond != null) {
			this.cond = that.cond;
		}
		if (that.step != null) {
			this.step = that.step;
		}
		if (that.statement != null) {
			this.statement = that.statement;
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
