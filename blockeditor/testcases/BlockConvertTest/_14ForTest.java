/**
* プログラム名：
* 作成者： 
* 作成日： Wed Oct 03 21:54:44 JST 2012
*/
public class _14ForTest extends Turtle{		
		//起動処理
		public static void main(String[] args) {
			Turtle.startTurtle(new _14ForTest(), args);
		}
		
		//タートルを動かす処理
		public void start() {
			int i = 0;
			for(i=0;i<5;i++){
				fd(50);
			}
			
			for(;i<5;i++){
				fd(50);
			}
			
			for(int k=0;k<5;k++){
				fd(50);
				for(int k=0;k<5;k++){
				}
			}
		}
	
}
