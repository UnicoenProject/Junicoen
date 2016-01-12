package net.unicoen.mapper

import java.util.List
import net.unicoen.node.UniNode

import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class MapperTest {

	protected def void evaluate(Object expected, Object actual) {
		if (expected == null) {
			if (actual != null) {
				assertThat(actual, instanceOf(typeof(List)))
				assertThat((actual as List<?>).size, is(0))
			} else {
				assertNull(actual)
			}
			return
		}
		switch (expected) {
			UniNode:
				expected.evaluateNode(actual)
			List<?>:
				expected.evaluateList(actual)
			String,
			Integer,
			Double,
			Boolean:
				assertThat(actual, equalTo(expected))
			default:
				throw new RuntimeException("Unsuspected type: " + expected.class.typeName)
		}
	}

	private def evaluateNode(UniNode expected, Object actual) {
		val cls = expected.class
		assertThat(actual, instanceOf(cls))
		val casted = cls.cast(actual)
		cls.fields.forEach [
			it.get(expected).evaluate(it.get(casted))
		]
	}

	private def evaluateList(List<?> expected, Object actual) {
		assertThat(actual, instanceOf(typeof(List)))
		val list = actual as List<?>
		assertThat(list.size, equalTo(expected.size))
		for (var i = 0; i < list.size; i++) {
			expected.get(i).evaluate(list.get(i))
		}
	}

}
