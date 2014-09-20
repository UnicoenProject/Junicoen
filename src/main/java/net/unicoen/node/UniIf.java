package net.unicoen.node;

import java.util.List;

public class UniIf extends UniExpr {
	public UniExpr cond;
	public List<UniExpr> trueBlock, falseBlock;

	@Override
	public String toString() {
		return "If";
	}
}
