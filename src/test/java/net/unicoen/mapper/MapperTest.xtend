package net.unicoen.mapper

import java.util.List
import net.unicoen.node.UniNode

import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class MapperTest {

	protected def void evaluate(Object expected, Object actual) {
		evaluate(expected, actual, "root")
	}

	private def void evaluate(Object expected, Object actual, String route) {
		if (expected == null) {
			if (actual != null) {
				assertThat(route, actual, instanceOf(typeof(List)))
				assertThat(route, (actual as List<?>).size, is(0))
			} else {
				assertNull(route, actual)
			}
			return
		}
		switch (expected) {
			UniNode:
				evaluateNode(expected, actual, route)
			List<?>:
				evaluateList(expected, actual, route)
			String,
			Integer,
			Double,
			Boolean:
				assertThat(route, actual, equalTo(expected))
			default:
				throw new RuntimeException("Unsuspected type: " + expected.class.typeName)
		}
	}

	private def evaluateNode(UniNode expected, Object actual, String route) {
		val cls = expected.class
		assertThat(route, actual, instanceOf(cls))
		val casted = cls.cast(actual)
		cls.fields.forEach [
			evaluate(it.get(expected), it.get(casted), route + "." + it.name)
		]
	}

	private def evaluateList(List<?> expected, Object actual, String route) {
		assertThat(route, actual, instanceOf(typeof(List)))
		val list = actual as List<?>
		assertThat(route, list.size, equalTo(expected.size))
		for (var i = 0; i < list.size; i++) {
			evaluate(expected.get(i), list.get(i), route + "[" + i + "]")
		}
	}

}
