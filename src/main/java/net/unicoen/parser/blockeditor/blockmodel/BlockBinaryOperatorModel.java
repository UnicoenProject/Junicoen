package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import net.unicoen.parser.blockeditor.BlockResolver;

public class BlockBinaryOperatorModel extends BlockExprModel {

	private BlockElementModel left;
	private BlockElementModel right;
	public static String OPERATOR_NODE = "Operator";

	public static enum BINOP_BLOCKGENUSNAMES {
		AND("and"), OR("or"), EQUALS_NUMBER("equals-number"), NOT_EQUALS_NUMBER("not-equals-number"), GREATERTHAN_OR_EQUALTO("greaterthanorequalto"), GREATERTHAN("greaterthan"), LESSTHAN_OR_EQUALTO("lessthanorequalto"), LESSTHAN("lessthan"), SUM("sum"), DIFFERENCE("difference"), PRODUCT("product"), QUOTIENT("quotient"), REMAINDER("remainder");

		private final String text;

		private BINOP_BLOCKGENUSNAMES(String text) {
			this.text = text;
		}

		@Override
		public String toString() {
			return this.text;
		}
	}

	public BlockBinaryOperatorModel(Document document, String operator, Long id, BlockElementModel left, BlockElementModel right, BlockResolver resolver) {
		this.element = createBlockElement(document, calcGenusName(operator, left, right), id, BlockElementModel.BLOCKKINDS.FUNCTION.toString());
		this.left = left;
		this.right = right;
	}

	@Override
	public List<Element> getBlockElements() {
		List<Element> elements = new ArrayList<Element>();
		elements.addAll(left.getBlockElements());
		elements.addAll(right.getBlockElements());
		elements.add(getElement());
		return elements;
	}

	public String calcConnectorType(String leftConnectorType, String rightConnectorType) {
		String returnType = "number";
		if (leftConnectorType.equals(rightConnectorType)) {
			return leftConnectorType;
		}

		if (rightConnectorType.equals("string") || leftConnectorType.equals("string")) {
			return "string";
		}

		if ((leftConnectorType.equals("number") && rightConnectorType.equals("double-number")) || (leftConnectorType.equals("double-number") && rightConnectorType.equals("number"))) {
			return "double-number";
		}
		return returnType;
	}

	public String calcGenusName(String operator, BlockElementModel left, BlockElementModel right) {
		String type = calcConnectorType(left.getPlugAttribute(BlockPlugModel.CONNECTOR_TYPE_ATTR), right.getPlugAttribute(BlockPlugModel.CONNECTOR_TYPE_ATTR));
		if (operator.equals("&&")) {
			return "and";
		} else if (operator.equals("||")) {
			return "or";
		} else if (operator.equals("==") || operator.equals("!=")) {
			return calcEqualsOperatorGenusName(operator, type);
		} else if (operator.equals(">=") || operator.equals(">") || operator.equals("<=") || operator.equals("<")) {
			return calcCompareOperatorGenusName(operator, type);
		} else if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%")) {
			return calcCalcuratorOperationGenusName(operator, type);
		} else {
			throw new RuntimeException("unequipment operator");
		}
	}

	public String calcCompareOperatorGenusName(String operator, String type) {
		String genusName;
		if (operator.equals(">=") || operator.equals(">")) {
			genusName = "greaterthan";
			if (operator.equals(">=")) {
				genusName = "greaterthanorequalto";
			}

			if ("double-number".equals(type)) {
				genusName += "-double";
			}
			return genusName;
		} else {
			genusName = "lessthan";
			if (operator.equals("<=")) {
				genusName = "lessthanorequalto";
			}

			if ("double-number".equals(type)) {
				genusName += "-double";
			}
			return genusName;
		}
	}

	public String calcEqualsOperatorGenusName(String operator, String connectorType) {
		String genusName = "equals-";
		if (operator.equals("!=")) {
			genusName = "not-" + genusName;
		}
		
		if(connectorType.equals("double-number")){
			connectorType = "number-double";
		}

		return genusName + connectorType;
	}

	public String calcCalcuratorOperationGenusName(String operator, String type) {
		String genusName = "sum";
		if (operator.equals("-")) {
			genusName = "difference";
		} else if (operator.equals("*")) {
			genusName = "product";
		} else if (operator.equals("/")) {
			genusName = "quotient";
		} else if (operator.equals("%")) {
			genusName = "remainder";
		}

		if (genusName.equals("sum")) {
			if ("number".equals(type)) {
			} else if ("double-number".equals(type)) {
				genusName += "-double";
			} else if ("string".equals(type)) {
				genusName = "string-append";
			}
		} else {
			if ("number".equals(type)) {
			} else if ("double-number".equals(type)) {
				genusName += "-double";
			}
		}

		return genusName;
	}

}
