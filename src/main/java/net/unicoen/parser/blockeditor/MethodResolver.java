package net.unicoen.parser.blockeditor;

public class MethodResolver {

	private FieldMethodResolver fieldMethodResolver = new FieldMethodResolver();

	public void addFieldMethodInfo(String methodNameWithParam, FieldMethodInfo info){
		this.fieldMethodResolver.addUserMethod(methodNameWithParam, info);
	}

	public FieldMethodResolver getFieldMethodInfo(){
		return this.fieldMethodResolver;
	}
	
}
