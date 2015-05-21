package net.unicoen.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import net.unicoen.mapper.JavaMapper;
import net.unicoen.node.UniClassDec;
import net.unicoen.node.UniNode;

import org.junit.Test;

public class ExecuteFixturesTest {

	//@Test
	public void testHouse() {
		String file = "House.java";
		String filePath = "fixtures/" + file;
		assertTrue(new File(filePath).exists());

		JavaMapper mapper = new JavaMapper();
		UniNode node = mapper.parseFile(filePath);
		assertTrue(node instanceof UniClassDec);
		UniClassDec dec = (UniClassDec) node;
		assertEquals("House", dec.className);
	}
}
