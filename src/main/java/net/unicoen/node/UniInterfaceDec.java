package net.unicoen.node;

import java.util.List;

public class UniInterfaceDec extends UniNode {
	public String interfaceName;
	public List<String> modifiers;
	public List<UniMemberDec> members;
	public List<String> superInterface;

	public UniInterfaceDec() {
	}

	public UniInterfaceDec(String interfaceName, List<String> modifiers, List<UniMemberDec> members, List<String> superInterface) {
		this.interfaceName = interfaceName;
		this.modifiers = modifiers;
		this.members = members;
		this.superInterface = superInterface;
	}

	@Override
	public String toString() {
		return "InterfaceDec(" + interfaceName + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (interfaceName == null ? 0 : interfaceName.hashCode());
		result = result * 31 + (modifiers == null ? 0 : modifiers.hashCode());
		result = result * 31 + (members == null ? 0 : members.hashCode());
		result = result * 31 + (superInterface == null ? 0 : superInterface.hashCode());
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniInterfaceDec)) return false;
		UniInterfaceDec that = (UniInterfaceDec)obj;
		return (this.interfaceName == null ? that.interfaceName == null : this.interfaceName.equals(that.interfaceName))
			&& (this.modifiers == null ? that.modifiers == null : this.modifiers.equals(that.modifiers))
			&& (this.members == null ? that.members == null : this.members.equals(that.members))
			&& (this.superInterface == null ? that.superInterface == null : this.superInterface.equals(that.superInterface))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments));
	}

	public void merge(UniInterfaceDec that) {
		if (that.interfaceName != null) {
			this.interfaceName = that.interfaceName;
		}
		if (that.modifiers != null) {
			if (this.modifiers == null) {
				this.modifiers = that.modifiers;
			} else {
				this.modifiers.addAll(that.modifiers);
			}
		}
		if (that.members != null) {
			if (this.members == null) {
				this.members = that.members;
			} else {
				this.members.addAll(that.members);
			}
		}
		if (that.superInterface != null) {
			if (this.superInterface == null) {
				this.superInterface = that.superInterface;
			} else {
				this.superInterface.addAll(that.superInterface);
			}
		}
		if (that.comments != null) {
			if (this.comments == null) {
				this.comments = that.comments;
			} else {
				this.comments.addAll(that.comments);
			}
		}
	}
}
