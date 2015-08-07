package net.unicoen.node;

import java.util.List;

public class UniClassDec implements UniNode {
	public String className;
	public List<String> modifiers;
	public List<UniMemberDec> members;
	public List<String> superClass;
	public List<String> interfaces;
	public List<UniClassDec> innerClasses;

	public UniClassDec() {
	}

	public UniClassDec(String className, List<String> modifiers, List<UniMemberDec> members, List<String> superClass, List<String> interfaces, List<UniClassDec> innerClasses) {
		this.className = className;
		this.modifiers = modifiers;
		this.members = members;
		this.superClass = superClass;
		this.interfaces = interfaces;
		this.innerClasses = innerClasses;
	}

	@Override
	public String toString() {
		return "ClassDec(" + className + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (className == null ? 0 : className.hashCode());
		result = result * 31 + (modifiers == null ? 0 : modifiers.hashCode());
		result = result * 31 + (members == null ? 0 : members.hashCode());
		result = result * 31 + (superClass == null ? 0 : superClass.hashCode());
		result = result * 31 + (interfaces == null ? 0 : interfaces.hashCode());
		result = result * 31 + (innerClasses == null ? 0 : innerClasses.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniClassDec)) return false;
		UniClassDec that = (UniClassDec)obj;
		return (this.className == null ? that.className == null : this.className.equals(that.className))
			&& (this.modifiers == null ? that.modifiers == null : this.modifiers.equals(that.modifiers))
			&& (this.members == null ? that.members == null : this.members.equals(that.members))
			&& (this.superClass == null ? that.superClass == null : this.superClass.equals(that.superClass))
			&& (this.interfaces == null ? that.interfaces == null : this.interfaces.equals(that.interfaces))
			&& (this.innerClasses == null ? that.innerClasses == null : this.innerClasses.equals(that.innerClasses));
	}

	public void merge(UniClassDec that) {
		if (that.className != null) {
			this.className = that.className;
		}
		if (that.modifiers != null) {
			if (this.modifiers != null) {
				this.modifiers = that.modifiers;
			} else {
				this.modifiers.addAll(that.modifiers);
			}
		}
		if (that.members != null) {
			if (this.members != null) {
				this.members = that.members;
			} else {
				this.members.addAll(that.members);
			}
		}
		if (that.superClass != null) {
			if (this.superClass != null) {
				this.superClass = that.superClass;
			} else {
				this.superClass.addAll(that.superClass);
			}
		}
		if (that.interfaces != null) {
			if (this.interfaces != null) {
				this.interfaces = that.interfaces;
			} else {
				this.interfaces.addAll(that.interfaces);
			}
		}
		if (that.innerClasses != null) {
			if (this.innerClasses != null) {
				this.innerClasses = that.innerClasses;
			} else {
				this.innerClasses.addAll(that.innerClasses);
			}
		}
	}
}
