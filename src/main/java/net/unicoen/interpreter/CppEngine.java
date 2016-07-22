package net.unicoen.interpreter;

import java.util.ArrayList;

import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldDec;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;

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
			else if(ubo.operator.equals(".")){
				UniIdent left = getLeftReference(ubo.left,scope);
				UniIdent right = getLeftReference(ubo.right,scope);
				return new UniIdent(left.name + "." + right.name);
			}
		}
		throw new RuntimeException("Assignment failure: " + expr);
	}

	@Override
	protected String execAddressOp(UniUnaryOp expr, Scope scope){
		return expr.operator + getLeftReference(expr.expr,scope).name;
	}

	@Override
	protected Object execDereferenceOp(UniExpr expr, Scope scope){
		return execExpr(getLeftReference(expr,scope),scope);
	}

	@Override
	protected Object execSubscriptOp(UniBinOp ubo, UniExpr index, Scope scope){
		return execExpr(getLeftReference(ubo,scope),scope);
	}

	@Override
	protected Object execAssign(UniIdent left, Object value, Scope scope) {
		if(value instanceof ArrayList){//構造体の場合のみ
			ArrayList<String> values = (ArrayList<String>)value;
			for(String s : values){
				String fieldname = left.name + s.substring(s.indexOf("."));
				execAssign(new UniIdent(fieldname),scope.get(s),scope);
			}
		}
		return super.execAssign(left, value, scope);
	}

	@Override
	protected Object execVariableDec(UniVariableDec decVar, Scope scope){

		if(decVar.name.startsWith("*")){
			decVar.name = decVar.name.substring(1);
			decVar.type+="*";
		}
		else if(decVar.name.startsWith("&")){
			decVar.name = decVar.name.substring(1);
			decVar.type+="&";
		}

		Object value = null;
		if(decVar.value!=null)
			value = execExpr(decVar.value, scope);
		if(scope.hasValue(decVar.type)){
			ArrayList<Object> varArray = (ArrayList<Object>)value;//評価した初期化リスト|フィールド名の配列
			ArrayList<UniFieldDec> ufds = (ArrayList<UniFieldDec>)scope.get(decVar.type);//structのメンバ構造
			if(varArray == null){
				varArray = new ArrayList<Object>();
				for(UniFieldDec ufd : ufds){
					varArray.add(null);
				}
			}
			else{
				ArrayList<Object> newVarArray = new ArrayList<Object>();
				for(Object var :varArray){
					if(var instanceof String){
						if(scope.hasValue((String)var)){
							newVarArray.add(scope.get((String)var));
						}
						else
							break;
					}
					else
						break;
				}
				if(varArray.size() == newVarArray.size()){
					varArray = newVarArray;
				}
			}

			//メンバの型と名前を一緒に渡すためVariable型にする。
			ArrayList<Variable> varsAsVariable = new ArrayList<Variable>();
			ArrayList<String> memberNames = new ArrayList<String>();

			for(int i=0;i<ufds.size();++i){
				UniFieldDec ufd = ufds.get(i);
				String name = decVar.name+"."+ufd.name;
				memberNames.add(name);
				scope.setTop(name, varArray.get(i));
				varsAsVariable.add(new Variable(ufd.type,ufd.name,varArray.get(i),-1,-1));
			}
			scope.setTop(decVar.name, memberNames);//str1 = str2の場合は展開してフィールド毎に代入
			state.addVariable(scope.name, decVar, varsAsVariable, scope.depth);
		}
		else if(value instanceof ArrayList<?>){
			ArrayList<?> varArray = (ArrayList<?>)value;
			scope.setTop(decVar.name, "&"+decVar.name+"[0]");
			for(int i=0;i<varArray.size();++i){
				scope.setTop(decVar.name+"["+i+"]", varArray.get(i));
			}
			state.addVariable(scope.name, decVar, varArray,scope.depth);
		}
		else
		{
			scope.setTop(decVar.name, value);
			state.addVariable(scope.name, decVar, value, scope.depth);
		}
		return value;
	}
}
