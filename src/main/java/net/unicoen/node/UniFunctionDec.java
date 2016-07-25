package net.unicoen.node;

import java.util.List;
import net.unicoen.node_helper.*;

public class UniFunctionDec extends UniExpr {
	public String functionName;
	public List<String> modifiers;
	public String returnType;
	public List<UniArg> args;
	public UniBlock block;

	public UniFunctionDec() {
	}

	public UniFunctionDec(String functionName, List<String> modifiers, String returnType, List<UniArg> args, UniBlock block) {
		this.functionName = functionName;
		this.modifiers = modifiers;
		this.returnType = returnType;
		this.args = args;
		this.block = block;
	}

	@Override
	public String toString() {
		return "FunctionDec(" + functionName + ", " + returnType + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (functionName == null ? 0 : functionName.hashCode());
		result = result * 31 + (modifiers == null ? 0 : modifiers.hashCode());
		result = result * 31 + (returnType == null ? 0 : returnType.hashCode());
		result = result * 31 + (args == null ? 0 : args.hashCode());
		result = result * 31 + (block == null ? 0 : block.hashCode());
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		result = result * 31 + (codeRange == null ? 0 : codeRange.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniFunctionDec)) return false;
		UniFunctionDec that = (UniFunctionDec)obj;
		return (this.functionName == null ? that.functionName == null : this.functionName.equals(that.functionName))
			&& (this.modifiers == null ? that.modifiers == null : this.modifiers.equals(that.modifiers))
			&& (this.returnType == null ? that.returnType == null : this.returnType.equals(that.returnType))
			&& (this.args == null ? that.args == null : this.args.equals(that.args))
			&& (this.block == null ? that.block == null : this.block.equals(that.block))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments))
			&& (this.codeRange == null ? that.codeRange == null : this.codeRange.equals(that.codeRange));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniFunctionDec that) {
		if (that.functionName != null) {
			this.functionName = that.functionName;
		}
		if (that.modifiers != null) {
			if (this.modifiers == null) {
				this.modifiers = that.modifiers;
			} else {
				this.modifiers.addAll(that.modifiers);
			}
		}
		if (that.returnType != null) {
			this.returnType = that.returnType;
		}
		if (that.args != null) {
			if (this.args == null) {
				this.args = that.args;
			} else {
				this.args.addAll(that.args);
			}
		}
		if (that.block != null) {
			this.block = that.block;
		}
		if (that.comments != null) {
			if (this.comments == null) {
				this.comments = that.comments;
			} else {
				this.comments.addAll(that.comments);
			}
		}
		if (that.codeRange != null) {
			this.codeRange = that.codeRange;
		}
	}
}
