package net.unicoen.node;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public abstract class UniNode {
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Order {
	    int value();
	}

	public List<String> comments;
}
