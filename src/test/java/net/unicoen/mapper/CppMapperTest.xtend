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
int data[10];
int arr5[5] = {0};
int arr3[] = {20, 20, 21};
char str6[6] = \"aiueo\";
int data104[10][4];
int arr53[5][3] = {0};
int array35[3][5] = {
    {  1,  2,  3,  4,  5, },
    {  2,  4,  6,  8, 10, },
    {  3,  6,  9, 12, 15, },
};
int array[][] = {
    {  1,  2,  3,  4,  5, },
    {  2,  4,  6,  8, 10, },
    {  3,  6,  9, 12, 15, },
};
int array[][5] = {
    {  1,  2,  3,  4,  5, },
    {  2,  4,  6,  8, 10, },
    {  3,  6,  9, 12, 15, },
};
int array[][5] = {
    {  1,  2,  3,  4,  5, },
    {  2,  4,  6,  8, 10, },
    {  3,  6,  9, 12, 15, },
    {  4,  8, 12, 16, 20, },
};
		}
		")
		val dd = node;
	}
}
