/**
 * プログラム名：ハードルを描くプログラム
 * 作成者： 榊原康友
 * 作成日： Mon Oct 29 16:58:38 JST 2012
 */
public class Hurdle extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Hurdle());
	}

	//タートルを動かす処理
	public void start() {
		fd(80);
		rt(90);
		fd(10);
		rt(90);
		fd(80);
	}

}															