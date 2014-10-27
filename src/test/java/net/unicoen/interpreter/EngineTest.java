package net.unicoen.interpreter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import net.unicoen.interpreter.Engine;
import net.unicoen.node.*;
import static org.junit.Assert.*;

import org.junit.Test;

import static net.unicoen.node_helper.Builder.*;

public class EngineTest {

	private UniClassDec mkClassDec() {
		/*
		 * public class Main {
		 *     public static void main(String[] args) {
		 *         if (true && false) {
		 *             MyLib.printInt(1);
		 *         } else {
		 *             MyLib.printInt(1 + 2);
		 *         }
		 *         while (false) {
		 *             1;
		 *         }
		 *     }
		 * }
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
						body = list(new UniIf() {
							{
								cond = bin(lit(true), "&&", lit(false));
								trueBlock = list(new UniMethodCall() {
									{
										receiver = ident("MyLib");
										methodName = "printInt";
										args = list(lit(1));
									}
								});
								falseBlock = list(new UniMethodCall() {
									{
										receiver = ident("MyLib");
										methodName = "printInt";
										args = list(bin(lit(1), "+", lit(2)));
									}
								});
							}
						}, new UniWhile() {
							{
								cond = lit(false);
								body = list(lit(1));
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

		String expect = "3" + System.lineSeparator();
		assertEquals(expect, output);
	}
}
