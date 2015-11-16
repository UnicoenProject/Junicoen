package blockeditor;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniVariableDec;
import net.unicoen.parser.blockeditor.BlockGenerator;

import com.google.common.collect.Lists;

public class UniToBlockTestUtil {

	public static String LANG_DEF_ROOT = "blockeditor/blocks/";

	public static UniClassDec createEmptyClassModel(String className){
		return new UniClassDec(className, new ArrayList<String>(), new ArrayList<UniMemberDec>(), Lists.newArrayList("Turtle"), new ArrayList<String>(), new ArrayList<UniClassDec>());
	}

	public static UniMethodDec createEmptyMethodDec(String methodName){
		return new UniMethodDec(methodName, new ArrayList<String>(), "void", new ArrayList<UniArg>(), new UniBlock(new ArrayList<UniExpr>(), ""));
	}

	public static UniVariableDec createLocalVariable(String variableName, String type){
		return new UniVariableDec(new ArrayList<String>(), type, variableName, null);
	}

	public static BlockGenerator createBlockGenerator(String fileName) throws IOException{
		String filePath = "blockeditor/test/" + fileName + ".xml";
		File file = new File(filePath);
		file.createNewFile();
		PrintStream out = new PrintStream(file);

		return new BlockGenerator(out, LANG_DEF_ROOT, true);
	}

}
