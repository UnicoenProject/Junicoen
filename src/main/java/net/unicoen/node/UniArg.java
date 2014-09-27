package net.unicoen.node;

public class UniArg implements UniNode {
	public String type;
	public String name;

	@Override
	public String toString() {
		return name + ": " + type;
	}
}
