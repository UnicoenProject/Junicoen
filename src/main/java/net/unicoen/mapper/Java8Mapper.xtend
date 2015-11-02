package net.unicoen.mapper

import java.io.FileInputStream
import java.util.ArrayList
import java.util.List
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.RuleContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode
import net.unicoen.parser.Java8Lexer
import net.unicoen.parser.Java8Parser
import net.unicoen.parser.Java8BaseVisitor
import net.unicoen.node.*

class Java8Mapper extends Java8BaseVisitor<Object> {
	var _isDebugMode = false

	new(boolean isDebugMode) {
		_isDebugMode = isDebugMode
	}

	def parseFile(String path) {
		val inputStream = new FileInputStream(path)
		try {
			parseCore(new ANTLRInputStream(inputStream))
		} finally {
			inputStream.close
		}
	}

	def parse(String code) {
		parseCore(new ANTLRInputStream(code))
	}

	def parseCore(CharStream chars) {
		val lexer = new Java8Lexer(chars)
		val tokens = new CommonTokenStream(lexer)
		val parser = new Java8Parser(tokens)
		val tree = parser.compilationUnit

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
		throw new RuntimeException("Unimplemented Method: visitIntegerLiteral")
	}

	override public visitFloatingPointLiteral(Java8Parser.FloatingPointLiteralContext ctx) {
		throw new RuntimeException("Unimplemented Method: visitFloatingPointLiteral")
	}

	override public visitBooleanLiteral(Java8Parser.BooleanLiteralContext ctx) {
		throw new RuntimeException("Unimplemented Method: visitBooleanLiteral")
	}

	override public visitStringLiteral(Java8Parser.StringLiteralContext ctx) {
		throw new RuntimeException("Unimplemented Method: visitStringLiteral")
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
				switch (it as RuleContext).invokingState {
					case 794: {
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
				switch (it as RuleContext).invokingState {
					case 849: {
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
				switch (it as RuleContext).invokingState {
					case 854: {
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
				switch (it as RuleContext).invokingState {
					case 858: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit as java.util.List<java.lang.String>
						} else {
							bind.modifiers += it.visit as java.util.List<java.lang.String>
						}
					}
					case 860: {
						bind.className = it.visit as java.lang.String
					}
					case 864: {
						if (bind.superClass == null) {
							bind.superClass = it.visit as java.util.List<java.lang.String>
						} else {
							bind.superClass += it.visit as java.util.List<java.lang.String>
						}
					}
					case 867: {
						if (bind.interfaces == null) {
							bind.interfaces = it.visit as java.util.List<java.lang.String>
						} else {
							bind.interfaces += it.visit as java.util.List<java.lang.String>
						}
					}
					case 870: {
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
					switch (it as RuleContext).invokingState {
						case 874: {
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
					switch (it as RuleContext).invokingState {
						case 903: {
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
					switch (it as RuleContext).invokingState {
						case 906: {
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
					switch (it as RuleContext).invokingState {
						case 917: {
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
					switch (it as RuleContext).invokingState {
						case 940: {
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
					switch (it as RuleContext).invokingState {
						case 943: {
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
					switch (it as RuleContext).invokingState {
						case 959: {
							list += it.visit as UniFieldDec
						}
						case 961: {
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
				switch (it as RuleContext).invokingState {
					case 967: {
						bind.name = it.visit as java.lang.String
					}
					case 969: {
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
				switch (it as RuleContext).invokingState {
					case 1081: {
						if (bind.modifiers == null) {
							bind.modifiers = new ArrayList<String>
						}
						bind.modifiers += it.visit as String
					}
					case 1087: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
					case 1088: {
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
				switch (it as RuleContext).invokingState {
					case 1102: {
						bind.returnType = it.visit as java.lang.String
					}
					case 1103: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
					case 1114: {
						bind.returnType = it.visit as java.lang.String
					}
					case 1115: {
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
				switch (it as RuleContext).invokingState {
					case 1125: {
						bind.methodName = it.visit as java.lang.String
					}
					case 1127: {
						if (bind.args == null) {
							bind.args = it.visit as java.util.List<net.unicoen.node.UniArg>
						} else {
							bind.args += it.visit as java.util.List<net.unicoen.node.UniArg>
						}
					}
					case 1131: {
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
					switch (it as RuleContext).invokingState {
						case 1136: {
							list += it.visit as List<UniArg>
						}
						case 1138: {
							list += it.visit as UniArg
						}
						case 1140: {
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
					switch (it as RuleContext).invokingState {
						case 1143: {
							list += it.visit as UniArg
						}
						case 1145: {
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
				switch (it as RuleContext).invokingState {
					case 1167: {
						bind.type = it.visit as java.lang.String
					}
					case 1168: {
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
				switch (it as RuleContext).invokingState {
					case 1170: {
						bind.name = it.visit as java.lang.String
					}
					case 1171: {
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
