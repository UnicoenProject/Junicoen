package net.unicoen.generator;

public class IntStack {
	private int[] values;

	/** 一番左の空の位置 */
	private int current;

	public IntStack() {
		values = new int[8];
		current = 0;
	}

	public void push(int value) {
		if (values.length == current) {
			extend();
		}
		values[current++] = value;
	}

	public int pop() {
		return values[--current];
	}

	public int peek() {
		return values[current - 1];
	}

	private void extend() {
		int[] next = new int[values.length * 2];
		for (int i = 0; i < values.length; i++) {
			next[i] = values[i];
		}
		values = next;
	}
}
