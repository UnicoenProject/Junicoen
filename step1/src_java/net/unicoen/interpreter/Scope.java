package net.unicoen.interpreter;

import java.util.HashMap;

public class Scope {
	private final Scope parent;
	private final HashMap<String, Object> variables = new HashMap<>();

	public Scope() {
		parent = null;
	}

	public Scope(Scope parent) {
		this.parent = parent;
	}

	public Object get(String key) {
		if (parent == null) {
			return variables.get(key);
		} else {
			if (variables.containsKey(key)) {
				return variables.get(key);
			} else {
				return parent.get(key);
			}
		}
	}

	public void set(String key, Object value) {
		if (trySet(key, value) == false) {
			variables.put(key, value);
		}
	}

	private boolean trySet(String key, Object value) {
		if (variables.containsKey(key)) {
			variables.put(key, value);
			return true;
		}
		if (parent != null) {
			return parent.trySet(key, value);
		} else {
			return false;
		}
	}
}
