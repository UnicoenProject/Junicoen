package net.unicoen.node;

import java.util.List;

public class UniMethodCall extends UniExpr {
	public UniExpr receiver;
	public String methodName;
	public List<UniExpr> args;

	public UniMethodCall() {
	}

	public UniMethodCall(UniExpr receiver, String methodName, List<UniExpr> args) {
		this.receiver = receiver;
		this.methodName = methodName;
		this.args = args;
	}

	@Override
	public String toString() {
		return "MethodCall(" + methodName + ")";
	}
}
