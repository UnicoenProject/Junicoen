package net.unicoen.node;

public class UniArg {
	public String type;
	public String name;

	public UniArg() {
	}

	public UniArg(String type, String name) {
		this.type = type;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Arg(" + type + ", " + name + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (type == null ? 0 : type.hashCode());
		result = result * 31 + (name == null ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniArg)) return false;
		UniArg that = (UniArg)obj;
		return (this.type == null ? that.type == null : this.type.equals(that.type))
			&& (this.name == null ? that.name == null : this.name.equals(that.name));
	}

	public void merge(UniArg that) {
		if (that.type != null) {
			this.type = that.type;
		}
		if (that.name != null) {
			this.name = that.name;
		}
	}
}
