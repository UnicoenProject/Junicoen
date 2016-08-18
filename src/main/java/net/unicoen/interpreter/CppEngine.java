package net.unicoen.interpreter;

import net.unicoen.node.UniCast;
import net.unicoen.node.UniCharacterLiteral;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniLongLiteral;

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
				String s="";
				if(args.length==1)
					s = String.format(text);
				else if(args.length==2)
					s = String.format(text,args[1]);
				else if(args.length==3)
					s = String.format(text,args[1],args[2]);
				else if(args.length==4)
					s = String.format(text,args[1],args[2],args[3]);
				engine.out.print(s);
				return s.length();
			}
		},"FUNCTION");
	}
	protected void includeStdlib(Scope global){
		global.setTop("malloc", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				return new Variable("void","malloc",args[0],-1,-1);
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
	protected Object execCast(UniCast expr, Scope scope){
		Object value = execExpr(expr.value, scope);
		return _execCast(expr.type,value);
	}
	
	protected Object _execCast(String type, Object value){
		if(type.equals("int")){
			return new UniIntLiteral((int)value);
		}
		else if(type.equals("double")){
			return new UniDoubleLiteral((double)value);
		}
		else if(type.equals("long")){
			return new UniLongLiteral((long)value);
		}
		else if(type.equals("char")){
			return new UniCharacterLiteral((char)value);
		}
		return value;
	}
	
	public static int sizeof(String type){
		if(type.contains("char")){
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
}
