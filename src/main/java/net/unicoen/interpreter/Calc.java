package net.unicoen.interpreter;

public class Calc {
	public static abstract class Operation<T extends Number> {
		protected abstract T toValue(Number num);

		protected abstract T addT(T left, T right);

		protected abstract T subT(T left, T right);

		protected abstract T mulT(T left, T right);

		protected abstract T divT(T left, T right);

		protected abstract T modT(T left, T right);

		public Object add(Number left, Number right) {
			return addT(toValue(left), toValue(right));
		}

		public Object sub(Number left, Number right) {
			return subT(toValue(left), toValue(right));
		}

		public Object mul(Number left, Number right) {
			return mulT(toValue(left), toValue(right));
		}

		public Object div(Number left, Number right) {
			return divT(toValue(left), toValue(right));
		}

		public Object mod(Number left, Number right) {
			return modT(toValue(left), toValue(right));
		}
	}

	public static final Operation<Double> doubleOperation = new Operation<Double>() {

		@Override
		protected Double toValue(Number num) {
			return num.doubleValue();
		}

		@Override
		protected Double addT(Double left, Double right) {
			return left + right;
		}

		@Override
		protected Double subT(Double left, Double right) {
			return left - right;
		}

		@Override
		protected Double mulT(Double left, Double right) {
			return left * right;
		}

		@Override
		protected Double divT(Double left, Double right) {
			return left / right;
		}

		@Override
		protected Double modT(Double left, Double right) {
			return left % right;
		}

	};

	public static final Operation<Long> longOperation = new Operation<Long>() {

		@Override
		protected Long toValue(Number num) {
			return num.longValue();
		}

		@Override
		protected Long addT(Long left, Long right) {
			return left + right;
		}

		@Override
		protected Long subT(Long left, Long right) {
			return left - right;
		}

		@Override
		protected Long mulT(Long left, Long right) {
			return left * right;
		}

		@Override
		protected Long divT(Long left, Long right) {
			return left / right;
		}

		@Override
		protected Long modT(Long left, Long right) {
			return left % right;
		}

	};

	public static final Operation<Integer> intOperation = new Operation<Integer>() {

		@Override
		protected Integer toValue(Number num) {
			return num.intValue();
		}

		@Override
		protected Integer addT(Integer left, Integer right) {
			return left + right;
		}

		@Override
		protected Integer subT(Integer left, Integer right) {
			return left - right;
		}

		@Override
		protected Integer mulT(Integer left, Integer right) {
			return left * right;
		}

		@Override
		protected Integer divT(Integer left, Integer right) {
			return left / right;
		}

		@Override
		protected Integer modT(Integer left, Integer right) {
			return left % right;
		}

	};
}
