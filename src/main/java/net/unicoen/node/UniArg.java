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
}
