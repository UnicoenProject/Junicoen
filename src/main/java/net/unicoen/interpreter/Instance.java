package net.unicoen.interpreter;

import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniMethodDec;

public class Instance {
	public final Scope objectScope;
	public final UniClassDec klass;

	private Instance(Scope scope, UniClassDec classDec) {
		assert scope != null;
		assert classDec != null;

		this.objectScope = scope;
		this.klass = classDec;
	}

	public static Instance makeInstance(Scope global, UniClassDec dec) {
		assert global != null;
		assert dec != null;

		return new Instance(Scope.createObject(global), dec);
	}

	public UniMethodDec findMethod(String name) {
		throw new RuntimeException("未実装！");
	}
}
