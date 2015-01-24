package net.unicoen.node;

public abstract class Traverser {

	public abstract void traverseBoolLiteral(UniBoolLiteral node);
	public abstract void traverseIntLiteral(UniIntLiteral node);
	public abstract void traverseLongLiteral(UniLongLiteral node);
	public abstract void traverseDoubleLiteral(UniDoubleLiteral node);
	public abstract void traverseStringLiteral(UniStringLiteral node);
	public abstract void traverseIdent(UniIdent node);
	public abstract void traverseFieldAccess(UniFieldAccess node);
	public abstract void traverseMethodCall(UniMethodCall node);
	public abstract void traverseUnaryOp(UniUnaryOp node);
	public abstract void traverseBinOp(UniBinOp node);
	public abstract void traverseCondOp(UniCondOp node);
	public abstract void traverseReturn(UniReturn node);
	public abstract void traverseBreak(UniBreak node);
	public abstract void traverseContinue(UniContinue node);
	public abstract void traverseBlock(UniBlock node);
	public abstract void traverseIf(UniIf node);
	public abstract void traverseFor(UniFor node);
	public abstract void traverseWhile(UniWhile node);
	public abstract void traverseDoWhile(UniDoWhile node);
	public abstract void traverseDecVar(UniDecVar node);
	public abstract void traverseDecVarWithValue(UniDecVarWithValue node);
	public abstract void traverseMethodDec(UniMethodDec node);
	public abstract void traverseArg(UniArg node);
	public abstract void traverseClassDec(UniClassDec node);

	public final void traverseExpr(UniExpr node) {
		if (node instanceof UniBoolLiteral) {
			traverseBoolLiteral((UniBoolLiteral)node);
		}
		if (node instanceof UniIntLiteral) {
			traverseIntLiteral((UniIntLiteral)node);
		}
		if (node instanceof UniLongLiteral) {
			traverseLongLiteral((UniLongLiteral)node);
		}
		if (node instanceof UniDoubleLiteral) {
			traverseDoubleLiteral((UniDoubleLiteral)node);
		}
		if (node instanceof UniStringLiteral) {
			traverseStringLiteral((UniStringLiteral)node);
		}
		if (node instanceof UniIdent) {
			traverseIdent((UniIdent)node);
		}
		if (node instanceof UniFieldAccess) {
			traverseFieldAccess((UniFieldAccess)node);
		}
		if (node instanceof UniMethodCall) {
			traverseMethodCall((UniMethodCall)node);
		}
		if (node instanceof UniUnaryOp) {
			traverseUnaryOp((UniUnaryOp)node);
		}
		if (node instanceof UniBinOp) {
			traverseBinOp((UniBinOp)node);
		}
		if (node instanceof UniCondOp) {
			traverseCondOp((UniCondOp)node);
		}
		if (node instanceof UniReturn) {
			traverseReturn((UniReturn)node);
		}
		if (node instanceof UniBreak) {
			traverseBreak((UniBreak)node);
		}
		if (node instanceof UniContinue) {
			traverseContinue((UniContinue)node);
		}
		if (node instanceof UniBlock) {
			traverseBlock((UniBlock)node);
		}
		if (node instanceof UniIf) {
			traverseIf((UniIf)node);
		}
		if (node instanceof UniFor) {
			traverseFor((UniFor)node);
		}
		if (node instanceof UniWhile) {
			traverseWhile((UniWhile)node);
		}
		if (node instanceof UniDoWhile) {
			traverseDoWhile((UniDoWhile)node);
		}
		if (node instanceof UniDecVar) {
			traverseDecVar((UniDecVar)node);
		}
		if (node instanceof UniDecVarWithValue) {
			traverseDecVarWithValue((UniDecVarWithValue)node);
		}
		throw new RuntimeException("Unknown node: " + node);
	}

	public final void traverseMemberDec(UniMemberDec node) {
		if (node instanceof UniMethodDec) {
			traverseMethodDec((UniMethodDec)node);
		}
		throw new RuntimeException("Unknown node: " + node);
	}
}
