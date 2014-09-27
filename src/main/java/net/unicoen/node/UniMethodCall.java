package net.unicoen.node;

import java.util.List;

public class UniMethodCall extends UniExpr implements UniNode {
	public UniExpr receiver;
	public String methodName;
	public List<UniExpr> args;

	@Override
	public String toString() {
		return "MCall(" + methodName + ")";
	}
}
