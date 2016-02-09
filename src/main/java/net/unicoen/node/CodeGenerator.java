package net.unicoen.node;

import java.io.PrintStream;
import java.util.List;

public abstract class CodeGenerator extends Traverser {

	public final PrintStream out;

	public CodeGenerator(PrintStream out) {
		this.out = out;
	}

	@Override
	public final void traverseBoolLiteral(UniBoolLiteral node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseBoolLiteral(node);

	}

	@Override
	public final void traverseIntLiteral(UniIntLiteral node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseIntLiteral(node);

	}

	@Override
	public final void traverseLongLiteral(UniLongLiteral node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseLongLiteral(node);

	}

	@Override
	public final void traverseDoubleLiteral(UniDoubleLiteral node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseDoubleLiteral(node);

	}

	@Override
	public final void traverseStringLiteral(UniStringLiteral node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseStringLiteral(node);

	}

	@Override
	public final void traverseIdent(UniIdent node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseIdent(node);

	}

	@Override
	public final void traverseArray(UniArray node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseArray(node);

	}

	@Override
	public final void traverseFieldAccess(UniFieldAccess node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseFieldAccess(node);

	}

	@Override
	public final void traverseMethodCall(UniMethodCall node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseMethodCall(node);

	}

	@Override
	public final void traverseNew(UniNew node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseNew(node);

	}

	@Override
	public final void traverseNewArray(UniNewArray node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseNewArray(node);

	}

	@Override
	public final void traverseUnaryOp(UniUnaryOp node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseUnaryOp(node);

	}

	@Override
	public final void traverseBinOp(UniBinOp node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseBinOp(node);

	}

	@Override
	public final void traverseTernaryOp(UniTernaryOp node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseTernaryOp(node);

	}

	@Override
	public final void traverseCast(UniCast node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseCast(node);

	}

	@Override
	public final void traverseReturn(UniReturn node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseReturn(node);

	}

	@Override
	public final void traverseBreak(UniBreak node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseBreak(node);

	}

	@Override
	public final void traverseContinue(UniContinue node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseContinue(node);

	}

	@Override
	public final void traverseBlock(UniBlock node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseBlock(node);

	}

	@Override
	public final void traverseIf(UniIf node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseIf(node);

	}

	@Override
	public final void traverseFor(UniFor node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseFor(node);

	}

	@Override
	public final void traverseEnhancedFor(UniEnhancedFor node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseEnhancedFor(node);

	}

	@Override
	public final void traverseWhile(UniWhile node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseWhile(node);

	}

	@Override
	public final void traverseDoWhile(UniDoWhile node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseDoWhile(node);

	}

	@Override
	public final void traverseVariableDec(UniVariableDec node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseVariableDec(node);

	}

	@Override
	public final void traverseEmptyStatement(UniEmptyStatement node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseEmptyStatement(node);

	}

	@Override
	public final void traverseFieldDec(UniFieldDec node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseFieldDec(node);

	}

	@Override
	public final void traverseMethodDec(UniMethodDec node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseMethodDec(node);

	}

	@Override
	public final void traverseArg(UniArg node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseArg(node);

	}

	@Override
	public final void traverseClassDec(UniClassDec node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseClassDec(node);

	}

	@Override
	public final void traverseProgram(UniProgram node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseProgram(node);

	}

	@Override
	public final void traverseImport(UniImport node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseImport(node);

	}

	@Override
	public final void traverseNamespace(UniNamespace node) {
		if (node.comments != null) {
			writeComments(node.comments);
		}
		dontCallTraverseNamespace(node);

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

	protected void writeComments(List<String> comments) {
	}
}
