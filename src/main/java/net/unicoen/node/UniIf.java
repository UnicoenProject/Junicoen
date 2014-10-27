package net.unicoen.node;

import java.util.List;

public class UniIf extends UniExpr {
	public UniExpr cond;
	public List<UniExpr> trueBlock;
	public List<UniExpr> falseBlock;

	public UniIf() {
	}

	public UniIf(UniExpr cond, List<UniExpr> trueBlock, List<UniExpr> falseBlock) {
		this.cond = cond;
		this.trueBlock = trueBlock;
		this.falseBlock = falseBlock;
	}

	@Override
	public String toString() {
		return "If";
	}
}
