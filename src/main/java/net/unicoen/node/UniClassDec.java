package net.unicoen.node;

import java.util.List;

public class UniClassDec {
	public String className;
	public List<String> modifiers;
	public List<UniMemberDec> members;

	@Override
	public String toString() {
		return "class " + className;
	}
}
