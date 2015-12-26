package net.unicoen.node;

public class UniImport extends UniNode {
	public String packageName;
	public boolean isStatic;

	public UniImport() {
	}

	public UniImport(String packageName, boolean isStatic) {
		this.packageName = packageName;
		this.isStatic = isStatic;
	}

	@Override
	public String toString() {
		return "Import(" + packageName + ", " + isStatic + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (packageName == null ? 0 : packageName.hashCode());
		result = result * 31 + (isStatic ? 1 : 0);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniImport)) return false;
		UniImport that = (UniImport)obj;
		return (this.packageName == null ? that.packageName == null : this.packageName.equals(that.packageName))
			&& this.isStatic == that.isStatic;
	}

	public void merge(UniImport that) {
		if (that.packageName != null) {
			this.packageName = that.packageName;
		}
		if (that.isStatic) {
			this.isStatic = true;
		}
	}
}
