package net.unicoen.node;
import net.unicoen.node_helper.*;

public class UniArg extends UniMemberDec {
	public String type;
	public String name;

	public UniArg() {
	}

	public UniArg(String type, String name) {
		this.type = type;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Arg(" + type + ", " + name + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (type == null ? 0 : type.hashCode());
		result = result * 31 + (name == null ? 0 : name.hashCode());
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		result = result * 31 + (codeRange == null ? 0 : codeRange.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniArg)) return false;
		UniArg that = (UniArg)obj;
		return (this.type == null ? that.type == null : this.type.equals(that.type))
			&& (this.name == null ? that.name == null : this.name.equals(that.name))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments))
			&& (this.codeRange == null ? that.codeRange == null : this.codeRange.equals(that.codeRange));
	}

	public void merge(UniArg that) {
		if (that.type != null) {
			this.type = that.type;
		}
		if (that.name != null) {
			this.name = that.name;
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
