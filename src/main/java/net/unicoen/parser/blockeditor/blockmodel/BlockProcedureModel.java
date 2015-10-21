package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import net.unicoen.node.UniMethodDec;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockProcedureModel extends BlockElementModel {

	private List<BlockProcParmModel> params = new ArrayList<>();
	private List<BlockCommandModel> bodyBlocks = new ArrayList<>();

	public BlockProcedureModel(UniMethodDec dec, Document document, Long ID_COUNTER) {
		initialize(dec, document, ID_COUNTER);
	}

	public void initialize(UniMethodDec funcDec, Document document, Long ID_COUNTER){
		Element procedureElement = createBlockElement(document, "procedure", ID_COUNTER, "procedure");

		addElement("Label", document, funcDec.methodName, procedureElement);
		addElement("ReturnType", document, funcDec.returnType, procedureElement);
		addLocationElement(document, "50", "50", procedureElement);

		setProcedureElement(procedureElement);
	}

	public BlockProcedureModel(Element procedureElement,
			List<BlockProcParmModel> params,
			List<BlockCommandModel> bodyBlocks) {
		element = procedureElement;
		this.params = params;
		this.bodyBlocks = bodyBlocks;
	}

	public void setProcedureElement(Element element) {
		this.element = element;
	}

	public void setParams(List<BlockProcParmModel> params) {
		this.params = params;
	}

	public void setBodyBlocks(List<BlockCommandModel> bodyBlocks) {
		this.bodyBlocks = bodyBlocks;
	}

	public List<BlockProcParmModel> getParams() {
		return this.params;
	}

	public List<BlockCommandModel> getBodyBlocks() {
		return this.bodyBlocks;
	}

	public void addBlockNodes(Node node) {

		node.appendChild(element);

		for (BlockProcParmModel param : params) {
			node.appendChild(param.getParmElement());
		}

		for (BlockCommandModel model : bodyBlocks) {
			for (Element element : model.getCommandBlockElements()) {
				node.appendChild(element);
			}
		}

	}


	public void addParameterSocketInfo(Document document, Element element, List<BlockProcParmModel> args) {
		List<SocketInfo> sockets = new ArrayList<SocketInfo>();

		for (BlockProcParmModel param : args) {
			addSocketInfoToList(sockets, param);
		}

		addSocketInfoToList(sockets, null);

		addSocketsNode(document, element, sockets);
	}
}
