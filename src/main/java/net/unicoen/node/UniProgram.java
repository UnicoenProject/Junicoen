package net.unicoen.node;

import java.util.List;

public class UniProgram extends UniNode {
	public List<UniClassDec> classes;
	public List<UniImport> imports;
	public UniNamespace namespace;

	public UniProgram() {
	}

	public UniProgram(List<UniClassDec> classes, List<UniImport> imports, UniNamespace namespace) {
		this.classes = classes;
		this.imports = imports;
		this.namespace = namespace;
	}

	@Override
	public String toString() {
		return "Program";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (classes == null ? 0 : classes.hashCode());
		result = result * 31 + (imports == null ? 0 : imports.hashCode());
		result = result * 31 + (namespace == null ? 0 : namespace.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniProgram)) return false;
		UniProgram that = (UniProgram)obj;
		return (this.classes == null ? that.classes == null : this.classes.equals(that.classes))
			&& (this.imports == null ? that.imports == null : this.imports.equals(that.imports))
			&& (this.namespace == null ? that.namespace == null : this.namespace.equals(that.namespace));
	}

	public void merge(UniProgram that) {
		if (that.classes != null) {
			if (this.classes == null) {
				this.classes = that.classes;
			} else {
				this.classes.addAll(that.classes);
			}
		}
		if (that.imports != null) {
			if (this.imports == null) {
				this.imports = that.imports;
			} else {
				this.imports.addAll(that.imports);
			}
		}
		if (that.namespace != null) {
			this.namespace = that.namespace;
		}
	}
}
