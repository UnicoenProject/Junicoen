package net.unicoen.interpreter;

public class Eq {
	public static boolean eq(Object left, Object right) {
		if (left == null) {
			return right == null;
		} else if (right == null) {
			return false;
		}
		return eqNotNull(left, right);
	}

	private static boolean eqNotNull(Object left, Object right) {
		if (left instanceof Boolean && right instanceof Boolean) {
			return left.equals(right);
		}
		if (left instanceof Number && right instanceof Number) {
			Number numL = (Number) left;
			Number numR = (Number) right;
			return numL.doubleValue() == numR.doubleValue();
		}
		return left == right;
	}
}
