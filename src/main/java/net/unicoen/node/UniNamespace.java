package net.unicoen.node;

public class UniNamespace extends UniNode {
	public String packageName;

	public UniNamespace() {
	}

	public UniNamespace(String packageName) {
		this.packageName = packageName;
	}

	@Override
	public String toString() {
		return "Namespace(" + packageName + ")";
	}

	@Override
	public int hashCode() {
		return (packageName == null ? 0 : packageName.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniNamespace)) return false;
		UniNamespace that = (UniNamespace)obj;
		return (this.packageName == null ? that.packageName == null : this.packageName.equals(that.packageName));
	}

	public void merge(UniNamespace that) {
		if (that.packageName != null) {
			this.packageName = that.packageName;
		}
	}
}
