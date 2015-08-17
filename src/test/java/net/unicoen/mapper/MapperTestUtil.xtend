package net.unicoen.mapper

class MapperTestUtil {
	static def normalize(String code) {
		val firstCode = code.replace("\r", " ").replace("\n", " ").replace("\t", " ").trim
		var lastCode = firstCode
		while (true) {
			var newCode = lastCode.replace("  ", " ")
			if (newCode.equals(lastCode)) {
				return lastCode.replace(" (", "(").replace(" {", "{").replace(" }", "}")
			}
			lastCode = newCode
		}
	}
}