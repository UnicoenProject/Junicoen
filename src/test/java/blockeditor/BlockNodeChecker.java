package blockeditor;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.BlockToUniBlockResolver;
import net.unicoen.parser.blockeditor.DOMUtil;
import net.unicoen.parser.blockeditor.blockmodel.BlockBinaryOperatorModel;
import net.unicoen.parser.blockeditor.blockmodel.BlockElementModel;

public class BlockNodeChecker {

	@Test
	public void test() throws SAXException, IOException {
		BlockResolver resolver = new BlockResolver("blockeditor/blocks/", true);
		BlockToUniBlockResolver b2uresolver = new BlockToUniBlockResolver("blockeditor/blocks/", true);

		Map<String, Node> map = resolver.getAllBlockNodes();
		for (String key : map.keySet()) {
			Node node = map.get(key);
			if (DOMUtil.getAttribute(node, BlockElementModel.KIND_ATTR).equals("function")) {
				if (DOMUtil.getChildText(node, "Type") == null) {
					if (!key.equals("agent") && !key.equals("callGetterMethod2")) {
						throw new RuntimeException(key);
					}
				}

				if (!key.equals("callGetterMethod2") &&!key.equals("special-expression") &&!key.equals("type-object")&&!key.equals("agent") && DOMUtil.getChildText(node, "Name") == null && !isBinOp(node) && !key.startsWith("new-") && resolver.getForceConvertionMap().getUniMethodCallModel(key) == null) {
					throw new RuntimeException(key);
				}

			} else if (DOMUtil.getAttribute(node, BlockElementModel.KIND_ATTR).equals("command")) {
				if (DOMUtil.getChildText(node, "Name") == null) {
					if (!key.equals("caller") &&!key.equals("super") &&!key.equals("inc") &&!key.equals("setter-arrayelement") &&!key.equals("special-variable") &&!key.equals("dowhile") &&!key.equals("while") &&!key.equals("return") &&!key.equals("callThisActionMethod2") &&!key.equals("callActionMethod") &&!key.equals("ifelse") &&!key.equals("special") &&!key.equals("start") &&!key.equals("break") &&!key.equals("continue") &&!key.equals("empty") &&!key.equals("agent") && !key.equals("callActionMethod2") && resolver.getForceConvertionMap().getUniMethodCallModel(key) == null && !key.equals("setter")) {
						throw new RuntimeException(key);
					}
				}
			}

		}
	}

	private boolean isBinOp(Node node) {
		Node operator = DOMUtil.getChildNode(node, BlockBinaryOperatorModel.OPERATOR_NODE);
		if (operator != null) {
			return true;
		}
		return false;
	}
}
