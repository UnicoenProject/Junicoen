package net.unicoen.interpreter;

import java.io.PrintStream;
import java.util.List;

import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFuncDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniWhile;

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
		// TODO: set argument to func scope
		execExprMany(fdec.body, funcScope);
	}

	private Object execExprMany(List<UniExpr> exprs, Scope scope) {
		Object lastValue = null;
		for (UniExpr expr : exprs) {
			lastValue = execExpr(expr, scope);
		}
		return lastValue;
	}

	private Object execExpr(UniExpr expr, Scope scope) {
		if (expr instanceof UniMethodCall) {
			UniMethodCall mc = (UniMethodCall) expr;
			Object receiver = execExpr(mc.receiver, scope);
			Object[] args = new Object[mc.args.size()];
			for (int i = 0; i < args.length; i++) {
				args[i] = execExpr(mc.args.get(i), scope);
			}
			return execMethodCall(receiver, mc.methodName, args);
		}
		if (expr instanceof UniIdent) {
			return scope.get(((UniIdent) expr).name);
		}
		if (expr instanceof UniIntLiteral) {
			return ((UniIntLiteral) expr).value;
		}
		if (expr instanceof UniBoolLiteral) {
			return ((UniBoolLiteral) expr).value;
		}
		if (expr instanceof UniBinOp) {
			UniBinOp bin = (UniBinOp) expr;
			return execBinOp(bin.operator, bin.left, bin.right, scope);
		}
		if (expr instanceof UniIf) {
			UniIf ui = (UniIf) expr;
			if (toBool(execExpr(ui.cond, scope))) {
				return execExprMany(ui.trueBlock, new Scope(scope));
			} else {
				return execExprMany(ui.falseBlock, new Scope(scope));
			}
		}
		if (expr instanceof UniWhile) {
			UniWhile w = (UniWhile) expr;
			Object lastEval = null;
			while (toBool(execExpr(w.cond, scope))) {
				lastEval = execExprMany(w.body, new Scope(scope));
			}
			return lastEval;
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

	private Object execBinOp(String op, UniExpr left, UniExpr right, Scope scope) {
		switch (op) {
		case "+":
			return toInt(execExpr(left, scope)) + toInt(execExpr(right, scope));
		case "-":
			return toInt(execExpr(left, scope)) - toInt(execExpr(right, scope));
		case "*":
			return toInt(execExpr(left, scope)) * toInt(execExpr(right, scope));
		case "/":
			return toInt(execExpr(left, scope)) / toInt(execExpr(right, scope));
		case "%":
			return toInt(execExpr(left, scope)) % toInt(execExpr(right, scope));

		case "&&":
			return toBool(execExpr(left, scope)) && toBool(execExpr(right, scope));
		case "||":
			return toBool(execExpr(left, scope)) || toBool(execExpr(right, scope));
		}
		throw new RuntimeException("Unkown binary operator: " + op);
	}

	public static int toInt(Object obj) {
		if (obj instanceof Integer) {
			return ((Integer) obj).intValue();
		}
		throw new RuntimeException("Cannot covert to integer: " + obj);
	}

	public static boolean toBool(Object obj) {
		if (obj instanceof Boolean) {
			return ((Boolean) obj).booleanValue();
		}
		throw new RuntimeException("Cannot covert to boolean: " + obj);
	}
}
