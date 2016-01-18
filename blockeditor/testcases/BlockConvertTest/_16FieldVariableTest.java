import java.util.*;
/**
* プログラム名：
* 作成者： 
* 作成日： Tue Nov 13 21:54:12 JST 2012
*/
public class _16FieldVariableTest extends Turtle{
	
	//起動処理
	public static void main(String[] args) {
		_16FieldVariableTest main = new _16FieldVariableTest();
		main.run();
	}
	
	int i = 0;
	double d = 0;
	//メイン処理
	public void run() {

		i = i + 1;
		i++;
		d = d + 1;
		{	//この処理びみょう
			d++;
			d++;
		}
	}
	
}