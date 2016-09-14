package net.unicoen.interpreter;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
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

	private class Int{
		public Int(int i) {
			v=i;
		}
		int v;
	}
	public String name;
	public int depth;
	public Int address;
	public Int heapAddress;
	public Int codeAddress;
	public final Type type;
	public final Scope parent;
	public final Scope global;
	public List<Scope> children = new ArrayList<Scope>();
	public final HashMap<String, Integer> variableAddress = new LinkedHashMap<>();
	public final HashMap<String, String> variableTypes = new LinkedHashMap<>();
	public final HashMap<Integer, Integer> mallocData;
	public final HashMap<Integer, Object> objectOnMemory;
	public final HashMap<Integer, String> typeOnMemory;
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
			address = new Int(0);
			heapAddress= new Int(10000);
			codeAddress = new Int(20000);
			mallocData = new LinkedHashMap<>();
			objectOnMemory = new LinkedHashMap<>();
			typeOnMemory = new LinkedHashMap<>();
		}
		else{
			parent.children.add(this);
			this.depth = parent.depth + 1;
			this.name = parent.name;
			this.global = parent.global;
			this.address = parent.address;
			this.address.v++;
			this.heapAddress = parent.heapAddress;
			this.codeAddress = parent.codeAddress;
			this.mallocData = parent.mallocData;
			this.objectOnMemory = parent.objectOnMemory;
			this.typeOnMemory = parent.typeOnMemory;
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
		int address = getAddress(key);
		if(typeOnMemory.containsKey(address)){
			String type = typeOnMemory.get(address);
			int byteSize = CppEngine.sizeof(type);
			List<Byte> bytes = getValue(address,byteSize);
			Object value = CppEngine.fromByteArray(type, bytes);
			return value;
		}
		else{
			return getValue(address);
		}
	}

	public Object getValue(int key) {
		return getValueImple(key,name);
	}
	public List<Byte> getValue(int key, int byteSize) {
		List<Byte> bytes = new ArrayList<Byte>();
		return getValueImple(key,name,byteSize,bytes);
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
	private List<Byte> getValueImple(int key, String stackName, int byteSize, List<Byte> bytes) {

		if (objectOnMemory.containsKey(key)) {
			for(int i=0;i<byteSize;++i){
				Object var = objectOnMemory.get(key+i);
				if(stackName.equals(name) || this.type==Type.GLOBAL){
					if(var instanceof Byte){
						bytes.add((Byte) var);
					}
				}
			}
			return bytes;
		}

		if (parent != null) {
			return parent.getValueImple(key,stackName,byteSize,bytes);
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


	public void setMallocSize(int address,int size){
		mallocData.put(address, size);
	}
	public boolean isMallocArea(int address){
		return mallocData.containsKey(address);
	}
	public int getMallocSize(int address){
		return mallocData.get(address);
	}
	public boolean removeOnMemory(int address,int size){
		boolean result = true;
		for(int i=0;i<size;++i){
			result = (objectOnMemory.remove(address+i)!=null);
			result = (typeOnMemory.remove(address+i)!=null);
		}
		return result;
	}

	public int setHeap(Object value,String type){
		assertNotUnicoen(value);
		objectOnMemory.put(heapAddress.v, value);
		typeOnMemory.put(heapAddress.v, type);
		return heapAddress.v++;
	}

	public int setCode(Object value,String type){
		assertNotUnicoen(value);
		objectOnMemory.put(codeAddress.v, value);
		typeOnMemory.put(codeAddress.v, type);
		return codeAddress.v++;
	}

	/** 現在のスコープに新しい変数を定義し、代入します */
	public void setTop(String key, Object value, String type) {
		assertNotUnicoen(value);
		if(hasValue(type)){//構造体
			setPrimitive(key, address.v+1, type);
			Map<String, Integer> offsets = (Map<String, Integer>) get(type);
			List<Object> arr=null;
			if(value instanceof List){//初期化リストあり
				arr = (List<Object>) value;
				for(int i=arr.size(); i < offsets.size(); ++ i){
					arr.add(0);
				}
			}
			else if(value instanceof Integer){//コピー
				arr = new ArrayList<Object>();
				for(Map.Entry<String, Integer> offset : offsets.entrySet()) {
				    int addr = (int)value;
					addr += offset.getValue();
					Object v = getValue(addr);
					arr.add(v);
				}
			}
			else{//宣言のみ
				arr = new ArrayList<Object>();
				for(int i=0; i < offsets.size(); ++ i){
					arr.add(null);
				}
			}
			setArray(arr,type);
		}
		else if(value instanceof List){//配列の場合
			List<Object> arr = (List<Object>) value;
			setPrimitiveOnCode(key, address.v, type+"["+arr.size()+"]");
			setArray(arr,type);
		}
		else{//組み込み型の場合
			setPrimitive(key,value,type);
		}
	}

	private void setArray(List<Object> value, String type){
		assertNotUnicoen(value);
		for(Object var : value){
			if(var instanceof List){
				setArray((List<Object>)var,type);
			}
			else{
				typeOnMemory.put(address.v, type);
				objectOnMemory.put(address.v++, var);
			}
		}
	}

	private void setImple(String key, Object value, String type,Int _address){
		assertNotUnicoen(value);
		variableTypes.put(key, type);
		variableAddress.put(key, _address.v);
		typeOnMemory.put(_address.v, type);
		int byteSize = CppEngine.sizeof(type);
		byte[] bytes = null;
		if(value instanceof Byte){
			bytes = ByteBuffer.allocate(Byte.BYTES).put(Byte.parseByte(value.toString())).array();
		}
		else if(value instanceof Short){
			bytes = ByteBuffer.allocate(Short.BYTES).putShort(Short.parseShort(value.toString())).array();
		}
		else if(value instanceof Integer){
			bytes = ByteBuffer.allocate(Integer.BYTES).putInt(Integer.parseInt(value.toString())).array();
		}
		else if(value instanceof Long){
			bytes = ByteBuffer.allocate(Long.BYTES).putLong(Long.parseLong(value.toString())).array();
		}
		else if(value instanceof Float){
			bytes = ByteBuffer.allocate(Float.BYTES).putFloat(Float.parseFloat(value.toString())).array();
		}
		else if(value instanceof Double){
			bytes = ByteBuffer.allocate(Double.BYTES).putDouble(Double.parseDouble(value.toString())).array();
		}
//		else if(value instanceof Boolean){
//
//		}
		else{
			objectOnMemory.put(_address.v, value);
			++_address.v;
		}
		
		if(bytes != null){
			for(int i=0; i<byteSize; ++i){
				objectOnMemory.put(_address.v, bytes[bytes.length-1-i]);//リトルエンディアン
				++_address.v;
			}
		}
	}
	
	private void setPrimitive(String key, Object value, String type){
		setImple(key,value,type,address);
	}

	private void setPrimitiveOnCode(String key, Object value, String type){
		setImple(key,value,type,codeAddress);
	}

	private void setPrimitiveOnHeap(String key, Object value, String type){
		setImple(key,value,type,heapAddress);
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
