package net.unicoen.parser.blockeditor;

import java.io.IOException;

import org.apache.xerces.parsers.DOMParser;
import org.xml.sax.SAXException;

public class BlockToUniBlockResolver extends BlockResolver {

	public static final String BLOCKTOUNI_FORCECONVERION_FILENAME="block_to_uni_force_convertion_list.xml";
	
	public BlockToUniBlockResolver(String langdefRootPath, boolean isTest) throws SAXException, IOException {
		super(langdefRootPath, isTest);
	}
	
	@Override
	public void createForceConvertionMap(boolean isTest) throws SAXException, IOException{
		DOMParser parser = new DOMParser();
		if(isTest){
			parser.parse(langdefRootPath + BLOCKTOUNI_FORCECONVERION_FILENAME);			
		}else{
			parser.parse(ORIGIN_LANG_DEF_ROOT_PATH + BLOCKTOUNI_FORCECONVERION_FILENAME);
		}
		
		forceConvertionMap = new ForceConvertionMap(parser.getDocument().getFirstChild());
	}

}
