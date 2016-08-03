package net.unicoen.mapper

import net.unicoen.node.UniMethodDec
import org.junit.Ignore
import org.junit.Test

import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class CppMapperTest  extends MapperTest {
	val mapper = new CPP14Mapper(true)

	@Test @Ignore
	def CppTest() {
		val node = mapper.parse("
		#include <iostream>
		struct Str
		{
			int a;
			double b;
		};
		int add(int x, int y)
		{
			int z = z+y;
			return z;
		}
		int main()
		{
			if(n<2)
				return n;
			else
				return fibonacci(n-1) + fibonacci(n-2);
			int a = add(1,2);
			int b = 3;
			int c = b;
			b = 5;
			int* p = &a;
		}
		")
		val dd = node;
	}

	@Test
	def CppTest2() {
		val node = mapper.parse("
		int main()
		{
			printf(\"Year %d\n\", 2015);
		}
		")
		val dd = node;
	}
}
