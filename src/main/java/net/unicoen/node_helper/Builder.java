package net.unicoen.node_helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniStringLiteral;

public class Builder {

	@SafeVarargs
	public static <T> List<T> list(T... args) {
		ArrayList<T> list = new ArrayList<>(args.length);
		for (T item : args) {
			list.add(item);
		}
		return list;
	}

	public static UniArg arg(String type, String name) {
		return new UniArg(type, name);
	}

	public static UniBlock block(UniExpr... exprs) {
		return new UniBlock(new ArrayList<>(Arrays.asList(exprs)));
	}

	public static UniIntLiteral lit(int value) {
		return new UniIntLiteral(value);
	}

	public static UniBoolLiteral lit(boolean value) {
		return new UniBoolLiteral(value);
	}

	public static UniStringLiteral lit(String value) {
		return new UniStringLiteral(value);
	}

	public static UniIdent ident(String name) {
		return new UniIdent(name);
	}

	public static UniBinOp bin(UniExpr leftExpr, String op, UniExpr rightExpr) {
		return new UniBinOp(op, leftExpr, rightExpr);
	}
}
