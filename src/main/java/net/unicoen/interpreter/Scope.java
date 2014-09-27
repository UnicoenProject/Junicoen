package net.unicoen.interpreter;

import java.util.HashMap;

public class Scope {
	public enum Type {
		GLOBAL, OBJECT, LOCAL,
	}

	public final Type type;
	public final Scope parent;
	public final HashMap<String, Object> variables = new HashMap<>();

	private Scope(Type type, Scope parent) {
		this.parent = parent;
		this.type = type;
	}

	public Object get(String key) {
		if (variables.containsKey(key)) {
			return variables.get(key);
		}
		if (parent != null) {
			return parent.get(key);
		} else {
			throw new UniRuntimeError(String.format("variable '%s' is not defined.", key));
		}
	}

	public void setTop(String key, Object value) {
		variables.put(key, value);
	}

	public static Scope createGlobal() {
		return new Scope(Scope.Type.GLOBAL, null);
	}

	public static Scope createObject(Scope global) {
		assert global != null;
		assert global.type == Type.GLOBAL; // 匿名クラスは未対応
		return new Scope(Scope.Type.OBJECT, global);
	}

	public static Scope createLocal(Scope parent) {
		assert parent != null;
		return new Scope(Scope.Type.LOCAL, parent);
	}
}
