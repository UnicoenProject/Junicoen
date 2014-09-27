/*
 * 家を書くプログラム (変数あり)
 * 2003/05/08 Yoshiaki Matsuzawa
 * 2012/10/16 改訂 Yoshiaki Matsuzawa
 */
public class VariableHouse extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new VariableHouse());
	}

	// タートルを動かす処理
	public void start() {

		int x;// 変数xを宣言する
		x = 50;// 変数xに値50を代入する

		{// 屋根を書く
			rt(30); // 30度右に回る
			fd(x); // x歩前に進む
			rt(120);
			fd(x);
			rt(120);
			fd(x);
		}

		{// 本体を書く
			lt(90);
			fd(x);
			lt(90);
			fd(x);
			lt(90);
			fd(x);
			lt(90);
			fd(x);
		}
	}

}