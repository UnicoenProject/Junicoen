package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockClassModel {

	private List<BlockProcedureModel> methods = new ArrayList<>();
	private List<BlockFieldVarDecModel> fieldVariables = new ArrayList<>();
	public  static String PAGEBLOCKS_NODE = "PageBlocks";
	
	public Element createBlockNodes(Document document) {
		Element pageBlocksElement = document.createElement(PAGEBLOCKS_NODE);

		for(BlockFieldVarDecModel model : fieldVariables){
			for (Element element : model.getBlockElements()) {
				pageBlocksElement.appendChild(element);
			}
		}
		
		for (BlockProcedureModel method : methods) {
			method.addBlockNodes(pageBlocksElement);
		}

		return pageBlocksElement;
	}

	public List<BlockProcedureModel> getMethods(){
		return this.methods;
	}
	
	public List<BlockFieldVarDecModel> getFieldVariables(){
		return this.fieldVariables;
	}

	public void addMethod(BlockProcedureModel method) {
		this.methods.add(method);
	}

	public void addFieldVariable(BlockFieldVarDecModel fieldVarDec) {
		this.fieldVariables.add(fieldVarDec);
	}

}
