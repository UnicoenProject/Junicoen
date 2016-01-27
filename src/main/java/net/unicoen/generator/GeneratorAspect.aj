package net.unicoen.generator;

import net.unicoen.node.Traverser;
import net.unicoen.node.UniNode;

public aspect GeneratorAspect {
	before(Traverser t, UniNode node) : execution(public void net.unicoen.node.Traverser.traverse*(net.unicoen.node.Uni*)) && args(node) && this(t) {
		if (node.comment != null) {
			t.print(node.comment);
		}
	}
}
