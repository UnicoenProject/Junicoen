package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import net.unicoen.parser.blockeditor.BlockResolver;

import org.w3c.dom.Element;

public class BlockBinaryOperatorModel extends BlockExprModel {

	private BlockElementModel left;
	private BlockElementModel right;

	public BlockBinaryOperatorModel(String operator, Element binOpElement, BlockElementModel left, BlockElementModel right,BlockResolver resolver) {
		this.element = binOpElement;
		this.left = left;
		this.right = right;
			//genusName書き換え
		this.element.setAttribute(BlockElementModel.GENUS_NAME_ATTRIBUTE_TAG, calcGenusName(operator, left, right));
	}

	public List<Element> getBlockElements() {
		List<Element> elements = new ArrayList<Element>();
		elements.addAll(left.getBlockElements());
		elements.addAll(right.getBlockElements());
		elements.add(getElement());
		return elements;
	}

	public String calcConnectorType(String leftConnectorType, String rightConnectorType) {
		String returnType = "number";

		if(rightConnectorType.equals("string") || leftConnectorType.equals("string")){
			return "string";
		}

		if (leftConnectorType.equals(rightConnectorType)) {
			returnType = leftConnectorType;
		} else if ((leftConnectorType.equals("number") && rightConnectorType.equals("double-number")) || (leftConnectorType.equals("double-number") && rightConnectorType.equals("number"))) {
			returnType = "number";
		}
		return returnType;
	}

	public String calcGenusName(String operator, BlockElementModel left, BlockElementModel right){
		String type = calcConnectorType(left.getPlugAttribute(BlockPlugModel.CONNECTOR_TYPE_TAG), right.getPlugAttribute(BlockPlugModel.CONNECTOR_TYPE_TAG));
		if (operator.equals("=")) {// 他の二項演算と扱いが別（ソケットが一つのみ）
			return "";
		} else if (operator.equals("&&")) {
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

			if ("number".equals(type)) {
			} else if ("double-number".equals(type)) {
				genusName += "-double";
			} else {
				throw new RuntimeException(type + "is not supported type yet at " + operator);
			}
			return genusName;
		} else {
			genusName = "lessthan";
			if (operator.equals("<=")) {
				genusName = "lessthanorequalto";
			}

			if ("number".equals(type)) {
			} else if ("double-number".equals(type)) {
				genusName += "-double";
			} else {
				throw new RuntimeException(type + "is not supported type yet at " + operator);
			}
			return genusName;
		}
	}

	public String calcEqualsOperatorGenusName(String operator, String connectorType) {
		String genusName = "equals-";
		if (operator.equals("!=")) {
			genusName = "not-" + genusName;
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
			} else {
				throw new RuntimeException(type + "is not supported type yet at " + operator);
			}
		}

		return genusName;
	}

}
