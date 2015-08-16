package net.unicoen.node;

import java.util.List;

public class UniBlock extends UniExpr {
	public List<UniExpr> body;

	public UniBlock() {
	}

	public UniBlock(List<UniExpr> body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Block";
	}

	@Override
	public int hashCode() {
		return (body == null ? 0 : body.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniBlock)) return false;
		UniBlock that = (UniBlock)obj;
		return (this.body == null ? that.body == null : this.body.equals(that.body));
	}

	@Override
	public boolean isStatement() {
		return true;
	}

	public void merge(UniBlock that) {
		if (that.body != null) {
			if (this.body != null) {
				this.body = that.body;
			} else {
				this.body.addAll(that.body);
			}
		}
	}
}
