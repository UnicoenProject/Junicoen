package net.unicoen.mapper

import java.io.FileInputStream
import java.util.ArrayList
import java.util.List
import net.unicoen.node.*
import net.unicoen.parser.Java8Lexer
import net.unicoen.parser.Java8Parser
import net.unicoen.parser.Java8BaseVisitor
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.RuleContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import org.eclipse.xtext.xbase.lib.Functions.Function1

class Java8Mapper extends Java8BaseVisitor<Object> {
	var _isDebugMode = false

	new(boolean isDebugMode) {
		_isDebugMode = isDebugMode
	}

	def parse(String code) {
		parseCore(new ANTLRInputStream(code));
	}

	def parseFile(String path) {
		val inputStream = new FileInputStream(path);
		try {
			parseCore(new ANTLRInputStream(inputStream));
		} finally {
			inputStream.close();
		}
	}

	def parseCore(CharStream chars) {
		parseCore(chars, [parser|parser.compilationUnit()])
	}

	def parse(String code, Function1<Java8Parser, ParseTree> parseAction) {
		parseCore(new ANTLRInputStream(code), parseAction);
	}

	def parseFile(String path, Function1<Java8Parser, ParseTree> parseAction) {
		val inputStream = new FileInputStream(path);
		try {
			parseCore(new ANTLRInputStream(inputStream), parseAction);
		} finally {
			inputStream.close();
		}
	}

	def parseCore(CharStream chars, Function1<Java8Parser, ParseTree> parseAction) {
		val lexer = new Java8Lexer(chars);
		val tokens = new CommonTokenStream(lexer);
		val parser = new Java8Parser(tokens);
		val tree = parseAction.apply(parser) // parse
		tree.visit
	}

	override public visitChildren(RuleNode node) {
		val n = node.childCount;
		(0 ..< n).fold(defaultResult) [ acc, i |
			if (!node.shouldVisitNextChild(acc)) {
				acc
			} else {
				val c = node.getChild(i)
				val childResult = c.visit
				acc.aggregateResult(childResult)
			}
		]
	}

	override public visit(ParseTree tree) {
		if (_isDebugMode) {
			if (!(tree instanceof ParserRuleContext)) {
				return visitTerminal(tree as TerminalNode)
			}
			val ruleName = Java8Parser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
			println("*** visit" + ruleName + " ***")
			println(tree.text)
			val ret = tree.accept(this)
			println("returned: " + ret)
			ret
		} else {
			tree.accept(this)
		}
	}

	override public visitIntegerLiteral(Java8Parser.IntegerLiteralContext ctx) {
		val text = ctx.children.findFirst[
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == Java8Parser.IntegerLiteral) {
					return true;
				}
			}
			return false;
		].text
		return new UniIntLiteral(Integer.parseInt(text))
	}

	override public visitFloatingPointLiteral(Java8Parser.FloatingPointLiteralContext ctx) {
		val text = ctx.children.findFirst[
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == Java8Parser.FloatingPointLiteral) {
					return true;
				}
			}
			return false;
		].text
		return new UniDoubleLiteral(Double.parseDouble(text))
	}

	override public visitBooleanLiteral(Java8Parser.BooleanLiteralContext ctx) {
		val text = ctx.children.findFirst[
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == Java8Parser.BooleanLiteral) {
					return true;
				}
			}
			return false;
		].text
		return new UniBoolLiteral("true" == text)
	}

	override public visitStringLiteral(Java8Parser.StringLiteralContext ctx) {
		val text = ctx.children.findFirst[
			if (it instanceof TerminalNodeImpl) {
				if (it.symbol.type == Java8Parser.StringLiteral) {
					return true;
				}
			}
			return false;
		].text
		return new UniStringLiteral(text.substring(1, text.length - 1))
	}

	override public visitClassType(Java8Parser.ClassTypeContext ctx) {
		ctx.text
	}

	override public visitDims(Java8Parser.DimsContext ctx) {
		ctx.text
	}

	override public visitCompilationUnit(Java8Parser.CompilationUnitContext ctx) {
		val bind = new UniClassDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 778: {
						val child = it.visit as UniClassDec
						bind.merge(child)
					}
				}
			}
		]
		bind
	}

	override public visitTypeDeclaration(Java8Parser.TypeDeclarationContext ctx) {
		val bind = new UniClassDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 833: {
						val child = it.visit as UniClassDec
						bind.merge(child)
					}
				}
			}
		]
		bind
	}

	override public visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
		val bind = new UniClassDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 838: {
						val child = it.visit as UniClassDec
						bind.merge(child)
					}
				}
			}
		]
		bind
	}

	override public visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		val bind = new UniClassDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 842: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit as java.util.List<java.lang.String>
						} else {
							bind.modifiers += it.visit as java.util.List<java.lang.String>
						}
					}
					case 844: {
						bind.className = it.visit as java.lang.String
					}
					case 848: {
						if (bind.superClass == null) {
							bind.superClass = it.visit as java.util.List<java.lang.String>
						} else {
							bind.superClass += it.visit as java.util.List<java.lang.String>
						}
					}
					case 851: {
						if (bind.interfaces == null) {
							bind.interfaces = it.visit as java.util.List<java.lang.String>
						} else {
							bind.interfaces += it.visit as java.util.List<java.lang.String>
						}
					}
					case 854: {
						if (bind.members == null) {
							bind.members = it.visit as java.util.List<net.unicoen.node.UniMemberDec>
						} else {
							bind.members += it.visit as java.util.List<net.unicoen.node.UniMemberDec>
						}
					}
				}
			}
		]
		bind
	}

	override public visitClassName(Java8Parser.ClassNameContext ctx) {
		ctx.text
	}

	override public visitClassModifiers(Java8Parser.ClassModifiersContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 858: {
							list += it.visit as String
						}
					}
				}
			]
		}
		list
	}

	override public visitClassModifier(Java8Parser.ClassModifierContext ctx) {
		ctx.text
	}

	override public visitSuperclass(Java8Parser.SuperclassContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 887: {
							list += it.visit as String
						}
					}
				}
			]
		}
		list
	}

	override public visitSuperinterfaces(Java8Parser.SuperinterfacesContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 890: {
							list += it.visit as String
						}
					}
				}
			]
		}
		list
	}

	override public visitInterfaceTypeList(Java8Parser.InterfaceTypeListContext ctx) {
		ctx.text
	}

	override public visitClassBody(Java8Parser.ClassBodyContext ctx) {
		val list = new ArrayList<UniMemberDec>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 901: {
							list += it.visit as UniMemberDec
						}
					}
				}
			]
		}
		list
	}

	override public visitFieldDeclaration(Java8Parser.FieldDeclarationContext ctx) {
		val list = new ArrayList<UniFieldDec>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 924: {
							list += it.visit as List<UniFieldDec>
						}
					}
				}
			]
		}
		list
	}

	override public visitFieldModifiers(Java8Parser.FieldModifiersContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 927: {
							list += it.visit as String
						}
					}
				}
			]
		}
		list
	}

	override public visitFieldModifier(Java8Parser.FieldModifierContext ctx) {
		ctx.text
	}

	override public visitFieldVariableDeclaratorList(Java8Parser.FieldVariableDeclaratorListContext ctx) {
		val list = new ArrayList<UniFieldDec>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 943: {
							list += it.visit as UniFieldDec
						}
						case 945: {
							list += it.visit as UniFieldDec
						}
					}
				}
			]
		}
		list
	}

	override public visitFieldVariableDeclarator(Java8Parser.FieldVariableDeclaratorContext ctx) {
		val bind = new UniFieldDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 951: {
						bind.name = it.visit as java.lang.String
					}
					case 953: {
						bind.value = it.visit as net.unicoen.node.UniExpr
					}
				}
			}
		]
		bind
	}

	override public visitFieldVariableDeclaratorId(Java8Parser.FieldVariableDeclaratorIdContext ctx) {
		ctx.text
	}

	override public visitUnannType(Java8Parser.UnannTypeContext ctx) {
		ctx.text
	}

	override public visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
		val bind = new UniMethodDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1065: {
						if (bind.modifiers == null) {
							bind.modifiers = new ArrayList<String>
						}
						bind.modifiers += it.visit as String
					}
					case 1071: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
					case 1072: {
						bind.block = it.visit as net.unicoen.node.UniBlock
					}
				}
			}
		]
		bind
	}

	override public visitMethodModifier(Java8Parser.MethodModifierContext ctx) {
		ctx.text
	}

	override public visitMethodHeader(Java8Parser.MethodHeaderContext ctx) {
		val bind = new UniMethodDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1086: {
						bind.returnType = it.visit as java.lang.String
					}
					case 1087: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
					case 1098: {
						bind.returnType = it.visit as java.lang.String
					}
					case 1099: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
				}
			}
		]
		bind
	}

	override public visitResult(Java8Parser.ResultContext ctx) {
		ctx.text
	}

	override public visitMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
		val bind = new UniMethodDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1109: {
						bind.methodName = it.visit as java.lang.String
					}
					case 1111: {
						if (bind.args == null) {
							bind.args = it.visit as java.util.List<net.unicoen.node.UniArg>
						} else {
							bind.args += it.visit as java.util.List<net.unicoen.node.UniArg>
						}
					}
					case 1115: {
						bind.returnType = it.visit as java.lang.String
					}
				}
			}
		]
		bind
	}

	override public visitMethodName(Java8Parser.MethodNameContext ctx) {
		ctx.text
	}

	override public visitFormalParameterList(Java8Parser.FormalParameterListContext ctx) {
		val list = new ArrayList<UniArg>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1120: {
							list += it.visit as List<UniArg>
						}
						case 1122: {
							list += it.visit as UniArg
						}
						case 1124: {
							list += it.visit as UniArg
						}
					}
				}
			]
		}
		list
	}

	override public visitFormalParameters(Java8Parser.FormalParametersContext ctx) {
		val list = new ArrayList<UniArg>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1127: {
							list += it.visit as UniArg
						}
						case 1129: {
							list += it.visit as UniArg
						}
					}
				}
			]
		}
		list
	}

	override public visitFormalParameter(Java8Parser.FormalParameterContext ctx) {
		val bind = new UniArg
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1151: {
						bind.type = it.visit as java.lang.String
					}
					case 1152: {
						val child = it.visit as UniArg
						bind.merge(child)
					}
				}
			}
		]
		bind
	}

	override public visitParameterDeclaratorId(Java8Parser.ParameterDeclaratorIdContext ctx) {
		val bind = new UniArg
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1154: {
						bind.name = it.visit as java.lang.String
					}
					case 1155: {
						bind.type = it.visit as java.lang.String
					}
				}
			}
		]
		bind
	}

	override public visitParameterName(Java8Parser.ParameterNameContext ctx) {
		ctx.text
	}
}
