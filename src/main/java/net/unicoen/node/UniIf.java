package net.unicoen.node;

public class UniIf extends UniExpr {
	public UniExpr cond;
	public UniBlock trueBlock;
	public UniBlock falseBlock;

	public UniIf() {
	}

	public UniIf(UniExpr cond, UniBlock trueBlock, UniBlock falseBlock) {
		this.cond = cond;
		this.trueBlock = trueBlock;
		this.falseBlock = falseBlock;
	}

	@Override
	public String toString() {
		return "If";
	}
}
