package net.unicoen.interpreter;

import java.util.function.Consumer;

public class StdLibLoader {

	private final Scope global;

	private StdLibLoader(Scope global) {
		this.global = global;
	}

	public static void initialize(Scope global) {
		StdLibLoader loader = new StdLibLoader(global);
		loader.initJavaLang();
		loader.initMyLib();
		loader.initTurtle();
	}

	private void initJavaLang() {
		// find java.lang.* class dynamically
		global.setListener((String key, Consumer<Object> setDefault) -> {
			try {
				Class<?> clazz = Class.forName("java.lang." + key);
				setDefault.accept(clazz);
			} catch (Exception e) {
			}
		});
	}

	private void initMyLib() {
		global.setTop("MyLib", null,"FUNCTION");
		Scope scope = Scope.createObject(global);
		scope.setFunc("printInt", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				engine.out.println(args[0]);
				return null;
			}
		},"void");
		scope.setFunc("print", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				engine.out.println(args[0]);
				return null;
			}
		},"void");
		global.set(global.getAddress("MyLib"), scope);
	}

	private void initTurtle() {
		global.setFunc("rt", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				engine.out.print("R" + args[0]);
				return null;
			}
		},"FUNCTION");
		global.setFunc("lt", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				engine.out.print("L" + args[0]);
				return null;
			}
		},"FUNCTION");
		global.setFunc("fd", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				engine.out.print("F" + args[0]);
				return null;
			}
		},"FUNCTION");
		global.setFunc("bk", new FunctionWithEngine() {
			@Override
			public Object invoke(Engine engine, Object[] args) {
				engine.out.print("B" + args[0]);
				return null;
			}
		},"FUNCTION");
	}
}
