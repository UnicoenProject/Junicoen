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
			if (it instanceof TerminalNode) {
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
			if (it instanceof TerminalNode) {
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
			if (it instanceof TerminalNode) {
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
			if (it instanceof TerminalNode) {
				if (it.symbol.type == Java8Parser.StringLiteral) {
					return true;
				}
			}
			return false;
		].text
		return new UniStringLiteral(text.substring(1, text.length - 1))
	}

	override public visitPrimitiveType(Java8Parser.PrimitiveTypeContext ctx) {
		ctx.text
	}

	override public visitClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx) {
		ctx.text
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

	override public visitExpressionName(Java8Parser.ExpressionNameContext ctx) {
		val bind = new UniIdent
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
				}
			} else if (it instanceof TerminalNode) {
				if (it.symbol.type == Java8Parser.Identifier) {
					bind.name = it.text
				}
			}
		}
		bind
	}

	override public visitCompilationUnit(Java8Parser.CompilationUnitContext ctx) {
		val bind = new UniClassDec
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 774: {
						val child = it.visit as UniClassDec
						bind.merge(child)
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitTypeDeclaration(Java8Parser.TypeDeclarationContext ctx) {
		val bind = new UniClassDec
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 829: {
						val child = it.visit as UniClassDec
						bind.merge(child)
					}
					case 830: {
						val child = it.visit as UniClassDec
						bind.merge(child)
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
		val bind = new UniClassDec
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 834: {
						val child = it.visit as UniClassDec
						bind.merge(child)
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		val bind = new UniClassDec
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 838: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit as java.util.List<java.lang.String>
						} else {
							bind.modifiers += it.visit as java.util.List<java.lang.String>
						}
					}
					case 840: {
						bind.className = it.visit as java.lang.String
					}
					case 844: {
						if (bind.superClass == null) {
							bind.superClass = it.visit as java.util.List<java.lang.String>
						} else {
							bind.superClass += it.visit as java.util.List<java.lang.String>
						}
					}
					case 847: {
						if (bind.interfaces == null) {
							bind.interfaces = it.visit as java.util.List<java.lang.String>
						} else {
							bind.interfaces += it.visit as java.util.List<java.lang.String>
						}
					}
					case 850: {
						if (bind.members == null) {
							bind.members = it.visit as java.util.List<net.unicoen.node.UniMemberDec>
						} else {
							bind.members += it.visit as java.util.List<net.unicoen.node.UniMemberDec>
						}
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitClassName(Java8Parser.ClassNameContext ctx) {
		ctx.text
	}

	override public visitClassModifiers(Java8Parser.ClassModifiersContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 854: {
							list += it.visit as String
						}
					}
				}
			}
		}
		list
	}

	override public visitClassModifier(Java8Parser.ClassModifierContext ctx) {
		ctx.text
	}

	override public visitSuperclass(Java8Parser.SuperclassContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 883: {
							list += it.visit as String
						}
					}
				}
			}
		}
		list
	}

	override public visitSuperinterfaces(Java8Parser.SuperinterfacesContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 886: {
							list += it.visit as List<String>
						}
					}
				}
			}
		}
		list
	}

	override public visitInterfaceTypeList(Java8Parser.InterfaceTypeListContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 888: {
							list += it.visit as String
						}
						case 890: {
							list += it.visit as String
						}
					}
				}
			}
		}
		list
	}

	override public visitClassBody(Java8Parser.ClassBodyContext ctx) {
		val list = new ArrayList<UniMemberDec>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 897: {
							list += it.visit as List<UniMemberDec>
						}
					}
				}
			}
		}
		list
	}

	override public visitClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
		val list = new ArrayList<UniMemberDec>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 905: {
							list += it.visit as List<UniMemberDec>
						}
						case 908: {
							list += it.visit as UniMethodDec
						}
					}
				}
			}
		}
		list
	}

	override public visitClassMemberDeclaration(Java8Parser.ClassMemberDeclarationContext ctx) {
		val list = new ArrayList<UniMemberDec>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 911: {
							list += it.visit as List<UniFieldDec>
						}
						case 912: {
							list += it.visit as UniMethodDec
						}
					}
				}
			}
		}
		list
	}

	override public visitFieldDeclaration(Java8Parser.FieldDeclarationContext ctx) {
		val list = new ArrayList<UniFieldDec>
		val tNode = new UniFieldDec
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 918: {
							tNode.modifiers = it.visit as java.util.List<java.lang.String>
						}
						case 919: {
							tNode.type = it.visit as java.lang.String
						}
						case 920: {
							list += it.visit as List<UniFieldDec>
						}
					}
				}
			}
		}
		list.forEach [
			it.merge(tNode)
		]
		list
	}

	override public visitFieldModifiers(Java8Parser.FieldModifiersContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 923: {
							list += it.visit as String
						}
					}
				}
			}
		}
		list
	}

	override public visitFieldModifier(Java8Parser.FieldModifierContext ctx) {
		ctx.text
	}

	override public visitVariableDeclaratorList(Java8Parser.VariableDeclaratorListContext ctx) {
		val list = new ArrayList<UniFieldDec>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 939: {
							list += it.visit as UniFieldDec
						}
						case 941: {
							list += it.visit as UniFieldDec
						}
					}
				}
			}
		}
		list
	}

	override public visitVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx) {
		val bind = new UniFieldDec
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 947: {
						bind.name = it.visit as java.lang.String
					}
					case 949: {
						bind.value = it.visit as net.unicoen.node.UniExpr
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
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
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1036: {
						if (bind.modifiers == null) {
							bind.modifiers = new ArrayList<String>
						}
						bind.modifiers += it.visit as String
					}
					case 1042: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
					case 1043: {
						bind.block = it.visit as net.unicoen.node.UniBlock
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitMethodModifier(Java8Parser.MethodModifierContext ctx) {
		ctx.text
	}

	override public visitMethodHeader(Java8Parser.MethodHeaderContext ctx) {
		val bind = new UniMethodDec
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1057: {
						bind.returnType = it.visit as java.lang.String
					}
					case 1058: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
					case 1069: {
						bind.returnType = it.visit as java.lang.String
					}
					case 1070: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitResult(Java8Parser.ResultContext ctx) {
		ctx.text
	}

	override public visitMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
		val bind = new UniMethodDec
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1080: {
						bind.methodName = it.visit as java.lang.String
					}
					case 1082: {
						if (bind.args == null) {
							bind.args = it.visit as java.util.List<net.unicoen.node.UniArg>
						} else {
							bind.args += it.visit as java.util.List<net.unicoen.node.UniArg>
						}
					}
					case 1086: {
						bind.returnType = it.visit as java.lang.String
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitMethodName(Java8Parser.MethodNameContext ctx) {
		ctx.text
	}

	override public visitFormalParameterList(Java8Parser.FormalParameterListContext ctx) {
		val list = new ArrayList<UniArg>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1091: {
							list += it.visit as List<UniArg>
						}
						case 1093: {
							val ret = it.visit
							if (ret instanceof UniArg) {
								list += ret as UniArg
							} else {
								list += ret as List<UniArg>
							}
						}
						case 1095: {
							val ret = it.visit
							if (ret instanceof UniArg) {
								list += ret as UniArg
							} else {
								list += ret as List<UniArg>
							}
						}
					}
				}
			}
		}
		list
	}

	override public visitFormalParameters(Java8Parser.FormalParametersContext ctx) {
		val list = new ArrayList<UniArg>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1098: {
							list += it.visit as UniArg
						}
						case 1100: {
							list += it.visit as UniArg
						}
					}
				}
			}
		}
		list
	}

	override public visitFormalParameter(Java8Parser.FormalParameterContext ctx) {
		val bind = new UniArg
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1122: {
						bind.type = it.visit as java.lang.String
					}
					case 1123: {
						val child = it.visit as UniArg
						bind.merge(child)
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitParameterDeclaratorId(Java8Parser.ParameterDeclaratorIdContext ctx) {
		val bind = new UniArg
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1125: {
						bind.name = it.visit as java.lang.String
					}
					case 1126: {
						bind.type = it.visit as java.lang.String
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitParameterName(Java8Parser.ParameterNameContext ctx) {
		ctx.text
	}

	override public visitMethodBody(Java8Parser.MethodBodyContext ctx) {
		val bind = new UniBlock
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1182: {
						val child = it.visit as UniBlock
						bind.merge(child)
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx) {
		val bind = new UniMethodDec
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1191: {
						if (bind.modifiers == null) {
							bind.modifiers = new ArrayList<String>
						}
						bind.modifiers += it.visit as String
					}
					case 1197: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
					case 1201: {
						bind.block = it.visit as net.unicoen.node.UniBlock
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitConstructorModifier(Java8Parser.ConstructorModifierContext ctx) {
		ctx.text
	}

	override public visitConstructorDeclarator(Java8Parser.ConstructorDeclaratorContext ctx) {
		val bind = new UniMethodDec
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1212: {
						bind.methodName = it.visit as java.lang.String
					}
					case 1214: {
						if (bind.args == null) {
							bind.args = it.visit as java.util.List<net.unicoen.node.UniArg>
						} else {
							bind.args += it.visit as java.util.List<net.unicoen.node.UniArg>
						}
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitSimpleTypeName(Java8Parser.SimpleTypeNameContext ctx) {
		ctx.text
	}

	override public visitInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx) {
		val bind = new UniClassDec
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1337: {
						val child = it.visit as UniClassDec
						bind.merge(child)
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx) {
		val bind = new UniClassDec
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1341: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit as java.util.List<java.lang.String>
						} else {
							bind.modifiers += it.visit as java.util.List<java.lang.String>
						}
					}
					case 1343: {
						bind.className = it.visit as java.lang.String
					}
					case 1347: {
						if (bind.interfaces == null) {
							bind.interfaces = it.visit as java.util.List<java.lang.String>
						} else {
							bind.interfaces += it.visit as java.util.List<java.lang.String>
						}
					}
					case 1350: {
						if (bind.members == null) {
							bind.members = it.visit as java.util.List<net.unicoen.node.UniMemberDec>
						} else {
							bind.members += it.visit as java.util.List<net.unicoen.node.UniMemberDec>
						}
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitInterfaceModifiers(Java8Parser.InterfaceModifiersContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1352: {
							list += it.visit as String
						}
					}
				}
			}
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
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1370: {
							list += it.visit as List<String>
						}
					}
				}
			}
		}
		list
	}

	override public visitInterfaceBody(Java8Parser.InterfaceBodyContext ctx) {
		val list = new ArrayList<UniMemberDec>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1373: {
							list += it.visit as List<UniMemberDec>
						}
					}
				}
			}
		}
		list
	}

	override public visitInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx) {
		val list = new ArrayList<UniMemberDec>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1381: {
							list += it.visit as List<UniFieldDec>
						}
						case 1382: {
							list += it.visit as UniMethodDec
						}
					}
				}
			}
		}
		list
	}

	override public visitConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx) {
		val list = new ArrayList<UniFieldDec>
		val tNode = new UniFieldDec
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1388: {
							tNode.modifiers = it.visit as java.util.List<java.lang.String>
						}
						case 1389: {
							tNode.type = it.visit as java.lang.String
						}
						case 1390: {
							list += it.visit as List<UniFieldDec>
						}
					}
				}
			}
		}
		list.forEach [
			it.merge(tNode)
		]
		list
	}

	override public visitConstantModifiers(Java8Parser.ConstantModifiersContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1393: {
							list += it.visit as String
						}
					}
				}
			}
		}
		list
	}

	override public visitConstantModifier(Java8Parser.ConstantModifierContext ctx) {
		ctx.text
	}

	override public visitInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx) {
		val bind = new UniMethodDec
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1405: {
						if (bind.modifiers == null) {
							bind.modifiers = it.visit as java.util.List<java.lang.String>
						} else {
							bind.modifiers += it.visit as java.util.List<java.lang.String>
						}
					}
					case 1406: {
						val child = it.visit as UniMethodDec
						bind.merge(child)
					}
					case 1407: {
						bind.block = it.visit as net.unicoen.node.UniBlock
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitInterfaceMethodModifiers(Java8Parser.InterfaceMethodModifiersContext ctx) {
		val list = new ArrayList<String>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1409: {
							list += it.visit as String
						}
					}
				}
			}
		}
		list
	}

	override public visitInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx) {
		ctx.text
	}

	override public visitArrayInitializer(Java8Parser.ArrayInitializerContext ctx) {
		val bind = new UniArray
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1533: {
						if (bind.items == null) {
							bind.items = it.visit as java.util.List<net.unicoen.node.UniExpr>
						} else {
							bind.items += it.visit as java.util.List<net.unicoen.node.UniExpr>
						}
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitVariableInitializerList(Java8Parser.VariableInitializerListContext ctx) {
		val list = new ArrayList<UniExpr>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1541: {
							val ret = it.visit
							if (ret instanceof UniExpr) {
								list += ret as UniExpr
							} else {
								list += ret as List<UniExpr>
							}
						}
						case 1543: {
							val ret = it.visit
							if (ret instanceof UniExpr) {
								list += ret as UniExpr
							} else {
								list += ret as List<UniExpr>
							}
						}
					}
				}
			}
		}
		list
	}

	override public visitBlock(Java8Parser.BlockContext ctx) {
		val bind = new UniBlock
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1550: {
						if (bind.body == null) {
							bind.body = it.visit as java.util.List<net.unicoen.node.UniExpr>
						} else {
							bind.body += it.visit as java.util.List<net.unicoen.node.UniExpr>
						}
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitBlockStatements(Java8Parser.BlockStatementsContext ctx) {
		val list = new ArrayList<UniExpr>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1555: {
							val ret = it.visit
							if (ret instanceof UniExpr) {
								list += ret as UniExpr
							} else {
								list += ret as List<UniExpr>
							}
						}
						case 1556: {
							val ret = it.visit
							if (ret instanceof UniExpr) {
								list += ret as UniExpr
							} else {
								list += ret as List<UniExpr>
							}
						}
					}
				}
			}
		}
		list
	}

	override public visitExpressionStatement(Java8Parser.ExpressionStatementContext ctx) {
		val bind = new UniBinOp
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1618: {
						return it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitIfThenStatement(Java8Parser.IfThenStatementContext ctx) {
		val bind = new UniIf
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1632: {
						bind.cond = it.visit as net.unicoen.node.UniExpr
					}
					case 1634: {
						bind.trueStatement = it.visit as net.unicoen.node.UniExpr
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitClassInstanceCreationExpression_lfno_primary(Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx) {
		val bind = new UniNew
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2232: {
						if (bind.args == null) {
							bind.args = it.visit as java.util.List<net.unicoen.node.UniExpr>
						} else {
							bind.args += it.visit as java.util.List<net.unicoen.node.UniExpr>
						}
					}
					case 2256: {
						if (bind.args == null) {
							bind.args = it.visit as java.util.List<net.unicoen.node.UniExpr>
						} else {
							bind.args += it.visit as java.util.List<net.unicoen.node.UniExpr>
						}
					}
				}
			} else if (it instanceof TerminalNode) {
				if (it.symbol.type == Java8Parser.Identifier) {
					bind.type = it.text
				}
				else if (it.symbol.type == Java8Parser.Identifier) {
					bind.type = it.text
				}
			}
		}
		bind
	}

	override public visitArgumentList(Java8Parser.ArgumentListContext ctx) {
		val list = new ArrayList<UniExpr>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 2497: {
							val ret = it.visit
							if (ret instanceof UniExpr) {
								list += ret as UniExpr
							} else {
								list += ret as List<UniExpr>
							}
						}
						case 2499: {
							val ret = it.visit
							if (ret instanceof UniExpr) {
								list += ret as UniExpr
							} else {
								list += ret as List<UniExpr>
							}
						}
					}
				}
			}
		}
		list
	}

	override public visitArrayCreationExpression(Java8Parser.ArrayCreationExpressionContext ctx) {
		val bind = new UniNewArray
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2603: {
						bind.type = it.visit as java.lang.String
					}
					case 2604: {
						if (bind.elementsNum == null) {
							bind.elementsNum = it.visit as java.util.List<net.unicoen.node.UniExpr>
						} else {
							bind.elementsNum += it.visit as java.util.List<net.unicoen.node.UniExpr>
						}
					}
					case 2609: {
						bind.type = it.visit as java.lang.String
					}
					case 2610: {
						if (bind.elementsNum == null) {
							bind.elementsNum = it.visit as java.util.List<net.unicoen.node.UniExpr>
						} else {
							bind.elementsNum += it.visit as java.util.List<net.unicoen.node.UniExpr>
						}
					}
					case 2615: {
						bind.type = it.visit as java.lang.String
					}
					case 2617: {
						bind.value = it.visit as net.unicoen.node.UniArray
					}
					case 2620: {
						bind.type = it.visit as java.lang.String
					}
					case 2622: {
						bind.value = it.visit as net.unicoen.node.UniArray
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitDimExprs(Java8Parser.DimExprsContext ctx) {
		val list = new ArrayList<UniExpr>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 2626: {
							list += it.visit as List<UniExpr>
						}
						case 2627: {
							list += it.visit as List<UniExpr>
						}
					}
				}
			}
		}
		list
	}

	override public visitDimExpr(Java8Parser.DimExprContext ctx) {
		val list = new ArrayList<UniExpr>
		if (ctx.children != null) {	// required
			for (it : ctx.children) {
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 2640: {
							val ret = it.visit
							if (ret instanceof UniExpr) {
								list += ret as UniExpr
							} else {
								list += ret as List<UniExpr>
							}
						}
					}
				}
			}
		}
		list
	}

	override public visitAssignment(Java8Parser.AssignmentContext ctx) {
		val bind = new UniBinOp
		for (it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2681: {
						bind.left = it.visit as net.unicoen.node.UniExpr
					}
					case 2682: {
						bind.operator = it.visit as java.lang.String
					}
					case 2683: {
						bind.right = it.visit as net.unicoen.node.UniExpr
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		bind
	}

	override public visitAssignmentOperator(Java8Parser.AssignmentOperatorContext ctx) {
		ctx.text
	}
}
