package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockClassModel {

	private List<BlockProcedureModel> methods = new ArrayList<>();
	private List<BlockFieldVarDecModel> fieldVariables = new ArrayList<>();

	public Element createBlockNodes(Document document) {
		Element pageBlocksElement = document.createElement("PageBlocks");

		for (BlockProcedureModel method : methods) {
			method.addBlockNodes(pageBlocksElement);
		}

		return pageBlocksElement;
	}

	public List<BlockProcedureModel> getMethods(){
		return this.methods;
	}

	public void addMethod(BlockProcedureModel method) {
		this.methods.add(method);
	}

	public void addFieldVariable(BlockFieldVarDecModel fieldVarDec) {
		this.fieldVariables.add(fieldVarDec);
	}

}
