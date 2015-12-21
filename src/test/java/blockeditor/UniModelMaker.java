package blockeditor;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.SAXException;

import com.google.common.collect.Lists;

import net.unicoen.node.UniArg;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldDec;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniMemberDec;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniMethodDec;
import net.unicoen.node.UniNew;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.parser.blockeditor.BlockGenerator;

public class UniModelMaker {

	public static String LANG_DEF_ROOT = "blockeditor/blocks/";

	/**
	 * 空のタートルクラスモデルを作成する （全てのパラメータを空リストで初期化）
	 * @param className　クラス名
	 * @return
	 */
	public static UniClassDec createEmptyTurtleClassModel(String className){
		return new UniClassDec(className, new ArrayList<String>(), new ArrayList<UniMemberDec>(), Lists.newArrayList("Turtle"), new ArrayList<String>(), new ArrayList<UniClassDec>());
	}
	
	/**
	 * 空のクラスモデルを作成する （全てのパラメータを空リストで初期化）
	 * @param className　クラス名
	 * @param parentClasses 親クラス
	 * @return 指定した名前と親のクラスモデル
	 */
	public static UniClassDec createEmptyClassModel(String className, List<String> parentClasses){
		return new UniClassDec(className, new ArrayList<String>(), new ArrayList<UniMemberDec>(), parentClasses, new ArrayList<String>(), new ArrayList<UniClassDec>());
	}

	/**
	 * void型，引数なしのメソッドモデルを作成する
	 * @param methodName メソッド名
	 * @return　
	 */
	public static UniMethodDec createEmptyMethodDec(String methodName){
		return new UniMethodDec(methodName, new ArrayList<String>(), "void", new ArrayList<UniArg>(), new UniBlock(new ArrayList<UniExpr>(), ""));
	}

	public static UniVariableDec createLocalVariable(String variableName, String type){
		return new UniVariableDec(new ArrayList<String>(), type, variableName, null);
	}

	public static BlockGenerator createBlockGenerator(String fileName) throws IOException{
		File dir = new File("blockeditor/test");
		if(!dir.exists()){
			dir.mkdir();
		}
		String filePath = dir.getPath() + "/" + fileName + ".xml";
		File file = new File(filePath);
		file.createNewFile();
		PrintStream out = new PrintStream(file);

		try {
			return new BlockGenerator(out, LANG_DEF_ROOT, true);
		} catch (SAXException e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	public static BlockGenerator createBlockGenerator2(String fileName) throws IOException{
		File dir = new File("blockeditor/test");
		if(!dir.exists()){
			dir.mkdir();
		}
		String filePath = dir.getPath() + "/" + fileName + ".xml";
		File file = new File(filePath);
		file.createNewFile();
		PrintStream out = new PrintStream(file);

		try {
			return new BlockGenerator(out, LANG_DEF_ROOT, true);
		} catch (SAXException e) {
			e.printStackTrace();
			return null;
		}	
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

	/**
	 * 基本的なタートルメソッドコールモデルを作成する（fd,rt,bk,lt）
	 * @param methodName メソッド名
	 * @param step 歩数
	 * @return
	 */
	public static UniMethodCall createTurtleBasicMethodCall(String methodName, int step){
		return new UniMethodCall(null, methodName, Lists.newArrayList(new UniIntLiteral(step)));
	}
	
	
	/**
	 * オブジェクト型のローカル変数モデルを作成する　初期値は引数なしのnewモデル
	 * @param variableName 変数名
	 * @param type 型
	 * @return
	 */
	public static UniVariableDec createLocalObjectVariableBlockModel(String variableName, String type){
		return new UniVariableDec(new ArrayList<>(), type, variableName, new UniNew(type, new ArrayList<>()));
	}
	
	
	public static UniBinOp createVariableSetterModel(UniIdent ident, UniExpr value){
		return new UniBinOp("=", ident, value);
	}
	
	public static UniFieldDec createFieldDec(String type, String name){
		return new UniFieldDec(Lists.newArrayList(), type, name, null);
	}
	
	public static UniMethodDec createStartMethod(){
		return new UniMethodDec("start", Lists.newArrayList("public"), "void", Lists.newArrayList(), new UniBlock(Lists.newArrayList(), ""));
	}
}
