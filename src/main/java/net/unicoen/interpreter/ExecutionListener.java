package net.unicoen.interpreter;

import net.unicoen.node.UniNode;

public interface ExecutionListener {

	public void preExecuteAll(Scope global);

	public void postExecuteAll(Scope global);

	public void preExecute(UniNode node, Scope scope);

	public void postExecute(UniNode node, Scope scope, Object value);
}
