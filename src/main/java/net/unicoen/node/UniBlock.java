package net.unicoen.node;

import java.util.List;

public class UniBlock extends UniExpr {
	public List<UniExpr> body;
	public String blockLabel;

	public UniBlock() {
	}

	public UniBlock(List<UniExpr> body, String blockLabel) {
		this.body = body;
		this.blockLabel = blockLabel;
	}

	@Override
	public String toString() {
		return "Block(" + blockLabel + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (body == null ? 0 : body.hashCode());
		result = result * 31 + (blockLabel == null ? 0 : blockLabel.hashCode());
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniBlock)) return false;
		UniBlock that = (UniBlock)obj;
		return (this.body == null ? that.body == null : this.body.equals(that.body))
			&& (this.blockLabel == null ? that.blockLabel == null : this.blockLabel.equals(that.blockLabel))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments));
	}

	@Override
	public boolean isStatement() {
		return true;
	}

	public void merge(UniBlock that) {
		if (that.body != null) {
			if (this.body == null) {
				this.body = that.body;
			} else {
				this.body.addAll(that.body);
			}
		}
		if (that.blockLabel != null) {
			this.blockLabel = that.blockLabel;
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
