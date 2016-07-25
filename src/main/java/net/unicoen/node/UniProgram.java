package net.unicoen.node;

import java.util.List;
import net.unicoen.node_helper.*;

public class UniProgram extends UniNode {
	public List<UniExpr> nodes;
	public List<UniImport> imports;
	public UniNamespace namespace;
	public List<UniInterfaceDec> interfaces;

	public UniProgram() {
	}

	public UniProgram(List<UniExpr> nodes, List<UniImport> imports, UniNamespace namespace, List<UniInterfaceDec> interfaces) {
		this.nodes = nodes;
		this.imports = imports;
		this.namespace = namespace;
		this.interfaces = interfaces;
	}

	@Override
	public String toString() {
		return "Program";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (nodes == null ? 0 : nodes.hashCode());
		result = result * 31 + (imports == null ? 0 : imports.hashCode());
		result = result * 31 + (namespace == null ? 0 : namespace.hashCode());
		result = result * 31 + (interfaces == null ? 0 : interfaces.hashCode());
		result = result * 31 + (comments == null ? 0 : comments.hashCode());
		result = result * 31 + (codeRange == null ? 0 : codeRange.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniProgram)) return false;
		UniProgram that = (UniProgram)obj;
		return (this.nodes == null ? that.nodes == null : this.nodes.equals(that.nodes))
			&& (this.imports == null ? that.imports == null : this.imports.equals(that.imports))
			&& (this.namespace == null ? that.namespace == null : this.namespace.equals(that.namespace))
			&& (this.interfaces == null ? that.interfaces == null : this.interfaces.equals(that.interfaces))
			&& (this.comments == null ? that.comments == null : this.comments.equals(that.comments))
			&& (this.codeRange == null ? that.codeRange == null : this.codeRange.equals(that.codeRange));
	}

	public void merge(UniProgram that) {
		if (that.nodes != null) {
			if (this.nodes == null) {
				this.nodes = that.nodes;
			} else {
				this.nodes.addAll(that.nodes);
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
		if (that.interfaces != null) {
			if (this.interfaces == null) {
				this.interfaces = that.interfaces;
			} else {
				this.interfaces.addAll(that.interfaces);
			}
		}
		if (that.comments != null) {
			if (this.comments == null) {
				this.comments = that.comments;
			} else {
				this.comments.addAll(that.comments);
			}
		}
		if (that.codeRange != null) {
			this.codeRange = that.codeRange;
		}
	}
}
