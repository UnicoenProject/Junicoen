package net.unicoen.node;

import java.util.List;

public class UniClassDec implements UniNode {
	public String className;
	public List<String> modifiers;
	public List<UniMemberDec> members;

	public UniClassDec() {
	}

	public UniClassDec(String className, List<String> modifiers, List<UniMemberDec> members) {
		this.className = className;
		this.modifiers = modifiers;
		this.members = members;
	}

	@Override
	public String toString() {
		return "ClassDec(" + className + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniClassDec)) return false;
		UniClassDec that = (UniClassDec)obj;
		return (this.className == null ? that.className == null : this.className.equals(that.className))
			&& (this.modifiers == null ? that.modifiers == null : this.modifiers.equals(that.modifiers))
			&& (this.members == null ? that.members == null : this.members.equals(that.members));
	}
}
