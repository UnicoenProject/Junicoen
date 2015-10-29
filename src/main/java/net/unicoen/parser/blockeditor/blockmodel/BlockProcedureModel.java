package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import net.unicoen.node.UniMethodDec;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

public class BlockProcedureModel extends BlockElementModel {

	private List<BlockCommandModel> bodyBlocks = new ArrayList<>();
	private static String GENUS_NAME = "procedure";

	public BlockProcedureModel(UniMethodDec dec, Document document, Long ID_COUNTER) {
		initialize(dec, document, ID_COUNTER);
	}

	public void initialize(UniMethodDec funcDec, Document document, Long ID_COUNTER){
		Element procedureElement = createBlockElement(document, GENUS_NAME, ID_COUNTER, GENUS_NAME);

		addElement("Label", document, funcDec.methodName, procedureElement);
		addElement("ReturnType", document, funcDec.returnType, procedureElement);
		addLocationElement(document, "50", "50", procedureElement);

		this.element = procedureElement;
	}

	public void setBodyBlocks(List<BlockCommandModel> bodyBlocks) {
		this.bodyBlocks = bodyBlocks;
	}

	public List<BlockCommandModel> getBodyBlocks() {
		return this.bodyBlocks;
	}

	public void addBlockNodes(Node node) {

		node.appendChild(element);

		for (BlockElementModel param : getSocketBlocks()) {
			node.appendChild(param.getElement());
		}

		for (BlockCommandModel model : bodyBlocks) {
			for (Element element : model.getBlockElements()) {
				node.appendChild(element);
			}
		}
	}

	public void addSockets(Document document, List<BlockProcParmModel> args) {
		List<SocketInfo> sockets = new ArrayList<SocketInfo>();

		for (BlockProcParmModel param : args) {
			addSocketInfoToList(sockets, (BlockElementModel)param);
		}

		//procedureは空のソケットを1つ持っていなければいけない
		addSocketInfoToList(sockets, null);

		List<BlockElementModel> argElements = Lists.transform(args, new Function<BlockProcParmModel, BlockElementModel>() {
			@Override
			public BlockElementModel apply(BlockProcParmModel input) {
				return (BlockElementModel)input;
			}
		});

		addSocketsAndNodes(argElements, document, new SocketsInfo(sockets));
	}

}
