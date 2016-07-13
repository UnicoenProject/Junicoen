package net.unicoen.node_helper;

import java.util.List;

import com.google.common.collect.Lists;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniStringLiteral;

public class Builder {
	@SafeVarargs
	public static <T> List<T> list(T... args) {
		return Lists.newArrayList(args);
	}

	public static UniArg arg(String type, String name) {
		return new UniArg(type, name);
	}

	public static UniBlock block(UniExpr... exprs) {
		return new UniBlock(Lists.newArrayList(exprs), null);
	}

	public static UniIntLiteral lit(int value) {
		return new UniIntLiteral(value);
	}

	public static UniDoubleLiteral lit(double value) {
		return new UniDoubleLiteral(value);
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

	public static UniFieldAccess field(UniExpr receiver, String fieldName) {
		return new UniFieldAccess(receiver, fieldName,null);
	}
}
