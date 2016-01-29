package net.unicoen.node;

import java.util.List;

public class UniEnhancedFor extends UniExpr {
	public List<String> modifiers;
	public String type;
	public String name;
	public UniExpr container;
	public UniExpr statement;

	public UniEnhancedFor() {
	}

	public UniEnhancedFor(List<String> modifiers, String type, String name, UniExpr container, UniExpr statement) {
		this.modifiers = modifiers;
		this.type = type;
		this.name = name;
		this.container = container;
		this.statement = statement;
	}

	@Override
	public String toString() {
		return "EnhancedFor(" + type + ", " + name + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (modifiers == null ? 0 : modifiers.hashCode());
		result = result * 31 + (type == null ? 0 : type.hashCode());
		result = result * 31 + (name == null ? 0 : name.hashCode());
		result = result * 31 + (container == null ? 0 : container.hashCode());
		result = result * 31 + (statement == null ? 0 : statement.hashCode());
		result = result * 31 + (beforeComment == null ? 0 : beforeComment.hashCode());
		result = result * 31 + (afterComment == null ? 0 : afterComment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniEnhancedFor)) return false;
		UniEnhancedFor that = (UniEnhancedFor)obj;
		return (this.modifiers == null ? that.modifiers == null : this.modifiers.equals(that.modifiers))
			&& (this.type == null ? that.type == null : this.type.equals(that.type))
			&& (this.name == null ? that.name == null : this.name.equals(that.name))
			&& (this.container == null ? that.container == null : this.container.equals(that.container))
			&& (this.statement == null ? that.statement == null : this.statement.equals(that.statement))
			&& (this.beforeComment == null ? that.beforeComment == null : this.beforeComment.equals(that.beforeComment))
			&& (this.afterComment == null ? that.afterComment == null : this.afterComment.equals(that.afterComment));
	}

	@Override
	public boolean isStatement() {
		return true;
	}

	public void merge(UniEnhancedFor that) {
		if (that.modifiers != null) {
			if (this.modifiers == null) {
				this.modifiers = that.modifiers;
			} else {
				this.modifiers.addAll(that.modifiers);
			}
		}
		if (that.type != null) {
			this.type = that.type;
		}
		if (that.name != null) {
			this.name = that.name;
		}
		if (that.container != null) {
			this.container = that.container;
		}
		if (that.statement != null) {
			this.statement = that.statement;
		}
		if (that.beforeComment != null) {
			this.beforeComment = that.beforeComment;
		}
		if (that.afterComment != null) {
			this.afterComment = that.afterComment;
		}
	}
}
