package net.unicoen.parser.blockeditor;

import net.unicoen.node.UniArray;
import net.unicoen.node.UniBinOp;
import net.unicoen.node.UniBlock;
import net.unicoen.node.UniBoolLiteral;
import net.unicoen.node.UniBreak;
import net.unicoen.node.UniContinue;
import net.unicoen.node.UniDoubleLiteral;
import net.unicoen.node.UniExpr;
import net.unicoen.node.UniFieldAccess;
import net.unicoen.node.UniFor;
import net.unicoen.node.UniIdent;
import net.unicoen.node.UniIf;
import net.unicoen.node.UniIntLiteral;
import net.unicoen.node.UniLongLiteral;
import net.unicoen.node.UniMethodCall;
import net.unicoen.node.UniNew;
import net.unicoen.node.UniNewArray;
import net.unicoen.node.UniReturn;
import net.unicoen.node.UniStringLiteral;
import net.unicoen.node.UniTernaryOp;
import net.unicoen.node.UniUnaryOp;
import net.unicoen.node.UniVariableDec;
import net.unicoen.node.UniWhile;

public class UniModelFactory {

	public static enum UniBlockNames{
		UNIARG("UniArg"),
		UNIARRAY("UniArray"),
		UNIBINOP("UniBinOp"),
		UNIBLOCK("UniBlock"),
		UNIBOOLLITERAL("UniBoolLiteral"),
		UNIBREAK("UniBreak"),
		UNICLASSDEC("UniClassDec"),
		UNICONTINUE("UniContinue"),
		UNIDOUBLELITERAL("UniDoubleLiteral"),
		UNIEXPR("UniExpr"),
		UNIFIELDACCESS("UniFieldAccess"),
		UNIFIELDDEC("UniFieldDec"),
		UNIFOR("UniFor"),
		UNIIDENT("UniIdent"),
		UNIIF("UniIf"),
		UNIINTLITERAL("UniIntLiteral"),
		UNILONGLITERAL("UniLongLiteral"),
		UNIMEMBERDEC("UniMemberDec"),
		UNIMETHODCALL("UniMethodCall"),
		UNIMETHODDEC("UniMethodDec"),
		UNINEW("UniNew"),
		UNINEWARRAY("UniNewArray"),
		UNINODE("UniNode"),
		UNIRETURN("UniReturn"),
		UNISTRINGLITERAL("UniStringLiteral"),
		UNITERNARYOP("UniTernaryOp"),
		UNIUNARYOP("UniUnaryOp"),
		UNIVARIABLEDEC("UniVariableDec"),
		UNIWHILE("UniWhile");
		
		private final String text;
		private UniBlockNames(String text){
			this.text = text;
		}
		
		
		@Override
		public String toString(){
			return this.text;
		}
	}
	
	public static UniExpr createUniModel(String uniModelName, UniModelInitializerMap map) {
		if(uniModelName.equals(UniBlockNames.UNIARRAY.toString())){
			return new UniArray();
		}else if(uniModelName.equals(UniBlockNames.UNIBINOP.toString())){
			return new UniBinOp();
		}else if(uniModelName.equals(UniBlockNames.UNIBLOCK.toString())){
			return new UniBlock();
		}else if(uniModelName.equals(UniBlockNames.UNIBOOLLITERAL.toString())){
			return new UniBoolLiteral();
		}else if(uniModelName.equals(UniBlockNames.UNIBREAK.toString())){
			return new UniBreak();
		}else if(uniModelName.equals(UniBlockNames.UNICONTINUE.toString())){
			return new UniContinue();
		}else if(uniModelName.equals(UniBlockNames.UNIDOUBLELITERAL.toString())){
			return new UniDoubleLiteral();
		}else if(uniModelName.equals(UniBlockNames.UNIEXPR.toString())){
			return new UniExpr() {
				@Override
				public boolean isStatement() {
					return false;
				}
			};
		}else if(uniModelName.equals(UniBlockNames.UNIFIELDACCESS.toString())){
			UniExpr receiver = (UniExpr)(map.get(UniModelInitializerMap.UniModelParameters.RECEIVER.toString()));
			String name = (String)(map.get(UniModelInitializerMap.UniModelParameters.NAME.toString()));
			return new UniFieldAccess(receiver, name);
		}else if(uniModelName.equals(UniBlockNames.UNIFOR.toString())){
			return new UniFor();
		}else if(uniModelName.equals(UniBlockNames.UNIIDENT.toString())){
			return new UniIdent((String)(map.get(UniModelInitializerMap.UniModelParameters.NAME.toString())));
		}else if(uniModelName.equals(UniBlockNames.UNIIF)){
			return new UniIf();
		}else if(uniModelName.equals(UniBlockNames.UNIINTLITERAL.toString())){
			return new UniIntLiteral();
		}else if(uniModelName.equals(UniBlockNames.UNILONGLITERAL.toString())){
			return new UniLongLiteral();
		}else if(uniModelName.equals(UniBlockNames.UNIMETHODCALL.toString())){
			String name = (String)(map.get(UniModelInitializerMap.UniModelParameters.NAME.toString()));
			UniExpr receiver = (UniExpr)(map.get(UniModelInitializerMap.UniModelParameters.RECEIVER.toString()));
			
			return new UniMethodCall(receiver,name,null);
		}else if(uniModelName.equals(UniBlockNames.UNINEW.toString())){
			return new UniNew();
		}else if(uniModelName.equals(UniBlockNames.UNINEWARRAY.toString())){
			return new UniNewArray();
		}else if(uniModelName.equals(UniBlockNames.UNIRETURN.toString())){
			return new UniReturn();
		}else if(uniModelName.equals(UniBlockNames.UNISTRINGLITERAL.toString())){
			return new UniStringLiteral();
		}else if(uniModelName.equals(UniBlockNames.UNITERNARYOP.toString())){
			return new UniTernaryOp();
		}else if(uniModelName.equals(UniBlockNames.UNIUNARYOP.toString())){
			return new UniUnaryOp();
		}else if(uniModelName.equals(UniBlockNames.UNIVARIABLEDEC.toString())){
			return new UniVariableDec();
		}else if(uniModelName.equals(UniBlockNames.UNIWHILE.toString())){
			return new UniWhile();
		}else{
			throw new RuntimeException("not supported model:" + uniModelName);
		}
	}
	
}
