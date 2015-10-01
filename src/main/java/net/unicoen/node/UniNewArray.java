package net.unicoen.node;

import java.util.List;

public class UniNewArray extends UniExpr {
	public String type;
	public List<UniExpr> elementsNum;
	public UniArray value;

	public UniNewArray() {
	}

	public UniNewArray(String type, List<UniExpr> elementsNum, UniArray value) {
		this.type = type;
		this.elementsNum = elementsNum;
		this.value = value;
	}

	@Override
	public String toString() {
		return "NewArray(" + type + ")";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + (type == null ? 0 : type.hashCode());
		result = result * 31
				+ (elementsNum == null ? 0 : elementsNum.hashCode());
		result = result * 31 + (value == null ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniNewArray))
			return false;
		UniNewArray that = (UniNewArray) obj;
		return (this.type == null ? that.type == null : this.type
				.equals(that.type))
				&& (this.elementsNum == null ? that.elementsNum == null
						: this.elementsNum.equals(that.elementsNum))
				&& (this.value == null ? that.value == null : this.value
						.equals(that.value));
	}

	@Override
	public boolean isStatement() {
		return false;
	}

	public void merge(UniNewArray that) {
		if (that.type != null) {
			this.type = that.type;
		}
		if (that.elementsNum != null) {
			if (this.elementsNum == null) {
				this.elementsNum = that.elementsNum;
			} else {
				this.elementsNum.addAll(that.elementsNum);
			}
		}
		if (that.value != null) {
			this.value = that.value;
		}
	}
}
