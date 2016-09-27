package net.unicoen.interpreter;

import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniArray;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniBreak;
import net.unicoen.node.UniCast;
import net.unicoen.node.UniCharacterLiteral;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniContinue;
import net.unicoen.node.UniDoWhile;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldDec;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniLongLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNewArray;
import net.unicoen.node.UniNode;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniTernaryOp;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;

public class Engine {

	@SuppressWarnings("serial")
	private static class ControlException extends RuntimeException {
	}

	@SuppressWarnings("serial")
	private static class Break extends ControlException {
	}

	@SuppressWarnings("serial")
	private static class Continue extends ControlException {
	}

	@SuppressWarnings("serial")
	private static class Return extends ControlException {
		public final Object value;

		public Return(Object value) {
			this.value = value;
		}
	}

	public PrintStream out = System.out;
	public List<ExecutionListener> listeners;

	private AtomicBoolean isStepExecutionRunning = new AtomicBoolean(false);
	private AtomicBoolean isExecutionThreadWaiting = new AtomicBoolean(false);
	protected ExecState state = new ExecState();
	public boolean isStepExecutionRunning() {
		return isStepExecutionRunning.get();
	}

	private synchronized void notifyAllThread(){
		notifyAll();
	}
	private synchronized void waitForWaitingFlagIs(boolean is){
		while(isExecutionThreadWaiting.get()==is)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void addListener(ExecutionListener listener) {
		if (listeners == null) {
			listeners = new ArrayList<>();
		}
		listeners.add(listener);
	}

	private void firePreExecAll(Scope global) {
		if (listeners != null) {
			for (ExecutionListener listener : listeners) {
				listener.preExecuteAll(global);
			}
		}
	}

	private void firePostExecAll(Scope global, Object value) {
		if (listeners != null) {
			for (ExecutionListener listener : listeners) {
				listener.postExecuteAll(global);
			}
		}
	}

	private void firePreExec(UniNode node, Scope scope) {
		if (listeners != null) {
			for (ExecutionListener listener : listeners) {
				listener.preExecute(node, scope);
			}
		}
	}

	private void firePostExec(UniNode node, Scope scope, Object value) {
		if (listeners != null) {
			for (ExecutionListener listener : listeners) {
				listener.postExecute(node, scope, value);
			}
		}
	}

	public static Object executeSimple(UniExpr expr, Scope scope) {
		return new Engine().execExpr(expr, scope);
	}

	public static Object executeSimple(UniExpr expr) {
		return executeSimple(expr, Scope.createGlobal());
	}

	public static Object executeSimple(UniExpr expr, String key, Object value) {
		Scope scope = Scope.createGlobal();
		scope.setTop(key, value, "SIMPLE");
		return executeSimple(expr, scope);
	}

	protected void loadLibarary(Scope global){
		StdLibLoader.initialize(global);
	}
	public ExecState startStepExecution(ArrayList<UniNode> nodes) {
		isStepExecutionRunning.set(true);
		isExecutionThreadWaiting.set(false);
		if (!nodes.isEmpty()) {
			new Thread(){
	            public void run(){
	            	Scope global = Scope.createGlobal();
	            	state = new ExecState(global);
	            	global.name = "GLOBAL";
	            	loadLibarary(global);
	    			firePreExecAll(global);
	    			for (UniNode node : nodes) {
	    				if (node instanceof UniMethodDec) {
	    					UniMethodDec fdec = (UniMethodDec) node;
	    					if ("main".equals(fdec.methodName)) {//main関数なら実行開始
	    						Object value = execFunc(fdec, global,null);
	    		    			firePostExecAll(global, value);
	    		    			isExecutionThreadWaiting.set(true);
	    		    			isStepExecutionRunning.set(false);
	    		    			notifyAllThread();
	    		    			break;
	    					}
	    					else{//他の関数定義ならセット
	    						global.setTop(fdec.methodName, fdec, fdec.returnType);
	    					}
	    				}
	    				else if(node instanceof UniVariableDec){//グローバル変数のセット
	    					execExpr((UniVariableDec)node, global);
	    				}
	    				else if(node instanceof UniClassDec){//struct情報のセット
	    					UniClassDec ucd = (UniClassDec)node;
	    					HashMap<String, Integer> fieldOffset = new LinkedHashMap<>();
	    					int offset = 0;
	    					for(UniMemberDec umd : ucd.members){
	    						if(umd instanceof UniFieldDec){
	    							UniFieldDec ufd = (UniFieldDec)umd;
	    							fieldOffset.put(ufd.name, offset++);
	    						}
	    					}
	    					global.setTop(ucd.className, fieldOffset, ucd.className);
	    				}
	    			}
	            }
	        }.start();
	        notifyAllThread();
	        waitForWaitingFlagIs(false);
	        return state.make();
		} else {
			throw new RuntimeException("No entry point in " + nodes);
		}
	}

	public ExecState stepExecute() {
		if(isStepExecutionRunning.get())
		{
			isExecutionThreadWaiting.set(false);
			notifyAllThread();
			waitForWaitingFlagIs(false);
		}
		return state.make();
	}

	public Object execute(UniClassDec dec) {
		UniMethodDec fdec = getEntryPoint(dec);
		if (fdec != null) {
			Scope global = Scope.createGlobal();
			loadLibarary(global);
			firePreExecAll(global);
			Object value = execFunc(fdec, global,null);
			firePostExecAll(global, value);
			return value;
		} else {
			throw new RuntimeException("No entry point in " + dec);
		}
	}

	private UniMethodDec getEntryPoint(UniClassDec dec) {
		for (UniMemberDec m : dec.members) {
			if (m instanceof UniMethodDec) {
				UniMethodDec fdec = (UniMethodDec) m;
				if ("start".equals(fdec.methodName)) {
					return fdec;
				}
			}
		}
		return null;
	}

	private Object execFunc(UniMethodDec fdec, Scope scope, List<UniExpr> arguments) {
		Scope funcScope = Scope.createLocal(scope);
		funcScope.name = funcScope.getNextName(fdec.methodName);

		List<UniArg> parameters = fdec.args;

		if(parameters!=null && arguments!=null)
		{
			assert parameters.size() == arguments.size();
			List<Object> args = new ArrayList<Object>();
			List<UniVariableDec> uvds = new ArrayList<UniVariableDec>();
			for(int i=0;i<arguments.size();++i){
				UniArg param = parameters.get(i);
				UniExpr arg = arguments.get(i);
				UniVariableDec uvd = new UniVariableDec(null, param.type, param.name, arg, null);
				Object value = _execVariableDec(uvd,scope);
				args.add(value);
				uvds.add(uvd);
			}
			for(int i=0;i<arguments.size();++i){
				UniArg param = parameters.get(i);
				funcScope.setTop(uvds.get(i).name,args.get(i),uvds.get(i).type);
			}
		}
		//ToDo再起の場合のチェック(連番など?
		//スコープも呼び出し先関数中とGLOBAL以外はスキップさせる
		try {
			return execBlock(fdec.block, funcScope);
		} catch (Return e) {
			return e.value;
		}
		finally{
			if(!funcScope.name.equals("main"))
				scope.removeChild(funcScope);
		}
	}

	public Object runCallMethod(Object instance, String methodName,
			Object[] args) {
		throw new RuntimeException("Not support call method for: " + instance);
	}

	protected Object execExpr(UniExpr expr, Scope scope) {
		firePreExec(expr, scope);
		Object value = _execExpr(expr, scope);
		firePostExec(expr, scope, value);
		return value;
	}

	private Object _execExpr(UniExpr expr, Scope scope) {
		assert expr != null;

		if (expr instanceof UniMethodCall) {
			UniMethodCall mc = (UniMethodCall) expr;
			Object[] args = new Object[mc.args == null ? 0 : mc.args.size()];
			for (int i = 0; i < args.length; i++) {
				args[i] = execExpr(mc.args.get(i), scope);
			}
			if (mc.receiver != null) {
				Object receiver = execExpr(mc.receiver, scope);
				return execMethodCall(receiver, mc.methodName, args);
			}
			else {
				Object func = scope.get(mc.methodName);
				if(func instanceof UniMethodDec){
					return execFunc((UniMethodDec)func,scope,mc.args);
				}
				return execFuncCall(func, args);
			}
		}
		if (expr instanceof UniIdent) {
			return scope.get(((UniIdent) expr).name);
		}
		if (expr instanceof UniBoolLiteral) {
			return ((UniBoolLiteral) expr).value;
		}
		if (expr instanceof UniIntLiteral) {
			return ((UniIntLiteral) expr).value;
		}
		if (expr instanceof UniLongLiteral) {
			return ((UniLongLiteral) expr).value;
		}
		if (expr instanceof UniCharacterLiteral) {
			return execUniCharacterLiteral((UniCharacterLiteral)expr,scope);
		}
		if (expr instanceof UniDoubleLiteral) {
			return ((UniDoubleLiteral) expr).value;
		}
		if (expr instanceof UniStringLiteral) {
			return execUniStringLiteral((UniStringLiteral)expr,scope);			
		}
		if (expr instanceof UniUnaryOp) {
			return execUnaryOp((UniUnaryOp) expr, scope);
		}
		if (expr instanceof UniBinOp) {
			return execBinOp((UniBinOp) expr, scope);
		}
		if (expr instanceof UniTernaryOp) {
			UniTernaryOp condOp = (UniTernaryOp) expr;
			return toBool(execExpr(condOp.cond, scope))
					? execExpr(condOp.trueExpr, scope)
					: execExpr(condOp.falseExpr, scope);
		}
		if (expr instanceof UniBreak) {
			throw new Break();
		}
		if (expr instanceof UniContinue) {
			throw new Continue();
		}
		if (expr instanceof UniReturn) {
			UniReturn uniRet = (UniReturn) expr;
			Object retValue = execExpr(uniRet.value, scope);
			throw new Return(retValue);
		}
		if (expr instanceof UniVariableDec) {
			UniVariableDec uvd = (UniVariableDec)expr;
			return execVariableDec(uvd,scope);
		}
		if (expr instanceof UniBlock) {
			return execBlock((UniBlock) expr, scope);
		}
		if (expr instanceof UniIf) {
			UniIf ui = (UniIf) expr;
			Boolean cond = toBool(execExpr(ui.cond, scope));
			if (cond) {
				return execExpr(ui.trueStatement, scope);
			} else if(ui.falseStatement!=null) {
				return execExpr(ui.falseStatement, scope);
			}
			return cond;
		}
		if (expr instanceof UniFor) {
			UniFor uniFor = (UniFor) expr;
			Scope forScope = Scope.createLocal(scope);
			forScope.name = scope.name;
			try {
				Object lastEval = null;
				for (execExpr(uniFor.init, forScope); toBool(
						execExpr(uniFor.cond, forScope)); execExpr(uniFor.step,
								forScope)) {
					try {
						lastEval = execExpr(uniFor.statement, forScope);
					} catch (Continue e) { /* do nothing */
					}
				}
				return lastEval;
			} catch (Break e) {
				return null;
			}
		}
		if (expr instanceof UniWhile) {
			UniWhile uniWhile = (UniWhile) expr;
			try {
				Object lastEval = null;
				while (toBool(execExpr(uniWhile.cond, scope))) {
					try {
						lastEval = execExpr(uniWhile.statement, scope);
					} catch (Continue e) { /* do nothing */
					}
				}
				return lastEval;
			} catch (Break e) {
				return null;
			}
		}
		if (expr instanceof UniDoWhile) {
			UniDoWhile uniWhile = (UniDoWhile) expr;
			try {
				Object lastEval = null;
				do {
					try {
						lastEval = execExpr(uniWhile.statement, scope);
					} catch (Continue e) { /* do nothing */
					}
				} while (toBool(execExpr(uniWhile.cond, scope)));
				return lastEval;
			} catch (Break e) {
				return null;
			}
		}
		if (expr instanceof UniArray) {
			return execArray((UniArray) expr, scope);
		}
		if (expr instanceof UniNewArray) {
			UniNewArray uniNewArray = (UniNewArray) expr;//C言語ではtypeは取れない
			List<UniExpr> elementsNum = uniNewArray.elementsNum;//多次元未対応
			int length = (int)execExpr(elementsNum.get(0),scope);//多次元未対応
			UniArray value = uniNewArray.value;
			List<Object> array = new ArrayList<Object>();
			if(value.items==null){
				for(int i=0;i<length;++i){
					array.add(Math.random()*Integer.MAX_VALUE);//未初期化は乱数
				}
			}
			else{
				array = execArray(value,scope);
				for(int i=array.size();i<length;++i){
					array.add(0);
				}
			}
			return array;
		}
		if (expr instanceof UniCast) {
			return execCast((UniCast)expr, scope);
		}
		throw new RuntimeException("Not support expr type: " + expr);
	}

	protected Object execCast(UniCast expr, Scope scope){
		return execExpr(expr.value, scope);
	}

	protected List<Object> createMultiArray(List<UniExpr> arrayLength, String type, Scope scope, boolean setZero){
		List<Object> array = new ArrayList<Object>();
		List<List<Object>> bottomArrays = new ArrayList<List<Object>>();
		for(int i=0, depth = arrayLength.size(); i<depth; ++i){
			UniExpr expr = arrayLength.get(i);
			int size = (int)execExpr(expr,scope);
			if(i == depth-1){//最後
				if(i == 0){
					bottomArrays.add(array);
				}
				for(List<Object> list : bottomArrays){
					for(int j=0; j<size; ++j){
						list.add(_execCast(type,setZero ? 0 : Math.random()*Integer.MAX_VALUE));
					}
				}
			}
			else if(i == 0){
				for(int j=0; j<size; ++j){
					List<Object> temp = new ArrayList<Object>();
					array.add(temp);
					bottomArrays.add(temp);
				}
			}
			else{
				int numOfBottom = bottomArrays.size();
				List<List<Object>> bottomArraysBuf = new ArrayList<List<Object>>();
				for(int j=0;j<numOfBottom;++j){
					List<Object> bottomArray = bottomArrays.get(j);
					for(int k=0; k<size; ++k){
						List<Object> temp = new ArrayList<Object>();
						bottomArray.add(temp);
						bottomArraysBuf.add(temp);
					}
				}
				bottomArrays = bottomArraysBuf;
			}
		}
		return array;
	}
	
	@SuppressWarnings("unchecked")
	protected void copyArray(final List<Object> src, List<Object> dest){
		for(int i=0; i<src.size();++i){
			if(src.get(i) instanceof List<?> && dest.get(i) instanceof List<?>){
				copyArray((List<Object>)src.get(i), (List<Object>) dest.get(i));
			}
			else{
				dest.set(i, src.get(i));
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	protected Object _execVariableDec(UniVariableDec decVar, Scope scope){

			while(decVar.name.startsWith("*")){
				decVar.name = decVar.name.substring(1);
				decVar.type+="*";
			}
			while(decVar.name.startsWith("&")){
				decVar.name = decVar.name.substring(1);
				decVar.type+="&";
			}
			for(int i=1; decVar.name.contains("["); ++i){
				int leftPos = decVar.name.lastIndexOf("[");
				decVar.name = decVar.name.substring(0, leftPos);
				//decVar.type+="[]";
				if(decVar.arrayLength.size()<i){
					decVar.arrayLength.add(0,null);
				}
			}

			Object value = Math.random()*Integer.MAX_VALUE;//未初期化は乱数

			if(decVar.value!=null){//初期化されている場合
				value = execExpr(decVar.value, scope);
				if(decVar.arrayLength != null && !decVar.arrayLength.isEmpty()){
					if(decVar.arrayLength.get(0) == null){//int arr[]
						int size = (int)((List<Object>)value).size();
						decVar.arrayLength.set(0,new UniIntLiteral(size));
					}
					List<Object> array = createMultiArray(decVar.arrayLength,decVar.type,scope,true);
					copyArray((List<Object>)value,array);
					value = array;
				}
			}
			else if(decVar.arrayLength != null && !decVar.arrayLength.isEmpty()){//未初期化だが配列の場合(要素数は当然確定)
				value = createMultiArray(decVar.arrayLength,decVar.type,scope,false);
			}
			
			value = _execCast(decVar.type,value);
			if(decVar.type.endsWith("*") && !(value instanceof List)){
				int address = (int)value;
				if(scope.isMallocArea(address)){
					int size = scope.getMallocSize(address);
					for(int i=0;i<size;++i){
						scope.typeOnMemory.put(address+i, decVar.type.substring(0,decVar.type.length()-1));
					}
				}
			}
			return value;
	}

	protected Object execVariableDec(UniVariableDec decVar, Scope scope){
		Object value = _execVariableDec(decVar,scope);
		scope.setTop(decVar.name,value,decVar.type);
		return value;
	}


	private List<Object> execArray(UniArray uniArray, Scope scope) {
		List<UniExpr> elements = uniArray.items;
		List<Object> array = new ArrayList<Object>();
		for(int i=0;i<elements.size();++i){
			Object element = execExpr(elements.get(i),scope);
			array.add(element);
		}
		return array;
	}
	private Object execMethodCall(Object receiver, String methodName,
			Object[] args) {
		assert receiver != null;

		String msg = String.format("Method not found: %s.%s",
				receiver.getClass().getName(), methodName);
		if (receiver instanceof Scope) {
			Object func = ((Scope) receiver).get(methodName);
			return execFuncCall(func, args);
		} else if (receiver instanceof Class<?>) {
			Predicate<Method> isStatic = m -> (m.getModifiers()
					| Modifier.STATIC) != 0;
			Method method = findMethod((Class<?>) receiver, methodName, args,
					isStatic);
			if (method == null) {
				throw new RuntimeException(msg);
			}
			try {
				return method.invoke(null, args);
			} catch (IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				throw new RuntimeException(msg, e);
			}
		} else {
			Method method = findMethod(receiver.getClass(), methodName, args,
					m -> true);
			if (method == null) {
				throw new RuntimeException(msg);
			}
			try {
				return method.invoke(receiver, args);
			} catch (IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				throw new RuntimeException(msg, e);
			}
		}
	}

	private Object execBlock(UniBlock block, Scope scope) {
		Scope blockScope = Scope.createLocal(scope);
		Object lastValue = null;
		blockScope.name = scope.name;
		for (UniExpr expr : block.body) {
			if(isStepExecutionRunning.get())
			{
				state.setCurrentExpr(expr);
				isExecutionThreadWaiting.set(true);
				notifyAllThread();
				waitForWaitingFlagIs(true);
			}
			try{
				lastValue = execExpr(expr, blockScope);
			}
			catch (ControlException e){
				scope.removeChild(blockScope);
				throw e;
			}
		}
		return lastValue;
	}

	private Object execFuncCall(Object func, Object[] args) {
		assert func != null;

		if (func instanceof FunctionWithEngine) {
			return ((FunctionWithEngine) func).invoke(this, args);
		} else {
			Method m = findFunctionMethod(func.getClass());
			if (m != null) {
				try {
					return m.invoke(func, args);
				} catch (IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					throw new RuntimeException("Fail to invoke", e);
				}
			}
		}
		throw new RuntimeException("Not support function type: " + func);
	}
	
	protected Object execUniCharacterLiteral(UniCharacterLiteral expr, Scope scope){
		return ((UniCharacterLiteral) expr).value;
	}
	protected Object execUniStringLiteral(UniStringLiteral expr, Scope scope){
		return ((UniStringLiteral) expr).value;
	}
	
	protected Object execUnaryOp(UniUnaryOp uniOp, Scope scope) {
		switch (uniOp.operator) {
		case "!":
			return !toBool(execExpr(uniOp.expr, scope));
		case "-": {
			Object value = execExpr(uniOp.expr, scope);
			if (value instanceof Double) {
				return -((Double) value).doubleValue();
			}
			if (value instanceof Long) {
				return -((Long) value).longValue();
			}
			if (value instanceof Integer) {
				return -((Integer) value).intValue();
			}
		}
		case "_++":
		case "++_":
		case "_--":
		case "--_":
			if (uniOp.expr instanceof UniIdent) {
				UniIdent ident = (UniIdent) uniOp.expr;
				Number num = (Number) execExpr(uniOp.expr, scope);
				Calc.Operation<?> calculater = null;
				if (num instanceof Double) {
					calculater = Calc.doubleOperation;
				}
				if (num instanceof Long) {
					calculater = Calc.longOperation;
				}
				if (num instanceof Integer) {
					calculater = Calc.intOperation;
				}
				int address = getAddress(ident,scope);
				if (calculater != null) {
					switch (uniOp.operator) {
					case "_++":
						execAssign(address, calculater.add(num, 1), scope);
						return num;
					case "++_":
						return execAssign(address, calculater.add(num, 1), scope);
					case "_--":
						execAssign(address, calculater.sub(num, 1), scope);
						return num;
					case "--_":
						return execAssign(address, calculater.sub(num, 1), scope);
					}
				}
			}
		case "&":
			return getAddress(uniOp.expr,scope);
		case "*":{
			return scope.getValue((int)execExpr(uniOp.expr,scope));
			}
		case "()":
			return execExpr(uniOp.expr,scope);
		case "sizeof":{
			List l = new ArrayList<UniExpr>();
			if(uniOp.expr instanceof UniIdent)
				l.add(new UniStringLiteral(((UniIdent)uniOp.expr).name));
			else
				l.add(uniOp.expr);
			UniMethodCall umc = new UniMethodCall(null,"sizeof",l);
			return execExpr(umc,scope);
		}
		}
		throw new RuntimeException("Unkown binary operator: " + uniOp.operator);
	}
//
//	protected String execAddressOp(UniUnaryOp expr, Scope scope){
//		return getAddress(expr,scope);
//	}

//	protected Object execDereferenceOp(UniExpr expr, Scope scope){
//		return
//	}

	private Object execBinOp(UniBinOp binOp, Scope scope) {
		return execBinOp(binOp.operator, binOp.left, binOp.right, scope);
	}

	protected int getAddress(UniExpr expr, Scope scope) {
		if(expr instanceof UniIdent){
			UniIdent ui = (UniIdent)expr;
			return scope.getAddress(ui.name);
		}
		else if(expr instanceof UniUnaryOp){
			UniUnaryOp uuo = (UniUnaryOp)expr;
			if(uuo.operator.equals("*")){
				int refAddress = (int)execExpr(uuo.expr,scope);
				return refAddress;
			}
		}
		else if(expr instanceof UniBinOp){
			UniBinOp ubo = (UniBinOp)expr;
			if(ubo.operator.equals("[]")){
				return getAddress(new UniUnaryOp("*",new UniBinOp("+",ubo.left,ubo.right)),scope);
			}
			else if(ubo.operator.equals(".")){
				int startAddress = (int)execExpr(ubo.left,scope);
				String type = getType(ubo.left,scope);
				Map<String, Integer> offsets = (Map<String, Integer>) scope.get(type);
				int offset = offsets.get(((UniIdent)ubo.right).name);
				return startAddress + offset;
			}
		}
		throw new RuntimeException("Assignment failure: " + expr);
	}

	protected String getType(UniExpr expr, Scope scope) {
		if(expr instanceof UniIdent){
			UniIdent ui = (UniIdent)expr;
			return scope.getType(ui.name);
		}
		else if(expr instanceof UniUnaryOp){
			UniUnaryOp uuo = (UniUnaryOp)expr;
			if(uuo.operator.equals("*")){
				return getType(uuo.expr,scope);
			}
		}
		else if(expr instanceof UniBinOp){
			UniBinOp ubo = (UniBinOp)expr;
			if(ubo.operator.equals("[]")){
				String left = getType(ubo.left,scope);
				if(left != null){
					return left;
				}
				String right =  getType(ubo.right,scope);
				if(right != null){
					return right;
				}
			}
		}
		return null;
	}

	private String calcAddress(String var, Object idxObj){
		int lastIndexPos = var.lastIndexOf("[");
		String target = var.substring(0, lastIndexPos);
		String index =  var.substring(lastIndexPos).replace("[", "").replace("]", "");
		target += "[" + (Integer.parseInt(index) + (Integer)idxObj) + "]";
		return target;
	}
	protected Object execBinOp(String op, UniExpr left, UniExpr right,
			Scope scope) {

		switch (op) {
		case "=":
			return execAssign(getAddress(left,scope),execExpr(right, scope),scope);
		case "[]":
			return scope.getValue((getAddress(new UniBinOp(op,left,right),scope)));
		case ".":
			return scope.getValue((getAddress(new UniBinOp(op,left,right),scope)));
		case "()":{
			UniMethodCall umc = new UniMethodCall(null,((UniIdent)left).name,((UniArray)right).items);
			return execExpr(umc,scope);
		}
//		case ".":
//			return execExpr(getLeftReference(new UniBinOp(op,left,right),scope),scope);
		case "==":
			return Eq.eq(execExpr(left, scope), execExpr(right, scope));
		case "!=":
			return Eq.eq(execExpr(left, scope),
					execExpr(right, scope)) == false;
		case "<":
			return toDouble(execExpr(left, scope)) < toDouble(
					execExpr(right, scope));
		case "<=":
			return toDouble(execExpr(left, scope)) <= toDouble(
					execExpr(right, scope));
		case ">":
			return toDouble(execExpr(left, scope)) > toDouble(
					execExpr(right, scope));
		case ">=":
			return toDouble(execExpr(left, scope)) >= toDouble(
					execExpr(right, scope));

		case "+":
		case "-":
		case "*":
		case "/":
		case "%": {
			Object objL = execExpr(left, scope);
			Object objR = execExpr(right, scope);
//			if(objL instanceof String && ((String)objL).startsWith("&")){
//				return calcAddress((String)objL,objR);
//			}
//			else if(objR instanceof String && ((String)objR).startsWith("&")){
//				return calcAddress((String)objR,objL);
//			}
//			else
				if (objL instanceof Number && objR instanceof Number) {
				Number numL = (Number) objL;
				Number numR = (Number) objR;
				Calc.Operation<?> calculater = null;
				if (numL instanceof Double || numR instanceof Double) {
					calculater = Calc.doubleOperation;
				}
				else if (numL instanceof Float || numR instanceof Float) {
					calculater = Calc.floatOperation;
				}
				else if (numL instanceof Long || numR instanceof Long) {
					calculater = Calc.longOperation;
				}
				else if (numL instanceof Integer || numR instanceof Integer) {
					calculater = Calc.intOperation;
				}
				if (calculater != null) {
					switch (op) {
					case "+":
						return calculater.add(numL, numR);
					case "-":
						return calculater.sub(numL, numR);
					case "*":
						return calculater.mul(numL, numR);
					case "/":
						return calculater.div(numL, numR);
					case "%":
						return calculater.mod(numL, numR);
					}
				}
			}
			break;
		}
		case "&&":
			return toBool(execExpr(left, scope))
					&& toBool(execExpr(right, scope));
		case "||":
			return toBool(execExpr(left, scope))
					|| toBool(execExpr(right, scope));
		}
		if (op.length() > 1 && op.charAt(op.length() - 1) == '=') {
			if (left instanceof UniIdent) {
				String nextOp = op.substring(0, op.length() - 1);
				Object value = execBinOp(nextOp, left, right, scope);
				return execAssign(getAddress((UniIdent) left,scope), value, scope);
			}
		}
		throw new RuntimeException("Unkown binary operator: " + op);
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

	protected Object _execCast(String type, Object value){
		return value;
	}

	protected Object execAssign(int address, Object value, Scope scope) {
		String type = scope.getType(address);
		value = _execCast(type,value);
		scope.set(address, value);
		if(type.endsWith("*")){
			int taddress = (int)value;
			if(scope.isMallocArea(taddress)){
				int size = scope.getMallocSize(taddress);
				for(int i=0;i<size;++i){
					scope.typeOnMemory.put(taddress+i, type.substring(0,type.length()-1));
				}
			}
		}
		return value;
	}

	public static int toInt(Object obj) {
		if (obj instanceof Integer) {
			return ((Integer) obj).intValue();
		}
		throw new RuntimeException("Cannot covert to integer: " + obj);
	}

	public static double toDouble(Object obj) {
		if (obj instanceof Number) {
			return ((Number) obj).doubleValue();
		}
		throw new RuntimeException("Cannot covert to integer: " + obj);
	}

	public static boolean toBool(Object obj) {
		if (obj instanceof Boolean) {
			return ((Boolean) obj).booleanValue();
		}
		throw new RuntimeException("Cannot covert to boolean: " + obj);
	}

	private static Method findMethod(Class<?> clazz, String methodName,
			Object[] args, Predicate<Method> cond) {
		for (Method m : clazz.getMethods()) {
			if (methodName.equals(m.getName()) == false) {
				continue;
			}
			if (cond != null && cond.test(m) == false) {
				continue;
			}
			if ((m.getModifiers() | Modifier.STATIC) == 0) {
				continue;
			}
			Class<?>[] argTypes = m.getParameterTypes();
			if (argTypes.length != args.length) {
				continue;
			}
			for (int i = 0; i < argTypes.length; i++) {
				Object obj = args[i];
				Class<?> argType = argTypes[i];
				if (argType.isPrimitive()) {
					argType = getBoxType(argType);
				}
				boolean isOK = (obj == null
						|| argType.isAssignableFrom(obj.getClass()));
				if (!isOK) {
					continue;
				}
			}
			return m;
		}
		return null;
	}

	private static Method findFunctionMethod(final Class<?> clazz) {
		boolean isFunction = false;
		Class<?> funcClazz = clazz;
		find: while (funcClazz != null && Object.class != funcClazz) {
			for (Annotation an : funcClazz.getAnnotations()) {
				if (an instanceof FunctionalInterface) {
					isFunction = true;
					break find;
				}
			}
			for (Class<?> ic : funcClazz.getInterfaces()) {
				for (Annotation an : ic.getAnnotations()) {
					if (an instanceof FunctionalInterface) {
						funcClazz = ic;
						isFunction = true;
						break find;
					}
				}
			}
		}
		if (isFunction == false) {
			return null;
		}
		Method ret = null;
		for (Method m : funcClazz.getMethods()) {
			if ((m.getModifiers() & Modifier.ABSTRACT) == 0) {
				// Its not abstract.
				continue;
			}
			if (ret != null) {
				throw new RuntimeException(
						String.format("Ambiguous: %s or %s", ret, m));
			}
			ret = m;
		}
		if (ret == null) {
			throw new RuntimeException("Method not found.");
		}
		return ret;
	}

	private static Class<?> getBoxType(Class<?> clazz) {
		assert clazz.isPrimitive();
		if (clazz == int.class) {
			return Integer.class;
		}
		if (clazz == boolean.class) {
			return Boolean.class;
		}
		if (clazz == double.class) {
			return Double.class;
		}
		throw new RuntimeException("Not supported primitive type: " + clazz);
	}
}
