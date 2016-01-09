package net.unicoen.parser.blockeditor.blockmodel;

import org.w3c.dom.Document;

import net.unicoen.parser.blockeditor.BlockResolver;

public class BlockFieldVarDecModel extends BlockVarDecModel{
	public static String KIND = "global-variable"; 
	
	public BlockFieldVarDecModel(String type, String name, Document document, BlockResolver resolver, Long ID_COUNTER) {
		super(type, name, document, resolver, ID_COUNTER);
	}
	
	@Override
	public String getGenusNameFromResolver(BlockResolver resolver, String type){
		return resolver.getFieldVarDecBlockName(type);
	}
	
	@Override
	public String getKind(){
		return KIND;
	}
}
