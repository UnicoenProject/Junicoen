package net.unicoen.node;

public class UniFieldAccess extends UniExpr {
	public UniExpr receiver;
	public String fieldName;

	public UniFieldAccess() {
	}

	public UniFieldAccess(UniExpr receiver, String fieldName) {
		this.receiver = receiver;
		this.fieldName = fieldName;
	}

	@Override
	public String toString() {
		return "FieldAccess(" + fieldName + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof UniFieldAccess)) return false;
		UniFieldAccess that = (UniFieldAccess)obj;
		return (this.receiver == null ? that.receiver == null : this.receiver.equals(that.receiver))
			&& (this.fieldName == null ? that.fieldName == null : this.fieldName.equals(that.fieldName));
	}

	@Override
	public boolean isStatement() {
		return false;
	}
}
