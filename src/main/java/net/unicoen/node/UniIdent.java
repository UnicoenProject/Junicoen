package net.unicoen.node;

public class UniIdent extends UniExpr {
	public String name;

	public UniIdent() {
	}

	public UniIdent(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ident(" + name + ")";
	}

	@Override
	public int hashCode() {
		return (name == null ? 0 : name.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniIdent))
			return false;
		UniIdent that = (UniIdent) obj;
		return (this.name == null ? that.name == null : this.name
				.equals(that.name));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniIdent that) {
		if (that.name != null) {
			this.name = that.name;
		}
	}
}
