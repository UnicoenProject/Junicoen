package net.unicoen.parser.blockeditor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import net.unicoen.parser.blockeditor.blockmodel.BlockElementModel;

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
	
	public static List<Node> getChildNodes(Node node){
		NodeList list = node.getChildNodes();
		List<Node> childNodes = new ArrayList<>();
		
		for(int i = 0; i < list.getLength();i++){
			Node child = list.item(i);
			if(!child.getNodeName().startsWith("#")){
				childNodes.add(child);
			}
		}
		
		return childNodes;
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
	
	public static Node getNodeFromXMLFilePath(String path){
		DOMParser parser = new DOMParser();
		// lang_def.xmlを読み込む
		try {
			parser.parse(path);
			Document doc = parser.getDocument();
			return doc.getDocumentElement();
			
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void doAnythingToNodeList(Node node, String nodeName, Consumer<Node> process){
		for(int i = 0 ; i < node.getChildNodes().getLength();i++){
			if(nodeName.equals(node.getChildNodes().item(i).getNodeName())){
				process.accept(node.getChildNodes().item(i));
			}
		}
	}
	
	/**
	 * 指定した名前の子ノードのテキストコンテントのリストを作成する．
	 * @param node 親ノード
	 * @param listNodeName　テキストコンテントを取得してリストを作成したい子ノードの名前
	 * @return 子ノードのテキストコンテントのリスト
	 */
	public static List<String> getListFromNode(Node node, String listNodeName){
		NodeList children = node.getChildNodes();
		List<String> contentList = new ArrayList<>();
		for(int i = 0; i<children.getLength();i++){
			Node child = children.item(i);
			if(listNodeName.equals(child.getNodeName())){
				contentList.add(child.getTextContent());
			}
		}
		return contentList;
	}
}
