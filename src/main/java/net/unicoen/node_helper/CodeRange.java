package net.unicoen.node_helper;

public class CodeRange {
	public CodeLocation begin;
	public CodeLocation end;
	public CodeRange(CodeLocation begin, CodeLocation end){
		this.begin = new CodeLocation(begin.x,begin.y);
		this.end = new CodeLocation(end.x,end.y);
	}
}
