package net.unicoen.interpreter;

public interface FunctionWithEngine {
	public Object invoke(Engine engine, Object[] args);
}
