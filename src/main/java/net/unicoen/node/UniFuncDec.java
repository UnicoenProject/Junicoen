package net.unicoen.node;

import java.util.List;

public class UniFuncDec extends UniMemberDec {
	public String funcName;
	public List<String> modifiers;
	public String returnType;
	public List<UniArg> args;
	public List<UniExpr> body;

	public UniFuncDec() {
	}

	public UniFuncDec(String funcName, List<String> modifiers, String returnType, List<UniArg> args, List<UniExpr> body) {
		this.funcName = funcName;
		this.modifiers = modifiers;
		this.returnType = returnType;
		this.args = args;
		this.body = body;
	}

	@Override
	public String toString() {
		return "FuncDec(" + funcName + ", " + returnType + ")";
	}
}
