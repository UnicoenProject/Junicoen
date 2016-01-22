package net.unicoen.node;

public class UniImport extends UniNode {
	public String targetName;
	public boolean isStatic;

	public UniImport() {
	}

	public UniImport(String targetName, boolean isStatic) {
		this.targetName = targetName;
		this.isStatic = isStatic;
	}

	@Override
	public String toString() {
		return "Import(" + targetName + ", " + isStatic + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (targetName == null ? 0 : targetName.hashCode());
		result = result * 31 + (isStatic ? 1 : 0);
		result = result * 31 + (comment == null ? 0 : comment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniImport)) return false;
		UniImport that = (UniImport)obj;
		return (this.targetName == null ? that.targetName == null : this.targetName.equals(that.targetName))
			&& this.isStatic == that.isStatic
			&& (this.comment == null ? that.comment == null : this.comment.equals(that.comment));
	}

	public void merge(UniImport that) {
		if (that.targetName != null) {
			this.targetName = that.targetName;
		}
		if (that.isStatic) {
			this.isStatic = true;
		}
		if (that.comment != null) {
			this.comment = that.comment;
		}
	}
}
