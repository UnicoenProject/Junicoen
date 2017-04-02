package net.unicoen.interpreter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import net.unicoen.node.UniCast;
import net.unicoen.node.UniCharacterLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniUnaryOp;

public class CppEngine extends Engine {

	@Override
	protected void loadLibarary(Scope global){
		includeStdio(global);
		includeStdlib(global);
		includeMath(global);
		global.setFunc("sizeof", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				if(args[0] instanceof String){
					return CppEngine.sizeof((String) args[0]);
				}
				else{
					return CppEngine.sizeof(BytesToStr((List<Byte>) args[0]));
				}

			}
		},"int");
	}

	protected void includeStdio(Scope global){
		global.setFunc("printf", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				if(args.length<1)
					return 0;
				String text = BytesToStr((List<Byte>) args[0]);
				text = text.replace("\\n", "\n");
				for(int i=1;i<args.length;++i){
					if(global.typeOnMemory.containsKey(args[i])){
						final String type = global.typeOnMemory.get(args[i]);
						if(type.contains("char")){
							args[i] = charArrToStr(global.objectOnMemory,(int)args[i]);
						}
					}
				}
				final String s = String.format(text,Arrays.copyOfRange(args,1,args.length));
				engine.out.print(s);
				return s.length();
			}
		},"int");
	}
	protected void includeStdlib(Scope global){
		global.setFunc("malloc", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				int byteSize = (int)args[0];
				int heapAddress = global.malloc(byteSize);
				return heapAddress;
			}
		},"void*");
		global.setFunc("free", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				int address = (int)args[0];
				int size = global.getMallocSize(address);
				return global.removeOnMemory(address, size);
			}
		},"void");
		global.setFunc("abs", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.abs((int) args[0]);
			}
		},"int");
		global.setFunc("rand", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return (int)(Math.random()*Integer.MAX_VALUE);
			}
		},"int");
		global.setFunc("fopen", new FunctionWithEngine() {
			@SuppressWarnings("unchecked")
			@Override
			public Object invoke(Engine engine, Object[] args) {//args[0]:ファイル名, args[1]:モード
				String filename = isBytes(args[0]) ? BytesToStr((List<Byte>) args[0]) : (String) args[0];
				String filepath = fileDir + '\\' + filename;
				String mode = isBytes(args[1]) ? BytesToStr((List<Byte>) args[1]) : (String) args[1];
				BufferedReader br = null;
				switch(mode){
					//テキスト
				case "r":
					try {
						br = new BufferedReader(new FileReader(filepath));
					} catch (FileNotFoundException e) {
						// TODO 自動生成された catch ブロック
						e.printStackTrace();
					}
					break;
				case "w":
					break;
				case "a":
					break;
				case "rb":
					break;
				case "r+":
					break;
				case "w+":
					break;
				case "a+":
					break;
					//バイナリ
				case "wb":
					break;
				case "ab":
					break;
				case "r+b":
				case "rb+":
					break;
				case "w+b":
				case "wb+":
					break;
				case "a+b":
				case "ab+":
					break;
				default:
					break;
				}
			return br;
			}
		},"FILE*");
		global.setFunc("fgetc", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {//args[0]:ファイル名, args[1]:モード
				BufferedReader br = (BufferedReader)args[0];
				int ch = -1;
				try {
					ch = br.read();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				return ch;
			}
		},"int");
	}
	protected void includeMath(Scope global){
		//逆三角関数
		global.setFunc("acos", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.acos((double) args[0]);
			}
		},"double");
		global.setFunc("asin", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.asin((double) args[0]);
			}
		},"double");
		global.setFunc("atan", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.atan((double) args[0]);
			}
		},"double");

		//三角関数
		global.setFunc("cos", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.cos((double) args[0]);
			}
		},"double");
		global.setFunc("sin", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.sin((double) args[0]);
			}
		},"double");
		global.setFunc("tan", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.tan((double) args[0]);
			}
		},"double");

		//双曲線関数
		global.setFunc("cosh", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.cosh((double) args[0]);
			}
		},"double");
		global.setFunc("sinh", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.sinh((double) args[0]);
			}
		},"double");
		global.setFunc("tanh", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.tanh((double) args[0]);
			}
		},"double");




		global.setFunc("exp", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.exp((double) args[0]);
			}
		},"double");
		global.setFunc("exp2", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.pow(2.0,(double) args[0]);
			}
		},"double");
		global.setFunc("expm1", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.expm1((double) args[0]);
			}
		},"double");

		//frexp
		//ldexp

		global.setFunc("log", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.log((double) args[0]);
			}
		},"double");
		global.setFunc("log10", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.log10((double) args[0]);
			}
		},"double");
		global.setFunc("log1p", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.log1p((double) args[0]);
			}
		},"double");

		//modf(double,double*)

		global.setFunc("cbrt", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.cbrt((double) args[0]);
			}
		},"double");
		global.setFunc("fabs", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.abs((double) args[0]);
			}
		},"double");
		global.setFunc("hypot", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.hypot((double) args[0],(double) args[1]);
			}
		},"double");

		global.setFunc("pow", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.pow((double) args[0],(double) args[1]);
			}
		},"double");
		global.setFunc("sqrt", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.sqrt((double) args[0]);
			}
		},"double");

		global.setFunc("ceil", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.ceil((double) args[0]);
			}
		},"double");
		global.setFunc("floor", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.floor((double) args[0]);
			}
		},"double");
		global.setFunc("rint", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.rint((double) args[0]);
			}
		},"double");
		global.setFunc("round", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.round((double) args[0]);
			}
		},"double");

		global.setFunc("fdim", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				double a = Math.abs((double) args[0]);
				double b = Math.abs((double) args[1]);
				return Math.abs(Math.max(a, b)-Math.min(a, b));
			}
		},"double");
		global.setFunc("fmax", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.max((double) args[0],(double) args[1]);
			}
		},"double");
		global.setFunc("fmin", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.min((double) args[0],(double) args[1]);
			}
		},"double");

		global.setFunc("fmod", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return (double)args[0] % (double)args[1];
			}
		},"double");
	}

	@Override
	protected Object execUniCharacterLiteral(UniCharacterLiteral expr, Scope scope){
		byte[] bytes = ByteBuffer.allocate(Character.BYTES).putChar((char)expr.value).array();
		if(bytes[0]<0)
			return bytes;
		else
			return bytes[1];
	}

	@Override
	protected Object execUniStringLiteral(UniStringLiteral expr, Scope scope){
		return StrToBytes(((UniStringLiteral) expr).value);
	}

	public static <T> boolean isBytes(Object obj) {
		if (obj instanceof List<?>) {
            List<?> list = (List<?>)obj;
            for (Object o : list) {
                if (o instanceof Byte) {
                }
                else{
                	return false;
                }
            }
        }
		return true;
	}

	public static List<Byte> StrToBytes(String str){
		byte [] data = str.getBytes();
		List<Byte> bytes = new ArrayList<>();
		for(byte b : data){
			bytes.add(b);
		}
		bytes.add((byte)0);
		return bytes;
	}

	public static String BytesToStr(List<Byte> bytes){
		byte[] data = new byte[bytes.indexOf((byte)0)];
		for(int i=0;i<data.length;++i){
			data[i] = bytes.get(i);
		}
		return new String(data);
	}

	@Override
	protected Object execBinOp(String op, UniExpr left, UniExpr right,Scope scope) {
		if(op.equals("++") || op.equals("--")){
			op = "_" + op;
			return execUnaryOp(new UniUnaryOp(op,left),scope);
		}
		return super.execBinOp(op, left,right,scope);
	}

	@Override
	protected Object execUnaryOp(UniUnaryOp uniOp, Scope scope) {
		if(uniOp.operator.equals("++") || uniOp.operator.equals("--")){
			uniOp.operator = uniOp.operator + "_";
		}
		return super.execUnaryOp(uniOp,scope);
	}

	@Override
	protected Object execCast(UniCast expr, Scope scope){
		Object value = execExpr(expr.value, scope);
		return _execCast(expr.type,value);
	}

//	private <ReturnType> ReturnType castImple(Object value) {
//		if(value instanceof Byte){
//			byte v = (byte)value;
//			return v;
//		}
//		else if(value instanceof Integer){
//			int v = (int)value;
//			return (ReturnType)v;
//		}
//		else if(value instanceof Long){
//			long v = (long)value;
//			return (ReturnType)v;
//		}
//		else if(value instanceof Double){
//			double v = (double)value;
//			return (ReturnType)v;
//		}
//	}
	@Override
	protected Object _execCast(String type, Object value){
		//Uniはbyte,int,long,double,char(文字),String,
		if(value == null || value instanceof List){
			return value;
		}
        if(type.contains("FILE*")){
            if(value instanceof BufferedReader)
                return value;
            else {
                BufferedReader br = null;
                return br;
            }
        }
        else if(type.contains("int") || type.contains("long") || type.contains("*")){
			if(value instanceof Byte){
				byte v = (byte)value;
				return v & 0xFFFFFFFF;
			}
			else if(value instanceof Integer){
				return value;
			}
			else if(value instanceof Long){
				long v = (long)value;
				return v & 0xFFFFFFFF;
			}
			else if(value instanceof Double){
				double v = (double)value;
				return (int)v;
			}
		}
		else if(type.contains("short")){
			if(value instanceof Byte){
				byte v = (byte)value;
				return (short)v;
			}
			else if(value instanceof Integer){
				int v = (int)value;
				return (short)v;
			}
			else if(value instanceof Long){
				long v = (long)value;
				return (short)v;
			}
			else if(value instanceof Double){
				double v = (double)value;
				return (short)v;
			}
		}
		else if(type.contains("char")){
			if(type.contains("unsigned")){
				if(value instanceof Character){

				}
				else if(value instanceof Byte){
					byte v = (byte)value;
					return (int)(v & 0xFF);
				}
				if(value instanceof Integer){
					int v = (int)value;
					return (int)(v & 0xFF);
				}
				else if(value instanceof Long){
					long v = (long)value;
					return (int)(v & 0xFF);
				}
				else if(value instanceof Double){
					double v = (double)value;
					int iv = (int)v;
					return iv & 0xFF;
				}
			}
			else{
				if(value instanceof Character){
					char v = (char)value;
					//2byte文字は未対応
					return v & 0xFF;
				}
				else if(value instanceof Byte){
					return value;
				}
				else if(value instanceof Integer){
					int v = (int)value;
					return (byte)(v & 0xFF);
				}
				else if(value instanceof Long){
					long v = (long)value;
					return (byte)(v & 0xFF);
				}
				else if(value instanceof Double){
					double v = (double)value;
					int iv = (int)v;
					return (byte)(iv & 0xFF);
				}
			}
		}
		else if(type.contains("float")){
			if(value instanceof Byte){
				byte v = (byte)value;
				return (float)v;
			}
			else if(value instanceof Integer){
				int v = (int)value;
				return (float)v;
			}
			else if(value instanceof Long){
				long v = (long)value;
				return (float)v;
			}
			else if(value instanceof Double){
				double v = (double)value;
				return (float)v;
			}

		}
		else if(type.contains("double")){
			if(value instanceof Byte){
				byte v = (byte)value;
				return (double)v;
			}
			else if(value instanceof Integer){
				int v = (int)value;
				return (double)v;
			}
			else if(value instanceof Long){
				long v = (long)value;
				return (double)v;
			}
			else if(value instanceof Double){
				double v = (double)value;
				return v;
			}
		}

		return value;
	}

	public abstract class BaseType{
		public boolean unsigned;
		public Long decimalValue;
		public double fractionalValue;
		public int byteSize;
		abstract byte[] asBytes();
	}
	public class Cchar extends BaseType{
		Cchar(long value){
			decimalValue = value;
			unsigned = false;
			byteSize = 1;
		}
		Cchar(byte[] bytes,boolean isUnsigned){
			decimalValue = ByteBuffer.wrap(bytes).getLong();
			unsigned = isUnsigned;
			byteSize = 1;
			if(bytes[0] < 0){//負の数の場合
				long mask = -1;
				mask &= 0x00000000;
				decimalValue |= mask;
			}
		}
		@Override
		byte[] asBytes(){
			return ByteBuffer.allocate(byteSize).putLong(Long.parseLong(decimalValue.toString())).array();
		}
	}

	public class Cint extends BaseType{
		Cint(long value){
			decimalValue = value;
			unsigned = false;
			byteSize = 4;
		}
		Cint(byte[] bytes,boolean isUnsigned){
			decimalValue = ByteBuffer.wrap(bytes).getLong();
			unsigned = isUnsigned;
			byteSize = 4;
		}
		@Override
		byte[] asBytes(){
			return ByteBuffer.allocate(byteSize).putLong(Long.parseLong(decimalValue.toString())).array();
		}
	}
	public static Number fromByteArray(String type, List<Byte> byteArray){
		final int byteSize = sizeofElement(type);

		if(type.contains("*") || type.contains("long") || type.contains("int") || type.contains("short") || type.contains("char")){
			byte[] bytes = new byte[sizeof(type)];
			for(int i=0;i<bytes.length;++i){
				bytes[i] = byteArray.get(bytes.length-1-i);
			}

			if(type.contains("unsigned")){
				long value = 0;

				for(int i=0;i<byteSize;++i){
					byte b = byteArray.get(i);
					value |= (b << i*8)&0xFF;
				}

				if(type.contains("unsigned")){
					if(byteArray.get(byteSize-1) < 0){//負の数の場合
						int upperBytes = Long.BYTES - byteSize;
						int upperBits = upperBytes * 8;
						value = ((value << upperBits) >>> upperBits);
					}
				}
				return value;
			}
			else{
				if(type.contains("char"))
					return bytes[0];
				else if(type.contains("short"))
					return ByteBuffer.wrap(bytes).getShort();
				else if(type.contains("*") || type.contains("int") || type.contains("long"))
					return ByteBuffer.wrap(bytes).getInt();
			}
		}
		else if(type.contains("float") || type.contains("double")){
			byte[] bytes = new byte[sizeof(type)];
			for(int i=0;i<bytes.length;++i){
				bytes[i] = byteArray.get(bytes.length-1-i);
			}
			if(type.contains("float"))
				return ByteBuffer.wrap(bytes).getFloat();
			else if(type.contains("double"))
				return ByteBuffer.wrap(bytes).getDouble();
		}
		throw new RuntimeException("Not support type: " + type);
	}

	public static int sizeofElement(String type){
		if(type.contains("*")){
			return 4;
		}
		else if(type.contains("char")){
			return 1;
		}
		else if(type.contains("short")){
			return 2;
		}
		else if(type.contains("double")){
			return 8;
		}
		return 4;
	}

	public static int sizeof(String type){
		int length = 1;
		if(type.contains("[") && type.contains("]")){
			length = Integer.parseInt(type.substring(type.lastIndexOf("[")+1, type.length()-1));
		}
		int typeSize = sizeofElement(type);
		return typeSize * length;
	}

	public static String charArrToStr(HashMap<Integer, Object> objectOnMemory, int begin){
		List<Byte> bytes = new ArrayList<Byte>();
		for(byte v = (byte)objectOnMemory.get(begin); v != 0; v = (byte)objectOnMemory.get(++begin)){
			bytes.add(v);
		}
		return BytesToStr(bytes);
	}
}
