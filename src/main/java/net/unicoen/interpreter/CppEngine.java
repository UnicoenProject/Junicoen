package net.unicoen.interpreter;

import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniUnaryOp;

public class CppEngine extends Engine {
	
	@Override
	protected String execUnAndOp(UniExpr expr, Scope scope){
		return "&"+getLeftReference(expr,scope).name;
	}
	
	@Override
	protected Object execUnAsteriskOp(UniExpr expr, Scope scope){
		UniUnaryOp uuo = new UniUnaryOp("*", expr);
		UniIdent value = getLeftReference(uuo,scope);
		return execExpr(value,scope);
	}
	
	@Override
	protected Object execSubscriptOp(UniExpr var, UniExpr index, Scope scope){
		UniBinOp ubo = new UniBinOp("[]",var,index);
		UniIdent value = getLeftReference(ubo,scope);			
		return execExpr(value,scope);
	}
}
