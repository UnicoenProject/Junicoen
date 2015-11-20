package net.unicoen.parser.blockeditor;

import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import net.unicoen.parser.blockeditor.blockmodel.BlockElementModel;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMUtil {
	public static String getAttribute(Node node, String attributeName) {
		assert node != null;
		assert attributeName != null;

		if(BlockElementModel.BLOCK_STUB_NODE_NAME.equals(node.getNodeName())){
			node = getChildNode(node, BlockElementModel.BLOCK_NODE_NAME);
		}

		Node attrNode = node.getAttributes().getNamedItem(attributeName);
		if (attrNode == null)
			return null;
		return attrNode.getNodeValue();
	}

	public static Node getChildNode(Node node, String... nodeName) {
		outer: for (int depth = 0; depth < nodeName.length; depth++) {
			for (Node item : eachChild(node)) {
				if (item.getNodeName().equals(nodeName[depth])) {
					node = item;
					continue outer;
				}
			}
			return null;
		}
		return node;
	}

	public static String getChildText(Node node, String... nodeName) {
		Node foundNode = getChildNode(node, nodeName);
		if (foundNode == null)
			return null;

		return foundNode.getTextContent();
	}

	/**
	 * Blockノードの子ノードのテキストを取得する.nodeがStubNodeだった場合,その子のBlockノード取得してから子ノードを取得する
	 * @param node
	 * @param nodeName
	 * @return
	 */
	public static String getChildTextFromBlockNode(Node node, String... nodeName) {
		Node searchNode = node;

		if("BlockStub".equals(node.getNodeName())){
			searchNode = getChildNode(node, "Block");
		}

		Node foundNode = getChildNode(searchNode, nodeName);
		if (foundNode == null)
			return null;

		return foundNode.getTextContent();
	}



	public static Iterable<Node> eachChild(Node node) {
		final NodeList list = node.getChildNodes();
		final int length = list.getLength();
		return new Iterable<Node>() {

			@Override
			public Iterator<Node> iterator() {
				return new Iterator<Node>() {

					private int index = -1;

					@Override
					public Node next() {
						index = nextIndex();
						return list.item(index);
					}

					@Override
					public boolean hasNext() {
						return nextIndex() >= 0;
					}

					private int nextIndex() {
						for (int start = index + 1; start < length; start++) {
							Node node = list.item(start);
							if (node.getNodeName().startsWith("#"))
								continue;
							return start;
						}
						return -1;
					}

					@Override
					public void remove() {
					}
				};
			}
		};
	}

	public static Document createDocumentInstance() throws ParserConfigurationException{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);

		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.newDocument();
		return document;
	}

}
