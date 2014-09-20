package net.unicoen.node;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	public static <T> List<T> list(T... args) {
		ArrayList<T> list = new ArrayList<>();
		for (T item : args) {
			list.add(item);
		}
		return list;
	}

	public static UniIntLiteral lit(int num) {
		return new UniIntLiteral() {
			{
				value = num;
			}
		};
	}

	public static UniIdent ident(String identName) {
		return new UniIdent() {
			{
				name = identName;
			}
		};
	}

	public static UniBinOp bin(UniExpr leftExpr, String op, UniExpr rightExpr) {
		return new UniBinOp() {
			{
				operator = op;
				left = leftExpr;
				right = rightExpr;
			}
		};
	}
}
