package net.unicoen.node;

public abstract class Traverser {

	public abstract void traverseBoolLiteral(UniBoolLiteral node);
	public abstract void traverseIntLiteral(UniIntLiteral node);
	public abstract void traverseLongLiteral(UniLongLiteral node);
	public abstract void traverseDoubleLiteral(UniDoubleLiteral node);
	public abstract void traverseStringLiteral(UniStringLiteral node);
	public abstract void traverseIdent(UniIdent node);
	public abstract void traverseArray(UniArray node);
	public abstract void traverseFieldAccess(UniFieldAccess node);
	public abstract void traverseMethodCall(UniMethodCall node);
	public abstract void traverseNew(UniNew node);
	public abstract void traverseNewArray(UniNewArray node);
	public abstract void traverseUnaryOp(UniUnaryOp node);
	public abstract void traverseBinOp(UniBinOp node);
	public abstract void traverseTernaryOp(UniTernaryOp node);
	public abstract void traverseCast(UniCast node);
	public abstract void traverseReturn(UniReturn node);
	public abstract void traverseBreak(UniBreak node);
	public abstract void traverseContinue(UniContinue node);
	public abstract void traverseBlock(UniBlock node);
	public abstract void traverseIf(UniIf node);
	public abstract void traverseFor(UniFor node);
	public abstract void traverseEnhancedFor(UniEnhancedFor node);
	public abstract void traverseWhile(UniWhile node);
	public abstract void traverseDoWhile(UniDoWhile node);
	public abstract void traverseSwitch(UniSwitch node);
	public abstract void traverseSwitchUnit(UniSwitchUnit node);
	public abstract void traverseVariableDec(UniVariableDec node);
	public abstract void traverseEmptyStatement(UniEmptyStatement node);
	public abstract void traverseFieldDec(UniFieldDec node);
	public abstract void traverseMethodDec(UniMethodDec node);
	public abstract void traverseArg(UniArg node);
	public abstract void traverseEnumConstant(UniEnumConstant node);
	public abstract void traverseClassDec(UniClassDec node);
	public abstract void traverseInterfaceDec(UniInterfaceDec node);
	public abstract void traverseProgram(UniProgram node);
	public abstract void traverseImport(UniImport node);
	public abstract void traverseNamespace(UniNamespace node);

	public final void traverseExpr(UniExpr node) {
		if (node instanceof UniBoolLiteral) {
			traverseBoolLiteral((UniBoolLiteral)node);
			return;
		}
		if (node instanceof UniIntLiteral) {
			traverseIntLiteral((UniIntLiteral)node);
			return;
		}
		if (node instanceof UniLongLiteral) {
			traverseLongLiteral((UniLongLiteral)node);
			return;
		}
		if (node instanceof UniDoubleLiteral) {
			traverseDoubleLiteral((UniDoubleLiteral)node);
			return;
		}
		if (node instanceof UniStringLiteral) {
			traverseStringLiteral((UniStringLiteral)node);
			return;
		}
		if (node instanceof UniIdent) {
			traverseIdent((UniIdent)node);
			return;
		}
		if (node instanceof UniArray) {
			traverseArray((UniArray)node);
			return;
		}
		if (node instanceof UniFieldAccess) {
			traverseFieldAccess((UniFieldAccess)node);
			return;
		}
		if (node instanceof UniMethodCall) {
			traverseMethodCall((UniMethodCall)node);
			return;
		}
		if (node instanceof UniNew) {
			traverseNew((UniNew)node);
			return;
		}
		if (node instanceof UniNewArray) {
			traverseNewArray((UniNewArray)node);
			return;
		}
		if (node instanceof UniUnaryOp) {
			traverseUnaryOp((UniUnaryOp)node);
			return;
		}
		if (node instanceof UniBinOp) {
			traverseBinOp((UniBinOp)node);
			return;
		}
		if (node instanceof UniTernaryOp) {
			traverseTernaryOp((UniTernaryOp)node);
			return;
		}
		if (node instanceof UniCast) {
			traverseCast((UniCast)node);
			return;
		}
		if (node instanceof UniReturn) {
			traverseReturn((UniReturn)node);
			return;
		}
		if (node instanceof UniBreak) {
			traverseBreak((UniBreak)node);
			return;
		}
		if (node instanceof UniContinue) {
			traverseContinue((UniContinue)node);
			return;
		}
		if (node instanceof UniBlock) {
			traverseBlock((UniBlock)node);
			return;
		}
		if (node instanceof UniIf) {
			traverseIf((UniIf)node);
			return;
		}
		if (node instanceof UniFor) {
			traverseFor((UniFor)node);
			return;
		}
		if (node instanceof UniEnhancedFor) {
			traverseEnhancedFor((UniEnhancedFor)node);
			return;
		}
		if (node instanceof UniWhile) {
			traverseWhile((UniWhile)node);
			return;
		}
		if (node instanceof UniDoWhile) {
			traverseDoWhile((UniDoWhile)node);
			return;
		}
		if (node instanceof UniSwitch) {
			traverseSwitch((UniSwitch)node);
			return;
		}
		if (node instanceof UniSwitchUnit) {
			traverseSwitchUnit((UniSwitchUnit)node);
			return;
		}
		if (node instanceof UniVariableDec) {
			traverseVariableDec((UniVariableDec)node);
			return;
		}
		if (node instanceof UniEmptyStatement) {
			traverseEmptyStatement((UniEmptyStatement)node);
			return;
		}
		throw new RuntimeException("Unknown node: " + node);
	}

	public final void traverseMemberDec(UniMemberDec node) {
		if (node instanceof UniFieldDec) {
			traverseFieldDec((UniFieldDec)node);
			return;
		}
		if (node instanceof UniMethodDec) {
			traverseMethodDec((UniMethodDec)node);
			return;
		}
		if (node instanceof UniArg) {
			traverseArg((UniArg)node);
			return;
		}
		if (node instanceof UniEnumConstant) {
			traverseEnumConstant((UniEnumConstant)node);
			return;
		}
		if (node instanceof UniClassDec) {
			traverseClassDec((UniClassDec)node);
			return;
		}
		throw new RuntimeException("Unknown node: " + node);
	}

	public final void traverseNode(UniNode node) {
		if (node instanceof UniExpr) {
			traverseExpr((UniExpr)node);
			return;
		}
		if (node instanceof UniMemberDec) {
			traverseMemberDec((UniMemberDec)node);
			return;
		}
		if (node instanceof UniInterfaceDec) {
			traverseInterfaceDec((UniInterfaceDec)node);
			return;
		}
		if (node instanceof UniProgram) {
			traverseProgram((UniProgram)node);
			return;
		}
		if (node instanceof UniImport) {
			traverseImport((UniImport)node);
			return;
		}
		if (node instanceof UniNamespace) {
			traverseNamespace((UniNamespace)node);
			return;
		}
		throw new RuntimeException("Unknown node: " + node);
	}
}
