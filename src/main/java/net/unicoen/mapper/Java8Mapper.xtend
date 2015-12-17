package net.unicoen.mapper

import com.google.common.collect.Lists
import com.google.common.collect.Maps
import java.io.FileInputStream
import java.util.List
import java.util.Map
import net.unicoen.node.*
import net.unicoen.parser.Java8BaseVisitor
import net.unicoen.parser.Java8Lexer
import net.unicoen.parser.Java8Parser
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
import java.lang.reflect.ParameterizedType

class Java8Mapper extends Java8BaseVisitor<Object> {
	val boolean _isDebugMode

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
		val list = Lists.newArrayList()
		(0 ..< n).forEach [ i |
			val c = node.getChild(i)
			val childResult = c.visit
			list += childResult
		]
		list
	}

	override public visit(ParseTree tree) {
		if (_isDebugMode) {
			if (!(tree instanceof ParserRuleContext)) {
				return visitTerminal(tree as TerminalNode)
			}
			val ruleName = Java8Parser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
			println("enter " + ruleName + " : " + tree.text)
			val ret = tree.accept(this)
			println("exit " + ruleName + " : " + ret)
			ret
		} else {
			tree.accept(this)
		}
	}

	override public visitTerminal(TerminalNode node) {
		println("visit TERMINAL : " + node.text)
		node.text
	}

	private def Object flatten(Object obj) {
		if (obj instanceof List<?>) {
			if (obj.size == 1) {
				return obj.get(0).flatten
			}
			val ret = Lists.newArrayList
			obj.forEach [
				ret += it.flatten
			]
			return ret
		}
		if (obj instanceof Map<?,?>) {
			if (obj.size == 1) {
				return obj.get(obj.keySet.get(0)).flatten
			}
			val ret = Maps.newHashMap
			obj.forEach [ key, value |
				ret.put(key, value.flatten)
			]
			return ret
		}
		obj
	}

	public def <T> List<T> castToList(Object obj, Class<T> clazz) {
		val temp = obj.flatten
		val ret = Lists.newArrayList
		if (temp instanceof Map<?, ?>) {
			val add = temp.containsKey("add")
			temp.forEach [ key, value |
				switch key {
					case "add": {
						ret += value.castToList(clazz)
					}
					default: {
						if (!add) {
							ret += value.castToList(clazz)
						}
					}
				}
			]
		} else if (temp instanceof List<?>) {
			temp.forEach [
				ret += it.castToList(clazz)
			]
		} else {
			ret += temp.castTo(clazz)
		}
		ret
	}

	public def <T> T castTo(Object obj, Class<T> clazz) {
		val temp = obj.flatten
		if (temp instanceof Map<?,?>) {
			if (String.isAssignableFrom(clazz)) {
				val builder = new StringBuilder
				temp.forEach [ key, value |
					builder.append(value.castTo(clazz))
				]
				return clazz.getConstructor(StringBuilder).newInstance(builder)
			}
			val instance = clazz.newInstance
			val fields = clazz.fields
			val fieldsName = Lists.newArrayList
			fields.forEach[fieldsName.add(it.name)]
			temp.forEach [ key, value |
				if (fieldsName.contains(key)) {
					val field = fields.get(fieldsName.indexOf(key))
					field.set(instance,
						if (List.isAssignableFrom(field.type)) {
							value.castToList(
								(field.genericType as ParameterizedType).actualTypeArguments.get(0) as Class<?>)
						} else {
							value.castTo(field.type)
						})
				}
			]
			return instance
		}
		if (temp instanceof List<?>) {
			if (String.isAssignableFrom(clazz)) {
				val builder = new StringBuilder
				temp.forEach [
					builder.append(it.castTo(clazz))
				]
				return clazz.getConstructor(StringBuilder).newInstance(builder)
			}
			val first = temp.findFirst[clazz.isAssignableFrom(it.class)]
			return if (first == null) {
				if (clazz != UniExpr) clazz.newInstance else null
			} else
				first.castTo(clazz)
		}
		clazz.cast(temp)
	}

	override public visitLiteral(Java8Parser.LiteralContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
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
		return new UniBoolLiteral(Boolean.parseBoolean(text))
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

	override public visitCharacterLiteral(Java8Parser.CharacterLiteralContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitNullLiteral(Java8Parser.NullLiteralContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitType(Java8Parser.TypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPrimitiveType(Java8Parser.PrimitiveTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitNumericType(Java8Parser.NumericTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitIntegralType(Java8Parser.IntegralTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitFloatingPointType(Java8Parser.FloatingPointTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitReferenceType(Java8Parser.ReferenceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitClassType(Java8Parser.ClassTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitClassType_lf_classOrInterfaceType(Java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitClassType_lfno_classOrInterfaceType(Java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitInterfaceType(Java8Parser.InterfaceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitInterfaceType_lf_classOrInterfaceType(Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitInterfaceType_lfno_classOrInterfaceType(Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTypeVariable(Java8Parser.TypeVariableContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitArrayType(Java8Parser.ArrayTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitDims(Java8Parser.DimsContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTypeParameter(Java8Parser.TypeParameterContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTypeParameterModifier(Java8Parser.TypeParameterModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTypeBound(Java8Parser.TypeBoundContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitAdditionalBound(Java8Parser.AdditionalBoundContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTypeArguments(Java8Parser.TypeArgumentsContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTypeArgumentList(Java8Parser.TypeArgumentListContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTypeArgument(Java8Parser.TypeArgumentContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitWildcard(Java8Parser.WildcardContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitWildcardBounds(Java8Parser.WildcardBoundsContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPackageName(Java8Parser.PackageNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTypeName(Java8Parser.TypeNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPackageOrTypeName(Java8Parser.PackageOrTypeNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitExpressionName(Java8Parser.ExpressionNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val name = Lists.newArrayList
		map.put("name", name)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
				}
			} else if (it instanceof TerminalNode) {
				if (it.symbol.type == Java8Parser.Identifier) {
					name += it.text
				}
			}
		]
		map.castTo(UniIdent)
	}

	override public visitAmbiguousName(Java8Parser.AmbiguousNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitCompilationUnit(Java8Parser.CompilationUnitContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 774: {
						merge += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		val node = map.castTo(UniClassDec)
		merge.forEach[node.merge(it.castTo(UniClassDec))]
		node
	}

	override public visitPackageDeclaration(Java8Parser.PackageDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPackageModifier(Java8Parser.PackageModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitImportDeclaration(Java8Parser.ImportDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitSingleTypeImportDeclaration(Java8Parser.SingleTypeImportDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTypeImportOnDemandDeclaration(Java8Parser.TypeImportOnDemandDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitSingleStaticImportDeclaration(Java8Parser.SingleStaticImportDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitStaticImportOnDemandDeclaration(Java8Parser.StaticImportOnDemandDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTypeDeclaration(Java8Parser.TypeDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 829: {
						merge += it.visit
					}
					case 830: {
						merge += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		val node = map.castTo(UniClassDec)
		merge.forEach[node.merge(it.castTo(UniClassDec))]
		node
	}

	override public visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 834: {
						merge += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		val node = map.castTo(UniClassDec)
		merge.forEach[node.merge(it.castTo(UniClassDec))]
		node
	}

	override public visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val interfaces = Lists.newArrayList
		map.put("interfaces", interfaces)
		val superClass = Lists.newArrayList
		map.put("superClass", superClass)
		val members = Lists.newArrayList
		map.put("members", members)
		val className = Lists.newArrayList
		map.put("className", className)
		val modifiers = Lists.newArrayList
		map.put("modifiers", modifiers)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 838: {
						modifiers += it.visit
					}
					case 840: {
						className += it.visit
					}
					case 844: {
						superClass += it.visit
					}
					case 847: {
						interfaces += it.visit
					}
					case 850: {
						members += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		map.castTo(UniClassDec)
	}

	override public visitClassName(Java8Parser.ClassNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitClassModifiers(Java8Parser.ClassModifiersContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 854: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitClassModifier(Java8Parser.ClassModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTypeParameters(Java8Parser.TypeParametersContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTypeParameterList(Java8Parser.TypeParameterListContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitSuperclass(Java8Parser.SuperclassContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 883: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitSuperinterfaces(Java8Parser.SuperinterfacesContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 886: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitInterfaceTypeList(Java8Parser.InterfaceTypeListContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 888: {
							add += it.visit
						}
						case 890: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitClassBody(Java8Parser.ClassBodyContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 897: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}

	override public visitClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 905: {
							add += it.visit
						}
						case 908: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}

	override public visitClassMemberDeclaration(Java8Parser.ClassMemberDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 911: {
							add += it.visit
						}
						case 912: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}

	override public visitFieldDeclaration(Java8Parser.FieldDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val modifiers = Lists.newArrayList
		map.put("modifiers", modifiers)
		val type = Lists.newArrayList
		map.put("type", type)
		val merge = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 918: {
							modifiers += it.visit
						}
						case 919: {
							type += it.visit
						}
						case 920: {
							merge += it.visit
						}
					}
				}
			]
		}
		val node = map.castTo(UniFieldDec)
		merge.castToList(UniFieldDec).forEach[it.merge(node)]
		merge
	}

	override public visitFieldModifiers(Java8Parser.FieldModifiersContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 923: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitFieldModifier(Java8Parser.FieldModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitVariableDeclaratorList(Java8Parser.VariableDeclaratorListContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 939: {
							add += it.visit
						}
						case 941: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniFieldDec)
	}

	override public visitVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val name = Lists.newArrayList
		map.put("name", name)
		val value = Lists.newArrayList
		map.put("value", value)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 947: {
						name += it.visit
					}
					case 949: {
						value += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		map.castTo(UniFieldDec)
	}

	override public visitVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitVariableInitializer(Java8Parser.VariableInitializerContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitUnannType(Java8Parser.UnannTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitUnannPrimitiveType(Java8Parser.UnannPrimitiveTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitUnannReferenceType(Java8Parser.UnannReferenceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitUnannClassOrInterfaceType(Java8Parser.UnannClassOrInterfaceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitUnannClassType(Java8Parser.UnannClassTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitUnannClassType_lf_unannClassOrInterfaceType(Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitUnannClassType_lfno_unannClassOrInterfaceType(Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitUnannInterfaceType(Java8Parser.UnannInterfaceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitUnannInterfaceType_lf_unannClassOrInterfaceType(Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitUnannInterfaceType_lfno_unannClassOrInterfaceType(Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitUnannTypeVariable(Java8Parser.UnannTypeVariableContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitUnannArrayType(Java8Parser.UnannArrayTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val block = Lists.newArrayList
		map.put("block", block)
		val modifiers = Lists.newArrayList
		map.put("modifiers", modifiers)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1036: {
						modifiers += it.visit
					}
					case 1042: {
						merge += it.visit
					}
					case 1043: {
						block += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		val node = map.castTo(UniMethodDec)
		merge.forEach[node.merge(it.castTo(UniMethodDec))]
		node
	}

	override public visitMethodModifier(Java8Parser.MethodModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitMethodHeader(Java8Parser.MethodHeaderContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val returnType = Lists.newArrayList
		map.put("returnType", returnType)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1057: {
						returnType += it.visit
					}
					case 1058: {
						merge += it.visit
					}
					case 1069: {
						returnType += it.visit
					}
					case 1070: {
						merge += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		val node = map.castTo(UniMethodDec)
		merge.forEach[node.merge(it.castTo(UniMethodDec))]
		node
	}

	override public visitResult(Java8Parser.ResultContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val args = Lists.newArrayList
		map.put("args", args)
		val methodName = Lists.newArrayList
		map.put("methodName", methodName)
		val returnType = Lists.newArrayList
		map.put("returnType", returnType)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1080: {
						methodName += it.visit
					}
					case 1082: {
						args += it.visit
					}
					case 1086: {
						returnType += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		map.castTo(UniMethodDec)
	}

	override public visitMethodName(Java8Parser.MethodNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitFormalParameterList(Java8Parser.FormalParameterListContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1091: {
							add += it.visit
						}
						case 1093: {
							add += it.visit
						}
						case 1095: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniArg)
	}

	override public visitFormalParameters(Java8Parser.FormalParametersContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1098: {
							add += it.visit
						}
						case 1100: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniArg)
	}

	override public visitFormalParameter(Java8Parser.FormalParameterContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val type = Lists.newArrayList
		map.put("type", type)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1122: {
						type += it.visit
					}
					case 1123: {
						merge += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		val node = map.castTo(UniArg)
		merge.forEach[node.merge(it.castTo(UniArg))]
		node
	}

	override public visitParameterDeclaratorId(Java8Parser.ParameterDeclaratorIdContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val name = Lists.newArrayList
		map.put("name", name)
		val type = Lists.newArrayList
		map.put("type", type)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1125: {
						name += it.visit
					}
					case 1126: {
						type += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		map.castTo(UniArg)
	}

	override public visitParameterName(Java8Parser.ParameterNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitVariableModifier(Java8Parser.VariableModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitLastFormalParameter(Java8Parser.LastFormalParameterContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitReceiverParameter(Java8Parser.ReceiverParameterContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitThrows_(Java8Parser.Throws_Context ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitExceptionTypeList(Java8Parser.ExceptionTypeListContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitExceptionType(Java8Parser.ExceptionTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitMethodBody(Java8Parser.MethodBodyContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1182: {
						merge += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		val node = map.castTo(UniBlock)
		merge.forEach[node.merge(it.castTo(UniBlock))]
		node
	}

	override public visitInstanceInitializer(Java8Parser.InstanceInitializerContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitStaticInitializer(Java8Parser.StaticInitializerContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val block = Lists.newArrayList
		map.put("block", block)
		val modifiers = Lists.newArrayList
		map.put("modifiers", modifiers)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1191: {
						modifiers += it.visit
					}
					case 1197: {
						merge += it.visit
					}
					case 1201: {
						block += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		val node = map.castTo(UniMethodDec)
		merge.forEach[node.merge(it.castTo(UniMethodDec))]
		node
	}

	override public visitConstructorModifier(Java8Parser.ConstructorModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitConstructorDeclarator(Java8Parser.ConstructorDeclaratorContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val args = Lists.newArrayList
		map.put("args", args)
		val methodName = Lists.newArrayList
		map.put("methodName", methodName)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1212: {
						methodName += it.visit
					}
					case 1214: {
						args += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		map.castTo(UniMethodDec)
	}

	override public visitSimpleTypeName(Java8Parser.SimpleTypeNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitConstructorBody(Java8Parser.ConstructorBodyContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitExplicitConstructorInvocation(Java8Parser.ExplicitConstructorInvocationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitEnumDeclaration(Java8Parser.EnumDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitEnumBody(Java8Parser.EnumBodyContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitEnumConstantList(Java8Parser.EnumConstantListContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitEnumConstant(Java8Parser.EnumConstantContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitEnumConstantModifier(Java8Parser.EnumConstantModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitEnumBodyDeclarations(Java8Parser.EnumBodyDeclarationsContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1337: {
						merge += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		val node = map.castTo(UniClassDec)
		merge.forEach[node.merge(it.castTo(UniClassDec))]
		node
	}

	override public visitNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val superClass = Lists.newArrayList
		map.put("superClass", superClass)
		val members = Lists.newArrayList
		map.put("members", members)
		val className = Lists.newArrayList
		map.put("className", className)
		val modifiers = Lists.newArrayList
		map.put("modifiers", modifiers)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1341: {
						modifiers += it.visit
					}
					case 1343: {
						className += it.visit
					}
					case 1347: {
						superClass += it.visit
					}
					case 1350: {
						members += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		map.castTo(UniClassDec)
	}

	override public visitInterfaceModifiers(Java8Parser.InterfaceModifiersContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1352: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitInterfaceName(Java8Parser.InterfaceNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitInterfaceModifier(Java8Parser.InterfaceModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitExtendsInterfaces(Java8Parser.ExtendsInterfacesContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1370: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitInterfaceBody(Java8Parser.InterfaceBodyContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1373: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}

	override public visitInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1381: {
							add += it.visit
						}
						case 1382: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniMemberDec)
	}

	override public visitConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val modifiers = Lists.newArrayList
		map.put("modifiers", modifiers)
		val type = Lists.newArrayList
		map.put("type", type)
		val merge = Lists.newArrayList
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1388: {
							modifiers += it.visit
						}
						case 1389: {
							type += it.visit
						}
						case 1390: {
							merge += it.visit
						}
					}
				}
			]
		}
		val node = map.castTo(UniFieldDec)
		merge.castToList(UniFieldDec).forEach[it.merge(node)]
		merge
	}

	override public visitConstantModifiers(Java8Parser.ConstantModifiersContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1393: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitConstantModifier(Java8Parser.ConstantModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val block = Lists.newArrayList
		map.put("block", block)
		val modifiers = Lists.newArrayList
		map.put("modifiers", modifiers)
		val merge = Lists.newArrayList
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1405: {
						modifiers += it.visit
					}
					case 1406: {
						merge += it.visit
					}
					case 1407: {
						block += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		val node = map.castTo(UniMethodDec)
		merge.forEach[node.merge(it.castTo(UniMethodDec))]
		node
	}

	override public visitInterfaceMethodModifiers(Java8Parser.InterfaceMethodModifiersContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1409: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(String)
	}

	override public visitInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitAnnotationTypeDeclaration(Java8Parser.AnnotationTypeDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitAnnotationTypeBody(Java8Parser.AnnotationTypeBodyContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitAnnotationTypeMemberDeclaration(Java8Parser.AnnotationTypeMemberDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitAnnotationTypeElementDeclaration(Java8Parser.AnnotationTypeElementDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitAnnotationTypeElementModifier(Java8Parser.AnnotationTypeElementModifierContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitDefaultValue(Java8Parser.DefaultValueContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitAnnotation(Java8Parser.AnnotationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitNormalAnnotation(Java8Parser.NormalAnnotationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitElementValuePairList(Java8Parser.ElementValuePairListContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitElementValuePair(Java8Parser.ElementValuePairContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitElementValue(Java8Parser.ElementValueContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitElementValueArrayInitializer(Java8Parser.ElementValueArrayInitializerContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitElementValueList(Java8Parser.ElementValueListContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitMarkerAnnotation(Java8Parser.MarkerAnnotationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitSingleElementAnnotation(Java8Parser.SingleElementAnnotationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitArrayInitializer(Java8Parser.ArrayInitializerContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val items = Lists.newArrayList
		map.put("items", items)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1533: {
						items += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		map.castTo(UniArray)
	}

	override public visitVariableInitializerList(Java8Parser.VariableInitializerListContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1541: {
							add += it.visit
						}
						case 1543: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniExpr)
	}

	override public visitBlock(Java8Parser.BlockContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val body = Lists.newArrayList
		map.put("body", body)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1550: {
						body += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		map.castTo(UniBlock)
	}

	override public visitBlockStatements(Java8Parser.BlockStatementsContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val add = Lists.newArrayList
		map.put("add", add)
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						case 1555: {
							add += it.visit
						}
						case 1556: {
							add += it.visit
						}
					}
				}
			]
		}
		map.castToList(UniExpr)
	}

	override public visitBlockStatement(Java8Parser.BlockStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitLocalVariableDeclarationStatement(Java8Parser.LocalVariableDeclarationStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitStatement(Java8Parser.StatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitStatementNoShortIf(Java8Parser.StatementNoShortIfContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitStatementWithoutTrailingSubstatement(Java8Parser.StatementWithoutTrailingSubstatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitEmptyStatement(Java8Parser.EmptyStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitLabeledStatement(Java8Parser.LabeledStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitLabeledStatementNoShortIf(Java8Parser.LabeledStatementNoShortIfContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitExpressionStatement(Java8Parser.ExpressionStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		for(it : ctx.children) {
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1618: {
						return it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		}
		map.castTo(UniBinOp)
	}

	override public visitStatementExpression(Java8Parser.StatementExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitIfThenStatement(Java8Parser.IfThenStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val trueStatement = Lists.newArrayList
		map.put("trueStatement", trueStatement)
		val cond = Lists.newArrayList
		map.put("cond", cond)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 1632: {
						cond += it.visit
					}
					case 1634: {
						trueStatement += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		map.castTo(UniIf)
	}

	override public visitIfThenElseStatement(Java8Parser.IfThenElseStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitIfThenElseStatementNoShortIf(Java8Parser.IfThenElseStatementNoShortIfContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitAssertStatement(Java8Parser.AssertStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitSwitchStatement(Java8Parser.SwitchStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitSwitchBlock(Java8Parser.SwitchBlockContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitSwitchBlockStatementGroup(Java8Parser.SwitchBlockStatementGroupContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitSwitchLabels(Java8Parser.SwitchLabelsContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitSwitchLabel(Java8Parser.SwitchLabelContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitEnumConstantName(Java8Parser.EnumConstantNameContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitWhileStatement(Java8Parser.WhileStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitWhileStatementNoShortIf(Java8Parser.WhileStatementNoShortIfContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitDoStatement(Java8Parser.DoStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitForStatement(Java8Parser.ForStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitForStatementNoShortIf(Java8Parser.ForStatementNoShortIfContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitBasicForStatement(Java8Parser.BasicForStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitBasicForStatementNoShortIf(Java8Parser.BasicForStatementNoShortIfContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitForInit(Java8Parser.ForInitContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitForUpdate(Java8Parser.ForUpdateContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitStatementExpressionList(Java8Parser.StatementExpressionListContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitEnhancedForStatement(Java8Parser.EnhancedForStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitEnhancedForStatementNoShortIf(Java8Parser.EnhancedForStatementNoShortIfContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitBreakStatement(Java8Parser.BreakStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitContinueStatement(Java8Parser.ContinueStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitReturnStatement(Java8Parser.ReturnStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitThrowStatement(Java8Parser.ThrowStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitSynchronizedStatement(Java8Parser.SynchronizedStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTryStatement(Java8Parser.TryStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitCatches(Java8Parser.CatchesContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitCatchClause(Java8Parser.CatchClauseContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitCatchFormalParameter(Java8Parser.CatchFormalParameterContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitCatchType(Java8Parser.CatchTypeContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitFinally_(Java8Parser.Finally_Context ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTryWithResourcesStatement(Java8Parser.TryWithResourcesStatementContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitResourceSpecification(Java8Parser.ResourceSpecificationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitResourceList(Java8Parser.ResourceListContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitResource(Java8Parser.ResourceContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPrimary(Java8Parser.PrimaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPrimaryNoNewArray(Java8Parser.PrimaryNoNewArrayContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPrimaryNoNewArray_lf_arrayAccess(Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPrimaryNoNewArray_lfno_arrayAccess(Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPrimaryNoNewArray_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPrimaryNoNewArray_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitClassInstanceCreationExpression(Java8Parser.ClassInstanceCreationExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitClassInstanceCreationExpression_lf_primary(Java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitClassInstanceCreationExpression_lfno_primary(Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitTypeArgumentsOrDiamond(Java8Parser.TypeArgumentsOrDiamondContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitFieldAccess(Java8Parser.FieldAccessContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitFieldAccess_lf_primary(Java8Parser.FieldAccess_lf_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitFieldAccess_lfno_primary(Java8Parser.FieldAccess_lfno_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitArrayAccess(Java8Parser.ArrayAccessContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitArrayAccess_lf_primary(Java8Parser.ArrayAccess_lf_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitArrayAccess_lfno_primary(Java8Parser.ArrayAccess_lfno_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitMethodInvocation_lf_primary(Java8Parser.MethodInvocation_lf_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitMethodInvocation_lfno_primary(Java8Parser.MethodInvocation_lfno_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitArgumentList(Java8Parser.ArgumentListContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitMethodReference(Java8Parser.MethodReferenceContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitMethodReference_lf_primary(Java8Parser.MethodReference_lf_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitMethodReference_lfno_primary(Java8Parser.MethodReference_lfno_primaryContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitArrayCreationExpression(Java8Parser.ArrayCreationExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitDimExprs(Java8Parser.DimExprsContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitDimExpr(Java8Parser.DimExprContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitConstantExpression(Java8Parser.ConstantExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitExpression(Java8Parser.ExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitLambdaExpression(Java8Parser.LambdaExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitLambdaParameters(Java8Parser.LambdaParametersContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitInferredFormalParameterList(Java8Parser.InferredFormalParameterListContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitLambdaBody(Java8Parser.LambdaBodyContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitAssignmentExpression(Java8Parser.AssignmentExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitAssignment(Java8Parser.AssignmentContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		val left = Lists.newArrayList
		map.put("left", left)
		val right = Lists.newArrayList
		map.put("right", right)
		val operator = Lists.newArrayList
		map.put("operator", operator)
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					case 2681: {
						left += it.visit
					}
					case 2682: {
						operator += it.visit
					}
					case 2683: {
						right += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
			}
		]
		map.castTo(UniBinOp)
	}

	override public visitLeftHandSide(Java8Parser.LeftHandSideContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitAssignmentOperator(Java8Parser.AssignmentOperatorContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitConditionalExpression(Java8Parser.ConditionalExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitConditionalOrExpression(Java8Parser.ConditionalOrExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitConditionalAndExpression(Java8Parser.ConditionalAndExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitInclusiveOrExpression(Java8Parser.InclusiveOrExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitExclusiveOrExpression(Java8Parser.ExclusiveOrExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitAndExpression(Java8Parser.AndExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitEqualityExpression(Java8Parser.EqualityExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitRelationalExpression(Java8Parser.RelationalExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitShiftExpression(Java8Parser.ShiftExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitAdditiveExpression(Java8Parser.AdditiveExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitMultiplicativeExpression(Java8Parser.MultiplicativeExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitUnaryExpression(Java8Parser.UnaryExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPreIncrementExpression(Java8Parser.PreIncrementExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPreDecrementExpression(Java8Parser.PreDecrementExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitUnaryExpressionNotPlusMinus(Java8Parser.UnaryExpressionNotPlusMinusContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPostfixExpression(Java8Parser.PostfixExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPostIncrementExpression(Java8Parser.PostIncrementExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPostIncrementExpression_lf_postfixExpression(Java8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPostDecrementExpression(Java8Parser.PostDecrementExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitPostDecrementExpression_lf_postfixExpression(Java8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}

	override public visitCastExpression(Java8Parser.CastExpressionContext ctx) {
		val map = Maps.newHashMap
		val none = Lists.newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	}
}
