package net.unicoen.interpreter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import net.unicoen.node.UniCast;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniUnaryOp;

public class CppEngine extends Engine {

	@Override
	protected void loadLibarary(Scope global){
		includeStdio(global);
		includeStdlib(global);
		includeMath(global);
		global.setTop("sizeof", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return CppEngine.sizeof((String) args[0]);
			}
		},"FUNCTION");
	}

	protected void includeStdio(Scope global){
		global.setTop("printf", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				if(args.length<1)
					return 0;
				String text = (String)args[0];
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
		},"FUNCTION");


		global.setSystemVariable("FUNCTION","NULL", 0);
		global.setSystemVariable("FUNCTION","EOF", -1);
	}
	protected void includeStdlib(Scope global){
		global.setTop("malloc", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				//args[0]:int-num, (args[1]:String-type,1固定)
				//String type = (String)args[0];
				//int typeSize = sizeof(type);
				//int byteSize = 1;//(int)args[1];
				int num = (int)args[0];//byteSize/typeSize;
				int heapAddress = global.setHeap((int)(Math.random()*Integer.MAX_VALUE),"?");
				for(int i=1;i<num;++i){
					global.setHeap((int)(Math.random()*Integer.MAX_VALUE),"?");
				}
				global.setMallocSize(heapAddress, num);
				return heapAddress;
			}
		},"FUNCTION");
		global.setTop("free", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				int address = (int)args[0];
				int size = global.getMallocSize(address);
				return global.removeOnMemory(address, size);
			}
		},"FUNCTION");
		global.setTop("abs", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.abs((int) args[0]);
			}
		},"FUNCTION");
		global.setTop("rand", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.random();
			}
		},"FUNCTION");
        global.setTop("fopen", new FunctionWithEngine() {
            @Override
            public Object invoke(Engine engine, Object[] args) {//args[0]:ファイル名, args[1]:モード
                String filename = (String) args[0];
                String filepath = new File(fileDir, filename).getPath();
                String mode = (String) args[1];
                int ret = 0;
            	try {
            		switch(mode){
                    //テキスト
                case "r":
                	BufferedReader br = new BufferedReader(new FileReader(filepath));
                    ret = global.setCode(br, "FILE");
                    break;
                case "w":
                	BufferedWriter bw = new BufferedWriter(new FileWriter(filepath));
                	ret = global.setCode(bw, "FILE");
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

				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}


            return ret;
            }
        },"FUNCTION");
        global.setTop("fgetc", new FunctionWithEngine() {
            @Override
            public Object invoke(Engine engine, Object[] args) {//args[0]:FILE*
                int ch = -1;
                try {
                    int addr = (int)args[0];
                    BufferedReader br = (BufferedReader)global.getValue(addr);
                    ch = br.read();
                } catch (IOException e) {
                    // TODO 自動生成された catch ブロック
                    e.printStackTrace();
                }
                return ch;
            }
        },"FUNCTION");
        global.setTop("fgets", new FunctionWithEngine() {
            @Override
            public Object invoke(Engine engine, Object[] args) {//char *str, int num, FILE *fp
                int len = (int)args[1];
                byte[] buf = new byte[len];
                try {
                	int addr = (int)args[2];
                    BufferedReader br = (BufferedReader)global.getValue(addr);
                    for(int i=0; i<len-1; ++i){
                        int v = br.read();
                        if(v == -1){
                        	return 0;
                        }
                        char c = (char)v;
                        buf[i] = (byte)v;
                        if(c == '\n'){
                            ++i;
                            break;
                        }
                    }
                } catch (IOException e) {
                    // TODO 自動生成された catch ブロック
                    e.printStackTrace();
                    return 0;
                } catch (ClassCastException e){
                    return 0;
                }
                int addr = (int)args[0];
                for(int i=0; i<buf.length; ++i){
                	global.set(addr+i, buf[i]);
                	if(buf[i] == 0)break;
                }
                return args[2];
            }
        },"FUNCTION");//読み込んだ文字列のポインタ
        global.setTop("fputc", new FunctionWithEngine() {
            @Override
            public Object invoke(Engine engine, Object[] args) {//args[0]:int, args[1]:FILE*
            	int ret = -1;
            	try {
            		if(args[0] instanceof Number){
            			ret = (int)args[0];
            		}
            		else if(args[0] instanceof Character){
            			char c = (char)args[0];
            			String s = String.valueOf(c);
            			byte[] b = s.getBytes("US-ASCII");
            			ret = b[0];
            		}
                    int addr = (int)args[1];
                    BufferedWriter bw = (BufferedWriter)global.getValue(addr);
                    bw.write(ret);
                    bw.flush();
                } catch (IOException e) {
                    // TODO 自動生成された catch ブロック
                    e.printStackTrace();
                }
                return ret;
            }
        },"FUNCTION");
        global.setTop("fputs", new FunctionWithEngine() {
            @Override
            public Object invoke(Engine engine, Object[] args) {//args[0]:const char*, args[1]:FILE*
            	int ret = -1;
            	try { 		
            		if(args[0] instanceof Number){
            			ret = (int)args[0];
            			if(global.typeOnMemory.containsKey(ret)){
    						final String type = global.typeOnMemory.get(ret);
    						if(type.contains("char")){
    							args[0] = charArrToStr(global.objectOnMemory,ret);
    						}
    					}
            		}
            		int addr = (int)args[1];
            		BufferedWriter bw = (BufferedWriter)global.getValue(addr);
            		String s = (String) args[0];
            		byte[] bytes = s.getBytes("US-ASCII");
                    for(byte b : bytes){
                    	bw.write(b);
                    }
                    bw.flush();
                } catch (IOException e) {
                    // TODO 自動生成された catch ブロック
                    e.printStackTrace();
                }
                return ret;
            }
        },"FUNCTION");
	}
	protected void includeMath(Scope global){
		//逆三角関数
		global.setTop("acos", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.acos((double) args[0]);
			}
		},"FUNCTION");
		global.setTop("asin", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.asin((double) args[0]);
			}
		},"FUNCTION");
		global.setTop("atan", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.atan((double) args[0]);
			}
		},"FUNCTION");

		//三角関数
		global.setTop("cos", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.cos((double) args[0]);
			}
		},"FUNCTION");
		global.setTop("sin", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.sin((double) args[0]);
			}
		},"FUNCTION");
		global.setTop("tan", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.tan((double) args[0]);
			}
		},"FUNCTION");

		//双曲線関数
		global.setTop("cosh", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.cosh((double) args[0]);
			}
		},"FUNCTION");
		global.setTop("sinh", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.sinh((double) args[0]);
			}
		},"FUNCTION");
		global.setTop("tanh", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.tanh((double) args[0]);
			}
		},"FUNCTION");




		global.setTop("exp", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.exp((double) args[0]);
			}
		},"FUNCTION");
		global.setTop("exp2", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.pow(2.0,(double) args[0]);
			}
		},"FUNCTION");
		global.setTop("expm1", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.expm1((double) args[0]);
			}
		},"FUNCTION");

		//frexp
		//ldexp

		global.setTop("log", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.log((double) args[0]);
			}
		},"FUNCTION");
		global.setTop("log10", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.log10((double) args[0]);
			}
		},"FUNCTION");
		global.setTop("log1p", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.log1p((double) args[0]);
			}
		},"FUNCTION");

		//modf(double,double*)

		global.setTop("cbrt", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.cbrt((double) args[0]);
			}
		},"FUNCTION");
		global.setTop("fabs", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.abs((double) args[0]);
			}
		},"FUNCTION");
		global.setTop("hypot", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.hypot((double) args[0],(double) args[1]);
			}
		},"FUNCTION");

		global.setTop("pow", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.pow((double) args[0],(double) args[1]);
			}
		},"FUNCTION");
		global.setTop("sqrt", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.sqrt((double) args[0]);
			}
		},"FUNCTION");

		global.setTop("ceil", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.ceil((double) args[0]);
			}
		},"FUNCTION");
		global.setTop("floor", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.floor((double) args[0]);
			}
		},"FUNCTION");
		global.setTop("rint", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.rint((double) args[0]);
			}
		},"FUNCTION");
		global.setTop("round", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.round((double) args[0]);
			}
		},"FUNCTION");

		global.setTop("fdim", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				double a = Math.abs((double) args[0]);
				double b = Math.abs((double) args[1]);
				return Math.abs(Math.max(a, b)-Math.min(a, b));
			}
		},"FUNCTION");
		global.setTop("fmax", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.max((double) args[0],(double) args[1]);
			}
		},"FUNCTION");
		global.setTop("fmin", new FunctionWithEngine() {//C99
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return Math.min((double) args[0],(double) args[1]);
			}
		},"FUNCTION");

		global.setTop("fmod", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return (double)args[0] % (double)args[1];
			}
		},"FUNCTION");
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

	@Override
	protected Object _execCast(String type, Object value){

		if(value == null || value instanceof List){
			return value;
		}


		if(type.equals("int")){
			return (int)value;
		}
		else if(type.equals("double")){
			return (double)value;
		}
		else if(type.equals("long")){
			return (long)value;
		}
		else if(type.equals("char")){
			if(value instanceof Integer ){
				return (byte)((int)value);
			}
			else if(value instanceof Character ){
				return (byte)((char)value);
			}
			else if(value instanceof Long ){
				return (byte)((long)value);
			}
			else if(value instanceof Character ){
				return (byte)((char)value);
			}

		}
		return value;
	}

	public static int sizeof(String type){
		return 1;
/*		if(type.contains("char")){
			return 1;
		}
		else if(type.contains("short")){
			return 2;
		}
		else if(type.contains("double")){
			return 8;
		}
		return 4;*/
	}

	public static String BytesToStr(List<Byte> bytes){
		byte[] data = new byte[bytes.indexOf((byte)0)];
		for(int i=0;i<data.length;++i){
			data[i] = bytes.get(i);
		}
		return new String(data);
	}


	public static String charArrToStr(HashMap<Integer, Object> objectOnMemory, int begin){
		List<Byte> bytes = new ArrayList<Byte>();
		Object obj = objectOnMemory.get(begin);
		if(obj instanceof String){
			return (String)obj;
		}
		for(byte v = (byte)obj; v != 0; v = (byte)objectOnMemory.get(++begin)){
			bytes.add(v);
		}
		bytes.add((byte)0);
		return BytesToStr(bytes);
	}
}
