package net.unicoen.parser.blockeditor;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniArray;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniBreak;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniContinue;
import net.unicoen.node.UniDoWhile;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniFieldDec;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniLongLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNew;
import net.unicoen.node.UniNewArray;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniTernaryOp;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;

public abstract class UniModelVisitor {
	public abstract Object visitBoolLiteral(UniBoolLiteral node);

	public abstract Object visitIntLiteral(UniIntLiteral node);

	public abstract Object visitLongLiteral(UniLongLiteral node);

	public abstract Object visitDoubleLiteral(UniDoubleLiteral node);

	public abstract Object visitStringLiteral(UniStringLiteral node);

	public abstract Object visitIdent(UniIdent node);

	public abstract Object visitArray(UniArray node);

	public abstract Object visitFieldAccess(UniFieldAccess node);

	public abstract Object visitMethodCall(UniMethodCall node);

	public abstract Object visitNew(UniNew node);

	public abstract Object visitNewArray(UniNewArray node);

	public abstract Object visitUnaryOp(UniUnaryOp node);

	public abstract Object visitBinOp(UniBinOp node);

	public abstract Object visitTernaryOp(UniTernaryOp node);

	public abstract Object visitReturn(UniReturn node);

	public abstract Object visitBreak(UniBreak node);

	public abstract Object visitContinue(UniContinue node);

	public abstract Object visitBlock(UniBlock node);

	public abstract Object visitIf(UniIf node);

	public abstract Object visitFor(UniFor node);

	public abstract Object visitWhile(UniWhile node);

	public abstract Object visitDoWhile(UniDoWhile node);

	public abstract Object visitVariableDec(UniVariableDec node);

	public abstract Object visitFieldDec(UniFieldDec node);

	public abstract Object visitMethodDec(UniMethodDec node);

	public abstract Object visitArg(UniArg node);

	public abstract Object visitClassDec(UniClassDec node);

	public final Object visitExpr(UniExpr node) {
		if (node instanceof UniBoolLiteral) {
			return visitBoolLiteral((UniBoolLiteral) node);
		}
		if (node instanceof UniIntLiteral) {
			return visitIntLiteral((UniIntLiteral) node);
			
		}
		if (node instanceof UniLongLiteral) {
			return visitLongLiteral((UniLongLiteral) node);
		}
		if (node instanceof UniDoubleLiteral) {
			return visitDoubleLiteral((UniDoubleLiteral) node);
		}
		if (node instanceof UniStringLiteral) {
			return visitStringLiteral((UniStringLiteral) node);
		}
		if (node instanceof UniIdent) {
			return visitIdent((UniIdent) node);
		}
		if (node instanceof UniArray) {
			return visitArray((UniArray) node);
		}
		if (node instanceof UniFieldAccess) {
			return visitFieldAccess((UniFieldAccess) node);
		}
		if (node instanceof UniMethodCall) {
			return visitMethodCall((UniMethodCall) node);
		}
		if (node instanceof UniNew) {
			return visitNew((UniNew) node);

		}
		if (node instanceof UniNewArray) {
			return visitNewArray((UniNewArray) node);
			
		}
		if (node instanceof UniUnaryOp) {
			return visitUnaryOp((UniUnaryOp) node);
		}
		if (node instanceof UniBinOp) {
			return visitBinOp((UniBinOp) node);
		}
		if (node instanceof UniTernaryOp) {
			return visitTernaryOp((UniTernaryOp) node);
		}
		if (node instanceof UniReturn) {
			return visitReturn((UniReturn) node);
		}
		if (node instanceof UniBreak) {
			return visitBreak((UniBreak) node);
		}
		if (node instanceof UniContinue) {
			return visitContinue((UniContinue) node);
		}
		if (node instanceof UniBlock) {
			return visitBlock((UniBlock) node);
		}
		if (node instanceof UniIf) {
			return visitIf((UniIf) node);
		}
		if (node instanceof UniFor) {
			return visitFor((UniFor) node);
		}
		if (node instanceof UniWhile) {
			return visitWhile((UniWhile) node);
		}
		if (node instanceof UniDoWhile) {
			return visitDoWhile((UniDoWhile) node);
		}
		if (node instanceof UniVariableDec) {
			return visitVariableDec((UniVariableDec) node);
		}
		throw new RuntimeException("Unknown node: " + node);
	}

	public final Object visitMemberDec(UniMemberDec node) {
		if (node instanceof UniFieldDec) {
			return visitFieldDec((UniFieldDec) node);
			
		}
		if (node instanceof UniMethodDec) {
			return visitMethodDec((UniMethodDec) node);
		}
		throw new RuntimeException("Unknown node: " + node);
	}

}
