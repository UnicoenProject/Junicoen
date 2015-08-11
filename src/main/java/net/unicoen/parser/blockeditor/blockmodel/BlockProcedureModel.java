package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class BlockProcedureModel extends BlockElementModel{


	private List<BlockProcParmModel> params = new ArrayList<>();
	private List<BlockCommandModel> bodyBlocks = new ArrayList<>();

	public BlockProcedureModel(){

	}

	public BlockProcedureModel(Element procedureElement, List<BlockProcParmModel> params, List<BlockCommandModel> bodyBlocks){
		element = procedureElement;
		this.params = params;
		this.bodyBlocks = bodyBlocks;
	}

	public void setProcedureElement(Element element){
		this.element = element;
	}

	public void setParams(List<BlockProcParmModel> params){
		this.params = params;
	}

	public void setBodyBlocks(List<BlockCommandModel> bodyBlocks){
		this.bodyBlocks = bodyBlocks;
	}


	public List<BlockProcParmModel> getParams(){
		return this.params;
	}

	public List<BlockCommandModel> getBodyBlocks(){
		return this.bodyBlocks;
	}


	public void addBlockNodes(Node node){

		node.appendChild(element);

		for(BlockProcParmModel param : params){
			node.appendChild(param.getParmElement());
		}

		for(BlockCommandModel model : bodyBlocks){
			for(Element element : model.getCommandBlockElements()){
				node.appendChild(element);
			}
		}

	}


}
