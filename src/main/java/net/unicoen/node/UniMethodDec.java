package net.unicoen.node;

import java.util.List;

public class UniMethodDec extends UniMemberDec {
	public String methodName;
	public List<String> modifiers;
	public String returnType;
	public List<UniArg> args;
	public UniBlock block;

	public UniMethodDec() {
	}

	public UniMethodDec(String methodName, List<String> modifiers, String returnType, List<UniArg> args, UniBlock block) {
		this.methodName = methodName;
		this.modifiers = modifiers;
		this.returnType = returnType;
		this.args = args;
		this.block = block;
	}

	@Override
	public String toString() {
		return "MethodDec(" + methodName + ", " + returnType + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniMethodDec)) return false;
		UniMethodDec that = (UniMethodDec)obj;
		return (this.methodName == null ? that.methodName == null : this.methodName.equals(that.methodName))
			&& (this.modifiers == null ? that.modifiers == null : this.modifiers.equals(that.modifiers))
			&& (this.returnType == null ? that.returnType == null : this.returnType.equals(that.returnType))
			&& (this.args == null ? that.args == null : this.args.equals(that.args))
			&& (this.block == null ? that.block == null : this.block.equals(that.block));
	}
}
