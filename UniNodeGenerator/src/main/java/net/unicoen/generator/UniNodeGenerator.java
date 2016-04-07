package net.unicoen.generator;

import org.jruby.embed.ScriptingContainer;

public class UniNodeGenerator {
	public static void main(String[] args) {
		ScriptingContainer container = new ScriptingContainer();
		container.runScriptlet(org.jruby.embed.PathType.RELATIVE, "lib/main.rb");
	}
}
