package net.unicoen.node;

import java.util.List;

/** 関数/メソッド呼び出し */
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

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniMethodCall)) return false;
		UniMethodCall that = (UniMethodCall)obj;
		return (this.receiver == null ? that.receiver == null : this.receiver.equals(that.receiver))
			&& (this.methodName == null ? that.methodName == null : this.methodName.equals(that.methodName))
			&& (this.args == null ? that.args == null : this.args.equals(that.args));
	}

	@Override
	public boolean isStatement() {
		return false;
	}
}
