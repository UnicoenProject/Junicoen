package net.unicoen.mapper

import java.io.FileInputStream
import java.util.ArrayList
import java.util.List
import net.unicoen.node.UniArg
import net.unicoen.node.UniBlock
import net.unicoen.node.UniClassDec
import net.unicoen.node.UniExpr
import net.unicoen.node.UniFieldDec
import net.unicoen.node.UniMemberDec
import net.unicoen.node.UniMethodDec
import net.unicoen.parser.Java8NewBaseVisitor
import net.unicoen.parser.Java8NewLexer
import net.unicoen.parser.Java8NewParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.RuleContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode

class Java8NewMapper extends Java8NewBaseVisitor<Object> {
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
		val lexer = new Java8NewLexer(chars)
		val tokens = new CommonTokenStream(lexer)
		val parser = new Java8NewParser(tokens)
		val tree = parser.normalClassDeclaration

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
			val ruleName = Java8NewParser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
			println("*** visit" + ruleName + " ***")
			println(tree.text)
			val ret = tree.accept(this)
			println("returned: " + ret)
			ret
		} else {
			tree.accept(this)
		}
	}

	override public visitDims(Java8NewParser.DimsContext ctx) {
		ctx.text
	}

	override public visitNormalClassDeclaration(Java8NewParser.NormalClassDeclarationContext ctx) {
		val bind = new UniClassDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
					case 798: {
						if (bind.modifiers == null) {
							bind.modifiers = new ArrayList<String>
						}
						bind.modifiers += it.visit as List<String>
					}
					case 805: {
						bind.className = it.visit as String
					}
					case 815: {
						if (bind.members == null) {
							bind.members = it.visit as List<UniMemberDec>
						} else {
							bind.members += it.visit as List<UniMemberDec>
						}
					}
				}
			}
		]
		bind
	}

	override public visitClassName(Java8NewParser.ClassNameContext ctx) {
		ctx.text
	}

	override public visitClassModifier(Java8NewParser.ClassModifierContext ctx) {
		ctx.text
	}

	override public visitClassBody(Java8NewParser.ClassBodyContext ctx) {
		val list = new ArrayList<UniMemberDec>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch (it as RuleContext).invokingState {
						case 856: {
							list += it.visit as UniMemberDec
						}
					}
				}
			]
		}
		list
	}

	override public visitFieldDeclaration(Java8NewParser.FieldDeclarationContext ctx) {
		val bind = new UniFieldDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
					case 877: {
						if (bind.modifiers == null) {
							bind.modifiers = new ArrayList<String>
						}
						bind.modifiers += it.visit as List<String>
					}
					case 883: {
						bind.type = it.visit as String
					}
					case 884: {
						val child = it.visit as UniFieldDec
						bind.merge(child)
					}
				}
			}
		]
		bind
	}

	override public visitFieldModifier(Java8NewParser.FieldModifierContext ctx) {
		ctx.text
	}

	override public visitVariableDeclaratorList(Java8NewParser.VariableDeclaratorListContext ctx) {
		val bind = new UniFieldDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
				}
			}
		]
		bind
	}

	override public visitVariableDeclarator(Java8NewParser.VariableDeclaratorContext ctx) {
		val bind = new UniFieldDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
					case 905: {
						val child = it.visit as UniFieldDec
						bind.merge(child)
					}
					case 907: {
						bind.value = it.visit as UniExpr
					}
				}
			}
		]
		bind
	}

	override public visitVariableDeclaratorId(Java8NewParser.VariableDeclaratorIdContext ctx) {
		val bind = new UniFieldDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
					case 911: {
						bind.type = it.visit as String
					}
				}
			}
		]
		bind
	}

	override public visitUnannType(Java8NewParser.UnannTypeContext ctx) {
		ctx.text
	}

	override public visitMethodDeclaration(Java8NewParser.MethodDeclarationContext ctx) {
		val bind = new UniMethodDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
					case 994: {
						if (bind.modifiers == null) {
							bind.modifiers = new ArrayList<String>
						}
						bind.modifiers += it.visit as List<String>
					}
					case 1000: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
					case 1001: {
						bind.block = it.visit as UniBlock
					}
				}
			}
		]
		bind
	}

	override public visitMethodModifier(Java8NewParser.MethodModifierContext ctx) {
		ctx.text
	}

	override public visitMethodHeader(Java8NewParser.MethodHeaderContext ctx) {
		val bind = new UniMethodDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
					case 1015: {
						bind.returnType = it.visit as String
					}
					case 1016: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
					case 1027: {
						bind.returnType = it.visit as String
					}
					case 1028: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
				}
			}
		]
		bind
	}

	override public visitResult(Java8NewParser.ResultContext ctx) {
		ctx.text
	}

	override public visitMethodDeclarator(Java8NewParser.MethodDeclaratorContext ctx) {
		val bind = new UniMethodDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
					case 1038: {
						bind.methodName = it.visit as String
					}
					case 1040: {
						if (bind.args == null) {
							bind.args = it.visit as List<UniArg>
						} else {
							bind.args += it.visit as List<UniArg>
						}
					}
					case 1044: {
						bind.returnType = it.visit as String
					}
				}
			}
		]
		bind
	}

	override public visitMethodName(Java8NewParser.MethodNameContext ctx) {
		ctx.text
	}

	override public visitFormalParameterList(Java8NewParser.FormalParameterListContext ctx) {
		val list = new ArrayList<UniArg>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch (it as RuleContext).invokingState {
						case 1049: {
							list += it.visit as List<UniArg>
						}
						case 1051: {
							list += it.visit as UniArg
						}
						case 1053: {
							list += it.visit as UniArg
						}
					}
				}
			]
		}
		list
	}

	override public visitFormalParameters(Java8NewParser.FormalParametersContext ctx) {
		val list = new ArrayList<UniArg>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch (it as RuleContext).invokingState {
						case 1056: {
							list += it.visit as UniArg
						}
						case 1058: {
							list += it.visit as UniArg
						}
					}
				}
			]
		}
		list
	}

	override public visitFormalParameter(Java8NewParser.FormalParameterContext ctx) {
		val bind = new UniArg
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
					case 1080: {
						bind.type = it.visit as String
					}
					case 1081: {
						val child = it.visit as UniArg
						bind.merge(child)
					}
				}
			}
		]
		bind
	}

	override public visitParameterDeclaratorId(Java8NewParser.ParameterDeclaratorIdContext ctx) {
		val bind = new UniArg
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch (it as RuleContext).invokingState {
					case 1083: {
						bind.name = it.visit as String
					}
					case 1084: {
						bind.type = it.visit as String
					}
				}
			}
		]
		bind
	}

	override public visitParameterName(Java8NewParser.ParameterNameContext ctx) {
		ctx.text
	}

}
