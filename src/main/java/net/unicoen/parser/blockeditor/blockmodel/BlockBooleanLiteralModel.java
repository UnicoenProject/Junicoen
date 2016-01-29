package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;

import net.unicoen.node.UniBoolLiteral;
import net.unicoen.parser.blockeditor.BlockResolver;
import net.unicoen.parser.blockeditor.MyDOMUtil;

public class BlockBooleanLiteralModel extends BlockLiteralModel {
	public static String TRUELITERAL_GENUS_NAME = "true";
	public static String FALSELITERAL_GENUS_NAME = "false";

	public BlockBooleanLiteralModel(UniBoolLiteral model, Document document, String parent, Long ID_COUNTER, BlockResolver resolver) {
		super(String.valueOf(model.value), MyDOMUtil.getAttribute(resolver.getBlockNode(String.valueOf(model.value)), BlockElementModel.INITLABEL_ATTR), document, parent, ID_COUNTER, resolver);
	}

}
