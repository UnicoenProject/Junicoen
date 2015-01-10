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
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniArg)) return false;
		UniArg that = (UniArg)obj;
		return (this.type == null ? that.type == null : this.type.equals(that.type))
			&& (this.name == null ? that.name == null : this.name.equals(that.name));
	}
}
