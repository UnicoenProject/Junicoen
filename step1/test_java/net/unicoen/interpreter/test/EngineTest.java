package net.unicoen.interpreter.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import net.unicoen.interpreter.Engine;
import net.unicoen.node.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class EngineTest {

	private static <T> List<T> list(T... args) {
		ArrayList<T> list = new ArrayList<>();
		for (T item : args) {
			list.add(item);
		}
		return list;
	}

	private UniClassDec mkClassDec() {
		/*
		 * public class Main { public static void main(String[] args) {
		 * MyLib.printInt(1); } }
		 */
		return new UniClassDec() {
			{
				className = "Main";
				modifiers = list("public");
				members = list(new UniFuncDec() {
					{
						funcName = "main";
						modifiers = list("public", "static");
						returnType = "void";
						args = list(new UniArg() {
							{
								type = "String[]";
								name = "args";
							}
						});
						bodies = list(new UniMethodCall() {
							{
								receiver = new UniIdent() {
									{
										name = "MyLib";
									}
								};
								methodName = "printInt";
								args = list(new UniIntLiteral() {
									{
										value = 1;
									}
								});
							}
						});
					}
				});
			}
		};
	}

	@Test
	public void test() throws UnsupportedEncodingException {
		Engine engine = new Engine();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		engine.out = new PrintStream(baos);

		engine.execute(mkClassDec());
		String output = baos.toString("UTF8");

		String expect = "1" + System.lineSeparator();
		assertEquals(expect, output);
	}
}
