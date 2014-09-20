package net.unicoen.node;

import java.util.List;

public class UniFuncDec extends UniMemberDec {
	public String funcName;
	public List<String> modifiers;
	public String returnType;
	public List<UniArg> args;
	public List<UniExpr> bodies;

	@Override
	public String toString() {
		return "func " + funcName;
	}
}
