/**
 * プログラム名：人を描くプログラム
 * 作成者： 榊原康友
 * 作成日： Mon Oct 29 16:53:16 JST 2012
 */
public class Person extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Person());
	}

	//タートルを動かす処理
	public void start() {
		
		// 頭を描く
		int i=0;
		while(i<360){
			fd(1);
			rt(3);
			i = i+3;
		}
		
		// 胴の位置まで移動
		up();
		rt(90);
		fd(20);
		lt(90);
		bk(20);
		down();
		
		// 胴を描く
		bk(20);
		
		// 右腕を描く
		rt(90);
		fd(15);
		lt(60);
		fd(10);
		bk(10);
		rt(60);
		bk(30);
		
		// 左腕を描く
		rt(120);
		fd(10);
		bk(10);
		lt(120);
		fd(15);
		lt(90);
		
		// 足を描く
		bk(30);
		rt(120);
		fd(20);
		bk(20);
		rt(120);
		fd(20);
		
	}

}														