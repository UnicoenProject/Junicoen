package net.unicoen.node;

import java.util.List;

public class UniFuncDec extends UniMemberDec {
	public String funcName;
	public List<String> modifiers;
	public String returnType;
	public List<UniArg> args;
	public UniBlock block;

	public UniFuncDec() {
	}

	public UniFuncDec(String funcName, List<String> modifiers, String returnType, List<UniArg> args, UniBlock block) {
		this.funcName = funcName;
		this.modifiers = modifiers;
		this.returnType = returnType;
		this.args = args;
		this.block = block;
	}

	@Override
	public String toString() {
		return "FuncDec(" + funcName + ", " + returnType + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniFuncDec)) return false;
		UniFuncDec that = (UniFuncDec)obj;
		return (this.funcName == null ? that.funcName == null : this.funcName.equals(that.funcName))
			&& (this.modifiers == null ? that.modifiers == null : this.modifiers.equals(that.modifiers))
			&& (this.returnType == null ? that.returnType == null : this.returnType.equals(that.returnType))
			&& (this.args == null ? that.args == null : this.args.equals(that.args))
			&& (this.block == null ? that.block == null : this.block.equals(that.block));
	}
}
