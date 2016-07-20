package net.unicoen.interpreter;

import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniUnaryOp;

public class CppEngine extends Engine {
	
	@Override
	protected UniIdent getLeftReference(UniExpr expr, Scope scope) {
		if(expr instanceof UniIdent){
			UniIdent ui = (UniIdent)expr;
			if(ui.name.startsWith("&")){
				return new UniIdent(ui.name.substring(1));
			}
			return ui;
		}
		else if(expr instanceof UniUnaryOp){
			UniUnaryOp uuo = (UniUnaryOp)expr;
			if(uuo.operator.equals("*")){
				String refAddress = (String)execExpr(uuo.expr,scope);//必ず &変数名:String が返ってくる
				return getLeftReference(new UniIdent((String)refAddress),scope);
			}
		}
		else if(expr instanceof UniBinOp){
			UniBinOp ubo = (UniBinOp)expr;
			if(ubo.operator.equals("[]")){
				return getLeftReference(new UniUnaryOp("*",new UniBinOp("+",ubo.left,ubo.right)),scope);
			}
		}
		throw new RuntimeException("Assignment failure: " + expr);
	}
	
	@Override
	protected String execAddressOp(UniUnaryOp expr, Scope scope){
		return expr.operator + getLeftReference(expr,scope).name;
	}
	
	@Override
	protected Object execDereferenceOp(UniExpr expr, Scope scope){
		return execExpr(getLeftReference(expr,scope),scope);
	}
	
	@Override
	protected Object execSubscriptOp(UniBinOp ubo, UniExpr index, Scope scope){		
		return execExpr(getLeftReference(ubo,scope),scope);
	}
}
