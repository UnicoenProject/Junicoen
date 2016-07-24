package net.unicoen.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import net.unicoen.node.UniExpr;

public class Scope {
	public enum Type {
		GLOBAL, OBJECT, LOCAL,
	}

	@FunctionalInterface
	public interface VariableNotFoundListener {
		public void variableNotFound(String key,
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
	public int address;
	public final Type type;
	public final Scope parent;
	public final Scope global;
	public List<Scope> children = new ArrayList<Scope>();
	public final HashMap<String, Integer> variableAddress = new LinkedHashMap<>();
	public final HashMap<String, String> variableTypes = new LinkedHashMap<>();
	public final HashMap<Integer, Object> objectOnMemory = new LinkedHashMap<>();
	public final HashMap<Integer, String> typeOnMemory = new LinkedHashMap<>();
	private List<VariableNotFoundListener> listeners = null;
	private final int tempAddressForListener = -1;

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
			this.global = this;
			address = 0;
		}
		else{
			parent.children.add(this);
			this.depth = parent.depth + 1;
			this.name = parent.name;
			this.global = parent.global;
			address = parent.address;
		}
	}

	public void setListener(VariableNotFoundListener listener) {
		if (listeners == null) {
			listeners = new ArrayList<>();
		}
		listeners.add(listener);
	}

	public Boolean hasValue(String key) {
		try {
			getValue(getAddress(key));
			return true;
		} catch (UniRuntimeError e) {
			return false;
		}
	}

	public Object get(String key) {
		return getValue(getAddress(key));
	}

	public Object getValue(int key) {
		return getValueImple(key,name);
	}

	private Object getValueImple(int key, String stackName) {
		if (objectOnMemory.containsKey(key)) {
			Object var = objectOnMemory.get(key);
			if(stackName.equals(name) || this.type==Type.GLOBAL)
			{
				if(key == tempAddressForListener)
					objectOnMemory.remove(tempAddressForListener);
				return var;
			}
		}

		if (parent != null) {
			return parent.getValue(key);
		} else {
			throw new UniRuntimeError(
					String.format("variable '%s' is not defined.", key));
		}
	}

	public String getType(String key) {
		if (variableTypes.containsKey(key)){
			return variableTypes.get(key);
		}
		else if (parent != null) {
			return parent.getType(key);
		}

		throw new UniRuntimeError(
				String.format("variable '%s' is not defined.", key));
	}

	public int getAddress(String key){
		if (variableAddress.containsKey(key)){
			return variableAddress.get(key);
		}
		else if (parent != null) {
			return parent.getAddress(key);
		}
		else if (listeners != null) {
			ValueSetter setter = new ValueSetter();
			for (VariableNotFoundListener listener : listeners) {
				listener.variableNotFound(key, setter);
				if (setter.hasValue) {
					objectOnMemory.put(tempAddressForListener,setter.value);
					return -1;
				}
			}
		}
		throw new UniRuntimeError(
				String.format("variable '%s' is not defined.", key));
	}

	public String getType(int key){
		if (typeOnMemory.containsKey(key)){
			return typeOnMemory.get(key);
		}
		else if (parent != null) {
			return parent.getType(key);
		}
		throw new UniRuntimeError(
				String.format("variable '%s' is not defined.", key));
	}

	/** 現在のスコープに新しい変数を定義し、代入します */
	public void setTop(String key, Object value, String type) {
		assertNotUnicoen(value);
		if(hasValue(type)){//構造体
			setPrimitive(key, address+1, type);
			Map<String, Integer> offsets = (Map<String, Integer>) get(type);
			List<Object> arr=null;
			if(value instanceof List){//初期化リストあり
				arr = (List<Object>) value;
				for(int i=arr.size(); i < offsets.size(); ++ i){
					arr.add(0);
				}
			}
			else if(value instanceof Integer){//代入
				arr = new ArrayList<Object>();
				for(Map.Entry<String, Integer> offset : offsets.entrySet()) {
				    int address = (int)value;
					address += offset.getValue();
					Object v = getValue(address);
					arr.add(v);
				}
			}
			else{//宣言のみ
				arr = new ArrayList<Object>();
				for(int i=0; i < offsets.size(); ++ i){
					arr.add(null);
				}
			}
			setArray(arr);
		}
		else if(value instanceof List){//配列の場合
			List<Object> arr = (List<Object>) value;
			setPrimitive(key, address+1, type+"["+arr.size()+"]");
			setArray(arr);
		}
		else{//組み込み型の場合
			setPrimitive(key,value,type);
		}
	}

	private void setArray(List<Object> value){
		assertNotUnicoen(value);
		for(Object var : value){
			if(var instanceof List){
				setArray((List<Object>)var);
			}
			else{
				objectOnMemory.put(address++, var);
			}
		}
	}

	private void setPrimitive(String key, Object value, String type){
		assertNotUnicoen(value);
		variableTypes.put(key, type);
		variableAddress.put(key, address);
		objectOnMemory.put(address, value);
		typeOnMemory.put(address, type);
		++address;
	}

	/** 指定したメモリアドレスに値を書き込みます */
	public void set(int key, Object value) {
		assertNotUnicoen(value);
		if (objectOnMemory.containsKey(key)) {
			try{
				String type = getType(key);
				Map<String, Integer> offsets = (Map<String, Integer>) get(type);
				for(Map.Entry<String, Integer> offset : offsets.entrySet()) {
				    int dst = (int)getValue(key) + offset.getValue();
				    int src = (int)value + offset.getValue();
				    Object v = this.getValue(src);
				    objectOnMemory.put(dst, v);
				}
			}catch(RuntimeException e){
				objectOnMemory.put(key, value);
			}
			return;
		}
		if (parent != null) {
			parent.set(key, value);
			return;
		}
		throw new RuntimeException("address " + key + "is not declared.");
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

	public boolean removeChild(Scope scope){
		return children.remove(scope);
	}

	private boolean hasName(String funcName){
		if (this.name.equals(funcName)){
			return true;
		}
		else if (parent != null) {
			return parent.hasName(funcName);
		}
		return false;
	}
	public String getNextName(String funcName){
		if(!hasName(funcName))
			return funcName;
		for(int i=2;	;++i){
			String indexName = funcName + "." + i;
			if(!hasName(indexName)){
				return indexName;
			}
		}
	}
}
