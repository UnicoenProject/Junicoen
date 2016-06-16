package net.unicoen.mapper

import net.unicoen.node.UniMethodDec
import org.junit.Ignore
import org.junit.Test

import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class CppMapperTest  extends MapperTest {
	val mapper = new CPP14Mapper(true)

	@Test
	def CTest() {
		val node = mapper.parse("
		int main()
		{
			int a = 0;
			int b = 1+1;
			
		}
		")
		//assertThat(node, instanceOf(typeof(UniMethodDec)))
/*		
		public class UniMethodDec extends UniMemberDec {
			public String methodName;
			public List<String> modifiers;
			public String returnType;
			public List<UniArg> args;
			public UniBlock block;	
				List<UniExpr> body;
				String blockLabel;
		}
 */

	}
}
