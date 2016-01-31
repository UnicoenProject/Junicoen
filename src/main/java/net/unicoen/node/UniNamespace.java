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
		int result = 17;
		result = result * 31 + (name == null ? 0 : name.hashCode());
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniNamespace)) return false;
		UniNamespace that = (UniNamespace)obj;
		return (this.name == null ? that.name == null : this.name.equals(that.name))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments));
	}

	public void merge(UniNamespace that) {
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
	}
}
