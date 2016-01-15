package net.unicoen.node;

public class UniCast extends UniNode {
	public String type;

	public UniCast() {
	}

	public UniCast(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Cast(" + type + ")";
	}

	@Override
	public int hashCode() {
		return (type == null ? 0 : type.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniCast)) return false;
		UniCast that = (UniCast)obj;
		return (this.type == null ? that.type == null : this.type.equals(that.type));
	}

	public void merge(UniCast that) {
		if (that.type != null) {
			this.type = that.type;
		}
	}
}
