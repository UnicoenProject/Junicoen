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
}
