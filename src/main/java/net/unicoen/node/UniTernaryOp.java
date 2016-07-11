package net.unicoen.node;
import net.unicoen.node_helper.*;

/** 条件式/条件演算子 */
public class UniTernaryOp extends UniExpr {
	public UniExpr cond;
	public UniExpr trueExpr;
	public UniExpr falseExpr;

	public UniTernaryOp() {
	}

	public UniTernaryOp(UniExpr cond, UniExpr trueExpr, UniExpr falseExpr) {
		this.cond = cond;
		this.trueExpr = trueExpr;
		this.falseExpr = falseExpr;
	}

	@Override
	public String toString() {
		return "TernaryOp";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (cond == null ? 0 : cond.hashCode());
		result = result * 31 + (trueExpr == null ? 0 : trueExpr.hashCode());
		result = result * 31 + (falseExpr == null ? 0 : falseExpr.hashCode());
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		result = result * 31 + (codeRange == null ? 0 : codeRange.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniTernaryOp)) return false;
		UniTernaryOp that = (UniTernaryOp)obj;
		return (this.cond == null ? that.cond == null : this.cond.equals(that.cond))
			&& (this.trueExpr == null ? that.trueExpr == null : this.trueExpr.equals(that.trueExpr))
			&& (this.falseExpr == null ? that.falseExpr == null : this.falseExpr.equals(that.falseExpr))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments))
			&& (this.codeRange == null ? that.codeRange == null : this.codeRange.equals(that.codeRange));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniTernaryOp that) {
		if (that.cond != null) {
			this.cond = that.cond;
		}
		if (that.trueExpr != null) {
			this.trueExpr = that.trueExpr;
		}
		if (that.falseExpr != null) {
			this.falseExpr = that.falseExpr;
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
