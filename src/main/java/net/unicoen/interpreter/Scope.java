package net.unicoen.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

import net.unicoen.node.UniExpr;

public class Scope {
	public enum Type {
		GLOBAL, OBJECT, LOCAL,
	}

	@FunctionalInterface
	public interface VariableNotFoundListener {
		public void variableNotFound(String variableName,
				Consumer<Object> setDefault);
	}

	private static class ValueSetter implements Consumer<Object> {
		public boolean hasValue;
		public Object value;

		@Override
		public void accept(Object value) {
			this.hasValue = true;
			this.value = value;
		}
	}

	public String name;
	public int depth;
	public final Type type;
	public final Scope parent;
	public final HashMap<String, Object> variables = new HashMap<>();
	private List<VariableNotFoundListener> listeners = null;

	private static void assertNotUnicoen(Object value) {
		if (value instanceof UniExpr) {
			throw new RuntimeException("Maybe programming miss!");
		}
	}

	private Scope(Type type, Scope parent) {
		this.parent = parent;
		this.type = type;
		if(parent==null){
			this.depth = 0;
			this.name = "GLOBAL";
		}
		else{
			this.depth = parent.depth + 1;
		}
	}

	public void setListener(VariableNotFoundListener listener) {
		if (listeners == null) {
			listeners = new ArrayList<>();
		}
		listeners.add(listener);
	}

	public Object get(String key) {
		return getImple(key,name);
	}



	private Object getImple(String key, String stackName) {
		if (variables.containsKey(key)) {
			Object var = variables.get(key);
			if(stackName.equals(name))
				return var;

			//同じstackNameでなければポインタ渡しの場合のみparentからget可能
			if(var instanceof String){
				if(((String)var).startsWith("&")){
					return var;
				}
			}
		}

		if (parent != null) {
			return parent.get(key);
		} else {
			if (listeners != null) {
				ValueSetter setter = new ValueSetter();
				for (VariableNotFoundListener listener : listeners) {
					listener.variableNotFound(key, setter);
					if (setter.hasValue) {
						return setter.value;
					}
				}
			}
			throw new UniRuntimeError(
					String.format("variable '%s' is not defined.", key));
		}
	}

	public Boolean hasValue(String key) {
		try {
			get(key);
			return true;
		} catch (UniRuntimeError e) {
			return false;
		}
	}

	/** 現在のスコープに新しい変数を定義し、代入します */
	public void setTop(String key, Object value) {
		assertNotUnicoen(value);
		variables.put(key, value);
	}

	/** 定義済みの変数に対し、代入します */
	public void set(String key, Object value) {
		assertNotUnicoen(value);
		if (variables.containsKey(key)) {
			variables.put(key, value);
			return;
		}
		if (parent != null) {
			parent.set(key, value);
			return;
		}
		throw new RuntimeException("variable " + key + "is not declared.");
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
