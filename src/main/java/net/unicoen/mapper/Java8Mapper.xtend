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

	override public visitInterfaceType(Java8Parser.InterfaceTypeContext ctx) {
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
					case 776: {
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
					case 831: {
						val child = it.visit as UniClassDec
						bind.merge(child)
					}
					case 832: {
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
					case 836: {
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
					case 840: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit as java.util.List<java.lang.String>
						} else {
							bind.modifiers += it.visit as java.util.List<java.lang.String>
						}
					}
					case 842: {
						bind.className = it.visit as java.lang.String
					}
					case 846: {
						if (bind.superClass == null) {
							bind.superClass = it.visit as java.util.List<java.lang.String>
						} else {
							bind.superClass += it.visit as java.util.List<java.lang.String>
						}
					}
					case 849: {
						if (bind.interfaces == null) {
							bind.interfaces = it.visit as java.util.List<java.lang.String>
						} else {
							bind.interfaces += it.visit as java.util.List<java.lang.String>
						}
					}
					case 852: {
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
						case 856: {
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
						case 885: {
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
						case 888: {
							list += it.visit as List<String>
						}
					}
				}
			]
		}
		list
	}

	override public visitInterfaceTypeList(Java8Parser.InterfaceTypeListContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 890: {
							list += it.visit as String
						}
						case 892: {
							list += it.visit as String
						}
					}
				}
			]
		}
		list
	}

	override public visitClassBody(Java8Parser.ClassBodyContext ctx) {
		val list = new ArrayList<UniMemberDec>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 899: {
							list += it.visit as List<UniMemberDec>
						}
					}
				}
			]
		}
		list
	}

	override public visitClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
		val list = new ArrayList<UniMemberDec>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 907: {
							list += it.visit as List<UniMemberDec>
						}
						case 910: {
							list += it.visit as UniMethodDec
						}
					}
				}
			]
		}
		list
	}

	override public visitClassMemberDeclaration(Java8Parser.ClassMemberDeclarationContext ctx) {
		val list = new ArrayList<UniMemberDec>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 913: {
							list += it.visit as List<UniFieldDec>
						}
						case 914: {
							list += it.visit as UniMethodDec
						}
					}
				}
			]
		}
		list
	}

	override public visitFieldDeclaration(Java8Parser.FieldDeclarationContext ctx) {
		val list = new ArrayList<UniFieldDec>
		val tNode = new UniFieldDec
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 920: {
							tNode.modifiers = it.visit as java.util.List<java.lang.String>
						}
						case 921: {
							tNode.type = it.visit as java.lang.String
						}
						case 922: {
							list += it.visit as List<UniFieldDec>
						}
					}
				}
			]
		}
		list.forEach [
			it.merge(tNode)
		]
		list
	}

	override public visitFieldModifiers(Java8Parser.FieldModifiersContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 925: {
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

	override public visitVariableDeclaratorList(Java8Parser.VariableDeclaratorListContext ctx) {
		val list = new ArrayList<UniFieldDec>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 941: {
							list += it.visit as UniFieldDec
						}
						case 943: {
							list += it.visit as UniFieldDec
						}
					}
				}
			]
		}
		list
	}

	override public visitVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx) {
		val bind = new UniFieldDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 949: {
						bind.name = it.visit as java.lang.String
					}
					case 951: {
						bind.value = it.visit as net.unicoen.node.UniExpr
					}
				}
			}
		]
		bind
	}

	override public visitVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx) {
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
					case 1038: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit as java.util.List<java.lang.String>
						} else {
							bind.modifiers += it.visit as java.util.List<java.lang.String>
						}
					}
					case 1039: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
					case 1040: {
						bind.block = it.visit as net.unicoen.node.UniBlock
					}
				}
			}
		]
		bind
	}

	override public visitMethodModifiers(Java8Parser.MethodModifiersContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
					}
				}
			]
		}
		list
	}

	override public visitMethodModifier(Java8Parser.MethodModifierContext ctx) {
		ctx.text
	}

	override public visitMethodHeader(Java8Parser.MethodHeaderContext ctx) {
		val bind = new UniMethodDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1060: {
						bind.returnType = it.visit as java.lang.String
					}
					case 1061: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
					case 1072: {
						bind.returnType = it.visit as java.lang.String
					}
					case 1073: {
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
					case 1083: {
						bind.methodName = it.visit as java.lang.String
					}
					case 1085: {
						if (bind.args == null) {
							bind.args = it.visit as java.util.List<net.unicoen.node.UniArg>
						} else {
							bind.args += it.visit as java.util.List<net.unicoen.node.UniArg>
						}
					}
					case 1089: {
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
						case 1094: {
							list += it.visit as List<UniArg>
						}
						case 1096: {
							list += it.visit as UniArg
						}
						case 1098: {
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
						case 1101: {
							list += it.visit as UniArg
						}
						case 1103: {
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
					case 1125: {
						bind.type = it.visit as java.lang.String
					}
					case 1126: {
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
					case 1128: {
						bind.name = it.visit as java.lang.String
					}
					case 1129: {
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

	override public visitConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx) {
		val bind = new UniMethodDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1194: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit as java.util.List<java.lang.String>
						} else {
							bind.modifiers += it.visit as java.util.List<java.lang.String>
						}
					}
					case 1200: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
					case 1204: {
						bind.block = it.visit as net.unicoen.node.UniBlock
					}
				}
			}
		]
		bind
	}

	override public visitConstructorModifier(Java8Parser.ConstructorModifierContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
					}
				}
			]
		}
		list
	}

	override public visitConstructorDeclarator(Java8Parser.ConstructorDeclaratorContext ctx) {
		val bind = new UniMethodDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1215: {
						bind.methodName = it.visit as java.lang.String
					}
					case 1217: {
						if (bind.args == null) {
							bind.args = it.visit as java.util.List<net.unicoen.node.UniArg>
						} else {
							bind.args += it.visit as java.util.List<net.unicoen.node.UniArg>
						}
					}
				}
			}
		]
		bind
	}

	override public visitSimpleTypeName(Java8Parser.SimpleTypeNameContext ctx) {
		ctx.text
	}

	override public visitInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx) {
		val bind = new UniClassDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1340: {
						val child = it.visit as UniClassDec
						bind.merge(child)
					}
				}
			}
		]
		bind
	}

	override public visitNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx) {
		val bind = new UniClassDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1344: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit as java.util.List<java.lang.String>
						} else {
							bind.modifiers += it.visit as java.util.List<java.lang.String>
						}
					}
					case 1346: {
						bind.className = it.visit as java.lang.String
					}
					case 1350: {
						if (bind.interfaces == null) {
							bind.interfaces = it.visit as java.util.List<java.lang.String>
						} else {
							bind.interfaces += it.visit as java.util.List<java.lang.String>
						}
					}
					case 1353: {
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

	override public visitInterfaceModifiers(Java8Parser.InterfaceModifiersContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1355: {
							list += it.visit as String
						}
					}
				}
			]
		}
		list
	}

	override public visitInterfaceName(Java8Parser.InterfaceNameContext ctx) {
		ctx.text
	}

	override public visitInterfaceModifier(Java8Parser.InterfaceModifierContext ctx) {
		ctx.text
	}

	override public visitExtendsInterfaces(Java8Parser.ExtendsInterfacesContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1373: {
							list += it.visit as List<String>
						}
					}
				}
			]
		}
		list
	}

	override public visitInterfaceBody(Java8Parser.InterfaceBodyContext ctx) {
		val list = new ArrayList<UniMemberDec>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1376: {
							list += it.visit as List<UniMemberDec>
						}
					}
				}
			]
		}
		list
	}

	override public visitInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx) {
		val list = new ArrayList<UniMemberDec>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1384: {
							list += it.visit as List<UniFieldDec>
						}
						case 1385: {
							list += it.visit as UniMethodDec
						}
					}
				}
			]
		}
		list
	}

	override public visitConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx) {
		val list = new ArrayList<UniFieldDec>
		val tNode = new UniFieldDec
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1391: {
							tNode.modifiers = it.visit as java.util.List<java.lang.String>
						}
						case 1392: {
							tNode.type = it.visit as java.lang.String
						}
						case 1393: {
							list += it.visit as List<UniFieldDec>
						}
					}
				}
			]
		}
		list.forEach [
			it.merge(tNode)
		]
		list
	}

	override public visitConstantModifiers(Java8Parser.ConstantModifiersContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1396: {
							list += it.visit as String
						}
					}
				}
			]
		}
		list
	}

	override public visitConstantModifier(Java8Parser.ConstantModifierContext ctx) {
		ctx.text
	}

	override public visitInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx) {
		val bind = new UniMethodDec
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1408: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit as java.util.List<java.lang.String>
						} else {
							bind.modifiers += it.visit as java.util.List<java.lang.String>
						}
					}
					case 1409: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
					case 1410: {
						bind.block = it.visit as net.unicoen.node.UniBlock
					}
				}
			}
		]
		bind
	}

	override public visitInterfaceMethodModifiers(Java8Parser.InterfaceMethodModifiersContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1412: {
							list += it.visit as String
						}
					}
				}
			]
		}
		list
	}

	override public visitInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx) {
		ctx.text
	}

	override public visitArrayInitializer(Java8Parser.ArrayInitializerContext ctx) {
		val bind = new UniArray
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1536: {
						if (bind.items == null) {
							bind.items = it.visit as java.util.List<net.unicoen.node.UniExpr>
						} else {
							bind.items += it.visit as java.util.List<net.unicoen.node.UniExpr>
						}
					}
				}
			}
		]
		bind
	}

	override public visitVariableInitializerList(Java8Parser.VariableInitializerListContext ctx) {
		val list = new ArrayList<UniExpr>
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1544: {
							list += it.visit as UniExpr
						}
						case 1546: {
							list += it.visit as UniExpr
						}
					}
				}
			]
		}
		list
	}
}
