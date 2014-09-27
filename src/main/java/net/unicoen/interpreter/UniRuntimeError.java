package net.unicoen.interpreter;

public class UniRuntimeError extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UniRuntimeError() {
		super();
	}

	public UniRuntimeError(String message) {
		super(message);
	}

}
