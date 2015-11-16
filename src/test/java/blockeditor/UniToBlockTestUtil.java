package blockeditor;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniUnaryOp;
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

	/**
	 * for(int i = 0;i<3;i++)を作る
	 */
	public static UniFor createForTmplate(){
		UniVariableDec init = createNumberLocalVariable("i", 1);
		UniBinOp op = new UniBinOp("<", new UniIdent("i"), new UniIntLiteral(3));
		UniUnaryOp uOp = new UniUnaryOp("_++", new UniIdent("i"));

		UniFor uniFor = new UniFor(init, op, uOp, new UniBlock(new ArrayList<UniExpr>(), ""));
		return uniFor;
	}

	public static UniVariableDec createNumberLocalVariable(String name, int initValue){
		UniVariableDec dec = createLocalVariable(name, "int");
		dec.value = new UniIntLiteral(initValue);

		return dec;
	}

	public static UniMethodCall createTurtleBasicMethodCall(String methodName, int step){
		return new UniMethodCall(null, methodName, Lists.newArrayList(new UniIntLiteral(step)));
	}

	public static void parseTest(UniClassDec cDec) throws IOException{
		BlockGenerator gen = createBlockGenerator(cDec.className + "Test");
		gen.parse(cDec);
	}
}
