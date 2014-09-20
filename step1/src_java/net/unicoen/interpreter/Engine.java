package net.unicoen.interpreter;

import java.io.PrintStream;

import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFuncDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;

public class Engine {

	public PrintStream out = System.out;

	public void execute(UniClassDec dec) {
		UniFuncDec fdec = getEntryPoint(dec);
		if (fdec != null) {
			Scope global = new Scope();
			importStdLib(global);
			execFunc(fdec, global);
		} else {
			throw new RuntimeException("No entry point in " + dec);
		}
	}

	private UniFuncDec getEntryPoint(UniClassDec dec) {
		for (UniMemberDec m : dec.members) {
			if (m instanceof UniFuncDec) {
				UniFuncDec fdec = (UniFuncDec) m;
				if ("main".equals(fdec.funcName)) {
					return fdec;
				}
			}
		}
		return null;
	}

	private void importStdLib(Scope global) {
		{ // create mylib
			Scope scope = new Scope();
			scope.set("printInt", new FunctionWithEngine() {
				@Override
				public Object invoke(Engine engine, Object[] args) {
					engine.out.println(args[0]);
					return null;
				}
			});
			global.set("MyLib", scope);
		}
	}

	private void execFunc(UniFuncDec fdec, Scope global) {
		Scope funcScope = new Scope(global);
		for (UniExpr expr : fdec.bodies) {
			evalExpr(expr, funcScope);
		}
	}

	private Object evalExpr(UniExpr expr, Scope scope) {
		if (expr instanceof UniMethodCall) {
			UniMethodCall mc = (UniMethodCall) expr;
			Object receiver = evalExpr(mc.receiver, scope);
			Object[] args = new Object[mc.args.size()];
			for (int i = 0; i < args.length; i++) {
				args[i] = evalExpr(mc.args.get(i), scope);
			}
			return execMethodCall(receiver, mc.methodName, args);
		}
		if (expr instanceof UniIdent) {
			return scope.get(((UniIdent) expr).name);
		}
		if (expr instanceof UniIntLiteral) {
			return ((UniIntLiteral) expr).value;
		}
		throw new RuntimeException("Not support expr type: " + expr);
	}

	private Object execMethodCall(Object receiver, String methodName, Object[] args) {
		if (receiver instanceof Scope) {
			Object func = ((Scope) receiver).get(methodName);
			return execFuncCall(func, args);
		}
		throw new RuntimeException("Not support method type: " + receiver);
	}

	private Object execFuncCall(Object func, Object[] args) {
		if (func instanceof FunctionWithEngine) {
			return ((FunctionWithEngine) func).invoke(this, args);
		}
		throw new RuntimeException("Not support function type: " + func);
	}
}
