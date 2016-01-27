package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockPrePostModel extends BlockCommandModel {

	public static enum PRE_POST_GENUSHEADER{
		PRE_INC("preinc"),PRE_DEC("predec"),POST_INC("postinc"),POST_DEC("postdec");
		
		private String text;
		
		private PRE_POST_GENUSHEADER(String text){
			this.text = text;
		}
		
		@Override
		public String toString(){
			return this.text;
		}
	}
	
	public BlockPrePostModel(Document document, String genusName, Node parentNode, Long id) {
		String parentGenus = MyDOMUtil.getAttribute(parentNode, BlockElementModel.GENUS_NAME_ATTR);
		String variableName = MyDOMUtil.getChildTextFromBlockNode(parentNode, BlockElementModel.NAME_NODE);
		Element blockStubElement = createBlockStubNode(document, variableName, parentGenus);
		// Blockノード作成
		Element blockElement = createVariableBlockNode(document, genusName + parentGenus, variableName, BlockCommandModel.KIND,id);
		// BlockStubノードにBlockノードを追加する
		blockStubElement.appendChild(blockElement);
	}
}
