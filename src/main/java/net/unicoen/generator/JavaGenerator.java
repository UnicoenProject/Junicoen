package net.unicoen.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniArray;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniBreak;
import net.unicoen.node.UniCast;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniContinue;
import net.unicoen.node.UniDoWhile;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniEmptyStatement;
import net.unicoen.node.UniEnhancedFor;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniFieldDec;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniImport;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniInterfaceDec;
import net.unicoen.node.UniLongLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNamespace;
import net.unicoen.node.UniNew;
import net.unicoen.node.UniNewArray;
import net.unicoen.node.UniProgram;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniSwitch;
import net.unicoen.node.UniSwitchUnit;
import net.unicoen.node.UniTernaryOp;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;

public class JavaGenerator extends CodeGenerator {
	private final String NEW_LINE = System.getProperty("line.separator");

	private int indent = 0;
	private boolean indentAtThisLine = false;

	private final IntStack exprPriority = new IntStack();

	protected JavaGenerator(PrintStream out) {
		super(out);
		exprPriority.push(0);
	}

	protected void withIndent(Runnable runnable) {
		indent++;
		runnable.run();
		indent--;
	}

	@Override
	public void writeComments(List<String> comments) {
		if (comments.size() > 0) {
			newline();
			for (String comment : comments) {
				print(comment);
				newline();
			}
		}
	}

	protected void print(String str) {
		if (indentAtThisLine == false) {
			indentAtThisLine = true;
			for (int i = 0; i < indent; i++) {
				out.print("\t");
			}
		}
		out.print(str);
	}

	protected void newline() {
		out.print(NEW_LINE);
		indentAtThisLine = false;
	}

	private int priorityTable(String operator) {
		switch (operator) {
		case "*":
		case "/":
		case "%":
			return 11;
		case "+":
		case "-":
			return 10;
		case ">>":
		case "<<":
			return 9;
		case ">":
		case ">=":
		case "<":
		case "<=":
		case "instanceof":
			return 8;
		case "==":
		case "!=":
			return 7;
		case "&":
			return 6;
		case "^":
			return 5;
		case "|":
			return 4;
		case "&&":
			return 3;
		case "||":
			return 2;
		case "?":
		case ":":
			return 1;
		}
		return 0;
	}

	private void parseExpr(UniExpr node, int priority) {
		exprPriority.push(priority);
		traverseExpr(node);
		exprPriority.pop();
	}

	protected void parseExpr(UniExpr node) {
		parseExpr(node, 0);
	}

	/**
	 * ステートメントを出力し、改行します。 関数呼び出し等の場合は、セミコロンも出力します。
	 */
	private void parseStatement(UniExpr expr) {
		parseExpr(expr);
		if (expr.isStatement() == false) {
			print(";");
		}
		newline();
	}

	/** インデントし、複数のステートメントを出力します */
	private void parseBlockInner(UniBlock block) {
		withIndent(() -> {
			for (UniExpr expr : block.body)
				parseStatement(expr);
		});
	}

	public static String generate(UniClassDec dec) {
		try (ByteArrayOutputStream out = new ByteArrayOutputStream();
				PrintStream printer = new PrintStream(out)) {
			generate(dec, printer);
			return out.toString();
		} catch (IOException e) {
			return null;
		}
	}

	public static void generate(UniClassDec classDec, PrintStream out) {
		JavaGenerator g = new JavaGenerator(out);
		g.traverseClassDec(classDec);
	}

	public static String generate(UniProgram file) {
		try (ByteArrayOutputStream out = new ByteArrayOutputStream();
				PrintStream printer = new PrintStream(out)) {
			generate(file, printer);
			return out.toString();
		} catch (IOException e) {
			return null;
		}
	}

	public static void generate(UniProgram fileDec, PrintStream out) {
		JavaGenerator g = new JavaGenerator(out);
		if(fileDec.imports!= null){
			for (UniImport importStatement : fileDec.imports) {
				g.traverseImport(importStatement);
			}			
		}
		g.newline();
		g.newline();

		for (UniClassDec classDec : fileDec.classes) {
			g.traverseClassDec(classDec);
		}

	}

	// ----- ----- ----- ----- HELPER ----- ----- ----- -----

	protected static <T> Iterable<T> iter(Iterable<T> iter) {
		if (iter == null) {
			return Collections.emptyList();
		}
		return iter;
	}

	/*
	 * ***** ***** ***** ***** ***** ***** ***** ***** ***** ***** overrides
	 * ***** ***** ***** ***** ***** ***** ***** ***** ***** *****
	 */

	@Override
	public void dontCallTraverseBoolLiteral(UniBoolLiteral node) {
		print(node.value ? "true" : "false");
	}

	@Override
	public void dontCallTraverseIntLiteral(UniIntLiteral node) {
		print(Integer.toString(node.value));
	}

	@Override
	public void dontCallTraverseLongLiteral(UniLongLiteral node) {
		print(Long.toString(node.value));
		print("L");
	}

	@Override
	public void dontCallTraverseDoubleLiteral(UniDoubleLiteral node) {
		print(Double.toString(node.value));
	}

	@Override
	public void dontCallTraverseStringLiteral(UniStringLiteral node) {
		print('"' + node.value.replaceAll("\"", "\\\"") + '"');
	}

	@Override
	public void dontCallTraverseIdent(UniIdent node) {
		print(node.name);
	}

	@Override
	public void dontCallTraverseFieldAccess(UniFieldAccess fa) {
		parseExpr(fa.receiver);
		print(".");
		print(fa.fieldName);
	}

	@Override
	public void dontCallTraverseMethodCall(UniMethodCall mCall) {
		if (mCall.receiver != null) {
			// ("abc" +
			// "def").hashcode();，のようにreceiverにbinopが入る場合もあるのでpriorityをセットする
			parseExpr(mCall.receiver, priorityTable("*") * 10 + 1);
			print(".");
		}
		print(mCall.methodName);
		print("(");
		String delimiter = "";
		for (UniExpr innerExpr : iter(mCall.args)) {
			print(delimiter);
			delimiter = ", ";
			parseExpr(innerExpr);
		}
		print(")");
	}

	@Override
	public void dontCallTraverseNew(UniNew node) {
		print("new ");
		print(node.type);
		print("(");
		String delimiter = "";
		for (UniExpr innerExpr : iter(node.args)) {
			print(delimiter);
			delimiter = ", ";
			parseExpr(innerExpr);
		}
		print(")");
	}

	@Override
	public void dontCallTraverseUnaryOp(UniUnaryOp node) {
		if (node.operator.startsWith("_")) {
			parseExpr(node.expr);
			print(node.operator.substring(1));
		} else if (node.operator.endsWith("_")) {
			print(node.operator.substring(0, node.operator.length() - 1));
			parseExpr(node.expr);
		} else {
			print(node.operator);
			parseExpr(node.expr);
		}
	}

	@Override
	public void dontCallTraverseBinOp(UniBinOp node) {
		int priority = priorityTable(node.operator) * 10 + 1;
		assert priority > 0;
		boolean requireParen = exprPriority.peek() >= priority;
		if (requireParen) {
			print("(");
		}
		parseExpr(node.left, priority - 1);
		print(" ");
		print(node.operator);
		print(" ");
		parseExpr(node.right, priority);
		if (requireParen) {
			print(")");
		}
	}

	@Override
	public void dontCallTraverseTernaryOp(UniTernaryOp node) {
		parseExpr(node.cond);
		print(" ? ");
		parseExpr(node.trueExpr);
		print(" : ");
		parseExpr(node.falseExpr);
	}

	@Override
	public void dontCallTraverseReturn(UniReturn node) {
		print("return ");
		if (node.value != null)
			parseExpr(node.value);
	}

	@Override
	public void dontCallTraverseBreak(UniBreak node) {
		print("break");
	}

	@Override
	public void dontCallTraverseContinue(UniContinue node) {
		print("continue");
	}

	@Override
	public void dontCallTraverseBlock(UniBlock node) {
		print("{");
		withIndent(() -> {
			if (node.blockLabel != null) {
				print("//" + node.blockLabel);
			}
		});
		newline();
		parseBlockInner(node);
		print("}");
	}

	@Override
	public void dontCallTraverseIf(UniIf node) {
		print("if (");
		parseExpr(node.cond);
		print(")");
		if (node.trueStatement == null) {
			print(" {");
			newline();
			print("}");
		} else if (node.trueStatement instanceof UniBlock) {
			print(" ");
			traverseBlock((UniBlock) node.trueStatement);
		} else {
			newline(); // ifの後ろの改行
			withIndent(() -> {
				parseStatement(node.trueStatement);
			});
		}
		if (node.falseStatement != null) {
			if (indentAtThisLine) {
				print(" "); // 閉じカッコがすでに出力されているので空白を開ける
			}
			print("else");
			if (node.falseStatement instanceof UniBlock) {
				print(" ");
				traverseBlock((UniBlock) node.falseStatement);
			} else {
				newline(); // elseの後ろの改行
				withIndent(() -> {
					parseStatement(node.falseStatement);
				});
			}
		}
	}

	@Override
	public void dontCallTraverseFor(UniFor node) {
		print("for (");
		parseExpr(node.init);
		print("; ");
		parseExpr(node.cond);
		print("; ");
		parseExpr(node.step);
		print(")");
		if (node.statement instanceof UniBlock) {
			print(" ");
			traverseBlock((UniBlock) node.statement);
		} else {
			withIndent(() -> {
				parseStatement(node.statement);
			});
		}
	}

	@Override
	public void dontCallTraverseWhile(UniWhile node) {
		print("while (");
		parseExpr(node.cond);
		print(")");
		if (node.statement == null) {
			print("{");
			print("}");
		} else if (node.statement instanceof UniBlock) {
			print(" ");
			traverseBlock((UniBlock) node.statement);
		} else {
			newline(); // whileの後ろの改行
			withIndent(() -> {
				parseStatement(node.statement);
			});
		}
	}

	@Override
	public void dontCallTraverseDoWhile(UniDoWhile node) {
		throw new RuntimeException("HOGE");
		// print("do");
		// genBlockS(node.statement, "do", () -> {
		// print("while (");
		// parseExpr(node.cond);
		// print(");");
		// });
	}

	@Override
	public void dontCallTraverseVariableDec(UniVariableDec node) {
		if (node.modifiers != null) {
			for (String mod : node.modifiers) {
				print(mod);
				print(" ");
			}
		}
		print(String.join(" ", node.type, node.name));
		if (node.value != null) {
			print(" = ");
			parseExpr(node.value);
		}
	}

	@Override
	public void dontCallTraverseMethodDec(UniMethodDec methDec) {
		String mod = String.join(" ", methDec.modifiers);
		ArrayList<String> args = new ArrayList<>();
		for (UniArg arg : iter(methDec.args)) {
			args.add(arg.type + " " + arg.name);
		}
		String argWithParen = "(" + String.join(", ", args) + ")";
		String declare = String.join(" ", mod, methDec.returnType,
				methDec.methodName, argWithParen);
		print(declare + ' ');
		traverseBlock(methDec.block);
	}

	@Override
	public void dontCallTraverseArg(UniArg node) {
		throw new RuntimeException("HOGE");
		// TODO Auto-generated method stub
	}

	@Override
	public void dontCallTraverseClassDec(UniClassDec classDec) {
		String mod = safeJoin(classDec.modifiers, " ");
		String interfaces = safeJoin(classDec.interfaces, ", ");
		String declare = String.join(" ", mod, "class", classDec.className);
		if (classDec.superClass != null && classDec.superClass.size() > 0) {
			declare = String.join(" ", declare, "extends",
					classDec.superClass.get(0));
		}
		if (classDec.interfaces != null && classDec.interfaces.size() > 0) {
			declare = String.join(" ", declare, "implements", interfaces);
		}
		declare = String.join(" ", declare, "{");
		print(declare);
		newline();

		withIndent(() -> {
			for (UniMemberDec dec : iter(classDec.members)) {
				traverseMemberDec(dec);
			}
		});
		newline();
		print("}");
		newline();
	}

	@Override
	public void dontCallTraverseFieldDec(UniFieldDec node) {
		String mod = safeJoin(node.modifiers, " ");
		String dec = String.join(" ", mod, node.type, node.name);
		print(dec);

		if (node.value != null) {
			print(" = ");
			parseExpr(node.value);
		}
		print(";");
		newline();
	}

	@Override
	public void dontCallTraverseArray(UniArray node) {
		if (node.items != null) {
			print("{");
			withIndent(() -> {
				for (UniExpr item : node.items) {
					if (!item.equals(node.items.get(0))) {
						print(", ");
					}
					parseExpr(item);
				}
			});
			print("}");
		}
	}

	@Override
	public void dontCallTraverseNewArray(UniNewArray node) {
		print("new ");
		print(node.type);
		if (node.elementsNum != null) {
			withIndent(() -> {
				for (UniExpr element : node.elementsNum) {
					print("[");
					parseExpr(element);
					print("]");
				}
			});
		}
		if (node.value != null) {
			traverseArray(node.value);
		}
	}

	public static String safeJoin(Iterable<String> objs, String delimiter) {
		if (objs == null) {
			return "";
		} else {
			return String.join(delimiter, objs);
		}
	}

	@Override
	public void dontCallTraverseImport(UniImport node) {
		print("import " + node.targetName + ";");
	}

	@Override
	public void dontCallTraverseEmptyStatement(UniEmptyStatement node) {
		print("");
	}

	@Override
	public void dontCallTraverseEnhancedFor(UniEnhancedFor node) {
		print("for (");
		print(node.type);
		print(" ");
		print(node.name);
		print(": ");
		parseExpr(node.container);
		print(")");
		if (node.statement instanceof UniBlock) {
			print(" ");
			traverseBlock((UniBlock) node.statement);
		} else {
			withIndent(() -> {
				parseStatement(node.statement);
			});
		}
	}

	@Override
	public void dontCallTraverseCast(UniCast node) {
		print("(" + node.type + ")");
		print("(");
		parseExpr(node.value);
		print(")");
	}

	@Override
	public void dontCallTraverseProgram(UniProgram node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dontCallTraverseNamespace(UniNamespace node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverseInterfaceDec(UniInterfaceDec node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseSwitch(UniSwitch node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseSwitchUnit(UniSwitchUnit node) {
		// TODO Auto-generated method stub
		
	}

}
