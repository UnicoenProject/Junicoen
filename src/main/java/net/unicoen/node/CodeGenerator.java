package net.unicoen.node;

import java.io.PrintStream;

public abstract class CodeGenerator extends Traverser {

	public final PrintStream out;

	public CodeGenerator(PrintStream out) {
		this.out = out;
	}

	@Override
	public final void traverseBoolLiteral(UniBoolLiteral node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseBoolLiteral(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseIntLiteral(UniIntLiteral node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseIntLiteral(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseLongLiteral(UniLongLiteral node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseLongLiteral(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseDoubleLiteral(UniDoubleLiteral node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseDoubleLiteral(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseStringLiteral(UniStringLiteral node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseStringLiteral(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseIdent(UniIdent node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseIdent(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseArray(UniArray node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseArray(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseFieldAccess(UniFieldAccess node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseFieldAccess(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseMethodCall(UniMethodCall node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseMethodCall(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseNew(UniNew node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseNew(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseNewArray(UniNewArray node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseNewArray(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseUnaryOp(UniUnaryOp node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseUnaryOp(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseBinOp(UniBinOp node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseBinOp(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseTernaryOp(UniTernaryOp node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseTernaryOp(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseCast(UniCast node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseCast(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseReturn(UniReturn node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseReturn(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseBreak(UniBreak node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseBreak(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseContinue(UniContinue node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseContinue(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseBlock(UniBlock node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseBlock(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseIf(UniIf node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseIf(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseFor(UniFor node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseFor(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseEnhancedFor(UniEnhancedFor node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseEnhancedFor(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseWhile(UniWhile node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseWhile(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseDoWhile(UniDoWhile node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseDoWhile(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseVariableDec(UniVariableDec node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseVariableDec(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseEmptyStatement(UniEmptyStatement node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseEmptyStatement(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseFieldDec(UniFieldDec node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseFieldDec(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseMethodDec(UniMethodDec node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseMethodDec(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseArg(UniArg node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseArg(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseClassDec(UniClassDec node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseClassDec(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseProgram(UniProgram node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseProgram(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseImport(UniImport node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseImport(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	@Override
	public final void traverseNamespace(UniNamespace node) {
		if (node.beforeComment != null) {
			writeComment(node.beforeComment);
		}
		dontCallTraverseNamespace(node);
		if (node.afterComment != null) {
			writeComment(node.afterComment);
		}
	}

	public abstract void dontCallTraverseBoolLiteral(UniBoolLiteral node);

	public abstract void dontCallTraverseIntLiteral(UniIntLiteral node);

	public abstract void dontCallTraverseLongLiteral(UniLongLiteral node);

	public abstract void dontCallTraverseDoubleLiteral(UniDoubleLiteral node);

	public abstract void dontCallTraverseStringLiteral(UniStringLiteral node);

	public abstract void dontCallTraverseIdent(UniIdent node);

	public abstract void dontCallTraverseArray(UniArray node);

	public abstract void dontCallTraverseFieldAccess(UniFieldAccess node);

	public abstract void dontCallTraverseMethodCall(UniMethodCall node);

	public abstract void dontCallTraverseNew(UniNew node);

	public abstract void dontCallTraverseNewArray(UniNewArray node);

	public abstract void dontCallTraverseUnaryOp(UniUnaryOp node);

	public abstract void dontCallTraverseBinOp(UniBinOp node);

	public abstract void dontCallTraverseTernaryOp(UniTernaryOp node);

	public abstract void dontCallTraverseCast(UniCast node);

	public abstract void dontCallTraverseReturn(UniReturn node);

	public abstract void dontCallTraverseBreak(UniBreak node);

	public abstract void dontCallTraverseContinue(UniContinue node);

	public abstract void dontCallTraverseBlock(UniBlock node);

	public abstract void dontCallTraverseIf(UniIf node);

	public abstract void dontCallTraverseFor(UniFor node);

	public abstract void dontCallTraverseEnhancedFor(UniEnhancedFor node);

	public abstract void dontCallTraverseWhile(UniWhile node);

	public abstract void dontCallTraverseDoWhile(UniDoWhile node);

	public abstract void dontCallTraverseVariableDec(UniVariableDec node);

	public abstract void dontCallTraverseEmptyStatement(UniEmptyStatement node);

	public abstract void dontCallTraverseFieldDec(UniFieldDec node);

	public abstract void dontCallTraverseMethodDec(UniMethodDec node);

	public abstract void dontCallTraverseArg(UniArg node);

	public abstract void dontCallTraverseClassDec(UniClassDec node);

	public abstract void dontCallTraverseProgram(UniProgram node);

	public abstract void dontCallTraverseImport(UniImport node);

	public abstract void dontCallTraverseNamespace(UniNamespace node);

	protected void writeComment(String comment) {
	}
}
