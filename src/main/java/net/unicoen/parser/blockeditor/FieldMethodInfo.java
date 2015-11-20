package net.unicoen.parser.blockeditor;

public class FieldMethodInfo {

	private String returnType;
	private Long id;

	public FieldMethodInfo(String returnType, Long id){
		this.returnType = returnType;
		this.id = id;
	}

	public String getReturnType(){
		return this.returnType;
	}

	public Long getId(){
		return this.id;
	}

}
