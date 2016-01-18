package net.unicoen.node;

import java.util.List;

import com.google.common.collect.Lists;

public abstract class UniNode {
	public String comment;
	
	@SuppressWarnings("unchecked")
	public <T extends UniNode> List<T> flattenForBuilding() {
		return (List<T>) Lists.newArrayList(this);
	}
}
