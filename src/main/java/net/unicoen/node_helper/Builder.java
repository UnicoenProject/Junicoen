package net.unicoen.node_helper;

import java.util.ArrayList;
import java.util.List;

import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIntLiteral;

public class Builder {

	@SafeVarargs
	public static <T> List<T> list(T... args) {
		ArrayList<T> list = new ArrayList<>(args.length);
		for (T item : args) {
			list.add(item);
		}
		return list;
	}

	public static UniIntLiteral lit(int value) {
		return new UniIntLiteral(value);
	}

	public static UniBoolLiteral lit(boolean value) {
		return new UniBoolLiteral(value);
	}

	public static UniIdent ident(String name) {
		return new UniIdent(name);
	}

	public static UniBinOp bin(UniExpr leftExpr, String op, UniExpr rightExpr) {
		return new UniBinOp(op, leftExpr, rightExpr);
	}
}
