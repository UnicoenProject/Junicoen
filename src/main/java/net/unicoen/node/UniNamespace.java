package net.unicoen.node;

public class UniNamespace extends UniNode {
	public String name;

	public UniNamespace() {
	}

	public UniNamespace(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Namespace(" + name + ")";
	}

	@Override
	public int hashCode() {
		return (name == null ? 0 : name.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniNamespace)) return false;
		UniNamespace that = (UniNamespace)obj;
		return (this.name == null ? that.name == null : this.name.equals(that.name));
	}

	public void merge(UniNamespace that) {
		if (that.name != null) {
			this.name = that.name;
		}
	}
}
