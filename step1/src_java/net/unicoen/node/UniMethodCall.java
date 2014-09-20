package net.unicoen.node;

import java.util.List;

public class UniMethodCall extends UniExpr {
	public UniExpr receiver;
	public String methodName;
	public List<UniExpr> args;

	@Override
	public String toString() {
		return "MCall(" + methodName + ")";
	}
}
